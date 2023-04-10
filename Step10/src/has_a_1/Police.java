package has_a_1;
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
public class Police extends Gun{
	private int handcuffs;
	
	
	//생성자 
	public Police() {
		handcuffs = 3;
	}
	//기능
	@Override
		public void shot() {
			super.shot();
		}
	
	@Override
		public void reload() {
			super.reload();
		}
	
	public void userHandcuffs() {
		if(handcuffs > 0) {
			handcuffs--;
			System.out.println("수갑을 사용합니다.");
		}
	}
}//class
