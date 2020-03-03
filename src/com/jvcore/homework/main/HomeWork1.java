package com.jvcore.homework.main;

public class HomeWork1 {
	public static void main(String[] args) {
		/*
		 * ToanHoc: tạo hàm main, cho 3 biến int x = 10, long y = 100, double k
		 * = 4.5; Tính tổng, hiệu, tính thương và sys ra màn hình kết qua
		 */

		int x = 10;
		long y = 100;
		double k = 4.5;
		long tong1 = x + y;
		int hieu1 = x - (int) k;
		double tich1 = y * k;
		System.out.println(tong1 + ";" + hieu1 + ";" + tich1);

		/*
		 * StringFormat: tạo hàm main khởi chạy mạc định trong java. cho 2 biến
		 * int x = 10, int y = 11; tính tổng hiệu tich thương và system ra các
		 * String như sau,
		 */

		int a = 10;
		int b = 11;
		int tong2 = a + b;
		int tich2 = a * b;
		double thuong = (double) a / b;
		int hieu2 = a - b;
		System.out.println("tổng của " + a + " và " + b + " là: " + tong2);
		System.out.println("tích của " + a + " và " + b + " là: " + tich2);
		System.out.println("thương của " + a + " và " + b + " là: " + thuong);
		System.out.println("hiệu của " + a + " và " + b + " là: " + hieu2);
	}
}
