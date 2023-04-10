package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
//파일은 이진수로 이루어진것이라서 문자열이 아니라 바이트로 받아서 입출력한다. 이번에는 프로세스 스트림이 안들어간다. 
//이미지를 이용해서 파일 복사(이미지가 깨지면 알아보기 쉬워서)
	public static void main(String[] args) { 
		File file = new File("cat1.zip");
		File copy = new File("c:\\test\\copy.zip");
		
		//복사할 파일이 있는 경로가 유효한지 확인 후 없으면 해당 경로까지의 폴더 생성
		File parent = copy.getParentFile();
		if(!parent.exists()) parent.mkdirs();
		
		try (FileInputStream original = new FileInputStream(file); //인풋스트림 읽어오기 (입력)
			 FileOutputStream copyFile = new FileOutputStream(copy);){ //아웃풋스트림 내보내기 (출력)
			
			byte[] buffer = new byte[1024]; //버퍼를 사용하면 메모리 처리속도가 빨라진다
			while(true) {
//				int data = original.read(); //하나씩 읽어들이기 - 원래는 바이트로 해야하는데, 파일이 깨져서 int로 변경
				int size = original.read(buffer);
				if(size == -1) break;
				copyFile.write(buffer, 0, size); //0에서 size까지 정해주기
				copyFile.flush();
			}
			System.out.println("파일 복사 완료");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//main

}
