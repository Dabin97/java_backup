package inter;

public class HighSchoolStudent extends Student{
	
	@Override
	public void eat() {
		System.out.println("고등학생은 야자 중간에 저녁을 먹습니다."); //Student에서 오버라이딩이 되어있으므로 여기선 선택사항
	}
	
	
	
}
