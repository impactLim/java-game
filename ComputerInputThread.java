package game;

import javax.swing.JOptionPane;
//input���� ���� boolean���� inputCheck���� true�� �ٲ��ش�.
// 10�� �ȿ� �Է��� ���� ���� �ڰ��� ��濩�� ����. �̿� ���� �Ĵ��� ������ ������ ��ģ��.

public class ComputerInputThread extends Thread {
	public void run() {
		System.out.println(" ");
		System.out.println("10�� �ȿ� �־��� ������ ����ϼ���.");
		System.out.println("Can you use computer?");
		String userInput = JOptionPane.showInputDialog("Can you use computer?");
		String answer = "I can use computer!";
		Game.inputCheck = true; // >> �Է°��� ������ > ī��Ʈ�ٿ��� ���߰�
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
			��ǻ���ڰ���.�Ĵ���_��������_����(10);
			��ǻ���ڰ���.�Ĵ���_ü������_����(10);
			��ǻ���ڰ���.�Ĵ���_��Ʈ��������_����(10);
			��ǻ���ڰ���.�Ĵ���_����������_����(5);
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
	        
			��ǻ���ڰ���.�Ĵ���_ü������_����(10);
			��ǻ���ڰ���.�Ĵ���_��Ʈ��������_����(10);
			��ǻ���ڰ���.�Ĵ���_����������_����(10);
			System.out.println(" ");

			�Ĵ�.���¾˸�();
			
		}
		
	}

}