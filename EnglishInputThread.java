package game;

import javax.swing.JOptionPane;
//input���� ���� boolean���� inputCheck���� true�� �ٲ��ش�.

public class EnglishInputThread extends Thread {
	public void run() {
		System.out.println(" ");
		System.out.println("10�� �ȿ� �־��� ������ ����ϼ���.");
		System.out.println("Can you speak English?");
		String userInput = JOptionPane.showInputDialog("Can you speak English?");
		String answer = "I can speak English!";
		Game.inputCheck = true;
//		System.out.println("���� �Է��� ���� " + userInput);
		
		if(userInput.equals(answer)) {
			System.out.println(" ");
			
			System.out.println("���� �Է��� ���� " + userInput);
			System.out.println("�����Դϴ�.");
			System.out.println("�ڰ����� ����߽��ϴ�.");
			
			LoadingBgm passBgm01 = new LoadingBgm();
	          
	        try {
	             passBgm01.LoadBgm();
	             Thread.sleep(0);
	        }catch(InterruptedException e) {
	             e.printStackTrace();
	        }
			
			System.out.println(" ");
			�����ڰ���.�Ĵ���_��������_����(10);
			�����ڰ���.�Ĵ���_ü������_����(10);
			�����ڰ���.�Ĵ���_��Ʈ��������_����(10);
			�����ڰ���.�Ĵ���_����������_����(10);
			System.out.println(" ");

			�Ĵ�.���¾˸�();
						
		}else {
			System.out.println(" ");
			System.out.println("���� �Է��� ���� " + userInput);
			System.out.println("Ʋ�Ƚ��ϴ�.");
			System.out.println("�ڰ����� ������� ���߽��ϴ�.");
			System.out.println("�� �� ���� ����?");
			System.out.println(" ");

			StudyFinishGunBgm  StudyFinishGunBgm  = new StudyFinishGunBgm ();
			
	        try {
	        	StudyFinishGunBgm.LoadBgm();
	             Thread.sleep(0);
	        }catch(InterruptedException e) {
	             e.printStackTrace();
	        }
			
			�����ڰ���.�Ĵ���_ü������_����(10);
			�����ڰ���.�Ĵ���_��Ʈ��������_����(10);
			�����ڰ���.�Ĵ���_����������_����(10);
			System.out.println(" ");

			�Ĵ�.���¾˸�();
			
		}
		
	}

}
