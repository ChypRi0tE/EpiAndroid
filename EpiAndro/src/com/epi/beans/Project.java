package com.epi.beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Project {
	private	String	name;
	private	String	module;
	private	Date	start;
	private	Date	end;
	private boolean	registered;
	
	public	Project(String name, String module, String start, String end, boolean registered) throws ParseException {
		this.name = name;
		this.module = module;

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
		this.start = format.parse(start);
		this.end = format.parse(end);

		this.registered = registered;
	}

	public String dump()
	{
		return (name + "\n" + module + "\n" + registered + " (" + start + " to " + end + ")");
	}
}
