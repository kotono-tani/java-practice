package sample;

public class java1_16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Q1：「A」という文字列を変数に代入してコンソールに出力してください。
		String a = "A"; // 代入
		System.out.println(a); // 出力
		
		// Q2：「Hello Java」という文字列を変数に代入してコンソールに出力してください。
		String name = "Hello Java"; // 代入
		System.out.println(name); // 出力
		
		// Q3：富士山の標高を整数で変数に代入してコンソールに出力してください。
		int size = 3776; // 代入
		System.out.println(size); // 出力
		
		// Q4：円周率を小数点第二位まで変数に代入してコンソールに出力してください。
		double en = 3.14; // 代入
		System.out.println(en); // 出力
		
		// Q5：変数numsに「10, 100, 1000」が格納された配列を代入して、コンソールにメモリの番地が1のデータを出力してください。
		int[] nums = { 10, 100, 1000 }; // 代入
		System.out.println(nums[1]); // 出力

		// Q6：Q5で作成した変数numsを変数bに代入し、その後変数bのメモリの番地が1のデータを「8」に上書きさせて
		//     コンソールに変数numsと変数bのメモリの番地が1のデータを出力させて、変数nums値が変わることを確認してください。
		int[] b = nums; // 代入
		b[1] = 8; // 上書き
		System.out.println(nums[1]); //出力
		System.out.println(b[1]); //　出力
	}
}
