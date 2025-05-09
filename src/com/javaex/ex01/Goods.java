package com.javaex.ex01;

public class Goods extends Object {  // 뒤에 아무것도 안쓰면 Object의 자식

	private String name;
	private int price;
	
	public Goods() {
		super();
	}

	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
