package java1_18;

import java.util.ArrayList;
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

	public static ArrayList<Integer> generateRandomNumbers(int count) {
		// 初期値を入れる
		 ArrayList<Integer> randomNumbers = new ArrayList<>();

		// Randomクラスのインスタンス化
		Random random = new Random();

		// 条件
		for (int i = 0; i < count; i++) {
		int randomNumber = random.nextInt(100) + 1; // 1～100のランダムな数字を生成
        if (randomNumber != 0) {
            randomNumbers.add(randomNumber);
            System.out.println(randomNumber);
			}
		}
		

		// 数字の配列を返す
	 return randomNumbers;
		
	}
	 
	        
	    

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。

	public static double calculateAndPrintAverage(ArrayList<Integer> numbers) {
		
		// 初期値設定
		double sum = 0;
		
		// 返り値を受け取る
		ArrayList<Integer> randomNumbers = generateRandomNumbers(6);

		for (int number : numbers) {
            sum += number;
        }

        double average = sum / numbers.size();
        System.out.println(average);
 
		return average;
	}


	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static void check50over(int num1) {
		
		ArrayList<Integer> randomNumbers = generateRandomNumbers(num1);

		// 返り値を受け取る
		double average = calculateAndPrintAverage(randomNumbers);

		// 50以上の場合
		if (average >= 50) {

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
		ArrayList<Integer> randomNumbers = generateRandomNumbers(５);

		// Q6
		generateRandomNumbers(6);

		//Q7
		check50over(3);
	}

}
