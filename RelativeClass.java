package game;

import java.util.Random;

public class RelativeClass extends Thread { // ģô�� // �θ�԰� �Ļ� �� �̺�Ʈ
	
	static String message;
	static Object key = new Object(); 
	
	// ���������� �����忡�� ������ �ִ� �뵵�� ���� ���۷����� key��� ���ϰ� Object�� �̿��� ����� ���� �ִµ�
	// �� ������ ���� �����ϸ鼭 ���� ���� �ֵ��� �����ߵǹǷ� static�� �ٿ���.
	
	public void get(String relativeMessage) {
		message = relativeMessage;
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
	
	public static boolean RelativeCome() {
		
		Random random = new Random();
		boolean result = false;
		int rate = 0;
		rate = (int)random.nextInt(100);
		if(rate >= 51) { 
			result = true;
			
		DoorBellBgm DoorBellBgm = new DoorBellBgm();
		
        try {
        	 DoorBellBgm.LoadBgm();
             Thread.sleep(0);
        }catch(InterruptedException e) {
             e.printStackTrace();
        }
		
		String parents2[] = {
				
				" ",
				"[��~]",
				"[�Ĵ�] �ù��ΰ�? ",
				"[�θ��] �� �´� ���� �̸�� ���� ��� �鸥���",
				"[�Ĵ�] �� ��.. �̸� ���� �� ���ֽ���..",
				"[�Ĵ�] (�� ���� ����.)",
				
		};
		
		for (int i = 0; i <parents2.length; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//0.5�ʸ��� �� ���徿 ���
			System.out.println(parents2[i]);
		}

		// ������� ������ �� �����尡 key(����)�� ��� ����� �����ϸ� �ٸ� �����尡 ����� ���������� ����ߴٰ� key(����)�� �Ѱܹ޾� �ڽ��� ���� �޼����� ����ϰ� 
		// �����ִ� �����嵵 ���� ����� ���������� ��ٷȴٰ� ������ ���� �޼����� key(����)�� �Ѱܹ��� �Ŀ��� ����� �Ѵ�. 
		// ���������� �����尡 3���� ���߾����带 �۵��Ͽ��µ� �۾�ȯ�濡 ���� ��� ������ ���� ��µ����� ����Ҽ� �������� 
		// ��� ������� ����� ���������� ó������ ������ �� ������ �����ϰ� ������ ���� Ȯ���Ҽ� ���� ���̴�.
		
		synchronized(key) { // synchronized(Test54.class) ����
			
		// �ڹٿ��� ���߾����尡 �����ϰ� �ִ� �ڿ��� � �����尡 �����ϰ� ������ �ٸ� ������� �������� ���ϵ��� �����ִ� "��ȣ��" ���� ��ġ�� �ٷ� synchronized ��� Ű�����. 
		// ���� ����� �����忡�� ��ȣ�� ġ�⸦ ���ϴ� �κ��� { } ������� ���ΰ� �� ���� synchronized(���۷���) ��� Ÿ��Ʋ�� ������ָ� �ȴ�. �ٽ� �ڵ�� ǥ���ϸ� �Ʒ��� ���� �ɰ��̴�.	

			String sister[] = {
					
					" ",
					"[���̵���] ����~~~ �� ���¾�??! ���� ��� ����",
					"�Ĵ��� ��Ʈ���������� " + 1 + " ���������ϴ�."
					
			};
			
			for (int i = 0; i <sister.length; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//0.5�ʸ��� �� ���徿 ���
				System.out.println(sister[i]);
			}

			�Ĵ�.�Ĵ�_��Ʈ�������� += 1;
			
			String uncle[] = {
					
					" ",
					"[�̸��] �ĴϾ� �������̴�! ���� ���л��ΰ�?",
					"�Ĵ��� ��Ʈ���������� " + 2 + " ���������ϴ�."
					
			};
			
			for (int i = 0; i <uncle.length; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//0.5�ʸ��� �� ���徿 ���
				System.out.println(uncle[i]);
			}
			
			�Ĵ�.�Ĵ�_��Ʈ�������� += 2;
			
			String aunt[] = {
					
					" "	,
					"[�̸�] �Ĵ� ���� ��� ������? ����� ���� �Ϸ���? �������� ������ ���� ����?",
					"�Ĵ��� ��Ʈ���������� " + 3 + " ���������ϴ�."
					
			};
			
			for (int i = 0; i <aunt.length; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//0.5�ʸ��� �� ���徿 ���
				System.out.println(aunt[i]);
			}
		
			�Ĵ�.�Ĵ�_��Ʈ�������� += 3;
			
		}
		
		} return result;
	}
}
	

