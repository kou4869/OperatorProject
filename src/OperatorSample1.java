
public class OperatorSample1 {

	public static void main(String[] args) {
		// リテラル
		System.out.println(1);
		System.out.println(0.1);
		System.out.println("javaプログラム");
		System.out.println("\"java\"プログラム");
		System.out.println("\'java\'プログラム");
		System.out.println("java\nプログラム");
		
		//式・評価
		System.out.println(2+3);
		System.out.println(2+3-4);
		System.out.println(2*3+4);
		System.out.println(2*(3+4));
		System.out.println(10/5);
		System.out.println(10%3);
		
		//代入を含む演算子
		int x;
		x = 2+3-4;
		System.out.println(x);
		
		//文字列の列号
		String str;
		str = "こんにちは" + "世界";
		System.out.println(str);
	}

}
