package game;

//자식쓰레드 중 for 문을 돌면서 10부터 -1을 하는건데 static inputCheck값을 체크해서 값이 true바뀌면 더 이상 직지 않는다.
//이 클래스 역할은 일종의 카운트다운인 셈이다.

public class ComputerCountdownThread extends Thread {

	public void run() {
		for(int i = 10; i >0; i--) {
			
			if(Game.inputCheck) return;  // 입력값이 들어오지 않으면 값이 IF절이 return되지 않고 숫자가 계속 작아짐 > 아무것도 적지못했다고 뜬다.
										 // 입력값이 들어오면  inputcheck값이 true로 되며
			System.out.println(i);		// 인풋 입력값 쓰레드에서 값을 비교해줍니다.
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
		
		컴퓨터자격증.후니의_체력지수_감소(10);
		컴퓨터자격증.후니의_스트레스지수_증가(10);
		컴퓨터자격증.후니의_자존감지수_감소(10);
		System.out.println(" ");

		후니.상태알림();
//		System.out.println("자격증을 취득하지 못했습니다.");
//		System.exit(0);
	}
	
}