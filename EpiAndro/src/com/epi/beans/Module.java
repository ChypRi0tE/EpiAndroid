package com.epi.beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Module {
	private	String	title;
	private	String	code;
	private	long	id;
	private	Date	inscription;
	private	String	grade;
	private	int		credits;
	private	int		semester;
	
	public Module(String title, String code, long id, String inscription,
			String grade, int credits, int semester) throws ParseException {
		this.title = title;
		this.code = code;
		this.id = id;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
		this.inscription = format.parse(inscription);
		this.grade = grade;
		this.credits = credits;
		this.semester = semester;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getInscription() {
		return inscription;
	}

	public void setInscription(Date inscription) {
		this.inscription = inscription;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}
}
