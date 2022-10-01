package com.test01;

import java.util.Scanner;

public class ifTest03 {
	public void test() {
		int i = 10;
		int j = 20;
		
		if(i>j) {
			System.out.println(i+"은" +j+"보다 큽니다.");
		}else if(i<j) {
			System.out.println(i+"은" +j+"보다 작습니다.");
		}else {
			System.out.println(i+"와" +j+"는 같습니다.");
		}
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하시오: ");
		double score = sc.nextDouble();
		if(score >= 90) {
			System.out.print("A 등급입니다.");
		}else if(score <90 && score > 80) {
			System.out.print("B 등급입니다.");
		}else if(score < 80 && score > 70) {
			System.out.print("C 등급입니다.");
		}else if(score < 70 && score > 60) {
			System.out.print("D 등급입니다.");
	}else {
			System.out.print("F 등급입니다.");
	}
}
}
