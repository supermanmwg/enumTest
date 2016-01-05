package com.example;

public class TestEnum {
	public static void main(String args[]){
		Hello hello1 = (Hello) Techniques.values()[0].getHello();
		Hello hello2 = (Hello) Techniques.values()[1].getHello();
		
		hello1.sayHello();
		hello2.sayHello();
	}

}
