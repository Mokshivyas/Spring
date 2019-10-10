package com.zensar.spring.performers;

import com.zensar.spring.magicboxes.MagicBox;

public class Magician implements Performer 
{
	private String magicWords;
	private MagicBox magicBox;
	
	
	public String getMagicWords() {
		return magicWords;
	}


	public void setMagicWords(String magicWords) {
		this.magicWords = magicWords;
	}


	public MagicBox getMagicBox() {
		return magicBox;
	}


	public void setMagicBox(MagicBox magicBox) {
		this.magicBox = magicBox;
	}


	@Override
	public void perform() {
	System.out.println("Magician says " +magicWords);
	System.out.println(magicBox.getContents());

	}

}
