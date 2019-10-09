package com.zensar.spring.instruments;

public class Guitar implements Instrument {

	@Override
	public void play() {
		System.out.println("Ting tingg ting");
	}

	@Override
	public void tune() {
		System.out.println("Guitar is tuned");
		
	}

	@Override
	public void clean() {
		System.out.println("Guitar is cleaned");
		
	}

}
