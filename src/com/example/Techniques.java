package com.example;

public enum Techniques {
	HelloMwg(HelloMwg.class),
	HelloWorld(HelloWorld.class);
	
	private Class hello;
	Techniques(Class c) {
		hello = c;
	}
	
	public Object getHello() {
		
		try {
			return hello.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
