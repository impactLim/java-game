package game;

import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
//import game.BankHuman.쿡민은행인사팀;
//import game.BankHuman.한쿡은행인사팀;
//import game.BankHuman.까까오뱅크인사팀;

public class Game { //여기선 실행만 // 여기서 클래스를 가져올 수도 있고 객체를 가져올 수도 있다.
	
	public static boolean inputCheck = false; // 내가 입력해주기 전까지 false여야 카운트다운이 계속 되니까 false로.
	
	public static void main(String[] args) throws InterruptedException { // main()메소드는 자바 파일을 컴파일 하고 실행할 때, 실제로 실행되는 메소드입니다.
		
		Scanner scan = new Scanner(System.in);
			
        System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■ GAME START ■■■■■■■■■■■■■■■■■■■■■■■■"); // main 흐름
        
        //로딩브금
	   	LoadingBgm LoadingBgm = new LoadingBgm();
          
        try {
             LoadingBgm.LoadBgm();
             Thread.sleep(0);
        }catch(InterruptedException e) {
             e.printStackTrace();
        }
        
        //뱅크로딩
	    String BANK[] = { // 타이핑 쓰레드 - 익명 클래스
	            "______   ___   _   _  _   __",    
	            "| ___ \\ / _ \\ | \\ | || | / /",
	            "| |_/ // /_\\ \\|  \\| || |/ /",
	            "| ___ \\|  _  || . ` ||    \\ ",
	            "| |_/ /| | | || |\\  || |\\  \\",
	            "\\____/ \\_| |_/\\_| \\_/\\_| \\_/"
		     
	    };

        
	    for (int i = 0; i < BANK.length; i++) {
		      // 초 간 중지한다
		      Thread.sleep(450);
		      // 메세지를 출력한다
		      System.out.println(BANK[i]);
		}                            
	    
  
	    
		System.out.println("은행 뽀개기");
		System.out.println("                         Loading...");
		
		LoadingThread LoadingThread = new LoadingThread("■■■■");
		LoadingThread.start(); // 로딩바
		LoadingThread.join();

		// start 메서드는 쓰레드가 실행준비를 하게 한다. 
		int 게임설명;
		
		byte 필요하다 = 1;
		byte 필요없다 = 2;
		
		후니 후니 = new 후니();
		후니.이름 = "후니";
		후니.나이 = 25;

//		게임설명 = scan.nextInt();	
		
		BackgroundBgm BackgroundBgm = new BackgroundBgm();
		BackgroundBgm.start();


		
		while (true) {
			
			게임설명 = scan.nextInt();	
			
			Buttonbgm ButtonBgm = new Buttonbgm();
			
	        try {
	        	 ButtonBgm.LoadBgm();
	             Thread.sleep(0);
	        }catch(InterruptedException e) {
	             e.printStackTrace();
	        }
			
			if (게임설명 == 1) {
	
				System.out.println("===========================================================");
				//로딩 타이핑쓰레드
			    String introduce[] = { 
						"후니는 대학교3학년을 끝내고 겨울방학을 맞았습니다.",
						"이제 4학년인데 이번 겨울방학부터 취업준비를 해야할 것 같습니다.",
						"평소에 금융권에 관심이 있어 은행을 가자고 결심합니다.",
						"짭꼬리아에서 은행들을 확인합니다.",
						"-----------------------------------------------------------",
						"국책은행인 한쿡은행, 시중은행인 쿡민은행, 인터넷은행인 까까오뱅크가 눈에 띕니다.", 
						"후니는 이 중에서 목표은행을 설정할 수 있습니다.",
						"선택한 은행의 하반기 채용에 합격하면 됩니다.",
						"합격하기 위해선 선택한 은행이 요구하는 서류지수, 필기지수, 면접지수를 넘겨야 합니다.",
						"각 지수의 최대치는 100입니다.",
						"은행을 선택해주세요." 
			    };

			    for (int i = 0; i < introduce.length; i++) {
			      // 1.5초 간 중지한다
			      Thread.sleep(500);
			      // 메세지를 출력한다
			      System.out.println(introduce[i]);
			    }
				
					break;
				
			} else { // 2번 턴 5번 반복 후 게임자동실행되도록 하는 기능 생각해보기!

				
				System.out.println("게임설명 보시는게 나아요!");
				System.out.println("게임설명이 필요하십니까?");	
				System.out.println("1. 필요하다 2. 필요없다");
			}
			
		}
		
		System.out.println("===========================================================");
		System.out.println("	 	  1번		  2번		   3번");
		System.out.println("	 	한쿡은행		쿡민은행		  까까오뱅크");
		System.out.println("서류지수커트라인  |     75		  75		   50");
		System.out.println("필기지수커트라인  |    100		  75		   50");
		System.out.println("면접지수커트라인  |     50		  75		  100");
		System.out.println("신입사원초임연봉  |   4000만원		4500만원		 3500만원");
		System.out.println("     워 라 밸          |     좋다		   낮다		     보통");
		System.out.println(" ");
		System.out.println("※ 본 게임 제작자가 임의로 설정한 가상정보입니다. 현실과 관련 없습니다. ※");
		System.out.println("===========================================================");

		
		BankHuman 한쿡은행인사팀 = new BankHuman();
		BankHuman 쿡민은행인사팀 = new BankHuman();
		BankHuman 까까오뱅크인사팀 = new BankHuman();
		
		한쿡은행인사팀.은행이름 = "한쿡은행";
		한쿡은행인사팀.서류지수_커트라인 = 75;
		한쿡은행인사팀.필기지수_커트라인 = 100;
		한쿡은행인사팀.면접지수_커트라인 = 50;
		한쿡은행인사팀.신입사원_초봉 = "4000만원";
		한쿡은행인사팀.워라밸 = "좋다";
		
		
		쿡민은행인사팀.은행이름 = "쿡민은행";
		쿡민은행인사팀.서류지수_커트라인 = 75;
		쿡민은행인사팀.필기지수_커트라인 = 75;
		쿡민은행인사팀.면접지수_커트라인 = 75;
		쿡민은행인사팀.신입사원_초봉 = "4500만원";
		쿡민은행인사팀.워라밸 = "낮다";

		
		까까오뱅크인사팀.은행이름 = "까까오뱅크";
		까까오뱅크인사팀.서류지수_커트라인 = 50;
		까까오뱅크인사팀.필기지수_커트라인 = 50;
		까까오뱅크인사팀.면접지수_커트라인 = 100;
		까까오뱅크인사팀.신입사원_초봉 = "3500만원";
		까까오뱅크인사팀.워라밸 = "보통";
		
		
		int 은행선택 = scan.nextInt();
		
		if ( 은행선택 == 1) {
			Buttonbgm ButtonBgm = new Buttonbgm();
			
	        try {
	        	 ButtonBgm.LoadBgm();
	             Thread.sleep(0);
	        }catch(InterruptedException e) {
	             e.printStackTrace();
	        }
	        
        
			System.out.println("[후니] 좋아! 한쿡은행 가보자!");
			System.out.println("===========================================================");
			System.out.println("한쿡은행 요구 서류지수 : " + 한쿡은행인사팀.서류지수_커트라인);
			System.out.println("한쿡은행 요구 필기지수 : " + 한쿡은행인사팀.필기지수_커트라인);
			System.out.println("한쿡은행 요구 면접지수 : " + 한쿡은행인사팀.면접지수_커트라인);
			System.out.println("===========================================================");	
			
			후니.후니_서류지수 = 0; 후니.후니_필기지수 = 0; 후니.후니_면접지수 = 0;
			후니.후니_체력지수 = 90; 후니.후니_자존감지수 = 90; 후니.후니_스트레스지수 = 10;
			
			후니.상태알림();

			System.out.println("===========================================================");
			System.out.println("[후니] 어랏? 체력지수, 자존감지수, 스트레스지수가 뭐지?");
			System.out.println("팁을 확인하시려면 1번, 무시하시려면 2번");
			
			int 게임지수팁 = scan.nextInt();
			
			if ( 게임지수팁 == 1) {
				Buttonbgm ButtonBgm2 = new Buttonbgm();
				
		        try {
		        	 ButtonBgm2.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
				System.out.println("===========================================================");
				System.out.println("각 지수의 최대치는 100이며 100을 초과하거나 0 미만이 될 수 없습니다.");
				System.out.println("체력지수는 90으로 시작되며 0이 되면 게임종료입니다.");
				System.out.println("자존감지수는 90으로 시작되며 0이 되면 게임종료입니다.");
				System.out.println("스트레스지수는 10으로 시작되며 100이 되면 게임종료입니다.");
				System.out.println(" ");
				System.out.println("체력지수가 1~20, 자존감지수가 1~20, 스트레스지수가 80~99일 때 경고창이 뜹니다.");		
				System.out.println("취준은 마라톤입니다.");
				System.out.println("각 지수들을 잘 관리하는게 취업의 핵심입니다.");
				System.out.println("===========================================================");
						
				}else{
					Buttonbgm ButtonBgm2 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm2.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					System.out.println("===========================================================");
			}		
			
			System.out.println("[후니] 후.. 쉽지 않군.");
			System.out.println("[후니] 그래도 열심히 해봐야지. 취업준비를 시작해볼까?"); // 1번 활동, 2번 상태확인, 3번 메인메뉴

		
			
			while (true) {
				Buttonbgm ButtonBgm5 = new Buttonbgm();
				
		        try {
		        	 ButtonBgm5.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
				System.out.println(" ");
				System.out.println("< 메인메뉴 > ");
				System.out.println("1. 활동"); // 1번 활동, 2번 상태확인, 3번 취준포기
				System.out.println("2. 상태확인");
				System.out.println("3. 겨울방학 취준포기");
				System.out.println(" ");

				int 메인메뉴선택창 = scan.nextInt();
				
				if ( 메인메뉴선택창 == 1) {
					
					
					if (true) {
						Buttonbgm ButtonBgm2 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm2.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println(" ");
						System.out.println("겨울방학입니다. 겨울방학엔 자격증을 취득할 수 있습니다.");
						System.out.println("무엇을 취득하시겠습니까?");
						System.out.println("1. 컴퓨터자격증 ");
						System.out.println("2. 어학자격증");
						System.out.println("3. 금융자격증");
						System.out.println("4. 뒤로가기");
						System.out.println(" ");
						
						int 겨울방학선택창 = scan.nextInt(); // 70% 확률로 자격증 취득

					    if (겨울방학선택창 == 1) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
					    	컴퓨터자격증 컴퓨터자격증 = new 컴퓨터자격증 ();// 컴퓨터자격증클래스에서 컴퓨터자격증 객체를 만들어줬다.
							컴퓨터자격증.스펙이름 = "컴퓨터자격증";
					    	
					    	System.out.println("컴퓨터 자격증은 기본이지!!");
							System.out.println("컴퓨터자격증 시험에 응시했습니다.");
							
							// 5초 동안 input패털에 값을 입력하지 않았을 때 게임실패
							// 이를 위해 메인메소드가 있는 클래스에 inputCheck라는 static boolean값 생성
							
							ComputerInputThread ComputerInputThread = new ComputerInputThread();
							ComputerCountdownThread ComputerCountdownThread = new ComputerCountdownThread(); 
							
							ComputerInputThread.start(); //값을 처리
							ComputerCountdownThread.start(); //카운트다운을 처리
							ComputerCountdownThread.join();
							
							
							break;
					    
					    }else if(겨울방학선택창 == 2) {
							Buttonbgm ButtonBgm1 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm1.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							어학자격증 어학자격증 = new 어학자격증 ();
							어학자격증.스펙이름 = "어학자격증";
					    	
					    	System.out.println("혹시 모르니 어학자격증 하나는 따놓자!!!");
							System.out.println("어학자격증 시험에 응시했습니다.");
							
							// 5초 동안 input패털에 값을 입력하지 않았을 때 게임실패
							// 이를 위해 메인메소드가 있는 클래스에 inputCheck라는 static boolean값 생성
							
							EnglishInputThread EnglishInputThread = new EnglishInputThread();
							EnglishCountdownThread EnglishCountdownThread = new EnglishCountdownThread(); 
							
							EnglishInputThread.start();
							EnglishCountdownThread.start();
							EnglishCountdownThread.join();
							
					    	

							break;
							
					    }else if(겨울방학선택창 == 3) {
							Buttonbgm ButtonBgm1 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm1.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							금융자격증 금융자격증 = new 금융자격증 ();
							금융자격증.스펙이름 = "금융자격증";
					    	
							System.out.println("금융권 준비하는데 금융자격증은 기본이지!!");
							System.out.println("금융자격증 시험에 응시했습니다.");
							
							// 10초 동안 input에 값을 입력하지 않았을 때 게임실패
							// 이를 위해 메인메소드가 있는 클래스에 inputCheck라는 static boolean값 생성
							
							FinanceInputThread FinanceInputThread = new FinanceInputThread();
							FinanceCountdownThread FinanceCountdownThread = new FinanceCountdownThread(); 
							
							FinanceInputThread.start();
							FinanceCountdownThread.start();
							FinanceCountdownThread.join();
							
					    							
							break;
							
					    }else if(겨울방학선택창 == 4) {
							Buttonbgm ButtonBgm1 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm1.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
					    	continue;
					    }else {
							Buttonbgm ButtonBgm1 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm1.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println("다시 입력하세요.");
					    	continue;
					    }
					    
					}
					
				}else if(메인메뉴선택창 == 2){
					Buttonbgm ButtonBgm1 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm1.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					후니.상태알림();
					
				}else if(메인메뉴선택창 == 3) {
					Buttonbgm ButtonBgm1 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm1.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }	
					System.out.println("겨울방학 취준을 포기하시겠습니까?");
					System.out.println("1. 네");
					System.out.println("2. 아니오");
					
					
					int 취준포기선택창 = scan.nextInt();
					
					if(취준포기선택창 ==1) {
						Buttonbgm ButtonBgm2 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm2.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
				        System.out.println("겨울방학 취업준비를 포기했습니다.");
						
						break;

					}else if(취준포기선택창 == 2) {
						Buttonbgm ButtonBgm2 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm2.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						continue;
					}else {
						Buttonbgm ButtonBgm2 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm2.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println("다시 입력하세요."); // 취준을 포기하시겟습니까?가 뜨도록. 맨처음 메인메뉴창이 아니라.
						continue; 						   // 이 if문을 while문 안에 넣게 되면 취준포기선택창 == 2가 1.활동 2. 상태확인 3. 취준포기가 나와야
					}
					
					
				}else {
					Buttonbgm ButtonBgm1 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm1.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					System.out.println("다시 입력하세요.");
					continue;
				}
				
			}	
					
			System.out.println("겨울방학이 끝나고,");
			System.out.println("4학년 1학기가 시작되었습니다.");
			System.out.println(" ");
			System.out.println("한 학기는 총 12턴으로 이루어져 있습니다.");
			System.out.println("방학 때보다 더 많은 활동을 할 수 있습니다.");
			System.out.println("무엇을 하시겠습니까?"); // 한 턴당 1주가 지나며 총 16턴을 하면 여름방학으로 넘어가도록 해줘야함
			
			int turnsOfSpringsemester = 1; // 4학년 1학기 총 12턴!!
			
			while (turnsOfSpringsemester <= 12) {
				System.out.println("< 메인메뉴 > ");
				System.out.println("1. 활동"); // 1번 활동, 2번 상태확인, 3번 취준포기
				System.out.println("2. 상태확인");
				System.out.println("3. 1학기 취준포기");
						
				int 메인메뉴선택창 = scan.nextInt();
				
				if ( 메인메뉴선택창 == 1) {

					if (true) {
						Buttonbgm ButtonBgm1 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm1.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println(" ");
						System.out.println("4학년 1학기 : " + turnsOfSpringsemester+"/12" + "번째 턴입니다.");
						System.out.println("어디에 가시겠습니까?");
						System.out.println("1. 학교에 간다");
						System.out.println("2. 동네에 간다");
						System.out.println("3. 집에 간다");
						System.out.println("4. 뒤로가기");
						System.out.println("<< 학교, 동네, 집 각각 일정확률로 이벤트가 튀어나옵니다. >>");
						System.out.println(" ");	

						
						int 일학기선택창 = scan.nextInt();

					    if (일학기선택창 == 1) {
							Buttonbgm ButtonBgm5 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm5.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println(" ");
							System.out.println("학교에 왔습니다.");
							System.out.println("학교에서 무엇을 하시겠습니까?");
							System.out.println("1. 학점관리");
							System.out.println("2. 금융동아리활동");
							System.out.println("3. 취업지원본부 컨설팅");
							System.out.println("4. 면접스터디");
							System.out.println("5. 뒤로가기");
							System.out.println(" ");

							
							int 학교선택창 = scan.nextInt();
							
							if(학교선택창 ==1) {
								Buttonbgm ButtonBgm2 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm2.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        System.out.println("후.. 전공공부 열심히 해야지!!");
								System.out.println("학교에서 열심히 학점관리를 합니다.");
								System.out.println(" ");
								후니.학점관리();
								System.out.println(" ");
								
								SomethingGirl SomethingGirl = new SomethingGirl();

								SomethingGirl.SomethingGirlCome();
								SomethingGirl.join(); 
								System.out.println(" ");
								후니.상태알림();
								
							}else if(학교선택창 == 2) {
								Buttonbgm ButtonBgm2 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm2.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("동아리에서 선배들에게 취업꿀팁을 얻습니다.");
								후니.금융동아리모임_참석();
								System.out.println(" ");
								
								CircleBroThread CircleBro = new CircleBroThread();

								CircleBro.CircleBroCome();
								CircleBro.join(); 
								System.out.println(" ");
								후니.상태알림();
								
							}else if(학교선택창 == 3) {
								Buttonbgm ButtonBgm2 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm2.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("취업지원본부에서 컨설팅을 받습니다.");
								후니.취업지원본부_컨설팅();
								후니.상태알림();
								
							}else if(학교선택창 == 4) {
								Buttonbgm ButtonBgm2 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm2.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("면접스터디를 통해 면접역량을 강화시킵니다.");
								후니.면접스터디_참석();
								
								//돌발이벤트 발생
								
								InterviewStudyMember Studymember= new InterviewStudyMember();

								Studymember.GoFeedback();
								Studymember.join(); 
								
								
								
								후니.상태알림();
								
							}else if(학교선택창 == 5) {
								Buttonbgm ButtonBgm2 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm2.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								continue;
							}else {
								Buttonbgm ButtonBgm2 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm2.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("다시 입력하세요."); // 취준을 포기하시겟습니까?가 뜨도록. 맨처음 메인메뉴창이 아니라.
								continue; 						   // 이 if문을 while문 안에 넣게 되면 취준포기선택창 == 2가 1.활동 2. 상태확인 3. 취준포기가 나와야
							}
							
							
							BankHuman BankHuman = new BankHuman(); 
								
								if(BankHuman.현직자멘토링()) {
									
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
							        
									System.out.println("학교 랜덤 이벤트 <은행 현직자 멘토링>");
									System.out.println("은행 현직자 멘토링에 참여하시겠습니까?");
									System.out.println("1. 참여");
									System.out.println("2. 불참");
		
									//객체.객체함수다. 객체의 기능!	
									
									int 멘토링선택창 = scan.nextInt();
									
									if(멘토링선택창 == 1) {
										Buttonbgm ButtonBgm2 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm2.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("멘토링에 참여해 많은 조언들을 얻습니다.");	
										BankHuman.후니의_서류지수_증가(5);
										BankHuman.후니의_필기지수_증가(5);
										BankHuman.후니의_면접지수_증가(5);
										BankHuman.후니의_체력지수_감소(10);
										
										후니.상태알림();
										
									}else if(멘토링선택창 == 2) {
										Buttonbgm ButtonBgm2 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm2.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("멘토링에 불참하고 체력을 회복합니다.");
										BankHuman.후니의_체력지수_증가(10);
										후니.상태알림();					
									}else {
										Buttonbgm ButtonBgm2 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm2.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("다시 입력하세요."); // 은행 현직자 멘토링에 참여하시겠습니까?가 뜨도록.
										continue; 	
									}
									
								}else {
									System.out.println("랜덤이벤트가 없습니다.");
								}
							
							
					    }else if(일학기선택창 == 2) {
							Buttonbgm ButtonBgm2 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm2.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println(" ");
					    	System.out.println("동네에 왔습니다.");
							System.out.println("동네에서 무엇을 하시겠습니까?");
							System.out.println("1. 헬스");
							System.out.println("2. 치맥");
							System.out.println("3. 뒤로가기");
							System.out.println(" ");
							
							int 동네선택창 = scan.nextInt();
							
							if(동네선택창 ==1) {
								Buttonbgm ButtonBgm3 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm3.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        
						        System.out.println(" ");
						        
					    		String health[] = { // 타이핑 쓰레드 - 익명 클래스
		
	"	                                    .-;.",           
	"	                                   -$@@=, ",         
	"	                                 .~#@@@@=:  ",       
	"	                                -*@@@@@@@@*   ",     
	"	                               -$@@@@@@@@@@*    ",   
	"	                              ;#@@@@@@@@@@@@~     ", 
	"	                              -@@@@@@@@@@@@@#      ",
	"	                              .#@@@@@@@@@@@@@$.    ",
	"	                               ,#@@@@@@@@@@@@@*    ",
	"	                                :@@@@@@@@@@@@@$,   ",
	"	                                ,=@@@@@@@@@@@@@;   ",
	"	                          -!.    ,$@@@@@@@@@@@@$-  ",
	"	                         ~#@$    :@@@@@@@@@@@@@@~  ",
	"	                         :@@@. -#@@@@@@@@@@@@@@@~  ",
	"	                      .@@!;@$.   ;@@@@@@@@@@@@@@@, ",
	"	                    .,=@@;.,,$@@@!~#@@@@@@@@@@@@@, ",
	"	                   ,$@ =@!!@@@@@@@;!*=@@@@@@@@@@$, ",
	"	                   !@@;.@=;*@@@@@@@,  *@@@@@@@@=-  ",
	"	                   -#@@!;@=-~::!@@@*  ,#@@@@@#!,   ",
	"	         .;     .*=~=@@#-!@-;==!!@@@=  ;@@@@@-     ",
	"	        .#@;    ,@@#~#@@* .-#@#~#@@@@   !@@$.      ",
	"	       #@@@@:   ,@@@- @@=:@@@@.@@@@@@   .=,        ",
	"	     .$@@@@@#,   -##~..,-$@#*.#@@@@@=              ",
	"	   .!@@@@@@@@;   ---$@#!@@$- *@@@@@@               ",
	"	  .*@@@@@@@@@@;,;@@@@@@@$!;,,@@@@@@#               ",
	"	  ,@@@@@@@@@@@@=@@@@@@@#~-$~!@@@@@@$               ",
	"	  ,@@@@@@@@@@@@@@@@@@@:~*$@~~@@@@@@@               ",
	"	   ;@@@@@@@@@@@@@@@@@- $@@@#.@@@@@@@$              ",
	"	   ~@@@@@@@@@@@@@@@=, @@@@@@,@@@@@@@@$             ",
	"	   ~@@@@@@@@@@@@@@!    @@@@@@@@@@@@@@#.            ",
	"	    ;@@@@@@@@@@@@@*.   =$#@@@@@@@@@@@@$.           ",
	"	    ~#@@@@@@@@@@@@@:     -#@@@@@@@@@@@@=.          ",
	"	     !@@@@@@@@@@@@@*.     ~#@@@@@@@@@@@@~          ",
	"	     ,#@@@@@@@@@@@@@=.     =@@@@@@@@@@@@$,         ",
	"	      ,#@@@@@@@@@@@@@~     ,#@@@@@@@@@@@@$.        ",
	"	       -@@@@@@@@@@@@@@      .@@@@@@@@@@@@@-        ",
	"	        *@@@@@@@@@@@#.       @@@@@@@@@@@@@@        ",
	"	         *@@@@@@@@@~          #@@@@@@@@@@@!        ",
	"	          ;#@@@@@=~           .#@@@@@@@@#~         ",
	"	           -$@@@;              ;@@@@@@@$-          ",
	"	            -;!:               .*@@@@@;-           ",
	"	                                ,=@@!-             ",
	"	                                 ;:,            "
							    };
						        
							    for (int i = 0; i < health.length; i++) {
								      // 초 간 중지한다
								      Thread.sleep(0);
								      // 메세지를 출력한다
								      System.out.println(health[i]);
								}
							    
							    System.out.println(" ");
								System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
								System.out.println(" ");
								후니.헬스장();
								후니.상태알림();
								
							}else if(동네선택창 == 2) {
								Buttonbgm ButtonBgm3 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm3.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
							    String ChickenandBeer[] = { // 타이핑 쓰레드 - 익명 클래스

									"                       ,**~",               
									"....                  ,*  :;...!#=#.",      
									"!#@@#!,                !    ::::,   ;,",     
									"~@#-,,,$@!              -.            -~",     
									":#:-:!!!,;#=            ;!~            .;:",    
									".#*,!@@#@$,-#;          ;.                ;. ",  
									";$,,;:,,,:$-;@,         :                 .~ ",  
									"#~,,,,,,,-~-,#*         ;                 !.  ", 
									"#-,,,,,,,,,,,~=         .*-,,,  ,,,,,,,,,;;    ",
									"-*-,,,,,,,,,,,,@,          ;,,!  =,,,,,,,:~     ",
									"~*,,,,,,,,,,,,,@-          ~  !  $       -#=,   ",
									".=-,,,,,,,,,,,,=-          ~  *  # ,. ;  -~ !   ",
									" @~,,,,,,,,,,,,;!          ~   @#@ -. $  -@*.*  ",
									" *=,,,,,,,,,,,,;@          ~   * # -. $  --=.@  ",
									" ,@=,,,,,,,,,,,,$=         ~   * # -. $  --;,@  ",
									"  ~#*,,,,,,,,,,,:#-        ~   * # -. $  --*.@  ",
									"   ,##:,,,,,,,,,,@:        ~   * # -. $  -#$ $  ",
									"     *##;-,,,,,,:@$-       ~   * # -. $  -; !.  ",
									"      .-@#*-,,,:@~!@:-~    ~   * # -. $  -*$~   ",
									"         ;$@*::@;  ~$$=@~  ~   * # -. $  -~     ",
									"           -~=!*$!  ...-#. ~   * # -. $  --     ",
									"                ;#*    ,@- ~   ~ ! .  :  --     ",
									"                 ,@   *#=  ~.            -,     ",
									"                 ,@   $-   ~;           .*      ",
									"                  =!.:@-    -;;;;;;;;;;;;       ",
									"                  .@@@*                         ",
									    			      " .                      "
									     
							    };

						        
							    for (int i = 0; i < ChickenandBeer.length; i++) {
								      // 초 간 중지한다
								      Thread.sleep(100);
								      // 메세지를 출력한다
								      System.out.println(ChickenandBeer[i]);
								}
							    System.out.println(" ");
								System.out.println("치맥으로 스트레스를 풉니다.");
								후니.치맥();
								후니.상태알림();
								
							}else if(동네선택창 == 3) {
								Buttonbgm ButtonBgm3 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm3.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								continue;
							}else {
								Buttonbgm ButtonBgm3 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm3.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("다시 입력하세요."); // 취준을 포기하시겟습니까?가 뜨도록. 맨처음 메인메뉴창이 아니라.
								continue; 						   // 이 if문을 while문 안에 넣게 되면 취준포기선택창 == 2가 1.활동 2. 상태확인 3. 취준포기가 나와야
							}
							
							// (동네) 동네에서 군대에서 헤어진 여자친구 만남 // 전 여자친구가 먼저 말 건넬 확률 10% // 한 번만 나오도록!
							Character Xgirlfriend = new Character(); 
							Xgirlfriend.관계 = "전 여자친구";
							
							if(Xgirlfriend.talkfirst()) {
								
								EventBgm EventBgm = new EventBgm();
								
						        try {
						        	EventBgm.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        
								System.out.println("동네 랜덤 이벤트 <전 여자친구와의 만남>");
								System.out.println("동네에서 우연히 전 여자친구를 만났습니다.");
								System.out.println("잘 지내냐는 안부인사를 건네옵니다.");
								System.out.println("1. 나도 안부인사를 해준다. ");
								System.out.println("2. 무시하고 지나간다. ");

								//객체.객체함수다. 객체의 기능!	
								
								int 전여자친구선택창 = scan.nextInt();
								
								if(전여자친구선택창 == 1) {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[후니] 아 오랜만이네 ㅎㅎㅎ");	
									Xgirlfriend.후니의_스트레스지수_증가(10);
									후니.상태알림();
									
								}else if(전여자친구선택창 == 2) {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[후니] (인사를 왜 하는거지)");
									Xgirlfriend.후니의_자존감지수_증가(10);
									후니.상태알림();					
								}else {
									Buttonbgm ButtonBgm3 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm3.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("다시 입력하세요."); 
									continue; 	
								}
								
							}else {
								System.out.println("랜덤이벤트가 없습니다.");
							}
							
					    }else if(일학기선택창 == 3) {
							Buttonbgm ButtonBgm2 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm2.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println(" ");
					    	System.out.println("집에 왔습니다.");
							System.out.println("집에서 무엇을 하시겠습니까?");
							System.out.println("1. 부모님과 식사");
							System.out.println("2. 일기쓰기");
							System.out.println("3. 낮잠자기");
							System.out.println("4. 뒤로가기");
							System.out.println(" ");
							
							int 집선택창 = scan.nextInt();
							
							if(집선택창 ==1) {
								//버튼효과음
								Buttonbgm ButtonBgm3 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm3.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        
								String parents[] = {
										"부모님과 식사하며 취업 관련 이야기를 합니다.",
										"[부모님] 취업준비는 좀 잘 되고 있니?",
										"[후니] 나름대로 열심히 하고 있어요 ㅎㅎ",
										"[부모님] 그래그래 넌 혼자 알아서 잘 하리라 믿는다 ㅎㅎ ",
										"[후니] (후.. 이렇게나 날 믿어주시는데 잘 안되네 ㅠㅠ) ",
										"[부모님] 밥 많이 먹고 힘내라 아들",
										" "
								};
								
								for (int i = 0; i <parents.length; i++) {
									Thread.sleep(500);//0.5초마다 한 문장씩 출력
									System.out.println(parents[i]);
								}
								System.out.println(" ");

								후니.부모님과식사();
								
								RelativeClass relative = new RelativeClass();
								relative.RelativeCome();
								relative.join(); 
//								RelativeClass uncle = new RelativeClass();
//								RelativeClass aunt = new RelativeClass();		
//								RelativeClass java = new RelativeClass();


								
//								sister.get("[사촌동생] 오빠~~~ 잘 지냈어??! 요즘 어떻게 지내");
//								uncle.get("[이모부] 후니야 오랜만이다! 아직 대학생인가?" );
//								aunt.get("[이모] 후니 요즘 어떻게 지내니? 취업은 어디로 하려고? 공무원은 여전히 생각 없고?");
								
								
								System.out.println(" ");
								System.out.println(" ");

								
								// 돌발이벤트 끝
								
								후니.상태알림();
								
								
							}else if(집선택창 == 2) {
								Buttonbgm ButtonBgm3 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm3.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								
								 String Diary[] = { // 타이핑 쓰레드 - 익명 클래스

										 		  ".*=~.,,,,,,,--,,,....  --,.............~!.-=-",   
												  ",$~,..,,,,,,,--,.....  --,..... ... ...~!. ;,",   
												  ",$~,.,,,,,,,,,-,.....  --,....  ... ...~!. ;,  ", 
												  ",$~,,,,,,,,,,,-,.....  --,....  ..  ...~!. ;-   ",
												  ",$~,,,,,,,,,,,-,,....  --,....   . . ..~;. ;,   ",
												  ",$~,,,,,,,,,,,-,,....  --,....       ..~;. ;,   ",
												  ",$~,,,,,,,,,,,,,,....  --,....       ..~;. ;,   ",
												  ",$~,,,,,--,,,,,,,....  --,..... .... ..~!. ;,   ",
												  ",$~,,,,,~;,,,,,,,....  --,.....  ..  ..:!. ;,   ",
												  ",$~,,,,-:;,,,,,,,....  --,....   ......:!. ;,   ",
												  ",$~,,,,-;!-,,,,,,....  --,....  .......;!. ;,   ",
												  ",$~,,,,-;!~,,,,,,....  --,....    ... .;!. ;,   ",
												  ",$~,,,,~;!~,,,,,,....  --,.....  ......;!..;,   ",
												  ",$~,,,,~;!~,,,,,,...   --,..... ..... .;!..!-   ",
												  ",$~,,,-~;!~,,,,,,...   --,.....  .... .;!. ;,   ",
												  ",$~,,,-~;!~,,,,,,....  --,............,;;. ;,   ",
												  ",$~,,,-~;!~,,,,,,....  --,.......... .,!!. ;,   ",
												  ",$~,,,-~;!~,,,,,,....  --,.......... .,!!. ;,   ",
												  ",$~,,,-~;!-,,,,,,....  --,............,!!. ;,   ",
												  ",$~,,,-~;!-,-,,,,.... .--,.......... .,!!. !-   ",
												  ",$~,,,-~;!-,-,,,,....  --,............,!!. ;,   ",
												  ",$~,,,-~;!,,--,,,,... .--,............,!!. !,   ",
												  ",$~,,,-~;!,,--,,,,... .--,............,!!. ;,   ",
												  ",$~,,,-~;!,,--,,,,... .--,............,*!. ;,   ",
												  ",$~,,,-~;!,,---,,,... .--,............,!!. ;,   ",
												  ",$~,,,-~;!,,---,,,... .--,............,*!..;,   ",
												  ",$~,,,-~!!,,---,,,,....--,............-*!..;,   ",
												  ",$~,,,-~!!,----,,,,....~-,............-$!..;,   ",
												  ",@#$$$$##!$$$$$$$$$$$=$=$$$$$$$$=====*$@#==$-   ",
												  " ..,.....!......-,..................  ... ..    ",
												  "         !      ::                          ",
											     
									    };

								        
									    for (int i = 0; i < Diary.length; i++) {
										      // 초 간 중지한다
										      Thread.sleep(100);
										      // 메세지를 출력한다
										      System.out.println(Diary[i]);
										}
									    System.out.println(" ");
									    System.out.println("일기를 쓰며 하루를 점검하고 스스로를 보살핍니다.");
								후니.일기();
								후니.상태알림();
								
					    	}else if(집선택창 == 3) {
								Buttonbgm ButtonBgm3 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm3.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
					    		String nap[] = { // 타이핑 쓰레드 - 익명 클래스
	"		                              .                   ",
	"		                              .;:;-               ",  
	"		                             ,:.  ~-              ",  
	"		                             ~     ;.             ",
	"		                             ~  .  ~.             ",
	"		                             ~     ;.             ",  
	"		                             ,;   ~-              ",  
	"		                              ,~~~-                 ",
	"		                                                    ",
	"		                                                    ",
	"		                                                    ",
	"		                                                    ",
	"		                                                    ",
	"		                                                    ",
	"		                        ;!;~ ----,.                 ",
	"		                       -**;~ ::;:~~-.               ",
	"		                       !**~, ~  ~~~~~-              ",
	"		                       !*;,  -  -~~~~~-.            ",
	"		                       -*.   .  ,~~~~~~-            ",
	"		                  .   .,;:,,,   ,~~~~~~~,           ",
	"		                      .,,,,,,   .:~~~~~~~           ",
	"		                                 -~~~~~~~.          ",
	"		                             .,  -~:::~~~,          ",
	"		                          .~::! .::::::::-          ",
	"		                          -:::; ,::::::::~          ",
	"		                          ~:::~ -::::::::-          ",
	"		                          ~::-. --~~~::::.          ",
	"		                          ~::.                      ",
	"		                          :::.                      ",
	"		                         .:::-                      ",
	"		                         .::;-                      ",
	"		                         ,::;,                      ",
	"		                         -::;.                      ",
	"		                         ~::;                       ",
	"		                         ..--                       ",
	"		                       ,!;-:!                       ",
	"		                     ~*=====!                       ",
	"		                     -:;;;;~.    					",
	""
							    };
						        
							    for (int i = 0; i < nap.length; i++) {
								      // 초 간 중지한다
								      Thread.sleep(100);
								      // 메세지를 출력한다
								      System.out.println(nap[i]);
								}
							    System.out.println(" ");
							    
					    		System.out.println("낮잠을 통해 부족한 체력을 충전합니다.");
					    		후니.낮잠();
					    		후니.상태알림();
					    		
					    	}else if(집선택창 == 4) {
								Buttonbgm ButtonBgm3 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm3.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								continue;
							}else {
								Buttonbgm ButtonBgm3 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm3.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("다시 입력하세요."); 
								continue; 						
							}
							
							//(집) 집에 있는데 과동기에게 공무원 합격했다는 카톡이 올 확률 10%
							
							Character UniversityFriend = new Character(); 
							UniversityFriend.관계 = "과동기";
							
							if(UniversityFriend.kakaotalk()) {
								
								EventBgm EventBgm = new EventBgm();
								
						        try {
						        	EventBgm.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        
								System.out.println("집 랜덤 이벤트 <과동기의 공무원 합격소식>");
								System.out.println("평소에 연락도 없던 과동기에게 공무원 합격했다고 연락옵니다.");
								System.out.println("1. 축하답장을 해준다.");
								System.out.println("2. 읽씹한다.");

								//객체.객체함수다. 객체의 기능!	
								
								int 과동기선택창 = scan.nextInt();
								
								if(과동기선택창 == 1) {
									Buttonbgm ButtonBgm3 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm3.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[후니] 축하해 ㅎㅎㅎㅎㅎㅎ");	
									UniversityFriend.후니의_스트레스지수_증가(10);
									후니.상태알림();
									
								}else if(과동기선택창 == 2) {
									Buttonbgm ButtonBgm3 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm3.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[후니] (읽씹) 별로 친하지도 않았는데 ;;");
									UniversityFriend.후니의_자존감지수_증가(10);
									후니.상태알림();					
								}else {
									Buttonbgm ButtonBgm3 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm3.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("다시 입력하세요."); // 은행 현직자 멘토링에 참여하시겠습니까?가 뜨도록.
									continue; 	
								}
								
							}else {
								System.out.println("랜덤이벤트가 없습니다.");
							}
							
					    }else if(일학기선택창 == 4) {
							Buttonbgm ButtonBgm2 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm2.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
					    	continue;
					    }else {
							Buttonbgm ButtonBgm2 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm2.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println("다시 입력하세요.");
					    	continue;
					    }
					    
					}
					
//					System.out.println("4학년 1학기 : " + turnsOfSpringsemester+"/16" + "번째 턴입니다.");
					turnsOfSpringsemester ++;	
					
				}else if(메인메뉴선택창 == 2){
					Buttonbgm ButtonBgm2 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm2.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
				
					후니.상태알림();
					
				}else if(메인메뉴선택창 == 3) {
					Buttonbgm ButtonBgm2 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm2.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
						
					System.out.println("취준을 포기하시겠습니까?");
					System.out.println("1. 네");
					System.out.println("2. 아니오");
					
					int 취준포기선택창 = scan.nextInt();
					
					if(취준포기선택창 ==1) {
						Buttonbgm ButtonBgm3 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm3.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println("4학년 1학기 취업준비를 포기했습니다.");
						
						
						break;

					}else if(취준포기선택창 == 2) {
						Buttonbgm ButtonBgm3 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm2.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						continue;
					}else {
						Buttonbgm ButtonBgm3 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm2.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println("다시 입력하세요."); // 취준을 포기하시겟습니까?가 뜨도록. 맨처음 메인메뉴창이 아니라.
						continue; 						   // 이 if문을 while문 안에 넣게 되면 취준포기선택창 == 2가 1.활동 2. 상태확인 3. 취준포기가 나와야
					}
					
				}else {
					Buttonbgm ButtonBgm2 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm2.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					System.out.println("다시 입력하세요.");
					continue;
				}

			}	
			
			
			System.out.println("4학년 1학기가 끝났습니다.");
			System.out.println("여름방학이 시작되었습니다.");
			System.out.println("여름방학엔 자격증 외에 다양한 스펙들 중 하나를 쌓을 수 있습니다.");
			
			
			while (true) {
				Buttonbgm ButtonBgm2 = new Buttonbgm();
				
		        try {
		        	 ButtonBgm2.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
				System.out.println(" ");
				System.out.println("< 메인메뉴 > ");
				System.out.println("1. 활동"); // 1번 활동, 2번 상태확인, 3번 취준포기
				System.out.println("2. 상태확인");
				System.out.println("3. 여름방학 취준포기");
				System.out.println(" ");
						
				int 메인메뉴선택창 = scan.nextInt();
				
				if ( 메인메뉴선택창 == 1) {

					if (true) {
						Buttonbgm ButtonBgm3 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm3.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println(" ");
						System.out.println("무엇을 하시겠습니까?");
						System.out.println("1. 인턴");
						System.out.println("2. 대외활동");
						System.out.println("3. 공모전");
						System.out.println("4. 뒤로가기");
						System.out.println(" ");

						int 여름방학선택창 = scan.nextInt();

					    if (여름방학선택창 == 1) {
							Buttonbgm ButtonBgm4 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm4.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println("학교 연계형 은행인턴입니다."); // 부장님이 예민합니다. 센스 발휘 확률
							인턴 인턴 = new 인턴();
							인턴.후니의_서류지수_증가(10);
							인턴.후니의_필기지수_증가(5);
							인턴.후니의_면접지수_증가(5);
							인턴.후니의_체력지수_감소(10);
							인턴.후니의_자존감지수_증가(5);
							인턴.후니의_스트레스지수_증가(10);
//							인턴.센스_추가();
							
							후니.상태알림();
							
							break;
					    
					    }else if(여름방학선택창 == 2) {
							Buttonbgm ButtonBgm4 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm4.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println(" ");
					    	System.out.println("어떤 대외활동을 하시겠습니까?");
							System.out.println("1. 기자단");
							System.out.println("2. 서포터즈");
							System.out.println("3. 뒤로가기");
							System.out.println(" ");

							int 대외활동선택창 = scan.nextInt();
							
							if(대외활동선택창 ==1) {
								Buttonbgm ButtonBgm5 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm5.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("여름방학 동안 은행 기자단을 진행합니다."); // 거의 다 마무리된 기사가 날라감
								기자단 기자단 = new 기자단();
								기자단.후니의_서류지수_증가(10);
								기자단.후니의_면접지수_증가(5);
								기자단.후니의_체력지수_감소(10);
								기자단.후니의_스트레스지수_증가(10);

								
								후니.상태알림();
								
							}else if(대외활동선택창 == 2) {
								Buttonbgm ButtonBgm5 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm5.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("여름방학 동안 은행 서포터즈를 진행합니다."); // 갑자기 팀원이 나감.
								서포터즈 서포터즈 = new 서포터즈();
								서포터즈.후니의_서류지수_증가(10);
								서포터즈.후니의_면접지수_증가(5);
								서포터즈.후니의_체력지수_감소(10);
								서포터즈.후니의_스트레스지수_증가(10);

								
								후니.상태알림();
								
							}else if(대외활동선택창 == 3) {
								Buttonbgm ButtonBgm5 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm5.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								continue;
							}else {
								System.out.println("다시 입력하세요.");
								Buttonbgm ButtonBgm5 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm5.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								continue; 						 
							}
							
							break;
							
					    }else if(여름방학선택창 == 3) {
							Buttonbgm ButtonBgm1 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm1.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println(" ");
					    	System.out.println("어떤 공모전을 하시겠습니까?");
							System.out.println("1. 아이디어 공모전");
							System.out.println("2. 논문공모전");
							System.out.println("3. 뒤로가기");
							System.out.println(" ");
							
							int 공모전선택창 = scan.nextInt();
							
							if(공모전선택창 ==1) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("여름방학 동안 아이디어 공모전을 진행합니다."); // 다른 팀이 내 아이디어 베낌
								아이디어공모전 아이디어공모전 = new 아이디어공모전();
								아이디어공모전.후니의_서류지수_증가(10);
								아이디어공모전.후니의_면접지수_증가(5);
								아이디어공모전.후니의_체력지수_감소(10);
								아이디어공모전.후니의_스트레스지수_증가(10);
								아이디어공모전.창의력_추가();
								
								후니.상태알림();
								
							}else if(공모전선택창 == 2) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("여름방학 동안 논문공모전을 진행합니다."); // 내껄 빼먹고 심사할 확률 	
								논문공모전 논문공모전 = new 논문공모전();
								논문공모전.후니의_서류지수_증가(10);
								논문공모전.후니의_면접지수_증가(5);
								논문공모전.후니의_체력지수_감소(10);
								논문공모전.후니의_스트레스지수_증가(10);
								논문공모전.사고력_추가();
								
								후니.상태알림();
								
					    	}else if(공모전선택창 == 3) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
					    		continue;
							}else {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("다시 입력하세요."); 
								continue; 						   
							}
						
							break;	
							
					    }else if(여름방학선택창 == 4) {
							Buttonbgm ButtonBgm4 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm4.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
					    	continue;
					    }else {
							System.out.println("다시 입력하세요.");
					    	continue;
					    }
					    
					}	
					
				}else if(메인메뉴선택창 == 2){
					Buttonbgm ButtonBgm1 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm1.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
				
					후니.상태알림();
					
				}else if(메인메뉴선택창 == 3) {
					Buttonbgm ButtonBgm1 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm1.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
						
					System.out.println("여름방학 취준을 포기하시겠습니까?");
					System.out.println("1. 네");
					System.out.println("2. 아니오");
					
					int 취준포기선택창 = scan.nextInt();
					
					if(취준포기선택창 ==1) {
						Buttonbgm ButtonBgm3 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm3.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
				        System.out.println("여름방학 취업준비를 포기했습니다.");
						
						
						break;

					}else if(취준포기선택창 == 2) {
						Buttonbgm ButtonBgm3 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm3.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						continue;
					}else {
						Buttonbgm ButtonBgm3 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm3.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println("다시 입력하세요."); 
						continue; 					
					}
					
				}else {
					Buttonbgm ButtonBgm3 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm3.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					System.out.println("다시 입력하세요.");
					continue;
				}

			}
			
			System.out.println("여름방학이 끝나고,");
			System.out.println("4학년 2학기가 시작되었습니다.");
			System.out.println("===========================================================");
			System.out.println("2학기는 9월은 총 네 턴입니다.");
			System.out.println("10월은 세 턴 후 서류를 제출해야 합니다.");
			System.out.println("11월은 세 턴 후 필기전형에 응시해야 합니다.");
			System.out.println("12월은 세 턴 후 면접전형이 응시해야 합니다.");
			System.out.println("각 전형에 필요한 지수들과 자기관리에 집중합시다!");
			System.out.println("===========================================================");	
			int Sep = 1; // 9월 네 턴!
			
			while (Sep <= 4) {
				Buttonbgm ButtonBgm1 = new Buttonbgm();
				
		        try {
		        	 ButtonBgm1.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
				System.out.println(" ");
				System.out.println("< 메인메뉴 > ");
				System.out.println("1. 활동"); // 1번 활동, 2번 상태확인, 3번 취준포기
				System.out.println("2. 상태확인");
				System.out.println("3. 취준포기");
				System.out.println(" ");

				int 메인메뉴선택창 = scan.nextInt();
				
				if ( 메인메뉴선택창 == 1) {

					if (true) {
						Buttonbgm ButtonBgm2 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm2.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println("4학년 2학기 9월 : " + Sep + "/4" + "번째 턴입니다.");
						System.out.println("어디에 가시겠습니까?");
						System.out.println("1. 학교에 간다");
						System.out.println("2. 동네에 간다");
						System.out.println("3. 집에 간다");
						System.out.println("4. 뒤로가기");
						System.out.println("<< 학교, 동네, 집 각각 일정확률로 이벤트가 튀어나옵니다. >>");

						
						int 일학기선택창 = scan.nextInt();

					    if (일학기선택창 == 1) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println("학교에 왔습니다.");
							System.out.println("학교에서 무엇을 하시겠습니까?");
							System.out.println("1. 학점관리");
							System.out.println("2. 금융동아리활동");
							System.out.println("3. 취업지원본부 컨설팅");
							System.out.println("4. 면접스터디");
							System.out.println("5. 뒤로가기");

							int 학교선택창 = scan.nextInt();
							
							if(학교선택창 ==1) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        System.out.println("후.. 전공공부 열심히 해야지!!");
								System.out.println("학교에서 열심히 학점관리를 합니다.");
								System.out.println(" ");
								후니.학점관리();
								
								System.out.println(" ");
								
								SomethingGirl SomethingGirl = new SomethingGirl();

								SomethingGirl.SomethingGirlCome();
								SomethingGirl.join(); 
								System.out.println(" ");
								
								후니.상태알림();
								
							}else if(학교선택창 == 2) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("동아리에서 선배들에게 취업꿀팁을 얻습니다.");
								후니.금융동아리모임_참석();
								System.out.println(" ");
								
								CircleBroThread CircleBro = new CircleBroThread();

								CircleBro.CircleBroCome();
								CircleBro.join(); 
								System.out.println(" ");
								후니.상태알림();
								
							}else if(학교선택창 == 3) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("취업지원본부에서 컨설팅을 받습니다.");
								후니.취업지원본부_컨설팅();
								후니.상태알림();
								
							}else if(학교선택창 == 4) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("면접스터디를 통해 면접역량을 강화시킵니다.");
								후니.면접스터디_참석();
								
								InterviewStudyMember Studymember= new InterviewStudyMember();

								Studymember.GoFeedback();
								Studymember.join(); 
								
								후니.상태알림();
								
							}else if(학교선택창 == 5) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								continue;
						
							}else {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("다시 입력하세요."); 
								continue; 						 
							}
							
							
							Character InterviewFriend = new Character(); 
							InterviewFriend.관계 = "취업스터디원";
							
								if(InterviewFriend.SuccessFirst()) {
									
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
							        
									System.out.println("학교 랜덤 이벤트 <취업스터디원이 먼저 합격했습니다.>");
									System.out.println("축하파티에 참여하시겠습니까?");
									System.out.println("1. 참여");
									System.out.println("2. 불참");
		
									//객체.객체함수다. 객체의 기능!	
									
									int goparty = scan.nextInt();
									
									if(goparty == 1) {
										Buttonbgm ButtonBgm5 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm5.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("축하파티에 참여해 많은 조언들을 얻습니다.");	
										InterviewFriend.후니의_서류지수_증가(5);
										InterviewFriend.후니의_필기지수_증가(5);
										InterviewFriend.후니의_면접지수_증가(5);
										InterviewFriend.후니의_체력지수_감소(10);
										InterviewFriend.후니의_자존감지수_감소(5);
										
										후니.상태알림();
										
									}else if(goparty == 2) {
										Buttonbgm ButtonBgm5 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm5.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("축하파티에 불참하고 체력을 회복합니다.");
										InterviewFriend.후니의_체력지수_증가(15);
										InterviewFriend.후니의_자존감지수_감소(5);
										InterviewFriend.후니의_스트레스지수_증가(5);
										
										후니.상태알림();					
									}else {
										Buttonbgm ButtonBgm4 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm4.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("다시 입력하세요.");
										continue; 	
									}
									
								}else {
									
									System.out.println("랜덤이벤트가 없습니다.");
								}
							
							
					    }else if(일학기선택창 == 2) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
					    	System.out.println("동네에 왔습니다.");
							System.out.println("동네에서 무엇을 하시겠습니까?");
							System.out.println("1. 헬스");
							System.out.println("2. 치맥");
							System.out.println("3. 뒤로가기");
							
							int 동네선택창 = scan.nextInt();
							
							if(동네선택창 ==1) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        
						        System.out.println(" ");
						        
					    		String health[] = { // 타이핑 쓰레드 - 익명 클래스
		
	"	                                    .-;.",           
	"	                                   -$@@=, ",         
	"	                                 .~#@@@@=:  ",       
	"	                                -*@@@@@@@@*   ",     
	"	                               -$@@@@@@@@@@*    ",   
	"	                              ;#@@@@@@@@@@@@~     ", 
	"	                              -@@@@@@@@@@@@@#      ",
	"	                              .#@@@@@@@@@@@@@$.    ",
	"	                               ,#@@@@@@@@@@@@@*    ",
	"	                                :@@@@@@@@@@@@@$,   ",
	"	                                ,=@@@@@@@@@@@@@;   ",
	"	                          -!.    ,$@@@@@@@@@@@@$-  ",
	"	                         ~#@$    :@@@@@@@@@@@@@@~  ",
	"	                         :@@@. -#@@@@@@@@@@@@@@@~  ",
	"	                      .@@!;@$.   ;@@@@@@@@@@@@@@@, ",
	"	                    .,=@@;.,,$@@@!~#@@@@@@@@@@@@@, ",
	"	                   ,$@ =@!!@@@@@@@;!*=@@@@@@@@@@$, ",
	"	                   !@@;.@=;*@@@@@@@,  *@@@@@@@@=-  ",
	"	                   -#@@!;@=-~::!@@@*  ,#@@@@@#!,   ",
	"	         .;     .*=~=@@#-!@-;==!!@@@=  ;@@@@@-     ",
	"	        .#@;    ,@@#~#@@* .-#@#~#@@@@   !@@$.      ",
	"	       #@@@@:   ,@@@- @@=:@@@@.@@@@@@   .=,        ",
	"	     .$@@@@@#,   -##~..,-$@#*.#@@@@@=              ",
	"	   .!@@@@@@@@;   ---$@#!@@$- *@@@@@@               ",
	"	  .*@@@@@@@@@@;,;@@@@@@@$!;,,@@@@@@#               ",
	"	  ,@@@@@@@@@@@@=@@@@@@@#~-$~!@@@@@@$               ",
	"	  ,@@@@@@@@@@@@@@@@@@@:~*$@~~@@@@@@@               ",
	"	   ;@@@@@@@@@@@@@@@@@- $@@@#.@@@@@@@$              ",
	"	   ~@@@@@@@@@@@@@@@=, @@@@@@,@@@@@@@@$             ",
	"	   ~@@@@@@@@@@@@@@!    @@@@@@@@@@@@@@#.            ",
	"	    ;@@@@@@@@@@@@@*.   =$#@@@@@@@@@@@@$.           ",
	"	    ~#@@@@@@@@@@@@@:     -#@@@@@@@@@@@@=.          ",
	"	     !@@@@@@@@@@@@@*.     ~#@@@@@@@@@@@@~          ",
	"	     ,#@@@@@@@@@@@@@=.     =@@@@@@@@@@@@$,         ",
	"	      ,#@@@@@@@@@@@@@~     ,#@@@@@@@@@@@@$.        ",
	"	       -@@@@@@@@@@@@@@      .@@@@@@@@@@@@@-        ",
	"	        *@@@@@@@@@@@#.       @@@@@@@@@@@@@@        ",
	"	         *@@@@@@@@@~          #@@@@@@@@@@@!        ",
	"	          ;#@@@@@=~           .#@@@@@@@@#~         ",
	"	           -$@@@;              ;@@@@@@@$-          ",
	"	            -;!:               .*@@@@@;-           ",
	"	                                ,=@@!-             ",
	"	                                 ;:,            "
							    };
						        
							    for (int i = 0; i < health.length; i++) {
								      // 초 간 중지한다
								      Thread.sleep(0);
								      // 메세지를 출력한다
								      System.out.println(health[i]);
								}
							    
							    System.out.println(" ");
								System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
								System.out.println(" ");
								후니.헬스장();
								후니.상태알림();
								
							}else if(동네선택창 == 2) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								String ChickenandBeer[] = { // 타이핑 쓰레드 - 익명 클래스

										"                       ,**~",               
										"....                  ,*  :;...!#=#.",      
										"!#@@#!,                !    ::::,   ;,",     
										"~@#-,,,$@!              -.            -~",     
										":#:-:!!!,;#=            ;!~            .;:",    
										".#*,!@@#@$,-#;          ;.                ;. ",  
										";$,,;:,,,:$-;@,         :                 .~ ",  
										"#~,,,,,,,-~-,#*         ;                 !.  ", 
										"#-,,,,,,,,,,,~=         .*-,,,  ,,,,,,,,,;;    ",
										"-*-,,,,,,,,,,,,@,          ;,,!  =,,,,,,,:~     ",
										"~*,,,,,,,,,,,,,@-          ~  !  $       -#=,   ",
										".=-,,,,,,,,,,,,=-          ~  *  # ,. ;  -~ !   ",
										" @~,,,,,,,,,,,,;!          ~   @#@ -. $  -@*.*  ",
										" *=,,,,,,,,,,,,;@          ~   * # -. $  --=.@  ",
										" ,@=,,,,,,,,,,,,$=         ~   * # -. $  --;,@  ",
										"  ~#*,,,,,,,,,,,:#-        ~   * # -. $  --*.@  ",
										"   ,##:,,,,,,,,,,@:        ~   * # -. $  -#$ $  ",
										"     *##;-,,,,,,:@$-       ~   * # -. $  -; !.  ",
										"      .-@#*-,,,:@~!@:-~    ~   * # -. $  -*$~   ",
										"         ;$@*::@;  ~$$=@~  ~   * # -. $  -~     ",
										"           -~=!*$!  ...-#. ~   * # -. $  --     ",
										"                ;#*    ,@- ~   ~ ! .  :  --     ",
										"                 ,@   *#=  ~.            -,     ",
										"                 ,@   $-   ~;           .*      ",
										"                  =!.:@-    -;;;;;;;;;;;;       ",
										"                  .@@@*                         ",
										    			      " .                      "
										     
								    };

							        
								    for (int i = 0; i < ChickenandBeer.length; i++) {
									      // 초 간 중지한다
									      Thread.sleep(100);
									      // 메세지를 출력한다
									      System.out.println(ChickenandBeer[i]);
									}
								    System.out.println(" ");
									System.out.println("치맥으로 스트레스를 풉니다.");
									후니.치맥();
									후니.상태알림();
							
								
							}else if(동네선택창 == 3) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								continue;
							}else {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("다시 입력하세요."); 
								continue; 						 
							}
							
							// (동네) 고등학교 친구에게 안부전화 올 확률 10% 
							
							Character HighschoolFriend = new Character(); 
							HighschoolFriend.관계 = "고등학교 친구";
							
								if(HighschoolFriend.HiCall()) {
								EventBgm EventBgm = new EventBgm();
								
						        try {
						        	EventBgm.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								
								System.out.println("동네 랜덤 이벤트 <고등학교 친구의 안부전화>");
								System.out.println("잊고 있던 고등학교 친구에게 전화가 옵니다.");
								System.out.println("1. 전화를 받는다. ");
								System.out.println("2. 전화를 받지 않는다. ");

								//객체.객체함수다. 객체의 기능!	
								
								int 안부전화선택창 = scan.nextInt();
								
								if(안부전화선택창 == 1) {
									Buttonbgm ButtonBgm5 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm5.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[고등학교 친구] 어 후니야! 아까 동네에서 너 본 것 같아서 전화했어!");	
									System.out.println("[고등학교 친구] 잘 지내고 있었지?");	
									System.out.println("[고등학교 친구] 전역한 이후로 한 번도 못봤는데! 보고 싶다야!");
									System.out.println("[후니] 말할 틈도 안주네!");
									System.out.println("[후니] 나도 보고 싶다야!");
									
									HighschoolFriend.후니의_체력지수_증가(10);
									HighschoolFriend.후니의_자존감지수_증가(10);
									HighschoolFriend.후니의_스트레스지수_감소(10);
									
									후니.상태알림();
									
								}else if(안부전화선택창 == 2) {
									Buttonbgm ButtonBgm5 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm5.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[후니] 아 무슨 일이지.. 연락하기 싫은데..");
									HighschoolFriend.후니의_자존감지수_감소(10);
									HighschoolFriend.후니의_스트레스지수_증가(10);
									
									후니.상태알림();					
								}else {
									Buttonbgm ButtonBgm5 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm5.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("다시 입력하세요."); 
									continue; 	
								}
								
							}else {
								System.out.println("랜덤이벤트가 없습니다.");
							}
							
					    }else if(일학기선택창 == 3) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
					    	System.out.println("집에 왔습니다.");
							System.out.println("집에서 무엇을 하시겠습니까?");
							System.out.println("1. 부모님과 식사");
							System.out.println("2. 일기쓰기");
							System.out.println("3. 낮잠자기");
							System.out.println("4. 뒤로가기");
							
							int 집선택창 = scan.nextInt();
							
							if(집선택창 ==1) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        String parents[] = {
										"부모님과 식사하며 취업 관련 이야기를 합니다.",
										"[부모님] 취업준비는 좀 잘 되고 있니?",
										"[후니] 나름대로 열심히 하고 있어요 ㅎㅎ",
										"[부모님] 그래그래 넌 혼자 알아서 잘 하리라 믿는다 ㅎㅎ ",
										"[후니] (후.. 이렇게나 날 믿어주시는데 잘 안되네 ㅠㅠ) ",
										"[부모님] 밥 많이 먹고 힘내라 아들",
										" "
								};
								
								for (int i = 0; i <parents.length; i++) {
									Thread.sleep(500);//0.5초마다 한 문장씩 출력
									System.out.println(parents[i]);
								}
								System.out.println(" ");

								후니.부모님과식사();
								System.out.println(" ");

								RelativeClass relative = new RelativeClass();
								relative.RelativeCome();
								relative.join(); 
								System.out.println(" ");

								후니.상태알림();
								
							}else if(집선택창 == 2) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								 String Diary[] = { // 타이핑 쓰레드 - 익명 클래스

								 		  ".*=~.,,,,,,,--,,,....  --,.............~!.-=-",   
										  ",$~,..,,,,,,,--,.....  --,..... ... ...~!. ;,",   
										  ",$~,.,,,,,,,,,-,.....  --,....  ... ...~!. ;,  ", 
										  ",$~,,,,,,,,,,,-,.....  --,....  ..  ...~!. ;-   ",
										  ",$~,,,,,,,,,,,-,,....  --,....   . . ..~;. ;,   ",
										  ",$~,,,,,,,,,,,-,,....  --,....       ..~;. ;,   ",
										  ",$~,,,,,,,,,,,,,,....  --,....       ..~;. ;,   ",
										  ",$~,,,,,--,,,,,,,....  --,..... .... ..~!. ;,   ",
										  ",$~,,,,,~;,,,,,,,....  --,.....  ..  ..:!. ;,   ",
										  ",$~,,,,-:;,,,,,,,....  --,....   ......:!. ;,   ",
										  ",$~,,,,-;!-,,,,,,....  --,....  .......;!. ;,   ",
										  ",$~,,,,-;!~,,,,,,....  --,....    ... .;!. ;,   ",
										  ",$~,,,,~;!~,,,,,,....  --,.....  ......;!..;,   ",
										  ",$~,,,,~;!~,,,,,,...   --,..... ..... .;!..!-   ",
										  ",$~,,,-~;!~,,,,,,...   --,.....  .... .;!. ;,   ",
										  ",$~,,,-~;!~,,,,,,....  --,............,;;. ;,   ",
										  ",$~,,,-~;!~,,,,,,....  --,.......... .,!!. ;,   ",
										  ",$~,,,-~;!~,,,,,,....  --,.......... .,!!. ;,   ",
										  ",$~,,,-~;!-,,,,,,....  --,............,!!. ;,   ",
										  ",$~,,,-~;!-,-,,,,.... .--,.......... .,!!. !-   ",
										  ",$~,,,-~;!-,-,,,,....  --,............,!!. ;,   ",
										  ",$~,,,-~;!,,--,,,,... .--,............,!!. !,   ",
										  ",$~,,,-~;!,,--,,,,... .--,............,!!. ;,   ",
										  ",$~,,,-~;!,,--,,,,... .--,............,*!. ;,   ",
										  ",$~,,,-~;!,,---,,,... .--,............,!!. ;,   ",
										  ",$~,,,-~;!,,---,,,... .--,............,*!..;,   ",
										  ",$~,,,-~!!,,---,,,,....--,............-*!..;,   ",
										  ",$~,,,-~!!,----,,,,....~-,............-$!..;,   ",
										  ",@#$$$$##!$$$$$$$$$$$=$=$$$$$$$$=====*$@#==$-   ",
										  " ..,.....!......-,..................  ... ..    ",
										  "         !      ::                          ",
									     
							    };

						        
							    for (int i = 0; i < Diary.length; i++) {
								      // 초 간 중지한다
								      Thread.sleep(100);
								      // 메세지를 출력한다
								      System.out.println(Diary[i]);
								}
							    System.out.println(" ");
							    System.out.println("일기를 쓰며 하루를 점검하고 스스로를 보살핍니다.");
						후니.일기();
						후니.상태알림();
					    	}else if(집선택창 == 3) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
					    		String nap[] = { // 타이핑 쓰레드 - 익명 클래스
					    				"		                              .                   ",
					    				"		                              .;:;-               ",  
					    				"		                             ,:.  ~-              ",  
					    				"		                             ~     ;.             ",
					    				"		                             ~  .  ~.             ",
					    				"		                             ~     ;.             ",  
					    				"		                             ,;   ~-              ",  
					    				"		                              ,~~~-                 ",
					    				"		                                                    ",
					    				"		                                                    ",
					    				"		                                                    ",
					    				"		                                                    ",
					    				"		                                                    ",
					    				"		                                                    ",
					    				"		                        ;!;~ ----,.                 ",
					    				"		                       -**;~ ::;:~~-.               ",
					    				"		                       !**~, ~  ~~~~~-              ",
					    				"		                       !*;,  -  -~~~~~-.            ",
					    				"		                       -*.   .  ,~~~~~~-            ",
					    				"		                  .   .,;:,,,   ,~~~~~~~,           ",
					    				"		                      .,,,,,,   .:~~~~~~~           ",
					    				"		                                 -~~~~~~~.          ",
					    				"		                             .,  -~:::~~~,          ",
					    				"		                          .~::! .::::::::-          ",
					    				"		                          -:::; ,::::::::~          ",
					    				"		                          ~:::~ -::::::::-          ",
					    				"		                          ~::-. --~~~::::.          ",
					    				"		                          ~::.                      ",
					    				"		                          :::.                      ",
					    				"		                         .:::-                      ",
					    				"		                         .::;-                      ",
					    				"		                         ,::;,                      ",
					    				"		                         -::;.                      ",
					    				"		                         ~::;                       ",
					    				"		                         ..--                       ",
					    				"		                       ,!;-:!                       ",
					    				"		                     ~*=====!                       ",
					    				"		                     -:;;;;~.    					",
					    				""
					    										    };
					    									        
								    for (int i = 0; i < nap.length; i++) {
									      // 초 간 중지한다
									      Thread.sleep(100);
									      // 메세지를 출력한다
									      System.out.println(nap[i]);
									}
								    System.out.println(" ");
								    
						    		System.out.println("낮잠을 통해 부족한 체력을 충전합니다.");
						    		후니.낮잠();
						    		후니.상태알림();
					    		
					    	}else if(집선택창 == 4) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								continue;
							}else {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("다시 입력하세요."); 
								continue; 						
							}
							
							//(집) 동생의 병간호를 해야합니다.
							Character Bro = new Character(); 
							Bro.관계 = "남동생";
							
							if(Bro.gohospital()) {
								EventBgm EventBgm = new EventBgm();
								
						        try {
						        	EventBgm.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("집 랜덤 이벤트 <동생의 입원>");
								System.out.println("동생이 입원했습니다.");
								System.out.println("병간호를 하시겠습니까?");
								System.out.println("1. 병간호를 한다.");
								System.out.println("2. 하지 않는다.");

								//객체.객체함수다. 객체의 기능!	
								
								int 병간호선택창 = scan.nextInt();
								
								if(병간호선택창 == 1) {
									Buttonbgm ButtonBgm5 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm5.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[후니] (후.. 취준에 집안일까지..)");	
									System.out.println("[후니] 조심 좀 하지 그랬어 ㅠㅠ");	
									Bro.후니의_체력지수_감소(5);
									Bro.후니의_스트레스지수_증가(5);
									후니.상태알림();
									
								}else if(병간호선택창 == 2) {
									Buttonbgm ButtonBgm5 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm5.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[후니] 너무 바빠.. 하반기 준비해야해..ㅠㅠ");
									Bro.후니의_스트레스지수_증가(5);
									Bro.후니의_자존감지수_감소(5);
									후니.상태알림();					
								}else {
									Buttonbgm ButtonBgm5 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm5.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("다시 입력하세요.");
									continue; 	
								}
								
							}else {
								System.out.println("랜덤이벤트가 없습니다.");
							}
							
					    }else if(일학기선택창 == 4) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
					    	continue;
					    }else {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println("다시 입력하세요.");
					    	continue;
					    }
					    
					}
					
					Sep ++;	
					
				}else if(메인메뉴선택창 == 2){
					Buttonbgm ButtonBgm2 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm2.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
				
					후니.상태알림();
					
				}else if(메인메뉴선택창 == 3) {
					Buttonbgm ButtonBgm2 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm2.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
						
					System.out.println("취준을 포기하시겠습니까?");
					System.out.println("1. 네");
					System.out.println("2. 아니오");
					
					int 취준포기선택창 = scan.nextInt();
					
					if(취준포기선택창 ==1) {
						System.out.println("9월 취업준비를 포기했습니다.");					
						System.out.println("이제 10월입니다.");
						
//						FinishBgm FinishBgm = new FinishBgm(); // 취준포기하면 피니시브금 나오게!
//						FinishBgm.start();
//						
//				        try {
//				        	 FinishBgm.LoadBgm();
//				             Thread.sleep(0);
//				        }catch(InterruptedException e) {
//				             e.printStackTrace();
//				        
//				        }
						
						break;

					}else if(취준포기선택창 == 2) {
						Buttonbgm ButtonBgm3 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm3.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						continue;
					}else {
						Buttonbgm ButtonBgm3 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm3.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println("다시 입력하세요."); // 취준을 포기하시겟습니까?가 뜨도록. 맨처음 메인메뉴창이 아니라.
						continue; 						   // 이 if문을 while문 안에 넣게 되면 취준포기선택창 == 2가 1.활동 2. 상태확인 3. 취준포기가 나와야
					}
					
				}else {
					Buttonbgm ButtonBgm2 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm2.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					System.out.println("다시 입력하세요.");
					continue;
				}

			}
			
			System.out.println("10월입니다.");	
			System.out.println("10월 마지막주에 서류전형이 있습니다.");					
			
			int OCT = 1; // 10월 세 턴! 후 서류 전형!!
			
			while (OCT <= 3) {
				Buttonbgm ButtonBgm1 = new Buttonbgm();
				
		        try {
		        	 ButtonBgm1.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
				System.out.println(" ");
				System.out.println("< 메인메뉴 > ");
				System.out.println("1. 활동"); // 1번 활동, 2번 상태확인, 3번 취준포기
				System.out.println("2. 상태확인");
				System.out.println("3. 취준포기");
				System.out.println(" ");
						
				int 메인메뉴선택창 = scan.nextInt();
				
				if ( 메인메뉴선택창 == 1) {

					if (true) {
						Buttonbgm ButtonBgm2 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm2.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println(" ");
						System.out.println("4학년 2학기 10월 : " + OCT + "/3" + "번째 턴입니다.");
						System.out.println("어디에 가시겠습니까?");
						System.out.println("1. 학교에 간다");
						System.out.println("2. 동네에 간다");
						System.out.println("3. 집에 간다");
						System.out.println("4. 뒤로가기");
						System.out.println("<< 학교, 동네, 집 각각 일정확률로 이벤트가 튀어나옵니다. >>");

						System.out.println(" ");
						
						int 일학기선택창 = scan.nextInt();

					    if (일학기선택창 == 1) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println(" ");
							System.out.println("학교에 왔습니다.");
							System.out.println("학교에서 무엇을 하시겠습니까?");
							System.out.println("1. 학점관리");
							System.out.println("2. 금융동아리활동");
							System.out.println("3. 취업지원본부 컨설팅");
							System.out.println("4. 면접스터디");
							System.out.println("5. 뒤로가기");
							System.out.println(" ");

							int 학교선택창 = scan.nextInt();
							
							if(학교선택창 ==1) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        System.out.println("후.. 전공공부 열심히 해야지!!");
								System.out.println("학교에서 열심히 학점관리를 합니다.");
								후니.학점관리();
								
								System.out.println(" ");
								
								SomethingGirl SomethingGirl = new SomethingGirl();

								SomethingGirl.SomethingGirlCome();
								SomethingGirl.join(); 
								System.out.println(" ");
								후니.상태알림();
								
							}else if(학교선택창 == 2) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("동아리에서 선배들에게 취업꿀팁을 얻습니다.");
								후니.금융동아리모임_참석();
								System.out.println(" ");
								
								CircleBroThread CircleBro = new CircleBroThread();

								CircleBro.CircleBroCome();
								CircleBro.join(); 
								System.out.println(" ");
								후니.상태알림();
								
							}else if(학교선택창 == 3) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("취업지원본부에서 컨설팅을 받습니다.");
								후니.취업지원본부_컨설팅();
								후니.상태알림();
								
							}else if(학교선택창 == 4) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("면접스터디를 통해 면접역량을 강화시킵니다.");
								후니.면접스터디_참석();
								
								InterviewStudyMember Studymember= new InterviewStudyMember();

								Studymember.GoFeedback();
								Studymember.join(); 
								
								후니.상태알림();
								
							}else if(학교선택창 == 5) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								continue;
						
							}else {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("다시 입력하세요."); 
								continue; 						 
							}
							
							// (학교) 취업스터디원 먼저 합격해서 쫑파티 열 확률 10%

//							int 멘토링횟수;
//							멘토링횟수 = 0;
//							while(멘토링횟수<1)
							
							Character InterviewFriend = new Character(); 
							InterviewFriend.관계 = "취업스터디원";
							
								if(InterviewFriend.SuccessFirst()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							             
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("학교 랜덤 이벤트 <취업스터디원이 먼저 합격했습니다.>");
									System.out.println("축하파티에 참여하시겠습니까?");
									System.out.println("1. 참여");
									System.out.println("2. 불참");
		
									//객체.객체함수다. 객체의 기능!	
									
									int goparty = scan.nextInt();
									
									if(goparty == 1) {
										Buttonbgm ButtonBgm5 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm5.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("축하파티에 참여해 많은 조언들을 얻습니다.");	
										InterviewFriend.후니의_서류지수_증가(5);
										InterviewFriend.후니의_필기지수_증가(5);
										InterviewFriend.후니의_면접지수_증가(5);
										InterviewFriend.후니의_체력지수_감소(10);
										InterviewFriend.후니의_자존감지수_감소(5);
										
										후니.상태알림();
										
									}else if(goparty == 2) {
										Buttonbgm ButtonBgm5 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm5.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("축하파티에 불참하고 체력을 회복합니다.");
										InterviewFriend.후니의_체력지수_증가(15);
										InterviewFriend.후니의_자존감지수_감소(5);
										InterviewFriend.후니의_스트레스지수_증가(5);
										
										후니.상태알림();					
									}else {
										Buttonbgm ButtonBgm5 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm5.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("다시 입력하세요.");
										continue; 	
									}
									
								}else {
									System.out.println("랜덤이벤트가 없습니다.");
								}
							
							
					    }else if(일학기선택창 == 2) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println(" ");
					    	System.out.println("동네에 왔습니다.");
							System.out.println("동네에서 무엇을 하시겠습니까?");
							System.out.println("1. 헬스");
							System.out.println("2. 치맥");
							System.out.println("3. 뒤로가기");
							System.out.println(" ");
							
							int 동네선택창 = scan.nextInt();
							
							if(동네선택창 ==1) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        
						        System.out.println(" ");
						        
					    		String health[] = { // 타이핑 쓰레드 - 익명 클래스
		
	"	                                    .-;.",           
	"	                                   -$@@=, ",         
	"	                                 .~#@@@@=:  ",       
	"	                                -*@@@@@@@@*   ",     
	"	                               -$@@@@@@@@@@*    ",   
	"	                              ;#@@@@@@@@@@@@~     ", 
	"	                              -@@@@@@@@@@@@@#      ",
	"	                              .#@@@@@@@@@@@@@$.    ",
	"	                               ,#@@@@@@@@@@@@@*    ",
	"	                                :@@@@@@@@@@@@@$,   ",
	"	                                ,=@@@@@@@@@@@@@;   ",
	"	                          -!.    ,$@@@@@@@@@@@@$-  ",
	"	                         ~#@$    :@@@@@@@@@@@@@@~  ",
	"	                         :@@@. -#@@@@@@@@@@@@@@@~  ",
	"	                      .@@!;@$.   ;@@@@@@@@@@@@@@@, ",
	"	                    .,=@@;.,,$@@@!~#@@@@@@@@@@@@@, ",
	"	                   ,$@ =@!!@@@@@@@;!*=@@@@@@@@@@$, ",
	"	                   !@@;.@=;*@@@@@@@,  *@@@@@@@@=-  ",
	"	                   -#@@!;@=-~::!@@@*  ,#@@@@@#!,   ",
	"	         .;     .*=~=@@#-!@-;==!!@@@=  ;@@@@@-     ",
	"	        .#@;    ,@@#~#@@* .-#@#~#@@@@   !@@$.      ",
	"	       #@@@@:   ,@@@- @@=:@@@@.@@@@@@   .=,        ",
	"	     .$@@@@@#,   -##~..,-$@#*.#@@@@@=              ",
	"	   .!@@@@@@@@;   ---$@#!@@$- *@@@@@@               ",
	"	  .*@@@@@@@@@@;,;@@@@@@@$!;,,@@@@@@#               ",
	"	  ,@@@@@@@@@@@@=@@@@@@@#~-$~!@@@@@@$               ",
	"	  ,@@@@@@@@@@@@@@@@@@@:~*$@~~@@@@@@@               ",
	"	   ;@@@@@@@@@@@@@@@@@- $@@@#.@@@@@@@$              ",
	"	   ~@@@@@@@@@@@@@@@=, @@@@@@,@@@@@@@@$             ",
	"	   ~@@@@@@@@@@@@@@!    @@@@@@@@@@@@@@#.            ",
	"	    ;@@@@@@@@@@@@@*.   =$#@@@@@@@@@@@@$.           ",
	"	    ~#@@@@@@@@@@@@@:     -#@@@@@@@@@@@@=.          ",
	"	     !@@@@@@@@@@@@@*.     ~#@@@@@@@@@@@@~          ",
	"	     ,#@@@@@@@@@@@@@=.     =@@@@@@@@@@@@$,         ",
	"	      ,#@@@@@@@@@@@@@~     ,#@@@@@@@@@@@@$.        ",
	"	       -@@@@@@@@@@@@@@      .@@@@@@@@@@@@@-        ",
	"	        *@@@@@@@@@@@#.       @@@@@@@@@@@@@@        ",
	"	         *@@@@@@@@@~          #@@@@@@@@@@@!        ",
	"	          ;#@@@@@=~           .#@@@@@@@@#~         ",
	"	           -$@@@;              ;@@@@@@@$-          ",
	"	            -;!:               .*@@@@@;-           ",
	"	                                ,=@@!-             ",
	"	                                 ;:,            "
							    };
						        
							    for (int i = 0; i < health.length; i++) {
								      // 초 간 중지한다
								      Thread.sleep(0);
								      // 메세지를 출력한다
								      System.out.println(health[i]);
								}
							    
							    System.out.println(" ");
								System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
								System.out.println(" ");
								후니.헬스장();
								후니.상태알림();
								
							}else if(동네선택창 == 2) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
								후니.헬스장();
								후니.상태알림();
								String ChickenandBeer[] = { // 타이핑 쓰레드 - 익명 클래스

										"                       ,**~",               
										"....                  ,*  :;...!#=#.",      
										"!#@@#!,                !    ::::,   ;,",     
										"~@#-,,,$@!              -.            -~",     
										":#:-:!!!,;#=            ;!~            .;:",    
										".#*,!@@#@$,-#;          ;.                ;. ",  
										";$,,;:,,,:$-;@,         :                 .~ ",  
										"#~,,,,,,,-~-,#*         ;                 !.  ", 
										"#-,,,,,,,,,,,~=         .*-,,,  ,,,,,,,,,;;    ",
										"-*-,,,,,,,,,,,,@,          ;,,!  =,,,,,,,:~     ",
										"~*,,,,,,,,,,,,,@-          ~  !  $       -#=,   ",
										".=-,,,,,,,,,,,,=-          ~  *  # ,. ;  -~ !   ",
										" @~,,,,,,,,,,,,;!          ~   @#@ -. $  -@*.*  ",
										" *=,,,,,,,,,,,,;@          ~   * # -. $  --=.@  ",
										" ,@=,,,,,,,,,,,,$=         ~   * # -. $  --;,@  ",
										"  ~#*,,,,,,,,,,,:#-        ~   * # -. $  --*.@  ",
										"   ,##:,,,,,,,,,,@:        ~   * # -. $  -#$ $  ",
										"     *##;-,,,,,,:@$-       ~   * # -. $  -; !.  ",
										"      .-@#*-,,,:@~!@:-~    ~   * # -. $  -*$~   ",
										"         ;$@*::@;  ~$$=@~  ~   * # -. $  -~     ",
										"           -~=!*$!  ...-#. ~   * # -. $  --     ",
										"                ;#*    ,@- ~   ~ ! .  :  --     ",
										"                 ,@   *#=  ~.            -,     ",
										"                 ,@   $-   ~;           .*      ",
										"                  =!.:@-    -;;;;;;;;;;;;       ",
										"                  .@@@*                         ",
										    			      " .                      "
										     
								    };

							        
								    for (int i = 0; i < ChickenandBeer.length; i++) {
									      // 초 간 중지한다
									      Thread.sleep(100);
									      // 메세지를 출력한다
									      System.out.println(ChickenandBeer[i]);
									}
								    System.out.println(" ");
									System.out.println("치맥으로 스트레스를 풉니다.");
									후니.치맥();
									후니.상태알림();
								
							}else if(동네선택창 == 3) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
								후니.헬스장();
								후니.상태알림();
								continue;
							}else {
								System.out.println("다시 입력하세요."); 
								continue; 						 
							}
							
							// (동네) 고등학교 친구에게 안부전화 올 확률 10% 
							
							Character HighschoolFriend = new Character(); 
							HighschoolFriend.관계 = "고등학교 친구";
							
							if(HighschoolFriend.HiCall()) {
								EventBgm EventBgm = new EventBgm();
								
						        try {
						        	EventBgm.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("동네 랜덤 이벤트 <고등학교 친구의 안부전화>");
								System.out.println("잊고 있던 고등학교 친구에게 전화가 옵니다.");
								System.out.println("1. 전화를 받는다. ");
								System.out.println("2. 전화를 받지 않는다. ");

								//객체.객체함수다. 객체의 기능!	
								
								int 안부전화선택창 = scan.nextInt();
								
								if(안부전화선택창 == 1) {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
									후니.헬스장();
									후니.상태알림();
									System.out.println("[고등학교 친구] 어 후니야! 아까 동네에서 너 본 것 같아서 전화했어!");	
									System.out.println("[고등학교 친구] 잘 지내고 있었지?");	
									System.out.println("[고등학교 친구] 전역한 이후로 한 번도 못봤는데! 보고 싶다야!");
									System.out.println("[후니] 말할 틈도 안주네!");
									System.out.println("[후니] 나도 보고 싶다야!");
									
									HighschoolFriend.후니의_체력지수_증가(10);
									HighschoolFriend.후니의_자존감지수_증가(10);
									HighschoolFriend.후니의_스트레스지수_감소(10);
									
									후니.상태알림();
									
								}else if(안부전화선택창 == 2) {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
									후니.헬스장();
									후니.상태알림();
									System.out.println("[후니] 아 무슨 일이지.. 요즘 사람들 만나기 싫은데..");
									HighschoolFriend.후니의_자존감지수_감소(10);
									HighschoolFriend.후니의_스트레스지수_증가(10);
									
									후니.상태알림();					
								}else {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
									후니.헬스장();
									후니.상태알림();
									System.out.println("다시 입력하세요."); 
									continue; 	
								}
								
							}else {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
								후니.헬스장();
								후니.상태알림();
								System.out.println("랜덤이벤트가 없습니다.");
							}
							
					    }else if(일학기선택창 == 3) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
							후니.헬스장();
							후니.상태알림();
							System.out.println(" ");
					    	System.out.println("집에 왔습니다.");
							System.out.println("집에서 무엇을 하시겠습니까?");
							System.out.println("1. 부모님과 식사");
							System.out.println("2. 일기쓰기");
							System.out.println("3. 낮잠자기");
							System.out.println("4. 뒤로가기");
							System.out.println(" ");
							
							int 집선택창 = scan.nextInt();
							
							if(집선택창 ==1) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        String parents[] = {
										"부모님과 식사하며 취업 관련 이야기를 합니다.",
										"[부모님] 취업준비는 좀 잘 되고 있니?",
										"[후니] 나름대로 열심히 하고 있어요 ㅎㅎ",
										"[부모님] 그래그래 넌 혼자 알아서 잘 하리라 믿는다 ㅎㅎ ",
										"[후니] (후.. 이렇게나 날 믿어주시는데 잘 안되네 ㅠㅠ) ",
										"[부모님] 밥 많이 먹고 힘내라 아들",
										" "
								};
								
								for (int i = 0; i <parents.length; i++) {
									Thread.sleep(500);//0.5초마다 한 문장씩 출력
									System.out.println(parents[i]);
								}
								System.out.println(" ");

								후니.부모님과식사();
								System.out.println(" ");
								
								RelativeClass relative = new RelativeClass();
								relative.RelativeCome();
								relative.join(); 
								
								후니.상태알림();
								
							}else if(집선택창 == 2) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }

								 String Diary[] = { // 타이핑 쓰레드 - 익명 클래스

								 		  ".*=~.,,,,,,,--,,,....  --,.............~!.-=-",   
										  ",$~,..,,,,,,,--,.....  --,..... ... ...~!. ;,",   
										  ",$~,.,,,,,,,,,-,.....  --,....  ... ...~!. ;,  ", 
										  ",$~,,,,,,,,,,,-,.....  --,....  ..  ...~!. ;-   ",
										  ",$~,,,,,,,,,,,-,,....  --,....   . . ..~;. ;,   ",
										  ",$~,,,,,,,,,,,-,,....  --,....       ..~;. ;,   ",
										  ",$~,,,,,,,,,,,,,,....  --,....       ..~;. ;,   ",
										  ",$~,,,,,--,,,,,,,....  --,..... .... ..~!. ;,   ",
										  ",$~,,,,,~;,,,,,,,....  --,.....  ..  ..:!. ;,   ",
										  ",$~,,,,-:;,,,,,,,....  --,....   ......:!. ;,   ",
										  ",$~,,,,-;!-,,,,,,....  --,....  .......;!. ;,   ",
										  ",$~,,,,-;!~,,,,,,....  --,....    ... .;!. ;,   ",
										  ",$~,,,,~;!~,,,,,,....  --,.....  ......;!..;,   ",
										  ",$~,,,,~;!~,,,,,,...   --,..... ..... .;!..!-   ",
										  ",$~,,,-~;!~,,,,,,...   --,.....  .... .;!. ;,   ",
										  ",$~,,,-~;!~,,,,,,....  --,............,;;. ;,   ",
										  ",$~,,,-~;!~,,,,,,....  --,.......... .,!!. ;,   ",
										  ",$~,,,-~;!~,,,,,,....  --,.......... .,!!. ;,   ",
										  ",$~,,,-~;!-,,,,,,....  --,............,!!. ;,   ",
										  ",$~,,,-~;!-,-,,,,.... .--,.......... .,!!. !-   ",
										  ",$~,,,-~;!-,-,,,,....  --,............,!!. ;,   ",
										  ",$~,,,-~;!,,--,,,,... .--,............,!!. !,   ",
										  ",$~,,,-~;!,,--,,,,... .--,............,!!. ;,   ",
										  ",$~,,,-~;!,,--,,,,... .--,............,*!. ;,   ",
										  ",$~,,,-~;!,,---,,,... .--,............,!!. ;,   ",
										  ",$~,,,-~;!,,---,,,... .--,............,*!..;,   ",
										  ",$~,,,-~!!,,---,,,,....--,............-*!..;,   ",
										  ",$~,,,-~!!,----,,,,....~-,............-$!..;,   ",
										  ",@#$$$$##!$$$$$$$$$$$=$=$$$$$$$$=====*$@#==$-   ",
										  " ..,.....!......-,..................  ... ..    ",
										  "         !      ::                          ",
									     
							    };

						        
							    for (int i = 0; i < Diary.length; i++) {
								      // 초 간 중지한다
								      Thread.sleep(100);
								      // 메세지를 출력한다
								      System.out.println(Diary[i]);
								}
							    System.out.println(" ");
							    System.out.println("일기를 쓰며 하루를 점검하고 스스로를 보살핍니다.");
								후니.일기();
								후니.상태알림();
								
					    	}else if(집선택창 == 3) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }

					    		String nap[] = { // 타이핑 쓰레드 - 익명 클래스
					    				"		                              .                   ",
					    				"		                              .;:;-               ",  
					    				"		                             ,:.  ~-              ",  
					    				"		                             ~     ;.             ",
					    				"		                             ~  .  ~.             ",
					    				"		                             ~     ;.             ",  
					    				"		                             ,;   ~-              ",  
					    				"		                              ,~~~-                 ",
					    				"		                                                    ",
					    				"		                                                    ",
					    				"		                                                    ",
					    				"		                                                    ",
					    				"		                                                    ",
					    				"		                                                    ",
					    				"		                        ;!;~ ----,.                 ",
					    				"		                       -**;~ ::;:~~-.               ",
					    				"		                       !**~, ~  ~~~~~-              ",
					    				"		                       !*;,  -  -~~~~~-.            ",
					    				"		                       -*.   .  ,~~~~~~-            ",
					    				"		                  .   .,;:,,,   ,~~~~~~~,           ",
					    				"		                      .,,,,,,   .:~~~~~~~           ",
					    				"		                                 -~~~~~~~.          ",
					    				"		                             .,  -~:::~~~,          ",
					    				"		                          .~::! .::::::::-          ",
					    				"		                          -:::; ,::::::::~          ",
					    				"		                          ~:::~ -::::::::-          ",
					    				"		                          ~::-. --~~~::::.          ",
					    				"		                          ~::.                      ",
					    				"		                          :::.                      ",
					    				"		                         .:::-                      ",
					    				"		                         .::;-                      ",
					    				"		                         ,::;,                      ",
					    				"		                         -::;.                      ",
					    				"		                         ~::;                       ",
					    				"		                         ..--                       ",
					    				"		                       ,!;-:!                       ",
					    				"		                     ~*=====!                       ",
					    				"		                     -:;;;;~.    					",
					    				""
					    										    };
					    									        
									    for (int i = 0; i < nap.length; i++) {
										      // 초 간 중지한다
										      Thread.sleep(100);
										      // 메세지를 출력한다
										      System.out.println(nap[i]);
										}
									    System.out.println(" ");
									    
							    		System.out.println("낮잠을 통해 부족한 체력을 충전합니다.");
							    		후니.낮잠();
							    		후니.상태알림();
					    		
					    	}else if(집선택창 == 4) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }

								continue;
							}else {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }

								System.out.println("다시 입력하세요."); 
								continue; 						
							}
							
							//(집) 동생의 병간호를 해야합니다.
							Character Bro = new Character(); 
							Bro.관계 = "남동생";
							
							if(Bro.gohospital()) {
								EventBgm EventBgm = new EventBgm();
								
						        try {
						        	EventBgm.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("집 랜덤 이벤트 <동생의 입원>");
								System.out.println("동생이 입원했습니다.");
								System.out.println("병간호를 하시겠습니까?");
								System.out.println("1. 병간호를 한다.");
								System.out.println("2. 하지 않는다.");

								//객체.객체함수다. 객체의 기능!	
								
								int 병간호선택창 = scan.nextInt();
								
								if(병간호선택창 == 1) {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }

									
									System.out.println("[후니] (후.. 취준에 집안일까지..)");	
									System.out.println("[후니] 조심 좀 하지 그랬어 ㅠㅠ");	
									Bro.후니의_체력지수_감소(5);
									Bro.후니의_스트레스지수_증가(5);
									후니.상태알림();
									
								}else if(병간호선택창 == 2) {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[후니] 너무 바빠.. 하반기 준비해야해..ㅠㅠ");
									Bro.후니의_스트레스지수_증가(5);
									Bro.후니의_자존감지수_감소(5);
									후니.상태알림();					
								}else {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("다시 입력하세요.");
									continue; 	
								}
								
							}else {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("랜덤이벤트가 없습니다.");
							}
							
					    }else if(일학기선택창 == 4) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
					    	continue;
					    }else {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println("다시 입력하세요.");
					    	continue;
					    }
					    
					}
					
					OCT ++;	
					
				}else if(메인메뉴선택창 == 2){
					Buttonbgm ButtonBgm2 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm2.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
				
					후니.상태알림();
					
				}else if(메인메뉴선택창 == 3) {
					Buttonbgm ButtonBgm2 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm2.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
						
					System.out.println("취준을 포기하시겠습니까?");
					System.out.println("1. 네");
					System.out.println("2. 아니오");
					
					int 취준포기선택창 = scan.nextInt();
					
					if(취준포기선택창 ==1) {
						Buttonbgm ButtonBgm3 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm3.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println("10월 취업준비를 포기합니다.");					
						
//						FinishBgm FinishBgm = new FinishBgm(); // 취준포기하면 피니시브금 나오게!
//						FinishBgm.start();
//						
//				        try {
//				        	 FinishBgm.LoadBgm();
//				             Thread.sleep(0);
//				        }catch(InterruptedException e) {
//				             e.printStackTrace();
//				        
//				        }
						
						break;

					}else if(취준포기선택창 == 2) {
						Buttonbgm ButtonBgm3 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm3.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						continue;
					}else {
						Buttonbgm ButtonBgm3 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm3.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println("다시 입력하세요."); // 취준을 포기하시겟습니까?가 뜨도록. 맨처음 메인메뉴창이 아니라.
						continue; 						   // 이 if문을 while문 안에 넣게 되면 취준포기선택창 == 2가 1.활동 2. 상태확인 3. 취준포기가 나와야
					}
					
				}else {
					System.out.println("다시 입력하세요.");
					continue;
				}

			}
			
			System.out.println("하반기채용 서류 제출 주간입니다.");
			System.out.println("서류를 제출하시겠습니까?");
			
			int Apply;
			Apply = 0;
			
			while(Apply<1) {
				Buttonbgm ButtonBgm1 = new Buttonbgm();
				
		        try {
		        	 ButtonBgm1.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
			System.out.println("1번 : 제출한다");
			System.out.println("2번 : 취준포기");
					
			int Apply2 = scan.nextInt();
			
			if(Apply2 == 1) {
	 			 
				 System.out.println(" ");
				 String JopPhoto[] = { // 타이핑 쓰레드 - 익명 클래스

							"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!!!!!!!!!*==$====!!!!!!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!!!!!!=@#@@@##@###**!!!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!!!!$@@#@@@@@@#$==$$=!!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!!#@@@@@@@@@@#########!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!$@@@@@@@@##$####$$$###*!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!$@@@@@@@@#######$#$$$#@#!!!!!!!!!!!!!",
							"!!!!!!!!!!!!*@@@@@@@@#####@##$$#$###@$!!!!!!!!!!!!",
							"!!!!!!!!!!!!#@@@@#@#@@##$####$#$$###@@!!!!!!!!!!!!",
							"!!!!!!!!;!;!@@@@#####@##$$$$#$##$$#$#@$!!!!!!!!!!!",
							"!!!!!!!;;;;@#@########$$*$$$$=###$###@@!!!!!!!!!!!",
							"!!!!!!;;;;!@########$$==$$$$$####$$###@!!!!!!!!!!!",
							"!!!;;;;;;;!####$$$$$=====$###$########@*!!!!!!!!!!",
							";!;;;;;;;;*###$$$=*====$#$############@*;!!!!!!!!!",
							";;;;;;;;;;*###$===*=$$==###############*;;;;!!!!!!",
							";;;;;;;;;;=####===*=#$*!$$$###########@!;;;;;!!!!!",
							";;;;;;;;;;*@##=**!;:*=*::**;*$#######@#!;;;;;;;!!!",
							";;;;;;;;;;!@#!!-:-,,-..   ..~!=$#####@@;;;;;;;;;!!",
							";;;;;;;;;;;##:..----,,.    .-~::;**####;;;;;;;;;;;",
							";;;;;;;;;;;#$:..., ,~      ..=..;:;=#@$;;;;;;;;;;;",
							";;;;;;;;:::$#;.~.    --   .   ..,~:!#@=;;;;;;;;;;;",
							";;;;;;;:::-,:!~...-~*-, .:..-#;~--;*$=;;;;;;;;;;;;",
							";;;;;::::;.. ;~   ..~,.:.,!.,!,-,,-:*~:;::;;;;;;;;",
							";;;;::::::   ~.      ..   !  .....-:!~;;:::;;;;;;;",
							";;;:::::::  -,..      :,  :,    ..-:!~~::::::;;;;;",
							";;;:::::::-  ,...     .   --    .,-:;:::::::::;;;;",
							";:::::::~~:  ,. ~.  , .   -~...-.,-:;*:~~::::::;;;",
							";::::::~~~~  ,,           ,-,  ..,~:!:;~~~::::::;;",
							"::::::~~~~~~ .,.       ...--~   .,~::~~~~~~~:::::;",
							":::::~~~~~~-~ -.        .-~--. ..-~;~~-~~~~~~:::::",
							"::::~~~~~-----~..         .,,...,-~;-----~~~~~::::",
							":::~~~~-------~..         ..,,..,-~!------~~~~~:::",
							"::~~~~-----,,,~..   .,....,-~-,,,-~~,------~~~~~::",
							":~~~~-----,,,,,-..       ..,-..,--:-,,,-----~~~~~:",
							":~~~-----,,,,,,:,.     .,.,-,.,,-~;,,,,,,----~~~~:",
							"~~~----,,,,,,..,~,.      .....,-~:,..,,,,,----~~~~",
							"~~~---,,,,,.....:~,.       ...,~:;....,,,,,----~~~",
							"~~---,,,,,......-~~,      ...,~:;;......,,,,---~~~",
							"~---,,,,,.......,,~~-. ...,,,-:::!.......,,,,---~~",
							"~---,,,,........~..-~~---~~~~::::;........,,,----~",
							"---,,,......... -...,-~~~~~~:~~~~;.........,,,---~",
							"--,,,,........ :.. ....,--~~~~~~~;*~.......,,,,--~",
							"-,,,,.......  ,* .  ..   .,-~~~~:~:#-.......,,,---",
							"-,,,......   .$,    ...   ,-----~-~$#~.......,,,--",
							",,,.......  ~$$.     ... .,--,,,,,-=##$.......,,--",
							",,,...... -*$$$.   . ....,,,,,-.,,-=####*.....,,,-",
							",,.....:;$$$##$,       ....,,,...,-$######!;...,,-",
							",,..~;$$$$$$$$$*         ...- ....-$########$=::,,",
							"-~$$#$$$#$$$$$$=        ...,  ...,~$########$##$#$",
							"##$#$###$#$#$$$=        ..,   ....-$$####$$##$#$$#",
							"##$#$$$#####$$$=    *!=$$$$$**....:$$$$$######$$##",
							"#$$$$$$$#$$$#$$$..-*$$$$$$#$##=--.=$#$$$##$$##$##$",
							"$$$$$#$$$$$$$$$:,.,$$$$$$$###:-,-=$$##$#####$$###",
							"$$$$$$$$$$$$$$$,   .$##$$##$:~. .=$$$$#$######$$$",
							"$$$$$$#$$$$$$$$$,    -$$$$#$;~.  ,$$##$###$$#$##$$",
							"$#$$$$$$#$$$$$$,     ~$$##*:,   ,$$####$####$$###",
							"$$$$$#$$#$$$$#$~     ~$###;-.   ,$$$##$#$#$#$$$$$",
							"$$$$#$$$#$$$$$$:     *$#$$=-   .;$$$$##$$####$#$$",
							"$$$##$#$$$#$$#$!.   .$##$$=- ...$$$##$$$$$####$$$",
							"$$$#####$=$$$$$$.   *=####$~. ..$##$#$$#$#$#$#$#$",
							"#$$$$$$$$$$$$$#$$,   *$#$$$$:. .-$$#$$#$$###$##$$#",
							"$$$$$$$#$$$$$$$$,  .*$#$$$$*,  ~=$##$$$$#$$$$#$#$"
					     
			    };

		        
			    for (int i = 0; i < JopPhoto.length; i++) {
				      // 초 간 중지한다
				      Thread.sleep(100);
				      // 메세지를 출력한다
				      System.out.println(JopPhoto[i]);
				}
			    System.out.println(" ");
				

				
				System.out.println("내 서류지수와 은행 커트라인과 비교합니다.");
				System.out.println(" ");
				
				if(후니.후니_서류지수>=한쿡은행인사팀.서류지수_커트라인) {
					
			        //패스브금 (로딩브금과 동일)
				   	LoadingBgm passBgm01 = new LoadingBgm();
			          
			        try {
			             passBgm01.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					
					System.out.println("===========================================================");
					System.out.println(" ");
					
					String PASS[] = { // 타이핑 쓰레드 - 익명 클래스
				            "______   ___   _____  _____ ",    
				            "| ___ \\ / _ \\ /  ___|/  ___|",
				            "| |_/ // /_\\ \\\\ `--. \\ `--. ",
				            "|  __/ |  _  | `--. \\ `--. \\",
				            "| |    | | | |/\\__/ //\\__/ /",
				            "\\_|    \\_| |_/\\____/ \\____/"
				    };

			        
				    for (int i = 0; i < PASS.length; i++) {
					      // 초 간 중지한다
					      Thread.sleep(450);
					      // 메세지를 출력한다
					      System.out.println(PASS[i]);
					} 
					System.out.println(" ");
					System.out.println("서류전형에 합격하였습니다!!");
					System.out.println("필기전형을 준비하세요!!");
					System.out.println("===========================================================");
					
					break ;
					
				}else {

					System.out.println("귀하는 아쉽게도 금번 신규직원 채용 서류심사에서 불합격하였습니다.");
					System.out.println("게임이 종료되었습니다."); 
					
				
					GoodbyeWorldBgm GoodbyeWorldBgm = new GoodbyeWorldBgm();
					
			        try {
			        	GoodbyeWorldBgm.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					
					String GameEnd[] = { // 타이핑 쓰레드 - 익명 클래스
							
							
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@=;:;;;;:=#@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@#-*@@@@@@@@@@@$-*@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@*;@@@@@@@@@@@@@@@@@=;#@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@!!@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@@@@",
	"@@@@@@@@@@#;@@@@@@@@@@@@@@@@@@@@@@@@@=*@@@@@@@@@@@",
	"@@@@@@@@@$$@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@@",
	"@@@@@@@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
	"@@@@@@@*#@@@@@~~~~~~$@@@@@@@@@@@*~!@@@@@@;@@@@@@@@",
	"@@@@@@$#@@@@@@      =@@@@@@@@@@@: ~@@@@@@@;@@@@@@@",
	"@@@@@@=@@@@@@@  !@@@@@;** ;@@#.,: ~@@@@@@@@=@@@@@@",
	"@@@@@~@@@@@@@@      ##     *@     ~@@@@@@@@=@@@@@@",
	"@@@@*@@@@@@@@@      ##  @. != .@- ~@@@@@@@@@~@@@@@",
	"@@@@!@@@@@@@@@  !@@@@#  @, !! ~@: ~@@@@@@@@@@#@@@@",
	"@@@=#@@@@@@@@@      ;#  @, !@  $  ~@@@@@@@@@@;@@@@",
	"@@@!@@@@@@@@@@      ;#  @, *@-  ; ~@@@@@@@@@@=@@@@",
	"@@@!@@@@@@@@@@@@@@@@@@@@@@@@@@#@@@@@@@@@@@@@@@=@@@",
	"@@#$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
	"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
	"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@#@@@@@@$-  -=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@#$@@@@#      =@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*@@@",
	"@@@;@@@@, .@@ ;$@@-..~@@~~@,.@=.-@@@~.,$@@@@@#$@@@",
	"@@@!@@@@  ;@!!!*@     ~@         !@  .  :@@@@*@@@@",
	"@@@$#@@@  !@   ,@!:#!  @  ;=  @- -*  *:  @@@@;@@@@",
	"@@@@!@@@. -@=! ,@~  ;  @  *#  @~ -!  ,,,,@@@@@@@@@",
	"@@@@$@@@;  ..  ,@  @,  @  *#  @~ -$  #~ .@@@-@@@@@",
	"@@@@@-@@@-    -@@   -  @  *#  @~ -@:   .@@@*@@@@@@",
	"@@@@@@!@@@@##@@@@@#@@@@@@@@@@@@@@@@@@#@@@@#=@@@@@@",
	"@@@@@@$=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@@@@@",
	"@@@@@@@*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@",
	"@@@@@@@@=$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
	"@@@@@@@@@$!@@@@@@@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@",
	"@@@@@@@@@@@;@@@@@@@@@@@@@@@@@@@@@@@@@:$@@@@@@@@@@@",
	"@@@@@@@@@@@@$:@@@@@@@@@@@@@@@@@@@@@$;@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@=!$@@@@@@@@@@@@@@@#*;@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@#!!*#@@@@@@@#=!!=@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@#$=***=$#@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
							                                                       
				    };

			        
				    for (int i = 0; i < GameEnd.length; i++) {
					      // 초 간 중지한다
					      Thread.sleep(250);
					      // 메세지를 출력한다
					      System.out.println(GameEnd[i]);
					} 
				   	    
					
	//게임이 종료되어야      
					System.exit(0);
					
//					FinishBgm FinishBgm = new FinishBgm(); // 취준포기하면 피니시브금 나오게!
////					FinishBgm.start();
//					
//			        try {
//			        	 FinishBgm.LoadBgm();
//			             Thread.sleep(0);
//			        }catch(InterruptedException e) {
//			             e.printStackTrace();
//			        }
//					System.out.println("finish");
					
				}
				
				
				
			}else if(Apply2 == 2) {
				GoodbyeWorldBgm GoodbyeWorldBgm = new GoodbyeWorldBgm();
				GoodbyeWorldBgm.join();
				
		        try {
		        	GoodbyeWorldBgm.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
				String GameEnd[] = { // 타이핑 쓰레드 - 익명 클래스

	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@=;:;;;;:=#@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@#-*@@@@@@@@@@@$-*@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@*;@@@@@@@@@@@@@@@@@=;#@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@!!@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@@@@",
	"@@@@@@@@@@#;@@@@@@@@@@@@@@@@@@@@@@@@@=*@@@@@@@@@@@",
	"@@@@@@@@@$$@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@@",
	"@@@@@@@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
	"@@@@@@@*#@@@@@~~~~~~$@@@@@@@@@@@*~!@@@@@@;@@@@@@@@",
	"@@@@@@$#@@@@@@      =@@@@@@@@@@@: ~@@@@@@@;@@@@@@@",
	"@@@@@@=@@@@@@@  !@@@@@;** ;@@#.,: ~@@@@@@@@=@@@@@@",
	"@@@@@~@@@@@@@@      ##     *@     ~@@@@@@@@=@@@@@@",
	"@@@@*@@@@@@@@@      ##  @. != .@- ~@@@@@@@@@~@@@@@",
	"@@@@!@@@@@@@@@  !@@@@#  @, !! ~@: ~@@@@@@@@@@#@@@@",
	"@@@=#@@@@@@@@@      ;#  @, !@  $  ~@@@@@@@@@@;@@@@",
	"@@@!@@@@@@@@@@      ;#  @, *@-  ; ~@@@@@@@@@@=@@@@",
	"@@@!@@@@@@@@@@@@@@@@@@@@@@@@@@#@@@@@@@@@@@@@@@=@@@",
	"@@#$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
	"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
	"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@#@@@@@@$-  -=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@#$@@@@#      =@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*@@@",
	"@@@;@@@@, .@@ ;$@@-..~@@~~@,.@=.-@@@~.,$@@@@@#$@@@",
	"@@@!@@@@  ;@!!!*@     ~@         !@  .  :@@@@*@@@@",
	"@@@$#@@@  !@   ,@!:#!  @  ;=  @- -*  *:  @@@@;@@@@",
	"@@@@!@@@. -@=! ,@~  ;  @  *#  @~ -!  ,,,,@@@@@@@@@",
	"@@@@$@@@;  ..  ,@  @,  @  *#  @~ -$  #~ .@@@-@@@@@",
	"@@@@@-@@@-    -@@   -  @  *#  @~ -@:   .@@@*@@@@@@",
	"@@@@@@!@@@@##@@@@@#@@@@@@@@@@@@@@@@@@#@@@@#=@@@@@@",
	"@@@@@@$=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@@@@@",
	"@@@@@@@*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@",
	"@@@@@@@@=$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
	"@@@@@@@@@$!@@@@@@@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@",
	"@@@@@@@@@@@;@@@@@@@@@@@@@@@@@@@@@@@@@:$@@@@@@@@@@@",
	"@@@@@@@@@@@@$:@@@@@@@@@@@@@@@@@@@@@$;@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@=!$@@@@@@@@@@@@@@@#*;@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@#!!*#@@@@@@@#=!!=@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@#$=***=$#@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
						                                                       
			    };

		        
			    for (int i = 0; i < GameEnd.length; i++) {
				      // 초 간 중지한다
				      Thread.sleep(250);
				      // 메세지를 출력한다
				      System.out.println(GameEnd[i]);
				} 
				
				System.out.println("취준을 포기했습니다.");
				System.out.println("게임이 종료되었습니다.");
				
	//게임이 종료되어야
				
				System.exit(0);
				
				break;
				
								
			}else {
				Buttonbgm ButtonBgm2 = new Buttonbgm();
				
		        try {
		        	 ButtonBgm2.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
				System.out.println("다시 입력하세요.");
				 
				continue;
			}
			Apply++;
			}
			
			System.out.println("11월입니다.");
			System.out.println("11월 마지막 주에 있는 필기전형을 준비합시다.");
			
			
			int NOV = 1; // 11월 세 턴! 후 필기 전형!!
			
			while (NOV <= 3) {
				Buttonbgm ButtonBgm1 = new Buttonbgm();
				
		        try {
		        	 ButtonBgm1.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
				System.out.println(" ");
				System.out.println("< 메인메뉴 > ");
				System.out.println("1. 활동"); // 1번 활동, 2번 상태확인, 3번 취준포기
				System.out.println("2. 상태확인");
				System.out.println("3. 11월 취준포기");
				System.out.println(" ");
						
				int 메인메뉴선택창 = scan.nextInt();
				
				if ( 메인메뉴선택창 == 1) {

					if (true) {
						Buttonbgm ButtonBgm2 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm2.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println(" ");
						System.out.println("4학년 2학기 11월 : " + NOV + "/3" + "번째 턴입니다.");
						System.out.println("어디에 가시겠습니까?");
						System.out.println("1. 학교에 간다");
						System.out.println("2. 동네에 간다");
						System.out.println("3. 집에 간다");
						System.out.println("4. 뒤로가기");
						System.out.println("<< 학교, 동네, 집 각각 일정확률로 이벤트가 튀어나옵니다. >>");

						System.out.println(" ");
						
						int 일학기선택창 = scan.nextInt();

					    if (일학기선택창 == 1) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println(" ");
					    	System.out.println("학교에 왔습니다.");
							System.out.println("학교에서 무엇을 하시겠습니까?");
							System.out.println("1. 학점관리");
							System.out.println("2. 금융동아리활동");
							System.out.println("3. 취업지원본부 컨설팅");
							System.out.println("4. 면접스터디");
							System.out.println("5. 뒤로가기");
							System.out.println(" ");

							int 학교선택창 = scan.nextInt();
							
							if(학교선택창 ==1) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        System.out.println("후.. 전공공부 열심히 해야지!!");
								System.out.println("학교에서 열심히 학점관리를 합니다.");
								후니.학점관리();
								
								System.out.println(" ");
								
								SomethingGirl SomethingGirl = new SomethingGirl();

								SomethingGirl.SomethingGirlCome();
								SomethingGirl.join(); 
								System.out.println(" ");
								
								후니.상태알림();
								
							}else if(학교선택창 == 2) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("동아리에서 선배들에게 취업꿀팁을 얻습니다.");
								후니.금융동아리모임_참석();
								System.out.println(" ");
								
								CircleBroThread CircleBro = new CircleBroThread();

								CircleBro.CircleBroCome();
								CircleBro.join(); 
								System.out.println(" ");
								후니.상태알림();
								
							}else if(학교선택창 == 3) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("취업지원본부에서 컨설팅을 받습니다.");
								후니.취업지원본부_컨설팅();
								후니.상태알림();
								
							}else if(학교선택창 == 4) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("면접스터디를 통해 면접역량을 강화시킵니다.");
								후니.면접스터디_참석();
								
								InterviewStudyMember Studymember= new InterviewStudyMember();

								Studymember.GoFeedback();
								Studymember.join(); 
								
								후니.상태알림();
								
							}else if(학교선택창 == 5) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								continue;
						
							}else {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("다시 입력하세요."); 
								continue; 						 
							}
							
							// (학교) 취업스터디원 먼저 합격해서 쫑파티 열 확률 10%

//							int 멘토링횟수;
//							멘토링횟수 = 0;
//							while(멘토링횟수<1)
							
							Character InterviewFriend = new Character(); 
							InterviewFriend.관계 = "취업스터디원";
							
								if(InterviewFriend.SuccessFirst()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									
									System.out.println("학교 랜덤 이벤트 <취업스터디원이 먼저 합격했습니다.>");
									System.out.println("축하파티에 참여하시겠습니까?");
									System.out.println("1. 참여");
									System.out.println("2. 불참");
		
									//객체.객체함수다. 객체의 기능!	
									
									int goparty = scan.nextInt();
									
									if(goparty == 1) {
										Buttonbgm ButtonBgm4 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm4.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("축하파티에 참여해 많은 조언들을 얻습니다.");	
										InterviewFriend.후니의_서류지수_증가(5);
										InterviewFriend.후니의_필기지수_증가(5);
										InterviewFriend.후니의_면접지수_증가(5);
										InterviewFriend.후니의_체력지수_감소(10);
										InterviewFriend.후니의_자존감지수_감소(5);
										
										후니.상태알림();
										
									}else if(goparty == 2) {
										Buttonbgm ButtonBgm4 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm4.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("축하파티에 불참하고 체력을 회복합니다.");
										InterviewFriend.후니의_체력지수_증가(15);
										InterviewFriend.후니의_자존감지수_감소(5);
										InterviewFriend.후니의_스트레스지수_증가(5);
										
										후니.상태알림();					
									}else {
										Buttonbgm ButtonBgm4 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm4.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("다시 입력하세요.");
										continue; 	
									}
									
								}else {
									System.out.println("랜덤이벤트가 없습니다.");
								}
							
							
					    }else if(일학기선택창 == 2) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println(" ");
					    	System.out.println("동네에 왔습니다.");
							System.out.println("동네에서 무엇을 하시겠습니까?");
							System.out.println("1. 헬스");
							System.out.println("2. 치맥");
							System.out.println("3. 뒤로가기");
							System.out.println(" ");
							
							int 동네선택창 = scan.nextInt();
							
							if(동네선택창 ==1) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        
						        System.out.println(" ");
						        
					    		String health[] = { // 타이핑 쓰레드 - 익명 클래스
		
	"	                                    .-;.",           
	"	                                   -$@@=, ",         
	"	                                 .~#@@@@=:  ",       
	"	                                -*@@@@@@@@*   ",     
	"	                               -$@@@@@@@@@@*    ",   
	"	                              ;#@@@@@@@@@@@@~     ", 
	"	                              -@@@@@@@@@@@@@#      ",
	"	                              .#@@@@@@@@@@@@@$.    ",
	"	                               ,#@@@@@@@@@@@@@*    ",
	"	                                :@@@@@@@@@@@@@$,   ",
	"	                                ,=@@@@@@@@@@@@@;   ",
	"	                          -!.    ,$@@@@@@@@@@@@$-  ",
	"	                         ~#@$    :@@@@@@@@@@@@@@~  ",
	"	                         :@@@. -#@@@@@@@@@@@@@@@~  ",
	"	                      .@@!;@$.   ;@@@@@@@@@@@@@@@, ",
	"	                    .,=@@;.,,$@@@!~#@@@@@@@@@@@@@, ",
	"	                   ,$@ =@!!@@@@@@@;!*=@@@@@@@@@@$, ",
	"	                   !@@;.@=;*@@@@@@@,  *@@@@@@@@=-  ",
	"	                   -#@@!;@=-~::!@@@*  ,#@@@@@#!,   ",
	"	         .;     .*=~=@@#-!@-;==!!@@@=  ;@@@@@-     ",
	"	        .#@;    ,@@#~#@@* .-#@#~#@@@@   !@@$.      ",
	"	       #@@@@:   ,@@@- @@=:@@@@.@@@@@@   .=,        ",
	"	     .$@@@@@#,   -##~..,-$@#*.#@@@@@=              ",
	"	   .!@@@@@@@@;   ---$@#!@@$- *@@@@@@               ",
	"	  .*@@@@@@@@@@;,;@@@@@@@$!;,,@@@@@@#               ",
	"	  ,@@@@@@@@@@@@=@@@@@@@#~-$~!@@@@@@$               ",
	"	  ,@@@@@@@@@@@@@@@@@@@:~*$@~~@@@@@@@               ",
	"	   ;@@@@@@@@@@@@@@@@@- $@@@#.@@@@@@@$              ",
	"	   ~@@@@@@@@@@@@@@@=, @@@@@@,@@@@@@@@$             ",
	"	   ~@@@@@@@@@@@@@@!    @@@@@@@@@@@@@@#.            ",
	"	    ;@@@@@@@@@@@@@*.   =$#@@@@@@@@@@@@$.           ",
	"	    ~#@@@@@@@@@@@@@:     -#@@@@@@@@@@@@=.          ",
	"	     !@@@@@@@@@@@@@*.     ~#@@@@@@@@@@@@~          ",
	"	     ,#@@@@@@@@@@@@@=.     =@@@@@@@@@@@@$,         ",
	"	      ,#@@@@@@@@@@@@@~     ,#@@@@@@@@@@@@$.        ",
	"	       -@@@@@@@@@@@@@@      .@@@@@@@@@@@@@-        ",
	"	        *@@@@@@@@@@@#.       @@@@@@@@@@@@@@        ",
	"	         *@@@@@@@@@~          #@@@@@@@@@@@!        ",
	"	          ;#@@@@@=~           .#@@@@@@@@#~         ",
	"	           -$@@@;              ;@@@@@@@$-          ",
	"	            -;!:               .*@@@@@;-           ",
	"	                                ,=@@!-             ",
	"	                                 ;:,            "
							    };
						        
							    for (int i = 0; i < health.length; i++) {
								      // 초 간 중지한다
								      Thread.sleep(0);
								      // 메세지를 출력한다
								      System.out.println(health[i]);
								}
							    
							    System.out.println(" ");
								System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
								System.out.println(" ");
								후니.헬스장();
								후니.상태알림();
								
							}else if(동네선택창 == 2) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								String ChickenandBeer[] = { // 타이핑 쓰레드 - 익명 클래스

										"                       ,**~",               
										"....                  ,*  :;...!#=#.",      
										"!#@@#!,                !    ::::,   ;,",     
										"~@#-,,,$@!              -.            -~",     
										":#:-:!!!,;#=            ;!~            .;:",    
										".#*,!@@#@$,-#;          ;.                ;. ",  
										";$,,;:,,,:$-;@,         :                 .~ ",  
										"#~,,,,,,,-~-,#*         ;                 !.  ", 
										"#-,,,,,,,,,,,~=         .*-,,,  ,,,,,,,,,;;    ",
										"-*-,,,,,,,,,,,,@,          ;,,!  =,,,,,,,:~     ",
										"~*,,,,,,,,,,,,,@-          ~  !  $       -#=,   ",
										".=-,,,,,,,,,,,,=-          ~  *  # ,. ;  -~ !   ",
										" @~,,,,,,,,,,,,;!          ~   @#@ -. $  -@*.*  ",
										" *=,,,,,,,,,,,,;@          ~   * # -. $  --=.@  ",
										" ,@=,,,,,,,,,,,,$=         ~   * # -. $  --;,@  ",
										"  ~#*,,,,,,,,,,,:#-        ~   * # -. $  --*.@  ",
										"   ,##:,,,,,,,,,,@:        ~   * # -. $  -#$ $  ",
										"     *##;-,,,,,,:@$-       ~   * # -. $  -; !.  ",
										"      .-@#*-,,,:@~!@:-~    ~   * # -. $  -*$~   ",
										"         ;$@*::@;  ~$$=@~  ~   * # -. $  -~     ",
										"           -~=!*$!  ...-#. ~   * # -. $  --     ",
										"                ;#*    ,@- ~   ~ ! .  :  --     ",
										"                 ,@   *#=  ~.            -,     ",
										"                 ,@   $-   ~;           .*      ",
										"                  =!.:@-    -;;;;;;;;;;;;       ",
										"                  .@@@*                         ",
										    			      " .                      "
										     
								    };

							        
								    for (int i = 0; i < ChickenandBeer.length; i++) {
									      // 초 간 중지한다
									      Thread.sleep(100);
									      // 메세지를 출력한다
									      System.out.println(ChickenandBeer[i]);
									}
								    System.out.println(" ");
									System.out.println("치맥으로 스트레스를 풉니다.");
									후니.치맥();
									후니.상태알림();
								
							}else if(동네선택창 == 3) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								continue;
							}else {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("다시 입력하세요."); 
								continue; 						 
							}
							
							// (동네) 고등학교 친구에게 안부전화 올 확률 10% 
							
							Character HighschoolFriend = new Character(); 
							HighschoolFriend.관계 = "고등학교 친구";
							
							if(HighschoolFriend.HiCall()) {
								EventBgm EventBgm = new EventBgm();
								
						        try {
						        	EventBgm.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								
								System.out.println("동네 랜덤 이벤트 <고등학교 친구의 안부전화>");
								System.out.println("잊고 있던 고등학교 친구에게 전화가 옵니다.");
								System.out.println("1. 전화를 받는다. ");
								System.out.println("2. 전화를 받지 않는다. ");

								//객체.객체함수다. 객체의 기능!	
								
								int 안부전화선택창 = scan.nextInt();
								
								if(안부전화선택창 == 1) {
									Buttonbgm ButtonBgm5 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm5.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[고등학교 친구] 어 후니야! 아까 동네에서 너 본 것 같아서 전화했어!");	
									System.out.println("[고등학교 친구] 잘 지내고 있었지?");	
									System.out.println("[고등학교 친구] 전역한 이후로 한 번도 못봤는데! 보고 싶다야!");
									System.out.println("[후니] 말할 틈도 안주네!");
									System.out.println("[후니] 나도 보고 싶다야!");
									
									HighschoolFriend.후니의_체력지수_증가(10);
									HighschoolFriend.후니의_자존감지수_증가(10);
									HighschoolFriend.후니의_스트레스지수_감소(10);
									
									후니.상태알림();
									
								}else if(안부전화선택창 == 2) {
									Buttonbgm ButtonBgm5 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm5.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[후니] 아 무슨 일이지.. 요즘 사람들 만나기 싫은데..");
									HighschoolFriend.후니의_자존감지수_감소(10);
									HighschoolFriend.후니의_스트레스지수_증가(10);
									
									후니.상태알림();					
								}else {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("다시 입력하세요."); 
									continue; 	
								}
								
							}else {
								System.out.println("랜덤이벤트가 없습니다.");
							}
							
					    }else if(일학기선택창 == 3) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println(" ");
					    	System.out.println("집에 왔습니다.");
							System.out.println("집에서 무엇을 하시겠습니까?");
							System.out.println("1. 부모님과 식사");
							System.out.println("2. 일기쓰기");
							System.out.println("3. 낮잠자기");
							System.out.println("4. 뒤로가기");
							System.out.println(" ");

							int 집선택창 = scan.nextInt();
							
							if(집선택창 ==1) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        String parents[] = {
										"부모님과 식사하며 취업 관련 이야기를 합니다.",
										"[부모님] 취업준비는 좀 잘 되고 있니?",
										"[후니] 나름대로 열심히 하고 있어요 ㅎㅎ",
										"[부모님] 그래그래 넌 혼자 알아서 잘 하리라 믿는다 ㅎㅎ ",
										"[후니] (후.. 이렇게나 날 믿어주시는데 잘 안되네 ㅠㅠ) ",
										"[부모님] 밥 많이 먹고 힘내라 아들",
										" "
								};
								
								for (int i = 0; i <parents.length; i++) {
									Thread.sleep(500);//0.5초마다 한 문장씩 출력
									System.out.println(parents[i]);
								}
								System.out.println(" ");

								후니.부모님과식사();
								System.out.println(" ");
								
								RelativeClass relative = new RelativeClass();
								relative.RelativeCome();
								relative.join(); 
								
								후니.상태알림();
								
							}else if(집선택창 == 2) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								 String Diary[] = { // 타이핑 쓰레드 - 익명 클래스

								 		  ".*=~.,,,,,,,--,,,....  --,.............~!.-=-",   
										  ",$~,..,,,,,,,--,.....  --,..... ... ...~!. ;,",   
										  ",$~,.,,,,,,,,,-,.....  --,....  ... ...~!. ;,  ", 
										  ",$~,,,,,,,,,,,-,.....  --,....  ..  ...~!. ;-   ",
										  ",$~,,,,,,,,,,,-,,....  --,....   . . ..~;. ;,   ",
										  ",$~,,,,,,,,,,,-,,....  --,....       ..~;. ;,   ",
										  ",$~,,,,,,,,,,,,,,....  --,....       ..~;. ;,   ",
										  ",$~,,,,,--,,,,,,,....  --,..... .... ..~!. ;,   ",
										  ",$~,,,,,~;,,,,,,,....  --,.....  ..  ..:!. ;,   ",
										  ",$~,,,,-:;,,,,,,,....  --,....   ......:!. ;,   ",
										  ",$~,,,,-;!-,,,,,,....  --,....  .......;!. ;,   ",
										  ",$~,,,,-;!~,,,,,,....  --,....    ... .;!. ;,   ",
										  ",$~,,,,~;!~,,,,,,....  --,.....  ......;!..;,   ",
										  ",$~,,,,~;!~,,,,,,...   --,..... ..... .;!..!-   ",
										  ",$~,,,-~;!~,,,,,,...   --,.....  .... .;!. ;,   ",
										  ",$~,,,-~;!~,,,,,,....  --,............,;;. ;,   ",
										  ",$~,,,-~;!~,,,,,,....  --,.......... .,!!. ;,   ",
										  ",$~,,,-~;!~,,,,,,....  --,.......... .,!!. ;,   ",
										  ",$~,,,-~;!-,,,,,,....  --,............,!!. ;,   ",
										  ",$~,,,-~;!-,-,,,,.... .--,.......... .,!!. !-   ",
										  ",$~,,,-~;!-,-,,,,....  --,............,!!. ;,   ",
										  ",$~,,,-~;!,,--,,,,... .--,............,!!. !,   ",
										  ",$~,,,-~;!,,--,,,,... .--,............,!!. ;,   ",
										  ",$~,,,-~;!,,--,,,,... .--,............,*!. ;,   ",
										  ",$~,,,-~;!,,---,,,... .--,............,!!. ;,   ",
										  ",$~,,,-~;!,,---,,,... .--,............,*!..;,   ",
										  ",$~,,,-~!!,,---,,,,....--,............-*!..;,   ",
										  ",$~,,,-~!!,----,,,,....~-,............-$!..;,   ",
										  ",@#$$$$##!$$$$$$$$$$$=$=$$$$$$$$=====*$@#==$-   ",
										  " ..,.....!......-,..................  ... ..    ",
										  "         !      ::                          ",
									     
							    };

						        
							    for (int i = 0; i < Diary.length; i++) {
								      // 초 간 중지한다
								      Thread.sleep(100);
								      // 메세지를 출력한다
								      System.out.println(Diary[i]);
								}
							    System.out.println(" ");
							    System.out.println("일기를 쓰며 하루를 점검하고 스스로를 보살핍니다.");
								후니.일기();
								후니.상태알림();
								
					    	}else if(집선택창 == 3) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
					    		String nap[] = { // 타이핑 쓰레드 - 익명 클래스
					    				"		                              .                   ",
					    				"		                              .;:;-               ",  
					    				"		                             ,:.  ~-              ",  
					    				"		                             ~     ;.             ",
					    				"		                             ~  .  ~.             ",
					    				"		                             ~     ;.             ",  
					    				"		                             ,;   ~-              ",  
					    				"		                              ,~~~-                 ",
					    				"		                                                    ",
					    				"		                                                    ",
					    				"		                                                    ",
					    				"		                                                    ",
					    				"		                                                    ",
					    				"		                                                    ",
					    				"		                        ;!;~ ----,.                 ",
					    				"		                       -**;~ ::;:~~-.               ",
					    				"		                       !**~, ~  ~~~~~-              ",
					    				"		                       !*;,  -  -~~~~~-.            ",
					    				"		                       -*.   .  ,~~~~~~-            ",
					    				"		                  .   .,;:,,,   ,~~~~~~~,           ",
					    				"		                      .,,,,,,   .:~~~~~~~           ",
					    				"		                                 -~~~~~~~.          ",
					    				"		                             .,  -~:::~~~,          ",
					    				"		                          .~::! .::::::::-          ",
					    				"		                          -:::; ,::::::::~          ",
					    				"		                          ~:::~ -::::::::-          ",
					    				"		                          ~::-. --~~~::::.          ",
					    				"		                          ~::.                      ",
					    				"		                          :::.                      ",
					    				"		                         .:::-                      ",
					    				"		                         .::;-                      ",
					    				"		                         ,::;,                      ",
					    				"		                         -::;.                      ",
					    				"		                         ~::;                       ",
					    				"		                         ..--                       ",
					    				"		                       ,!;-:!                       ",
					    				"		                     ~*=====!                       ",
					    				"		                     -:;;;;~.    					",
					    				""
					    										    };
					    									        
									    for (int i = 0; i < nap.length; i++) {
										      // 초 간 중지한다
										      Thread.sleep(100);
										      // 메세지를 출력한다
										      System.out.println(nap[i]);
										}
									    System.out.println(" ");
									    
							    		System.out.println("낮잠을 통해 부족한 체력을 충전합니다.");
							    		후니.낮잠();
							    		후니.상태알림();
					    		
					    	}else if(집선택창 == 4) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								continue;
							}else {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("다시 입력하세요."); 
								continue; 						
							}
							
							//(집) 동생의 병간호를 해야합니다.
							Character Bro = new Character(); 
							Bro.관계 = "남동생";
							
							if(Bro.gohospital()) {
								
								EventBgm EventBgm = new EventBgm();
								
						        try {
						        	EventBgm.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        
								System.out.println("집 랜덤 이벤트 <동생의 입원>");
								System.out.println("동생이 입원했습니다.");
								System.out.println("병간호를 하시겠습니까?");
								System.out.println("1. 병간호를 한다.");
								System.out.println("2. 하지 않는다.");

								//객체.객체함수다. 객체의 기능!	
								
								int 병간호선택창 = scan.nextInt();
								
								if(병간호선택창 == 1) {
									Buttonbgm ButtonBgm5 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm5.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[후니] (후.. 취준에 집안일까지..)");	
									System.out.println("[후니] 조심 좀 하지 그랬어 ㅠㅠ");	
									Bro.후니의_체력지수_감소(5);
									Bro.후니의_스트레스지수_증가(5);
									후니.상태알림();
									
								}else if(병간호선택창 == 2) {
									Buttonbgm ButtonBgm5 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm5.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[후니] 너무 바빠.. 하반기 준비해야해..ㅠㅠ");
									Bro.후니의_스트레스지수_증가(5);
									Bro.후니의_자존감지수_감소(5);
									후니.상태알림();					
								}else {
									System.out.println("다시 입력하세요.");
									continue; 	
								}
								
							}else {
								System.out.println("랜덤이벤트가 없습니다.");
							}
							
					    }else if(일학기선택창 == 4) {
							Buttonbgm ButtonBgm5 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm5.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
					    	continue;
					    }else {
							Buttonbgm ButtonBgm5 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm5.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println("다시 입력하세요.");
					    	continue;
					    }
					    
					}
					
					NOV ++;	
					
				}else if(메인메뉴선택창 == 2){
					Buttonbgm ButtonBgm2 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm2.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
				
					후니.상태알림();
					
				}else if(메인메뉴선택창 == 3) {
					Buttonbgm ButtonBgm2 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm2.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
						
					System.out.println("11월 취준을 포기하시겠습니까?");
					System.out.println("1. 네");
					System.out.println("2. 아니오");
					
					int 취준포기선택창 = scan.nextInt();
					
					if(취준포기선택창 ==1) {
						Buttonbgm ButtonBgm3 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm3.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println("11월 취업준비를 포기했습니다.");					

						
//						FinishBgm FinishBgm = new FinishBgm(); // 취준포기하면 피니시브금 나오게!
//						FinishBgm.start();
//						
//				        try {
//				        	 FinishBgm.LoadBgm();
//				             Thread.sleep(0);
//				        }catch(InterruptedException e) {
//				             e.printStackTrace();
//				        
//				        }
						break;

					}else if(취준포기선택창 == 2) {
						Buttonbgm ButtonBgm3 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm3.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						continue;
					}else {
						Buttonbgm ButtonBgm3 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm3.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println("다시 입력하세요."); // 취준을 포기하시겟습니까?가 뜨도록. 맨처음 메인메뉴창이 아니라.
						continue; 						   // 이 if문을 while문 안에 넣게 되면 취준포기선택창 == 2가 1.활동 2. 상태확인 3. 취준포기가 나와야
					}
					
				}else {
					Buttonbgm ButtonBgm2 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm2.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					System.out.println("다시 입력하세요.");
					continue;
				}

			}
			
			System.out.println("하반기채용 필기 시험 주간입니다.");
			System.out.println("필기 시험을 보러 가시겠습니까?");
			
			int WriteTest;
			WriteTest = 0;
			
			while(WriteTest<1) {
				Buttonbgm ButtonBgm1 = new Buttonbgm();
				
		        try {
		        	 ButtonBgm1.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
			System.out.println("1번 : 응시한다");
			System.out.println("2번 : 늦잠잔다");
					
			int WriteTest2 = scan.nextInt();
			
			if(WriteTest2 == 1) {
				Buttonbgm ButtonBgm2 = new Buttonbgm();
				
		        try {
		        	 ButtonBgm2.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
		        System.out.println(" ");
				
				
				System.out.println(" ");
				String JopPhoto[] = { // 타이핑 쓰레드 - 익명 클래스

							"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!!!!!!!!!*==$====!!!!!!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!!!!!!=@#@@@##@###**!!!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!!!!$@@#@@@@@@#$==$$=!!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!!#@@@@@@@@@@#########!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!$@@@@@@@@##$####$$$###*!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!$@@@@@@@@#######$#$$$#@#!!!!!!!!!!!!!",
							"!!!!!!!!!!!!*@@@@@@@@#####@##$$#$###@$!!!!!!!!!!!!",
							"!!!!!!!!!!!!#@@@@#@#@@##$####$#$$###@@!!!!!!!!!!!!",
							"!!!!!!!!;!;!@@@@#####@##$$$$#$##$$#$#@$!!!!!!!!!!!",
							"!!!!!!!;;;;@#@########$$*$$$$=###$###@@!!!!!!!!!!!",
							"!!!!!!;;;;!@########$$==$$$$$####$$###@!!!!!!!!!!!",
							"!!!;;;;;;;!####$$$$$=====$###$########@*!!!!!!!!!!",
							";!;;;;;;;;*###$$$=*====$#$############@*;!!!!!!!!!",
							";;;;;;;;;;*###$===*=$$==###############*;;;;!!!!!!",
							";;;;;;;;;;=####===*=#$*!$$$###########@!;;;;;!!!!!",
							";;;;;;;;;;*@##=**!;:*=*::**;*$#######@#!;;;;;;;!!!",
							";;;;;;;;;;!@#!!-:-,,-..   ..~!=$#####@@;;;;;;;;;!!",
							";;;;;;;;;;;##:..----,,.    .-~::;**####;;;;;;;;;;;",
							";;;;;;;;;;;#$:..., ,~      ..=..;:;=#@$;;;;;;;;;;;",
							";;;;;;;;:::$#;.~.    --   .   ..,~:!#@=;;;;;;;;;;;",
							";;;;;;;:::-,:!~...-~*-, .:..-#;~--;*$=;;;;;;;;;;;;",
							";;;;;::::;.. ;~   ..~,.:.,!.,!,-,,-:*~:;::;;;;;;;;",
							";;;;::::::   ~.      ..   !  .....-:!~;;:::;;;;;;;",
							";;;:::::::  -,..      :,  :,    ..-:!~~::::::;;;;;",
							";;;:::::::-  ,...     .   --    .,-:;:::::::::;;;;",
							";:::::::~~:  ,. ~.  , .   -~...-.,-:;*:~~::::::;;;",
							";::::::~~~~  ,,           ,-,  ..,~:!:;~~~::::::;;",
							"::::::~~~~~~ .,.       ...--~   .,~::~~~~~~~:::::;",
							":::::~~~~~~-~ -.        .-~--. ..-~;~~-~~~~~~:::::",
							"::::~~~~~-----~..         .,,...,-~;-----~~~~~::::",
							":::~~~~-------~..         ..,,..,-~!------~~~~~:::",
							"::~~~~-----,,,~..   .,....,-~-,,,-~~,------~~~~~::",
							":~~~~-----,,,,,-..       ..,-..,--:-,,,-----~~~~~:",
							":~~~-----,,,,,,:,.     .,.,-,.,,-~;,,,,,,----~~~~:",
							"~~~----,,,,,,..,~,.      .....,-~:,..,,,,,----~~~~",
							"~~~---,,,,,.....:~,.       ...,~:;....,,,,,----~~~",
							"~~---,,,,,......-~~,      ...,~:;;......,,,,---~~~",
							"~---,,,,,.......,,~~-. ...,,,-:::!.......,,,,---~~",
							"~---,,,,........~..-~~---~~~~::::;........,,,----~",
							"---,,,......... -...,-~~~~~~:~~~~;.........,,,---~",
							"--,,,,........ :.. ....,--~~~~~~~;*~.......,,,,--~",
							"-,,,,.......  ,* .  ..   .,-~~~~:~:#-.......,,,---",
							"-,,,......   .$,    ...   ,-----~-~$#~.......,,,--",
							",,,.......  ~$$.     ... .,--,,,,,-=##$.......,,--",
							",,,...... -*$$$.   . ....,,,,,-.,,-=####*.....,,,-",
							",,.....:;$$$##$,       ....,,,...,-$######!;...,,-",
							",,..~;$$$$$$$$$*         ...- ....-$########$=::,,",
							"-~$$#$$$#$$$$$$=        ...,  ...,~$########$##$#$",
							"##$#$###$#$#$$$=        ..,   ....-$$####$$##$#$$#",
							"##$#$$$#####$$$=    *!=$$$$$**....:$$$$$######$$##",
							"#$$$$$$$#$$$#$$$..-*$$$$$$#$##=--.=$#$$$##$$##$##$",
							"$$$$$#$$$$$$$$$:,.,$$$$$$$###:-,-=$$##$#####$$###",
							"$$$$$$$$$$$$$$$,   .$##$$##$:~. .=$$$$#$######$$$",
							"$$$$$$#$$$$$$$$$,    -$$$$#$;~.  ,$$##$###$$#$##$$",
							"$#$$$$$$#$$$$$$,     ~$$##*:,   ,$$####$####$$###",
							"$$$$$#$$#$$$$#$~     ~$###;-.   ,$$$##$#$#$#$$$$$",
							"$$$$#$$$#$$$$$$:     *$#$$=-   .;$$$$##$$####$#$$",
							"$$$##$#$$$#$$#$!.   .$##$$=- ...$$$##$$$$$####$$$",
							"$$$#####$=$$$$$$.   *=####$~. ..$##$#$$#$#$#$#$#$",
							"#$$$$$$$$$$$$$#$$,   *$#$$$$:. .-$$#$$#$$###$##$$#",
							"$$$$$$$#$$$$$$$$,  .*$#$$$$*,  ~=$##$$$$#$$$$#$#$"
					     
			    };

		        
			    for (int i = 0; i < JopPhoto.length; i++) {
				      // 초 간 중지한다
				      Thread.sleep(100);
				      // 메세지를 출력한다
				      System.out.println(JopPhoto[i]);
				}
			    System.out.println(" ");
				
			    System.out.println("내 필기지수와 은행 커트라인과 비교합니다.");
			    
				if(후니.후니_필기지수>=한쿡은행인사팀.필기지수_커트라인) {
					
			        //패스브금 (로딩브금과 동일)
				   	LoadingBgm passBgm02 = new LoadingBgm();
			          
			        try {
			             passBgm02.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }

					
					System.out.println("===========================================================");
					System.out.println(" ");
					
					String PASS[] = { // 타이핑 쓰레드 - 익명 클래스
				            "______   ___   _____  _____ ",    
				            "| ___ \\ / _ \\ /  ___|/  ___|",
				            "| |_/ // /_\\ \\\\ `--. \\ `--. ",
				            "|  __/ |  _  | `--. \\ `--. \\",
				            "| |    | | | |/\\__/ //\\__/ /",
				            "\\_|    \\_| |_/\\____/ \\____/"
				    };

			        
				    for (int i = 0; i < PASS.length; i++) {
					      // 초 간 중지한다
					      Thread.sleep(450);
					      // 메세지를 출력한다
					      System.out.println(PASS[i]);
					} 
					System.out.println(" ");
					System.out.println("필기전형에 합격하였습니다!!");
					System.out.println("면접전형을 준비하세요!!");
					System.out.println("===========================================================");
					
					break;
					
				}else {
					
					System.out.println("귀하께서는 아쉽게도 선발 명단에 없음을 알려드립니다. 감사합니다.");	
					System.out.println("게임이 종료되었습니다.");
					
					GoodbyeWorldBgm GoodbyeWorldBgm = new GoodbyeWorldBgm();
					GoodbyeWorldBgm.join();
					
			        try {
			        	GoodbyeWorldBgm.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					
					String GameEnd[] = { // 타이핑 쓰레드 - 익명 클래스

	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@=;:;;;;:=#@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@#-*@@@@@@@@@@@$-*@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@*;@@@@@@@@@@@@@@@@@=;#@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@!!@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@@@@",
	"@@@@@@@@@@#;@@@@@@@@@@@@@@@@@@@@@@@@@=*@@@@@@@@@@@",
	"@@@@@@@@@$$@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@@",
	"@@@@@@@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
	"@@@@@@@*#@@@@@~~~~~~$@@@@@@@@@@@*~!@@@@@@;@@@@@@@@",
	"@@@@@@$#@@@@@@      =@@@@@@@@@@@: ~@@@@@@@;@@@@@@@",
	"@@@@@@=@@@@@@@  !@@@@@;** ;@@#.,: ~@@@@@@@@=@@@@@@",
	"@@@@@~@@@@@@@@      ##     *@     ~@@@@@@@@=@@@@@@",
	"@@@@*@@@@@@@@@      ##  @. != .@- ~@@@@@@@@@~@@@@@",
	"@@@@!@@@@@@@@@  !@@@@#  @, !! ~@: ~@@@@@@@@@@#@@@@",
	"@@@=#@@@@@@@@@      ;#  @, !@  $  ~@@@@@@@@@@;@@@@",
	"@@@!@@@@@@@@@@      ;#  @, *@-  ; ~@@@@@@@@@@=@@@@",
	"@@@!@@@@@@@@@@@@@@@@@@@@@@@@@@#@@@@@@@@@@@@@@@=@@@",
	"@@#$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
	"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
	"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@#@@@@@@$-  -=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@#$@@@@#      =@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*@@@",
	"@@@;@@@@, .@@ ;$@@-..~@@~~@,.@=.-@@@~.,$@@@@@#$@@@",
	"@@@!@@@@  ;@!!!*@     ~@         !@  .  :@@@@*@@@@",
	"@@@$#@@@  !@   ,@!:#!  @  ;=  @- -*  *:  @@@@;@@@@",
	"@@@@!@@@. -@=! ,@~  ;  @  *#  @~ -!  ,,,,@@@@@@@@@",
	"@@@@$@@@;  ..  ,@  @,  @  *#  @~ -$  #~ .@@@-@@@@@",
	"@@@@@-@@@-    -@@   -  @  *#  @~ -@:   .@@@*@@@@@@",
	"@@@@@@!@@@@##@@@@@#@@@@@@@@@@@@@@@@@@#@@@@#=@@@@@@",
	"@@@@@@$=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@@@@@",
	"@@@@@@@*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@",
	"@@@@@@@@=$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
	"@@@@@@@@@$!@@@@@@@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@",
	"@@@@@@@@@@@;@@@@@@@@@@@@@@@@@@@@@@@@@:$@@@@@@@@@@@",
	"@@@@@@@@@@@@$:@@@@@@@@@@@@@@@@@@@@@$;@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@=!$@@@@@@@@@@@@@@@#*;@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@#!!*#@@@@@@@#=!!=@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@#$=***=$#@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
							                                                       
				    };

			        
				    for (int i = 0; i < GameEnd.length; i++) {
					      // 초 간 중지한다
					      Thread.sleep(250);
					      // 메세지를 출력한다
					      System.out.println(GameEnd[i]);
					} 
					

					
					System.exit(0);
				}
	//게임이 종료되어야 한다.			
			}else if(WriteTest2 == 2) {
				GoodbyeWorldBgm GoodbyeWorldBgm = new GoodbyeWorldBgm();
				GoodbyeWorldBgm.join();
				
		        try {
		        	GoodbyeWorldBgm.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
				String GameEnd[] = { // 타이핑 쓰레드 - 익명 클래스

	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@=;:;;;;:=#@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@#-*@@@@@@@@@@@$-*@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@*;@@@@@@@@@@@@@@@@@=;#@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@!!@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@@@@",
	"@@@@@@@@@@#;@@@@@@@@@@@@@@@@@@@@@@@@@=*@@@@@@@@@@@",
	"@@@@@@@@@$$@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@@",
	"@@@@@@@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
	"@@@@@@@*#@@@@@~~~~~~$@@@@@@@@@@@*~!@@@@@@;@@@@@@@@",
	"@@@@@@$#@@@@@@      =@@@@@@@@@@@: ~@@@@@@@;@@@@@@@",
	"@@@@@@=@@@@@@@  !@@@@@;** ;@@#.,: ~@@@@@@@@=@@@@@@",
	"@@@@@~@@@@@@@@      ##     *@     ~@@@@@@@@=@@@@@@",
	"@@@@*@@@@@@@@@      ##  @. != .@- ~@@@@@@@@@~@@@@@",
	"@@@@!@@@@@@@@@  !@@@@#  @, !! ~@: ~@@@@@@@@@@#@@@@",
	"@@@=#@@@@@@@@@      ;#  @, !@  $  ~@@@@@@@@@@;@@@@",
	"@@@!@@@@@@@@@@      ;#  @, *@-  ; ~@@@@@@@@@@=@@@@",
	"@@@!@@@@@@@@@@@@@@@@@@@@@@@@@@#@@@@@@@@@@@@@@@=@@@",
	"@@#$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
	"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
	"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@#@@@@@@$-  -=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@#$@@@@#      =@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*@@@",
	"@@@;@@@@, .@@ ;$@@-..~@@~~@,.@=.-@@@~.,$@@@@@#$@@@",
	"@@@!@@@@  ;@!!!*@     ~@         !@  .  :@@@@*@@@@",
	"@@@$#@@@  !@   ,@!:#!  @  ;=  @- -*  *:  @@@@;@@@@",
	"@@@@!@@@. -@=! ,@~  ;  @  *#  @~ -!  ,,,,@@@@@@@@@",
	"@@@@$@@@;  ..  ,@  @,  @  *#  @~ -$  #~ .@@@-@@@@@",
	"@@@@@-@@@-    -@@   -  @  *#  @~ -@:   .@@@*@@@@@@",
	"@@@@@@!@@@@##@@@@@#@@@@@@@@@@@@@@@@@@#@@@@#=@@@@@@",
	"@@@@@@$=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@@@@@",
	"@@@@@@@*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@",
	"@@@@@@@@=$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
	"@@@@@@@@@$!@@@@@@@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@",
	"@@@@@@@@@@@;@@@@@@@@@@@@@@@@@@@@@@@@@:$@@@@@@@@@@@",
	"@@@@@@@@@@@@$:@@@@@@@@@@@@@@@@@@@@@$;@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@=!$@@@@@@@@@@@@@@@#*;@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@#!!*#@@@@@@@#=!!=@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@#$=***=$#@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
						                                                       
			    };

		        
			    for (int i = 0; i < GameEnd.length; i++) {
				      // 초 간 중지한다
				      Thread.sleep(250);
				      // 메세지를 출력한다
				      System.out.println(GameEnd[i]);
				} 
				
			    System.out.println("취업준비를 포기했습니다.");
				System.out.println("게임이 종료되었습니다.");
				
				System.exit(0);
	//게임이 종료되어야 한다.			
				break;
				
								
			}else {
				Buttonbgm ButtonBgm2 = new Buttonbgm();
				
		        try {
		        	 ButtonBgm2.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
				System.out.println("다시 입력하세요.");
				 
				continue;
			}
			WriteTest++;
			}
			
			System.out.println("12월 마지막 주에 있는 면접전형을 준비합시다.");
			
			int DEC = 1; // 12월 세 턴! 후 면접 전형!!
			
			while (DEC <= 3) {
				Buttonbgm ButtonBgm1 = new Buttonbgm();
				
		        try {
		        	 ButtonBgm1.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
				System.out.println("< 메인메뉴 > ");
				System.out.println("1. 활동"); // 1번 활동, 2번 상태확인, 3번 취준포기
				System.out.println("2. 상태확인");
				System.out.println("3. 취준포기");
						
				int 메인메뉴선택창 = scan.nextInt();
				
				if ( 메인메뉴선택창 == 1) {

					if (true) {
						Buttonbgm ButtonBgm2 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm2.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println(" ");
						System.out.println("4학년 2학기 12월 : " + DEC + "/3" + "번째 턴입니다.");
						System.out.println("어디에 가시겠습니까?");
						System.out.println("1. 학교에 간다");
						System.out.println("2. 동네에 간다");
						System.out.println("3. 집에 간다");
						System.out.println("4. 뒤로가기");
						System.out.println("<< 학교, 동네, 집 각각 일정확률로 이벤트가 튀어나옵니다. >>");
						System.out.println(" ");
						
						int 일학기선택창 = scan.nextInt();

					    if (일학기선택창 == 1) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println(" ");
							System.out.println("학교에 왔습니다.");
							System.out.println("학교에서 무엇을 하시겠습니까?");
							System.out.println("1. 학점관리");
							System.out.println("2. 금융동아리활동");
							System.out.println("3. 취업지원본부 컨설팅");
							System.out.println("4. 면접스터디");
							System.out.println("5. 뒤로가기");
							System.out.println(" ");

							int 학교선택창 = scan.nextInt();
							
							if(학교선택창 ==1) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        System.out.println("후.. 전공공부 열심히 해야지!!");
								System.out.println("학교에서 열심히 학점관리를 합니다.");
								후니.학점관리();
								System.out.println(" ");
								
								SomethingGirl SomethingGirl = new SomethingGirl();

								SomethingGirl.SomethingGirlCome();
								SomethingGirl.join(); 
								System.out.println(" ");
								
								후니.상태알림();
								
							}else if(학교선택창 == 2) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("동아리에서 선배들에게 취업꿀팁을 얻습니다.");
								후니.금융동아리모임_참석();
								System.out.println(" ");
								
								CircleBroThread CircleBro = new CircleBroThread();

								CircleBro.CircleBroCome();
								CircleBro.join(); 
								System.out.println(" ");
								후니.상태알림();
								
							}else if(학교선택창 == 3) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("취업지원본부에서 컨설팅을 받습니다.");
								후니.취업지원본부_컨설팅();
								후니.상태알림();
								
							}else if(학교선택창 == 4) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("면접스터디를 통해 면접역량을 강화시킵니다.");
								후니.면접스터디_참석();
								
								InterviewStudyMember Studymember= new InterviewStudyMember();

								Studymember.GoFeedback();
								Studymember.join(); 
								후니.상태알림();
								
							}else if(학교선택창 == 5) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								continue;
						
							}else {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("다시 입력하세요."); 
								continue; 						 
							}
							
							// (학교) 취업스터디원 먼저 합격해서 쫑파티 열 확률 10%

//							int 멘토링횟수;
//							멘토링횟수 = 0;
//							while(멘토링횟수<1)
							
							Character InterviewFriend = new Character(); 
							InterviewFriend.관계 = "취업스터디원";
							
								if(InterviewFriend.SuccessFirst()) {
									
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
							        
									System.out.println("학교 랜덤 이벤트 <취업스터디원이 먼저 합격했습니다.>");
									System.out.println("축하파티에 참여하시겠습니까?");
									System.out.println("1. 참여");
									System.out.println("2. 불참");
		
									//객체.객체함수다. 객체의 기능!	
									
									int goparty = scan.nextInt();
									
									if(goparty == 1) {
										Buttonbgm ButtonBgm4 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm4.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("축하파티에 참여해 많은 조언들을 얻습니다.");	
										InterviewFriend.후니의_서류지수_증가(5);
										InterviewFriend.후니의_필기지수_증가(5);
										InterviewFriend.후니의_면접지수_증가(5);
										InterviewFriend.후니의_체력지수_감소(10);
										InterviewFriend.후니의_자존감지수_감소(5);
										
										후니.상태알림();
										
									}else if(goparty == 2) {
										Buttonbgm ButtonBgm4 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm4.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("축하파티에 불참하고 체력을 회복합니다.");
										InterviewFriend.후니의_체력지수_증가(15);
										InterviewFriend.후니의_자존감지수_감소(5);
										InterviewFriend.후니의_스트레스지수_증가(5);
										
										후니.상태알림();					
									}else {
										Buttonbgm ButtonBgm4 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm4.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("다시 입력하세요.");
										continue; 	
									}
									
								}else {
									System.out.println("랜덤이벤트가 없습니다.");
								}
							
							
					    }else if(일학기선택창 == 2) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println(" ");
					    	System.out.println("동네에 왔습니다.");
							System.out.println("동네에서 무엇을 하시겠습니까?");
							System.out.println("1. 헬스");
							System.out.println("2. 치맥");
							System.out.println("3. 뒤로가기");
							System.out.println(" ");
							
							int 동네선택창 = scan.nextInt();
							
							if(동네선택창 ==1) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        
						        System.out.println(" ");
						        
					    		String health[] = { // 타이핑 쓰레드 - 익명 클래스
		
	"	                                    .-;.",           
	"	                                   -$@@=, ",         
	"	                                 .~#@@@@=:  ",       
	"	                                -*@@@@@@@@*   ",     
	"	                               -$@@@@@@@@@@*    ",   
	"	                              ;#@@@@@@@@@@@@~     ", 
	"	                              -@@@@@@@@@@@@@#      ",
	"	                              .#@@@@@@@@@@@@@$.    ",
	"	                               ,#@@@@@@@@@@@@@*    ",
	"	                                :@@@@@@@@@@@@@$,   ",
	"	                                ,=@@@@@@@@@@@@@;   ",
	"	                          -!.    ,$@@@@@@@@@@@@$-  ",
	"	                         ~#@$    :@@@@@@@@@@@@@@~  ",
	"	                         :@@@. -#@@@@@@@@@@@@@@@~  ",
	"	                      .@@!;@$.   ;@@@@@@@@@@@@@@@, ",
	"	                    .,=@@;.,,$@@@!~#@@@@@@@@@@@@@, ",
	"	                   ,$@ =@!!@@@@@@@;!*=@@@@@@@@@@$, ",
	"	                   !@@;.@=;*@@@@@@@,  *@@@@@@@@=-  ",
	"	                   -#@@!;@=-~::!@@@*  ,#@@@@@#!,   ",
	"	         .;     .*=~=@@#-!@-;==!!@@@=  ;@@@@@-     ",
	"	        .#@;    ,@@#~#@@* .-#@#~#@@@@   !@@$.      ",
	"	       #@@@@:   ,@@@- @@=:@@@@.@@@@@@   .=,        ",
	"	     .$@@@@@#,   -##~..,-$@#*.#@@@@@=              ",
	"	   .!@@@@@@@@;   ---$@#!@@$- *@@@@@@               ",
	"	  .*@@@@@@@@@@;,;@@@@@@@$!;,,@@@@@@#               ",
	"	  ,@@@@@@@@@@@@=@@@@@@@#~-$~!@@@@@@$               ",
	"	  ,@@@@@@@@@@@@@@@@@@@:~*$@~~@@@@@@@               ",
	"	   ;@@@@@@@@@@@@@@@@@- $@@@#.@@@@@@@$              ",
	"	   ~@@@@@@@@@@@@@@@=, @@@@@@,@@@@@@@@$             ",
	"	   ~@@@@@@@@@@@@@@!    @@@@@@@@@@@@@@#.            ",
	"	    ;@@@@@@@@@@@@@*.   =$#@@@@@@@@@@@@$.           ",
	"	    ~#@@@@@@@@@@@@@:     -#@@@@@@@@@@@@=.          ",
	"	     !@@@@@@@@@@@@@*.     ~#@@@@@@@@@@@@~          ",
	"	     ,#@@@@@@@@@@@@@=.     =@@@@@@@@@@@@$,         ",
	"	      ,#@@@@@@@@@@@@@~     ,#@@@@@@@@@@@@$.        ",
	"	       -@@@@@@@@@@@@@@      .@@@@@@@@@@@@@-        ",
	"	        *@@@@@@@@@@@#.       @@@@@@@@@@@@@@        ",
	"	         *@@@@@@@@@~          #@@@@@@@@@@@!        ",
	"	          ;#@@@@@=~           .#@@@@@@@@#~         ",
	"	           -$@@@;              ;@@@@@@@$-          ",
	"	            -;!:               .*@@@@@;-           ",
	"	                                ,=@@!-             ",
	"	                                 ;:,            "
							    };
						        
							    for (int i = 0; i < health.length; i++) {
								      // 초 간 중지한다
								      Thread.sleep(0);
								      // 메세지를 출력한다
								      System.out.println(health[i]);
								}
							    
							    System.out.println(" ");
								System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
								System.out.println(" ");
								후니.헬스장();
								후니.상태알림();
								
							}else if(동네선택창 == 2) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								String ChickenandBeer[] = { // 타이핑 쓰레드 - 익명 클래스

										"                       ,**~",               
										"....                  ,*  :;...!#=#.",      
										"!#@@#!,                !    ::::,   ;,",     
										"~@#-,,,$@!              -.            -~",     
										":#:-:!!!,;#=            ;!~            .;:",    
										".#*,!@@#@$,-#;          ;.                ;. ",  
										";$,,;:,,,:$-;@,         :                 .~ ",  
										"#~,,,,,,,-~-,#*         ;                 !.  ", 
										"#-,,,,,,,,,,,~=         .*-,,,  ,,,,,,,,,;;    ",
										"-*-,,,,,,,,,,,,@,          ;,,!  =,,,,,,,:~     ",
										"~*,,,,,,,,,,,,,@-          ~  !  $       -#=,   ",
										".=-,,,,,,,,,,,,=-          ~  *  # ,. ;  -~ !   ",
										" @~,,,,,,,,,,,,;!          ~   @#@ -. $  -@*.*  ",
										" *=,,,,,,,,,,,,;@          ~   * # -. $  --=.@  ",
										" ,@=,,,,,,,,,,,,$=         ~   * # -. $  --;,@  ",
										"  ~#*,,,,,,,,,,,:#-        ~   * # -. $  --*.@  ",
										"   ,##:,,,,,,,,,,@:        ~   * # -. $  -#$ $  ",
										"     *##;-,,,,,,:@$-       ~   * # -. $  -; !.  ",
										"      .-@#*-,,,:@~!@:-~    ~   * # -. $  -*$~   ",
										"         ;$@*::@;  ~$$=@~  ~   * # -. $  -~     ",
										"           -~=!*$!  ...-#. ~   * # -. $  --     ",
										"                ;#*    ,@- ~   ~ ! .  :  --     ",
										"                 ,@   *#=  ~.            -,     ",
										"                 ,@   $-   ~;           .*      ",
										"                  =!.:@-    -;;;;;;;;;;;;       ",
										"                  .@@@*                         ",
										    			      " .                      "
										     
								    };

							        
								    for (int i = 0; i < ChickenandBeer.length; i++) {
									      // 초 간 중지한다
									      Thread.sleep(100);
									      // 메세지를 출력한다
									      System.out.println(ChickenandBeer[i]);
									}
								    System.out.println(" ");
									System.out.println("치맥으로 스트레스를 풉니다.");
									후니.치맥();
									후니.상태알림();
								
							}else if(동네선택창 == 3) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								continue;
							}else {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("다시 입력하세요."); 
								continue; 						 
							}
							
							// (동네) 고등학교 친구에게 안부전화 올 확률 10% 
							
							Character HighschoolFriend = new Character(); 
							HighschoolFriend.관계 = "고등학교 친구";
							
							if(HighschoolFriend.HiCall()) {
								EventBgm EventBgm = new EventBgm();
								
						        try {
						        	EventBgm.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								
								System.out.println("동네 랜덤 이벤트 <고등학교 친구의 안부전화>");
								System.out.println("잊고 있던 고등학교 친구에게 전화가 옵니다.");
								System.out.println("1. 전화를 받는다. ");
								System.out.println("2. 전화를 받지 않는다. ");

								//객체.객체함수다. 객체의 기능!	
								
								int 안부전화선택창 = scan.nextInt();
								
								if(안부전화선택창 == 1) {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[고등학교 친구] 어 후니야! 아까 동네에서 너 본 것 같아서 전화했어!");	
									System.out.println("[고등학교 친구] 잘 지내고 있었지?");	
									System.out.println("[고등학교 친구] 전역한 이후로 한 번도 못봤는데! 보고 싶다야!");
									System.out.println("[후니] 말할 틈도 안주네!");
									System.out.println("[후니] 나도 보고 싶다야!");
									
									HighschoolFriend.후니의_체력지수_증가(10);
									HighschoolFriend.후니의_자존감지수_증가(10);
									HighschoolFriend.후니의_스트레스지수_감소(10);
									
									후니.상태알림();
									
								}else if(안부전화선택창 == 2) {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[후니] 아 무슨 일이지.. 요즘 사람들 만나기 싫은데..");
									HighschoolFriend.후니의_자존감지수_감소(10);
									HighschoolFriend.후니의_스트레스지수_증가(10);
									
									후니.상태알림();					
								}else {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("다시 입력하세요."); 
									continue; 	
								}
								
							}else {
								System.out.println("랜덤이벤트가 없습니다.");
							}
							
					    }else if(일학기선택창 == 3) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println(" ");
					    	System.out.println("집에 왔습니다.");
							System.out.println("집에서 무엇을 하시겠습니까?");
							System.out.println("1. 부모님과 식사");
							System.out.println("2. 일기쓰기");
							System.out.println("3. 낮잠자기");
							System.out.println("4. 뒤로가기");
							System.out.println(" ");
							
							int 집선택창 = scan.nextInt();
							
							if(집선택창 ==1) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        String parents[] = {
										"부모님과 식사하며 취업 관련 이야기를 합니다.",
										"[부모님] 취업준비는 좀 잘 되고 있니?",
										"[후니] 나름대로 열심히 하고 있어요 ㅎㅎ",
										"[부모님] 그래그래 넌 혼자 알아서 잘 하리라 믿는다 ㅎㅎ ",
										"[후니] (후.. 이렇게나 날 믿어주시는데 잘 안되네 ㅠㅠ) ",
										"[부모님] 밥 많이 먹고 힘내라 아들",
										" "
								};
								
								for (int i = 0; i <parents.length; i++) {
									Thread.sleep(500);//0.5초마다 한 문장씩 출력
									System.out.println(parents[i]);
								}
								System.out.println(" ");

								후니.부모님과식사();
								System.out.println(" ");
								
								RelativeClass relative = new RelativeClass();
								relative.RelativeCome();
								relative.join(); 
								
								후니.상태알림();
								
							}else if(집선택창 == 2) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								 String Diary[] = { // 타이핑 쓰레드 - 익명 클래스

								 		  ".*=~.,,,,,,,--,,,....  --,.............~!.-=-",   
										  ",$~,..,,,,,,,--,.....  --,..... ... ...~!. ;,",   
										  ",$~,.,,,,,,,,,-,.....  --,....  ... ...~!. ;,  ", 
										  ",$~,,,,,,,,,,,-,.....  --,....  ..  ...~!. ;-   ",
										  ",$~,,,,,,,,,,,-,,....  --,....   . . ..~;. ;,   ",
										  ",$~,,,,,,,,,,,-,,....  --,....       ..~;. ;,   ",
										  ",$~,,,,,,,,,,,,,,....  --,....       ..~;. ;,   ",
										  ",$~,,,,,--,,,,,,,....  --,..... .... ..~!. ;,   ",
										  ",$~,,,,,~;,,,,,,,....  --,.....  ..  ..:!. ;,   ",
										  ",$~,,,,-:;,,,,,,,....  --,....   ......:!. ;,   ",
										  ",$~,,,,-;!-,,,,,,....  --,....  .......;!. ;,   ",
										  ",$~,,,,-;!~,,,,,,....  --,....    ... .;!. ;,   ",
										  ",$~,,,,~;!~,,,,,,....  --,.....  ......;!..;,   ",
										  ",$~,,,,~;!~,,,,,,...   --,..... ..... .;!..!-   ",
										  ",$~,,,-~;!~,,,,,,...   --,.....  .... .;!. ;,   ",
										  ",$~,,,-~;!~,,,,,,....  --,............,;;. ;,   ",
										  ",$~,,,-~;!~,,,,,,....  --,.......... .,!!. ;,   ",
										  ",$~,,,-~;!~,,,,,,....  --,.......... .,!!. ;,   ",
										  ",$~,,,-~;!-,,,,,,....  --,............,!!. ;,   ",
										  ",$~,,,-~;!-,-,,,,.... .--,.......... .,!!. !-   ",
										  ",$~,,,-~;!-,-,,,,....  --,............,!!. ;,   ",
										  ",$~,,,-~;!,,--,,,,... .--,............,!!. !,   ",
										  ",$~,,,-~;!,,--,,,,... .--,............,!!. ;,   ",
										  ",$~,,,-~;!,,--,,,,... .--,............,*!. ;,   ",
										  ",$~,,,-~;!,,---,,,... .--,............,!!. ;,   ",
										  ",$~,,,-~;!,,---,,,... .--,............,*!..;,   ",
										  ",$~,,,-~!!,,---,,,,....--,............-*!..;,   ",
										  ",$~,,,-~!!,----,,,,....~-,............-$!..;,   ",
										  ",@#$$$$##!$$$$$$$$$$$=$=$$$$$$$$=====*$@#==$-   ",
										  " ..,.....!......-,..................  ... ..    ",
										  "         !      ::                          ",
									     
							    };

						        
							    for (int i = 0; i < Diary.length; i++) {
								      // 초 간 중지한다
								      Thread.sleep(100);
								      // 메세지를 출력한다
								      System.out.println(Diary[i]);
								}
							    System.out.println(" ");
							    System.out.println("일기를 쓰며 하루를 점검하고 스스로를 보살핍니다.");
								후니.일기();
								후니.상태알림();
								
					    	}else if(집선택창 == 3) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
					    		String nap[] = { // 타이핑 쓰레드 - 익명 클래스
					    				"		                              .                   ",
					    				"		                              .;:;-               ",  
					    				"		                             ,:.  ~-              ",  
					    				"		                             ~     ;.             ",
					    				"		                             ~  .  ~.             ",
					    				"		                             ~     ;.             ",  
					    				"		                             ,;   ~-              ",  
					    				"		                              ,~~~-                 ",
					    				"		                                                    ",
					    				"		                                                    ",
					    				"		                                                    ",
					    				"		                                                    ",
					    				"		                                                    ",
					    				"		                                                    ",
					    				"		                        ;!;~ ----,.                 ",
					    				"		                       -**;~ ::;:~~-.               ",
					    				"		                       !**~, ~  ~~~~~-              ",
					    				"		                       !*;,  -  -~~~~~-.            ",
					    				"		                       -*.   .  ,~~~~~~-            ",
					    				"		                  .   .,;:,,,   ,~~~~~~~,           ",
					    				"		                      .,,,,,,   .:~~~~~~~           ",
					    				"		                                 -~~~~~~~.          ",
					    				"		                             .,  -~:::~~~,          ",
					    				"		                          .~::! .::::::::-          ",
					    				"		                          -:::; ,::::::::~          ",
					    				"		                          ~:::~ -::::::::-          ",
					    				"		                          ~::-. --~~~::::.          ",
					    				"		                          ~::.                      ",
					    				"		                          :::.                      ",
					    				"		                         .:::-                      ",
					    				"		                         .::;-                      ",
					    				"		                         ,::;,                      ",
					    				"		                         -::;.                      ",
					    				"		                         ~::;                       ",
					    				"		                         ..--                       ",
					    				"		                       ,!;-:!                       ",
					    				"		                     ~*=====!                       ",
					    				"		                     -:;;;;~.    					",
					    				""
					    										    };
					    									        
									    for (int i = 0; i < nap.length; i++) {
										      // 초 간 중지한다
										      Thread.sleep(100);
										      // 메세지를 출력한다
										      System.out.println(nap[i]);
										}
									    System.out.println(" ");
									    
							    		System.out.println("낮잠을 통해 부족한 체력을 충전합니다.");
							    		후니.낮잠();
							    		후니.상태알림();
					    		
					    	}else if(집선택창 == 4) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								continue;
							}else {
								System.out.println("다시 입력하세요."); 
								continue; 						
							}
							
							//(집) 동생의 병간호를 해야합니다.
							Character Bro = new Character(); 
							Bro.관계 = "남동생";
							
							if(Bro.gohospital()) {
								EventBgm EventBgm = new EventBgm();
								
						        try {
						        	EventBgm.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								
								System.out.println("집 랜덤 이벤트 <동생의 입원>");
								System.out.println("동생이 입원했습니다.");
								System.out.println("병간호를 하시겠습니까?");
								System.out.println("1. 병간호를 한다.");
								System.out.println("2. 하지 않는다.");

								//객체.객체함수다. 객체의 기능!	
								
								int 병간호선택창 = scan.nextInt();
								
								if(병간호선택창 == 1) {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[후니] (후.. 취준에 집안일까지..)");	
									System.out.println("[후니] 조심 좀 하지 그랬어 ㅠㅠ");	
									Bro.후니의_체력지수_감소(5);
									Bro.후니의_스트레스지수_증가(5);
									후니.상태알림();
									
								}else if(병간호선택창 == 2) {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[후니] 너무 바빠.. 하반기 준비해야해..ㅠㅠ");
									Bro.후니의_스트레스지수_증가(5);
									Bro.후니의_자존감지수_감소(5);
									후니.상태알림();					
								}else {
									System.out.println("다시 입력하세요.");
									continue; 	
								}
								
							}else {
								System.out.println("랜덤이벤트가 없습니다.");
							}
							
					    }else if(일학기선택창 == 4) {
							Buttonbgm ButtonBgm4 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm4.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
					    	continue;
					    }else {
							Buttonbgm ButtonBgm4 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm4.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println("다시 입력하세요.");
					    	continue;
					    }
					    
					}
					
					DEC ++;	
					
				}else if(메인메뉴선택창 == 2){
					Buttonbgm ButtonBgm3 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm3.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
				
					후니.상태알림();
					
				}else if(메인메뉴선택창 == 3) {
					Buttonbgm ButtonBgm3 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm3.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
						
					System.out.println("취준을 포기하시겠습니까?");
					System.out.println("1. 네");
					System.out.println("2. 아니오");
					
					int 취준포기선택창 = scan.nextInt();
					
					if(취준포기선택창 ==1) {
						Buttonbgm ButtonBgm4 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm4.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println("12월 취업준비를 포기했습니다.");					
						
//						FinishBgm FinishBgm = new FinishBgm(); // 취준포기하면 피니시브금 나오게!
//						FinishBgm.start();
//						
//				        try {
//				        	 FinishBgm.LoadBgm();
//				             Thread.sleep(0);
//				        }catch(InterruptedException e) {
//				             e.printStackTrace();
//				        
//				        }
						
						break;

					}else if(취준포기선택창 == 2) {
						Buttonbgm ButtonBgm4 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm4.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						continue;
					}else {
						System.out.println("다시 입력하세요."); // 취준을 포기하시겟습니까?가 뜨도록. 맨처음 메인메뉴창이 아니라.
						continue; 						   // 이 if문을 while문 안에 넣게 되면 취준포기선택창 == 2가 1.활동 2. 상태확인 3. 취준포기가 나와야
					}
					
				}else {
					Buttonbgm ButtonBgm3 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm3.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					System.out.println("다시 입력하세요.");
					continue;
				}

			}
			
			System.out.println("면접 날입니다.");
			System.out.println("면접을 보러가시겠습니까?");

			int InterviewTest;
			InterviewTest = 0;
			
			while(InterviewTest<1) {
			System.out.println("1번 : 응시한다");
			System.out.println("2번 : 늦잠잔다");
					
			int InterviewTest2 = scan.nextInt();
			
			if(InterviewTest2  == 1) {
				
				System.out.println(" ");
				String JopPhoto[] = { // 타이핑 쓰레드 - 익명 클래스

							"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!!!!!!!!!*==$====!!!!!!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!!!!!!=@#@@@##@###**!!!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!!!!$@@#@@@@@@#$==$$=!!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!!#@@@@@@@@@@#########!!!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!!$@@@@@@@@##$####$$$###*!!!!!!!!!!!!!",
							"!!!!!!!!!!!!!$@@@@@@@@#######$#$$$#@#!!!!!!!!!!!!!",
							"!!!!!!!!!!!!*@@@@@@@@#####@##$$#$###@$!!!!!!!!!!!!",
							"!!!!!!!!!!!!#@@@@#@#@@##$####$#$$###@@!!!!!!!!!!!!",
							"!!!!!!!!;!;!@@@@#####@##$$$$#$##$$#$#@$!!!!!!!!!!!",
							"!!!!!!!;;;;@#@########$$*$$$$=###$###@@!!!!!!!!!!!",
							"!!!!!!;;;;!@########$$==$$$$$####$$###@!!!!!!!!!!!",
							"!!!;;;;;;;!####$$$$$=====$###$########@*!!!!!!!!!!",
							";!;;;;;;;;*###$$$=*====$#$############@*;!!!!!!!!!",
							";;;;;;;;;;*###$===*=$$==###############*;;;;!!!!!!",
							";;;;;;;;;;=####===*=#$*!$$$###########@!;;;;;!!!!!",
							";;;;;;;;;;*@##=**!;:*=*::**;*$#######@#!;;;;;;;!!!",
							";;;;;;;;;;!@#!!-:-,,-..   ..~!=$#####@@;;;;;;;;;!!",
							";;;;;;;;;;;##:..----,,.    .-~::;**####;;;;;;;;;;;",
							";;;;;;;;;;;#$:..., ,~      ..=..;:;=#@$;;;;;;;;;;;",
							";;;;;;;;:::$#;.~.    --   .   ..,~:!#@=;;;;;;;;;;;",
							";;;;;;;:::-,:!~...-~*-, .:..-#;~--;*$=;;;;;;;;;;;;",
							";;;;;::::;.. ;~   ..~,.:.,!.,!,-,,-:*~:;::;;;;;;;;",
							";;;;::::::   ~.      ..   !  .....-:!~;;:::;;;;;;;",
							";;;:::::::  -,..      :,  :,    ..-:!~~::::::;;;;;",
							";;;:::::::-  ,...     .   --    .,-:;:::::::::;;;;",
							";:::::::~~:  ,. ~.  , .   -~...-.,-:;*:~~::::::;;;",
							";::::::~~~~  ,,           ,-,  ..,~:!:;~~~::::::;;",
							"::::::~~~~~~ .,.       ...--~   .,~::~~~~~~~:::::;",
							":::::~~~~~~-~ -.        .-~--. ..-~;~~-~~~~~~:::::",
							"::::~~~~~-----~..         .,,...,-~;-----~~~~~::::",
							":::~~~~-------~..         ..,,..,-~!------~~~~~:::",
							"::~~~~-----,,,~..   .,....,-~-,,,-~~,------~~~~~::",
							":~~~~-----,,,,,-..       ..,-..,--:-,,,-----~~~~~:",
							":~~~-----,,,,,,:,.     .,.,-,.,,-~;,,,,,,----~~~~:",
							"~~~----,,,,,,..,~,.      .....,-~:,..,,,,,----~~~~",
							"~~~---,,,,,.....:~,.       ...,~:;....,,,,,----~~~",
							"~~---,,,,,......-~~,      ...,~:;;......,,,,---~~~",
							"~---,,,,,.......,,~~-. ...,,,-:::!.......,,,,---~~",
							"~---,,,,........~..-~~---~~~~::::;........,,,----~",
							"---,,,......... -...,-~~~~~~:~~~~;.........,,,---~",
							"--,,,,........ :.. ....,--~~~~~~~;*~.......,,,,--~",
							"-,,,,.......  ,* .  ..   .,-~~~~:~:#-.......,,,---",
							"-,,,......   .$,    ...   ,-----~-~$#~.......,,,--",
							",,,.......  ~$$.     ... .,--,,,,,-=##$.......,,--",
							",,,...... -*$$$.   . ....,,,,,-.,,-=####*.....,,,-",
							",,.....:;$$$##$,       ....,,,...,-$######!;...,,-",
							",,..~;$$$$$$$$$*         ...- ....-$########$=::,,",
							"-~$$#$$$#$$$$$$=        ...,  ...,~$########$##$#$",
							"##$#$###$#$#$$$=        ..,   ....-$$####$$##$#$$#",
							"##$#$$$#####$$$=    *!=$$$$$**....:$$$$$######$$##",
							"#$$$$$$$#$$$#$$$..-*$$$$$$#$##=--.=$#$$$##$$##$##$",
							"$$$$$#$$$$$$$$$:,.,$$$$$$$###:-,-=$$##$#####$$###",
							"$$$$$$$$$$$$$$$,   .$##$$##$:~. .=$$$$#$######$$$",
							"$$$$$$#$$$$$$$$$,    -$$$$#$;~.  ,$$##$###$$#$##$$",
							"$#$$$$$$#$$$$$$,     ~$$##*:,   ,$$####$####$$###",
							"$$$$$#$$#$$$$#$~     ~$###;-.   ,$$$##$#$#$#$$$$$",
							"$$$$#$$$#$$$$$$:     *$#$$=-   .;$$$$##$$####$#$$",
							"$$$##$#$$$#$$#$!.   .$##$$=- ...$$$##$$$$$####$$$",
							"$$$#####$=$$$$$$.   *=####$~. ..$##$#$$#$#$#$#$#$",
							"#$$$$$$$$$$$$$#$$,   *$#$$$$:. .-$$#$$#$$###$##$$#",
							"$$$$$$$#$$$$$$$$,  .*$#$$$$*,  ~=$##$$$$#$$$$#$#$"
					     
			    };

		        
			    for (int i = 0; i < JopPhoto.length; i++) {
				      // 초 간 중지한다
				      Thread.sleep(100);
				      // 메세지를 출력한다
				      System.out.println(JopPhoto[i]);
				}
			    System.out.println(" ");
				
				System.out.println("내 면접지수와 은행 커트라인과 비교합니다.");
				System.out.println(" ");
				
				if(후니.후니_면접지수>=한쿡은행인사팀.면접지수_커트라인) {
					
			        //패스브금 (로딩브금과 동일)
				   	LoadingBgm passBgm02 = new LoadingBgm();
			          
			        try {
			             passBgm02.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }

					
					System.out.println("===========================================================");
					System.out.println(" ");
					
					String PASS[] = { // 타이핑 쓰레드 - 익명 클래스
				            "______   ___   _____  _____ ",    
				            "| ___ \\ / _ \\ /  ___|/  ___|",
				            "| |_/ // /_\\ \\\\ `--. \\ `--. ",
				            "|  __/ |  _  | `--. \\ `--. \\",
				            "| |    | | | |/\\__/ //\\__/ /",
				            "\\_|    \\_| |_/\\____/ \\____/"
				    };

			        
				    for (int i = 0; i < PASS.length; i++) {
					      // 초 간 중지한다
					      Thread.sleep(450);
					      // 메세지를 출력한다
					      System.out.println(PASS[i]);
					} 
					System.out.println(" ");
					System.out.println("하반기 채용에 최종합격하였습니다!!");
					System.out.println("신입사원 연수 때 뵙겠습니다.");
					System.out.println("===========================================================");
					
					break;
					
				}else {
					
					System.out.println(" ");
					System.out.println("귀하께서는 아쉽게도 선발 명단에 없음을 알려드립니다. 감사합니다.");				
					System.out.println("게임이 종료되었습니다.");
					System.out.println(" ");
					
					GoodbyeWorldBgm GoodbyeWorldBgm = new GoodbyeWorldBgm();
					GoodbyeWorldBgm.join();
					
			        try {
			        	GoodbyeWorldBgm.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					
					String GameEnd[] = { // 타이핑 쓰레드 - 익명 클래스

	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@=;:;;;;:=#@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@#-*@@@@@@@@@@@$-*@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@*;@@@@@@@@@@@@@@@@@=;#@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@!!@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@@@@",
	"@@@@@@@@@@#;@@@@@@@@@@@@@@@@@@@@@@@@@=*@@@@@@@@@@@",
	"@@@@@@@@@$$@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@@",
	"@@@@@@@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
	"@@@@@@@*#@@@@@~~~~~~$@@@@@@@@@@@*~!@@@@@@;@@@@@@@@",
	"@@@@@@$#@@@@@@      =@@@@@@@@@@@: ~@@@@@@@;@@@@@@@",
	"@@@@@@=@@@@@@@  !@@@@@;** ;@@#.,: ~@@@@@@@@=@@@@@@",
	"@@@@@~@@@@@@@@      ##     *@     ~@@@@@@@@=@@@@@@",
	"@@@@*@@@@@@@@@      ##  @. != .@- ~@@@@@@@@@~@@@@@",
	"@@@@!@@@@@@@@@  !@@@@#  @, !! ~@: ~@@@@@@@@@@#@@@@",
	"@@@=#@@@@@@@@@      ;#  @, !@  $  ~@@@@@@@@@@;@@@@",
	"@@@!@@@@@@@@@@      ;#  @, *@-  ; ~@@@@@@@@@@=@@@@",
	"@@@!@@@@@@@@@@@@@@@@@@@@@@@@@@#@@@@@@@@@@@@@@@=@@@",
	"@@#$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
	"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
	"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@#@@@@@@$-  -=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@#$@@@@#      =@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*@@@",
	"@@@;@@@@, .@@ ;$@@-..~@@~~@,.@=.-@@@~.,$@@@@@#$@@@",
	"@@@!@@@@  ;@!!!*@     ~@         !@  .  :@@@@*@@@@",
	"@@@$#@@@  !@   ,@!:#!  @  ;=  @- -*  *:  @@@@;@@@@",
	"@@@@!@@@. -@=! ,@~  ;  @  *#  @~ -!  ,,,,@@@@@@@@@",
	"@@@@$@@@;  ..  ,@  @,  @  *#  @~ -$  #~ .@@@-@@@@@",
	"@@@@@-@@@-    -@@   -  @  *#  @~ -@:   .@@@*@@@@@@",
	"@@@@@@!@@@@##@@@@@#@@@@@@@@@@@@@@@@@@#@@@@#=@@@@@@",
	"@@@@@@$=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@@@@@",
	"@@@@@@@*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@",
	"@@@@@@@@=$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
	"@@@@@@@@@$!@@@@@@@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@",
	"@@@@@@@@@@@;@@@@@@@@@@@@@@@@@@@@@@@@@:$@@@@@@@@@@@",
	"@@@@@@@@@@@@$:@@@@@@@@@@@@@@@@@@@@@$;@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@=!$@@@@@@@@@@@@@@@#*;@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@#!!*#@@@@@@@#=!!=@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@#$=***=$#@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
							                                                       
				    };

			        
				    for (int i = 0; i < GameEnd.length; i++) {
					      // 초 간 중지한다
					      Thread.sleep(250);
					      // 메세지를 출력한다
					      System.out.println(GameEnd[i]);
					} 
					

					
					System.exit(0);
	//게임이 종료되어야				
				}
				
			}else if(InterviewTest2  == 2) {
				
				GoodbyeWorldBgm GoodbyeWorldBgm = new GoodbyeWorldBgm();
				GoodbyeWorldBgm.join();
				
		        try {
		        	GoodbyeWorldBgm.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
				
				String GameEnd[] = { // 타이핑 쓰레드 - 익명 클래스

	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@=;:;;;;:=#@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@#-*@@@@@@@@@@@$-*@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@*;@@@@@@@@@@@@@@@@@=;#@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@!!@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@@@@",
	"@@@@@@@@@@#;@@@@@@@@@@@@@@@@@@@@@@@@@=*@@@@@@@@@@@",
	"@@@@@@@@@$$@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@@",
	"@@@@@@@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
	"@@@@@@@*#@@@@@~~~~~~$@@@@@@@@@@@*~!@@@@@@;@@@@@@@@",
	"@@@@@@$#@@@@@@      =@@@@@@@@@@@: ~@@@@@@@;@@@@@@@",
	"@@@@@@=@@@@@@@  !@@@@@;** ;@@#.,: ~@@@@@@@@=@@@@@@",
	"@@@@@~@@@@@@@@      ##     *@     ~@@@@@@@@=@@@@@@",
	"@@@@*@@@@@@@@@      ##  @. != .@- ~@@@@@@@@@~@@@@@",
	"@@@@!@@@@@@@@@  !@@@@#  @, !! ~@: ~@@@@@@@@@@#@@@@",
	"@@@=#@@@@@@@@@      ;#  @, !@  $  ~@@@@@@@@@@;@@@@",
	"@@@!@@@@@@@@@@      ;#  @, *@-  ; ~@@@@@@@@@@=@@@@",
	"@@@!@@@@@@@@@@@@@@@@@@@@@@@@@@#@@@@@@@@@@@@@@@=@@@",
	"@@#$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
	"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
	"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@#@@@@@@$-  -=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
	"@@#$@@@@#      =@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*@@@",
	"@@@;@@@@, .@@ ;$@@-..~@@~~@,.@=.-@@@~.,$@@@@@#$@@@",
	"@@@!@@@@  ;@!!!*@     ~@         !@  .  :@@@@*@@@@",
	"@@@$#@@@  !@   ,@!:#!  @  ;=  @- -*  *:  @@@@;@@@@",
	"@@@@!@@@. -@=! ,@~  ;  @  *#  @~ -!  ,,,,@@@@@@@@@",
	"@@@@$@@@;  ..  ,@  @,  @  *#  @~ -$  #~ .@@@-@@@@@",
	"@@@@@-@@@-    -@@   -  @  *#  @~ -@:   .@@@*@@@@@@",
	"@@@@@@!@@@@##@@@@@#@@@@@@@@@@@@@@@@@@#@@@@#=@@@@@@",
	"@@@@@@$=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@@@@@",
	"@@@@@@@*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@",
	"@@@@@@@@=$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
	"@@@@@@@@@$!@@@@@@@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@",
	"@@@@@@@@@@@;@@@@@@@@@@@@@@@@@@@@@@@@@:$@@@@@@@@@@@",
	"@@@@@@@@@@@@$:@@@@@@@@@@@@@@@@@@@@@$;@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@=!$@@@@@@@@@@@@@@@#*;@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@#!!*#@@@@@@@#=!!=@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@#$=***=$#@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
	"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
						                                                       
			    };

		        
			    for (int i = 0; i < GameEnd.length; i++) {
				      // 초 간 중지한다
				      Thread.sleep(250);
				      // 메세지를 출력한다
				      System.out.println(GameEnd[i]);
				} 
				System.out.println("취업준비를 포기했습니다.");
				System.out.println("게임이 종료되었습니다.");
				
				System.exit(0);
	//게임이 종료되어야				
				
				break;
				
								
			}else {
				System.out.println("다시 입력하세요.");
				 
				continue;
			}
			InterviewTest2 ++;
			}
			
			
			}else if (은행선택 ==2) {
				Buttonbgm ButtonBgm = new Buttonbgm();
				
		        try {
		        	 ButtonBgm.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
				
				System.out.println("[후니] 좋아! 쿡민은행 가보자!");
				System.out.println("===========================================================");
				System.out.println("쿡민은행 요구 서류지수 : " + 쿡민은행인사팀.서류지수_커트라인);
				System.out.println("쿡민은행 요구 필기지수 : " + 쿡민은행인사팀.필기지수_커트라인);
				System.out.println("쿡민은행 요구 면접지수 : " + 쿡민은행인사팀.면접지수_커트라인);
				System.out.println("===========================================================");
				
				후니.후니_서류지수 = 0; 후니.후니_필기지수 = 0; 후니.후니_면접지수 = 0;
				후니.후니_체력지수 = 90; 후니.후니_자존감지수 = 90; 후니.후니_스트레스지수 = 10;
				
				후니.상태알림();

				System.out.println("===========================================================");
				System.out.println("[후니] 어랏? 체력지수, 자존감지수, 스트레스지수가 뭐지?");
				System.out.println("팁을 확인하시려면 1번, 무시하시려면 2번");
				
				int 게임지수팁 = scan.nextInt();
				
				if ( 게임지수팁 == 1) {
					System.out.println("===========================================================");
					System.out.println("각 지수의 최대치는 100이며 100을 초과하거나 0 미안이 될 수 없습니다.");
					System.out.println("체력지수는 90으로 시작되며 0이 되면 게임종료입니다.");
					System.out.println("자존감지수는 90으로 시작되며 0이 되면 게임종료입니다.");
					System.out.println("스트레스지수는 10으로 시작되며 100이 되면 게임종료입니다.");
					System.out.println(" ");
					System.out.println("체력지수가 1~20, 자존감지수가 1~20, 스트레스지수가 80~99일 때 경고창이 뜹니다.");		
					System.out.println("취준은 마라톤입니다.");
					System.out.println("각 지수들을 잘 관리하는게 취업의 핵심입니다.");
					System.out.println("===========================================================");
							
					}else{
						System.out.println("===========================================================");
				}		
				
				System.out.println("[후니] 후.. 쉽지 않군.");
				System.out.println("[후니] 그래도 열심히 해봐야지. 취업준비를 시작해볼까?"); // 1번 활동, 2번 상태확인, 3번 메인메뉴

			
				
				while (true) {
					System.out.println(" ");
					System.out.println("< 메인메뉴 > ");
					System.out.println("1. 활동"); // 1번 활동, 2번 상태확인, 3번 취준포기
					System.out.println("2. 상태확인");
					System.out.println("3. 겨울방학 취준포기");
					System.out.println(" ");

					int 메인메뉴선택창 = scan.nextInt();
					
					if ( 메인메뉴선택창 == 1) {
						
						if (true) {
							System.out.println(" ");
							System.out.println("겨울방학입니다. 겨울방학엔 자격증을 취득할 수 있습니다.");
							System.out.println("무엇을 취득하시겠습니까?");
							System.out.println("1. 컴퓨터자격증 ");
							System.out.println("2. 어학자격증");
							System.out.println("3. 금융자격증");
							System.out.println("4. 뒤로가기");
							System.out.println(" ");
							
							int 겨울방학선택창 = scan.nextInt(); // 70% 확률로 자격증 취득

						    if (겨울방학선택창 == 1) {
						    	컴퓨터자격증 컴퓨터자격증 = new 컴퓨터자격증 ();// 컴퓨터자격증클래스에서 컴퓨터자격증 객체를 만들어줬다.
								컴퓨터자격증.스펙이름 = "컴퓨터자격증";
						    	
						    	System.out.println("컴퓨터 자격증은 기본이지!!");
								System.out.println("컴퓨터자격증 시험에 응시했습니다.");
								
								
								ComputerInputThread ComputerInputThread = new ComputerInputThread();
								ComputerCountdownThread ComputerCountdownThread = new ComputerCountdownThread(); 
								
								ComputerInputThread.start(); //값을 처리
								ComputerCountdownThread.start(); //카운트다운을 처리
								ComputerCountdownThread.join();
								
								
								break;
						    
						    }else if(겨울방학선택창 == 2) {
								어학자격증 어학자격증 = new 어학자격증 ();
								어학자격증.스펙이름 = "어학자격증";
						    	
						    	System.out.println("혹시 모르니 어학자격증 하나는 따놓자!!!");
								System.out.println("어학자격증 시험에 응시했습니다.");
								
								// 5초 동안 input패털에 값을 입력하지 않았을 때 게임실패
								// 이를 위해 메인메소드가 있는 클래스에 inputCheck라는 static boolean값 생성
								
								EnglishInputThread EnglishInputThread = new EnglishInputThread();
								EnglishCountdownThread EnglishCountdownThread = new EnglishCountdownThread(); 
								
								EnglishInputThread.start();
								EnglishCountdownThread.start();
								EnglishCountdownThread.join();
								
								break;
								
						    }else if(겨울방학선택창 == 3) {
								금융자격증 금융자격증 = new 금융자격증 ();
								금융자격증.스펙이름 = "금융자격증";
						    	
								System.out.println("금융권 준비하는데 금융자격증은 기본이지!!");
								System.out.println("금융자격증 시험에 응시했습니다.");
								
								// 10초 동안 input에 값을 입력하지 않았을 때 게임실패
								// 이를 위해 메인메소드가 있는 클래스에 inputCheck라는 static boolean값 생성
								
								FinanceInputThread FinanceInputThread = new FinanceInputThread();
								FinanceCountdownThread FinanceCountdownThread = new FinanceCountdownThread(); 
								
								FinanceInputThread.start();
								FinanceCountdownThread.start();
								FinanceCountdownThread.join();
								
						    							
								break;
								
						    }else if(겨울방학선택창 == 4) {
						    	continue;
						    }else {
								System.out.println("다시 입력하세요.");
						    	continue;
						    }
						    
						}
						
					}else if(메인메뉴선택창 == 2){
						후니.상태알림();
						
					}else if(메인메뉴선택창 == 3) {
						System.out.println("겨울방학 취준을 포기하시겠습니까?");
						System.out.println("1. 네");
						System.out.println("2. 아니오");
						
						
						int 취준포기선택창 = scan.nextInt();
						
						if(취준포기선택창 ==1) {
					        System.out.println("겨울방학 취업준비를 포기했습니다.");
							
							break;

						}else if(취준포기선택창 == 2) {
							continue;
						}else {
							System.out.println("다시 입력하세요."); // 취준을 포기하시겟습니까?가 뜨도록. 맨처음 메인메뉴창이 아니라.
							continue; 						   // 이 if문을 while문 안에 넣게 되면 취준포기선택창 == 2가 1.활동 2. 상태확인 3. 취준포기가 나와야
						}
						
					}else {
						System.out.println("다시 입력하세요.");
						continue;
					}
					
				}	
						
				System.out.println("겨울방학이 끝나고,");
				System.out.println("4학년 1학기가 시작되었습니다.");
				System.out.println(" ");
				System.out.println("한 학기는 총 12턴으로 이루어져 있습니다.");
				System.out.println("방학 때보다 더 많은 활동을 할 수 있습니다.");
				System.out.println("무엇을 하시겠습니까?"); // 한 턴당 1주가 지나며 총 16턴을 하면 여름방학으로 넘어가도록 해줘야함
				
				int turnsOfSpringsemester = 1; // 4학년 1학기 총 12턴!!
				
				while (turnsOfSpringsemester <= 12) {
					System.out.println("< 메인메뉴 > ");
					System.out.println("1. 활동"); // 1번 활동, 2번 상태확인, 3번 취준포기
					System.out.println("2. 상태확인");
					System.out.println("3. 1학기 취준포기");
							
					int 메인메뉴선택창 = scan.nextInt();
					
					if ( 메인메뉴선택창 == 1) {

						if (true) {
							System.out.println(" ");
							System.out.println("4학년 1학기 : " + turnsOfSpringsemester+"/12" + "번째 턴입니다.");
							System.out.println("어디에 가시겠습니까?");
							System.out.println("1. 학교에 간다");
							System.out.println("2. 동네에 간다");
							System.out.println("3. 집에 간다");
							System.out.println("4. 뒤로가기");
							System.out.println("<< 학교, 동네, 집 각각 일정확률로 이벤트가 튀어나옵니다. >>");
							System.out.println(" ");	

							
							int 일학기선택창 = scan.nextInt();

						    if (일학기선택창 == 1) {
								System.out.println(" ");
								System.out.println("학교에 왔습니다.");
								System.out.println("학교에서 무엇을 하시겠습니까?");
								System.out.println("1. 학점관리");
								System.out.println("2. 금융동아리활동");
								System.out.println("3. 취업지원본부 컨설팅");
								System.out.println("4. 면접스터디");
								System.out.println("5. 뒤로가기");
								System.out.println(" ");

								
								int 학교선택창 = scan.nextInt();
								
								if(학교선택창 ==1) {
							        System.out.println("후.. 전공공부 열심히 해야지!!");
									System.out.println("학교에서 열심히 학점관리를 합니다.");
									System.out.println(" ");
									후니.학점관리();
									System.out.println(" ");
									
									SomethingGirl SomethingGirl = new SomethingGirl();

									SomethingGirl.SomethingGirlCome();
									SomethingGirl.join(); 
									System.out.println(" ");
									후니.상태알림();
									
								}else if(학교선택창 == 2) {
									System.out.println("동아리에서 선배들에게 취업꿀팁을 얻습니다.");
									후니.금융동아리모임_참석();
									System.out.println(" ");
									
									CircleBroThread CircleBro = new CircleBroThread();

									CircleBro.CircleBroCome();
									CircleBro.join(); 
									System.out.println(" ");
									후니.상태알림();
									
								}else if(학교선택창 == 3) {
									System.out.println("취업지원본부에서 컨설팅을 받습니다.");
									후니.취업지원본부_컨설팅();
									후니.상태알림();
									
								}else if(학교선택창 == 4) {
									System.out.println("면접스터디를 통해 면접역량을 강화시킵니다.");
									후니.면접스터디_참석();
									
									//돌발이벤트 발생
									
									InterviewStudyMember Studymember= new InterviewStudyMember();

									Studymember.GoFeedback();
									Studymember.join(); 
									
									후니.상태알림();
									
								}else if(학교선택창 == 5) {
									continue;
								}else {
									System.out.println("다시 입력하세요."); // 취준을 포기하시겟습니까?가 뜨도록. 맨처음 메인메뉴창이 아니라.
									continue; 						   // 이 if문을 while문 안에 넣게 되면 취준포기선택창 == 2가 1.활동 2. 상태확인 3. 취준포기가 나와야
								}
								
								
								BankHuman BankHuman = new BankHuman(); 
									
									if(BankHuman.현직자멘토링()) {
										
										System.out.println("학교 랜덤 이벤트 <은행 현직자 멘토링>");
										System.out.println("은행 현직자 멘토링에 참여하시겠습니까?");
										System.out.println("1. 참여");
										System.out.println("2. 불참");
			
										//객체.객체함수다. 객체의 기능!	
										
										int 멘토링선택창 = scan.nextInt();
										
										if(멘토링선택창 == 1) {
											System.out.println("멘토링에 참여해 많은 조언들을 얻습니다.");	
											BankHuman.후니의_서류지수_증가(5);
											BankHuman.후니의_필기지수_증가(5);
											BankHuman.후니의_면접지수_증가(5);
											BankHuman.후니의_체력지수_감소(10);
											
											후니.상태알림();
											
										}else if(멘토링선택창 == 2) {
											System.out.println("멘토링에 불참하고 체력을 회복합니다.");
											BankHuman.후니의_체력지수_증가(10);
											후니.상태알림();					
										}else {
											System.out.println("다시 입력하세요."); // 은행 현직자 멘토링에 참여하시겠습니까?가 뜨도록.
											continue; 	
										}
										
									}else {
										System.out.println("랜덤이벤트가 없습니다.");
									}
								
								
						    }else if(일학기선택창 == 2) {
								System.out.println(" ");
						    	System.out.println("동네에 왔습니다.");
								System.out.println("동네에서 무엇을 하시겠습니까?");
								System.out.println("1. 헬스");
								System.out.println("2. 치맥");
								System.out.println("3. 뒤로가기");
								System.out.println(" ");
								
								int 동네선택창 = scan.nextInt();
								
								if(동네선택창 ==1) {
							        
							        System.out.println(" ");
							        
								    
								    System.out.println(" ");
									System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
									System.out.println(" ");
									후니.헬스장();
									후니.상태알림();
									
								}else if(동네선택창 == 2) {
								    System.out.println(" ");
									System.out.println("치맥으로 스트레스를 풉니다.");
									후니.치맥();
									후니.상태알림();
									
								}else if(동네선택창 == 3) {
									continue;
								}else {
									System.out.println("다시 입력하세요."); // 취준을 포기하시겟습니까?가 뜨도록. 맨처음 메인메뉴창이 아니라.
									continue; 						   // 이 if문을 while문 안에 넣게 되면 취준포기선택창 == 2가 1.활동 2. 상태확인 3. 취준포기가 나와야
								}
								
								// (동네) 동네에서 군대에서 헤어진 여자친구 만남 // 전 여자친구가 먼저 말 건넬 확률 10% // 한 번만 나오도록!
								Character Xgirlfriend = new Character(); 
								Xgirlfriend.관계 = "전 여자친구";
								
								if(Xgirlfriend.talkfirst()) {
									
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
							        
									System.out.println("동네 랜덤 이벤트 <전 여자친구와의 만남>");
									System.out.println("동네에서 우연히 전 여자친구를 만났습니다.");
									System.out.println("잘 지내냐는 안부인사를 건네옵니다.");
									System.out.println("1. 나도 안부인사를 해준다. ");
									System.out.println("2. 무시하고 지나간다. ");

									//객체.객체함수다. 객체의 기능!	
									
									int 전여자친구선택창 = scan.nextInt();
									
									if(전여자친구선택창 == 1) {
										System.out.println("[후니] 아 오랜만이네 ㅎㅎㅎ");	
										Xgirlfriend.후니의_스트레스지수_증가(10);
										후니.상태알림();
										
									}else if(전여자친구선택창 == 2) {
										System.out.println("[후니] (인사를 왜 하는거지)");
										Xgirlfriend.후니의_자존감지수_증가(10);
										후니.상태알림();					
									}else {
										System.out.println("다시 입력하세요."); 
										continue; 	
									}
									
								}else {
									System.out.println("랜덤이벤트가 없습니다.");
								}
								
						    }else if(일학기선택창 == 3) {
								System.out.println(" ");
						    	System.out.println("집에 왔습니다.");
								System.out.println("집에서 무엇을 하시겠습니까?");
								System.out.println("1. 부모님과 식사");
								System.out.println("2. 일기쓰기");
								System.out.println("3. 낮잠자기");
								System.out.println("4. 뒤로가기");
								System.out.println(" ");
								
								int 집선택창 = scan.nextInt();
								
								if(집선택창 ==1) {
									//버튼효과음
									
									String parents[] = {
											"부모님과 식사하며 취업 관련 이야기를 합니다.",
											"[부모님] 취업준비는 좀 잘 되고 있니?",
											"[후니] 나름대로 열심히 하고 있어요 ㅎㅎ",
											"[부모님] 그래그래 넌 혼자 알아서 잘 하리라 믿는다 ㅎㅎ ",
											"[후니] (후.. 이렇게나 날 믿어주시는데 잘 안되네 ㅠㅠ) ",
											"[부모님] 밥 많이 먹고 힘내라 아들",
											" "
									};
									
									for (int i = 0; i <parents.length; i++) {
										Thread.sleep(500);//0.5초마다 한 문장씩 출력
										System.out.println(parents[i]);
									}
									System.out.println(" ");

									후니.부모님과식사();
									
									
									RelativeClass relative = new RelativeClass();
									relative.RelativeCome();
									relative.join(); 
									
									System.out.println(" ");
									System.out.println(" ");
									
									후니.상태알림();
									
									
								}else if(집선택창 == 2) {
										    System.out.println(" ");
										    System.out.println("일기를 쓰며 하루를 점검하고 스스로를 보살핍니다.");
									후니.일기();
									후니.상태알림();
									
						    	}else if(집선택창 == 3) {
								    System.out.println(" ");
								    
						    		System.out.println("낮잠을 통해 부족한 체력을 충전합니다.");
						    		후니.낮잠();
						    		후니.상태알림();
						    		
						    	}else if(집선택창 == 4) {
									continue;
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						
								}
								
								
								Character UniversityFriend = new Character(); 
								UniversityFriend.관계 = "과동기";
								
								if(UniversityFriend.kakaotalk()) {
									
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
							        
									System.out.println("집 랜덤 이벤트 <과동기의 공무원 합격소식>");
									System.out.println("평소에 연락도 없던 과동기에게 공무원 합격했다고 연락옵니다.");
									System.out.println("1. 축하답장을 해준다.");
									System.out.println("2. 읽씹한다.");

									//객체.객체함수다. 객체의 기능!	
									
									int 과동기선택창 = scan.nextInt();
									
									if(과동기선택창 == 1) {
										System.out.println("[후니] 축하해 ㅎㅎㅎㅎㅎㅎ");	
										UniversityFriend.후니의_스트레스지수_증가(10);
										후니.상태알림();
										
									}else if(과동기선택창 == 2) {
										System.out.println("[후니] (읽씹) 별로 친하지도 않았는데 ;;");
										UniversityFriend.후니의_자존감지수_증가(10);
										후니.상태알림();					
									}else {
										System.out.println("다시 입력하세요."); // 은행 현직자 멘토링에 참여하시겠습니까?가 뜨도록.
										continue; 	
									}
									
								}else {
									System.out.println("랜덤이벤트가 없습니다.");
								}
								
						    }else if(일학기선택창 == 4) {
						    	continue;
						    }else {
								System.out.println("다시 입력하세요.");
						    	continue;
						    }
						    
						}
						
						turnsOfSpringsemester ++;	
						
					}else if(메인메뉴선택창 == 2){
					
						후니.상태알림();
						
					}else if(메인메뉴선택창 == 3) {
							
						System.out.println("취준을 포기하시겠습니까?");
						System.out.println("1. 네");
						System.out.println("2. 아니오");
						
						int 취준포기선택창 = scan.nextInt();
						
						if(취준포기선택창 ==1) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println("4학년 1학기 취업준비를 포기했습니다.");
							
//							FinishBgm FinishBgm = new FinishBgm(); // 취준포기하면 피니시브금 나오게!
//							FinishBgm.start();
//							
//					        try {
//					        	 FinishBgm.LoadBgm();
//					             Thread.sleep(0);
//					        }catch(InterruptedException e) {
//					             e.printStackTrace();
//					        
//					        }
							
							break;

						}else if(취준포기선택창 == 2) {
							continue;
						}else {
							System.out.println("다시 입력하세요."); // 취준을 포기하시겟습니까?가 뜨도록. 맨처음 메인메뉴창이 아니라.
							continue; 						   // 이 if문을 while문 안에 넣게 되면 취준포기선택창 == 2가 1.활동 2. 상태확인 3. 취준포기가 나와야
						}
						
					}else {
						System.out.println("다시 입력하세요.");
						continue;
					}

				}	
				
				
				System.out.println("4학년 1학기가 끝났습니다.");
				System.out.println("여름방학이 시작되었습니다.");
				System.out.println("여름방학엔 자격증 외에 다양한 스펙들 중 하나를 쌓을 수 있습니다.");
				
				
				while (true) {
					System.out.println(" ");
					System.out.println("< 메인메뉴 > ");
					System.out.println("1. 활동"); // 1번 활동, 2번 상태확인, 3번 취준포기
					System.out.println("2. 상태확인");
					System.out.println("3. 여름방학 취준포기");
					System.out.println(" ");
							
					int 메인메뉴선택창 = scan.nextInt();
					
					if ( 메인메뉴선택창 == 1) {

						if (true) {
							System.out.println(" ");
							System.out.println("무엇을 하시겠습니까?");
							System.out.println("1. 인턴");
							System.out.println("2. 대외활동");
							System.out.println("3. 공모전");
							System.out.println("4. 뒤로가기");
							System.out.println(" ");

							int 여름방학선택창 = scan.nextInt();

						    if (여름방학선택창 == 1) {
								System.out.println("학교 연계형 은행인턴입니다."); // 부장님이 예민합니다. 센스 발휘 확률
								인턴 인턴 = new 인턴();
								인턴.후니의_서류지수_증가(10);
								인턴.후니의_필기지수_증가(5);
								인턴.후니의_면접지수_증가(5);
								인턴.후니의_체력지수_감소(10);
								인턴.후니의_자존감지수_증가(5);
								인턴.후니의_스트레스지수_증가(10);
//								인턴.센스_추가();
								
								후니.상태알림();
								
								break;
						    
						    }else if(여름방학선택창 == 2) {
								System.out.println(" ");
						    	System.out.println("어떤 대외활동을 하시겠습니까?");
								System.out.println("1. 기자단");
								System.out.println("2. 서포터즈");
								System.out.println("3. 뒤로가기");
								System.out.println(" ");

								int 대외활동선택창 = scan.nextInt();
								
								if(대외활동선택창 ==1) {
									System.out.println("여름방학 동안 은행 기자단을 진행합니다."); // 거의 다 마무리된 기사가 날라감
									기자단 기자단 = new 기자단();
									기자단.후니의_서류지수_증가(10);
									기자단.후니의_면접지수_증가(5);
									기자단.후니의_체력지수_감소(10);
									기자단.후니의_스트레스지수_증가(10);

									
									후니.상태알림();
									
								}else if(대외활동선택창 == 2) {
									System.out.println("여름방학 동안 은행 서포터즈를 진행합니다."); // 갑자기 팀원이 나감.
									서포터즈 서포터즈 = new 서포터즈();
									서포터즈.후니의_서류지수_증가(10);
									서포터즈.후니의_면접지수_증가(5);
									서포터즈.후니의_체력지수_감소(10);
									서포터즈.후니의_스트레스지수_증가(10);

									
									후니.상태알림();
									
								}else if(대외활동선택창 == 3) {
									continue;
								}else {
									System.out.println("다시 입력하세요.");
									continue; 						 
								}
								
								break;
								
						    }else if(여름방학선택창 == 3) {
								System.out.println(" ");
						    	System.out.println("어떤 공모전을 하시겠습니까?");
								System.out.println("1. 아이디어 공모전");
								System.out.println("2. 논문공모전");
								System.out.println("3. 뒤로가기");
								System.out.println(" ");
								
								int 공모전선택창 = scan.nextInt();
								
								if(공모전선택창 ==1) {
									System.out.println("여름방학 동안 아이디어 공모전을 진행합니다."); // 다른 팀이 내 아이디어 베낌
									아이디어공모전 아이디어공모전 = new 아이디어공모전();
									아이디어공모전.후니의_서류지수_증가(10);
									아이디어공모전.후니의_면접지수_증가(5);
									아이디어공모전.후니의_체력지수_감소(10);
									아이디어공모전.후니의_스트레스지수_증가(10);
									아이디어공모전.창의력_추가();
									
									후니.상태알림();
									
								}else if(공모전선택창 == 2) {
									System.out.println("여름방학 동안 논문공모전을 진행합니다."); // 내껄 빼먹고 심사할 확률 	
									논문공모전 논문공모전 = new 논문공모전();
									논문공모전.후니의_서류지수_증가(10);
									논문공모전.후니의_면접지수_증가(5);
									논문공모전.후니의_체력지수_감소(10);
									논문공모전.후니의_스트레스지수_증가(10);
									논문공모전.사고력_추가();
									
									후니.상태알림();
									
						    	}else if(공모전선택창 == 3) {
						    		continue;
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						   
								}
							
								break;	
								
						    }else if(여름방학선택창 == 4) {
						    	continue;
						    }else {
								System.out.println("다시 입력하세요.");
						    	continue;
						    }
						    
						}	
						
					}else if(메인메뉴선택창 == 2){
						Buttonbgm ButtonBgm1 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm1.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
					
						후니.상태알림();
						
					}else if(메인메뉴선택창 == 3) {
						Buttonbgm ButtonBgm1 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm1.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
							
						System.out.println("여름방학 취준을 포기하시겠습니까?");
						System.out.println("1. 네");
						System.out.println("2. 아니오");
						
						int 취준포기선택창 = scan.nextInt();
						
						if(취준포기선택창 ==1) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
					        System.out.println("여름방학 취업준비를 포기했습니다.");
							
//							FinishBgm FinishBgm = new FinishBgm(); // 취준포기하면 피니시브금 나오게!
//							FinishBgm.start();
//							
//					        try {
//					        	 FinishBgm.LoadBgm();
//					             Thread.sleep(0);
//					        }catch(InterruptedException e) {
//					             e.printStackTrace();
//					        
//					        }
							
							break;

						}else if(취준포기선택창 == 2) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							continue;
						}else {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println("다시 입력하세요."); 
							continue; 					
						}
						
					}else {
						Buttonbgm ButtonBgm3 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm3.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println("다시 입력하세요.");
						continue;
					}

				}
				
				System.out.println("여름방학이 끝나고,");
				System.out.println("4학년 2학기가 시작되었습니다.");
				System.out.println("===========================================================");
				System.out.println("2학기는 9월은 총 네 턴입니다.");
				System.out.println("10월은 세 턴 후 서류를 제출해야 합니다.");
				System.out.println("11월은 세 턴 후 필기전형에 응시해야 합니다.");
				System.out.println("12월은 세 턴 후 면접전형이 응시해야 합니다.");
				System.out.println("각 전형에 필요한 지수들과 자기관리에 집중합시다!");
				System.out.println("===========================================================");	
				int Sep = 1; // 9월 네 턴!
				
				while (Sep <= 4) {
					System.out.println(" ");
					System.out.println("< 메인메뉴 > ");
					System.out.println("1. 활동"); // 1번 활동, 2번 상태확인, 3번 취준포기
					System.out.println("2. 상태확인");
					System.out.println("3. 취준포기");
					System.out.println(" ");

					int 메인메뉴선택창 = scan.nextInt();
					
					if ( 메인메뉴선택창 == 1) {

						if (true) {
							System.out.println("4학년 2학기 9월 : " + Sep + "/4" + "번째 턴입니다.");
							System.out.println("어디에 가시겠습니까?");
							System.out.println("1. 학교에 간다");
							System.out.println("2. 동네에 간다");
							System.out.println("3. 집에 간다");
							System.out.println("4. 뒤로가기");
							System.out.println("<< 학교, 동네, 집 각각 일정확률로 이벤트가 튀어나옵니다. >>");

							
							int 일학기선택창 = scan.nextInt();

						    if (일학기선택창 == 1) {
								System.out.println("학교에 왔습니다.");
								System.out.println("학교에서 무엇을 하시겠습니까?");
								System.out.println("1. 학점관리");
								System.out.println("2. 금융동아리활동");
								System.out.println("3. 취업지원본부 컨설팅");
								System.out.println("4. 면접스터디");
								System.out.println("5. 뒤로가기");

								int 학교선택창 = scan.nextInt();
								
								if(학교선택창 ==1) {
							        System.out.println("후.. 전공공부 열심히 해야지!!");
									System.out.println("학교에서 열심히 학점관리를 합니다.");
									System.out.println(" ");
									후니.학점관리();
									
									System.out.println(" ");
									
									SomethingGirl SomethingGirl = new SomethingGirl();

									SomethingGirl.SomethingGirlCome();
									SomethingGirl.join(); 
									System.out.println(" ");
									
									후니.상태알림();
									
								}else if(학교선택창 == 2) {
									System.out.println("동아리에서 선배들에게 취업꿀팁을 얻습니다.");
									후니.금융동아리모임_참석();
									System.out.println(" ");
									
									CircleBroThread CircleBro = new CircleBroThread();

									CircleBro.CircleBroCome();
									CircleBro.join(); 
									System.out.println(" ");
									후니.상태알림();
									
								}else if(학교선택창 == 3) {
									System.out.println("취업지원본부에서 컨설팅을 받습니다.");
									후니.취업지원본부_컨설팅();
									후니.상태알림();
									
								}else if(학교선택창 == 4) {
									System.out.println("면접스터디를 통해 면접역량을 강화시킵니다.");
									후니.면접스터디_참석();
									
									InterviewStudyMember Studymember= new InterviewStudyMember();

									Studymember.GoFeedback();
									Studymember.join(); 
									
									후니.상태알림();
									
								}else if(학교선택창 == 5) {
									continue;
							
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						 
								}
								
								
								Character InterviewFriend = new Character(); 
								InterviewFriend.관계 = "취업스터디원";
								
									if(InterviewFriend.SuccessFirst()) {
										
										EventBgm EventBgm = new EventBgm();
										
								        try {
								        	EventBgm.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
								        
										System.out.println("학교 랜덤 이벤트 <취업스터디원이 먼저 합격했습니다.>");
										System.out.println("축하파티에 참여하시겠습니까?");
										System.out.println("1. 참여");
										System.out.println("2. 불참");
			
										//객체.객체함수다. 객체의 기능!	
										
										int goparty = scan.nextInt();
										
										if(goparty == 1) {
											System.out.println("축하파티에 참여해 많은 조언들을 얻습니다.");	
											InterviewFriend.후니의_서류지수_증가(5);
											InterviewFriend.후니의_필기지수_증가(5);
											InterviewFriend.후니의_면접지수_증가(5);
											InterviewFriend.후니의_체력지수_감소(10);
											InterviewFriend.후니의_자존감지수_감소(5);
											
											후니.상태알림();
											
										}else if(goparty == 2) {
											System.out.println("축하파티에 불참하고 체력을 회복합니다.");
											InterviewFriend.후니의_체력지수_증가(15);
											InterviewFriend.후니의_자존감지수_감소(5);
											InterviewFriend.후니의_스트레스지수_증가(5);
											
											후니.상태알림();					
										}else {
											System.out.println("다시 입력하세요.");
											continue; 	
										}
										
									}else {
										System.out.println("랜덤이벤트가 없습니다.");
									}
								
						    }else if(일학기선택창 == 2) {
						    	System.out.println("동네에 왔습니다.");
								System.out.println("동네에서 무엇을 하시겠습니까?");
								System.out.println("1. 헬스");
								System.out.println("2. 치맥");
								System.out.println("3. 뒤로가기");
								
								int 동네선택창 = scan.nextInt();
								
								if(동네선택창 ==1) {
							        System.out.println(" ");
									System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
									System.out.println(" ");
									후니.헬스장();
									후니.상태알림();
									
								}else if(동네선택창 == 2) {
									    System.out.println(" ");
										System.out.println("치맥으로 스트레스를 풉니다.");
										후니.치맥();
										후니.상태알림();
								
									
								}else if(동네선택창 == 3) {
									continue;
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						 
								}
								
								// (동네) 고등학교 친구에게 안부전화 올 확률 10% 
								
								Character HighschoolFriend = new Character(); 
								HighschoolFriend.관계 = "고등학교 친구";
								
									if(HighschoolFriend.HiCall()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									
									System.out.println("동네 랜덤 이벤트 <고등학교 친구의 안부전화>");
									System.out.println("잊고 있던 고등학교 친구에게 전화가 옵니다.");
									System.out.println("1. 전화를 받는다. ");
									System.out.println("2. 전화를 받지 않는다. ");

									//객체.객체함수다. 객체의 기능!	
									
									int 안부전화선택창 = scan.nextInt();
									
									if(안부전화선택창 == 1) {
										System.out.println("[고등학교 친구] 어 후니야! 아까 동네에서 너 본 것 같아서 전화했어!");	
										System.out.println("[고등학교 친구] 잘 지내고 있었지?");	
										System.out.println("[고등학교 친구] 전역한 이후로 한 번도 못봤는데! 보고 싶다야!");
										System.out.println("[후니] 말할 틈도 안주네!");
										System.out.println("[후니] 나도 보고 싶다야!");
										
										HighschoolFriend.후니의_체력지수_증가(10);
										HighschoolFriend.후니의_자존감지수_증가(10);
										HighschoolFriend.후니의_스트레스지수_감소(10);
										
										후니.상태알림();
										
									}else if(안부전화선택창 == 2) {
										System.out.println("[후니] 아 무슨 일이지.. 연락하기 싫은데..");
										HighschoolFriend.후니의_자존감지수_감소(10);
										HighschoolFriend.후니의_스트레스지수_증가(10);
										
										후니.상태알림();					
									}else {
										System.out.println("다시 입력하세요."); 
										continue; 	
									}
									
								}else {
									System.out.println("랜덤이벤트가 없습니다.");
								}
								
						    }else if(일학기선택창 == 3) {
						    	System.out.println("집에 왔습니다.");
								System.out.println("집에서 무엇을 하시겠습니까?");
								System.out.println("1. 부모님과 식사");
								System.out.println("2. 일기쓰기");
								System.out.println("3. 낮잠자기");
								System.out.println("4. 뒤로가기");
								
								int 집선택창 = scan.nextInt();
								
								if(집선택창 ==1) {
							        String parents[] = {
											"부모님과 식사하며 취업 관련 이야기를 합니다.",
											"[부모님] 취업준비는 좀 잘 되고 있니?",
											"[후니] 나름대로 열심히 하고 있어요 ㅎㅎ",
											"[부모님] 그래그래 넌 혼자 알아서 잘 하리라 믿는다 ㅎㅎ ",
											"[후니] (후.. 이렇게나 날 믿어주시는데 잘 안되네 ㅠㅠ) ",
											"[부모님] 밥 많이 먹고 힘내라 아들",
											" "
									};
									
									for (int i = 0; i <parents.length; i++) {
										Thread.sleep(500);//0.5초마다 한 문장씩 출력
										System.out.println(parents[i]);
									}
									System.out.println(" ");

									후니.부모님과식사();
									System.out.println(" ");

									RelativeClass relative = new RelativeClass();
									relative.RelativeCome();
									relative.join(); 
									System.out.println(" ");

									후니.상태알림();
									
								}else if(집선택창 == 2) {
									 String Diary[] = { // 타이핑 쓰레드 - 익명 클래스

									 		  ".*=~.,,,,,,,--,,,....  --,.............~!.-=-",   
											  ",$~,..,,,,,,,--,.....  --,..... ... ...~!. ;,",   
											  ",$~,.,,,,,,,,,-,.....  --,....  ... ...~!. ;,  ", 
											  ",$~,,,,,,,,,,,-,.....  --,....  ..  ...~!. ;-   ",
											  ",$~,,,,,,,,,,,-,,....  --,....   . . ..~;. ;,   ",
											  ",$~,,,,,,,,,,,-,,....  --,....       ..~;. ;,   ",
											  ",$~,,,,,,,,,,,,,,....  --,....       ..~;. ;,   ",
											  ",$~,,,,,--,,,,,,,....  --,..... .... ..~!. ;,   ",
											  ",$~,,,,,~;,,,,,,,....  --,.....  ..  ..:!. ;,   ",
											  ",$~,,,,-:;,,,,,,,....  --,....   ......:!. ;,   ",
											  ",$~,,,,-;!-,,,,,,....  --,....  .......;!. ;,   ",
											  ",$~,,,,-;!~,,,,,,....  --,....    ... .;!. ;,   ",
											  ",$~,,,,~;!~,,,,,,....  --,.....  ......;!..;,   ",
											  ",$~,,,,~;!~,,,,,,...   --,..... ..... .;!..!-   ",
											  ",$~,,,-~;!~,,,,,,...   --,.....  .... .;!. ;,   ",
											  ",$~,,,-~;!~,,,,,,....  --,............,;;. ;,   ",
											  ",$~,,,-~;!~,,,,,,....  --,.......... .,!!. ;,   ",
											  ",$~,,,-~;!~,,,,,,....  --,.......... .,!!. ;,   ",
											  ",$~,,,-~;!-,,,,,,....  --,............,!!. ;,   ",
											  ",$~,,,-~;!-,-,,,,.... .--,.......... .,!!. !-   ",
											  ",$~,,,-~;!-,-,,,,....  --,............,!!. ;,   ",
											  ",$~,,,-~;!,,--,,,,... .--,............,!!. !,   ",
											  ",$~,,,-~;!,,--,,,,... .--,............,!!. ;,   ",
											  ",$~,,,-~;!,,--,,,,... .--,............,*!. ;,   ",
											  ",$~,,,-~;!,,---,,,... .--,............,!!. ;,   ",
											  ",$~,,,-~;!,,---,,,... .--,............,*!..;,   ",
											  ",$~,,,-~!!,,---,,,,....--,............-*!..;,   ",
											  ",$~,,,-~!!,----,,,,....~-,............-$!..;,   ",
											  ",@#$$$$##!$$$$$$$$$$$=$=$$$$$$$$=====*$@#==$-   ",
											  " ..,.....!......-,..................  ... ..    ",
											  "         !      ::                          ",
										     
								    };

							        
								    for (int i = 0; i < Diary.length; i++) {
									      // 초 간 중지한다
									      Thread.sleep(100);
									      // 메세지를 출력한다
									      System.out.println(Diary[i]);
									}
								    System.out.println(" ");
								    System.out.println("일기를 쓰며 하루를 점검하고 스스로를 보살핍니다.");
							후니.일기();
							후니.상태알림();
						    	}else if(집선택창 == 3) {
									    System.out.println(" ");
									    
							    		System.out.println("낮잠을 통해 부족한 체력을 충전합니다.");
							    		후니.낮잠();
							    		후니.상태알림();
						    		
						    	}else if(집선택창 == 4) {
									continue;
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						
								}
								
								//(집) 동생의 병간호를 해야합니다.
								Character Bro = new Character(); 
								Bro.관계 = "남동생";
								
								if(Bro.gohospital()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("집 랜덤 이벤트 <동생의 입원>");
									System.out.println("동생이 입원했습니다.");
									System.out.println("병간호를 하시겠습니까?");
									System.out.println("1. 병간호를 한다.");
									System.out.println("2. 하지 않는다.");

									//객체.객체함수다. 객체의 기능!	
									
									int 병간호선택창 = scan.nextInt();
									
									if(병간호선택창 == 1) {
										System.out.println("[후니] (후.. 취준에 집안일까지..)");	
										System.out.println("[후니] 조심 좀 하지 그랬어 ㅠㅠ");	
										Bro.후니의_체력지수_감소(5);
										Bro.후니의_스트레스지수_증가(5);
										후니.상태알림();
										
									}else if(병간호선택창 == 2) {
										System.out.println("[후니] 너무 바빠.. 하반기 준비해야해..ㅠㅠ");
										Bro.후니의_스트레스지수_증가(5);
										Bro.후니의_자존감지수_감소(5);
										후니.상태알림();					
									}else {
										System.out.println("다시 입력하세요.");
										continue; 	
									}
									
								}else {
									System.out.println("랜덤이벤트가 없습니다.");
								}
								
						    }else if(일학기선택창 == 4) {
						    	continue;
						    }else {
								System.out.println("다시 입력하세요.");
						    	continue;
						    }
						    
						}
						
						Sep ++;	
						
					}else if(메인메뉴선택창 == 2){
						후니.상태알림();
						
					}else if(메인메뉴선택창 == 3) {
							
						System.out.println("취준을 포기하시겠습니까?");
						System.out.println("1. 네");
						System.out.println("2. 아니오");
						
						int 취준포기선택창 = scan.nextInt();
						
						if(취준포기선택창 ==1) {
							System.out.println("9월 취업준비를 포기했습니다.");					
							System.out.println("이제 10월입니다.");
							
							break;

						}else if(취준포기선택창 == 2) {
							continue;
						}else {
							System.out.println("다시 입력하세요."); // 취준을 포기하시겟습니까?가 뜨도록. 맨처음 메인메뉴창이 아니라.
							continue; 						   // 이 if문을 while문 안에 넣게 되면 취준포기선택창 == 2가 1.활동 2. 상태확인 3. 취준포기가 나와야
						}
						
					}else {
						System.out.println("다시 입력하세요.");
						continue;
					}

				}
				
				System.out.println("10월입니다.");	
				System.out.println("10월 마지막주에 서류전형이 있습니다.");					
				
				int OCT = 1; // 10월 세 턴! 후 서류 전형!!
				
				while (OCT <= 3) {
					System.out.println(" ");
					System.out.println("< 메인메뉴 > ");
					System.out.println("1. 활동"); // 1번 활동, 2번 상태확인, 3번 취준포기
					System.out.println("2. 상태확인");
					System.out.println("3. 취준포기");
					System.out.println(" ");
							
					int 메인메뉴선택창 = scan.nextInt();
					
					if ( 메인메뉴선택창 == 1) {

						if (true) {
							System.out.println(" ");
							System.out.println("4학년 2학기 10월 : " + OCT + "/3" + "번째 턴입니다.");
							System.out.println("어디에 가시겠습니까?");
							System.out.println("1. 학교에 간다");
							System.out.println("2. 동네에 간다");
							System.out.println("3. 집에 간다");
							System.out.println("4. 뒤로가기");
							System.out.println("<< 학교, 동네, 집 각각 일정확률로 이벤트가 튀어나옵니다. >>");

							System.out.println(" ");
							
							int 일학기선택창 = scan.nextInt();

						    if (일학기선택창 == 1) {
								System.out.println(" ");
								System.out.println("학교에 왔습니다.");
								System.out.println("학교에서 무엇을 하시겠습니까?");
								System.out.println("1. 학점관리");
								System.out.println("2. 금융동아리활동");
								System.out.println("3. 취업지원본부 컨설팅");
								System.out.println("4. 면접스터디");
								System.out.println("5. 뒤로가기");
								System.out.println(" ");

								int 학교선택창 = scan.nextInt();
								
								if(학교선택창 ==1) {
							        System.out.println("후.. 전공공부 열심히 해야지!!");
									System.out.println("학교에서 열심히 학점관리를 합니다.");
									후니.학점관리();
									
									System.out.println(" ");
									
									SomethingGirl SomethingGirl = new SomethingGirl();

									SomethingGirl.SomethingGirlCome();
									SomethingGirl.join(); 
									System.out.println(" ");
									후니.상태알림();
									
								}else if(학교선택창 == 2) {
									System.out.println("동아리에서 선배들에게 취업꿀팁을 얻습니다.");
									후니.금융동아리모임_참석();
									System.out.println(" ");
									
									CircleBroThread CircleBro = new CircleBroThread();

									CircleBro.CircleBroCome();
									CircleBro.join(); 
									System.out.println(" ");
									후니.상태알림();
									
								}else if(학교선택창 == 3) {
									System.out.println("취업지원본부에서 컨설팅을 받습니다.");
									후니.취업지원본부_컨설팅();
									후니.상태알림();
									
								}else if(학교선택창 == 4) {
									System.out.println("면접스터디를 통해 면접역량을 강화시킵니다.");
									후니.면접스터디_참석();
									
									InterviewStudyMember Studymember= new InterviewStudyMember();

									Studymember.GoFeedback();
									Studymember.join(); 
									
									후니.상태알림();
									
								}else if(학교선택창 == 5) {
									continue;
							
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						 
								}
								Character InterviewFriend = new Character(); 
								InterviewFriend.관계 = "취업스터디원";
								
									if(InterviewFriend.SuccessFirst()) {
										EventBgm EventBgm = new EventBgm();
										
								        try {
								        	EventBgm.LoadBgm();
								             Thread.sleep(0);
								             
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("학교 랜덤 이벤트 <취업스터디원이 먼저 합격했습니다.>");
										System.out.println("축하파티에 참여하시겠습니까?");
										System.out.println("1. 참여");
										System.out.println("2. 불참");
			
										//객체.객체함수다. 객체의 기능!	
										
										int goparty = scan.nextInt();
										
										if(goparty == 1) {
											System.out.println("축하파티에 참여해 많은 조언들을 얻습니다.");	
											InterviewFriend.후니의_서류지수_증가(5);
											InterviewFriend.후니의_필기지수_증가(5);
											InterviewFriend.후니의_면접지수_증가(5);
											InterviewFriend.후니의_체력지수_감소(10);
											InterviewFriend.후니의_자존감지수_감소(5);
											
											후니.상태알림();
											
										}else if(goparty == 2) {
											System.out.println("축하파티에 불참하고 체력을 회복합니다.");
											InterviewFriend.후니의_체력지수_증가(15);
											InterviewFriend.후니의_자존감지수_감소(5);
											InterviewFriend.후니의_스트레스지수_증가(5);
											
											후니.상태알림();					
										}else {
											System.out.println("다시 입력하세요.");
											continue; 	
										}
										
									}else {
										System.out.println("랜덤이벤트가 없습니다.");
									}
								
								
						    }else if(일학기선택창 == 2) {
								System.out.println(" ");
						    	System.out.println("동네에 왔습니다.");
								System.out.println("동네에서 무엇을 하시겠습니까?");
								System.out.println("1. 헬스");
								System.out.println("2. 치맥");
								System.out.println("3. 뒤로가기");
								System.out.println(" ");
								
								int 동네선택창 = scan.nextInt();
								
								if(동네선택창 ==1) {
								    
								    System.out.println(" ");
									System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
									System.out.println(" ");
									후니.헬스장();
									후니.상태알림();
									
								}else if(동네선택창 == 2) {
									String ChickenandBeer[] = { // 타이핑 쓰레드 - 익명 클래스

											"                       ,**~",               
											"....                  ,*  :;...!#=#.",      
											"!#@@#!,                !    ::::,   ;,",     
											"~@#-,,,$@!              -.            -~",     
											":#:-:!!!,;#=            ;!~            .;:",    
											".#*,!@@#@$,-#;          ;.                ;. ",  
											";$,,;:,,,:$-;@,         :                 .~ ",  
											"#~,,,,,,,-~-,#*         ;                 !.  ", 
											"#-,,,,,,,,,,,~=         .*-,,,  ,,,,,,,,,;;    ",
											"-*-,,,,,,,,,,,,@,          ;,,!  =,,,,,,,:~     ",
											"~*,,,,,,,,,,,,,@-          ~  !  $       -#=,   ",
											".=-,,,,,,,,,,,,=-          ~  *  # ,. ;  -~ !   ",
											" @~,,,,,,,,,,,,;!          ~   @#@ -. $  -@*.*  ",
											" *=,,,,,,,,,,,,;@          ~   * # -. $  --=.@  ",
											" ,@=,,,,,,,,,,,,$=         ~   * # -. $  --;,@  ",
											"  ~#*,,,,,,,,,,,:#-        ~   * # -. $  --*.@  ",
											"   ,##:,,,,,,,,,,@:        ~   * # -. $  -#$ $  ",
											"     *##;-,,,,,,:@$-       ~   * # -. $  -; !.  ",
											"      .-@#*-,,,:@~!@:-~    ~   * # -. $  -*$~   ",
											"         ;$@*::@;  ~$$=@~  ~   * # -. $  -~     ",
											"           -~=!*$!  ...-#. ~   * # -. $  --     ",
											"                ;#*    ,@- ~   ~ ! .  :  --     ",
											"                 ,@   *#=  ~.            -,     ",
											"                 ,@   $-   ~;           .*      ",
											"                  =!.:@-    -;;;;;;;;;;;;       ",
											"                  .@@@*                         ",
											    			      " .                      "
											     
									    };

								        
									    for (int i = 0; i < ChickenandBeer.length; i++) {
										      // 초 간 중지한다
										      Thread.sleep(100);
										      // 메세지를 출력한다
										      System.out.println(ChickenandBeer[i]);
										}
									    System.out.println(" ");
										System.out.println("치맥으로 스트레스를 풉니다.");
										후니.치맥();
										후니.상태알림();
									
								}else if(동네선택창 == 3) {
									System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
									후니.헬스장();
									후니.상태알림();
									continue;
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						 
								}
								
								// (동네) 고등학교 친구에게 안부전화 올 확률 10% 
								
								Character HighschoolFriend = new Character(); 
								HighschoolFriend.관계 = "고등학교 친구";
								
								if(HighschoolFriend.HiCall()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("동네 랜덤 이벤트 <고등학교 친구의 안부전화>");
									System.out.println("잊고 있던 고등학교 친구에게 전화가 옵니다.");
									System.out.println("1. 전화를 받는다. ");
									System.out.println("2. 전화를 받지 않는다. ");

									//객체.객체함수다. 객체의 기능!	
									
									int 안부전화선택창 = scan.nextInt();
									
									if(안부전화선택창 == 1) {
										System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
										후니.헬스장();
										후니.상태알림();
										System.out.println("[고등학교 친구] 어 후니야! 아까 동네에서 너 본 것 같아서 전화했어!");	
										System.out.println("[고등학교 친구] 잘 지내고 있었지?");	
										System.out.println("[고등학교 친구] 전역한 이후로 한 번도 못봤는데! 보고 싶다야!");
										System.out.println("[후니] 말할 틈도 안주네!");
										System.out.println("[후니] 나도 보고 싶다야!");
										
										HighschoolFriend.후니의_체력지수_증가(10);
										HighschoolFriend.후니의_자존감지수_증가(10);
										HighschoolFriend.후니의_스트레스지수_감소(10);
										
										후니.상태알림();
										
									}else if(안부전화선택창 == 2) {
										System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
										후니.헬스장();
										후니.상태알림();
										System.out.println("[후니] 아 무슨 일이지.. 요즘 사람들 만나기 싫은데..");
										HighschoolFriend.후니의_자존감지수_감소(10);
										HighschoolFriend.후니의_스트레스지수_증가(10);
										
										후니.상태알림();					
									}else {
										Buttonbgm ButtonBgm4 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm4.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
										후니.헬스장();
										후니.상태알림();
										System.out.println("다시 입력하세요."); 
										continue; 	
									}
									
								}else {
									System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
									후니.헬스장();
									후니.상태알림();
									System.out.println("랜덤이벤트가 없습니다.");
								}
								
						    }else if(일학기선택창 == 3) {
								System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
								후니.헬스장();
								후니.상태알림();
								System.out.println(" ");
						    	System.out.println("집에 왔습니다.");
								System.out.println("집에서 무엇을 하시겠습니까?");
								System.out.println("1. 부모님과 식사");
								System.out.println("2. 일기쓰기");
								System.out.println("3. 낮잠자기");
								System.out.println("4. 뒤로가기");
								System.out.println(" ");
								
								int 집선택창 = scan.nextInt();
								
								if(집선택창 ==1) {
							        String parents[] = {
											"부모님과 식사하며 취업 관련 이야기를 합니다.",
											"[부모님] 취업준비는 좀 잘 되고 있니?",
											"[후니] 나름대로 열심히 하고 있어요 ㅎㅎ",
											"[부모님] 그래그래 넌 혼자 알아서 잘 하리라 믿는다 ㅎㅎ ",
											"[후니] (후.. 이렇게나 날 믿어주시는데 잘 안되네 ㅠㅠ) ",
											"[부모님] 밥 많이 먹고 힘내라 아들",
											" "
									};
									
									for (int i = 0; i <parents.length; i++) {
										Thread.sleep(500);//0.5초마다 한 문장씩 출력
										System.out.println(parents[i]);
									}
									System.out.println(" ");

									후니.부모님과식사();
									System.out.println(" ");
									
									RelativeClass relative = new RelativeClass();
									relative.RelativeCome();
									relative.join(); 
									
									후니.상태알림();
									
								}else if(집선택창 == 2) {
							        
								    System.out.println(" ");
								    System.out.println("일기를 쓰며 하루를 점검하고 스스로를 보살핍니다.");
									후니.일기();
									후니.상태알림();
									
						    	}else if(집선택창 == 3) {
										    System.out.println(" ");
								    		System.out.println("낮잠을 통해 부족한 체력을 충전합니다.");
								    		후니.낮잠();
								    		후니.상태알림();
						    		
						    	}else if(집선택창 == 4) {

									continue;
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						
								}
								
								//(집) 동생의 병간호를 해야합니다.
								Character Bro = new Character(); 
								Bro.관계 = "남동생";
								
								if(Bro.gohospital()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("집 랜덤 이벤트 <동생의 입원>");
									System.out.println("동생이 입원했습니다.");
									System.out.println("병간호를 하시겠습니까?");
									System.out.println("1. 병간호를 한다.");
									System.out.println("2. 하지 않는다.");

									//객체.객체함수다. 객체의 기능!	
									
									int 병간호선택창 = scan.nextInt();
									
									if(병간호선택창 == 1) {
										
										System.out.println("[후니] (후.. 취준에 집안일까지..)");	
										System.out.println("[후니] 조심 좀 하지 그랬어 ㅠㅠ");	
										Bro.후니의_체력지수_감소(5);
										Bro.후니의_스트레스지수_증가(5);
										후니.상태알림();
										
									}else if(병간호선택창 == 2) {
										System.out.println("[후니] 너무 바빠.. 하반기 준비해야해..ㅠㅠ");
										Bro.후니의_스트레스지수_증가(5);
										Bro.후니의_자존감지수_감소(5);
										후니.상태알림();					
									}else {
										System.out.println("다시 입력하세요.");
										continue; 	
									}
									
								}else {
									System.out.println("랜덤이벤트가 없습니다.");
								}
								
						    }else if(일학기선택창 == 4) {
						    	continue;
						    }else {
								System.out.println("다시 입력하세요.");
						    	continue;
						    }
						}
						
						OCT ++;	
						
					}else if(메인메뉴선택창 == 2){
						후니.상태알림();
						
					}else if(메인메뉴선택창 == 3) {
							
						System.out.println("취준을 포기하시겠습니까?");
						System.out.println("1. 네");
						System.out.println("2. 아니오");
						
						int 취준포기선택창 = scan.nextInt();
						
						if(취준포기선택창 ==1) {
							System.out.println("10월 취업준비를 포기합니다.");					
							
							break;

						}else if(취준포기선택창 == 2) {
							continue;
						}else {
							System.out.println("다시 입력하세요."); // 취준을 포기하시겟습니까?가 뜨도록. 맨처음 메인메뉴창이 아니라.
							continue; 						   // 이 if문을 while문 안에 넣게 되면 취준포기선택창 == 2가 1.활동 2. 상태확인 3. 취준포기가 나와야
						}
						
					}else {
						System.out.println("다시 입력하세요.");
						continue;
					}

				}
				
				System.out.println("하반기채용 서류 제출 주간입니다.");
				System.out.println("서류를 제출하시겠습니까?");
				
				int Apply;
				Apply = 0;
				
				while(Apply<1) {
				System.out.println("1번 : 제출한다");
				System.out.println("2번 : 취준포기");
						
				int Apply2 = scan.nextInt();
				
				if(Apply2 == 1) {
		 			 
					 System.out.println(" ");
					 String JopPhoto[] = { // 타이핑 쓰레드 - 익명 클래스

								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!*==$====!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!=@#@@@##@###**!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!$@@#@@@@@@#$==$$=!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!#@@@@@@@@@@#########!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!$@@@@@@@@##$####$$$###*!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!$@@@@@@@@#######$#$$$#@#!!!!!!!!!!!!!",
								"!!!!!!!!!!!!*@@@@@@@@#####@##$$#$###@$!!!!!!!!!!!!",
								"!!!!!!!!!!!!#@@@@#@#@@##$####$#$$###@@!!!!!!!!!!!!",
								"!!!!!!!!;!;!@@@@#####@##$$$$#$##$$#$#@$!!!!!!!!!!!",
								"!!!!!!!;;;;@#@########$$*$$$$=###$###@@!!!!!!!!!!!",
								"!!!!!!;;;;!@########$$==$$$$$####$$###@!!!!!!!!!!!",
								"!!!;;;;;;;!####$$$$$=====$###$########@*!!!!!!!!!!",
								";!;;;;;;;;*###$$$=*====$#$############@*;!!!!!!!!!",
								";;;;;;;;;;*###$===*=$$==###############*;;;;!!!!!!",
								";;;;;;;;;;=####===*=#$*!$$$###########@!;;;;;!!!!!",
								";;;;;;;;;;*@##=**!;:*=*::**;*$#######@#!;;;;;;;!!!",
								";;;;;;;;;;!@#!!-:-,,-..   ..~!=$#####@@;;;;;;;;;!!",
								";;;;;;;;;;;##:..----,,.    .-~::;**####;;;;;;;;;;;",
								";;;;;;;;;;;#$:..., ,~      ..=..;:;=#@$;;;;;;;;;;;",
								";;;;;;;;:::$#;.~.    --   .   ..,~:!#@=;;;;;;;;;;;",
								";;;;;;;:::-,:!~...-~*-, .:..-#;~--;*$=;;;;;;;;;;;;",
								";;;;;::::;.. ;~   ..~,.:.,!.,!,-,,-:*~:;::;;;;;;;;",
								";;;;::::::   ~.      ..   !  .....-:!~;;:::;;;;;;;",
								";;;:::::::  -,..      :,  :,    ..-:!~~::::::;;;;;",
								";;;:::::::-  ,...     .   --    .,-:;:::::::::;;;;",
								";:::::::~~:  ,. ~.  , .   -~...-.,-:;*:~~::::::;;;",
								";::::::~~~~  ,,           ,-,  ..,~:!:;~~~::::::;;",
								"::::::~~~~~~ .,.       ...--~   .,~::~~~~~~~:::::;",
								":::::~~~~~~-~ -.        .-~--. ..-~;~~-~~~~~~:::::",
								"::::~~~~~-----~..         .,,...,-~;-----~~~~~::::",
								":::~~~~-------~..         ..,,..,-~!------~~~~~:::",
								"::~~~~-----,,,~..   .,....,-~-,,,-~~,------~~~~~::",
								":~~~~-----,,,,,-..       ..,-..,--:-,,,-----~~~~~:",
								":~~~-----,,,,,,:,.     .,.,-,.,,-~;,,,,,,----~~~~:",
								"~~~----,,,,,,..,~,.      .....,-~:,..,,,,,----~~~~",
								"~~~---,,,,,.....:~,.       ...,~:;....,,,,,----~~~",
								"~~---,,,,,......-~~,      ...,~:;;......,,,,---~~~",
								"~---,,,,,.......,,~~-. ...,,,-:::!.......,,,,---~~",
								"~---,,,,........~..-~~---~~~~::::;........,,,----~",
								"---,,,......... -...,-~~~~~~:~~~~;.........,,,---~",
								"--,,,,........ :.. ....,--~~~~~~~;*~.......,,,,--~",
								"-,,,,.......  ,* .  ..   .,-~~~~:~:#-.......,,,---",
								"-,,,......   .$,    ...   ,-----~-~$#~.......,,,--",
								",,,.......  ~$$.     ... .,--,,,,,-=##$.......,,--",
								",,,...... -*$$$.   . ....,,,,,-.,,-=####*.....,,,-",
								",,.....:;$$$##$,       ....,,,...,-$######!;...,,-",
								",,..~;$$$$$$$$$*         ...- ....-$########$=::,,",
								"-~$$#$$$#$$$$$$=        ...,  ...,~$########$##$#$",
								"##$#$###$#$#$$$=        ..,   ....-$$####$$##$#$$#",
								"##$#$$$#####$$$=    *!=$$$$$**....:$$$$$######$$##",
								"#$$$$$$$#$$$#$$$..-*$$$$$$#$##=--.=$#$$$##$$##$##$",
								"$$$$$#$$$$$$$$$:,.,$$$$$$$###:-,-=$$##$#####$$###",
								"$$$$$$$$$$$$$$$,   .$##$$##$:~. .=$$$$#$######$$$",
								"$$$$$$#$$$$$$$$$,    -$$$$#$;~.  ,$$##$###$$#$##$$",
								"$#$$$$$$#$$$$$$,     ~$$##*:,   ,$$####$####$$###",
								"$$$$$#$$#$$$$#$~     ~$###;-.   ,$$$##$#$#$#$$$$$",
								"$$$$#$$$#$$$$$$:     *$#$$=-   .;$$$$##$$####$#$$",
								"$$$##$#$$$#$$#$!.   .$##$$=- ...$$$##$$$$$####$$$",
								"$$$#####$=$$$$$$.   *=####$~. ..$##$#$$#$#$#$#$#$",
								"#$$$$$$$$$$$$$#$$,   *$#$$$$:. .-$$#$$#$$###$##$$#",
								"$$$$$$$#$$$$$$$$,  .*$#$$$$*,  ~=$##$$$$#$$$$#$#$"
						     
				    };

			        
				    for (int i = 0; i < JopPhoto.length; i++) {
					      // 초 간 중지한다
					      Thread.sleep(100);
					      // 메세지를 출력한다
					      System.out.println(JopPhoto[i]);
					}
				    System.out.println(" ");
					

					
					System.out.println("내 서류지수와 은행 커트라인과 비교합니다.");
					System.out.println(" ");
					
					if(후니.후니_서류지수>=쿡민은행인사팀.서류지수_커트라인) {
						
				        //패스브금 (로딩브금과 동일)
					   	LoadingBgm passBgm01 = new LoadingBgm();
				          
				        try {
				             passBgm01.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						
						System.out.println("===========================================================");
						System.out.println(" ");
						
						String PASS[] = { // 타이핑 쓰레드 - 익명 클래스
					            "______   ___   _____  _____ ",    
					            "| ___ \\ / _ \\ /  ___|/  ___|",
					            "| |_/ // /_\\ \\\\ `--. \\ `--. ",
					            "|  __/ |  _  | `--. \\ `--. \\",
					            "| |    | | | |/\\__/ //\\__/ /",
					            "\\_|    \\_| |_/\\____/ \\____/"
					    };

				        
					    for (int i = 0; i < PASS.length; i++) {
						      // 초 간 중지한다
						      Thread.sleep(450);
						      // 메세지를 출력한다
						      System.out.println(PASS[i]);
						} 
						System.out.println(" ");
						System.out.println("서류전형에 합격하였습니다!!");
						System.out.println("필기전형을 준비하세요!!");
						System.out.println("===========================================================");
						
						break ;
						
					}else {

						System.out.println("귀하는 아쉽게도 금번 신규직원 채용 서류심사에서 불합격하였습니다.");
						System.out.println("게임이 종료되었습니다."); 
						
						
						String GameEnd[] = { // 타이핑 쓰레드 - 익명 클래스
								
								
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@=;:;;;;:=#@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@#-*@@@@@@@@@@@$-*@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@*;@@@@@@@@@@@@@@@@@=;#@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@!!@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@@@@",
		"@@@@@@@@@@#;@@@@@@@@@@@@@@@@@@@@@@@@@=*@@@@@@@@@@@",
		"@@@@@@@@@$$@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@@",
		"@@@@@@@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
		"@@@@@@@*#@@@@@~~~~~~$@@@@@@@@@@@*~!@@@@@@;@@@@@@@@",
		"@@@@@@$#@@@@@@      =@@@@@@@@@@@: ~@@@@@@@;@@@@@@@",
		"@@@@@@=@@@@@@@  !@@@@@;** ;@@#.,: ~@@@@@@@@=@@@@@@",
		"@@@@@~@@@@@@@@      ##     *@     ~@@@@@@@@=@@@@@@",
		"@@@@*@@@@@@@@@      ##  @. != .@- ~@@@@@@@@@~@@@@@",
		"@@@@!@@@@@@@@@  !@@@@#  @, !! ~@: ~@@@@@@@@@@#@@@@",
		"@@@=#@@@@@@@@@      ;#  @, !@  $  ~@@@@@@@@@@;@@@@",
		"@@@!@@@@@@@@@@      ;#  @, *@-  ; ~@@@@@@@@@@=@@@@",
		"@@@!@@@@@@@@@@@@@@@@@@@@@@@@@@#@@@@@@@@@@@@@@@=@@@",
		"@@#$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
		"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
		"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#@@@@@@$-  -=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#$@@@@#      =@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*@@@",
		"@@@;@@@@, .@@ ;$@@-..~@@~~@,.@=.-@@@~.,$@@@@@#$@@@",
		"@@@!@@@@  ;@!!!*@     ~@         !@  .  :@@@@*@@@@",
		"@@@$#@@@  !@   ,@!:#!  @  ;=  @- -*  *:  @@@@;@@@@",
		"@@@@!@@@. -@=! ,@~  ;  @  *#  @~ -!  ,,,,@@@@@@@@@",
		"@@@@$@@@;  ..  ,@  @,  @  *#  @~ -$  #~ .@@@-@@@@@",
		"@@@@@-@@@-    -@@   -  @  *#  @~ -@:   .@@@*@@@@@@",
		"@@@@@@!@@@@##@@@@@#@@@@@@@@@@@@@@@@@@#@@@@#=@@@@@@",
		"@@@@@@$=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@@@@@",
		"@@@@@@@*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@",
		"@@@@@@@@=$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
		"@@@@@@@@@$!@@@@@@@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@",
		"@@@@@@@@@@@;@@@@@@@@@@@@@@@@@@@@@@@@@:$@@@@@@@@@@@",
		"@@@@@@@@@@@@$:@@@@@@@@@@@@@@@@@@@@@$;@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@=!$@@@@@@@@@@@@@@@#*;@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@#!!*#@@@@@@@#=!!=@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@#$=***=$#@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
								                                                       
					    };

				        
					    for (int i = 0; i < GameEnd.length; i++) {
						      // 초 간 중지한다
						      Thread.sleep(250);
						      // 메세지를 출력한다
						      System.out.println(GameEnd[i]);
						} 
					   	    
						
		//게임이 종료되어야      
						System.exit(0);
						
//						
					}
					
					
					
				}else if(Apply2 == 2) {
					String GameEnd[] = { // 타이핑 쓰레드 - 익명 클래스

		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@=;:;;;;:=#@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@#-*@@@@@@@@@@@$-*@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@*;@@@@@@@@@@@@@@@@@=;#@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@!!@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@@@@",
		"@@@@@@@@@@#;@@@@@@@@@@@@@@@@@@@@@@@@@=*@@@@@@@@@@@",
		"@@@@@@@@@$$@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@@",
		"@@@@@@@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
		"@@@@@@@*#@@@@@~~~~~~$@@@@@@@@@@@*~!@@@@@@;@@@@@@@@",
		"@@@@@@$#@@@@@@      =@@@@@@@@@@@: ~@@@@@@@;@@@@@@@",
		"@@@@@@=@@@@@@@  !@@@@@;** ;@@#.,: ~@@@@@@@@=@@@@@@",
		"@@@@@~@@@@@@@@      ##     *@     ~@@@@@@@@=@@@@@@",
		"@@@@*@@@@@@@@@      ##  @. != .@- ~@@@@@@@@@~@@@@@",
		"@@@@!@@@@@@@@@  !@@@@#  @, !! ~@: ~@@@@@@@@@@#@@@@",
		"@@@=#@@@@@@@@@      ;#  @, !@  $  ~@@@@@@@@@@;@@@@",
		"@@@!@@@@@@@@@@      ;#  @, *@-  ; ~@@@@@@@@@@=@@@@",
		"@@@!@@@@@@@@@@@@@@@@@@@@@@@@@@#@@@@@@@@@@@@@@@=@@@",
		"@@#$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
		"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
		"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#@@@@@@$-  -=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#$@@@@#      =@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*@@@",
		"@@@;@@@@, .@@ ;$@@-..~@@~~@,.@=.-@@@~.,$@@@@@#$@@@",
		"@@@!@@@@  ;@!!!*@     ~@         !@  .  :@@@@*@@@@",
		"@@@$#@@@  !@   ,@!:#!  @  ;=  @- -*  *:  @@@@;@@@@",
		"@@@@!@@@. -@=! ,@~  ;  @  *#  @~ -!  ,,,,@@@@@@@@@",
		"@@@@$@@@;  ..  ,@  @,  @  *#  @~ -$  #~ .@@@-@@@@@",
		"@@@@@-@@@-    -@@   -  @  *#  @~ -@:   .@@@*@@@@@@",
		"@@@@@@!@@@@##@@@@@#@@@@@@@@@@@@@@@@@@#@@@@#=@@@@@@",
		"@@@@@@$=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@@@@@",
		"@@@@@@@*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@",
		"@@@@@@@@=$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
		"@@@@@@@@@$!@@@@@@@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@",
		"@@@@@@@@@@@;@@@@@@@@@@@@@@@@@@@@@@@@@:$@@@@@@@@@@@",
		"@@@@@@@@@@@@$:@@@@@@@@@@@@@@@@@@@@@$;@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@=!$@@@@@@@@@@@@@@@#*;@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@#!!*#@@@@@@@#=!!=@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@#$=***=$#@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
							                                                       
				    };

			        
				    for (int i = 0; i < GameEnd.length; i++) {
					      // 초 간 중지한다
					      Thread.sleep(250);
					      // 메세지를 출력한다
					      System.out.println(GameEnd[i]);
					} 
					
					System.out.println("취준을 포기했습니다.");
					System.out.println("게임이 종료되었습니다.");
					
		//게임이 종료되어야
					
					System.exit(0);
					
					break;
					
									
				}else {
					System.out.println("다시 입력하세요.");
					 
					continue;
				}
				Apply++;
				}
				
				System.out.println("11월입니다.");
				System.out.println("11월 마지막 주에 있는 필기전형을 준비합시다.");
				
				
				int NOV = 1; // 11월 세 턴! 후 필기 전형!!
				
				while (NOV <= 3) {
					System.out.println(" ");
					System.out.println("< 메인메뉴 > ");
					System.out.println("1. 활동"); // 1번 활동, 2번 상태확인, 3번 취준포기
					System.out.println("2. 상태확인");
					System.out.println("3. 11월 취준포기");
					System.out.println(" ");
							
					int 메인메뉴선택창 = scan.nextInt();
					
					if ( 메인메뉴선택창 == 1) {

						if (true) {
							System.out.println(" ");
							System.out.println("4학년 2학기 11월 : " + NOV + "/3" + "번째 턴입니다.");
							System.out.println("어디에 가시겠습니까?");
							System.out.println("1. 학교에 간다");
							System.out.println("2. 동네에 간다");
							System.out.println("3. 집에 간다");
							System.out.println("4. 뒤로가기");
							System.out.println("<< 학교, 동네, 집 각각 일정확률로 이벤트가 튀어나옵니다. >>");

							System.out.println(" ");
							
							int 일학기선택창 = scan.nextInt();

						    if (일학기선택창 == 1) {
								System.out.println(" ");
						    	System.out.println("학교에 왔습니다.");
								System.out.println("학교에서 무엇을 하시겠습니까?");
								System.out.println("1. 학점관리");
								System.out.println("2. 금융동아리활동");
								System.out.println("3. 취업지원본부 컨설팅");
								System.out.println("4. 면접스터디");
								System.out.println("5. 뒤로가기");
								System.out.println(" ");

								int 학교선택창 = scan.nextInt();
								
								if(학교선택창 ==1) {
							        System.out.println("후.. 전공공부 열심히 해야지!!");
									System.out.println("학교에서 열심히 학점관리를 합니다.");
									후니.학점관리();
									
									System.out.println(" ");
									
									SomethingGirl SomethingGirl = new SomethingGirl();

									SomethingGirl.SomethingGirlCome();
									SomethingGirl.join(); 
									System.out.println(" ");
									
									후니.상태알림();
									
								}else if(학교선택창 == 2) {
									System.out.println("동아리에서 선배들에게 취업꿀팁을 얻습니다.");
									후니.금융동아리모임_참석();
									System.out.println(" ");
									
									CircleBroThread CircleBro = new CircleBroThread();

									CircleBro.CircleBroCome();
									CircleBro.join(); 
									System.out.println(" ");
									후니.상태알림();
									
								}else if(학교선택창 == 3) {
									System.out.println("취업지원본부에서 컨설팅을 받습니다.");
									후니.취업지원본부_컨설팅();
									후니.상태알림();
									
								}else if(학교선택창 == 4) {
									System.out.println("면접스터디를 통해 면접역량을 강화시킵니다.");
									후니.면접스터디_참석();
									
									InterviewStudyMember Studymember= new InterviewStudyMember();

									Studymember.GoFeedback();
									Studymember.join(); 
									
									후니.상태알림();
									
								}else if(학교선택창 == 5) {
									continue;
							
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						 
								}
								
								// (학교) 취업스터디원 먼저 합격해서 쫑파티 열 확률 10%

//								int 멘토링횟수;
//								멘토링횟수 = 0;
//								while(멘토링횟수<1)
								
								Character InterviewFriend = new Character(); 
								InterviewFriend.관계 = "취업스터디원";
								
									if(InterviewFriend.SuccessFirst()) {
										EventBgm EventBgm = new EventBgm();
										
								        try {
								        	EventBgm.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										
										System.out.println("학교 랜덤 이벤트 <취업스터디원이 먼저 합격했습니다.>");
										System.out.println("축하파티에 참여하시겠습니까?");
										System.out.println("1. 참여");
										System.out.println("2. 불참");
			
										//객체.객체함수다. 객체의 기능!	
										
										int goparty = scan.nextInt();
										
										if(goparty == 1) {
											System.out.println("축하파티에 참여해 많은 조언들을 얻습니다.");	
											InterviewFriend.후니의_서류지수_증가(5);
											InterviewFriend.후니의_필기지수_증가(5);
											InterviewFriend.후니의_면접지수_증가(5);
											InterviewFriend.후니의_체력지수_감소(10);
											InterviewFriend.후니의_자존감지수_감소(5);
											
											후니.상태알림();
											
										}else if(goparty == 2) {
											System.out.println("축하파티에 불참하고 체력을 회복합니다.");
											InterviewFriend.후니의_체력지수_증가(15);
											InterviewFriend.후니의_자존감지수_감소(5);
											InterviewFriend.후니의_스트레스지수_증가(5);
											
											후니.상태알림();					
										}else {
											System.out.println("다시 입력하세요.");
											continue; 	
										}
										
									}else {
										System.out.println("랜덤이벤트가 없습니다.");
									}
								
								
						    }else if(일학기선택창 == 2) {
								System.out.println(" ");
						    	System.out.println("동네에 왔습니다.");
								System.out.println("동네에서 무엇을 하시겠습니까?");
								System.out.println("1. 헬스");
								System.out.println("2. 치맥");
								System.out.println("3. 뒤로가기");
								System.out.println(" ");
								
								int 동네선택창 = scan.nextInt();
								
								if(동네선택창 ==1) {
								    
								    System.out.println(" ");
									System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
									System.out.println(" ");
									후니.헬스장();
									후니.상태알림();
									
								}else if(동네선택창 == 2) {
									    System.out.println(" ");
										System.out.println("치맥으로 스트레스를 풉니다.");
										후니.치맥();
										후니.상태알림();
									
								}else if(동네선택창 == 3) {
									continue;
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						 
								}
								
								// (동네) 고등학교 친구에게 안부전화 올 확률 10% 
								
								Character HighschoolFriend = new Character(); 
								HighschoolFriend.관계 = "고등학교 친구";
								
								if(HighschoolFriend.HiCall()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									
									System.out.println("동네 랜덤 이벤트 <고등학교 친구의 안부전화>");
									System.out.println("잊고 있던 고등학교 친구에게 전화가 옵니다.");
									System.out.println("1. 전화를 받는다. ");
									System.out.println("2. 전화를 받지 않는다. ");

									//객체.객체함수다. 객체의 기능!	
									
									int 안부전화선택창 = scan.nextInt();
									
									if(안부전화선택창 == 1) {
										System.out.println("[고등학교 친구] 어 후니야! 아까 동네에서 너 본 것 같아서 전화했어!");	
										System.out.println("[고등학교 친구] 잘 지내고 있었지?");	
										System.out.println("[고등학교 친구] 전역한 이후로 한 번도 못봤는데! 보고 싶다야!");
										System.out.println("[후니] 말할 틈도 안주네!");
										System.out.println("[후니] 나도 보고 싶다야!");
										
										HighschoolFriend.후니의_체력지수_증가(10);
										HighschoolFriend.후니의_자존감지수_증가(10);
										HighschoolFriend.후니의_스트레스지수_감소(10);
										
										후니.상태알림();
										
									}else if(안부전화선택창 == 2) {
										System.out.println("[후니] 아 무슨 일이지.. 요즘 사람들 만나기 싫은데..");
										HighschoolFriend.후니의_자존감지수_감소(10);
										HighschoolFriend.후니의_스트레스지수_증가(10);
										
										후니.상태알림();					
									}else {
										System.out.println("다시 입력하세요."); 
										continue; 	
									}
									
								}else {
									System.out.println("랜덤이벤트가 없습니다.");
								}
								
						    }else if(일학기선택창 == 3) {
								System.out.println(" ");
						    	System.out.println("집에 왔습니다.");
								System.out.println("집에서 무엇을 하시겠습니까?");
								System.out.println("1. 부모님과 식사");
								System.out.println("2. 일기쓰기");
								System.out.println("3. 낮잠자기");
								System.out.println("4. 뒤로가기");
								System.out.println(" ");

								int 집선택창 = scan.nextInt();
								
								if(집선택창 ==1) {
							        String parents[] = {
											"부모님과 식사하며 취업 관련 이야기를 합니다.",
											"[부모님] 취업준비는 좀 잘 되고 있니?",
											"[후니] 나름대로 열심히 하고 있어요 ㅎㅎ",
											"[부모님] 그래그래 넌 혼자 알아서 잘 하리라 믿는다 ㅎㅎ ",
											"[후니] (후.. 이렇게나 날 믿어주시는데 잘 안되네 ㅠㅠ) ",
											"[부모님] 밥 많이 먹고 힘내라 아들",
											" "
									};
									
									for (int i = 0; i <parents.length; i++) {
										Thread.sleep(500);//0.5초마다 한 문장씩 출력
										System.out.println(parents[i]);
									}
									System.out.println(" ");

									후니.부모님과식사();
									System.out.println(" ");
									
									RelativeClass relative = new RelativeClass();
									relative.RelativeCome();
									relative.join(); 
									
									후니.상태알림();
									
								}else if(집선택창 == 2) {
								    System.out.println(" ");
								    System.out.println("일기를 쓰며 하루를 점검하고 스스로를 보살핍니다.");
									후니.일기();
									후니.상태알림();
									
						    	}else if(집선택창 == 3) {
										    System.out.println(" ");
										    
								    		System.out.println("낮잠을 통해 부족한 체력을 충전합니다.");
								    		후니.낮잠();
								    		후니.상태알림();
						    		
						    	}else if(집선택창 == 4) {
									continue;
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						
								}
								
								//(집) 동생의 병간호를 해야합니다.
								Character Bro = new Character(); 
								Bro.관계 = "남동생";
								
								if(Bro.gohospital()) {
									
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
							        
									System.out.println("집 랜덤 이벤트 <동생의 입원>");
									System.out.println("동생이 입원했습니다.");
									System.out.println("병간호를 하시겠습니까?");
									System.out.println("1. 병간호를 한다.");
									System.out.println("2. 하지 않는다.");

									//객체.객체함수다. 객체의 기능!	
									
									int 병간호선택창 = scan.nextInt();
									
									if(병간호선택창 == 1) {
										System.out.println("[후니] (후.. 취준에 집안일까지..)");	
										System.out.println("[후니] 조심 좀 하지 그랬어 ㅠㅠ");	
										Bro.후니의_체력지수_감소(5);
										Bro.후니의_스트레스지수_증가(5);
										후니.상태알림();
										
									}else if(병간호선택창 == 2) {
										System.out.println("[후니] 너무 바빠.. 하반기 준비해야해..ㅠㅠ");
										Bro.후니의_스트레스지수_증가(5);
										Bro.후니의_자존감지수_감소(5);
										후니.상태알림();					
									}else {
										System.out.println("다시 입력하세요.");
										continue; 	
									}
									
								}else {
									System.out.println("랜덤이벤트가 없습니다.");
								}
								
						    }else if(일학기선택창 == 4) {
						    	continue;
						    }else {
								System.out.println("다시 입력하세요.");
						    	continue;
						    }
						    
						}
						
						NOV ++;	
						
					}else if(메인메뉴선택창 == 2){
					
						후니.상태알림();
						
					}else if(메인메뉴선택창 == 3) {
							
						System.out.println("11월 취준을 포기하시겠습니까?");
						System.out.println("1. 네");
						System.out.println("2. 아니오");
						
						int 취준포기선택창 = scan.nextInt();
						
						if(취준포기선택창 ==1) {
							System.out.println("11월 취업준비를 포기했습니다.");					

							
							break;

						}else if(취준포기선택창 == 2) {
							continue;
						}else {
							System.out.println("다시 입력하세요."); // 취준을 포기하시겟습니까?가 뜨도록. 맨처음 메인메뉴창이 아니라.
							continue; 						   // 이 if문을 while문 안에 넣게 되면 취준포기선택창 == 2가 1.활동 2. 상태확인 3. 취준포기가 나와야
						}
						
					}else {
						System.out.println("다시 입력하세요.");
						continue;
					}

				}
				
				System.out.println("하반기채용 필기 시험 주간입니다.");
				System.out.println("필기 시험을 보러 가시겠습니까?");
				
				int WriteTest;
				WriteTest = 0;
				
				while(WriteTest<1) {
				System.out.println("1번 : 응시한다");
				System.out.println("2번 : 늦잠잔다");
						
				int WriteTest2 = scan.nextInt();
				
				if(WriteTest2 == 1) {
					
					System.out.println(" ");
					String JopPhoto[] = { // 타이핑 쓰레드 - 익명 클래스

								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!*==$====!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!=@#@@@##@###**!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!$@@#@@@@@@#$==$$=!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!#@@@@@@@@@@#########!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!$@@@@@@@@##$####$$$###*!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!$@@@@@@@@#######$#$$$#@#!!!!!!!!!!!!!",
								"!!!!!!!!!!!!*@@@@@@@@#####@##$$#$###@$!!!!!!!!!!!!",
								"!!!!!!!!!!!!#@@@@#@#@@##$####$#$$###@@!!!!!!!!!!!!",
								"!!!!!!!!;!;!@@@@#####@##$$$$#$##$$#$#@$!!!!!!!!!!!",
								"!!!!!!!;;;;@#@########$$*$$$$=###$###@@!!!!!!!!!!!",
								"!!!!!!;;;;!@########$$==$$$$$####$$###@!!!!!!!!!!!",
								"!!!;;;;;;;!####$$$$$=====$###$########@*!!!!!!!!!!",
								";!;;;;;;;;*###$$$=*====$#$############@*;!!!!!!!!!",
								";;;;;;;;;;*###$===*=$$==###############*;;;;!!!!!!",
								";;;;;;;;;;=####===*=#$*!$$$###########@!;;;;;!!!!!",
								";;;;;;;;;;*@##=**!;:*=*::**;*$#######@#!;;;;;;;!!!",
								";;;;;;;;;;!@#!!-:-,,-..   ..~!=$#####@@;;;;;;;;;!!",
								";;;;;;;;;;;##:..----,,.    .-~::;**####;;;;;;;;;;;",
								";;;;;;;;;;;#$:..., ,~      ..=..;:;=#@$;;;;;;;;;;;",
								";;;;;;;;:::$#;.~.    --   .   ..,~:!#@=;;;;;;;;;;;",
								";;;;;;;:::-,:!~...-~*-, .:..-#;~--;*$=;;;;;;;;;;;;",
								";;;;;::::;.. ;~   ..~,.:.,!.,!,-,,-:*~:;::;;;;;;;;",
								";;;;::::::   ~.      ..   !  .....-:!~;;:::;;;;;;;",
								";;;:::::::  -,..      :,  :,    ..-:!~~::::::;;;;;",
								";;;:::::::-  ,...     .   --    .,-:;:::::::::;;;;",
								";:::::::~~:  ,. ~.  , .   -~...-.,-:;*:~~::::::;;;",
								";::::::~~~~  ,,           ,-,  ..,~:!:;~~~::::::;;",
								"::::::~~~~~~ .,.       ...--~   .,~::~~~~~~~:::::;",
								":::::~~~~~~-~ -.        .-~--. ..-~;~~-~~~~~~:::::",
								"::::~~~~~-----~..         .,,...,-~;-----~~~~~::::",
								":::~~~~-------~..         ..,,..,-~!------~~~~~:::",
								"::~~~~-----,,,~..   .,....,-~-,,,-~~,------~~~~~::",
								":~~~~-----,,,,,-..       ..,-..,--:-,,,-----~~~~~:",
								":~~~-----,,,,,,:,.     .,.,-,.,,-~;,,,,,,----~~~~:",
								"~~~----,,,,,,..,~,.      .....,-~:,..,,,,,----~~~~",
								"~~~---,,,,,.....:~,.       ...,~:;....,,,,,----~~~",
								"~~---,,,,,......-~~,      ...,~:;;......,,,,---~~~",
								"~---,,,,,.......,,~~-. ...,,,-:::!.......,,,,---~~",
								"~---,,,,........~..-~~---~~~~::::;........,,,----~",
								"---,,,......... -...,-~~~~~~:~~~~;.........,,,---~",
								"--,,,,........ :.. ....,--~~~~~~~;*~.......,,,,--~",
								"-,,,,.......  ,* .  ..   .,-~~~~:~:#-.......,,,---",
								"-,,,......   .$,    ...   ,-----~-~$#~.......,,,--",
								",,,.......  ~$$.     ... .,--,,,,,-=##$.......,,--",
								",,,...... -*$$$.   . ....,,,,,-.,,-=####*.....,,,-",
								",,.....:;$$$##$,       ....,,,...,-$######!;...,,-",
								",,..~;$$$$$$$$$*         ...- ....-$########$=::,,",
								"-~$$#$$$#$$$$$$=        ...,  ...,~$########$##$#$",
								"##$#$###$#$#$$$=        ..,   ....-$$####$$##$#$$#",
								"##$#$$$#####$$$=    *!=$$$$$**....:$$$$$######$$##",
								"#$$$$$$$#$$$#$$$..-*$$$$$$#$##=--.=$#$$$##$$##$##$",
								"$$$$$#$$$$$$$$$:,.,$$$$$$$###:-,-=$$##$#####$$###",
								"$$$$$$$$$$$$$$$,   .$##$$##$:~. .=$$$$#$######$$$",
								"$$$$$$#$$$$$$$$$,    -$$$$#$;~.  ,$$##$###$$#$##$$",
								"$#$$$$$$#$$$$$$,     ~$$##*:,   ,$$####$####$$###",
								"$$$$$#$$#$$$$#$~     ~$###;-.   ,$$$##$#$#$#$$$$$",
								"$$$$#$$$#$$$$$$:     *$#$$=-   .;$$$$##$$####$#$$",
								"$$$##$#$$$#$$#$!.   .$##$$=- ...$$$##$$$$$####$$$",
								"$$$#####$=$$$$$$.   *=####$~. ..$##$#$$#$#$#$#$#$",
								"#$$$$$$$$$$$$$#$$,   *$#$$$$:. .-$$#$$#$$###$##$$#",
								"$$$$$$$#$$$$$$$$,  .*$#$$$$*,  ~=$##$$$$#$$$$#$#$"
						     
				    };

			        
				    for (int i = 0; i < JopPhoto.length; i++) {
					      // 초 간 중지한다
					      Thread.sleep(100);
					      // 메세지를 출력한다
					      System.out.println(JopPhoto[i]);
					}
				    System.out.println(" ");
					
				    System.out.println("내 필기지수와 은행 커트라인과 비교합니다.");
				    
					if(후니.후니_필기지수>=쿡민은행인사팀.필기지수_커트라인) {
						
				        //패스브금 (로딩브금과 동일)
					   	LoadingBgm passBgm02 = new LoadingBgm();
				          
				        try {
				             passBgm02.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }

						
						System.out.println("===========================================================");
						System.out.println(" ");
						
						String PASS[] = { // 타이핑 쓰레드 - 익명 클래스
					            "______   ___   _____  _____ ",    
					            "| ___ \\ / _ \\ /  ___|/  ___|",
					            "| |_/ // /_\\ \\\\ `--. \\ `--. ",
					            "|  __/ |  _  | `--. \\ `--. \\",
					            "| |    | | | |/\\__/ //\\__/ /",
					            "\\_|    \\_| |_/\\____/ \\____/"
					    };

				        
					    for (int i = 0; i < PASS.length; i++) {
						      // 초 간 중지한다
						      Thread.sleep(450);
						      // 메세지를 출력한다
						      System.out.println(PASS[i]);
						} 
						System.out.println(" ");
						System.out.println("필기전형에 합격하였습니다!!");
						System.out.println("면접전형을 준비하세요!!");
						System.out.println("===========================================================");
						
						break;
						
					}else {
						
						System.out.println("귀하께서는 아쉽게도 선발 명단에 없음을 알려드립니다. 감사합니다.");	
						System.out.println("게임이 종료되었습니다.");
						
						GoodbyeWorldBgm GoodbyeWorldBgm = new GoodbyeWorldBgm();
						GoodbyeWorldBgm.join();
						
				        try {
				        	GoodbyeWorldBgm.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						
						String GameEnd[] = { // 타이핑 쓰레드 - 익명 클래스

		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@=;:;;;;:=#@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@#-*@@@@@@@@@@@$-*@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@*;@@@@@@@@@@@@@@@@@=;#@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@!!@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@@@@",
		"@@@@@@@@@@#;@@@@@@@@@@@@@@@@@@@@@@@@@=*@@@@@@@@@@@",
		"@@@@@@@@@$$@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@@",
		"@@@@@@@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
		"@@@@@@@*#@@@@@~~~~~~$@@@@@@@@@@@*~!@@@@@@;@@@@@@@@",
		"@@@@@@$#@@@@@@      =@@@@@@@@@@@: ~@@@@@@@;@@@@@@@",
		"@@@@@@=@@@@@@@  !@@@@@;** ;@@#.,: ~@@@@@@@@=@@@@@@",
		"@@@@@~@@@@@@@@      ##     *@     ~@@@@@@@@=@@@@@@",
		"@@@@*@@@@@@@@@      ##  @. != .@- ~@@@@@@@@@~@@@@@",
		"@@@@!@@@@@@@@@  !@@@@#  @, !! ~@: ~@@@@@@@@@@#@@@@",
		"@@@=#@@@@@@@@@      ;#  @, !@  $  ~@@@@@@@@@@;@@@@",
		"@@@!@@@@@@@@@@      ;#  @, *@-  ; ~@@@@@@@@@@=@@@@",
		"@@@!@@@@@@@@@@@@@@@@@@@@@@@@@@#@@@@@@@@@@@@@@@=@@@",
		"@@#$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
		"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
		"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#@@@@@@$-  -=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#$@@@@#      =@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*@@@",
		"@@@;@@@@, .@@ ;$@@-..~@@~~@,.@=.-@@@~.,$@@@@@#$@@@",
		"@@@!@@@@  ;@!!!*@     ~@         !@  .  :@@@@*@@@@",
		"@@@$#@@@  !@   ,@!:#!  @  ;=  @- -*  *:  @@@@;@@@@",
		"@@@@!@@@. -@=! ,@~  ;  @  *#  @~ -!  ,,,,@@@@@@@@@",
		"@@@@$@@@;  ..  ,@  @,  @  *#  @~ -$  #~ .@@@-@@@@@",
		"@@@@@-@@@-    -@@   -  @  *#  @~ -@:   .@@@*@@@@@@",
		"@@@@@@!@@@@##@@@@@#@@@@@@@@@@@@@@@@@@#@@@@#=@@@@@@",
		"@@@@@@$=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@@@@@",
		"@@@@@@@*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@",
		"@@@@@@@@=$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
		"@@@@@@@@@$!@@@@@@@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@",
		"@@@@@@@@@@@;@@@@@@@@@@@@@@@@@@@@@@@@@:$@@@@@@@@@@@",
		"@@@@@@@@@@@@$:@@@@@@@@@@@@@@@@@@@@@$;@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@=!$@@@@@@@@@@@@@@@#*;@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@#!!*#@@@@@@@#=!!=@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@#$=***=$#@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
								                                                       
					    };

				        
					    for (int i = 0; i < GameEnd.length; i++) {
						      // 초 간 중지한다
						      Thread.sleep(250);
						      // 메세지를 출력한다
						      System.out.println(GameEnd[i]);
						} 
						

						
						System.exit(0);
					}
		//게임이 종료되어야 한다.			
				}else if(WriteTest2 == 2) {
					GoodbyeWorldBgm GoodbyeWorldBgm = new GoodbyeWorldBgm();
					GoodbyeWorldBgm.join();
					
			        try {
			        	GoodbyeWorldBgm.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					String GameEnd[] = { // 타이핑 쓰레드 - 익명 클래스

		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@=;:;;;;:=#@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@#-*@@@@@@@@@@@$-*@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@*;@@@@@@@@@@@@@@@@@=;#@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@!!@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@@@@",
		"@@@@@@@@@@#;@@@@@@@@@@@@@@@@@@@@@@@@@=*@@@@@@@@@@@",
		"@@@@@@@@@$$@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@@",
		"@@@@@@@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
		"@@@@@@@*#@@@@@~~~~~~$@@@@@@@@@@@*~!@@@@@@;@@@@@@@@",
		"@@@@@@$#@@@@@@      =@@@@@@@@@@@: ~@@@@@@@;@@@@@@@",
		"@@@@@@=@@@@@@@  !@@@@@;** ;@@#.,: ~@@@@@@@@=@@@@@@",
		"@@@@@~@@@@@@@@      ##     *@     ~@@@@@@@@=@@@@@@",
		"@@@@*@@@@@@@@@      ##  @. != .@- ~@@@@@@@@@~@@@@@",
		"@@@@!@@@@@@@@@  !@@@@#  @, !! ~@: ~@@@@@@@@@@#@@@@",
		"@@@=#@@@@@@@@@      ;#  @, !@  $  ~@@@@@@@@@@;@@@@",
		"@@@!@@@@@@@@@@      ;#  @, *@-  ; ~@@@@@@@@@@=@@@@",
		"@@@!@@@@@@@@@@@@@@@@@@@@@@@@@@#@@@@@@@@@@@@@@@=@@@",
		"@@#$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
		"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
		"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#@@@@@@$-  -=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#$@@@@#      =@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*@@@",
		"@@@;@@@@, .@@ ;$@@-..~@@~~@,.@=.-@@@~.,$@@@@@#$@@@",
		"@@@!@@@@  ;@!!!*@     ~@         !@  .  :@@@@*@@@@",
		"@@@$#@@@  !@   ,@!:#!  @  ;=  @- -*  *:  @@@@;@@@@",
		"@@@@!@@@. -@=! ,@~  ;  @  *#  @~ -!  ,,,,@@@@@@@@@",
		"@@@@$@@@;  ..  ,@  @,  @  *#  @~ -$  #~ .@@@-@@@@@",
		"@@@@@-@@@-    -@@   -  @  *#  @~ -@:   .@@@*@@@@@@",
		"@@@@@@!@@@@##@@@@@#@@@@@@@@@@@@@@@@@@#@@@@#=@@@@@@",
		"@@@@@@$=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@@@@@",
		"@@@@@@@*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@",
		"@@@@@@@@=$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
		"@@@@@@@@@$!@@@@@@@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@",
		"@@@@@@@@@@@;@@@@@@@@@@@@@@@@@@@@@@@@@:$@@@@@@@@@@@",
		"@@@@@@@@@@@@$:@@@@@@@@@@@@@@@@@@@@@$;@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@=!$@@@@@@@@@@@@@@@#*;@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@#!!*#@@@@@@@#=!!=@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@#$=***=$#@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
							                                                       
				    };

			        
				    for (int i = 0; i < GameEnd.length; i++) {
					      // 초 간 중지한다
					      Thread.sleep(250);
					      // 메세지를 출력한다
					      System.out.println(GameEnd[i]);
					} 
					
				    System.out.println("취업준비를 포기했습니다.");
					System.out.println("게임이 종료되었습니다.");
					
					System.exit(0);
		//게임이 종료되어야 한다.			
					break;
					
									
				}else {
					System.out.println("다시 입력하세요.");
					 
					continue;
				}
				WriteTest++;
				}
				
				System.out.println("12월 마지막 주에 있는 면접전형을 준비합시다.");
				
				int DEC = 1; // 12월 세 턴! 후 면접 전형!!
				
				while (DEC <= 3) {
					System.out.println("< 메인메뉴 > ");
					System.out.println("1. 활동"); // 1번 활동, 2번 상태확인, 3번 취준포기
					System.out.println("2. 상태확인");
					System.out.println("3. 취준포기");
							
					int 메인메뉴선택창 = scan.nextInt();
					
					if ( 메인메뉴선택창 == 1) {

						if (true) {
							System.out.println(" ");
							System.out.println("4학년 2학기 12월 : " + DEC + "/3" + "번째 턴입니다.");
							System.out.println("어디에 가시겠습니까?");
							System.out.println("1. 학교에 간다");
							System.out.println("2. 동네에 간다");
							System.out.println("3. 집에 간다");
							System.out.println("4. 뒤로가기");
							System.out.println("<< 학교, 동네, 집 각각 일정확률로 이벤트가 튀어나옵니다. >>");
							System.out.println(" ");
							
							int 일학기선택창 = scan.nextInt();

						    if (일학기선택창 == 1) {
								System.out.println(" ");
								System.out.println("학교에 왔습니다.");
								System.out.println("학교에서 무엇을 하시겠습니까?");
								System.out.println("1. 학점관리");
								System.out.println("2. 금융동아리활동");
								System.out.println("3. 취업지원본부 컨설팅");
								System.out.println("4. 면접스터디");
								System.out.println("5. 뒤로가기");
								System.out.println(" ");

								int 학교선택창 = scan.nextInt();
								
								if(학교선택창 ==1) {
							        System.out.println("후.. 전공공부 열심히 해야지!!");
									System.out.println("학교에서 열심히 학점관리를 합니다.");
									후니.학점관리();
									System.out.println(" ");
									
									SomethingGirl SomethingGirl = new SomethingGirl();

									SomethingGirl.SomethingGirlCome();
									SomethingGirl.join(); 
									System.out.println(" ");
									
									후니.상태알림();
									
								}else if(학교선택창 == 2) {
									System.out.println("동아리에서 선배들에게 취업꿀팁을 얻습니다.");
									후니.금융동아리모임_참석();
									System.out.println(" ");
									
									CircleBroThread CircleBro = new CircleBroThread();

									CircleBro.CircleBroCome();
									CircleBro.join(); 
									System.out.println(" ");
									후니.상태알림();
									
								}else if(학교선택창 == 3) {
									System.out.println("취업지원본부에서 컨설팅을 받습니다.");
									후니.취업지원본부_컨설팅();
									후니.상태알림();
									
								}else if(학교선택창 == 4) {
									System.out.println("면접스터디를 통해 면접역량을 강화시킵니다.");
									후니.면접스터디_참석();
									
									InterviewStudyMember Studymember= new InterviewStudyMember();

									Studymember.GoFeedback();
									Studymember.join(); 
									후니.상태알림();
									
								}else if(학교선택창 == 5) {
									continue;
							
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						 
								}
								
								Character InterviewFriend = new Character(); 
								InterviewFriend.관계 = "취업스터디원";
								
									if(InterviewFriend.SuccessFirst()) {
										
										EventBgm EventBgm = new EventBgm();
										
								        try {
								        	EventBgm.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
								        
										System.out.println("학교 랜덤 이벤트 <취업스터디원이 먼저 합격했습니다.>");
										System.out.println("축하파티에 참여하시겠습니까?");
										System.out.println("1. 참여");
										System.out.println("2. 불참");
			
										//객체.객체함수다. 객체의 기능!	
										
										int goparty = scan.nextInt();
										
										if(goparty == 1) {
											System.out.println("축하파티에 참여해 많은 조언들을 얻습니다.");	
											InterviewFriend.후니의_서류지수_증가(5);
											InterviewFriend.후니의_필기지수_증가(5);
											InterviewFriend.후니의_면접지수_증가(5);
											InterviewFriend.후니의_체력지수_감소(10);
											InterviewFriend.후니의_자존감지수_감소(5);
											
											후니.상태알림();
											
										}else if(goparty == 2) {
											System.out.println("축하파티에 불참하고 체력을 회복합니다.");
											InterviewFriend.후니의_체력지수_증가(15);
											InterviewFriend.후니의_자존감지수_감소(5);
											InterviewFriend.후니의_스트레스지수_증가(5);
											
											후니.상태알림();					
										}else {
											System.out.println("다시 입력하세요.");
											continue; 	
										}
										
									}else {
										System.out.println("랜덤이벤트가 없습니다.");
									}
								
								
						    }else if(일학기선택창 == 2) {
								System.out.println(" ");
						    	System.out.println("동네에 왔습니다.");
								System.out.println("동네에서 무엇을 하시겠습니까?");
								System.out.println("1. 헬스");
								System.out.println("2. 치맥");
								System.out.println("3. 뒤로가기");
								System.out.println(" ");
								
								int 동네선택창 = scan.nextInt();
								
								if(동네선택창 ==1) {
							        
							        System.out.println(" ");
							        
								    System.out.println(" ");
									System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
									System.out.println(" ");
									후니.헬스장();
									후니.상태알림();
									
								}else if(동네선택창 == 2) {
									    System.out.println(" ");
										System.out.println("치맥으로 스트레스를 풉니다.");
										후니.치맥();
										후니.상태알림();
									
								}else if(동네선택창 == 3) {
									continue;
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						 
								}
								
								// (동네) 고등학교 친구에게 안부전화 올 확률 10% 
								
								Character HighschoolFriend = new Character(); 
								HighschoolFriend.관계 = "고등학교 친구";
								
								if(HighschoolFriend.HiCall()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									
									System.out.println("동네 랜덤 이벤트 <고등학교 친구의 안부전화>");
									System.out.println("잊고 있던 고등학교 친구에게 전화가 옵니다.");
									System.out.println("1. 전화를 받는다. ");
									System.out.println("2. 전화를 받지 않는다. ");

									//객체.객체함수다. 객체의 기능!	
									
									int 안부전화선택창 = scan.nextInt();
									
									if(안부전화선택창 == 1) {
										System.out.println("[고등학교 친구] 어 후니야! 아까 동네에서 너 본 것 같아서 전화했어!");	
										System.out.println("[고등학교 친구] 잘 지내고 있었지?");	
										System.out.println("[고등학교 친구] 전역한 이후로 한 번도 못봤는데! 보고 싶다야!");
										System.out.println("[후니] 말할 틈도 안주네!");
										System.out.println("[후니] 나도 보고 싶다야!");
										
										HighschoolFriend.후니의_체력지수_증가(10);
										HighschoolFriend.후니의_자존감지수_증가(10);
										HighschoolFriend.후니의_스트레스지수_감소(10);
										
										후니.상태알림();
										
									}else if(안부전화선택창 == 2) {
										System.out.println("[후니] 아 무슨 일이지.. 요즘 사람들 만나기 싫은데..");
										HighschoolFriend.후니의_자존감지수_감소(10);
										HighschoolFriend.후니의_스트레스지수_증가(10);
										
										후니.상태알림();					
									}else {
										System.out.println("다시 입력하세요."); 
										continue; 	
									}
									
								}else {
									System.out.println("랜덤이벤트가 없습니다.");
								}
								
						    }else if(일학기선택창 == 3) {
								System.out.println(" ");
						    	System.out.println("집에 왔습니다.");
								System.out.println("집에서 무엇을 하시겠습니까?");
								System.out.println("1. 부모님과 식사");
								System.out.println("2. 일기쓰기");
								System.out.println("3. 낮잠자기");
								System.out.println("4. 뒤로가기");
								System.out.println(" ");
								
								int 집선택창 = scan.nextInt();
								
								if(집선택창 ==1) {
							        String parents[] = {
											"부모님과 식사하며 취업 관련 이야기를 합니다.",
											"[부모님] 취업준비는 좀 잘 되고 있니?",
											"[후니] 나름대로 열심히 하고 있어요 ㅎㅎ",
											"[부모님] 그래그래 넌 혼자 알아서 잘 하리라 믿는다 ㅎㅎ ",
											"[후니] (후.. 이렇게나 날 믿어주시는데 잘 안되네 ㅠㅠ) ",
											"[부모님] 밥 많이 먹고 힘내라 아들",
											" "
									};
									
									for (int i = 0; i <parents.length; i++) {
										Thread.sleep(500);//0.5초마다 한 문장씩 출력
										System.out.println(parents[i]);
									}
									System.out.println(" ");

									후니.부모님과식사();
									System.out.println(" ");
									
									RelativeClass relative = new RelativeClass();
									relative.RelativeCome();
									relative.join(); 
									
									후니.상태알림();
									
								}else if(집선택창 == 2) {
								    System.out.println(" ");
								    System.out.println("일기를 쓰며 하루를 점검하고 스스로를 보살핍니다.");
									후니.일기();
									후니.상태알림();
									
						    	}else if(집선택창 == 3) {
								    		System.out.println("낮잠을 통해 부족한 체력을 충전합니다.");
								    		후니.낮잠();
								    		후니.상태알림();
						    		
						    	}else if(집선택창 == 4) {
									continue;
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						
								}
								
								//(집) 동생의 병간호를 해야합니다.
								Character Bro = new Character(); 
								Bro.관계 = "남동생";
								
								if(Bro.gohospital()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									
									System.out.println("집 랜덤 이벤트 <동생의 입원>");
									System.out.println("동생이 입원했습니다.");
									System.out.println("병간호를 하시겠습니까?");
									System.out.println("1. 병간호를 한다.");
									System.out.println("2. 하지 않는다.");

									//객체.객체함수다. 객체의 기능!	
									
									int 병간호선택창 = scan.nextInt();
									
									if(병간호선택창 == 1) {
										System.out.println("[후니] (후.. 취준에 집안일까지..)");	
										System.out.println("[후니] 조심 좀 하지 그랬어 ㅠㅠ");	
										Bro.후니의_체력지수_감소(5);
										Bro.후니의_스트레스지수_증가(5);
										후니.상태알림();
										
									}else if(병간호선택창 == 2) {
										System.out.println("[후니] 너무 바빠.. 하반기 준비해야해..ㅠㅠ");
										Bro.후니의_스트레스지수_증가(5);
										Bro.후니의_자존감지수_감소(5);
										후니.상태알림();					
									}else {
										System.out.println("다시 입력하세요.");
										continue; 	
									}
									
								}else {
									System.out.println("랜덤이벤트가 없습니다.");
								}
								
						    }else if(일학기선택창 == 4) {
						    	continue;
						    }else {
								System.out.println("다시 입력하세요.");
						    	continue;
						    }
						    
						}
						
						DEC ++;	
						
					}else if(메인메뉴선택창 == 2){
					
						후니.상태알림();
						
					}else if(메인메뉴선택창 == 3) {
							
						System.out.println("취준을 포기하시겠습니까?");
						System.out.println("1. 네");
						System.out.println("2. 아니오");
						
						int 취준포기선택창 = scan.nextInt();
						
						if(취준포기선택창 ==1) {
							System.out.println("12월 취업준비를 포기했습니다.");					
							
							break;

						}else if(취준포기선택창 == 2) {
							continue;
						}else {
							System.out.println("다시 입력하세요."); // 취준을 포기하시겟습니까?가 뜨도록. 맨처음 메인메뉴창이 아니라.
							continue; 						   // 이 if문을 while문 안에 넣게 되면 취준포기선택창 == 2가 1.활동 2. 상태확인 3. 취준포기가 나와야
						}
						
					}else {
						System.out.println("다시 입력하세요.");
						continue;
					}

				}
				
				System.out.println("면접 날입니다.");
				System.out.println("면접을 보러가시겠습니까?");

				int InterviewTest;
				InterviewTest = 0;
				
				while(InterviewTest<1) {
				System.out.println("1번 : 응시한다");
				System.out.println("2번 : 늦잠잔다");
						
				int InterviewTest2 = scan.nextInt();
				
				if(InterviewTest2  == 1) {
					
					System.out.println(" ");
					String JopPhoto[] = { // 타이핑 쓰레드 - 익명 클래스

								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!*==$====!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!=@#@@@##@###**!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!$@@#@@@@@@#$==$$=!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!#@@@@@@@@@@#########!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!$@@@@@@@@##$####$$$###*!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!$@@@@@@@@#######$#$$$#@#!!!!!!!!!!!!!",
								"!!!!!!!!!!!!*@@@@@@@@#####@##$$#$###@$!!!!!!!!!!!!",
								"!!!!!!!!!!!!#@@@@#@#@@##$####$#$$###@@!!!!!!!!!!!!",
								"!!!!!!!!;!;!@@@@#####@##$$$$#$##$$#$#@$!!!!!!!!!!!",
								"!!!!!!!;;;;@#@########$$*$$$$=###$###@@!!!!!!!!!!!",
								"!!!!!!;;;;!@########$$==$$$$$####$$###@!!!!!!!!!!!",
								"!!!;;;;;;;!####$$$$$=====$###$########@*!!!!!!!!!!",
								";!;;;;;;;;*###$$$=*====$#$############@*;!!!!!!!!!",
								";;;;;;;;;;*###$===*=$$==###############*;;;;!!!!!!",
								";;;;;;;;;;=####===*=#$*!$$$###########@!;;;;;!!!!!",
								";;;;;;;;;;*@##=**!;:*=*::**;*$#######@#!;;;;;;;!!!",
								";;;;;;;;;;!@#!!-:-,,-..   ..~!=$#####@@;;;;;;;;;!!",
								";;;;;;;;;;;##:..----,,.    .-~::;**####;;;;;;;;;;;",
								";;;;;;;;;;;#$:..., ,~      ..=..;:;=#@$;;;;;;;;;;;",
								";;;;;;;;:::$#;.~.    --   .   ..,~:!#@=;;;;;;;;;;;",
								";;;;;;;:::-,:!~...-~*-, .:..-#;~--;*$=;;;;;;;;;;;;",
								";;;;;::::;.. ;~   ..~,.:.,!.,!,-,,-:*~:;::;;;;;;;;",
								";;;;::::::   ~.      ..   !  .....-:!~;;:::;;;;;;;",
								";;;:::::::  -,..      :,  :,    ..-:!~~::::::;;;;;",
								";;;:::::::-  ,...     .   --    .,-:;:::::::::;;;;",
								";:::::::~~:  ,. ~.  , .   -~...-.,-:;*:~~::::::;;;",
								";::::::~~~~  ,,           ,-,  ..,~:!:;~~~::::::;;",
								"::::::~~~~~~ .,.       ...--~   .,~::~~~~~~~:::::;",
								":::::~~~~~~-~ -.        .-~--. ..-~;~~-~~~~~~:::::",
								"::::~~~~~-----~..         .,,...,-~;-----~~~~~::::",
								":::~~~~-------~..         ..,,..,-~!------~~~~~:::",
								"::~~~~-----,,,~..   .,....,-~-,,,-~~,------~~~~~::",
								":~~~~-----,,,,,-..       ..,-..,--:-,,,-----~~~~~:",
								":~~~-----,,,,,,:,.     .,.,-,.,,-~;,,,,,,----~~~~:",
								"~~~----,,,,,,..,~,.      .....,-~:,..,,,,,----~~~~",
								"~~~---,,,,,.....:~,.       ...,~:;....,,,,,----~~~",
								"~~---,,,,,......-~~,      ...,~:;;......,,,,---~~~",
								"~---,,,,,.......,,~~-. ...,,,-:::!.......,,,,---~~",
								"~---,,,,........~..-~~---~~~~::::;........,,,----~",
								"---,,,......... -...,-~~~~~~:~~~~;.........,,,---~",
								"--,,,,........ :.. ....,--~~~~~~~;*~.......,,,,--~",
								"-,,,,.......  ,* .  ..   .,-~~~~:~:#-.......,,,---",
								"-,,,......   .$,    ...   ,-----~-~$#~.......,,,--",
								",,,.......  ~$$.     ... .,--,,,,,-=##$.......,,--",
								",,,...... -*$$$.   . ....,,,,,-.,,-=####*.....,,,-",
								",,.....:;$$$##$,       ....,,,...,-$######!;...,,-",
								",,..~;$$$$$$$$$*         ...- ....-$########$=::,,",
								"-~$$#$$$#$$$$$$=        ...,  ...,~$########$##$#$",
								"##$#$###$#$#$$$=        ..,   ....-$$####$$##$#$$#",
								"##$#$$$#####$$$=    *!=$$$$$**....:$$$$$######$$##",
								"#$$$$$$$#$$$#$$$..-*$$$$$$#$##=--.=$#$$$##$$##$##$",
								"$$$$$#$$$$$$$$$:,.,$$$$$$$###:-,-=$$##$#####$$###",
								"$$$$$$$$$$$$$$$,   .$##$$##$:~. .=$$$$#$######$$$",
								"$$$$$$#$$$$$$$$$,    -$$$$#$;~.  ,$$##$###$$#$##$$",
								"$#$$$$$$#$$$$$$,     ~$$##*:,   ,$$####$####$$###",
								"$$$$$#$$#$$$$#$~     ~$###;-.   ,$$$##$#$#$#$$$$$",
								"$$$$#$$$#$$$$$$:     *$#$$=-   .;$$$$##$$####$#$$",
								"$$$##$#$$$#$$#$!.   .$##$$=- ...$$$##$$$$$####$$$",
								"$$$#####$=$$$$$$.   *=####$~. ..$##$#$$#$#$#$#$#$",
								"#$$$$$$$$$$$$$#$$,   *$#$$$$:. .-$$#$$#$$###$##$$#",
								"$$$$$$$#$$$$$$$$,  .*$#$$$$*,  ~=$##$$$$#$$$$#$#$"
						     
				    };

			        
				    for (int i = 0; i < JopPhoto.length; i++) {
					      // 초 간 중지한다
					      Thread.sleep(100);
					      // 메세지를 출력한다
					      System.out.println(JopPhoto[i]);
					}
				    System.out.println(" ");
					
					System.out.println("내 면접지수와 은행 커트라인과 비교합니다.");
					System.out.println(" ");
					
					if(후니.후니_면접지수>=쿡민은행인사팀.면접지수_커트라인) {
						
				        //패스브금 (로딩브금과 동일)
					   	LoadingBgm passBgm02 = new LoadingBgm();
				          
				        try {
				             passBgm02.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }

						
						System.out.println("===========================================================");
						System.out.println(" ");
						
						String PASS[] = { // 타이핑 쓰레드 - 익명 클래스
					            "______   ___   _____  _____ ",    
					            "| ___ \\ / _ \\ /  ___|/  ___|",
					            "| |_/ // /_\\ \\\\ `--. \\ `--. ",
					            "|  __/ |  _  | `--. \\ `--. \\",
					            "| |    | | | |/\\__/ //\\__/ /",
					            "\\_|    \\_| |_/\\____/ \\____/"
					    };

				        
					    for (int i = 0; i < PASS.length; i++) {
						      // 초 간 중지한다
						      Thread.sleep(450);
						      // 메세지를 출력한다
						      System.out.println(PASS[i]);
						} 
						System.out.println(" ");
						System.out.println("하반기 채용에 최종합격하였습니다!!");
						System.out.println("신입사원 연수 때 뵙겠습니다.");
						System.out.println("===========================================================");
						
						break;
						
					}else {
						
						System.out.println(" ");
						System.out.println("귀하께서는 아쉽게도 선발 명단에 없음을 알려드립니다. 감사합니다.");				
						System.out.println("게임이 종료되었습니다.");
						System.out.println(" ");
						
						
						String GameEnd[] = { // 타이핑 쓰레드 - 익명 클래스

		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@=;:;;;;:=#@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@#-*@@@@@@@@@@@$-*@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@*;@@@@@@@@@@@@@@@@@=;#@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@!!@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@@@@",
		"@@@@@@@@@@#;@@@@@@@@@@@@@@@@@@@@@@@@@=*@@@@@@@@@@@",
		"@@@@@@@@@$$@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@@",
		"@@@@@@@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
		"@@@@@@@*#@@@@@~~~~~~$@@@@@@@@@@@*~!@@@@@@;@@@@@@@@",
		"@@@@@@$#@@@@@@      =@@@@@@@@@@@: ~@@@@@@@;@@@@@@@",
		"@@@@@@=@@@@@@@  !@@@@@;** ;@@#.,: ~@@@@@@@@=@@@@@@",
		"@@@@@~@@@@@@@@      ##     *@     ~@@@@@@@@=@@@@@@",
		"@@@@*@@@@@@@@@      ##  @. != .@- ~@@@@@@@@@~@@@@@",
		"@@@@!@@@@@@@@@  !@@@@#  @, !! ~@: ~@@@@@@@@@@#@@@@",
		"@@@=#@@@@@@@@@      ;#  @, !@  $  ~@@@@@@@@@@;@@@@",
		"@@@!@@@@@@@@@@      ;#  @, *@-  ; ~@@@@@@@@@@=@@@@",
		"@@@!@@@@@@@@@@@@@@@@@@@@@@@@@@#@@@@@@@@@@@@@@@=@@@",
		"@@#$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
		"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
		"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#@@@@@@$-  -=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#$@@@@#      =@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*@@@",
		"@@@;@@@@, .@@ ;$@@-..~@@~~@,.@=.-@@@~.,$@@@@@#$@@@",
		"@@@!@@@@  ;@!!!*@     ~@         !@  .  :@@@@*@@@@",
		"@@@$#@@@  !@   ,@!:#!  @  ;=  @- -*  *:  @@@@;@@@@",
		"@@@@!@@@. -@=! ,@~  ;  @  *#  @~ -!  ,,,,@@@@@@@@@",
		"@@@@$@@@;  ..  ,@  @,  @  *#  @~ -$  #~ .@@@-@@@@@",
		"@@@@@-@@@-    -@@   -  @  *#  @~ -@:   .@@@*@@@@@@",
		"@@@@@@!@@@@##@@@@@#@@@@@@@@@@@@@@@@@@#@@@@#=@@@@@@",
		"@@@@@@$=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@@@@@",
		"@@@@@@@*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@",
		"@@@@@@@@=$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
		"@@@@@@@@@$!@@@@@@@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@",
		"@@@@@@@@@@@;@@@@@@@@@@@@@@@@@@@@@@@@@:$@@@@@@@@@@@",
		"@@@@@@@@@@@@$:@@@@@@@@@@@@@@@@@@@@@$;@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@=!$@@@@@@@@@@@@@@@#*;@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@#!!*#@@@@@@@#=!!=@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@#$=***=$#@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
								                                                       
					    };

				        
					    for (int i = 0; i < GameEnd.length; i++) {
						      // 초 간 중지한다
						      Thread.sleep(250);
						      // 메세지를 출력한다
						      System.out.println(GameEnd[i]);
						} 
						

						
						System.exit(0);
		//게임이 종료되어야				
					}
					
				}else if(InterviewTest2  == 2) {
					
					
					String GameEnd[] = { // 타이핑 쓰레드 - 익명 클래스

		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@=;:;;;;:=#@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@#-*@@@@@@@@@@@$-*@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@*;@@@@@@@@@@@@@@@@@=;#@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@!!@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@@@@",
		"@@@@@@@@@@#;@@@@@@@@@@@@@@@@@@@@@@@@@=*@@@@@@@@@@@",
		"@@@@@@@@@$$@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@@",
		"@@@@@@@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
		"@@@@@@@*#@@@@@~~~~~~$@@@@@@@@@@@*~!@@@@@@;@@@@@@@@",
		"@@@@@@$#@@@@@@      =@@@@@@@@@@@: ~@@@@@@@;@@@@@@@",
		"@@@@@@=@@@@@@@  !@@@@@;** ;@@#.,: ~@@@@@@@@=@@@@@@",
		"@@@@@~@@@@@@@@      ##     *@     ~@@@@@@@@=@@@@@@",
		"@@@@*@@@@@@@@@      ##  @. != .@- ~@@@@@@@@@~@@@@@",
		"@@@@!@@@@@@@@@  !@@@@#  @, !! ~@: ~@@@@@@@@@@#@@@@",
		"@@@=#@@@@@@@@@      ;#  @, !@  $  ~@@@@@@@@@@;@@@@",
		"@@@!@@@@@@@@@@      ;#  @, *@-  ; ~@@@@@@@@@@=@@@@",
		"@@@!@@@@@@@@@@@@@@@@@@@@@@@@@@#@@@@@@@@@@@@@@@=@@@",
		"@@#$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
		"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
		"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#@@@@@@$-  -=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#$@@@@#      =@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*@@@",
		"@@@;@@@@, .@@ ;$@@-..~@@~~@,.@=.-@@@~.,$@@@@@#$@@@",
		"@@@!@@@@  ;@!!!*@     ~@         !@  .  :@@@@*@@@@",
		"@@@$#@@@  !@   ,@!:#!  @  ;=  @- -*  *:  @@@@;@@@@",
		"@@@@!@@@. -@=! ,@~  ;  @  *#  @~ -!  ,,,,@@@@@@@@@",
		"@@@@$@@@;  ..  ,@  @,  @  *#  @~ -$  #~ .@@@-@@@@@",
		"@@@@@-@@@-    -@@   -  @  *#  @~ -@:   .@@@*@@@@@@",
		"@@@@@@!@@@@##@@@@@#@@@@@@@@@@@@@@@@@@#@@@@#=@@@@@@",
		"@@@@@@$=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@@@@@",
		"@@@@@@@*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@",
		"@@@@@@@@=$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
		"@@@@@@@@@$!@@@@@@@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@",
		"@@@@@@@@@@@;@@@@@@@@@@@@@@@@@@@@@@@@@:$@@@@@@@@@@@",
		"@@@@@@@@@@@@$:@@@@@@@@@@@@@@@@@@@@@$;@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@=!$@@@@@@@@@@@@@@@#*;@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@#!!*#@@@@@@@#=!!=@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@#$=***=$#@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
							                                                       
				    };

			        
				    for (int i = 0; i < GameEnd.length; i++) {
					      // 초 간 중지한다
					      Thread.sleep(250);
					      // 메세지를 출력한다
					      System.out.println(GameEnd[i]);
					} 
					System.out.println("취업준비를 포기했습니다.");
					System.out.println("게임이 종료되었습니다.");
					
					System.exit(0);
		//게임이 종료되어야				
					
					break;
					
									
				}else {
					System.out.println("다시 입력하세요.");
					 
					continue;
				}
				InterviewTest2 ++;
				}
				
			}else if(은행선택 == 3){
				Buttonbgm ButtonBgm = new Buttonbgm();
				
		        try {
		        	 ButtonBgm.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
				System.out.println("[후니] 좋아! 까까오뱅크 가보자!");
				System.out.println("===========================================================");
				System.out.println("까까오뱅크 요구 서류지수 : " + 까까오뱅크인사팀.서류지수_커트라인);
				System.out.println("까까오뱅크 요구 필기지수 : " + 까까오뱅크인사팀.필기지수_커트라인);
				System.out.println("까까오뱅크 요구 면접지수 : " + 까까오뱅크인사팀.면접지수_커트라인);
				System.out.println("===========================================================");
				
				후니.후니_서류지수 = 0; 후니.후니_필기지수 = 0; 후니.후니_면접지수 = 0;
				후니.후니_체력지수 = 90; 후니.후니_자존감지수 = 90; 후니.후니_스트레스지수 = 10;
				
				후니.상태알림();

				System.out.println("===========================================================");
				System.out.println("[후니] 어랏? 체력지수, 자존감지수, 스트레스지수가 뭐지?");
				System.out.println("팁을 확인하시려면 1번, 무시하시려면 2번");
				
				int 게임지수팁 = scan.nextInt();
				
				if ( 게임지수팁 == 1) {
					System.out.println("===========================================================");
					System.out.println("각 지수의 최대치는 100이며 100을 초과하거나 0 미안이 될 수 없습니다.");
					System.out.println("체력지수는 90으로 시작되며 0이 되면 게임종료입니다.");
					System.out.println("자존감지수는 90으로 시작되며 0이 되면 게임종료입니다.");
					System.out.println("스트레스지수는 10으로 시작되며 100이 되면 게임종료입니다.");
					System.out.println(" ");
					System.out.println("체력지수가 1~20, 자존감지수가 1~20, 스트레스지수가 80~99일 때 경고창이 뜹니다.");		
					System.out.println("취준은 마라톤입니다.");
					System.out.println("각 지수들을 잘 관리하는게 취업의 핵심입니다.");
					System.out.println("===========================================================");
							
					}else{
						Buttonbgm ButtonBgm2 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm2.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println("===========================================================");
				}		
				
				System.out.println("[후니] 후.. 쉽지 않군.");
				System.out.println("[후니] 그래도 열심히 해봐야지. 취업준비를 시작해볼까?"); // 1번 활동, 2번 상태확인, 3번 메인메뉴

			
				
				while (true) {
					System.out.println(" ");
					System.out.println("< 메인메뉴 > ");
					System.out.println("1. 활동"); // 1번 활동, 2번 상태확인, 3번 취준포기
					System.out.println("2. 상태확인");
					System.out.println("3. 겨울방학 취준포기");
					System.out.println(" ");

					int 메인메뉴선택창 = scan.nextInt();
					
					if ( 메인메뉴선택창 == 1) {
						
						
						if (true) {
							System.out.println(" ");
							System.out.println("겨울방학입니다. 겨울방학엔 자격증을 취득할 수 있습니다.");
							System.out.println("무엇을 취득하시겠습니까?");
							System.out.println("1. 컴퓨터자격증 ");
							System.out.println("2. 어학자격증");
							System.out.println("3. 금융자격증");
							System.out.println("4. 뒤로가기");
							System.out.println(" ");
							
							int 겨울방학선택창 = scan.nextInt(); // 70% 확률로 자격증 취득

						    if (겨울방학선택창 == 1) {
						    	컴퓨터자격증 컴퓨터자격증 = new 컴퓨터자격증 ();// 컴퓨터자격증클래스에서 컴퓨터자격증 객체를 만들어줬다.
								컴퓨터자격증.스펙이름 = "컴퓨터자격증";
						    	
						    	System.out.println("컴퓨터 자격증은 기본이지!!");
								System.out.println("컴퓨터자격증 시험에 응시했습니다.");
								
								// 5초 동안 input패털에 값을 입력하지 않았을 때 게임실패
								// 이를 위해 메인메소드가 있는 클래스에 inputCheck라는 static boolean값 생성
								
								ComputerInputThread ComputerInputThread = new ComputerInputThread();
								ComputerCountdownThread ComputerCountdownThread = new ComputerCountdownThread(); 
								
								ComputerInputThread.start(); //값을 처리
								ComputerCountdownThread.start(); //카운트다운을 처리
								ComputerCountdownThread.join();

								break;
						    
						    }else if(겨울방학선택창 == 2) {
								어학자격증 어학자격증 = new 어학자격증 ();
								어학자격증.스펙이름 = "어학자격증";
						    	
						    	System.out.println("혹시 모르니 어학자격증 하나는 따놓자!!!");
								System.out.println("어학자격증 시험에 응시했습니다.");
								
								// 5초 동안 input패털에 값을 입력하지 않았을 때 게임실패
								// 이를 위해 메인메소드가 있는 클래스에 inputCheck라는 static boolean값 생성
								
								EnglishInputThread EnglishInputThread = new EnglishInputThread();
								EnglishCountdownThread EnglishCountdownThread = new EnglishCountdownThread(); 
								
								EnglishInputThread.start();
								EnglishCountdownThread.start();
								EnglishCountdownThread.join();
								
					    	

								break;
								
						    }else if(겨울방학선택창 == 3) {
								금융자격증 금융자격증 = new 금융자격증 ();
								금융자격증.스펙이름 = "금융자격증";
						    	
								System.out.println("금융권 준비하는데 금융자격증은 기본이지!!");
								System.out.println("금융자격증 시험에 응시했습니다.");
								
								// 10초 동안 input에 값을 입력하지 않았을 때 게임실패
								// 이를 위해 메인메소드가 있는 클래스에 inputCheck라는 static boolean값 생성
								
								FinanceInputThread FinanceInputThread = new FinanceInputThread();
								FinanceCountdownThread FinanceCountdownThread = new FinanceCountdownThread(); 
								
								FinanceInputThread.start();
								FinanceCountdownThread.start();
								FinanceCountdownThread.join();
								
						    							
								break;
								
						    }else if(겨울방학선택창 == 4) {
						    	continue;
						    }else {
								System.out.println("다시 입력하세요.");
						    	continue;
						    }
						    
						}
						
					}else if(메인메뉴선택창 == 2){
						Buttonbgm ButtonBgm1 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm1.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						후니.상태알림();
						
					}else if(메인메뉴선택창 == 3) {
						Buttonbgm ButtonBgm1 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm1.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }	
						System.out.println("겨울방학 취준을 포기하시겠습니까?");
						System.out.println("1. 네");
						System.out.println("2. 아니오");
						
						
						int 취준포기선택창 = scan.nextInt();
						
						if(취준포기선택창 ==1) {
					        System.out.println("겨울방학 취업준비를 포기했습니다.");
							
							break;

						}else if(취준포기선택창 == 2) {
							continue;
						}else {
							System.out.println("다시 입력하세요."); // 취준을 포기하시겟습니까?가 뜨도록. 맨처음 메인메뉴창이 아니라.
							continue; 						   // 이 if문을 while문 안에 넣게 되면 취준포기선택창 == 2가 1.활동 2. 상태확인 3. 취준포기가 나와야
						}
						
						
					}else {
						System.out.println("다시 입력하세요.");
						continue;
					}
					
				}	
						
				System.out.println("겨울방학이 끝나고,");
				System.out.println("4학년 1학기가 시작되었습니다.");
				System.out.println(" ");
				System.out.println("한 학기는 총 12턴으로 이루어져 있습니다.");
				System.out.println("방학 때보다 더 많은 활동을 할 수 있습니다.");
				System.out.println("무엇을 하시겠습니까?"); // 한 턴당 1주가 지나며 총 16턴을 하면 여름방학으로 넘어가도록 해줘야함
				
				int turnsOfSpringsemester = 1; // 4학년 1학기 총 12턴!!
				
				while (turnsOfSpringsemester <= 12) {
					System.out.println("< 메인메뉴 > ");
					System.out.println("1. 활동"); // 1번 활동, 2번 상태확인, 3번 취준포기
					System.out.println("2. 상태확인");
					System.out.println("3. 1학기 취준포기");
							
					int 메인메뉴선택창 = scan.nextInt();
					
					if ( 메인메뉴선택창 == 1) {

						if (true) {
							System.out.println(" ");
							System.out.println("4학년 1학기 : " + turnsOfSpringsemester+"/12" + "번째 턴입니다.");
							System.out.println("어디에 가시겠습니까?");
							System.out.println("1. 학교에 간다");
							System.out.println("2. 동네에 간다");
							System.out.println("3. 집에 간다");
							System.out.println("4. 뒤로가기");
							System.out.println("<< 학교, 동네, 집 각각 일정확률로 이벤트가 튀어나옵니다. >>");
							System.out.println(" ");	

							
							int 일학기선택창 = scan.nextInt();

						    if (일학기선택창 == 1) {
								System.out.println(" ");
								System.out.println("학교에 왔습니다.");
								System.out.println("학교에서 무엇을 하시겠습니까?");
								System.out.println("1. 학점관리");
								System.out.println("2. 금융동아리활동");
								System.out.println("3. 취업지원본부 컨설팅");
								System.out.println("4. 면접스터디");
								System.out.println("5. 뒤로가기");
								System.out.println(" ");

								
								int 학교선택창 = scan.nextInt();
								
								if(학교선택창 ==1) {
							        System.out.println("후.. 전공공부 열심히 해야지!!");
									System.out.println("학교에서 열심히 학점관리를 합니다.");
									System.out.println(" ");
									후니.학점관리();
									System.out.println(" ");
									
									SomethingGirl SomethingGirl = new SomethingGirl();

									SomethingGirl.SomethingGirlCome();
									SomethingGirl.join(); 
									System.out.println(" ");
									후니.상태알림();
									
								}else if(학교선택창 == 2) {
									System.out.println("동아리에서 선배들에게 취업꿀팁을 얻습니다.");
									후니.금융동아리모임_참석();
									System.out.println(" ");
									
									CircleBroThread CircleBro = new CircleBroThread();

									CircleBro.CircleBroCome();
									CircleBro.join(); 
									System.out.println(" ");
									후니.상태알림();
									
								}else if(학교선택창 == 3) {
									System.out.println("취업지원본부에서 컨설팅을 받습니다.");
									후니.취업지원본부_컨설팅();
									후니.상태알림();
									
								}else if(학교선택창 == 4) {
									System.out.println("면접스터디를 통해 면접역량을 강화시킵니다.");
									후니.면접스터디_참석();
									
									//돌발이벤트 발생
									
									InterviewStudyMember Studymember= new InterviewStudyMember();

									Studymember.GoFeedback();
									Studymember.join(); 
									
									
									
									후니.상태알림();
									
								}else if(학교선택창 == 5) {
									continue;
								}else {
									System.out.println("다시 입력하세요."); // 취준을 포기하시겟습니까?가 뜨도록. 맨처음 메인메뉴창이 아니라.
									continue; 						   // 이 if문을 while문 안에 넣게 되면 취준포기선택창 == 2가 1.활동 2. 상태확인 3. 취준포기가 나와야
								}
								
								// (학교) 학교에서 은행 현직자멘토링 진행 // 멘토링 열릴 확률 20%

//								int 멘토링횟수;
//								멘토링횟수 = 0;
//								while(멘토링횟수<1)
								
								BankHuman BankHuman = new BankHuman(); 
									
									if(BankHuman.현직자멘토링()) {
										
										EventBgm EventBgm = new EventBgm();
										
								        try {
								        	EventBgm.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
								        
										System.out.println("학교 랜덤 이벤트 <은행 현직자 멘토링>");
										System.out.println("은행 현직자 멘토링에 참여하시겠습니까?");
										System.out.println("1. 참여");
										System.out.println("2. 불참");
			
										//객체.객체함수다. 객체의 기능!	
										
										int 멘토링선택창 = scan.nextInt();
										
										if(멘토링선택창 == 1) {
											System.out.println("멘토링에 참여해 많은 조언들을 얻습니다.");	
											BankHuman.후니의_서류지수_증가(5);
											BankHuman.후니의_필기지수_증가(5);
											BankHuman.후니의_면접지수_증가(5);
											BankHuman.후니의_체력지수_감소(10);
											
											후니.상태알림();
											
										}else if(멘토링선택창 == 2) {
											System.out.println("멘토링에 불참하고 체력을 회복합니다.");
											BankHuman.후니의_체력지수_증가(10);
											후니.상태알림();					
										}else {
											System.out.println("다시 입력하세요."); // 은행 현직자 멘토링에 참여하시겠습니까?가 뜨도록.
											continue; 	
										}
										
									}else {
										System.out.println("랜덤이벤트가 없습니다.");
									}
								
								
						    }else if(일학기선택창 == 2) {
								System.out.println(" ");
						    	System.out.println("동네에 왔습니다.");
								System.out.println("동네에서 무엇을 하시겠습니까?");
								System.out.println("1. 헬스");
								System.out.println("2. 치맥");
								System.out.println("3. 뒤로가기");
								System.out.println(" ");
								
								int 동네선택창 = scan.nextInt();
								
								if(동네선택창 ==1) {
							        
							        System.out.println(" ");
							        
						    		String health[] = { // 타이핑 쓰레드 - 익명 클래스
			
		"	                                    .-;.",           
		"	                                   -$@@=, ",         
		"	                                 .~#@@@@=:  ",       
		"	                                -*@@@@@@@@*   ",     
		"	                               -$@@@@@@@@@@*    ",   
		"	                              ;#@@@@@@@@@@@@~     ", 
		"	                              -@@@@@@@@@@@@@#      ",
		"	                              .#@@@@@@@@@@@@@$.    ",
		"	                               ,#@@@@@@@@@@@@@*    ",
		"	                                :@@@@@@@@@@@@@$,   ",
		"	                                ,=@@@@@@@@@@@@@;   ",
		"	                          -!.    ,$@@@@@@@@@@@@$-  ",
		"	                         ~#@$    :@@@@@@@@@@@@@@~  ",
		"	                         :@@@. -#@@@@@@@@@@@@@@@~  ",
		"	                      .@@!;@$.   ;@@@@@@@@@@@@@@@, ",
		"	                    .,=@@;.,,$@@@!~#@@@@@@@@@@@@@, ",
		"	                   ,$@ =@!!@@@@@@@;!*=@@@@@@@@@@$, ",
		"	                   !@@;.@=;*@@@@@@@,  *@@@@@@@@=-  ",
		"	                   -#@@!;@=-~::!@@@*  ,#@@@@@#!,   ",
		"	         .;     .*=~=@@#-!@-;==!!@@@=  ;@@@@@-     ",
		"	        .#@;    ,@@#~#@@* .-#@#~#@@@@   !@@$.      ",
		"	       #@@@@:   ,@@@- @@=:@@@@.@@@@@@   .=,        ",
		"	     .$@@@@@#,   -##~..,-$@#*.#@@@@@=              ",
		"	   .!@@@@@@@@;   ---$@#!@@$- *@@@@@@               ",
		"	  .*@@@@@@@@@@;,;@@@@@@@$!;,,@@@@@@#               ",
		"	  ,@@@@@@@@@@@@=@@@@@@@#~-$~!@@@@@@$               ",
		"	  ,@@@@@@@@@@@@@@@@@@@:~*$@~~@@@@@@@               ",
		"	   ;@@@@@@@@@@@@@@@@@- $@@@#.@@@@@@@$              ",
		"	   ~@@@@@@@@@@@@@@@=, @@@@@@,@@@@@@@@$             ",
		"	   ~@@@@@@@@@@@@@@!    @@@@@@@@@@@@@@#.            ",
		"	    ;@@@@@@@@@@@@@*.   =$#@@@@@@@@@@@@$.           ",
		"	    ~#@@@@@@@@@@@@@:     -#@@@@@@@@@@@@=.          ",
		"	     !@@@@@@@@@@@@@*.     ~#@@@@@@@@@@@@~          ",
		"	     ,#@@@@@@@@@@@@@=.     =@@@@@@@@@@@@$,         ",
		"	      ,#@@@@@@@@@@@@@~     ,#@@@@@@@@@@@@$.        ",
		"	       -@@@@@@@@@@@@@@      .@@@@@@@@@@@@@-        ",
		"	        *@@@@@@@@@@@#.       @@@@@@@@@@@@@@        ",
		"	         *@@@@@@@@@~          #@@@@@@@@@@@!        ",
		"	          ;#@@@@@=~           .#@@@@@@@@#~         ",
		"	           -$@@@;              ;@@@@@@@$-          ",
		"	            -;!:               .*@@@@@;-           ",
		"	                                ,=@@!-             ",
		"	                                 ;:,            "
								    };
							        
								    for (int i = 0; i < health.length; i++) {
									      // 초 간 중지한다
									      Thread.sleep(0);
									      // 메세지를 출력한다
									      System.out.println(health[i]);
									}
								    
								    System.out.println(" ");
									System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
									System.out.println(" ");
									후니.헬스장();
									후니.상태알림();
									
								}else if(동네선택창 == 2) {
								    System.out.println(" ");
									System.out.println("치맥으로 스트레스를 풉니다.");
									후니.치맥();
									후니.상태알림();
									
								}else if(동네선택창 == 3) {
									continue;
								}else {
									System.out.println("다시 입력하세요."); // 취준을 포기하시겟습니까?가 뜨도록. 맨처음 메인메뉴창이 아니라.
									continue; 						   // 이 if문을 while문 안에 넣게 되면 취준포기선택창 == 2가 1.활동 2. 상태확인 3. 취준포기가 나와야
								}
								
								// (동네) 동네에서 군대에서 헤어진 여자친구 만남 // 전 여자친구가 먼저 말 건넬 확률 10% // 한 번만 나오도록!
								Character Xgirlfriend = new Character(); 
								Xgirlfriend.관계 = "전 여자친구";
								
								if(Xgirlfriend.talkfirst()) {
									
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
							        
									System.out.println("동네 랜덤 이벤트 <전 여자친구와의 만남>");
									System.out.println("동네에서 우연히 전 여자친구를 만났습니다.");
									System.out.println("잘 지내냐는 안부인사를 건네옵니다.");
									System.out.println("1. 나도 안부인사를 해준다. ");
									System.out.println("2. 무시하고 지나간다. ");

									//객체.객체함수다. 객체의 기능!	
									
									int 전여자친구선택창 = scan.nextInt();
									
									if(전여자친구선택창 == 1) {
										System.out.println("[후니] 아 오랜만이네 ㅎㅎㅎ");	
										Xgirlfriend.후니의_스트레스지수_증가(10);
										후니.상태알림();
										
									}else if(전여자친구선택창 == 2) {
										System.out.println("[후니] (인사를 왜 하는거지)");
										Xgirlfriend.후니의_자존감지수_증가(10);
										후니.상태알림();					
									}else {
										System.out.println("다시 입력하세요."); 
										continue; 	
									}
									
								}else {
									System.out.println("랜덤이벤트가 없습니다.");
								}
								
						    }else if(일학기선택창 == 3) {
								System.out.println(" ");
						    	System.out.println("집에 왔습니다.");
								System.out.println("집에서 무엇을 하시겠습니까?");
								System.out.println("1. 부모님과 식사");
								System.out.println("2. 일기쓰기");
								System.out.println("3. 낮잠자기");
								System.out.println("4. 뒤로가기");
								System.out.println(" ");
								
								int 집선택창 = scan.nextInt();
								
								if(집선택창 ==1) {
									//버튼효과음
									
									String parents[] = {
											"부모님과 식사하며 취업 관련 이야기를 합니다.",
											"[부모님] 취업준비는 좀 잘 되고 있니?",
											"[후니] 나름대로 열심히 하고 있어요 ㅎㅎ",
											"[부모님] 그래그래 넌 혼자 알아서 잘 하리라 믿는다 ㅎㅎ ",
											"[후니] (후.. 이렇게나 날 믿어주시는데 잘 안되네 ㅠㅠ) ",
											"[부모님] 밥 많이 먹고 힘내라 아들",
											" "
									};
									
									for (int i = 0; i <parents.length; i++) {
										Thread.sleep(500);//0.5초마다 한 문장씩 출력
										System.out.println(parents[i]);
									}
									System.out.println(" ");

									후니.부모님과식사();
									
									
									RelativeClass relative = new RelativeClass();
									relative.RelativeCome();
									relative.join(); 
									
									
									System.out.println(" ");
									System.out.println(" ");
									
									후니.상태알림();
									
									
								}else if(집선택창 == 2) {
										    System.out.println(" ");
										    System.out.println("일기를 쓰며 하루를 점검하고 스스로를 보살핍니다.");
									후니.일기();
									후니.상태알림();
									
						    	}else if(집선택창 == 3) {
								    System.out.println(" ");
								    
						    		System.out.println("낮잠을 통해 부족한 체력을 충전합니다.");
						    		후니.낮잠();
						    		후니.상태알림();
						    		
						    	}else if(집선택창 == 4) {
									continue;
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						
								}
								
								//(집) 집에 있는데 과동기에게 공무원 합격했다는 카톡이 올 확률 10%
								
								Character UniversityFriend = new Character(); 
								UniversityFriend.관계 = "과동기";
								
								if(UniversityFriend.kakaotalk()) {
									
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
							        
									System.out.println("집 랜덤 이벤트 <과동기의 공무원 합격소식>");
									System.out.println("평소에 연락도 없던 과동기에게 공무원 합격했다고 연락옵니다.");
									System.out.println("1. 축하답장을 해준다.");
									System.out.println("2. 읽씹한다.");

									//객체.객체함수다. 객체의 기능!	
									
									int 과동기선택창 = scan.nextInt();
									
									if(과동기선택창 == 1) {
										System.out.println("[후니] 축하해 ㅎㅎㅎㅎㅎㅎ");	
										UniversityFriend.후니의_스트레스지수_증가(10);
										후니.상태알림();
										
									}else if(과동기선택창 == 2) {
										System.out.println("[후니] (읽씹) 별로 친하지도 않았는데 ;;");
										UniversityFriend.후니의_자존감지수_증가(10);
										후니.상태알림();					
									}else {
										System.out.println("다시 입력하세요."); // 은행 현직자 멘토링에 참여하시겠습니까?가 뜨도록.
										continue; 	
									}
									
								}else {
									System.out.println("랜덤이벤트가 없습니다.");
								}
								
						    }else if(일학기선택창 == 4) {
						    	continue;
						    }else {
								System.out.println("다시 입력하세요.");
						    	continue;
						    }
						    
						}
						
//						System.out.println("4학년 1학기 : " + turnsOfSpringsemester+"/16" + "번째 턴입니다.");
						turnsOfSpringsemester ++;	
						
					}else if(메인메뉴선택창 == 2){
					
						후니.상태알림();
						
					}else if(메인메뉴선택창 == 3) {
							
						System.out.println("취준을 포기하시겠습니까?");
						System.out.println("1. 네");
						System.out.println("2. 아니오");
						
						int 취준포기선택창 = scan.nextInt();
						
						if(취준포기선택창 ==1) {
							System.out.println("4학년 1학기 취업준비를 포기했습니다.");
							
							break;

						}else if(취준포기선택창 == 2) {
							continue;
						}else {
							System.out.println("다시 입력하세요."); // 취준을 포기하시겟습니까?가 뜨도록. 맨처음 메인메뉴창이 아니라.
							continue; 						   // 이 if문을 while문 안에 넣게 되면 취준포기선택창 == 2가 1.활동 2. 상태확인 3. 취준포기가 나와야
						}
						
					}else {
						System.out.println("다시 입력하세요.");
						continue;
					}

				}	
				
				
				System.out.println("4학년 1학기가 끝났습니다.");
				System.out.println("여름방학이 시작되었습니다.");
				System.out.println("여름방학엔 자격증 외에 다양한 스펙들 중 하나를 쌓을 수 있습니다.");
				
				
				while (true) {
					System.out.println(" ");
					System.out.println("< 메인메뉴 > ");
					System.out.println("1. 활동"); // 1번 활동, 2번 상태확인, 3번 취준포기
					System.out.println("2. 상태확인");
					System.out.println("3. 여름방학 취준포기");
					System.out.println(" ");
							
					int 메인메뉴선택창 = scan.nextInt();
					
					if ( 메인메뉴선택창 == 1) {

						if (true) {
							System.out.println(" ");
							System.out.println("무엇을 하시겠습니까?");
							System.out.println("1. 인턴");
							System.out.println("2. 대외활동");
							System.out.println("3. 공모전");
							System.out.println("4. 뒤로가기");
							System.out.println(" ");

							int 여름방학선택창 = scan.nextInt();

						    if (여름방학선택창 == 1) {
								System.out.println("학교 연계형 은행인턴입니다."); // 부장님이 예민합니다. 센스 발휘 확률
								인턴 인턴 = new 인턴();
								인턴.후니의_서류지수_증가(10);
								인턴.후니의_필기지수_증가(5);
								인턴.후니의_면접지수_증가(5);
								인턴.후니의_체력지수_감소(10);
								인턴.후니의_자존감지수_증가(5);
								인턴.후니의_스트레스지수_증가(10);
//								인턴.센스_추가();
								
								후니.상태알림();
								
								break;
						    
						    }else if(여름방학선택창 == 2) {
								System.out.println(" ");
						    	System.out.println("어떤 대외활동을 하시겠습니까?");
								System.out.println("1. 기자단");
								System.out.println("2. 서포터즈");
								System.out.println("3. 뒤로가기");
								System.out.println(" ");

								int 대외활동선택창 = scan.nextInt();
								
								if(대외활동선택창 ==1) {
									System.out.println("여름방학 동안 은행 기자단을 진행합니다."); // 거의 다 마무리된 기사가 날라감
									기자단 기자단 = new 기자단();
									기자단.후니의_서류지수_증가(10);
									기자단.후니의_면접지수_증가(5);
									기자단.후니의_체력지수_감소(10);
									기자단.후니의_스트레스지수_증가(10);

									
									후니.상태알림();
									
								}else if(대외활동선택창 == 2) {
									System.out.println("여름방학 동안 은행 서포터즈를 진행합니다."); // 갑자기 팀원이 나감.
									서포터즈 서포터즈 = new 서포터즈();
									서포터즈.후니의_서류지수_증가(10);
									서포터즈.후니의_면접지수_증가(5);
									서포터즈.후니의_체력지수_감소(10);
									서포터즈.후니의_스트레스지수_증가(10);

									
									후니.상태알림();
									
								}else if(대외활동선택창 == 3) {
									continue;
								}else {
									System.out.println("다시 입력하세요.");
									continue; 						 
								}
								
								break;
								
						    }else if(여름방학선택창 == 3) {
								System.out.println(" ");
						    	System.out.println("어떤 공모전을 하시겠습니까?");
								System.out.println("1. 아이디어 공모전");
								System.out.println("2. 논문공모전");
								System.out.println("3. 뒤로가기");
								System.out.println(" ");
								
								int 공모전선택창 = scan.nextInt();
								
								if(공모전선택창 ==1) {
									System.out.println("여름방학 동안 아이디어 공모전을 진행합니다."); // 다른 팀이 내 아이디어 베낌
									아이디어공모전 아이디어공모전 = new 아이디어공모전();
									아이디어공모전.후니의_서류지수_증가(10);
									아이디어공모전.후니의_면접지수_증가(5);
									아이디어공모전.후니의_체력지수_감소(10);
									아이디어공모전.후니의_스트레스지수_증가(10);
									아이디어공모전.창의력_추가();
									
									후니.상태알림();
									
								}else if(공모전선택창 == 2) {
									System.out.println("여름방학 동안 논문공모전을 진행합니다."); // 내껄 빼먹고 심사할 확률 	
									논문공모전 논문공모전 = new 논문공모전();
									논문공모전.후니의_서류지수_증가(10);
									논문공모전.후니의_면접지수_증가(5);
									논문공모전.후니의_체력지수_감소(10);
									논문공모전.후니의_스트레스지수_증가(10);
									논문공모전.사고력_추가();
									
									후니.상태알림();
									
						    	}else if(공모전선택창 == 3) {
						    		continue;
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						   
								}
							
								break;	
								
						    }else if(여름방학선택창 == 4) {
						    	continue;
						    }else {
								System.out.println("다시 입력하세요.");
						    	continue;
						    }
						    
						}	
						
					}else if(메인메뉴선택창 == 2){
						후니.상태알림();
						
					}else if(메인메뉴선택창 == 3) {
							
						System.out.println("여름방학 취준을 포기하시겠습니까?");
						System.out.println("1. 네");
						System.out.println("2. 아니오");
						
						int 취준포기선택창 = scan.nextInt();
						
						if(취준포기선택창 ==1) {
					        System.out.println("여름방학 취업준비를 포기했습니다.");
							
							break;

						}else if(취준포기선택창 == 2) {
							continue;
						}else {
							System.out.println("다시 입력하세요."); 
							continue; 					
						}
						
					}else {
						System.out.println("다시 입력하세요.");
						continue;
					}

				}
				
				System.out.println("여름방학이 끝나고,");
				System.out.println("4학년 2학기가 시작되었습니다.");
				System.out.println("===========================================================");
				System.out.println("2학기는 9월은 총 네 턴입니다.");
				System.out.println("10월은 세 턴 후 서류를 제출해야 합니다.");
				System.out.println("11월은 세 턴 후 필기전형에 응시해야 합니다.");
				System.out.println("12월은 세 턴 후 면접전형이 응시해야 합니다.");
				System.out.println("각 전형에 필요한 지수들과 자기관리에 집중합시다!");
				System.out.println("===========================================================");	
				int Sep = 1; // 9월 네 턴!
				
				while (Sep <= 4) {
					System.out.println(" ");
					System.out.println("< 메인메뉴 > ");
					System.out.println("1. 활동"); // 1번 활동, 2번 상태확인, 3번 취준포기
					System.out.println("2. 상태확인");
					System.out.println("3. 취준포기");
					System.out.println(" ");

					int 메인메뉴선택창 = scan.nextInt();
					
					if ( 메인메뉴선택창 == 1) {

						if (true) {
							System.out.println("4학년 2학기 9월 : " + Sep + "/4" + "번째 턴입니다.");
							System.out.println("어디에 가시겠습니까?");
							System.out.println("1. 학교에 간다");
							System.out.println("2. 동네에 간다");
							System.out.println("3. 집에 간다");
							System.out.println("4. 뒤로가기");
							System.out.println("<< 학교, 동네, 집 각각 일정확률로 이벤트가 튀어나옵니다. >>");

							
							int 일학기선택창 = scan.nextInt();

						    if (일학기선택창 == 1) {
								System.out.println("학교에 왔습니다.");
								System.out.println("학교에서 무엇을 하시겠습니까?");
								System.out.println("1. 학점관리");
								System.out.println("2. 금융동아리활동");
								System.out.println("3. 취업지원본부 컨설팅");
								System.out.println("4. 면접스터디");
								System.out.println("5. 뒤로가기");

								int 학교선택창 = scan.nextInt();
								
								if(학교선택창 ==1) {
							        System.out.println("후.. 전공공부 열심히 해야지!!");
									System.out.println("학교에서 열심히 학점관리를 합니다.");
									System.out.println(" ");
									후니.학점관리();
									
									System.out.println(" ");
									
									SomethingGirl SomethingGirl = new SomethingGirl();

									SomethingGirl.SomethingGirlCome();
									SomethingGirl.join(); 
									System.out.println(" ");
									
									후니.상태알림();
									
								}else if(학교선택창 == 2) {
									System.out.println("동아리에서 선배들에게 취업꿀팁을 얻습니다.");
									후니.금융동아리모임_참석();
									System.out.println(" ");
									
									CircleBroThread CircleBro = new CircleBroThread();

									CircleBro.CircleBroCome();
									CircleBro.join(); 
									System.out.println(" ");
									후니.상태알림();
									
								}else if(학교선택창 == 3) {
									System.out.println("취업지원본부에서 컨설팅을 받습니다.");
									후니.취업지원본부_컨설팅();
									후니.상태알림();
									
								}else if(학교선택창 == 4) {
									System.out.println("면접스터디를 통해 면접역량을 강화시킵니다.");
									후니.면접스터디_참석();
									
									InterviewStudyMember Studymember= new InterviewStudyMember();

									Studymember.GoFeedback();
									Studymember.join(); 
									
									후니.상태알림();
									
								}else if(학교선택창 == 5) {
									continue;
							
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						 
								}
								
								Character InterviewFriend = new Character(); 
								InterviewFriend.관계 = "취업스터디원";
								
									if(InterviewFriend.SuccessFirst()) {
										
										EventBgm EventBgm = new EventBgm();
										
								        try {
								        	EventBgm.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
								        
										System.out.println("학교 랜덤 이벤트 <취업스터디원이 먼저 합격했습니다.>");
										System.out.println("축하파티에 참여하시겠습니까?");
										System.out.println("1. 참여");
										System.out.println("2. 불참");
			
										//객체.객체함수다. 객체의 기능!	
										
										int goparty = scan.nextInt();
										
										if(goparty == 1) {
											System.out.println("축하파티에 참여해 많은 조언들을 얻습니다.");	
											InterviewFriend.후니의_서류지수_증가(5);
											InterviewFriend.후니의_필기지수_증가(5);
											InterviewFriend.후니의_면접지수_증가(5);
											InterviewFriend.후니의_체력지수_감소(10);
											InterviewFriend.후니의_자존감지수_감소(5);
											
											후니.상태알림();
											
										}else if(goparty == 2) {
											System.out.println("축하파티에 불참하고 체력을 회복합니다.");
											InterviewFriend.후니의_체력지수_증가(15);
											InterviewFriend.후니의_자존감지수_감소(5);
											InterviewFriend.후니의_스트레스지수_증가(5);
											
											후니.상태알림();					
										}else {
											System.out.println("다시 입력하세요.");
											continue; 	
										}
										
									}else {
										
										System.out.println("랜덤이벤트가 없습니다.");
									}
								
								
						    }else if(일학기선택창 == 2) {
						    	System.out.println("동네에 왔습니다.");
								System.out.println("동네에서 무엇을 하시겠습니까?");
								System.out.println("1. 헬스");
								System.out.println("2. 치맥");
								System.out.println("3. 뒤로가기");
								
								int 동네선택창 = scan.nextInt();
								
								if(동네선택창 ==1) {
							        
							        System.out.println(" ");
								    System.out.println(" ");
									System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
									System.out.println(" ");
									후니.헬스장();
									후니.상태알림();
									
								}else if(동네선택창 == 2) {
									    System.out.println(" ");
										System.out.println("치맥으로 스트레스를 풉니다.");
										후니.치맥();
										후니.상태알림();
								
									
								}else if(동네선택창 == 3) {
									continue;
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						 
								}
								
								// (동네) 고등학교 친구에게 안부전화 올 확률 10% 
								
								Character HighschoolFriend = new Character(); 
								HighschoolFriend.관계 = "고등학교 친구";
								
									if(HighschoolFriend.HiCall()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									
									System.out.println("동네 랜덤 이벤트 <고등학교 친구의 안부전화>");
									System.out.println("잊고 있던 고등학교 친구에게 전화가 옵니다.");
									System.out.println("1. 전화를 받는다. ");
									System.out.println("2. 전화를 받지 않는다. ");

									//객체.객체함수다. 객체의 기능!	
									
									int 안부전화선택창 = scan.nextInt();
									
									if(안부전화선택창 == 1) {
										System.out.println("[고등학교 친구] 어 후니야! 아까 동네에서 너 본 것 같아서 전화했어!");	
										System.out.println("[고등학교 친구] 잘 지내고 있었지?");	
										System.out.println("[고등학교 친구] 전역한 이후로 한 번도 못봤는데! 보고 싶다야!");
										System.out.println("[후니] 말할 틈도 안주네!");
										System.out.println("[후니] 나도 보고 싶다야!");
										
										HighschoolFriend.후니의_체력지수_증가(10);
										HighschoolFriend.후니의_자존감지수_증가(10);
										HighschoolFriend.후니의_스트레스지수_감소(10);
										
										후니.상태알림();
										
									}else if(안부전화선택창 == 2) {
										System.out.println("[후니] 아 무슨 일이지.. 연락하기 싫은데..");
										HighschoolFriend.후니의_자존감지수_감소(10);
										HighschoolFriend.후니의_스트레스지수_증가(10);
										
										후니.상태알림();					
									}else {
										System.out.println("다시 입력하세요."); 
										continue; 	
									}
									
								}else {
									System.out.println("랜덤이벤트가 없습니다.");
								}
								
						    }else if(일학기선택창 == 3) {
						    	System.out.println("집에 왔습니다.");
								System.out.println("집에서 무엇을 하시겠습니까?");
								System.out.println("1. 부모님과 식사");
								System.out.println("2. 일기쓰기");
								System.out.println("3. 낮잠자기");
								System.out.println("4. 뒤로가기");
								
								int 집선택창 = scan.nextInt();
								
								if(집선택창 ==1) {
							        String parents[] = {
											"부모님과 식사하며 취업 관련 이야기를 합니다.",
											"[부모님] 취업준비는 좀 잘 되고 있니?",
											"[후니] 나름대로 열심히 하고 있어요 ㅎㅎ",
											"[부모님] 그래그래 넌 혼자 알아서 잘 하리라 믿는다 ㅎㅎ ",
											"[후니] (후.. 이렇게나 날 믿어주시는데 잘 안되네 ㅠㅠ) ",
											"[부모님] 밥 많이 먹고 힘내라 아들",
											" "
									};
									
									for (int i = 0; i <parents.length; i++) {
										Thread.sleep(500);//0.5초마다 한 문장씩 출력
										System.out.println(parents[i]);
									}
									System.out.println(" ");

									후니.부모님과식사();
									System.out.println(" ");

									RelativeClass relative = new RelativeClass();
									relative.RelativeCome();
									relative.join(); 
									System.out.println(" ");

									후니.상태알림();
									
								}else if(집선택창 == 2) {
								    System.out.println(" ");
								    System.out.println("일기를 쓰며 하루를 점검하고 스스로를 보살핍니다.");
							후니.일기();
							후니.상태알림();
						    	}else if(집선택창 == 3) {
									    System.out.println(" ");
							    		System.out.println("낮잠을 통해 부족한 체력을 충전합니다.");
							    		후니.낮잠();
							    		후니.상태알림();
						    		
						    	}else if(집선택창 == 4) {
									continue;
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						
								}
								
								//(집) 동생의 병간호를 해야합니다.
								Character Bro = new Character(); 
								Bro.관계 = "남동생";
								
								if(Bro.gohospital()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("집 랜덤 이벤트 <동생의 입원>");
									System.out.println("동생이 입원했습니다.");
									System.out.println("병간호를 하시겠습니까?");
									System.out.println("1. 병간호를 한다.");
									System.out.println("2. 하지 않는다.");

									//객체.객체함수다. 객체의 기능!	
									
									int 병간호선택창 = scan.nextInt();
									
									if(병간호선택창 == 1) {
										System.out.println("[후니] (후.. 취준에 집안일까지..)");	
										System.out.println("[후니] 조심 좀 하지 그랬어 ㅠㅠ");	
										Bro.후니의_체력지수_감소(5);
										Bro.후니의_스트레스지수_증가(5);
										후니.상태알림();
										
									}else if(병간호선택창 == 2) {
										System.out.println("[후니] 너무 바빠.. 하반기 준비해야해..ㅠㅠ");
										Bro.후니의_스트레스지수_증가(5);
										Bro.후니의_자존감지수_감소(5);
										후니.상태알림();					
									}else {
										System.out.println("다시 입력하세요.");
										continue; 	
									}
									
								}else {
									System.out.println("랜덤이벤트가 없습니다.");
								}
								
						    }else if(일학기선택창 == 4) {
						    	continue;
						    }else {
								System.out.println("다시 입력하세요.");
						    	continue;
						    }
						    
						}
						
						Sep ++;	
						
					}else if(메인메뉴선택창 == 2){
						후니.상태알림();
						
					}else if(메인메뉴선택창 == 3) {
						System.out.println("취준을 포기하시겠습니까?");
						System.out.println("1. 네");
						System.out.println("2. 아니오");
						
						int 취준포기선택창 = scan.nextInt();
						
						if(취준포기선택창 ==1) {
							System.out.println("9월 취업준비를 포기했습니다.");					
							System.out.println("이제 10월입니다.");
							
							break;

						}else if(취준포기선택창 == 2) {
							continue;
						}else {
							System.out.println("다시 입력하세요."); // 취준을 포기하시겟습니까?가 뜨도록. 맨처음 메인메뉴창이 아니라.
							continue; 						   // 이 if문을 while문 안에 넣게 되면 취준포기선택창 == 2가 1.활동 2. 상태확인 3. 취준포기가 나와야
						}
						
					}else {
						System.out.println("다시 입력하세요.");
						continue;
					}

				}
				
				System.out.println("10월입니다.");	
				System.out.println("10월 마지막주에 서류전형이 있습니다.");					
				
				int OCT = 1; // 10월 세 턴! 후 서류 전형!!
				
				while (OCT <= 3) {
					System.out.println(" ");
					System.out.println("1. 활동"); // 1번 활동, 2번 상태확인, 3번 취준포기
					System.out.println("2. 상태확인");
					System.out.println("3. 취준포기");
					System.out.println(" ");
							
					int 메인메뉴선택창 = scan.nextInt();
					
					if ( 메인메뉴선택창 == 1) {

						if (true) {
							System.out.println(" ");
							System.out.println("4학년 2학기 10월 : " + OCT + "/3" + "번째 턴입니다.");
							System.out.println("어디에 가시겠습니까?");
							System.out.println("1. 학교에 간다");
							System.out.println("2. 동네에 간다");
							System.out.println("3. 집에 간다");
							System.out.println("4. 뒤로가기");
							System.out.println("<< 학교, 동네, 집 각각 일정확률로 이벤트가 튀어나옵니다. >>");

							System.out.println(" ");
							
							int 일학기선택창 = scan.nextInt();

						    if (일학기선택창 == 1) {
								System.out.println(" ");
								System.out.println("학교에 왔습니다.");
								System.out.println("학교에서 무엇을 하시겠습니까?");
								System.out.println("1. 학점관리");
								System.out.println("2. 금융동아리활동");
								System.out.println("3. 취업지원본부 컨설팅");
								System.out.println("4. 면접스터디");
								System.out.println("5. 뒤로가기");
								System.out.println(" ");

								int 학교선택창 = scan.nextInt();
								
								if(학교선택창 ==1) {
							        System.out.println("후.. 전공공부 열심히 해야지!!");
									System.out.println("학교에서 열심히 학점관리를 합니다.");
									후니.학점관리();
									
									System.out.println(" ");
									
									SomethingGirl SomethingGirl = new SomethingGirl();

									SomethingGirl.SomethingGirlCome();
									SomethingGirl.join(); 
									System.out.println(" ");
									후니.상태알림();
									
								}else if(학교선택창 == 2) {
									System.out.println("동아리에서 선배들에게 취업꿀팁을 얻습니다.");
									후니.금융동아리모임_참석();
									System.out.println(" ");
									
									CircleBroThread CircleBro = new CircleBroThread();

									CircleBro.CircleBroCome();
									CircleBro.join(); 
									System.out.println(" ");
									후니.상태알림();
									
								}else if(학교선택창 == 3) {
									System.out.println("취업지원본부에서 컨설팅을 받습니다.");
									후니.취업지원본부_컨설팅();
									후니.상태알림();
									
								}else if(학교선택창 == 4) {
									System.out.println("면접스터디를 통해 면접역량을 강화시킵니다.");
									후니.면접스터디_참석();
									
									InterviewStudyMember Studymember= new InterviewStudyMember();

									Studymember.GoFeedback();
									Studymember.join(); 
									
									후니.상태알림();
									
								}else if(학교선택창 == 5) {
									continue;
							
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						 
								}
								
								// (학교) 취업스터디원 먼저 합격해서 쫑파티 열 확률 10%

//								int 멘토링횟수;
//								멘토링횟수 = 0;
//								while(멘토링횟수<1)
								
								Character InterviewFriend = new Character(); 
								InterviewFriend.관계 = "취업스터디원";
								
									if(InterviewFriend.SuccessFirst()) {
										EventBgm EventBgm = new EventBgm();
										
								        try {
								        	EventBgm.LoadBgm();
								             Thread.sleep(0);
								             
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("학교 랜덤 이벤트 <취업스터디원이 먼저 합격했습니다.>");
										System.out.println("축하파티에 참여하시겠습니까?");
										System.out.println("1. 참여");
										System.out.println("2. 불참");
			
										//객체.객체함수다. 객체의 기능!	
										
										int goparty = scan.nextInt();
										
										if(goparty == 1) {
											System.out.println("축하파티에 참여해 많은 조언들을 얻습니다.");	
											InterviewFriend.후니의_서류지수_증가(5);
											InterviewFriend.후니의_필기지수_증가(5);
											InterviewFriend.후니의_면접지수_증가(5);
											InterviewFriend.후니의_체력지수_감소(10);
											InterviewFriend.후니의_자존감지수_감소(5);
											
											후니.상태알림();
											
										}else if(goparty == 2) {
											System.out.println("축하파티에 불참하고 체력을 회복합니다.");
											InterviewFriend.후니의_체력지수_증가(15);
											InterviewFriend.후니의_자존감지수_감소(5);
											InterviewFriend.후니의_스트레스지수_증가(5);
											
											후니.상태알림();					
										}else {
											System.out.println("다시 입력하세요.");
											continue; 	
										}
										
									}else {
										System.out.println("랜덤이벤트가 없습니다.");
									}
								
								
						    }else if(일학기선택창 == 2) {
								System.out.println(" ");
						    	System.out.println("동네에 왔습니다.");
								System.out.println("동네에서 무엇을 하시겠습니까?");
								System.out.println("1. 헬스");
								System.out.println("2. 치맥");
								System.out.println("3. 뒤로가기");
								System.out.println(" ");
								
								int 동네선택창 = scan.nextInt();
								
								if(동네선택창 ==1) {
								    
								    System.out.println(" ");
									System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
									System.out.println(" ");
									후니.헬스장();
									후니.상태알림();
									
								}else if(동네선택창 == 2) {
									String ChickenandBeer[] = { // 타이핑 쓰레드 - 익명 클래스

											"                       ,**~",               
											"....                  ,*  :;...!#=#.",      
											"!#@@#!,                !    ::::,   ;,",     
											"~@#-,,,$@!              -.            -~",     
											":#:-:!!!,;#=            ;!~            .;:",    
											".#*,!@@#@$,-#;          ;.                ;. ",  
											";$,,;:,,,:$-;@,         :                 .~ ",  
											"#~,,,,,,,-~-,#*         ;                 !.  ", 
											"#-,,,,,,,,,,,~=         .*-,,,  ,,,,,,,,,;;    ",
											"-*-,,,,,,,,,,,,@,          ;,,!  =,,,,,,,:~     ",
											"~*,,,,,,,,,,,,,@-          ~  !  $       -#=,   ",
											".=-,,,,,,,,,,,,=-          ~  *  # ,. ;  -~ !   ",
											" @~,,,,,,,,,,,,;!          ~   @#@ -. $  -@*.*  ",
											" *=,,,,,,,,,,,,;@          ~   * # -. $  --=.@  ",
											" ,@=,,,,,,,,,,,,$=         ~   * # -. $  --;,@  ",
											"  ~#*,,,,,,,,,,,:#-        ~   * # -. $  --*.@  ",
											"   ,##:,,,,,,,,,,@:        ~   * # -. $  -#$ $  ",
											"     *##;-,,,,,,:@$-       ~   * # -. $  -; !.  ",
											"      .-@#*-,,,:@~!@:-~    ~   * # -. $  -*$~   ",
											"         ;$@*::@;  ~$$=@~  ~   * # -. $  -~     ",
											"           -~=!*$!  ...-#. ~   * # -. $  --     ",
											"                ;#*    ,@- ~   ~ ! .  :  --     ",
											"                 ,@   *#=  ~.            -,     ",
											"                 ,@   $-   ~;           .*      ",
											"                  =!.:@-    -;;;;;;;;;;;;       ",
											"                  .@@@*                         ",
											    			      " .                      "
											     
									    };

								        
									    for (int i = 0; i < ChickenandBeer.length; i++) {
										      // 초 간 중지한다
										      Thread.sleep(100);
										      // 메세지를 출력한다
										      System.out.println(ChickenandBeer[i]);
										}
									    System.out.println(" ");
										System.out.println("치맥으로 스트레스를 풉니다.");
										후니.치맥();
										후니.상태알림();
									
								}else if(동네선택창 == 3) {
									continue;
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						 
								}
								
								// (동네) 고등학교 친구에게 안부전화 올 확률 10% 
								
								Character HighschoolFriend = new Character(); 
								HighschoolFriend.관계 = "고등학교 친구";
								
								if(HighschoolFriend.HiCall()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("동네 랜덤 이벤트 <고등학교 친구의 안부전화>");
									System.out.println("잊고 있던 고등학교 친구에게 전화가 옵니다.");
									System.out.println("1. 전화를 받는다. ");
									System.out.println("2. 전화를 받지 않는다. ");

									//객체.객체함수다. 객체의 기능!	
									
									int 안부전화선택창 = scan.nextInt();
									
									if(안부전화선택창 == 1) {
										System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
										후니.헬스장();
										후니.상태알림();
										System.out.println("[고등학교 친구] 어 후니야! 아까 동네에서 너 본 것 같아서 전화했어!");	
										System.out.println("[고등학교 친구] 잘 지내고 있었지?");	
										System.out.println("[고등학교 친구] 전역한 이후로 한 번도 못봤는데! 보고 싶다야!");
										System.out.println("[후니] 말할 틈도 안주네!");
										System.out.println("[후니] 나도 보고 싶다야!");
										
										HighschoolFriend.후니의_체력지수_증가(10);
										HighschoolFriend.후니의_자존감지수_증가(10);
										HighschoolFriend.후니의_스트레스지수_감소(10);
										
										후니.상태알림();
										
									}else if(안부전화선택창 == 2) {
										System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
										후니.헬스장();
										후니.상태알림();
										System.out.println("[후니] 아 무슨 일이지.. 요즘 사람들 만나기 싫은데..");
										HighschoolFriend.후니의_자존감지수_감소(10);
										HighschoolFriend.후니의_스트레스지수_증가(10);
										
										후니.상태알림();					
									}else {
										System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
										후니.헬스장();
										후니.상태알림();
										System.out.println("다시 입력하세요."); 
										continue; 	
									}
									
								}else {
									System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
									후니.헬스장();
									후니.상태알림();
									System.out.println("랜덤이벤트가 없습니다.");
								}
								
						    }else if(일학기선택창 == 3) {
						    	System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
								후니.헬스장();
								후니.상태알림();
								System.out.println(" ");
						    	System.out.println("집에 왔습니다.");
								System.out.println("집에서 무엇을 하시겠습니까?");
								System.out.println("1. 부모님과 식사");
								System.out.println("2. 일기쓰기");
								System.out.println("3. 낮잠자기");
								System.out.println("4. 뒤로가기");
								System.out.println(" ");
								
								int 집선택창 = scan.nextInt();
								
								if(집선택창 ==1) {
							        String parents[] = {
											"부모님과 식사하며 취업 관련 이야기를 합니다.",
											"[부모님] 취업준비는 좀 잘 되고 있니?",
											"[후니] 나름대로 열심히 하고 있어요 ㅎㅎ",
											"[부모님] 그래그래 넌 혼자 알아서 잘 하리라 믿는다 ㅎㅎ ",
											"[후니] (후.. 이렇게나 날 믿어주시는데 잘 안되네 ㅠㅠ) ",
											"[부모님] 밥 많이 먹고 힘내라 아들",
											" "
									};
									
									for (int i = 0; i <parents.length; i++) {
										Thread.sleep(500);//0.5초마다 한 문장씩 출력
										System.out.println(parents[i]);
									}
									System.out.println(" ");

									후니.부모님과식사();
									System.out.println(" ");
									
									RelativeClass relative = new RelativeClass();
									relative.RelativeCome();
									relative.join(); 
									
									후니.상태알림();
									
								}else if(집선택창 == 2) {
								    System.out.println(" ");
								    System.out.println("일기를 쓰며 하루를 점검하고 스스로를 보살핍니다.");
									후니.일기();
									후니.상태알림();
									
						    	}else if(집선택창 == 3) {
										    System.out.println(" ");
										    
								    		System.out.println("낮잠을 통해 부족한 체력을 충전합니다.");
								    		후니.낮잠();
								    		후니.상태알림();
						    		
						    	}else if(집선택창 == 4) {
									continue;
								}else {

									System.out.println("다시 입력하세요."); 
									continue; 						
								}
								
								//(집) 동생의 병간호를 해야합니다.
								Character Bro = new Character(); 
								Bro.관계 = "남동생";
								
								if(Bro.gohospital()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("집 랜덤 이벤트 <동생의 입원>");
									System.out.println("동생이 입원했습니다.");
									System.out.println("병간호를 하시겠습니까?");
									System.out.println("1. 병간호를 한다.");
									System.out.println("2. 하지 않는다.");

									//객체.객체함수다. 객체의 기능!	
									
									int 병간호선택창 = scan.nextInt();
									
									if(병간호선택창 == 1) {
										
										System.out.println("[후니] (후.. 취준에 집안일까지..)");	
										System.out.println("[후니] 조심 좀 하지 그랬어 ㅠㅠ");	
										Bro.후니의_체력지수_감소(5);
										Bro.후니의_스트레스지수_증가(5);
										후니.상태알림();
										
									}else if(병간호선택창 == 2) {
										System.out.println("[후니] 너무 바빠.. 하반기 준비해야해..ㅠㅠ");
										Bro.후니의_스트레스지수_증가(5);
										Bro.후니의_자존감지수_감소(5);
										후니.상태알림();					
									}else {
										System.out.println("다시 입력하세요.");
										continue; 	
									}
									
								}else {
									System.out.println("랜덤이벤트가 없습니다.");
								}
								
						    }else if(일학기선택창 == 4) {
						    	continue;
						    }else {
								System.out.println("다시 입력하세요.");
						    	continue;
						    }
						    
						}
						
						OCT ++;	
						
					}else if(메인메뉴선택창 == 2){
						후니.상태알림();
						
					}else if(메인메뉴선택창 == 3) {
						System.out.println("취준을 포기하시겠습니까?");
						System.out.println("1. 네");
						System.out.println("2. 아니오");
						
						int 취준포기선택창 = scan.nextInt();
						
						if(취준포기선택창 ==1) {
							System.out.println("10월 취업준비를 포기합니다.");					
							
							
							break;

						}else if(취준포기선택창 == 2) {
							continue;
						}else {
							System.out.println("다시 입력하세요."); // 취준을 포기하시겟습니까?가 뜨도록. 맨처음 메인메뉴창이 아니라.
							continue; 						   // 이 if문을 while문 안에 넣게 되면 취준포기선택창 == 2가 1.활동 2. 상태확인 3. 취준포기가 나와야
						}
						
					}else {
						System.out.println("다시 입력하세요.");
						continue;
					}

				}
				
				System.out.println("하반기채용 서류 제출 주간입니다.");
				System.out.println("서류를 제출하시겠습니까?");
				
				int Apply;
				Apply = 0;
				
				while(Apply<1) {
				System.out.println("1번 : 제출한다");
				System.out.println("2번 : 취준포기");
						
				int Apply2 = scan.nextInt();
				
				if(Apply2 == 1) {
		 			 
					 System.out.println(" ");
					 String JopPhoto[] = { // 타이핑 쓰레드 - 익명 클래스

								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!*==$====!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!=@#@@@##@###**!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!$@@#@@@@@@#$==$$=!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!#@@@@@@@@@@#########!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!$@@@@@@@@##$####$$$###*!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!$@@@@@@@@#######$#$$$#@#!!!!!!!!!!!!!",
								"!!!!!!!!!!!!*@@@@@@@@#####@##$$#$###@$!!!!!!!!!!!!",
								"!!!!!!!!!!!!#@@@@#@#@@##$####$#$$###@@!!!!!!!!!!!!",
								"!!!!!!!!;!;!@@@@#####@##$$$$#$##$$#$#@$!!!!!!!!!!!",
								"!!!!!!!;;;;@#@########$$*$$$$=###$###@@!!!!!!!!!!!",
								"!!!!!!;;;;!@########$$==$$$$$####$$###@!!!!!!!!!!!",
								"!!!;;;;;;;!####$$$$$=====$###$########@*!!!!!!!!!!",
								";!;;;;;;;;*###$$$=*====$#$############@*;!!!!!!!!!",
								";;;;;;;;;;*###$===*=$$==###############*;;;;!!!!!!",
								";;;;;;;;;;=####===*=#$*!$$$###########@!;;;;;!!!!!",
								";;;;;;;;;;*@##=**!;:*=*::**;*$#######@#!;;;;;;;!!!",
								";;;;;;;;;;!@#!!-:-,,-..   ..~!=$#####@@;;;;;;;;;!!",
								";;;;;;;;;;;##:..----,,.    .-~::;**####;;;;;;;;;;;",
								";;;;;;;;;;;#$:..., ,~      ..=..;:;=#@$;;;;;;;;;;;",
								";;;;;;;;:::$#;.~.    --   .   ..,~:!#@=;;;;;;;;;;;",
								";;;;;;;:::-,:!~...-~*-, .:..-#;~--;*$=;;;;;;;;;;;;",
								";;;;;::::;.. ;~   ..~,.:.,!.,!,-,,-:*~:;::;;;;;;;;",
								";;;;::::::   ~.      ..   !  .....-:!~;;:::;;;;;;;",
								";;;:::::::  -,..      :,  :,    ..-:!~~::::::;;;;;",
								";;;:::::::-  ,...     .   --    .,-:;:::::::::;;;;",
								";:::::::~~:  ,. ~.  , .   -~...-.,-:;*:~~::::::;;;",
								";::::::~~~~  ,,           ,-,  ..,~:!:;~~~::::::;;",
								"::::::~~~~~~ .,.       ...--~   .,~::~~~~~~~:::::;",
								":::::~~~~~~-~ -.        .-~--. ..-~;~~-~~~~~~:::::",
								"::::~~~~~-----~..         .,,...,-~;-----~~~~~::::",
								":::~~~~-------~..         ..,,..,-~!------~~~~~:::",
								"::~~~~-----,,,~..   .,....,-~-,,,-~~,------~~~~~::",
								":~~~~-----,,,,,-..       ..,-..,--:-,,,-----~~~~~:",
								":~~~-----,,,,,,:,.     .,.,-,.,,-~;,,,,,,----~~~~:",
								"~~~----,,,,,,..,~,.      .....,-~:,..,,,,,----~~~~",
								"~~~---,,,,,.....:~,.       ...,~:;....,,,,,----~~~",
								"~~---,,,,,......-~~,      ...,~:;;......,,,,---~~~",
								"~---,,,,,.......,,~~-. ...,,,-:::!.......,,,,---~~",
								"~---,,,,........~..-~~---~~~~::::;........,,,----~",
								"---,,,......... -...,-~~~~~~:~~~~;.........,,,---~",
								"--,,,,........ :.. ....,--~~~~~~~;*~.......,,,,--~",
								"-,,,,.......  ,* .  ..   .,-~~~~:~:#-.......,,,---",
								"-,,,......   .$,    ...   ,-----~-~$#~.......,,,--",
								",,,.......  ~$$.     ... .,--,,,,,-=##$.......,,--",
								",,,...... -*$$$.   . ....,,,,,-.,,-=####*.....,,,-",
								",,.....:;$$$##$,       ....,,,...,-$######!;...,,-",
								",,..~;$$$$$$$$$*         ...- ....-$########$=::,,",
								"-~$$#$$$#$$$$$$=        ...,  ...,~$########$##$#$",
								"##$#$###$#$#$$$=        ..,   ....-$$####$$##$#$$#",
								"##$#$$$#####$$$=    *!=$$$$$**....:$$$$$######$$##",
								"#$$$$$$$#$$$#$$$..-*$$$$$$#$##=--.=$#$$$##$$##$##$",
								"$$$$$#$$$$$$$$$:,.,$$$$$$$###:-,-=$$##$#####$$###",
								"$$$$$$$$$$$$$$$,   .$##$$##$:~. .=$$$$#$######$$$",
								"$$$$$$#$$$$$$$$$,    -$$$$#$;~.  ,$$##$###$$#$##$$",
								"$#$$$$$$#$$$$$$,     ~$$##*:,   ,$$####$####$$###",
								"$$$$$#$$#$$$$#$~     ~$###;-.   ,$$$##$#$#$#$$$$$",
								"$$$$#$$$#$$$$$$:     *$#$$=-   .;$$$$##$$####$#$$",
								"$$$##$#$$$#$$#$!.   .$##$$=- ...$$$##$$$$$####$$$",
								"$$$#####$=$$$$$$.   *=####$~. ..$##$#$$#$#$#$#$#$",
								"#$$$$$$$$$$$$$#$$,   *$#$$$$:. .-$$#$$#$$###$##$$#",
								"$$$$$$$#$$$$$$$$,  .*$#$$$$*,  ~=$##$$$$#$$$$#$#$"
						     
				    };

			        
				    for (int i = 0; i < JopPhoto.length; i++) {
					      // 초 간 중지한다
					      Thread.sleep(100);
					      // 메세지를 출력한다
					      System.out.println(JopPhoto[i]);
					}
				    System.out.println(" ");
					

					
					System.out.println("내 서류지수와 은행 커트라인과 비교합니다.");
					System.out.println(" ");
					
					if(후니.후니_서류지수>=까까오뱅크인사팀.서류지수_커트라인) {
						
				        //패스브금 (로딩브금과 동일)
					   	LoadingBgm passBgm01 = new LoadingBgm();
				          
				        try {
				             passBgm01.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						
						System.out.println("===========================================================");
						System.out.println(" ");
						
						String PASS[] = { // 타이핑 쓰레드 - 익명 클래스
					            "______   ___   _____  _____ ",    
					            "| ___ \\ / _ \\ /  ___|/  ___|",
					            "| |_/ // /_\\ \\\\ `--. \\ `--. ",
					            "|  __/ |  _  | `--. \\ `--. \\",
					            "| |    | | | |/\\__/ //\\__/ /",
					            "\\_|    \\_| |_/\\____/ \\____/"
					    };

				        
					    for (int i = 0; i < PASS.length; i++) {
						      // 초 간 중지한다
						      Thread.sleep(450);
						      // 메세지를 출력한다
						      System.out.println(PASS[i]);
						} 
						System.out.println(" ");
						System.out.println("서류전형에 합격하였습니다!!");
						System.out.println("필기전형을 준비하세요!!");
						System.out.println("===========================================================");
						
						break ;
						
					}else {

						System.out.println("귀하는 아쉽게도 금번 신규직원 채용 서류심사에서 불합격하였습니다.");
						System.out.println("게임이 종료되었습니다."); 
						
					
						
						String GameEnd[] = { // 타이핑 쓰레드 - 익명 클래스
								
								
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@=;:;;;;:=#@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@#-*@@@@@@@@@@@$-*@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@*;@@@@@@@@@@@@@@@@@=;#@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@!!@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@@@@",
		"@@@@@@@@@@#;@@@@@@@@@@@@@@@@@@@@@@@@@=*@@@@@@@@@@@",
		"@@@@@@@@@$$@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@@",
		"@@@@@@@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
		"@@@@@@@*#@@@@@~~~~~~$@@@@@@@@@@@*~!@@@@@@;@@@@@@@@",
		"@@@@@@$#@@@@@@      =@@@@@@@@@@@: ~@@@@@@@;@@@@@@@",
		"@@@@@@=@@@@@@@  !@@@@@;** ;@@#.,: ~@@@@@@@@=@@@@@@",
		"@@@@@~@@@@@@@@      ##     *@     ~@@@@@@@@=@@@@@@",
		"@@@@*@@@@@@@@@      ##  @. != .@- ~@@@@@@@@@~@@@@@",
		"@@@@!@@@@@@@@@  !@@@@#  @, !! ~@: ~@@@@@@@@@@#@@@@",
		"@@@=#@@@@@@@@@      ;#  @, !@  $  ~@@@@@@@@@@;@@@@",
		"@@@!@@@@@@@@@@      ;#  @, *@-  ; ~@@@@@@@@@@=@@@@",
		"@@@!@@@@@@@@@@@@@@@@@@@@@@@@@@#@@@@@@@@@@@@@@@=@@@",
		"@@#$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
		"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
		"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#@@@@@@$-  -=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#$@@@@#      =@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*@@@",
		"@@@;@@@@, .@@ ;$@@-..~@@~~@,.@=.-@@@~.,$@@@@@#$@@@",
		"@@@!@@@@  ;@!!!*@     ~@         !@  .  :@@@@*@@@@",
		"@@@$#@@@  !@   ,@!:#!  @  ;=  @- -*  *:  @@@@;@@@@",
		"@@@@!@@@. -@=! ,@~  ;  @  *#  @~ -!  ,,,,@@@@@@@@@",
		"@@@@$@@@;  ..  ,@  @,  @  *#  @~ -$  #~ .@@@-@@@@@",
		"@@@@@-@@@-    -@@   -  @  *#  @~ -@:   .@@@*@@@@@@",
		"@@@@@@!@@@@##@@@@@#@@@@@@@@@@@@@@@@@@#@@@@#=@@@@@@",
		"@@@@@@$=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@@@@@",
		"@@@@@@@*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@",
		"@@@@@@@@=$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
		"@@@@@@@@@$!@@@@@@@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@",
		"@@@@@@@@@@@;@@@@@@@@@@@@@@@@@@@@@@@@@:$@@@@@@@@@@@",
		"@@@@@@@@@@@@$:@@@@@@@@@@@@@@@@@@@@@$;@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@=!$@@@@@@@@@@@@@@@#*;@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@#!!*#@@@@@@@#=!!=@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@#$=***=$#@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
								                                                       
					    };

				        
					    for (int i = 0; i < GameEnd.length; i++) {
						      // 초 간 중지한다
						      Thread.sleep(250);
						      // 메세지를 출력한다
						      System.out.println(GameEnd[i]);
						} 
					   	    
						
		//게임이 종료되어야      
						System.exit(0);
						

						
					}
					
					
					
				}else if(Apply2 == 2) {

					String GameEnd[] = { // 타이핑 쓰레드 - 익명 클래스

		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@=;:;;;;:=#@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@#-*@@@@@@@@@@@$-*@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@*;@@@@@@@@@@@@@@@@@=;#@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@!!@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@@@@",
		"@@@@@@@@@@#;@@@@@@@@@@@@@@@@@@@@@@@@@=*@@@@@@@@@@@",
		"@@@@@@@@@$$@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@@",
		"@@@@@@@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
		"@@@@@@@*#@@@@@~~~~~~$@@@@@@@@@@@*~!@@@@@@;@@@@@@@@",
		"@@@@@@$#@@@@@@      =@@@@@@@@@@@: ~@@@@@@@;@@@@@@@",
		"@@@@@@=@@@@@@@  !@@@@@;** ;@@#.,: ~@@@@@@@@=@@@@@@",
		"@@@@@~@@@@@@@@      ##     *@     ~@@@@@@@@=@@@@@@",
		"@@@@*@@@@@@@@@      ##  @. != .@- ~@@@@@@@@@~@@@@@",
		"@@@@!@@@@@@@@@  !@@@@#  @, !! ~@: ~@@@@@@@@@@#@@@@",
		"@@@=#@@@@@@@@@      ;#  @, !@  $  ~@@@@@@@@@@;@@@@",
		"@@@!@@@@@@@@@@      ;#  @, *@-  ; ~@@@@@@@@@@=@@@@",
		"@@@!@@@@@@@@@@@@@@@@@@@@@@@@@@#@@@@@@@@@@@@@@@=@@@",
		"@@#$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
		"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
		"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#@@@@@@$-  -=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#$@@@@#      =@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*@@@",
		"@@@;@@@@, .@@ ;$@@-..~@@~~@,.@=.-@@@~.,$@@@@@#$@@@",
		"@@@!@@@@  ;@!!!*@     ~@         !@  .  :@@@@*@@@@",
		"@@@$#@@@  !@   ,@!:#!  @  ;=  @- -*  *:  @@@@;@@@@",
		"@@@@!@@@. -@=! ,@~  ;  @  *#  @~ -!  ,,,,@@@@@@@@@",
		"@@@@$@@@;  ..  ,@  @,  @  *#  @~ -$  #~ .@@@-@@@@@",
		"@@@@@-@@@-    -@@   -  @  *#  @~ -@:   .@@@*@@@@@@",
		"@@@@@@!@@@@##@@@@@#@@@@@@@@@@@@@@@@@@#@@@@#=@@@@@@",
		"@@@@@@$=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@@@@@",
		"@@@@@@@*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@",
		"@@@@@@@@=$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
		"@@@@@@@@@$!@@@@@@@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@",
		"@@@@@@@@@@@;@@@@@@@@@@@@@@@@@@@@@@@@@:$@@@@@@@@@@@",
		"@@@@@@@@@@@@$:@@@@@@@@@@@@@@@@@@@@@$;@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@=!$@@@@@@@@@@@@@@@#*;@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@#!!*#@@@@@@@#=!!=@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@#$=***=$#@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
							                                                       
				    };

			        
				    for (int i = 0; i < GameEnd.length; i++) {
					      // 초 간 중지한다
					      Thread.sleep(250);
					      // 메세지를 출력한다
					      System.out.println(GameEnd[i]);
					} 
					
					System.out.println("취준을 포기했습니다.");
					System.out.println("게임이 종료되었습니다.");
					
		//게임이 종료되어야
					
					System.exit(0);
					
					break;
					
									
				}else {
					System.out.println("다시 입력하세요.");
					 
					continue;
				}
				Apply++;
				}
				
				System.out.println("11월입니다.");
				System.out.println("11월 마지막 주에 있는 필기전형을 준비합시다.");
				
				
				int NOV = 1; // 11월 세 턴! 후 필기 전형!!
				
				while (NOV <= 3) {
					System.out.println(" ");
					System.out.println("1. 활동"); // 1번 활동, 2번 상태확인, 3번 취준포기
					System.out.println("2. 상태확인");
					System.out.println("3. 11월 취준포기");
					System.out.println(" ");
							
					int 메인메뉴선택창 = scan.nextInt();
					
					if ( 메인메뉴선택창 == 1) {

						if (true) {
							System.out.println(" ");
							System.out.println("4학년 2학기 11월 : " + NOV + "/3" + "번째 턴입니다.");
							System.out.println("어디에 가시겠습니까?");
							System.out.println("1. 학교에 간다");
							System.out.println("2. 동네에 간다");
							System.out.println("3. 집에 간다");
							System.out.println("4. 뒤로가기");
							System.out.println("<< 학교, 동네, 집 각각 일정확률로 이벤트가 튀어나옵니다. >>");

							System.out.println(" ");
							
							int 일학기선택창 = scan.nextInt();

						    if (일학기선택창 == 1) {
								System.out.println(" ");
						    	System.out.println("학교에 왔습니다.");
								System.out.println("학교에서 무엇을 하시겠습니까?");
								System.out.println("1. 학점관리");
								System.out.println("2. 금융동아리활동");
								System.out.println("3. 취업지원본부 컨설팅");
								System.out.println("4. 면접스터디");
								System.out.println("5. 뒤로가기");
								System.out.println(" ");

								int 학교선택창 = scan.nextInt();
								
								if(학교선택창 ==1) {
							        System.out.println("후.. 전공공부 열심히 해야지!!");
									System.out.println("학교에서 열심히 학점관리를 합니다.");
									후니.학점관리();
									
									System.out.println(" ");
									
									SomethingGirl SomethingGirl = new SomethingGirl();

									SomethingGirl.SomethingGirlCome();
									SomethingGirl.join(); 
									System.out.println(" ");
									
									후니.상태알림();
									
								}else if(학교선택창 == 2) {
									System.out.println("동아리에서 선배들에게 취업꿀팁을 얻습니다.");
									후니.금융동아리모임_참석();
									System.out.println(" ");
									
									CircleBroThread CircleBro = new CircleBroThread();

									CircleBro.CircleBroCome();
									CircleBro.join(); 
									System.out.println(" ");
									후니.상태알림();
									
								}else if(학교선택창 == 3) {
									System.out.println("취업지원본부에서 컨설팅을 받습니다.");
									후니.취업지원본부_컨설팅();
									후니.상태알림();
									
								}else if(학교선택창 == 4) {
									System.out.println("면접스터디를 통해 면접역량을 강화시킵니다.");
									후니.면접스터디_참석();
									
									InterviewStudyMember Studymember= new InterviewStudyMember();

									Studymember.GoFeedback();
									Studymember.join(); 
									
									후니.상태알림();
									
								}else if(학교선택창 == 5) {
									continue;
							
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						 
								}
								
								// (학교) 취업스터디원 먼저 합격해서 쫑파티 열 확률 10%

//								int 멘토링횟수;
//								멘토링횟수 = 0;
//								while(멘토링횟수<1)
								
								Character InterviewFriend = new Character(); 
								InterviewFriend.관계 = "취업스터디원";
								
									if(InterviewFriend.SuccessFirst()) {
										EventBgm EventBgm = new EventBgm();
										
								        try {
								        	EventBgm.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										
										System.out.println("학교 랜덤 이벤트 <취업스터디원이 먼저 합격했습니다.>");
										System.out.println("축하파티에 참여하시겠습니까?");
										System.out.println("1. 참여");
										System.out.println("2. 불참");
			
										//객체.객체함수다. 객체의 기능!	
										
										int goparty = scan.nextInt();
										
										if(goparty == 1) {
											System.out.println("축하파티에 참여해 많은 조언들을 얻습니다.");	
											InterviewFriend.후니의_서류지수_증가(5);
											InterviewFriend.후니의_필기지수_증가(5);
											InterviewFriend.후니의_면접지수_증가(5);
											InterviewFriend.후니의_체력지수_감소(10);
											InterviewFriend.후니의_자존감지수_감소(5);
											
											후니.상태알림();
											
										}else if(goparty == 2) {
											System.out.println("축하파티에 불참하고 체력을 회복합니다.");
											InterviewFriend.후니의_체력지수_증가(15);
											InterviewFriend.후니의_자존감지수_감소(5);
											InterviewFriend.후니의_스트레스지수_증가(5);
											
											후니.상태알림();					
										}else {
											continue; 	
										}
										
									}else {
										System.out.println("랜덤이벤트가 없습니다.");
									}
								
								
						    }else if(일학기선택창 == 2) {
								System.out.println(" ");
						    	System.out.println("동네에 왔습니다.");
								System.out.println("동네에서 무엇을 하시겠습니까?");
								System.out.println("1. 헬스");
								System.out.println("2. 치맥");
								System.out.println("3. 뒤로가기");
								System.out.println(" ");
								
								int 동네선택창 = scan.nextInt();
								
								if(동네선택창 ==1) {
							        
								    
								    System.out.println(" ");
									System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
									System.out.println(" ");
									후니.헬스장();
									후니.상태알림();
									
								}else if(동네선택창 == 2) {
									    System.out.println(" ");
										System.out.println("치맥으로 스트레스를 풉니다.");
										후니.치맥();
										후니.상태알림();
									
								}else if(동네선택창 == 3) {
									continue;
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						 
								}
								
								// (동네) 고등학교 친구에게 안부전화 올 확률 10% 
								
								Character HighschoolFriend = new Character(); 
								HighschoolFriend.관계 = "고등학교 친구";
								
								if(HighschoolFriend.HiCall()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									
									System.out.println("동네 랜덤 이벤트 <고등학교 친구의 안부전화>");
									System.out.println("잊고 있던 고등학교 친구에게 전화가 옵니다.");
									System.out.println("1. 전화를 받는다. ");
									System.out.println("2. 전화를 받지 않는다. ");

									//객체.객체함수다. 객체의 기능!	
									
									int 안부전화선택창 = scan.nextInt();
									
									if(안부전화선택창 == 1) {
										System.out.println("[고등학교 친구] 어 후니야! 아까 동네에서 너 본 것 같아서 전화했어!");	
										System.out.println("[고등학교 친구] 잘 지내고 있었지?");	
										System.out.println("[고등학교 친구] 전역한 이후로 한 번도 못봤는데! 보고 싶다야!");
										System.out.println("[후니] 말할 틈도 안주네!");
										System.out.println("[후니] 나도 보고 싶다야!");
										
										HighschoolFriend.후니의_체력지수_증가(10);
										HighschoolFriend.후니의_자존감지수_증가(10);
										HighschoolFriend.후니의_스트레스지수_감소(10);
										
										후니.상태알림();
										
									}else if(안부전화선택창 == 2) {
										System.out.println("[후니] 아 무슨 일이지.. 요즘 사람들 만나기 싫은데..");
										HighschoolFriend.후니의_자존감지수_감소(10);
										HighschoolFriend.후니의_스트레스지수_증가(10);
										
										후니.상태알림();					
									}else {
										System.out.println("다시 입력하세요."); 
										continue; 	
									}
									
								}else {
									System.out.println("랜덤이벤트가 없습니다.");
								}
								
						    }else if(일학기선택창 == 3) {
								System.out.println(" ");
						    	System.out.println("집에 왔습니다.");
								System.out.println("집에서 무엇을 하시겠습니까?");
								System.out.println("1. 부모님과 식사");
								System.out.println("2. 일기쓰기");
								System.out.println("3. 낮잠자기");
								System.out.println("4. 뒤로가기");
								System.out.println(" ");

								int 집선택창 = scan.nextInt();
								
								if(집선택창 ==1) {
							        String parents[] = {
											"부모님과 식사하며 취업 관련 이야기를 합니다.",
											"[부모님] 취업준비는 좀 잘 되고 있니?",
											"[후니] 나름대로 열심히 하고 있어요 ㅎㅎ",
											"[부모님] 그래그래 넌 혼자 알아서 잘 하리라 믿는다 ㅎㅎ ",
											"[후니] (후.. 이렇게나 날 믿어주시는데 잘 안되네 ㅠㅠ) ",
											"[부모님] 밥 많이 먹고 힘내라 아들",
											" "
									};
									
									for (int i = 0; i <parents.length; i++) {
										Thread.sleep(500);//0.5초마다 한 문장씩 출력
										System.out.println(parents[i]);
									}
									System.out.println(" ");

									후니.부모님과식사();
									System.out.println(" ");
									
									RelativeClass relative = new RelativeClass();
									relative.RelativeCome();
									relative.join(); 
									
									후니.상태알림();
									
								}else if(집선택창 == 2) {
								    System.out.println(" ");
								    System.out.println("일기를 쓰며 하루를 점검하고 스스로를 보살핍니다.");
									후니.일기();
									후니.상태알림();
									
						    	}else if(집선택창 == 3) {
										    
								    		System.out.println("낮잠을 통해 부족한 체력을 충전합니다.");
								    		후니.낮잠();
								    		후니.상태알림();
						    		
						    	}else if(집선택창 == 4) {
									continue;
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						
								}
								
								//(집) 동생의 병간호를 해야합니다.
								Character Bro = new Character(); 
								Bro.관계 = "남동생";
								
								if(Bro.gohospital()) {
									
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
							        
									System.out.println("집 랜덤 이벤트 <동생의 입원>");
									System.out.println("동생이 입원했습니다.");
									System.out.println("병간호를 하시겠습니까?");
									System.out.println("1. 병간호를 한다.");
									System.out.println("2. 하지 않는다.");

									//객체.객체함수다. 객체의 기능!	
									
									int 병간호선택창 = scan.nextInt();
									
									if(병간호선택창 == 1) {
										System.out.println("[후니] (후.. 취준에 집안일까지..)");	
										System.out.println("[후니] 조심 좀 하지 그랬어 ㅠㅠ");	
										Bro.후니의_체력지수_감소(5);
										Bro.후니의_스트레스지수_증가(5);
										후니.상태알림();
										
									}else if(병간호선택창 == 2) {
										System.out.println("[후니] 너무 바빠.. 하반기 준비해야해..ㅠㅠ");
										Bro.후니의_스트레스지수_증가(5);
										Bro.후니의_자존감지수_감소(5);
										후니.상태알림();					
									}else {
										System.out.println("다시 입력하세요.");
										continue; 	
									}
									
								}else {
									System.out.println("랜덤이벤트가 없습니다.");
								}
								
						    }else if(일학기선택창 == 4) {
						    	continue;
						    }else {
								System.out.println("다시 입력하세요.");
						    	continue;
						    }
						    
						}
						
						NOV ++;	
						
					}else if(메인메뉴선택창 == 2){
					
						후니.상태알림();
						
					}else if(메인메뉴선택창 == 3) {
							
						System.out.println("11월 취준을 포기하시겠습니까?");
						System.out.println("1. 네");
						System.out.println("2. 아니오");
						
						int 취준포기선택창 = scan.nextInt();
						
						if(취준포기선택창 ==1) {
							System.out.println("11월 취업준비를 포기했습니다.");					

							break;

						}else if(취준포기선택창 == 2) {
							continue;
						}else {
							System.out.println("다시 입력하세요."); // 취준을 포기하시겟습니까?가 뜨도록. 맨처음 메인메뉴창이 아니라.
							continue; 						   // 이 if문을 while문 안에 넣게 되면 취준포기선택창 == 2가 1.활동 2. 상태확인 3. 취준포기가 나와야
						}
						
					}else {
						System.out.println("다시 입력하세요.");
						continue;
					}

				}
				
				System.out.println("하반기채용 필기 시험 주간입니다.");
				System.out.println("필기 시험을 보러 가시겠습니까?");
				
				int WriteTest;
				WriteTest = 0;
				
				while(WriteTest<1) {
					System.out.println("1번 : 응시한다");
					System.out.println("2번 : 늦잠잔다");
						
				int WriteTest2 = scan.nextInt();
				
				if(WriteTest2 == 1) {
					
					System.out.println(" ");
					String JopPhoto[] = { // 타이핑 쓰레드 - 익명 클래스

								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!*==$====!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!=@#@@@##@###**!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!$@@#@@@@@@#$==$$=!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!#@@@@@@@@@@#########!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!$@@@@@@@@##$####$$$###*!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!$@@@@@@@@#######$#$$$#@#!!!!!!!!!!!!!",
								"!!!!!!!!!!!!*@@@@@@@@#####@##$$#$###@$!!!!!!!!!!!!",
								"!!!!!!!!!!!!#@@@@#@#@@##$####$#$$###@@!!!!!!!!!!!!",
								"!!!!!!!!;!;!@@@@#####@##$$$$#$##$$#$#@$!!!!!!!!!!!",
								"!!!!!!!;;;;@#@########$$*$$$$=###$###@@!!!!!!!!!!!",
								"!!!!!!;;;;!@########$$==$$$$$####$$###@!!!!!!!!!!!",
								"!!!;;;;;;;!####$$$$$=====$###$########@*!!!!!!!!!!",
								";!;;;;;;;;*###$$$=*====$#$############@*;!!!!!!!!!",
								";;;;;;;;;;*###$===*=$$==###############*;;;;!!!!!!",
								";;;;;;;;;;=####===*=#$*!$$$###########@!;;;;;!!!!!",
								";;;;;;;;;;*@##=**!;:*=*::**;*$#######@#!;;;;;;;!!!",
								";;;;;;;;;;!@#!!-:-,,-..   ..~!=$#####@@;;;;;;;;;!!",
								";;;;;;;;;;;##:..----,,.    .-~::;**####;;;;;;;;;;;",
								";;;;;;;;;;;#$:..., ,~      ..=..;:;=#@$;;;;;;;;;;;",
								";;;;;;;;:::$#;.~.    --   .   ..,~:!#@=;;;;;;;;;;;",
								";;;;;;;:::-,:!~...-~*-, .:..-#;~--;*$=;;;;;;;;;;;;",
								";;;;;::::;.. ;~   ..~,.:.,!.,!,-,,-:*~:;::;;;;;;;;",
								";;;;::::::   ~.      ..   !  .....-:!~;;:::;;;;;;;",
								";;;:::::::  -,..      :,  :,    ..-:!~~::::::;;;;;",
								";;;:::::::-  ,...     .   --    .,-:;:::::::::;;;;",
								";:::::::~~:  ,. ~.  , .   -~...-.,-:;*:~~::::::;;;",
								";::::::~~~~  ,,           ,-,  ..,~:!:;~~~::::::;;",
								"::::::~~~~~~ .,.       ...--~   .,~::~~~~~~~:::::;",
								":::::~~~~~~-~ -.        .-~--. ..-~;~~-~~~~~~:::::",
								"::::~~~~~-----~..         .,,...,-~;-----~~~~~::::",
								":::~~~~-------~..         ..,,..,-~!------~~~~~:::",
								"::~~~~-----,,,~..   .,....,-~-,,,-~~,------~~~~~::",
								":~~~~-----,,,,,-..       ..,-..,--:-,,,-----~~~~~:",
								":~~~-----,,,,,,:,.     .,.,-,.,,-~;,,,,,,----~~~~:",
								"~~~----,,,,,,..,~,.      .....,-~:,..,,,,,----~~~~",
								"~~~---,,,,,.....:~,.       ...,~:;....,,,,,----~~~",
								"~~---,,,,,......-~~,      ...,~:;;......,,,,---~~~",
								"~---,,,,,.......,,~~-. ...,,,-:::!.......,,,,---~~",
								"~---,,,,........~..-~~---~~~~::::;........,,,----~",
								"---,,,......... -...,-~~~~~~:~~~~;.........,,,---~",
								"--,,,,........ :.. ....,--~~~~~~~;*~.......,,,,--~",
								"-,,,,.......  ,* .  ..   .,-~~~~:~:#-.......,,,---",
								"-,,,......   .$,    ...   ,-----~-~$#~.......,,,--",
								",,,.......  ~$$.     ... .,--,,,,,-=##$.......,,--",
								",,,...... -*$$$.   . ....,,,,,-.,,-=####*.....,,,-",
								",,.....:;$$$##$,       ....,,,...,-$######!;...,,-",
								",,..~;$$$$$$$$$*         ...- ....-$########$=::,,",
								"-~$$#$$$#$$$$$$=        ...,  ...,~$########$##$#$",
								"##$#$###$#$#$$$=        ..,   ....-$$####$$##$#$$#",
								"##$#$$$#####$$$=    *!=$$$$$**....:$$$$$######$$##",
								"#$$$$$$$#$$$#$$$..-*$$$$$$#$##=--.=$#$$$##$$##$##$",
								"$$$$$#$$$$$$$$$:,.,$$$$$$$###:-,-=$$##$#####$$###",
								"$$$$$$$$$$$$$$$,   .$##$$##$:~. .=$$$$#$######$$$",
								"$$$$$$#$$$$$$$$$,    -$$$$#$;~.  ,$$##$###$$#$##$$",
								"$#$$$$$$#$$$$$$,     ~$$##*:,   ,$$####$####$$###",
								"$$$$$#$$#$$$$#$~     ~$###;-.   ,$$$##$#$#$#$$$$$",
								"$$$$#$$$#$$$$$$:     *$#$$=-   .;$$$$##$$####$#$$",
								"$$$##$#$$$#$$#$!.   .$##$$=- ...$$$##$$$$$####$$$",
								"$$$#####$=$$$$$$.   *=####$~. ..$##$#$$#$#$#$#$#$",
								"#$$$$$$$$$$$$$#$$,   *$#$$$$:. .-$$#$$#$$###$##$$#",
								"$$$$$$$#$$$$$$$$,  .*$#$$$$*,  ~=$##$$$$#$$$$#$#$"
						     
				    };

			        
				    for (int i = 0; i < JopPhoto.length; i++) {
					      // 초 간 중지한다
					      Thread.sleep(100);
					      // 메세지를 출력한다
					      System.out.println(JopPhoto[i]);
					}
				    System.out.println(" ");
					
				    System.out.println("내 필기지수와 은행 커트라인과 비교합니다.");
				    
					if(후니.후니_필기지수>=까까오뱅크인사팀.필기지수_커트라인) {
						
				        //패스브금 (로딩브금과 동일)
					   	LoadingBgm passBgm02 = new LoadingBgm();
				          
				        try {
				             passBgm02.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }

						
						System.out.println("===========================================================");
						System.out.println(" ");
						
						String PASS[] = { // 타이핑 쓰레드 - 익명 클래스
					            "______   ___   _____  _____ ",    
					            "| ___ \\ / _ \\ /  ___|/  ___|",
					            "| |_/ // /_\\ \\\\ `--. \\ `--. ",
					            "|  __/ |  _  | `--. \\ `--. \\",
					            "| |    | | | |/\\__/ //\\__/ /",
					            "\\_|    \\_| |_/\\____/ \\____/"
					    };

				        
					    for (int i = 0; i < PASS.length; i++) {
						      // 초 간 중지한다
						      Thread.sleep(450);
						      // 메세지를 출력한다
						      System.out.println(PASS[i]);
						} 
						System.out.println(" ");
						System.out.println("필기전형에 합격하였습니다!!");
						System.out.println("면접전형을 준비하세요!!");
						System.out.println("===========================================================");
						
						break;
						
					}else {
						
						System.out.println("귀하께서는 아쉽게도 선발 명단에 없음을 알려드립니다. 감사합니다.");	
						System.out.println("게임이 종료되었습니다.");
						
						
						String GameEnd[] = { // 타이핑 쓰레드 - 익명 클래스

		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@=;:;;;;:=#@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@#-*@@@@@@@@@@@$-*@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@*;@@@@@@@@@@@@@@@@@=;#@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@!!@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@@@@",
		"@@@@@@@@@@#;@@@@@@@@@@@@@@@@@@@@@@@@@=*@@@@@@@@@@@",
		"@@@@@@@@@$$@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@@",
		"@@@@@@@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
		"@@@@@@@*#@@@@@~~~~~~$@@@@@@@@@@@*~!@@@@@@;@@@@@@@@",
		"@@@@@@$#@@@@@@      =@@@@@@@@@@@: ~@@@@@@@;@@@@@@@",
		"@@@@@@=@@@@@@@  !@@@@@;** ;@@#.,: ~@@@@@@@@=@@@@@@",
		"@@@@@~@@@@@@@@      ##     *@     ~@@@@@@@@=@@@@@@",
		"@@@@*@@@@@@@@@      ##  @. != .@- ~@@@@@@@@@~@@@@@",
		"@@@@!@@@@@@@@@  !@@@@#  @, !! ~@: ~@@@@@@@@@@#@@@@",
		"@@@=#@@@@@@@@@      ;#  @, !@  $  ~@@@@@@@@@@;@@@@",
		"@@@!@@@@@@@@@@      ;#  @, *@-  ; ~@@@@@@@@@@=@@@@",
		"@@@!@@@@@@@@@@@@@@@@@@@@@@@@@@#@@@@@@@@@@@@@@@=@@@",
		"@@#$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
		"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
		"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#@@@@@@$-  -=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#$@@@@#      =@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*@@@",
		"@@@;@@@@, .@@ ;$@@-..~@@~~@,.@=.-@@@~.,$@@@@@#$@@@",
		"@@@!@@@@  ;@!!!*@     ~@         !@  .  :@@@@*@@@@",
		"@@@$#@@@  !@   ,@!:#!  @  ;=  @- -*  *:  @@@@;@@@@",
		"@@@@!@@@. -@=! ,@~  ;  @  *#  @~ -!  ,,,,@@@@@@@@@",
		"@@@@$@@@;  ..  ,@  @,  @  *#  @~ -$  #~ .@@@-@@@@@",
		"@@@@@-@@@-    -@@   -  @  *#  @~ -@:   .@@@*@@@@@@",
		"@@@@@@!@@@@##@@@@@#@@@@@@@@@@@@@@@@@@#@@@@#=@@@@@@",
		"@@@@@@$=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@@@@@",
		"@@@@@@@*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@",
		"@@@@@@@@=$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
		"@@@@@@@@@$!@@@@@@@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@",
		"@@@@@@@@@@@;@@@@@@@@@@@@@@@@@@@@@@@@@:$@@@@@@@@@@@",
		"@@@@@@@@@@@@$:@@@@@@@@@@@@@@@@@@@@@$;@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@=!$@@@@@@@@@@@@@@@#*;@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@#!!*#@@@@@@@#=!!=@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@#$=***=$#@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
								                                                       
					    };

				        
					    for (int i = 0; i < GameEnd.length; i++) {
						      // 초 간 중지한다
						      Thread.sleep(250);
						      // 메세지를 출력한다
						      System.out.println(GameEnd[i]);
						} 
						

						
						System.exit(0);
					}
		//게임이 종료되어야 한다.			
				}else if(WriteTest2 == 2) {

					String GameEnd[] = { // 타이핑 쓰레드 - 익명 클래스

		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@=;:;;;;:=#@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@#-*@@@@@@@@@@@$-*@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@*;@@@@@@@@@@@@@@@@@=;#@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@!!@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@@@@",
		"@@@@@@@@@@#;@@@@@@@@@@@@@@@@@@@@@@@@@=*@@@@@@@@@@@",
		"@@@@@@@@@$$@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@@",
		"@@@@@@@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
		"@@@@@@@*#@@@@@~~~~~~$@@@@@@@@@@@*~!@@@@@@;@@@@@@@@",
		"@@@@@@$#@@@@@@      =@@@@@@@@@@@: ~@@@@@@@;@@@@@@@",
		"@@@@@@=@@@@@@@  !@@@@@;** ;@@#.,: ~@@@@@@@@=@@@@@@",
		"@@@@@~@@@@@@@@      ##     *@     ~@@@@@@@@=@@@@@@",
		"@@@@*@@@@@@@@@      ##  @. != .@- ~@@@@@@@@@~@@@@@",
		"@@@@!@@@@@@@@@  !@@@@#  @, !! ~@: ~@@@@@@@@@@#@@@@",
		"@@@=#@@@@@@@@@      ;#  @, !@  $  ~@@@@@@@@@@;@@@@",
		"@@@!@@@@@@@@@@      ;#  @, *@-  ; ~@@@@@@@@@@=@@@@",
		"@@@!@@@@@@@@@@@@@@@@@@@@@@@@@@#@@@@@@@@@@@@@@@=@@@",
		"@@#$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
		"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
		"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#@@@@@@$-  -=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#$@@@@#      =@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*@@@",
		"@@@;@@@@, .@@ ;$@@-..~@@~~@,.@=.-@@@~.,$@@@@@#$@@@",
		"@@@!@@@@  ;@!!!*@     ~@         !@  .  :@@@@*@@@@",
		"@@@$#@@@  !@   ,@!:#!  @  ;=  @- -*  *:  @@@@;@@@@",
		"@@@@!@@@. -@=! ,@~  ;  @  *#  @~ -!  ,,,,@@@@@@@@@",
		"@@@@$@@@;  ..  ,@  @,  @  *#  @~ -$  #~ .@@@-@@@@@",
		"@@@@@-@@@-    -@@   -  @  *#  @~ -@:   .@@@*@@@@@@",
		"@@@@@@!@@@@##@@@@@#@@@@@@@@@@@@@@@@@@#@@@@#=@@@@@@",
		"@@@@@@$=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@@@@@",
		"@@@@@@@*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@",
		"@@@@@@@@=$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
		"@@@@@@@@@$!@@@@@@@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@",
		"@@@@@@@@@@@;@@@@@@@@@@@@@@@@@@@@@@@@@:$@@@@@@@@@@@",
		"@@@@@@@@@@@@$:@@@@@@@@@@@@@@@@@@@@@$;@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@=!$@@@@@@@@@@@@@@@#*;@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@#!!*#@@@@@@@#=!!=@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@#$=***=$#@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
							                                                       
				    };
			        
				    for (int i = 0; i < GameEnd.length; i++) {
					      // 초 간 중지한다
					      Thread.sleep(250);
					      // 메세지를 출력한다
					      System.out.println(GameEnd[i]);
					} 
					
				    System.out.println("취업준비를 포기했습니다.");
					System.out.println("게임이 종료되었습니다.");
					
					System.exit(0);
		//게임이 종료되어야 한다.			
					break;
					
									
				}else {
					System.out.println("다시 입력하세요.");
					 
					continue;
				}
				WriteTest++;
				}
				
				System.out.println("12월 마지막 주에 있는 면접전형을 준비합시다.");
				
				int DEC = 1; // 12월 세 턴! 후 면접 전형!!
				
				while (DEC <= 3) {
					System.out.println("1. 활동"); // 1번 활동, 2번 상태확인, 3번 취준포기
					System.out.println("2. 상태확인");
					System.out.println("3. 취준포기");
							
					int 메인메뉴선택창 = scan.nextInt();
					
					if ( 메인메뉴선택창 == 1) {

						if (true) {
							System.out.println(" ");
							System.out.println("4학년 2학기 12월 : " + DEC + "/3" + "번째 턴입니다.");
							System.out.println("어디에 가시겠습니까?");
							System.out.println("1. 학교에 간다");
							System.out.println("2. 동네에 간다");
							System.out.println("3. 집에 간다");
							System.out.println("4. 뒤로가기");
							System.out.println("<< 학교, 동네, 집 각각 일정확률로 이벤트가 튀어나옵니다. >>");
							System.out.println(" ");
							
							int 일학기선택창 = scan.nextInt();

						    if (일학기선택창 == 1) {
								System.out.println(" ");
								System.out.println("학교에 왔습니다.");
								System.out.println("학교에서 무엇을 하시겠습니까?");
								System.out.println("1. 학점관리");
								System.out.println("2. 금융동아리활동");
								System.out.println("3. 취업지원본부 컨설팅");
								System.out.println("4. 면접스터디");
								System.out.println("5. 뒤로가기");
								System.out.println(" ");

								int 학교선택창 = scan.nextInt();
								
								if(학교선택창 ==1) {
							        System.out.println("후.. 전공공부 열심히 해야지!!");
									System.out.println("학교에서 열심히 학점관리를 합니다.");
									후니.학점관리();
									System.out.println(" ");
									
									SomethingGirl SomethingGirl = new SomethingGirl();

									SomethingGirl.SomethingGirlCome();
									SomethingGirl.join(); 
									System.out.println(" ");
									
									후니.상태알림();
									
								}else if(학교선택창 == 2) {
									System.out.println("동아리에서 선배들에게 취업꿀팁을 얻습니다.");
									후니.금융동아리모임_참석();
									System.out.println(" ");
									
									CircleBroThread CircleBro = new CircleBroThread();

									CircleBro.CircleBroCome();
									CircleBro.join(); 
									System.out.println(" ");
									후니.상태알림();
									
								}else if(학교선택창 == 3) {
									System.out.println("취업지원본부에서 컨설팅을 받습니다.");
									후니.취업지원본부_컨설팅();
									후니.상태알림();
									
								}else if(학교선택창 == 4) {
									System.out.println("면접스터디를 통해 면접역량을 강화시킵니다.");
									후니.면접스터디_참석();
									
									InterviewStudyMember Studymember= new InterviewStudyMember();

									Studymember.GoFeedback();
									Studymember.join(); 
									후니.상태알림();
									
								}else if(학교선택창 == 5) {
									continue;
							
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						 
								}
								
								Character InterviewFriend = new Character(); 
								InterviewFriend.관계 = "취업스터디원";
								
									if(InterviewFriend.SuccessFirst()) {
										
										EventBgm EventBgm = new EventBgm();
										
								        try {
								        	EventBgm.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
								        
										System.out.println("학교 랜덤 이벤트 <취업스터디원이 먼저 합격했습니다.>");
										System.out.println("축하파티에 참여하시겠습니까?");
										System.out.println("1. 참여");
										System.out.println("2. 불참");
			
										//객체.객체함수다. 객체의 기능!	
										
										int goparty = scan.nextInt();
										
										if(goparty == 1) {
											System.out.println("축하파티에 참여해 많은 조언들을 얻습니다.");	
											InterviewFriend.후니의_서류지수_증가(5);
											InterviewFriend.후니의_필기지수_증가(5);
											InterviewFriend.후니의_면접지수_증가(5);
											InterviewFriend.후니의_체력지수_감소(10);
											InterviewFriend.후니의_자존감지수_감소(5);
											
											후니.상태알림();
											
										}else if(goparty == 2) {
											System.out.println("축하파티에 불참하고 체력을 회복합니다.");
											InterviewFriend.후니의_체력지수_증가(15);
											InterviewFriend.후니의_자존감지수_감소(5);
											InterviewFriend.후니의_스트레스지수_증가(5);
											
											후니.상태알림();					
										}else {
											System.out.println("다시 입력하세요.");
											continue; 	
										}
										
									}else {
										System.out.println("랜덤이벤트가 없습니다.");
									}
								
								
						    }else if(일학기선택창 == 2) {
								System.out.println(" ");
						    	System.out.println("동네에 왔습니다.");
								System.out.println("동네에서 무엇을 하시겠습니까?");
								System.out.println("1. 헬스");
								System.out.println("2. 치맥");
								System.out.println("3. 뒤로가기");
								System.out.println(" ");
								
								int 동네선택창 = scan.nextInt();
								
								if(동네선택창 ==1) {
							        System.out.println(" ");
							        
									System.out.println("체력을 길러 취업준비하는 동안 나를 잃지 않도록 합시다.");
									System.out.println(" ");
									후니.헬스장();
									후니.상태알림();
									
								}else if(동네선택창 == 2) {
									    System.out.println(" ");
										System.out.println("치맥으로 스트레스를 풉니다.");
										후니.치맥();
										후니.상태알림();
									
								}else if(동네선택창 == 3) {
									continue;
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						 
								}
								
								// (동네) 고등학교 친구에게 안부전화 올 확률 10% 
								
								Character HighschoolFriend = new Character(); 
								HighschoolFriend.관계 = "고등학교 친구";
								
								if(HighschoolFriend.HiCall()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									
									System.out.println("동네 랜덤 이벤트 <고등학교 친구의 안부전화>");
									System.out.println("잊고 있던 고등학교 친구에게 전화가 옵니다.");
									System.out.println("1. 전화를 받는다. ");
									System.out.println("2. 전화를 받지 않는다. ");

									//객체.객체함수다. 객체의 기능!	
									
									int 안부전화선택창 = scan.nextInt();
									
									if(안부전화선택창 == 1) {
										System.out.println("[고등학교 친구] 어 후니야! 아까 동네에서 너 본 것 같아서 전화했어!");	
										System.out.println("[고등학교 친구] 잘 지내고 있었지?");	
										System.out.println("[고등학교 친구] 전역한 이후로 한 번도 못봤는데! 보고 싶다야!");
										System.out.println("[후니] 말할 틈도 안주네!");
										System.out.println("[후니] 나도 보고 싶다야!");
										
										HighschoolFriend.후니의_체력지수_증가(10);
										HighschoolFriend.후니의_자존감지수_증가(10);
										HighschoolFriend.후니의_스트레스지수_감소(10);
										
										후니.상태알림();
										
									}else if(안부전화선택창 == 2) {
										System.out.println("[후니] 아 무슨 일이지.. 요즘 사람들 만나기 싫은데..");
										HighschoolFriend.후니의_자존감지수_감소(10);
										HighschoolFriend.후니의_스트레스지수_증가(10);
										
										후니.상태알림();					
									}else {
										System.out.println("다시 입력하세요."); 
										continue; 	
									}
									
								}else {
									System.out.println("랜덤이벤트가 없습니다.");
								}
								
						    }else if(일학기선택창 == 3) {
								System.out.println(" ");
						    	System.out.println("집에 왔습니다.");
								System.out.println("집에서 무엇을 하시겠습니까?");
								System.out.println("1. 부모님과 식사");
								System.out.println("2. 일기쓰기");
								System.out.println("3. 낮잠자기");
								System.out.println("4. 뒤로가기");
								System.out.println(" ");
								
								int 집선택창 = scan.nextInt();
								
								if(집선택창 ==1) {
							        String parents[] = {
											"부모님과 식사하며 취업 관련 이야기를 합니다.",
											"[부모님] 취업준비는 좀 잘 되고 있니?",
											"[후니] 나름대로 열심히 하고 있어요 ㅎㅎ",
											"[부모님] 그래그래 넌 혼자 알아서 잘 하리라 믿는다 ㅎㅎ ",
											"[후니] (후.. 이렇게나 날 믿어주시는데 잘 안되네 ㅠㅠ) ",
											"[부모님] 밥 많이 먹고 힘내라 아들",
											" "
									};
									
									for (int i = 0; i <parents.length; i++) {
										Thread.sleep(500);//0.5초마다 한 문장씩 출력
										System.out.println(parents[i]);
									}
									System.out.println(" ");

									후니.부모님과식사();
									System.out.println(" ");
									
									RelativeClass relative = new RelativeClass();
									relative.RelativeCome();
									relative.join(); 
									
									후니.상태알림();
									
								}else if(집선택창 == 2) {
								    System.out.println(" ");
								    System.out.println("일기를 쓰며 하루를 점검하고 스스로를 보살핍니다.");
									후니.일기();
									후니.상태알림();
									
						    	}else if(집선택창 == 3) {
										    
								    		System.out.println("낮잠을 통해 부족한 체력을 충전합니다.");
								    		후니.낮잠();
								    		후니.상태알림();
						    		
						    	}else if(집선택창 == 4) {
									continue;
								}else {
									System.out.println("다시 입력하세요."); 
									continue; 						
								}
								
								//(집) 동생의 병간호를 해야합니다.
								Character Bro = new Character(); 
								Bro.관계 = "남동생";
								
								if(Bro.gohospital()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									
									System.out.println("집 랜덤 이벤트 <동생의 입원>");
									System.out.println("동생이 입원했습니다.");
									System.out.println("병간호를 하시겠습니까?");
									System.out.println("1. 병간호를 한다.");
									System.out.println("2. 하지 않는다.");

									//객체.객체함수다. 객체의 기능!	
									
									int 병간호선택창 = scan.nextInt();
									
									if(병간호선택창 == 1) {
										System.out.println("[후니] (후.. 취준에 집안일까지..)");	
										System.out.println("[후니] 조심 좀 하지 그랬어 ㅠㅠ");	
										Bro.후니의_체력지수_감소(5);
										Bro.후니의_스트레스지수_증가(5);
										후니.상태알림();
										
									}else if(병간호선택창 == 2) {
										System.out.println("[후니] 너무 바빠.. 하반기 준비해야해..ㅠㅠ");
										Bro.후니의_스트레스지수_증가(5);
										Bro.후니의_자존감지수_감소(5);
										후니.상태알림();					
									}else {
										System.out.println("다시 입력하세요.");
										continue; 	
									}
									
								}else {
									System.out.println("랜덤이벤트가 없습니다.");
								}
								
						    }else if(일학기선택창 == 4) {
						    	continue;
						    }else {
								System.out.println("다시 입력하세요.");
						    	continue;
						    }
						    
						}
						
						DEC ++;	
						
					}else if(메인메뉴선택창 == 2){
						후니.상태알림();
						
					}else if(메인메뉴선택창 == 3) {
							
						System.out.println("취준을 포기하시겠습니까?");
						System.out.println("1. 네");
						System.out.println("2. 아니오");
						
						int 취준포기선택창 = scan.nextInt();
						
						if(취준포기선택창 ==1) {
							System.out.println("12월 취업준비를 포기했습니다.");					
							
							break;

						}else if(취준포기선택창 == 2) {
							continue;
						}else {
							System.out.println("다시 입력하세요."); // 취준을 포기하시겟습니까?가 뜨도록. 맨처음 메인메뉴창이 아니라.
							continue; 						   // 이 if문을 while문 안에 넣게 되면 취준포기선택창 == 2가 1.활동 2. 상태확인 3. 취준포기가 나와야
						}
						
					}else {
						Buttonbgm ButtonBgm3 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm3.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println("다시 입력하세요.");
						continue;
					}

				}
				
				System.out.println("면접 날입니다.");
				System.out.println("면접을 보러가시겠습니까?");

				int InterviewTest;
				InterviewTest = 0;
				
				while(InterviewTest<1) {
				System.out.println("1번 : 응시한다");
				System.out.println("2번 : 늦잠잔다");
						
				int InterviewTest2 = scan.nextInt();
				
				if(InterviewTest2  == 1) {
					
					System.out.println(" ");
					String JopPhoto[] = { // 타이핑 쓰레드 - 익명 클래스

								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!!!!*==$====!!!!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!!!=@#@@@##@###**!!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!!!$@@#@@@@@@#$==$$=!!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!!#@@@@@@@@@@#########!!!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!!$@@@@@@@@##$####$$$###*!!!!!!!!!!!!!",
								"!!!!!!!!!!!!!$@@@@@@@@#######$#$$$#@#!!!!!!!!!!!!!",
								"!!!!!!!!!!!!*@@@@@@@@#####@##$$#$###@$!!!!!!!!!!!!",
								"!!!!!!!!!!!!#@@@@#@#@@##$####$#$$###@@!!!!!!!!!!!!",
								"!!!!!!!!;!;!@@@@#####@##$$$$#$##$$#$#@$!!!!!!!!!!!",
								"!!!!!!!;;;;@#@########$$*$$$$=###$###@@!!!!!!!!!!!",
								"!!!!!!;;;;!@########$$==$$$$$####$$###@!!!!!!!!!!!",
								"!!!;;;;;;;!####$$$$$=====$###$########@*!!!!!!!!!!",
								";!;;;;;;;;*###$$$=*====$#$############@*;!!!!!!!!!",
								";;;;;;;;;;*###$===*=$$==###############*;;;;!!!!!!",
								";;;;;;;;;;=####===*=#$*!$$$###########@!;;;;;!!!!!",
								";;;;;;;;;;*@##=**!;:*=*::**;*$#######@#!;;;;;;;!!!",
								";;;;;;;;;;!@#!!-:-,,-..   ..~!=$#####@@;;;;;;;;;!!",
								";;;;;;;;;;;##:..----,,.    .-~::;**####;;;;;;;;;;;",
								";;;;;;;;;;;#$:..., ,~      ..=..;:;=#@$;;;;;;;;;;;",
								";;;;;;;;:::$#;.~.    --   .   ..,~:!#@=;;;;;;;;;;;",
								";;;;;;;:::-,:!~...-~*-, .:..-#;~--;*$=;;;;;;;;;;;;",
								";;;;;::::;.. ;~   ..~,.:.,!.,!,-,,-:*~:;::;;;;;;;;",
								";;;;::::::   ~.      ..   !  .....-:!~;;:::;;;;;;;",
								";;;:::::::  -,..      :,  :,    ..-:!~~::::::;;;;;",
								";;;:::::::-  ,...     .   --    .,-:;:::::::::;;;;",
								";:::::::~~:  ,. ~.  , .   -~...-.,-:;*:~~::::::;;;",
								";::::::~~~~  ,,           ,-,  ..,~:!:;~~~::::::;;",
								"::::::~~~~~~ .,.       ...--~   .,~::~~~~~~~:::::;",
								":::::~~~~~~-~ -.        .-~--. ..-~;~~-~~~~~~:::::",
								"::::~~~~~-----~..         .,,...,-~;-----~~~~~::::",
								":::~~~~-------~..         ..,,..,-~!------~~~~~:::",
								"::~~~~-----,,,~..   .,....,-~-,,,-~~,------~~~~~::",
								":~~~~-----,,,,,-..       ..,-..,--:-,,,-----~~~~~:",
								":~~~-----,,,,,,:,.     .,.,-,.,,-~;,,,,,,----~~~~:",
								"~~~----,,,,,,..,~,.      .....,-~:,..,,,,,----~~~~",
								"~~~---,,,,,.....:~,.       ...,~:;....,,,,,----~~~",
								"~~---,,,,,......-~~,      ...,~:;;......,,,,---~~~",
								"~---,,,,,.......,,~~-. ...,,,-:::!.......,,,,---~~",
								"~---,,,,........~..-~~---~~~~::::;........,,,----~",
								"---,,,......... -...,-~~~~~~:~~~~;.........,,,---~",
								"--,,,,........ :.. ....,--~~~~~~~;*~.......,,,,--~",
								"-,,,,.......  ,* .  ..   .,-~~~~:~:#-.......,,,---",
								"-,,,......   .$,    ...   ,-----~-~$#~.......,,,--",
								",,,.......  ~$$.     ... .,--,,,,,-=##$.......,,--",
								",,,...... -*$$$.   . ....,,,,,-.,,-=####*.....,,,-",
								",,.....:;$$$##$,       ....,,,...,-$######!;...,,-",
								",,..~;$$$$$$$$$*         ...- ....-$########$=::,,",
								"-~$$#$$$#$$$$$$=        ...,  ...,~$########$##$#$",
								"##$#$###$#$#$$$=        ..,   ....-$$####$$##$#$$#",
								"##$#$$$#####$$$=    *!=$$$$$**....:$$$$$######$$##",
								"#$$$$$$$#$$$#$$$..-*$$$$$$#$##=--.=$#$$$##$$##$##$",
								"$$$$$#$$$$$$$$$:,.,$$$$$$$###:-,-=$$##$#####$$###",
								"$$$$$$$$$$$$$$$,   .$##$$##$:~. .=$$$$#$######$$$",
								"$$$$$$#$$$$$$$$$,    -$$$$#$;~.  ,$$##$###$$#$##$$",
								"$#$$$$$$#$$$$$$,     ~$$##*:,   ,$$####$####$$###",
								"$$$$$#$$#$$$$#$~     ~$###;-.   ,$$$##$#$#$#$$$$$",
								"$$$$#$$$#$$$$$$:     *$#$$=-   .;$$$$##$$####$#$$",
								"$$$##$#$$$#$$#$!.   .$##$$=- ...$$$##$$$$$####$$$",
								"$$$#####$=$$$$$$.   *=####$~. ..$##$#$$#$#$#$#$#$",
								"#$$$$$$$$$$$$$#$$,   *$#$$$$:. .-$$#$$#$$###$##$$#",
								"$$$$$$$#$$$$$$$$,  .*$#$$$$*,  ~=$##$$$$#$$$$#$#$"
						     
				    };

			        
				    for (int i = 0; i < JopPhoto.length; i++) {
					      // 초 간 중지한다
					      Thread.sleep(100);
					      // 메세지를 출력한다
					      System.out.println(JopPhoto[i]);
					}
				    System.out.println(" ");
					
					System.out.println("내 면접지수와 은행 커트라인과 비교합니다.");
					System.out.println(" ");
					
					if(후니.후니_면접지수>=까까오뱅크인사팀.면접지수_커트라인) {
						
				        //패스브금 (로딩브금과 동일)
					   	LoadingBgm passBgm02 = new LoadingBgm();
				          
				        try {
				             passBgm02.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }

						
						System.out.println("===========================================================");
						System.out.println(" ");
						
						String PASS[] = { // 타이핑 쓰레드 - 익명 클래스
					            "______   ___   _____  _____ ",    
					            "| ___ \\ / _ \\ /  ___|/  ___|",
					            "| |_/ // /_\\ \\\\ `--. \\ `--. ",
					            "|  __/ |  _  | `--. \\ `--. \\",
					            "| |    | | | |/\\__/ //\\__/ /",
					            "\\_|    \\_| |_/\\____/ \\____/"
					    };

				        
					    for (int i = 0; i < PASS.length; i++) {
						      // 초 간 중지한다
						      Thread.sleep(450);
						      // 메세지를 출력한다
						      System.out.println(PASS[i]);
						} 
						System.out.println(" ");
						System.out.println("하반기 채용에 최종합격하였습니다!!");
						System.out.println("신입사원 연수 때 뵙겠습니다.");
						System.out.println("===========================================================");
						
						break;
						
					}else {
						
						System.out.println(" ");
						System.out.println("귀하께서는 아쉽게도 선발 명단에 없음을 알려드립니다. 감사합니다.");				
						System.out.println("게임이 종료되었습니다.");
						System.out.println(" ");
						
						
						String GameEnd[] = { // 타이핑 쓰레드 - 익명 클래스

		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@=;:;;;;:=#@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@#-*@@@@@@@@@@@$-*@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@*;@@@@@@@@@@@@@@@@@=;#@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@!!@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@@@@",
		"@@@@@@@@@@#;@@@@@@@@@@@@@@@@@@@@@@@@@=*@@@@@@@@@@@",
		"@@@@@@@@@$$@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@@",
		"@@@@@@@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
		"@@@@@@@*#@@@@@~~~~~~$@@@@@@@@@@@*~!@@@@@@;@@@@@@@@",
		"@@@@@@$#@@@@@@      =@@@@@@@@@@@: ~@@@@@@@;@@@@@@@",
		"@@@@@@=@@@@@@@  !@@@@@;** ;@@#.,: ~@@@@@@@@=@@@@@@",
		"@@@@@~@@@@@@@@      ##     *@     ~@@@@@@@@=@@@@@@",
		"@@@@*@@@@@@@@@      ##  @. != .@- ~@@@@@@@@@~@@@@@",
		"@@@@!@@@@@@@@@  !@@@@#  @, !! ~@: ~@@@@@@@@@@#@@@@",
		"@@@=#@@@@@@@@@      ;#  @, !@  $  ~@@@@@@@@@@;@@@@",
		"@@@!@@@@@@@@@@      ;#  @, *@-  ; ~@@@@@@@@@@=@@@@",
		"@@@!@@@@@@@@@@@@@@@@@@@@@@@@@@#@@@@@@@@@@@@@@@=@@@",
		"@@#$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
		"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
		"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#@@@@@@$-  -=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#$@@@@#      =@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*@@@",
		"@@@;@@@@, .@@ ;$@@-..~@@~~@,.@=.-@@@~.,$@@@@@#$@@@",
		"@@@!@@@@  ;@!!!*@     ~@         !@  .  :@@@@*@@@@",
		"@@@$#@@@  !@   ,@!:#!  @  ;=  @- -*  *:  @@@@;@@@@",
		"@@@@!@@@. -@=! ,@~  ;  @  *#  @~ -!  ,,,,@@@@@@@@@",
		"@@@@$@@@;  ..  ,@  @,  @  *#  @~ -$  #~ .@@@-@@@@@",
		"@@@@@-@@@-    -@@   -  @  *#  @~ -@:   .@@@*@@@@@@",
		"@@@@@@!@@@@##@@@@@#@@@@@@@@@@@@@@@@@@#@@@@#=@@@@@@",
		"@@@@@@$=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@@@@@",
		"@@@@@@@*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@",
		"@@@@@@@@=$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
		"@@@@@@@@@$!@@@@@@@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@",
		"@@@@@@@@@@@;@@@@@@@@@@@@@@@@@@@@@@@@@:$@@@@@@@@@@@",
		"@@@@@@@@@@@@$:@@@@@@@@@@@@@@@@@@@@@$;@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@=!$@@@@@@@@@@@@@@@#*;@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@#!!*#@@@@@@@#=!!=@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@#$=***=$#@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
								                                                       
					    };

				        
					    for (int i = 0; i < GameEnd.length; i++) {
						      // 초 간 중지한다
						      Thread.sleep(250);
						      // 메세지를 출력한다
						      System.out.println(GameEnd[i]);
						} 
						

						
						System.exit(0);
		//게임이 종료되어야				
					}
					
				}else if(InterviewTest2  == 2) {
					
					GoodbyeWorldBgm GoodbyeWorldBgm = new GoodbyeWorldBgm();
					GoodbyeWorldBgm.join();
					
			        try {
			        	GoodbyeWorldBgm.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					
					String GameEnd[] = { // 타이핑 쓰레드 - 익명 클래스

		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@=;:;;;;:=#@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@#-*@@@@@@@@@@@$-*@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@*;@@@@@@@@@@@@@@@@@=;#@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@!!@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@@@@",
		"@@@@@@@@@@#;@@@@@@@@@@@@@@@@@@@@@@@@@=*@@@@@@@@@@@",
		"@@@@@@@@@$$@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@@",
		"@@@@@@@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
		"@@@@@@@*#@@@@@~~~~~~$@@@@@@@@@@@*~!@@@@@@;@@@@@@@@",
		"@@@@@@$#@@@@@@      =@@@@@@@@@@@: ~@@@@@@@;@@@@@@@",
		"@@@@@@=@@@@@@@  !@@@@@;** ;@@#.,: ~@@@@@@@@=@@@@@@",
		"@@@@@~@@@@@@@@      ##     *@     ~@@@@@@@@=@@@@@@",
		"@@@@*@@@@@@@@@      ##  @. != .@- ~@@@@@@@@@~@@@@@",
		"@@@@!@@@@@@@@@  !@@@@#  @, !! ~@: ~@@@@@@@@@@#@@@@",
		"@@@=#@@@@@@@@@      ;#  @, !@  $  ~@@@@@@@@@@;@@@@",
		"@@@!@@@@@@@@@@      ;#  @, *@-  ; ~@@@@@@@@@@=@@@@",
		"@@@!@@@@@@@@@@@@@@@@@@@@@@@@@@#@@@@@@@@@@@@@@@=@@@",
		"@@#$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
		"@@*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@;@@@",
		"@@=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#@@@@@@$-  -=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@",
		"@@#$@@@@#      =@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*@@@",
		"@@@;@@@@, .@@ ;$@@-..~@@~~@,.@=.-@@@~.,$@@@@@#$@@@",
		"@@@!@@@@  ;@!!!*@     ~@         !@  .  :@@@@*@@@@",
		"@@@$#@@@  !@   ,@!:#!  @  ;=  @- -*  *:  @@@@;@@@@",
		"@@@@!@@@. -@=! ,@~  ;  @  *#  @~ -!  ,,,,@@@@@@@@@",
		"@@@@$@@@;  ..  ,@  @,  @  *#  @~ -$  #~ .@@@-@@@@@",
		"@@@@@-@@@-    -@@   -  @  *#  @~ -@:   .@@@*@@@@@@",
		"@@@@@@!@@@@##@@@@@#@@@@@@@@@@@@@@@@@@#@@@@#=@@@@@@",
		"@@@@@@$=@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@!@@@@@@@",
		"@@@@@@@*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@",
		"@@@@@@@@=$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@~@@@@@@@@@",
		"@@@@@@@@@$!@@@@@@@@@@@@@@@@@@@@@@@@@@@$!@@@@@@@@@@",
		"@@@@@@@@@@@;@@@@@@@@@@@@@@@@@@@@@@@@@:$@@@@@@@@@@@",
		"@@@@@@@@@@@@$:@@@@@@@@@@@@@@@@@@@@@$;@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@=!$@@@@@@@@@@@@@@@#*;@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@#!!*#@@@@@@@#=!!=@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@#$=***=$#@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@",
		"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
							                                                       
				    };

			        
				    for (int i = 0; i < GameEnd.length; i++) {
					      // 초 간 중지한다
					      Thread.sleep(250);
					      // 메세지를 출력한다
					      System.out.println(GameEnd[i]);
					} 
					System.out.println("취업준비를 포기했습니다.");
					System.out.println("게임이 종료되었습니다.");
					
					System.exit(0);
		//게임이 종료되어야				
					break;
									
				}else {
					System.out.println("다시 입력하세요.");
					continue;
				}
				InterviewTest2 ++;
				}

			}else {
				
		}
	}
	

}
