import java.util.Scanner;

public class Home2 {
/*
 * 
 *  한박스에 20개의 라면을 담을수가 있습니다.
    라면의 개수를 입력하시면 필요한 박스 수를 알려드립니다.
    라면의 개수를 입력하세요 >>> 52
    52개의 라면을 담을려면 3박스가 필요합니다.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("한 박스에 20개의 라면을 담을 수 있습니다.");
		System.out.println("라면 개수를 입력하시면 필요한 박스 수를 알려드립니다.");
		System.out.print("라면의 개수를 입력하세요 >>> ");
		int n = sc.nextInt();
		int box = n/20;
		
		if(n%20!=0) {
			box+=1;
		}else {
			box=0;
		}
		System.out.println(n + "개의 라면을 담으려면 " + box + "박스가 필요합니다.");	
		
		
	}

}
