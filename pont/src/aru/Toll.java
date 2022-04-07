package aru;

import java.awt.Color;

import szinezheto.Szinezheto;

public class Toll extends Aru implements Szinezheto{
	private java.awt.Color szin;
	private String markanev;
	
	public Toll(String markanev, Color szin, int ar) {
		super("Toll", ar, 27);
		this.szin = szin;
	}

	@Override
	public String toString() {
		return "Toll [szin=" + szin + ", markanev=" + markanev + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public void setSzin(java.awt.Color szin) {
		this.szin = szin;
	}
	
	@Override
	public Color getSzin() {
		return szin;
	}

}
