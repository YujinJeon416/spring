package com.kh.spring.common.aop.test;

public class FooImpl implements Foo {

	@Override
	public void sayHello() {
		//주업무로직
		System.out.println("say fooo o o o ooooooooooo!");
		
	}

	@Override
	public String getName() {
		return "fooooooo";
	}
	

}
