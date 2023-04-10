import java.util.Scanner;

public class Home3 {
/*
 *     1~100까지 출력
    1 2 짝 4 5 짝 7 8 짝 10
    11 12 짝 14 15 짝 17 18 짝 20
    21 32 짝 24 25 짝 27 28 짝 짝
    짝(31) 짝(32) 짝짝(33) 짝(34) 짝(35) 짝짝(36) 짝(37) 짝(38) 짝짝(39) 40
    .... 100까지
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~100까지 정수 입력 : ");
		int n = sc.nextInt();	
		
		for(int i =1; i<=n;i++) {
			int a = i/10, b = i%10;
			if(i%10 ==0) {
				System.out.println();
			}
			if(a==3 || a==6 || a==9) {
				if(b==3 || b==6 || b==9) {
					System.out.print("짝짝 ");
				}continue;
			}
			else if(b==3 || b==6 || b==9){
				System.out.print("짝 ");
			}else {
				System.out.print(i + " ");
			}
		}
		
		
			
		
		
	}

}
