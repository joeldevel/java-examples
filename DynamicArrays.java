import java.util.ArrayList;

public class DynamicArrays {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);

		list.remove(4);
		list.indexOf(7);
		list.contains(-10);
		list.size();
		
		System.out.println(list);
		System.out.println("array's size: " + list.size());

		/* make a new array from the arraylist*/
		Integer[] array = list.toArray(new Integer[list.size()]);

		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
