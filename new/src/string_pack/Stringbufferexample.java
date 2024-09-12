package string_pack;

public class Stringbufferexample {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("jinu");
		System.out.println(str);
		str.append("bhuvanendran");
		System.out.println(str);
		str.insert(4,"-");
		System.out.println(str);
		str.reverse();
		System.out.println(str);
		System.out.println(str.length());
		String str1=str.toString();
		System.out.println(str1);

	}

}
