package sample;

public class java1_5 {

	public static void main(String[] args) {
		
		 // Q1 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
        //  ローカル変数に代入し○○に入れてください
        // 『山田太郎 18歳 170.5cm 62.2kg 寿司』
        // ↓↓format↓↓
        // 「初めまして○○です」
        // 「年齢は○○歳です」
        // 「身長は○○cmです」
        // 「体重は○○kgです」
        // 「好きな食べ物は○○です」
    	// Q1を下記に記載
        String c;
    	c = "山田太郎";
    	
    	int i;
    	i = 18;
    	
    	float f;
    	f = 170.5f;
    	
    	double d;
    	d = 62.2;
    	
    	String s;
    	s = "寿司";
    	
    	System.out.println("初めまして" + c + "です");
    	System.out.println("年齢は" + i + "歳です");
    	System.out.println("身長は" + f + "cmです");
    	System.out.println("体重は" + d + "kgです");
    	System.out.println("好きな食べ物は" + s + "です");
        // Q2 Q1で作成した自己紹介に続いて、BMIがコンソールに出力されるようにしてください
    	// 「BMIは○○です」
        // ただし計算は数値を直書きせず、全て変数を使ってすること

        // Q2を下記に記載
    	System.out.println("BMIは" + d/((f/100)*(f/100)) + "です" );	
        // Q3 Q1で宣言した変数に再代入し、下記の通りコンソールに出力してください
    	// 初めまして鈴木一郎です
    	// 年齢は24歳です
    	// 身長168.5cmです
    	// 体重は64.2kgです
    	// 好きな食べ物はオムライスです
    	// BMIは22.6です

        // Q3を下記に記載
    	String c1;
    	c1 = "鈴木一郎";
    	
    	int i1;
    	i1 = 24;
    	
    	float f1;
    	f1 = 168.5f;
    	
    	double d1;
    	d1 = 64.2;
    	
    	String s1;
    	s1 = "オムライス";
    	
    	float bmi;
    	bmi = 22.6f;
    	
    	System.out.println("初めまして" + c1 + "です");
    	System.out.println("年齢は" + i1 + "歳です");
    	System.out.println("身長は" + f1 + "cmです");
    	System.out.println("体重は" + d1 + "kgです");
    	System.out.println("好きな食べ物は" + s1 + "です");
    	System.out.println("BMIは" + bmi + "です" );	
        
    	// ↓↓コンソール最終結果↓↓
    	
    	//	初めまして山田太郎です
		//	年齢は18歳です
		//	身長170.5cmです
		//	体重は62.2kgです
		//	好きな食べ物は寿司です
		//	BMIは21.4です
		//	
		//	初めまして鈴木一郎です
		//	年齢は24歳です
		//	身長168.5cmです
		//	体重は64.2kgです
		//	好きな食べ物はオムライスです
		//	BMIは22.6です
    	 

	}

}
