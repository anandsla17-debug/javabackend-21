package String;

public class Main  {
public static void main(String[] args) {
	String name="arun";
//	name+=" kumar";
	name.concat("kumar");
	System.out.println(name);
	
	StringBuilder stringBuilder= new StringBuilder("pen");
	
	stringBuilder.append("pencil");
	System.out.println(stringBuilder.charAt(0));
	System.out.println(stringBuilder);
	System.out.println(stringBuilder.codePointAt(0));
	System.out.println(stringBuilder.indexOf("c"));
	System.out.println(stringBuilder.length());
	StringBuffer stringBuffer= new StringBuffer("cse");
	
	stringBuffer.append(",ece");
	
	stringBuffer.append(",metch");
	System.out.println(stringBuffer.length());
}
}
