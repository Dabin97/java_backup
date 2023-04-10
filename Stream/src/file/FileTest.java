package file;

import java.io.File;
import java.io.IOException;

public class FileTest {
	//절대경로 - 해당 파일이 있는 경로를 처음부터 끝까지 다 쓰는것
	public static void main(String[] args) {
		File file = new File("C:\\test\\test.txt"); //파일에선 \가 하나이지만 코드상에선 \\ 두번 써줘야한다. (줄바꿈과 헷갈려서)
		System.out.println(file);
		//현재 파일의 절대 경로 위치값을 뽑음
		System.out.println(file.getAbsolutePath()); 
		//부모 폴더 경로를 문자열로 받음
		System.out.println(file.getParent()); 
		//부모 폴더 경로를 파일객체로 뽑음
		File parent = file.getParentFile();
		//파일 생성전에 파일이 위치한 폴더 경로가 있는지 체크
		System.out.println(parent.exists());
		if(!parent.exists())
			parent.mkdir(); //해당 경로까지의 폴더를 전부 생성
		
		try {
			boolean result = file.createNewFile(); //test 폴더가 미리 만들어져있어야 생성이 됨
			System.out.println(result);
			file.delete(); //삭제
		} catch (IOException e) {
			e.printStackTrace();
		}
	}//main

}
