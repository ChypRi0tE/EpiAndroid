package com.epi.infos;

import com.epi.beans.User;

public class History {
	private String	title;
	private User	user;
	private String	content;
	private String	date;
	private String	id;
	private boolean	visible;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public String getId_activite() {
		return id_activite;
	}
	public void setId_activite(String id_activite) {
		this.id_activite = id_activite;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	private String	id_activite;
	private String	classe;
}
