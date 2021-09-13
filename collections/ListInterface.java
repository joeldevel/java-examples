import java.util.List;
import java.util.ArrayList;

public class ListInterface {
	public static void main(String[] args) {
		
		// ArrayList implements the List interface
		List<Integer> aList = new ArrayList<Integer>();
		System.out.println("is arrayList empty? " + aList.isEmpty());
		System.out.println("inserting some elements... " );
	
		// we can add elements using add(e)
		aList.add(100);
		aList.add(88);
		aList.add(-58);
		
		// and remove using remove(index);
		aList.remove(2);

		System.out.println("arrayList size: " + aList.size());
		// traversing the list
		for(Integer i: aList) {
			System.out.println(i);
		}
	}
}
