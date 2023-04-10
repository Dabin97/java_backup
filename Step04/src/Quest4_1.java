
public class Quest4_1 {

	public static void main(String[] args) {   //나비모양은 윗쪽리본+아랫쪽리본을 붙인 형태
		for(int i1 = 0, i2 = 0; i1 < 5; i1++, i2++) { //i1,i2변수 선언, i1<5 ->5줄
			for(int j = 0; j < i1+1; j++) { //왼쪽 삼각형
				System.out.print("*"); //j가 0이기때문에 i1+1을 해야 꽉 찬 삼각형이 된다. +1을 빼면 아랫줄이 없어짐
			}
			for(int k = 8; k > i1+i2; k--) { //가운데 공백, 그냥 이 코드만 가져오면 왼쪽으로 달라붙은 공백
				System.out.print("-");//왼쪽 삼각형 코드를 위에 넣었기때문에 가운데 공백이 된다. 공백 최대 8칸,별이 양쪽을 채울때까지 1개씩 감소한다. 
			}						  //한 바퀴 돌때바다 i1과 i2가 증가하기때문에 결과적으로 공백이 계속 적어진다.
			for(int l = 0; l < i1+1; l++) {  //오른쪽 삼각형, 왼쪽 삼각형과 동일한 형태
				System.out.print("*"); 
			}
			System.out.println();
		}
		for(int i1 = 0, i2 = 0; i1 < 5; i1++, i2++) {
			for(int j = 5; j > i1; j--) {	//위와 삼각형-공백-삼각형 순서는 똑같지만
				System.out.print("*");		//식이 정반대이다. 
			}
			for(int k = 0; k < i1 + i2; k++) {
				System.out.print("-");
			}
			for(int l = 5; l > i1; l--) {
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
		}
	}

}
