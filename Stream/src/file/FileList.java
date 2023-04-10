package file;

import java.io.File;

public class FileList {

	public static void main(String[] args) {
		File root = new File("c:\\");
		File[] list = root.listFiles(); //c드라이브 안에 들어있는 파일들을 배열로 리턴(모든 하위폴더들을 다 가져오진않는다)
		
		
		for(File file : list) { //for each
			String fileName = file.getName(); //선택된 파일명과 폴더명만 뽑기
			long fileSize = file.length(); //파일의 크기. long 타입
			String etc = file.isDirectory()   ? "<DIR>" : ""; //무엇이냐? 하고 물어볼때는 대부분 is로 시작한다. 폴더는 <DIR>이 붙여짐<-
			System.out.println(fileName + " " + fileSize + " " + etc);
		}
		
		
	}//main

}
