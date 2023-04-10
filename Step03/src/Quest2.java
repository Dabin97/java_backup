import java.util.Scanner;

public class Quest2 {
/*
 * 점수를 하나 입력받아서
 * 100-95 A+
 * 94-90  A
 * 89-85  B+
 * 84-80  B
 * 79-75  C+
 * 74-70  C
 * 69-65  D+
 * 64-60  D
 * 59-0  F
 * 성적 등급을 출력
 * 
 */
	
	public static void main(String[] args) {
	/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int s = sc.nextInt();
		
		if(s>=95) {
			System.out.println("A+");
		}
		else if(s>=90) {
			System.out.println("A+");
		}
		else if(s>=85) {
			System.out.println("B+");
		}
		else if(s>=80) {
			System.out.println("B");
		}
		else if(s>=75) {
			System.out.println("C+");
		}
		else if(s>=70) {
			System.out.println("C");
		}
		else if(s>=65) {
			System.out.println("D+");
		}
		else if(s>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
	*/
	
	/*
	 * if (n >= 90) {
			System.out.println(n > 94 ? "A+" : "A");
		} else if (n>= 80) {
			System.out.println(n > 84 ? "B+" : "B");
		} else if (n>= 70) {
			System.out.println(n > 74 ? "C+" : "C");
		} else if (n>= 60) {
			System.out.println(n > 64 ? "D+" : "D");
		} else {
			System.out.println("F");
		}
	 * 
	 */
		
		//선생님 예제
	Scanner sc = new Scanner(System.in);
	
	System.out.print("점수 입력 : ");
	int score = sc.nextInt();
	String result = "F";
	
	if(score >= 90)
		result = "A";
	else if(score >= 80)
		result = "B";
	else if(score >= 70)
		result = "C";
	else if(score >= 60)
		result = "D";
	
	if(score >= 60 && score % 10 >= 5)
		result += "+";
		
	System.out.println(result);
	
	}
}
