package com.epi.infos;

public class BoardStage {
	private	String	company;
	private String	link;
	private String	timeline_start;
	private String	timeline_end;
	private Integer	timeline_barre;
	private boolean	can_note;
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getTimeline_start() {
		return timeline_start;
	}
	public void setTimeline_start(String timeline_start) {
		this.timeline_start = timeline_start;
	}
	public String getTimeline_end() {
		return timeline_end;
	}
	public void setTimeline_end(String timeline_end) {
		this.timeline_end = timeline_end;
	}
	public Integer getTimeline_barre() {
		return timeline_barre;
	}
	public void setTimeline_barre(Integer timeline_barre) {
		this.timeline_barre = timeline_barre;
	}
	public boolean isCan_note() {
		return can_note;
	}
	public void setCan_note(boolean can_note) {
		this.can_note = can_note;
	}
	public boolean isCompany_can_note() {
		return company_can_note;
	}
	public void setCompany_can_note(boolean company_can_note) {
		this.company_can_note = company_can_note;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isMandatory() {
		return mandatory;
	}
	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}
	private boolean	company_can_note;
	private String	status;
	private boolean	mandatory;
}
