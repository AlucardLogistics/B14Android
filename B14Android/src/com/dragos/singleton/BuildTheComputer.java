package com.dragos.singleton;

public class BuildTheComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer comp = new Computer.ComputerBuilder("Dragos config", "1TB", "32GB")
				.setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true)
				.build();
		
		Computer comp1 = new Computer.ComputerBuilder("Twerker's config", "256GB", "8GB")
				.setBluetoothEnabled(true)
				.setGraphicsCardEnabled(false)
				.build();
		
		System.out.println(comp.toString());
		System.out.println(comp1.toString());
		
		if(comp == comp1) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
