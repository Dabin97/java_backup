package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAppendTest {

	public static void main(String[] args) {
		// Student 형 배열 길이가 5인 배열을 생성
		Student[] std = new Student[5];
		Scanner sc = new Scanner(System.in);

		// 학생정보 3건을 입력을 받아서, 배열에 저장
		//String name; String no; String major; double score;
		//new Student(name, no, major, score); 여기에 나온것을 아래 for문 변수명에 그대로 넣는다. 
		//매개변수를 지역변수로 만들어 놓고 new Student하면 알아서 자동으로 넣어준다. 
		int index = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print("학번 : ");
			String no = sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("학과명 : ");
			String major = sc.nextLine();
			System.out.print("평점 : ");
			double score = sc.nextDouble();
			sc.nextLine(); //정수 및 숫자 입력 후 줄바꿈 문자 제거(엔터 제거)
			
			std[index] = new Student(name, no, major, score);
			index++;
		}
		// 2번 입력을 받고나면 터짐. 이유는 엔터를 횟수로 받았기때문이다. 이것을 해결하려면 sc.nextLine();
		//을 해서 한칸을 더 넘긴다. 또는 입력을 모두 문자열로 받고 (캐스팅)을 통해 숫자로 바꾼다. 
		
		
		
		// 입력된 전체 학생정보를 일괄 출력
		for (int i = 0; i < index; i++) {
			std[i].printStudentInfo();
		}
		//index++;해서 index가 3이 되면, 0 1 2 까지만 읽어서 출력할때 i < index;만 넣어도 된다. 
	}// main

}
