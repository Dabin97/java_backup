package anonyumous; //anonyumous = 익명 클래스

public class PoliceMain {

	public static void main(String[] args) {
		Gun gun = new Gun() { //인터페이스도 anonyumous 생성가능 추상메서드는 모두 오버라이딩 필수
							  
			@Override
			public void shot() {
				System.out.println("BBang");
			}
			
			@Override
			public void reload() {
				System.out.println("reload");
			}
		};
		Police police = new Police(gun);
		police.shot();
		police.reload();
		police.setGun(new Gun() {
			private int bullet = 20;//필드를 추가로 넣어도 된다. 그러나 {중괄호}안에서만 기능
			@Override
			public void shot() {
				bullet--;
				System.out.println("빵");				
			}
			
			@Override
			public void reload() {
				System.out.println("재장전");
				
			}
		});
		police.shot();
		police.reload();
		
	}//main

}
/*
 		Button btnExit = findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAndRemoveTask();
            }
        });

	이것도 누르면 꺼지는 버튼 기능 메소드인데, 이거 하나를 위해 상속클래스를 더 만들수는 없으니까
	익명 클래스(anonyumous)를 넣어서 간단하게 처리한 예시이다.
*/