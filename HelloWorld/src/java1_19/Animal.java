package java1_19; // 修正

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		// インスタンスを生成し、変数aに代入
		Dog a = new Dog(0); // 修正
		a.name = "リラン";

		// 出力
		System.out.println(a.name);
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。

		// 代入
		a.number = 2;

		// 出力
		System.out.println(a.number);
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		LocalDateTime nowDate = LocalDateTime.now(); // 修正

		// 表示形式を指定
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s"); // 修正
		String formatNowDate = dtf1.format(nowDate);
		System.out.println(formatNowDate);
	}

}
