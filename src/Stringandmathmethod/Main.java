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
String matchs="Student";
System.out.println(matchs.equals("Student"));
//System.out.println(matchs.matches("Student")); regrex

}

}
