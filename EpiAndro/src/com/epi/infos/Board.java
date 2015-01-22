package com.epi.infos;

import java.util.ArrayList;

public class Board {
	private ArrayList<BoardProject>	projects;
	private ArrayList<BoardNote>	notes;
	private ArrayList<BoardSusie>	susies;
	private ArrayList<BoardActivite> activites;
	private	ArrayList<BoardModule>	modules;
	private ArrayList<BoardStage>	stages;
	private ArrayList<BoardTicket>	tickets;
	
	
	public ArrayList<BoardProject> getProjects() {
		return projects;
	}
	public void setProjects(ArrayList<BoardProject> projects) {
		this.projects = projects;
	}
	public ArrayList<BoardNote> getNotes() {
		return notes;
	}
	public void setNotes(ArrayList<BoardNote> notes) {
		this.notes = notes;
	}
	public ArrayList<BoardSusie> getSusies() {
		return susies;
	}
	public void setSusies(ArrayList<BoardSusie> susies) {
		this.susies = susies;
	}
	public ArrayList<BoardActivite> getActivites() {
		return activites;
	}
	public void setActivites(ArrayList<BoardActivite> activites) {
		this.activites = activites;
	}
	public ArrayList<BoardModule> getModules() {
		return modules;
	}
	public void setModules(ArrayList<BoardModule> modules) {
		this.modules = modules;
	}
	public ArrayList<BoardStage> getStages() {
		return stages;
	}
	public void setStages(ArrayList<BoardStage> stages) {
		this.stages = stages;
	}
	public ArrayList<BoardTicket> getTickets() {
		return tickets;
	}
	public void setTickets(ArrayList<BoardTicket> tickets) {
		this.tickets = tickets;
	}
}
