
public class strings {
public static void main(String[] args)
{
	/*
	String s="abcdefghijklmnop";
	String s1=new String("kjsnkuixjkck");
	System.out.println(s.charAt(5));
	System.out.println(s1.charAt(5));
	char s3[]= {'a','h','p'};
	System.out.println(String.valueOf(s3));
	*/
	
	String s= new String(" abcdefghijk ");
	System.out.println(s.length());
	System.out.println(s.trim());
	System.out.println(s.replace('b','a'));
	System.out.println(s.trim().replace("abc", "     "));
	System.out.println(s.contains("abcg"));
	//String ab=String.valueOf(5);
	//System.out.println(ab);
	String s1=" abcdefghijk ";
	System.out.println(s1.equals(s));
	System.out.println(s1.equals("lol"));
	System.out.println(s.substring(4,7));
	
	System.out.println("__________________________________________________________________");
	
	StringBuffer sb= new StringBuffer(s);
	sb.append("1234");
	System.out.println(sb);
	sb.insert(4, "lol");
	System.out.println(sb);
	sb.append('9');
	System.out.println(sb);
	sb.replace(7, 10, "haha");
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);
	String newest= sb.substring(5);
	System.out.println(newest);
	System.out.println(newest.trim());
	
	
}
}
