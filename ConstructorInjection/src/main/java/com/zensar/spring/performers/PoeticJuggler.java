package com.zensar.spring.performers;

import com.zensar.spring.poems.Poem;

public class PoeticJuggler extends Juggler {
	
	private Poem poem;
	
	public PoeticJuggler() 
	{
		System.out.println("No arg constructor of poetic juggler");
	}

	public PoeticJuggler(int beanBags, Poem poem)
	{
		super(beanBags);
		this.poem = poem;
		System.out.println("Parametrized constructor of poetic juggler");
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		super.perform();
		System.out.println("while reciting a poem...");
		poem.recite();
	}
	
}
