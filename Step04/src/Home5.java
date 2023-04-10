import java.util.Scanner;

public class Home5 {
/*
 *  숫자를 하나 입력받아서. 그 숫자가 소수인지 판별하는 코드. 
    소수 : 1과 자기자신으로만 나누어지는 숫자 (2,3,5,7,11...)

    숫자 입력 : 5
    입력하신 숫자는 소수 입니다.

    숫자 입력 : 4 
    입력하신 숫자는 소수가 아닙니다.

    나누어 떨어지면 소수 x
    나누어 떨어지지 않으면 소수 o
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하시오 : ");
		int num = sc.nextInt();
		boolean isPrime = true;// isPrime : 소수인지 판별

		// i : num에 나눌 값, for문을 한 바퀴 돌 때마다 1씩 증가한다.
        // 변수 i를 num/2만큼만 반복하게 해서 반복횟수를 줄인다.
		for(int i = 2; i <= num/2; i++) {// 순차적으로 i를 num에 나누어본다.
			if(num%i == 0) { 			 // num이 i로 나눠져 나머지가 0이 되면 isPrime에 false(소수가 아님)을 입력한다.
				isPrime = false;
				break;
				}
			}
		// 이미 1과 자기자신 외에 다른 수로도 나눠져 합성수임을 알았으므로 더 이상 반복하지 않고 빠져나온다.
        // 삼항 연산자를 사용하여 isPrime이 true이면 "소수입니다."를 출력한다.
        // isPrime이 false라면 "소수가 아닙니다."를 출력한다.
		System.out.print(isPrime ? "소수입니다." : "소수가 아닙니다.");
		
	}

}
