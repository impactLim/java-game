package game;

//�ڽľ����� �� for ���� ���鼭 10���� -1�� �ϴ°ǵ� static inputCheck���� üũ�ؼ� ���� true�ٲ�� �� �̻� ���� �ʴ´�.
//�� Ŭ���� ������ ������ ī��Ʈ�ٿ��� ���̴�.

public class ComputerCountdownThread extends Thread {

	public void run() {
		for(int i = 10; i >0; i--) {
			
			if(Game.inputCheck) return;  // �Է°��� ������ ������ ���� IF���� return���� �ʰ� ���ڰ� ��� �۾��� > �ƹ��͵� �������ߴٰ� ���.
										 // �Է°��� ������  inputcheck���� true�� �Ǹ�
			System.out.println(i);		// ��ǲ �Է°� �����忡�� ���� �����ݴϴ�.
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
		
		��ǻ���ڰ���.�Ĵ���_ü������_����(10);
		��ǻ���ڰ���.�Ĵ���_��Ʈ��������_����(10);
		��ǻ���ڰ���.�Ĵ���_����������_����(10);
		System.out.println(" ");

		�Ĵ�.���¾˸�();
//		System.out.println("�ڰ����� ������� ���߽��ϴ�.");
//		System.exit(0);
	}
	
}