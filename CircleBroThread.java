package game;

import java.util.Random;

public class CircleBroThread extends Thread { // ģô�� // �θ�԰� �Ļ� �� �̺�Ʈ
	
	static String message;
	static Object key = new Object(); 
	
	// ���������� �����忡�� ������ �ִ� �뵵�� ���� ���۷����� key��� ���ϰ� Object�� �̿��� ����� ���� �ִµ�
	// �� ������ ���� �����ϸ鼭 ���� ���� �ֵ��� �����ߵǹǷ� static�� �ٿ���.
	
	public void get(String girlMessage) {
		message = girlMessage;
		start();
	}

	public static boolean CircleBroCome() {
		
		
		
		Random random = new Random();
		boolean result = false;
		int rate = 0;
		rate = (int)random.nextInt(100);
		if(rate >= 81) { 
			result = true;
			//��ü ������� ���ٰ�
//			CircleBroBgm CircleBroBgm = new CircleBroBgm();
//		
//        try {
//        	CircleBroBgm.LoadBgm();
//             Thread.sleep(0);
//        }catch(InterruptedException e) {
//             e.printStackTrace();
//        }
			
			System.out.println("���� ������ ���Ƹ� Ȱ���� �� ������ ��Ǯ�̸� ������ �ֽ��ϴ�.");
			System.out.println("[���� �ٴϴ� ����] (���谡 �ĴϿ��� �ٰ��ɴϴ�.)");
			System.out.println(" ");
				
		
		String CircleBroCome[] = {

				"[���� �ٴϴ� ����] �ĴϾ� ����غ��ϴ��� ������??",
				"[���� �ٴϴ� ����] ����.. ���� ���� ������µ�",
				"[�Ĵ�] �ƴϿ��� ��! �������� �Ҹ� �մϴ�.. ����",
				"[���� �ٴϴ� ����] �׷��ٸ� �����̳� ���� ���� �� ������ ������ �����ϰ�!",
				"[�Ĵ�] �� ��! �����մϴ�!",
				"[���� �ٴϴ� ����] ��, ��. �Ĵ� ���� �� ����??",
				"[���� �ٴϴ� ����] ���� ���� �ٴϴ� ���࿡�� ������ ���ݻ�ǰ �ϳ� �ִµ� ��� ����?",
				"[�Ĵ�] ��, ��.."
				
		};
		
		for (int i = 0; i <CircleBroCome.length; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//0.5�ʸ��� �� ���徿 ���
			System.out.println(CircleBroCome[i]);
			
						
		}
		
		
		�Ĵ�.�Ĵ�_��Ʈ�������� += 5;
		System.out.println("");
		System.out.println("�Ĵ��� ��Ʈ���������� " + 5 + " ���������ϴ�.");
		
		
		// ������� ������ �� �����尡 key(����)�� ��� ����� �����ϸ� �ٸ� �����尡 ����� ���������� ����ߴٰ� key(����)�� �Ѱܹ޾� �ڽ��� ���� �޼����� ����ϰ� 
		// �����ִ� �����嵵 ���� ����� ���������� ��ٷȴٰ� ������ ���� �޼����� key(����)�� �Ѱܹ��� �Ŀ��� ����� �Ѵ�. 
		// ���������� �����尡 3���� ���߾����带 �۵��Ͽ��µ� �۾�ȯ�濡 ���� ��� ������ ���� ��µ����� ����Ҽ� �������� 
		// ��� ������� ����� ���������� ó������ ������ �� ������ �����ϰ� ������ ���� Ȯ���Ҽ� ���� ���̴�.
		
//		synchronized(key) { // synchronized(Test54.class) ����
//			
//		// �ڹٿ��� ���߾����尡 �����ϰ� �ִ� �ڿ��� � �����尡 �����ϰ� ������ �ٸ� ������� �������� ���ϵ��� �����ִ� "��ȣ��" ���� ��ġ�� �ٷ� synchronized ��� Ű�����. 
//		// ���� ����� �����忡�� ��ȣ�� ġ�⸦ ���ϴ� �κ��� { } ������� ���ΰ� �� ���� synchronized(���۷���) ��� Ÿ��Ʋ�� ������ָ� �ȴ�. �ٽ� �ڵ�� ǥ���ϸ� �Ʒ��� ���� �ɰ��̴�.	
//
//			String sister[] = {
//					
//					" ",
//					"[���̵���] ����~~~ �� ���¾�??! ���� ��� ����",
//					"�Ĵ��� ��Ʈ���������� " + 1 + " ���������ϴ�."
//					
//			};
//			
//			for (int i = 0; i <sister.length; i++) {
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}//0.5�ʸ��� �� ���徿 ���
//				System.out.println(sister[i]);
//			}
//
//			�Ĵ�.�Ĵ�_��Ʈ�������� += 1;
//			
//			String uncle[] = {
//					
//					" ",
//					"[�̸��] �ĴϾ� �������̴�! ���� ���л��ΰ�?",
//					"�Ĵ��� ��Ʈ���������� " + 1 + " ���������ϴ�."
//					
//			};
//			
//			for (int i = 0; i <uncle.length; i++) {
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}//0.5�ʸ��� �� ���徿 ���
//				System.out.println(uncle[i]);
//			}
//			
//			�Ĵ�.�Ĵ�_��Ʈ�������� += 1;
//			
//			String aunt[] = {
//					
//					" "	,
//					"[�̸�] �Ĵ� ���� ��� ������? ����� ���� �Ϸ���? �������� ������ ���� ����?",
//					"�Ĵ��� ��Ʈ���������� " + 1 + " ���������ϴ�."
//					
//			};
//			
//			for (int i = 0; i <aunt.length; i++) {
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}//0.5�ʸ��� �� ���徿 ���
//				System.out.println(aunt[i]);
//			}
//		
//			�Ĵ�.�Ĵ�_��Ʈ�������� += 1;
//			
//		}
		
		} return result;
	}
}
