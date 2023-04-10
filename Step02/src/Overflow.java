
public class Overflow {

	public static void main(String[] args) {
		byte b = 127;
		System.out.println(b);
		b++;
		System.out.println(b); //결과값 -128, 01111111여기에 1이 추가되면 10000000 부호비트가 1 음수가 되고, 최대값에서 최소값이 된다. 
		b--;
		System.out.println(b); //최소값을 넘으면 최대값이 되어버린다.
	}

}
