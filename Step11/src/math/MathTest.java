package math;

public class MathTest {

	public static void main(String[] args) {
		//절대값 출력 - Math.abs
		System.out.println(Math.abs(-100)); //100
		
		//올림 - Math.ceil
		System.out.println(Math.ceil(3.4)); //4.0
		System.out.println(Math.ceil(-3.4)); //-3.0
		//내림 -Math.floor
		System.out.println(Math.floor(3.4)); //3.0
		System.out.println(Math.floor(-3.4)); //-4.0
		//반올림 - Math.round
		System.out.println(Math.round(3.4)); //3 
		System.out.println(Math.round(-3.4)); //-3
		
		
		//최대값, 최소값 - .max , .min
		System.out.println(Math.max(21, 30));
		System.out.println(Math.min(21, 30));
		
		//삼각함수
		System.out.println(Math.sin(45)); //0.85
		System.out.println(Math.cos(45));
		System.out.println(Math.tan(45));
		
		//pi
		System.out.println(Math.PI);
		
		//random
		System.out.println(Math.random());
		
		System.out.println("------");
		//1~10까지 숫자 중 랜덤하게 뽑기
		for (int i = 0; i <=50; i++) {
			System.out.println(Math.floor(Math.random()*10)+1);
		}
		//randomdna0~0.999까지 출력 *10을 한 값을 내림한 다음 거기에 +1을 하면 깔끔하다.
		
		//소수점내림(임의의 수 * (최대값 - 최소값 + 1)) + 최소값
		//10~17까지 숫자중 랜덤하게 뽑기 (위의 식은 공식)
		System.out.println("---------");
		for (int i = 0; i <=20; i++) {
			System.out.println(Math.floor(Math.random()*8)+10);
		}
	}

}
