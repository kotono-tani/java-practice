package java1_18;

import java.util.Arrays;
import java.util.Random; // Q5

public class java1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void helloJavaSE(String message, int version) {
		System.out.println("Hello " + message + " " + version);
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void mul(int c) {
		System.out.println(c * c);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void printIntArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void mul(double num) {
		System.out.println(num + num);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。

	public static int[] generateRandomNumbers(int count) {
		// 初期値を入れる
		int[] numbers = new int[count];

		// Randomクラスのインスタンス化
		Random rand = new Random();

		// 条件
		for (int i = 0; i < count; i++) {

			// 0を除く1~100までの数字
			int num = rand.nextInt(100) + 1;
			if (num != 0) {
				numbers[i] = num;
				System.out.println(num);
			}
		}

		// 数字の配列を返す
		return numbers;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。

	public static double printAverage(int number) {
		// 返り値を受け取る
		int[] numbers = generateRandomNumbers(number);

		// 平均値を代入
		double average = Arrays.stream(numbers).average().getAsDouble();

		// 出力
		System.out.println(average);

		return average;
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static void check50over(int num1) {

		// 返り値を受け取る
		double number = printAverage(num1);

		// 50以上の場合
		if (number >= 50) {

			// ture出力
			System.out.println("true");

			// 違う場合
		} else {

			// false出力
			System.out.println("false");
		}

	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 作成したメソッドをここで呼び出してください

		// Q1
		helloJavaSE("JavaSE", 11);

		// Q2
		mul(3);

		// Q3
		int[] array = { 1, 2, 3, 4, 5 };
		printIntArray(array);

		// Q4
		mul(3.14);

		// Q5
		int[] result = generateRandomNumbers(5);

		// Q6
		printAverage(6);

		//Q7
		check50over(3);
	}

}
