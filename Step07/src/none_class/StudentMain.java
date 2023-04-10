package none_class;

import java.util.Scanner;

public class StudentMain {
	/*
	 * 학생정보를 하나를 저장해서 출력
	 * 입력받을 학생정보는 학번, 이름, 학과, 평점
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sno = "2001124124";
		String name = "홍길동";
		String major = "컴퓨터공학과";
		double score = 3.1;
		
		System.out.println(sno + " " + name + " " + major + " " +  score);
		
		String[] sname = new String[4]; //이름 배열 따로
		double[] sscore = new double[4]; //점수 배열 따로
		// 이렇게 넣다가 정보가 밀리면 싹다 처음부터 다시 넣어야하는 단점이 있다.
		
		// 구조체 < 사용자 정의 자료형 = 클래스(같은 개념들) 
		// 타입에 묶어서 한건으로 여러 변수들을 선언함. 한건씩 데이터를 묶어서 표현 
		// 데이터를 나타내기 위해 만든 클래스에는 main이 필요없다. main은 프로그램을 실행시키기 위한 함수이기때문
		// 
		
		}//main
	}

