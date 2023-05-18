package java1_18;

import java.util.Random; // Q5

public class java1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。

	// 文字列型と整数型
	public static void helloJavaSE(String message, int version) {

		// 出力 // 修正
		System.out.println("Hello " + message + version);
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください

	// 整数型
	public static void mul(int c) {

		// 出力
		System.out.println(c * c);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください

	// 配列
	public static void printIntArray(int[] array) {

		// 条件
		for (int i = 0; i < array.length; i++) {

			// 出力
			System.out.println(array[i]);
		}
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。

	// double型
	public static void mul(double num) {

		// 出力
		System.out.println(num + num);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	// 格納
	public static int[] generateRandomNumbers(int count) {

		// 初期値設定
		int[] randomNumbers = new int[count];

		// randomクラスのインスタンス化
		Random random = new Random();

		// 条件
		for (int i = 0; i < count; i++) {

			// 1〜100までの数字
			int randomNumber = random.nextInt(100) + 1;
			randomNumbers[i] = randomNumber; // 修正

			// 出力
			System.out.println(randomNumber);
		}

		// 数字の配列を返す
		return randomNumbers;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	// 格納
	public static double calculateAverage(int[] numbers) {

		// sumの初期値
		int sum = 0;
		// 条件
		for (int number : numbers) {
			sum += number;
		}

		// 平均値の計算
		double average = (double) sum / numbers.length;

		// 出力
		System.out.println(average);

		// 平均値を返す
		return average;
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	// 格納
	public static boolean isGreaterThan50(double average) {

		// 条件 // 修正
		if (average >= 50) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		// 修正
		// 作成したメソッドをここで呼び出してください

		// Q1
		helloJavaSE("JavaSE ", 11); // 修正

		// Q2
		mul(3);

		// Q3
		int[] array = { 1, 2, 3, 4, 5 };
		printIntArray(array);

		// Q4
		mul(3.14);

		// Q5 
		int count = 5; // 格納するランダムな数字の個数を指定
		int[] randomNumbers = generateRandomNumbers(count); // 修正

		// Q6 
		double average = calculateAverage(randomNumbers);// 修正

		// Q7 // 修正
		boolean isGreaterThan50 = isGreaterThan50(average); // 修正
		System.out.println(isGreaterThan50); // 修正
	}

}
