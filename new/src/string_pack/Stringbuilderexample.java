package string_pack;

public class Stringbuilderexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str=new StringBuilder("string1");
				System.out.println(str);
				str.append("concat");
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
