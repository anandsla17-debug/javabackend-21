package learnaccessmodifier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Publics publics= new Publics();
		publics.method();
		SubClass team = new SubClass();
		team.method();
		team.collect();

		Privates t= new Privates();
				t.subprivate();
	
				Protected teams= new Protected();
				teams.submethod();
						
	}

}
