package Stringandmathmethod;

public class Main {
	
public static void main(String[] args) {
	
	
	String team="    He&lo world";
	String team1="this most common text";
	String team2="students";
	System.out.println(team.codePointAt(7));
	System.out.println(team.charAt(6));
	System.out.println(team.concat(" "+team1+" "+team2));
	System.out.println(team.replaceFirst("l", "o"));
	System.out.println(team.replace("&", "hello"));
	System.out.println(team.replaceAll("l",team2));
	System.out.println(team.repeat(2));
	
	System.out.println(team.length());
	System.out.println(team.contains("o"));
	System.out.println(team.substring(0,4));
	System.out.println("start word or letter"+team.startsWith("h"));
	System.out.println("end word or letter"+team.endsWith("d"));
	System.out.println(team.trim());
	System.out.println(team1.lastIndexOf("t"));
	System.out.println(team1.indexOf("t"));
	System.out.println(team.toLowerCase());
	System.out.println(team.toUpperCase());
	
String[] teams=team.split(" ");
for(String data:teams)
	System.out.println(data);

System.out.println(team.equals("    He&lo world"));
String s1=" ";
System.out.println("b"+s1.isBlank());// letter
System.out.println("e"+s1.isEmpty()); // space and letter
String matchs = "anand@gmail.com";

System.out.println(matchs.equals("Student")); 
// false

System.out.println(matchs.matches("^[a-z0-9]+@gmail\\.com$"));
// true

//math
System.out.println(Math.PI);
System.out.println(Math.abs(-9));// neg to postive
System.out.println(Math.floor(5.1));
System.out.println(Math.round(3.4));
System.out.println(Math.ceil(5.1));
System.out.println(Math.floor(Math.random()*5));
System.out.println(Math.min(7.9, 8.8));
System.out.println(Math.max(20, 5));
System.out.println(Math.E);
System.out.println(Math.powExact(5, 4));
System.out.println(Math.pow(5.0, 10.0));


String replaceeg="123456 is my mobile";
System.out.println(replaceeg.replace("123","one two three"));// replace data based replace
System.out.println(replaceeg.replaceAll("[0-9]","onetwothree..."));// regrex replaceall





}

}
