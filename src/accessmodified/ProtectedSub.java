package accessmodified;

import learnaccessmodifier.Protected;

public class ProtectedSub extends Protected {
	
 String gu=super.g;
	public void submethod() {
		super.submethod();
		System.out.println("updated method"+g);
	}

}
