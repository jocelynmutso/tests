package com.blobtest3;

public class Cat {

	static void myStaticMethod() {
		System.out.println("Cat says hi");

	}

	public void myPublicMethod() {
		System.out.println("Cat says bye");
	}
	
	public void meow() {
		System.out.println("Blob says meow");
		
	}

	public static void main(String[] args) {
		Cat.myStaticMethod();
		
		/*myPublicMethod();*/
		
		Cat blob = new Cat();
		blob.myPublicMethod();
		blob.meow();

	}
}