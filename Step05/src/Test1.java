
public class Test1 {
// 알파벳 대소문자를 A ~ Z, a ~ z 를 순서대로 출력하세요
	public static void main(String[] args) {
		 
		//내 답안
//		for(int i = 65; i<=122; i++) {
//			int t1=0,t2=0;
//			if(i>96 && i<123) { //소
//				t1 = i;
//			}
//			if(i>64 && i<91) { //대
//				t2 = i;
//			}
//			System.out.println((char)t2 + "-" +(char)t1);
//		}
		
		
		//모범 답안
		for(int i='A';i<='Z';i++) {
			char ch1 = (char)i, ch2 = (char)(i+32); //A와 a는 +32만큼 차이난다.
			System.out.println(ch1 + "-" + ch2);
//			System.out.println(ch1 + "-" + (char)(i+32));도 가능하다. 
		}
		
		
		}//main
		
	}
//	A = 65 Z-90
//	a = 97 z-122

