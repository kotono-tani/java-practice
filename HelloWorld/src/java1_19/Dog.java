package java1_19;



public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	String name; //動物の名前

	// Q2：フィールドに動物の数の変数を定義してください。
	int number; // 動物の数

	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	// コンストラクタの宣言
	Dog(String name) {

		// インスタンス変数に代入
		this.name = "犬"; // 修正
	}

	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	Dog(int number) {

		this.number = number;
	}
}