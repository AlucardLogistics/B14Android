package com.dragos.singleton;

public class Computer {
	
	private String customer;
	private String HDD;
	private String RAM;	
	
	//optional params
	private boolean isBluetoothEnabled;
	private boolean isGraphicsCardEnabled;
	
	
	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}
	
	public String getCustomer() {
		return customer;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	private Computer(ComputerBuilder builder) {
		this.customer = builder.customer;
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
	}


	@Override
	public String toString() {
		return "Computer [customer=" + customer + ", HDD=" + HDD + ", RAM=" + RAM + ", isBluetoothEnabled="
				+ isBluetoothEnabled + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled + "]";
	}

	public static class ComputerBuilder {
		
		private String HDD;
		private String RAM;
		private String customer;
		
		//optional params
		private boolean isBluetoothEnabled;
		private boolean isGraphicsCardEnabled;
		
		public ComputerBuilder(String cust, String HDD, String RAM) {
			this.HDD = HDD;
			this.RAM = RAM;
			this.customer = cust;
		}
		
		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		Computer build() {
			return new Computer(this);
		}
		
	}

}
