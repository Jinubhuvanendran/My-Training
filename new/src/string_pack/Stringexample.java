package string_pack;

public class Stringexample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int a=5;
				String s1="jinu";
				String s2="bhuvanendran";
				String s4="JINU";
				String s5=new String("jinu");
				String s6=new String("jinu");
				String s3=new String("example1");
				String s7="  JINU   ";
				String s8="java language";
				s1=s1.concat("example2");
				System.out.println(s1);
				System.out.println(s2);
				System.out.println(s3);
				System.out.println(s1.length());
				System.out.println(s1.equals(s3));
				System.out.println(s1.equals(s4));
				System.out.println(s4.equalsIgnoreCase(s5));
				System.out.println(s5==s6);
				System.out.println(s1.compareTo(s3));
				System.out.println(s3.compareTo(s1));
				System.out.println(s1.charAt(2));
				System.out.println(s1.toUpperCase());
				System.out.println(s4.toLowerCase());
				System.out.println(s7.trim());
				System.out.println(s8.replace("java","python"));
				System.out.println(s4.startsWith("J"));
				System.out.println(s4.endsWith("J"));
				System.out.println(s4.contains("J"));
				String n=String.valueOf(a);
				System.out.println(n+5);
				
				
				
	}

}
