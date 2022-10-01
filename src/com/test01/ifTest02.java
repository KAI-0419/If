package com.test01;

import java.util.Scanner;

public class ifTest02 {
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력하시오: ");
		int i = sc.nextInt();
		
		if(i<10) {
			System.out.println(i + "은 10보다 작습니다.");
		}else {
			System.out.println(i + "은 10보다 크거나 같습니다.");
		}
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력하시오: ");
		int a = sc.nextInt();
		if(a % 2 == 0) {
			System.out.print(a + "-> 짝수입니다.");
		}else {
			System.out.print(a + "-> 홀수입니다.");
		}
	}
	
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력하시오: ");
		int b = sc.nextInt();
		if(b>=50) {
			if(b%2==0) {
				System.out.print(b + "-> 짝수입니다.");
			}else {
				System.out.print(b + "-> 홀수입니다.");
			}
		}else {
			System.out.print("숫자가 작습니다");
		}
	}
	
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력하시오: ");
		int c = sc.nextInt();
		if(c > 0) {
			System.out.print(c + "-> 양수입니다.");
		}else if(c < 0) {
			System.out.print(c + "-> 음수입니다.");
		}else {
			System.out.print(c + "-> 0입니다.");
		}
	}
}
