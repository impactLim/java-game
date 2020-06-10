package game;

import javax.swing.JOptionPane;
//input값이 들어가면 boolean변수 inputCheck값을 true로 바꿔준다.
// 10초 안에 입력한 값에 따라 자격증 취득여부 결정. 이에 따른 후니의 지수에 영향을 미친다.

public class ComputerInputThread extends Thread {
	public void run() {
		System.out.println(" ");
		System.out.println("10초 안에 주어진 질문에 대답하세요.");
		System.out.println("Can you use computer?");
		String userInput = JOptionPane.showInputDialog("Can you use computer?");
		String answer = "I can use computer!";
		Game.inputCheck = true; // >> 입력값이 들어오면 > 카운트다운이 멈추고
//		System.out.println("내가 입력한 값은 " + userInput);
		
		if(userInput.equals(answer)) {
			System.out.println(" ");
			
			System.out.println("내가 입력한 값은 " + userInput);
			System.out.println("정답입니다.");
			System.out.println("자격증을 취득했습니다.");
			
			LoadingBgm passBgm01 = new LoadingBgm();
	          
	        try {
	             passBgm01.LoadBgm();
	             Thread.sleep(0);
	        }catch(InterruptedException e) {
	             e.printStackTrace();
	        }
	        
			System.out.println(" ");
			컴퓨터자격증.후니의_서류지수_증가(10);
			컴퓨터자격증.후니의_체력지수_감소(10);
			컴퓨터자격증.후니의_스트레스지수_증가(10);
			컴퓨터자격증.후니의_자존감지수_증가(5);
			System.out.println(" ");

			후니.상태알림();
						
		}else {
			System.out.println(" ");
			System.out.println("내가 입력한 값은 " + userInput);
			System.out.println("틀렸습니다.");
			System.out.println("자격증을 취득하지 못했습니다.");
			System.out.println("두 달 동안 뭐함?");
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
			
		}
		
	}

}