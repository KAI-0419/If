package com.test01;

import java.util.Scanner;

public class ifTest01 {
	public void testIf() {
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력해 주세요: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		if(num % 2 != 0) {
			System.out.println("홀수입니다.");
		}
		System.out.println("프로그램 종료");
		}
}