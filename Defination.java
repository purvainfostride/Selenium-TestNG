package Collections;
import java.util.*;
public class Defination {

	public void defination() {
		Declaration D=new Declaration("Kavita",33,"Testing");
		Declaration D1=new Declaration("Ravi",23,"SDET");
		Declaration D2=new Declaration("Khushi",33,"Staffing");
		ArrayList<Declaration> dc=new ArrayList();
		dc.add(D);
		dc.add(D1);
		dc.add(D2);
		Iterator<Declaration> it=dc.iterator();
		while(it.hasNext()) {
			Declaration dcl=it.next();
			System.out.println(dcl.name);
			System.out.println(dcl.age);
			System.out.println(dcl.dept);
		}
	}

	public static void main(String[] args) {
		Defination df= new Defination();
		df.defination();

	}

}
