package game;

public class EnglishCountdownThread extends Thread {

	public void run() {
		for(int i = 10; i >0; i--) {
			
			if(Game.inputCheck) return;
			
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(" ");
		System.out.println("�ƹ��͵� ���� ���߽��ϴ�.");
		System.out.println("������ �� ���� �����ϱ�?");
		System.out.println("��Ʈ����");
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

//		System.out.println("�ڰ����� ������� ���߽��ϴ�.");
//		System.exit(0);

	}
	
}
