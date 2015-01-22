package com.epi.beans;

public class User {
	private String	picture = null;
	private String	title = null;
	private String	login = null;
	private String	url = null;
	
	public User(String picture, String title, String login, String url) {
		this.picture = picture;
		this.title = title;
		this.login = login;
		this.url = url;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
