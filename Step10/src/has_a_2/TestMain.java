package has_a_2;

public class TestMain {

	public static void main(String[] args) {
		Gun gun = new Gun(); //Gun따로
		AK47 ak = new AK47(); //Gun을 상속받으면 아래 police에서도 사용가능하다.
		Police police = new Police(ak); //Police따로 Police(gun); 넣어준다. 
		
		police.shot();
		police.shot();
		police.shot();
		police.shot();
		police.shot();
		police.shot();
		police.reload();
		
		//Gun-AK47(상속관계) ---> Police(외부에서 gun만 받아옴)(has a관계)
		
		
		
		
	}//main

}
