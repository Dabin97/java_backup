package obj;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class PersonReadMain {
/*
 * 1. Perso.dat에서 Person 정보를 전부 읽어서 출력
 * 
 */
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>(); //ArrayList 생성
		
		try(FileInputStream fis = new FileInputStream("person.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);) {
			
			try {
			while(true) {
				Person p = (Person) ois.readObject(); 
				if(p==null) break;
				list.add(p);
				}
			//모든 객체를 읽어오면 EOFException을 이용해서 데이터 읽기를 종료
			}catch(EOFException e){
				//아무것도 쓰지않으면 그냥 강제종료, EOF를 아래에 catch로 넣으면 오류가 난다. IOE안에 속해있기때문
			}
			
			System.out.println(list.toString());
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) { 
				e.printStackTrace();
			}
	}//main

}

//		- 내가 했던 오답		
//			for (int i = 0; i < 5; i++) {
//				Person p = (Person) ois.readObject(); 
//				System.out.println(p);
//			}

//			while("person.dat" != null) {
//				Person p = (Person) ois.readObject(); 
//				System.out.println(p);
//				}

