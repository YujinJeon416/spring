package com.kh.spring.tv.model.vo;

public class SamsungRemoteControl implements RemoteControl {

	@Override
	public void changeChannel(int no) {
		System.out.println("삼성티비채널을 " + no + "번으로 변경합니다.");

	}

}
