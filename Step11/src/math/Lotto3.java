package math;

import java.util.HashSet;

public class Lotto3 {

	public static void main(String[] args) {
		//set - 중복을 제거하는 특징을 가지고 있으므로 중복제거if문을 쓸 필요없다.
		HashSet<Integer> set = new HashSet<Integer>();

		while (set.size() < 6) {
			set.add((int)(Math.floor(Math.random() * 45) + 1)); 
		}
		System.out.println(set);
	}

}
