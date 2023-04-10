package has_a_3;

import java.util.Scanner;

public class IotApp {
	private PowerOnOff[] arr;
	private int idx;

	public IotApp() {
		arr = new PowerOnOff[10];
		arr[idx++] = new TV();
		arr[idx++] = new TV();
		arr[idx++] = new Aircon();
		arr[idx++] = new LED();
	}

	// 새로운 기기를 받아서 배열에 등록하는 메서드
	public void addDevice(PowerOnOff device) {
		System.out.println("새로운 기기 등록을 시작합니다...");

		if (idx == arr.length) {
			System.out.println("더 이상 등록할 공간이 없습니다.");
			return;
		}
		arr[idx++] = device; //sc가 아니라 (PowerOnOff device) 매개변수 device
		System.out.println("디바이스 등록 완료");
	}

	// 전체 전원 On
	public void deviceAllPowerOn() {
		for (int i = 0; i < idx; i++) { //arr.length가 아니라 idx로 해야함
			arr[i].powerOn();
		}
	}
	
	// 전체 전원 Off
	public void deviceAllPowerOff() {
		for (int i = 0; i < idx; i++) {
			arr[i].powerOff();
		}
	}
}// class
