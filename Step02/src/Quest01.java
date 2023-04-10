import java.util.Scanner;

public class Quest01 {
/*
 * 정수형 변수 2개를 선언한 후
 * 정수 2개를 각각 입력을 받은 후
 * 해당 변수 2개를 이용하여 모든 사칙연산의 결과를 출력
 * 
 * 정수 입력 : 5
 * 정수 입력 : 3
 * 8
 * 2
 * 15
 * 1
 * 2
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 0; //입력받을 것이라도 0으로 초기화시켜준다. 
		
		System.out.print("정수 입력 >>> ");
		n1 = sc.nextInt(); 
		//int n1 = sc.nextInt();이렇게하면 같은 이름 변수를 2번 선언한게 되서 오류가 뜬다. 
		
		System.out.print("정수 입력 >>> ");
		n2 = sc.nextInt(); 
		
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
		System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
		System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
		System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
		System.out.println(n1 + " % " + n2 + " = " + (n1 % n2));
	
	}

}
