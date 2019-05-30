package arrayListFamily;

import java.util.*;

public class FamilyListList {

public static void main(String[] args) {
        

	List MyFamily = new ArrayList();
	MyFamily.add("Marshall");
	MyFamily.add("Raena");
	MyFamily.add("Tyler");
	MyFamily.add("Tanner");
	MyFamily.add("Robbie Jo");
	MyFamily.add("Michael");
	MyFamily.add("Allie");
	MyFamily.add("Charly");
	MyFamily.add("Benjamin");
	System.out.println("Family ArrayList Elements");
    System.out.print("\t" + MyFamily);
	
	List LinkedFamily = new LinkedList();
	LinkedFamily.add("Marshall");
	LinkedFamily.add("Raena");
	LinkedFamily.add("Tyler");
	LinkedFamily.add("Tanner");
	LinkedFamily.add("Robbie Jo");
	LinkedFamily.add("Michael");
	LinkedFamily.add("Allie");
	LinkedFamily.add("Charly");
	LinkedFamily.add("Benjamin");
	System.out.println("\nFamily LinkedList Elements");
    System.out.print("\t" + LinkedFamily);
   
}
}