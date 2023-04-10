package obj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadTest {

	public static void main(String[] args) {
		try(
			FileInputStream fis = new FileInputStream("person.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);) {
			
			Person p = (Person) ois.readObject(); //모든 타입을 받을수있는 object, 앞에 캐스팅을 해줘야한다.
			
			System.out.println(p);
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) { //readObject() 를 하고나서 퀵픽스로 알맞는 catch를 하나 더 만든다.
			e.printStackTrace();
		}
		

	}//main

}
