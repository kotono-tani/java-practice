//	string型の配列を作成し、アルファベットa～jまでを格納してください。
//	brake文を使用し、a～dまで表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	          
//	cotinue文を使用し、i以外を表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	           e
//	           f
//	           g
//	           h
//	           j

package sample;

public class java1_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// a~dまで表示
		String[] language = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" }; //格納
		for (int i = 0; i < 10; i++) { // 繰り返し処理

			// switch文
			switch (language[i]) {
			case "a": // a代入
			case "b": // b代入
			case "c": // c代入
			case "d": // d代入

				System.out.println(language[i]); // 出力


				break; // dで止める
			}

		}
		System.out.println(""); // 改行

		// i意外表示
		String[] name = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" }; // 格納

		for (int a = 0; a < 10; a++) { // 繰り返し

			if (a == 8) { // i以外
				continue;
			}
			System.out.println(name[a]); // 出力
		}

	}

}
