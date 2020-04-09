package com.rtpl.common;

public class Panda {
	private Kunfu kunfu;

	public Kunfu getKungfu() {
		return kunfu;
	}

	public void setKungfu(Kunfu kunfu) {
		System.out.println("autowiring by type");
		this.kunfu = kunfu;
	}

	@Override
	public String toString() {
		return "Person [kunfu=" + kunfu + "]";
	}

}
