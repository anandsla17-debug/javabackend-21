package accessmodified;

import learnaccessmodifier.Protected;
import learnaccessmodifier.Publics;
import oops.Interfaces;
import oops.Interfacesimpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Interfaces obj= new Interfacesimpl();
// obj.add();
// obj.run();
// Interfaces.hello();
		
		Publics team= new Publics();
		team.method();
		System.out.println(team.name);
	ProtectedSub te= new ProtectedSub();

	te.submethod();
	System.out.println(te.gu);
	
 
	}

}
