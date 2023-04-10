package has_a_2;
/*
 * 경찰 클래스
 * 	필드 - 수갑개수
 *  기능 - 총을 발사하는 행동
 *  	- 재장전하는 행동
 *  
 * 총 클래스
 * 	필드 - 총알 개수
 *  기능 - 총알을 발사하는 기능
 *     	- 총알을 다시 채우는 기능
 */
public class Police {
	private int handcuffs;
	private Gun gun; //총을 Gun이라는 외부에서 가져옴.
	
	
	//생성자 
	public Police(Gun gun) {
		handcuffs = 3;
		this.gun = gun;
	}
	
	public void shot() {
		gun.shot(); //super로 가져오지않고 위에 선언한 객체를 사용해서 기능에 넣는다. 
	}
	
	public void reload() {
		gun.reload(); //외부에서 들어온 총이 달라져도 기능은 동일하다. 메서드명만 안바꾸면 문제 없다.
	}
	//아까는 상속되어있는 형태였다면, 지금은 외부에서 가져와서 합친 형태이다. 
	
	public void userHandcuffs() {
		if(handcuffs > 0) {
			handcuffs--;
			System.out.println("수갑을 사용합니다.");
		}
	}
}//class
