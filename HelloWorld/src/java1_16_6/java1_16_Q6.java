package java1_16_6;

class java1_16_Q6 {
    
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
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
