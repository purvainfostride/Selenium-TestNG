package Collections;
import java.util.*;
public class ArrayListP {
	ArrayList al=new ArrayList();//Non-Generic List
	ArrayList<Integer> al1=new ArrayList<Integer>();//Generic List
	public void insertion() {
	
		al.add("Sumit");//Adding elements in the list by Add Method
		al.add(90);
		System.out.println("List1 is "+al);
		System.out.println("Getting "+al.get(1) +" at first index");//Getting element from index by Get Method
		al1.add(2);
		al1.add(4);
		al1.add(8);al1.add(5);
		System.out.println("List2 is "+al1);
		al1.addAll(al);// Adding all data of al in al1 by AddAll Method	
		System.out.println("After adding all data of List1 in List2 "+ al1);	
		Iterator<Integer> it=al1.iterator(); //Fetching data from list2
		while(it.hasNext()) {
			System.out.println("Fetching data from list2"+it.next());
		}
	}
	public void deletion() {
		al1.remove(0); // removing data from index2 by Remove Method
		System.out.println("After removing data from 2 index in List2	"+ al1);
		System.out.println("List1 is  "+al);
		al.removeAll(al1);//removing whole List1 data by RemoveAll Method
		System.out.println("After removing whole List1 data, List1 is  "+ al);
		System.out.println( "List2 is  "+ al1);
		//al1.clear();//removing  total number of elements by Clear Method
		//System.out.println("removing  total number of elements from List2 aswell, so List 2 is "+al1);
		
	}
	public static void main(String[] args) {
		ArrayListP A=new ArrayListP();
		A.insertion();
	//	A.deletion();
		

	}

}
