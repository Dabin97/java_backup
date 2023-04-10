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
public class Gun {
	private int bullet;
	
	//생성자 
	public Gun() {
		bullet = 12;
	}

	//총알을 발사하는 기능
	public void shot() {
		if(bullet>0) {
		System.out.println("빵!");
		bullet--;
		}else {
			System.out.println("총알이 없습니다. 재장전 하세요.");
		}
	}
	//총알을 다시 채우는 기능
	public void reload() {
		bullet = 12; //본래 총알갯수로 ㄱ
		System.out.println("재장전 완료");
	}
}
