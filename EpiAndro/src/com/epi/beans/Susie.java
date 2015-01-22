package com.epi.beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Susie {
	private long	id = 0;
	private long	id_calendar = 0;
	private String	type = null;
	private Date	start = null;
	private Date	end = null;
	private	String	title = null;
	private	String	description = null;
	private int		nb_places = 0;
	private	long	id_owner = 0;
	private	long	id_maker = 0;
	private ArrayList<String>	logins = null;
		
	public Susie(long id, long id_calendar, String type, String start, String end,
			String title, String description, int nb_places, long id_owner,
			long id_maker, ArrayList<String> logins) throws ParseException {
		this.id = id;
		this.id_calendar = id_calendar;
		this.type = type;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
		this.start = format.parse(start);
		this.end = format.parse(end);
		this.title = title;
		this.description = description;
		this.nb_places = nb_places;
		this.id_owner = id_owner;
		this.id_maker = id_maker;
		this.logins = logins;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getId_calendar() {
		return id_calendar;
	}
	public void setId_calendar(long id_calendar) {
		this.id_calendar = id_calendar;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNb_places() {
		return nb_places;
	}
	public void setNb_places(int nb_places) {
		this.nb_places = nb_places;
	}
	public long getId_owner() {
		return id_owner;
	}
	public void setId_owner(long id_owner) {
		this.id_owner = id_owner;
	}
	public long getId_maker() {
		return id_maker;
	}
	public void setId_maker(long id_maker) {
		this.id_maker = id_maker;
	}
	public ArrayList<String> getLogins() {
		return logins;
	}
	public void setLogins(ArrayList<String> logins) {
		this.logins = logins;
	}
}
