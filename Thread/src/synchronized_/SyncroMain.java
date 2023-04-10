package synchronized_;
//동기화 : 제일 먼저 들어온 데이터가 있으면 나머지는 기다려야함. 보안상으로는 안전하지만 시간이 오래 걸릴수있음

public class SyncroMain {

	public static void main(String[] args) {
		Bank bank = Bank.getInstance();
		Player p1 = new Player(bank);
		Player p2 = new Player(bank);
		Player p3 = new Player(bank);
		
		p1.start();
		p2.start();
		p3.start();
	}

}
