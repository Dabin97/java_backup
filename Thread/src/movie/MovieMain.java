package movie;

public class MovieMain {

	public static void main(String[] args) {
		Customer[] arr = new Customer[7];
		arr[0] = new Customer("김씨");
		arr[1] = new Customer("목씨");
		arr[2] = new Customer("박씨");
		arr[3] = new Customer("이씨");
		arr[4] = new Customer("숙씨");
		arr[5] = new Customer("고씨");
		arr[6] = new Customer("송씨");
		
		for(Customer c : arr)
			c.start();
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Cinema.getInstance().allSeatPrintInfo(); //모두 출력
	}

}
