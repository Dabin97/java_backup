package obj;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriteTest {

	public static void main(String[] args) {
		try(
			FileOutputStream fos = new FileOutputStream("person.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);){
			Person p = new Person("김철수", 20);
			
			oos.writeObject(p);
			oos.flush();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		//그냥 실행시 java.io.NotSerializableException: obj.Person 익셉션, 그냥 Person에 오류가 났다고 뜸
		//아까 ReadHex에서는 일렬로 쭉 나오는데, Person은 객체, 데이터를 저장할때 이름 저장하고 그 옆에 나이를 저장하지않는다. 
		//따로따로 메모리가 지정되어서 저장되기때문에, Person은 직렬화가 되지않아서 파일을 저장할수없다고 오류가 뜬다.  
		//Person클래스에 Serializable 이라는 인터페이스를 implements하면 알아서 직렬화된다. 
		
	}//main

}
