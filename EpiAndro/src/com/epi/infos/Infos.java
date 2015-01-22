package com.epi.infos;

import java.util.ArrayList;

public class Infos {
	private	Board	board;
	private	ArrayList<History>	history;
	
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	public ArrayList<History> getHistory() {
		return history;
	}
	public void setHistory(ArrayList<History> history) {
		this.history = history;
	}
}
