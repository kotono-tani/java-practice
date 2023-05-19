package java1_19;

public class java1_19_dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	String name; //動物の名前

	// Q2：フィールドに動物の数の変数を定義してください。
	int number; // 動物の数

	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	// コンストラクタの宣言
	java1_19_dog(String name) {

		// インスタンス変数に代入
		this.name = name;
	}

	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	java1_19_dog(int number) {

		this.number = number;
	}
}