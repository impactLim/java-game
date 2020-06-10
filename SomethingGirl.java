package game;

import java.util.Random;

public class SomethingGirl extends Thread { // 친척들 // 부모님과 식사 중 이벤트
	
	static String message;
	static Object key = new Object(); 
	
	// 예제에서는 쓰레드에게 권한을 주는 용도로 쓰일 레퍼런스를 key라고 명하고 Object를 이용해 만들어 쓰고 있는데
	// 이 권한을 같이 공유하면서 서로 쓸수 있도록 만들어야되므로 static을 붙였다.
	
	public void get(String girlMessage) {
		message = girlMessage;
		start();
	}

	
//	public void run() {
//
//
//		// 결과에서 보듯이 한 쓰레드가 key(권한)를 얻어 출력을 시작하면 다른 쓰레드가 출력이 끝날때까지 대기했다가 key(권한)를 넘겨받아 자신이 가진 메세지를 출력하고 
//		// 남아있는 쓰레드도 역시 출력이 끝날때까지 기다렸다가 본인이 가진 메세지를 key(권한)를 넘겨받은 후에야 출력을 한다. 
//		// 예제에서는 쓰레드가 3개인 다중쓰레드를 작동하였는데 작업환경에 따라 어느 구문이 먼저 출력될지는 장담할수 없겠지만 
//		// 어느 쓰레드건 출력을 시작했으면 처음부터 끝까지 그 구문은 완전하게 찍히는 것을 확인할수 있을 것이다.
//		
//		synchronized(key) { // synchronized(Test54.class) 가능
//			
//		// 자바에서 다중쓰레드가 공유하고 있는 자원을 어떤 쓰레드가 실행하고 있을때 다른 쓰레드는 접근하지 못하도록 막아주는 "보호막" 같은 장치가 바로 synchronized 라는 키워드다. 
//		// 쓰는 방법은 쓰레드에서 보호막 치기를 원하는 부분을 { } 블록으로 감싸고 그 위에 synchronized(레퍼런스) 라는 타이틀을 만들어주면 된다. 다시 코드로 표현하면 아래와 같이 될것이다.	
//			System.out.println(" ");
//			System.out.println(message);
//						후니.후니_스트레스지수 += 1;
//			System.out.println("후니의 스트레스지수가 " + 1 + " 높아졌습니다." );
//			
//			
//			try{
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				 
//			};
//
//		}
//	}
	
	public static boolean SomethingGirlCome() {
		
		
		
		Random random = new Random();
		boolean result = false;
		int rate = 0;
		rate = (int)random.nextInt(100);
		if(rate >= 81) { 
			result = true;
			//전체 배경음악 껐다가
			
			System.out.println("수업이 끝나고..");
			System.out.println("옆줄에 앉아있던 여학생이 나에게 다가온다");
			System.out.println(" ");
				
		SomethingGirlComeBgm SomethingGirlComeBgm = new SomethingGirlComeBgm();
		
        try {
        	SomethingGirlComeBgm.LoadBgm();
             Thread.sleep(0);
        }catch(InterruptedException e) {
             e.printStackTrace();
        }
		

		
		String somegirlOne[] = {

				"[여학생] 저기요~ ",
				"[후니] 네? ",
				"[여학생] 다름이 아니라 과제 때문에 물어볼게 있어서요 ",
				"[후니] 아 네 말씀하세요!",
				"[여학생] 재무관리 과제가 좀 헷갈려서요. 어렵지 않으세요?",
				"[후니] 아.. 그거 저도 어렵더라구요.. 안 그래도 친구들한테 물어보면서 공부하려 했어요!",
				"[여학생] 아.. 그러시구나!",
				"[후니] 제 번호 알려드릴까요? 같이 공부해봐요!",
				"[여학생] 좋아요! 궁금한거 생기면 톡할게요!",

		};
		
		for (int i = 0; i <somegirlOne.length; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//0.5초마다 한 문장씩 출력
			System.out.println(somegirlOne[i]);
			
			// 심장소리 끝나고
			// 꺼진 전체 배경음악 다시 켜야함
			
		}
		
        try {
			SomethingGirlComeBgm.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		후니.후니_자존감지수 += 5;
		System.out.println("");
		System.out.println("후니의 자존감지수가 " + 5 + " 높아졌습니다.");
		
		
		// 결과에서 보듯이 한 쓰레드가 key(권한)를 얻어 출력을 시작하면 다른 쓰레드가 출력이 끝날때까지 대기했다가 key(권한)를 넘겨받아 자신이 가진 메세지를 출력하고 
		// 남아있는 쓰레드도 역시 출력이 끝날때까지 기다렸다가 본인이 가진 메세지를 key(권한)를 넘겨받은 후에야 출력을 한다. 
		// 예제에서는 쓰레드가 3개인 다중쓰레드를 작동하였는데 작업환경에 따라 어느 구문이 먼저 출력될지는 장담할수 없겠지만 
		// 어느 쓰레드건 출력을 시작했으면 처음부터 끝까지 그 구문은 완전하게 찍히는 것을 확인할수 있을 것이다.
		
//		synchronized(key) { // synchronized(Test54.class) 가능
//			
//		// 자바에서 다중쓰레드가 공유하고 있는 자원을 어떤 쓰레드가 실행하고 있을때 다른 쓰레드는 접근하지 못하도록 막아주는 "보호막" 같은 장치가 바로 synchronized 라는 키워드다. 
//		// 쓰는 방법은 쓰레드에서 보호막 치기를 원하는 부분을 { } 블록으로 감싸고 그 위에 synchronized(레퍼런스) 라는 타이틀을 만들어주면 된다. 다시 코드로 표현하면 아래와 같이 될것이다.	
//
//			String sister[] = {
//					
//					" ",
//					"[사촌동생] 오빠~~~ 잘 지냈어??! 요즘 어떻게 지내",
//					"후니의 스트레스지수가 " + 1 + " 높아졌습니다."
//					
//			};
//			
//			for (int i = 0; i <sister.length; i++) {
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}//0.5초마다 한 문장씩 출력
//				System.out.println(sister[i]);
//			}
//
//			후니.후니_스트레스지수 += 1;
//			
//			String uncle[] = {
//					
//					" ",
//					"[이모부] 후니야 오랜만이다! 아직 대학생인가?",
//					"후니의 스트레스지수가 " + 1 + " 높아졌습니다."
//					
//			};
//			
//			for (int i = 0; i <uncle.length; i++) {
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}//0.5초마다 한 문장씩 출력
//				System.out.println(uncle[i]);
//			}
//			
//			후니.후니_스트레스지수 += 1;
//			
//			String aunt[] = {
//					
//					" "	,
//					"[이모] 후니 요즘 어떻게 지내니? 취업은 어디로 하려고? 공무원은 여전히 생각 없고?",
//					"후니의 스트레스지수가 " + 1 + " 높아졌습니다."
//					
//			};
//			
//			for (int i = 0; i <aunt.length; i++) {
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}//0.5초마다 한 문장씩 출력
//				System.out.println(aunt[i]);
//			}
//		
//			후니.후니_스트레스지수 += 1;
//			
//		}
		
		} return result;
	}
}
