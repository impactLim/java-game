package game;

import java.util.Random;



public class InterviewStudyMember extends Thread {
		
		// 어느 쓰레드가 먼저 작동할런지는 모르지만 이왕 작동했으면 처음부터 끝까지 맡은바 임무(출력 메세지)는 완수하도록 권한을 부여하는 것이 동기화(Synchronization)라 할수 있겠는데 동기화라는 말자체가 어려워서 많이 애먹는것 같다. 
		// 필자는 동기화라는 표현보다는 보호막이라는 표현이 synchronization을 이해하는데 더 도움이 될꺼라 생각한다.
		
		// 자바에서 다중쓰레드가 공유하고 있는 자원을 어떤 쓰레드가 실행하고 있을때 다른 쓰레드는 접근하지 못하도록 막아주는 "보호막" 같은 장치가 바로 synchronized 라는 키워드다. 
		// 쓰는 방법은 쓰레드에서 보호막 치기를 원하는 부분을 { } 블록으로 감싸고 그 위에 synchronized(레퍼런스) 라는 타이틀을 만들어주면 된다. 다시 코드로 표현하면 아래와 같이 될것이다.
		
		static String InterviewFeeback;
		static Object key = new Object(); 
		
		// 예제에서는 쓰레드에게 권한을 주는 용도로 쓰일 레퍼런스를 key라고 명하고 Object를 이용해 만들어 쓰고 있는데
		// 이 권한을 같이 공유하면서 서로 쓸수 있도록 만들어야되므로 static을 붙였다.
		
		
//		public void run() {
		//
		//
//				// 결과에서 보듯이 한 쓰레드가 key(권한)를 얻어 출력을 시작하면 다른 쓰레드가 출력이 끝날때까지 대기했다가 key(권한)를 넘겨받아 자신이 가진 메세지를 출력하고 
//				// 남아있는 쓰레드도 역시 출력이 끝날때까지 기다렸다가 본인이 가진 메세지를 key(권한)를 넘겨받은 후에야 출력을 한다. 
//				// 예제에서는 쓰레드가 3개인 다중쓰레드를 작동하였는데 작업환경에 따라 어느 구문이 먼저 출력될지는 장담할수 없겠지만 
//				// 어느 쓰레드건 출력을 시작했으면 처음부터 끝까지 그 구문은 완전하게 찍히는 것을 확인할수 있을 것이다.
//				
//				synchronized(key) { // synchronized(Test54.class) 가능
//					
//				// 자바에서 다중쓰레드가 공유하고 있는 자원을 어떤 쓰레드가 실행하고 있을때 다른 쓰레드는 접근하지 못하도록 막아주는 "보호막" 같은 장치가 바로 synchronized 라는 키워드다. 
//				// 쓰는 방법은 쓰레드에서 보호막 치기를 원하는 부분을 { } 블록으로 감싸고 그 위에 synchronized(레퍼런스) 라는 타이틀을 만들어주면 된다. 다시 코드로 표현하면 아래와 같이 될것이다.	
//					System.out.println(" ");
//					System.out.println(message);
//								후니.후니_스트레스지수 += 1;
//					System.out.println("후니의 스트레스지수가 " + 1 + " 높아졌습니다." );
//					
//					
//					try{
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						 
//					};
		//
//				}
//			}
			
			public static boolean GoFeedback() {
				
				Random random = new Random();
				boolean result = false;
				int rate = 0;
				rate = (int)random.nextInt(100);
				if(rate >= 71) { 
					result = true;
					
				StudyFinishBgm  StudyFinishBgm  = new StudyFinishBgm ();
				
		        try {
		        	StudyFinishBgm.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
				
				String studymember [] = {
						
						" ",
						"[면접스터디 조장] 오늘 면접스터디는 이것으로 마치겠습니다.",
						"[면접스터디 조장] 다들 고생하셨어요. ",
						"[면접스터디 조장] 더 하시고 싶으신 말씀 있으신가요? ",
						" "
				};
				
				for (int i = 0; i <studymember.length; i++) {
					try {
						Thread.sleep(500);
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}//0.5초마다 한 문장씩 출력
					System.out.println(studymember[i]);
				}

				// 결과에서 보듯이 한 쓰레드가 key(권한)를 얻어 출력을 시작하면 다른 쓰레드가 출력이 끝날때까지 대기했다가 key(권한)를 넘겨받아 자신이 가진 메세지를 출력하고 
				// 남아있는 쓰레드도 역시 출력이 끝날때까지 기다렸다가 본인이 가진 메세지를 key(권한)를 넘겨받은 후에야 출력을 한다. 
				// 예제에서는 쓰레드가 3개인 다중쓰레드를 작동하였는데 작업환경에 따라 어느 구문이 먼저 출력될지는 장담할수 없겠지만 
				// 어느 쓰레드건 출력을 시작했으면 처음부터 끝까지 그 구문은 완전하게 찍히는 것을 확인할수 있을 것이다.
				
				synchronized(key) { // synchronized(Test54.class) 가능
					
				// 자바에서 다중쓰레드가 공유하고 있는 자원을 어떤 쓰레드가 실행하고 있을때 다른 쓰레드는 접근하지 못하도록 막아주는 "보호막" 같은 장치가 바로 synchronized 라는 키워드다. 
				// 쓰는 방법은 쓰레드에서 보호막 치기를 원하는 부분을 { } 블록으로 감싸고1 그 위에 synchronized(레퍼런스) 라는 타이틀을 만들어주면 된다. 다시 코드로 표현하면 아래와 같이 될것이다.	
					
					StudyFinishGunBgm  StudyFinishGunBgm  = new StudyFinishGunBgm ();
					
			        try {
			        	StudyFinishGunBgm.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					
					String studymember1[] = {
							
							"[면접스터디원1] 저 후니씨한테 할 말 있어요. 후니씨, 스터디 준비 좀 신경 써주세요.",
							"[후니] 신경썼는데..",
							"후니의 자존감지수가 " + 1 + " 낮아졌습니다.",
							" "
							
					};
					
					for (int i = 0; i <studymember1.length; i++) {
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}//0.5초마다 한 문장씩 출력
						System.out.println(studymember1[i]);
					}

					후니.후니_자존감지수 -= 1;
					
					StudyFinishGunBgm  StudyFinishGunBgm2  = new StudyFinishGunBgm ();
					
			        try {
			        	StudyFinishGunBgm2.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					
					String studymember2[] = {
							
							
							"[면접스터디원2] 그런 정신으로는 하반기에 면접은 커녕 서류도 힘들거에요.",
							"[후니] 아 네..",
							"후니의 자존감지수가 " + 2 + " 낮아졌습니다.",
							" "
							
					};
					
					for (int i = 0; i <studymember2.length; i++) {
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}//0.5초마다 한 문장씩 출력
						System.out.println(studymember2[i]);
					}
					
					후니.후니_자존감지수 -= 2;
					
					StudyFinishGunBgm  StudyFinishGunBgm3  = new StudyFinishGunBgm ();
					
			        try {
			        	StudyFinishGunBgm3.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
			        
					String studymember3[] = {
							
							
							"[면접스터디원 3] 아니, 후니씨. 목소리 좀 더 키워요.",
							"[후니] 더 노력해볼게요..",
							"후니의 자존감지수가 " + 3 + " 낮아졌습니다.",
							" "
							
					};
					
					for (int i = 0; i <studymember3.length; i++) {
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}//0.5초마다 한 문장씩 출력
						System.out.println(studymember3[i]);
					}
				
					후니.후니_자존감지수 -= 3;
					NoAirInStudy  NoAirInStudy  = new NoAirInStudy ();
					
			        try {
			        	NoAirInStudy.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					
					
				}
				
				} return result;
			}
		}
			

