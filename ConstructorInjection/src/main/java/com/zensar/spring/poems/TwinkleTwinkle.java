package com.zensar.spring.poems;

public class TwinkleTwinkle implements Poem {
	private static final String LINES[] = {
			
			"Twinkle twinkle little star",
			"how i wonder what you are",
			"up above the world so high",
			"like a diamond in the sky"
			
	};
	
	@Override
	public void recite() {
		for(String s:LINES) {
			System.out.println(s);
		}
	}

}
