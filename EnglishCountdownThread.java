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
		System.out.println("아무것도 적지 못했습니다.");
		System.out.println("시험을 왜 보러 갔습니까?");
		System.out.println("팩트폭격");
		System.out.println(" ");
		
		StudyFinishGunBgm  StudyFinishGunBgm  = new StudyFinishGunBgm ();
		
        try {
        	StudyFinishGunBgm.LoadBgm();
             Thread.sleep(0);
        }catch(InterruptedException e) {
             e.printStackTrace();
        }
        
		어학자격증.후니의_체력지수_감소(10);
		어학자격증.후니의_스트레스지수_증가(10);
		어학자격증.후니의_자존감지수_감소(10);
		System.out.println(" ");

		후니.상태알림();

//		System.out.println("자격증을 취득하지 못했습니다.");
//		System.exit(0);

	}
	
}
