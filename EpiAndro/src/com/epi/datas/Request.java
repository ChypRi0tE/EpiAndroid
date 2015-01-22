package com.epi.datas;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import org.apache.http.client.methods.HttpGet;

public class Request {

	public static String executePost() throws IOException {
		String url = "http://epitech-api.herokuapp.com";
		String charset = "UTF-8";  // Or in Java 7 and later, use the constant: java.nio.charset.StandardCharsets.UTF_8.name()
		String param1 = "value1";
		String param2 = "value2";

		String query = String.format("param1=%s&param2=%s", 
		     URLEncoder.encode(param1, charset), 
		     URLEncoder.encode(param2, charset));
		
		URLConnection connection = new URL(url).openConnection();
		connection.setDoOutput(true); // Triggers POST.
		connection.setRequestProperty("Accept-Charset", charset);
		connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=" + charset);

		try (OutputStream output = connection.getOutputStream()) {
		    output.write(query.getBytes(charset));
		}

		InputStream response = connection.getInputStream();
		return null;
	}
	
	public static String executeGET() throws IOException {
		HttpGet httpget = new HttpGet("http://epitech-api.herokuapp.com/planning");
		return null;
	}
}