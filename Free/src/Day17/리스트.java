package Day17;

import java.util.ArrayList;
import java.util.Random;

public class 리스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> menuList = new ArrayList<>();
		Random ran = new Random();
		menuList.add("짜장면");
		menuList.add("햄버거");
		menuList.add("김치찌개");
		menuList.add("라면+김밥");
		menuList.add("돈까스");
		System.out.println(menuList);
		// 랜덤으로 한 개 추천
		int ranNum = ran.nextInt(menuList.size());
		System.out.println(menuList.get(ranNum));// ArrayList도 배열의 값이기때문에 get 으로 인덱스를 가져오면됨.

		menuList.clear();
		System.out.println(menuList);
	}

}
