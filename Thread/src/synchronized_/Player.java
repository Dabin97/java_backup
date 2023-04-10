package synchronized_;

public class Player extends Thread{
	private Bank bank;

	public Player(Bank bank) {
		this.bank = bank;
	}
	
	public void getMoney() {
		System.out.println(getName() + " : " + bank.withdraw(1000));
	}
	
	@Override
	public void run() {
		getMoney();
	}
}
//.wait()라는 메소드는 앞에 final이 붙어있어서 오버라이딩이 되지않는다. 