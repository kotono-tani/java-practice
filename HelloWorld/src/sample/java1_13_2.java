/*
	①配列aを作成し、1～5を格納してください。
	
	②参照型配列bを作成し、3を表示してください。
		出力結果：3
		
	③配列a[3]を10で上書きし表示してください。
		出力結果：10
		
	④配列aの要素数を「配列aの要素数は、○です。」という形で表示してください。
		出力結果：配列aの要素数は、５です。
*/
package sample;

public class java1_13_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// ①
		// 格納
		int[] a = {1,2,3,4,5};
		
		// 配列b作成
		int[] b;
		
		// 条件
		b = a; // ② 修正

		// 出力
		System.out.println(b[2]); //　修正
		
		// ③
		// 上書き
		a[3] = 10;
		
		// 出力
		System.out.println(a[3]);
		
		// ④
		// 代入
		String str = "配列aの要素数は、" + a.length + "です。";
		
		// 出力
		System.out.println(str);
	}

}
