/*
①配列int test[][]に以下の成績を格納し、表示してください。
	出力結果：生徒1：国語64点、数学73点、英語69点
			  生徒2：国語58点、数学81点、英語75点
			  生徒3：国語86点、数学68点、英語79点
			  生徒4：国語72点、数学55点、英語80点
	
②それぞれの教科の平均点を表示してください。
	出力結果：国語の平均点は○○点です。
			  数学の平均点は○○点です。
			  英語の平均点は○○点です。
*/
package sample;

public class java1_15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// ①　数字格納
		int[][] test = { { 1, 64, 73, 69 },
				{ 2, 58, 81, 75 },
				{ 3, 86, 68, 79 },
				{ 4, 72, 55, 80 } 
		};
		
		// 条件
		for (int i = 0; i < 4; i++) {
			
			// 代入
			String a = "生徒" + test[i][0] + ":";
			String b = "国語" + test[i][1] + "点、";
			String c = "数学" + test[i][2] + "点、";
			String d = "英語" + test[i][3] + "点";
			
			// 出力
			System.out.println(a + b + c + d); 
		}
		
		// 改行
		System.out.println(); 
		
		// ②
		int num = (test[0][1] + test[1][1] + test[2][1] + test[3][1]) / 4; // 国語平均値計算
		
		int num1 = (test[0][2] + test[1][2] + test[2][2] + test[3][2]) / 4; // 数学平均値計算
		
		int num2 = (test[0][3] + test[1][3] + test[2][3] + test[3][3]) / 4; // 英語平均値計算
		
		// 代入
		String language = "国語の平均点は" + num + "点です。";
		String math = "数学の平均点は" + num1 + "点です。";
		String english = "英語の平均点は" + num2 + "点です。";
		
		System.out.println(language); // 出力
		
		System.out.println(math); // 出力
		
		System.out.println(english); // 出力

	}

}
