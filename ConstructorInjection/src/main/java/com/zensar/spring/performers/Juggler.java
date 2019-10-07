package com.zensar.spring.performers;

public class Juggler implements Performer {

		private int beanBags;
		public Juggler() {
			System.out.println("no arg constructor of juggler");
		}
		
	public Juggler(int beanBags) {
			super();
			this.beanBags = beanBags;
			System.out.println("parametrized constructor of juggler");
		}

	@Override
	public void perform() {
		
		System.out.println("Juggler juggling bean bags" +beanBags);
	}

}
