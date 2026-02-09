package Day9;

import java.util.ArrayList;

public class Java01_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(9);
		System.out.println(list);// toString 을 오버라이딩해서 toString 을 사용하지 않아도 됨.

		ArrayList<Object> list2 = new ArrayList<>();
		list2.add(25);
		list2.add("응애");
		System.out.println(list2);
		list2.add(true);
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list2.get(i));
		}
	}

}
