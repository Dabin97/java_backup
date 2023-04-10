package obj;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * 1. Person 정보 5건을 person.date에 저장
 * 2. Person 정보 내용은 자유롭게 지정
 * 			- 직접 입력 받아도 됨
 * 			- 생성 할때 임의로 넣어도됨
 */
public class PersonWriteMain {

	public static void main(String[] args) {
		Person[] arr = {
			new Person("김철수", 20),
			new Person("이영희", 30),
			new Person("홍길동", 40),
			new Person("박영수", 50),
			new Person("김동길", 60)
		};
		try(FileOutputStream fos = new FileOutputStream("person.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);){
			
				for (int i = 0; i < arr.length; i++) {
					oos.writeObject(arr[i]);
				} 
				oos.flush(); //oos.flush();를 안해도 close하면 알아서 된다.
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
		
		
	}//main

}
