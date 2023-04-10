package lamda;

public interface Method<T> { //인터페이스에 제네릭을 걸어준다. 람다식에 거는것이 아니라 여기서 만들어서 적용
	public void run(T obj); //obj로 했으니 받을 객체가 다양해진다.
	//Step11 - generic 참고
}
