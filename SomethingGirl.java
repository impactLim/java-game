package game;

import java.util.Random;

public class SomethingGirl extends Thread { // ģô�� // �θ�԰� �Ļ� �� �̺�Ʈ
	
	static String message;
	static Object key = new Object(); 
	
	// ���������� �����忡�� ������ �ִ� �뵵�� ���� ���۷����� key��� ���ϰ� Object�� �̿��� ����� ���� �ִµ�
	// �� ������ ���� �����ϸ鼭 ���� ���� �ֵ��� �����ߵǹǷ� static�� �ٿ���.
	
	public void get(String girlMessage) {
		message = girlMessage;
		start();
	}

	
//	public void run() {
//
//
//		// ������� ������ �� �����尡 key(����)�� ��� ����� �����ϸ� �ٸ� �����尡 ����� ���������� ����ߴٰ� key(����)�� �Ѱܹ޾� �ڽ��� ���� �޼����� ����ϰ� 
//		// �����ִ� �����嵵 ���� ����� ���������� ��ٷȴٰ� ������ ���� �޼����� key(����)�� �Ѱܹ��� �Ŀ��� ����� �Ѵ�. 
//		// ���������� �����尡 3���� ���߾����带 �۵��Ͽ��µ� �۾�ȯ�濡 ���� ��� ������ ���� ��µ����� ����Ҽ� �������� 
//		// ��� ������� ����� ���������� ó������ ������ �� ������ �����ϰ� ������ ���� Ȯ���Ҽ� ���� ���̴�.
//		
//		synchronized(key) { // synchronized(Test54.class) ����
//			
//		// �ڹٿ��� ���߾����尡 �����ϰ� �ִ� �ڿ��� � �����尡 �����ϰ� ������ �ٸ� ������� �������� ���ϵ��� �����ִ� "��ȣ��" ���� ��ġ�� �ٷ� synchronized ��� Ű�����. 
//		// ���� ����� �����忡�� ��ȣ�� ġ�⸦ ���ϴ� �κ��� { } ������� ���ΰ� �� ���� synchronized(���۷���) ��� Ÿ��Ʋ�� ������ָ� �ȴ�. �ٽ� �ڵ�� ǥ���ϸ� �Ʒ��� ���� �ɰ��̴�.	
//			System.out.println(" ");
//			System.out.println(message);
//						�Ĵ�.�Ĵ�_��Ʈ�������� += 1;
//			System.out.println("�Ĵ��� ��Ʈ���������� " + 1 + " ���������ϴ�." );
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
			//��ü ������� ���ٰ�
			
			System.out.println("������ ������..");
			System.out.println("���ٿ� �ɾ��ִ� ���л��� ������ �ٰ��´�");
			System.out.println(" ");
				
		SomethingGirlComeBgm SomethingGirlComeBgm = new SomethingGirlComeBgm();
		
        try {
        	SomethingGirlComeBgm.LoadBgm();
             Thread.sleep(0);
        }catch(InterruptedException e) {
             e.printStackTrace();
        }
		

		
		String somegirlOne[] = {

				"[���л�] �����~ ",
				"[�Ĵ�] ��? ",
				"[���л�] �ٸ��� �ƴ϶� ���� ������ ����� �־�� ",
				"[�Ĵ�] �� �� �����ϼ���!",
				"[���л�] �繫���� ������ �� �򰥷�����. ����� ��������?",
				"[�Ĵ�] ��.. �װ� ���� ��ƴ��󱸿�.. �� �׷��� ģ�������� ����鼭 �����Ϸ� �߾��!",
				"[���л�] ��.. �׷��ñ���!",
				"[�Ĵ�] �� ��ȣ �˷��帱���? ���� �����غ���!",
				"[���л�] ���ƿ�! �ñ��Ѱ� ����� ���ҰԿ�!",

		};
		
		for (int i = 0; i <somegirlOne.length; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//0.5�ʸ��� �� ���徿 ���
			System.out.println(somegirlOne[i]);
			
			// ����Ҹ� ������
			// ���� ��ü ������� �ٽ� �Ѿ���
			
		}
		
        try {
			SomethingGirlComeBgm.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		�Ĵ�.�Ĵ�_���������� += 5;
		System.out.println("");
		System.out.println("�Ĵ��� ������������ " + 5 + " ���������ϴ�.");
		
		
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
