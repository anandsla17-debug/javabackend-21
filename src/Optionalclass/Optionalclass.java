package Optionalclass;

import java.util.ArrayList;
import java.util.Optional;

public class Optionalclass {

	public static void main(String[] args) {
		String name="anand";
		Optional<String> result =Optional.ofNullable(name);
		Optional<String> result1=Optional.ofNullable("anand");
	System.out.println(result.isPresent());
	System.out.println(result.isEmpty());
	System.out.println("same team"+result.equals(result1));
	ArrayList<String> data= new ArrayList<String>();
	data.add("info");
	data.add("team");
	data.add("collect");
	Optional<ArrayList<String>> team= Optional.ofNullable(data);
	System.out.println(team.isEmpty());
	System.out.println(team.isPresent());
	String d="info";
	
	System.out.println(team.get().get(1).equals(d));
		
		}
	
}
