package method;
//역순으로 main클래스부터 만들어서 데이터클래스까지 만드는 방법 + 역순으로 init함수부터 만들고 필드변수 만들기
public class Animal {
	
	private int age;        
	private boolean gender;

	void init(int a, boolean g) {
		age = a;
		gender = g;
	} //컨트롤+1 = 퀵픽스가 뜬다. 파라미터 = 매개변수
	
	void printAnimalInfo() {
		System.out.println("이 동물의 나이는 " + age + "이고 성별은 " + (gender ? "남성" : "여성"));
	}
	
	
}//class
