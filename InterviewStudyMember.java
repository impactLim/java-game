package game;

import java.util.Random;



public class InterviewStudyMember extends Thread {
		
		// ��� �����尡 ���� �۵��ҷ����� ������ �̿� �۵������� ó������ ������ ������ �ӹ�(��� �޼���)�� �ϼ��ϵ��� ������ �ο��ϴ� ���� ����ȭ(Synchronization)�� �Ҽ� �ְڴµ� ����ȭ��� ����ü�� ������� ���� �ָԴ°� ����. 
		// ���ڴ� ����ȭ��� ǥ�����ٴ� ��ȣ���̶�� ǥ���� synchronization�� �����ϴµ� �� ������ �ɲ��� �����Ѵ�.
		
		// �ڹٿ��� ���߾����尡 �����ϰ� �ִ� �ڿ��� � �����尡 �����ϰ� ������ �ٸ� ������� �������� ���ϵ��� �����ִ� "��ȣ��" ���� ��ġ�� �ٷ� synchronized ��� Ű�����. 
		// ���� ����� �����忡�� ��ȣ�� ġ�⸦ ���ϴ� �κ��� { } ������� ���ΰ� �� ���� synchronized(���۷���) ��� Ÿ��Ʋ�� ������ָ� �ȴ�. �ٽ� �ڵ�� ǥ���ϸ� �Ʒ��� ���� �ɰ��̴�.
		
		static String InterviewFeeback;
		static Object key = new Object(); 
		
		// ���������� �����忡�� ������ �ִ� �뵵�� ���� ���۷����� key��� ���ϰ� Object�� �̿��� ����� ���� �ִµ�
		// �� ������ ���� �����ϸ鼭 ���� ���� �ֵ��� �����ߵǹǷ� static�� �ٿ���.
		
		
//		public void run() {
		//
		//
//				// ������� ������ �� �����尡 key(����)�� ��� ����� �����ϸ� �ٸ� �����尡 ����� ���������� ����ߴٰ� key(����)�� �Ѱܹ޾� �ڽ��� ���� �޼����� ����ϰ� 
//				// �����ִ� �����嵵 ���� ����� ���������� ��ٷȴٰ� ������ ���� �޼����� key(����)�� �Ѱܹ��� �Ŀ��� ����� �Ѵ�. 
//				// ���������� �����尡 3���� ���߾����带 �۵��Ͽ��µ� �۾�ȯ�濡 ���� ��� ������ ���� ��µ����� ����Ҽ� �������� 
//				// ��� ������� ����� ���������� ó������ ������ �� ������ �����ϰ� ������ ���� Ȯ���Ҽ� ���� ���̴�.
//				
//				synchronized(key) { // synchronized(Test54.class) ����
//					
//				// �ڹٿ��� ���߾����尡 �����ϰ� �ִ� �ڿ��� � �����尡 �����ϰ� ������ �ٸ� ������� �������� ���ϵ��� �����ִ� "��ȣ��" ���� ��ġ�� �ٷ� synchronized ��� Ű�����. 
//				// ���� ����� �����忡�� ��ȣ�� ġ�⸦ ���ϴ� �κ��� { } ������� ���ΰ� �� ���� synchronized(���۷���) ��� Ÿ��Ʋ�� ������ָ� �ȴ�. �ٽ� �ڵ�� ǥ���ϸ� �Ʒ��� ���� �ɰ��̴�.	
//					System.out.println(" ");
//					System.out.println(message);
//								�Ĵ�.�Ĵ�_��Ʈ�������� += 1;
//					System.out.println("�Ĵ��� ��Ʈ���������� " + 1 + " ���������ϴ�." );
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
						"[�������͵� ����] ���� �������͵�� �̰����� ��ġ�ڽ��ϴ�.",
						"[�������͵� ����] �ٵ� ����ϼ̾��. ",
						"[�������͵� ����] �� �Ͻð� ������ ���� �����Ű���? ",
						" "
				};
				
				for (int i = 0; i <studymember.length; i++) {
					try {
						Thread.sleep(500);
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}//0.5�ʸ��� �� ���徿 ���
					System.out.println(studymember[i]);
				}

				// ������� ������ �� �����尡 key(����)�� ��� ����� �����ϸ� �ٸ� �����尡 ����� ���������� ����ߴٰ� key(����)�� �Ѱܹ޾� �ڽ��� ���� �޼����� ����ϰ� 
				// �����ִ� �����嵵 ���� ����� ���������� ��ٷȴٰ� ������ ���� �޼����� key(����)�� �Ѱܹ��� �Ŀ��� ����� �Ѵ�. 
				// ���������� �����尡 3���� ���߾����带 �۵��Ͽ��µ� �۾�ȯ�濡 ���� ��� ������ ���� ��µ����� ����Ҽ� �������� 
				// ��� ������� ����� ���������� ó������ ������ �� ������ �����ϰ� ������ ���� Ȯ���Ҽ� ���� ���̴�.
				
				synchronized(key) { // synchronized(Test54.class) ����
					
				// �ڹٿ��� ���߾����尡 �����ϰ� �ִ� �ڿ��� � �����尡 �����ϰ� ������ �ٸ� ������� �������� ���ϵ��� �����ִ� "��ȣ��" ���� ��ġ�� �ٷ� synchronized ��� Ű�����. 
				// ���� ����� �����忡�� ��ȣ�� ġ�⸦ ���ϴ� �κ��� { } ������� ���ΰ�1 �� ���� synchronized(���۷���) ��� Ÿ��Ʋ�� ������ָ� �ȴ�. �ٽ� �ڵ�� ǥ���ϸ� �Ʒ��� ���� �ɰ��̴�.	
					
					StudyFinishGunBgm  StudyFinishGunBgm  = new StudyFinishGunBgm ();
					
			        try {
			        	StudyFinishGunBgm.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					
					String studymember1[] = {
							
							"[�������͵��1] �� �ĴϾ����� �� �� �־��. �ĴϾ�, ���͵� �غ� �� �Ű� ���ּ���.",
							"[�Ĵ�] �Ű��µ�..",
							"�Ĵ��� ������������ " + 1 + " ���������ϴ�.",
							" "
							
					};
					
					for (int i = 0; i <studymember1.length; i++) {
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}//0.5�ʸ��� �� ���徿 ���
						System.out.println(studymember1[i]);
					}

					�Ĵ�.�Ĵ�_���������� -= 1;
					
					StudyFinishGunBgm  StudyFinishGunBgm2  = new StudyFinishGunBgm ();
					
			        try {
			        	StudyFinishGunBgm2.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					
					String studymember2[] = {
							
							
							"[�������͵��2] �׷� �������δ� �Ϲݱ⿡ ������ Ŀ�� ������ ����ſ���.",
							"[�Ĵ�] �� ��..",
							"�Ĵ��� ������������ " + 2 + " ���������ϴ�.",
							" "
							
					};
					
					for (int i = 0; i <studymember2.length; i++) {
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}//0.5�ʸ��� �� ���徿 ���
						System.out.println(studymember2[i]);
					}
					
					�Ĵ�.�Ĵ�_���������� -= 2;
					
					StudyFinishGunBgm  StudyFinishGunBgm3  = new StudyFinishGunBgm ();
					
			        try {
			        	StudyFinishGunBgm3.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
			        
					String studymember3[] = {
							
							
							"[�������͵�� 3] �ƴ�, �ĴϾ�. ��Ҹ� �� �� Ű����.",
							"[�Ĵ�] �� ����غ��Կ�..",
							"�Ĵ��� ������������ " + 3 + " ���������ϴ�.",
							" "
							
					};
					
					for (int i = 0; i <studymember3.length; i++) {
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}//0.5�ʸ��� �� ���徿 ���
						System.out.println(studymember3[i]);
					}
				
					�Ĵ�.�Ĵ�_���������� -= 3;
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
			

