package static_ex;

public class Card {
	private static int cardNoseq = 1000; //static으로 미리 특정값을 만들어두고
	private int cardNo;
	private String name;
	
	public Card(String name) {
		this.name = name;
		cardNo = cardNoseq++;  //메인에서 변수를 만들때마다 1씩 증가,각각 다른 값을 가지게된다. 
	}

	@Override
	public String toString() {
		return "Card [cardNo=" + cardNo + ", name=" + name + "]";
	}
	
	//싱글톤 패턴 - 메모리 아끼기 반응속도 up
}
