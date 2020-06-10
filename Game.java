package game;

import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
//import game.BankHuman.��������λ���;
//import game.BankHuman.���������λ���;
//import game.BankHuman.������ũ�λ���;

public class Game { //���⼱ ���ุ // ���⼭ Ŭ������ ������ ���� �ְ� ��ü�� ������ ���� �ִ�.
	
	public static boolean inputCheck = false; // ���� �Է����ֱ� ������ false���� ī��Ʈ�ٿ��� ��� �Ǵϱ� false��.
	
	public static void main(String[] args) throws InterruptedException { // main()�޼ҵ�� �ڹ� ������ ������ �ϰ� ������ ��, ������ ����Ǵ� �޼ҵ��Դϴ�.
		
		Scanner scan = new Scanner(System.in);
			
        System.out.println("������������������������� GAME START �������������������������"); // main �帧
        
        //�ε����
	   	LoadingBgm LoadingBgm = new LoadingBgm();
          
        try {
             LoadingBgm.LoadBgm();
             Thread.sleep(0);
        }catch(InterruptedException e) {
             e.printStackTrace();
        }
        
        //��ũ�ε�
	    String BANK[] = { // Ÿ���� ������ - �͸� Ŭ����
	            "______   ___   _   _  _   __",    
	            "| ___ \\ / _ \\ | \\ | || | / /",
	            "| |_/ // /_\\ \\|  \\| || |/ /",
	            "| ___ \\|  _  || . ` ||    \\ ",
	            "| |_/ /| | | || |\\  || |\\  \\",
	            "\\____/ \\_| |_/\\_| \\_/\\_| \\_/"
		     
	    };

        
	    for (int i = 0; i < BANK.length; i++) {
		      // �� �� �����Ѵ�
		      Thread.sleep(450);
		      // �޼����� ����Ѵ�
		      System.out.println(BANK[i]);
		}                            
	    
  
	    
		System.out.println("���� �ǰ���");
		System.out.println("                         Loading...");
		
		LoadingThread LoadingThread = new LoadingThread("�����");
		LoadingThread.start(); // �ε���
		LoadingThread.join();

		// start �޼���� �����尡 �����غ� �ϰ� �Ѵ�. 
		int ���Ӽ���;
		
		byte �ʿ��ϴ� = 1;
		byte �ʿ���� = 2;
		
		�Ĵ� �Ĵ� = new �Ĵ�();
		�Ĵ�.�̸� = "�Ĵ�";
		�Ĵ�.���� = 25;

//		���Ӽ��� = scan.nextInt();	
		
		BackgroundBgm BackgroundBgm = new BackgroundBgm();
		BackgroundBgm.start();


		
		while (true) {
			
			���Ӽ��� = scan.nextInt();	
			
			Buttonbgm ButtonBgm = new Buttonbgm();
			
	        try {
	        	 ButtonBgm.LoadBgm();
	             Thread.sleep(0);
	        }catch(InterruptedException e) {
	             e.printStackTrace();
	        }
			
			if (���Ӽ��� == 1) {
	
				System.out.println("===========================================================");
				//�ε� Ÿ���ξ�����
			    String introduce[] = { 
						"�Ĵϴ� ���б�3�г��� ������ �ܿ������ �¾ҽ��ϴ�.",
						"���� 4�г��ε� �̹� �ܿ���к��� ����غ� �ؾ��� �� �����ϴ�.",
						"��ҿ� �����ǿ� ������ �־� ������ ���ڰ� ����մϴ�.",
						"¬�����ƿ��� ������� Ȯ���մϴ�.",
						"-----------------------------------------------------------",
						"��å������ ��������, ���������� �������, ���ͳ������� ������ũ�� ���� ��ϴ�.", 
						"�Ĵϴ� �� �߿��� ��ǥ������ ������ �� �ֽ��ϴ�.",
						"������ ������ �Ϲݱ� ä�뿡 �հ��ϸ� �˴ϴ�.",
						"�հ��ϱ� ���ؼ� ������ ������ �䱸�ϴ� ��������, �ʱ�����, ���������� �Ѱܾ� �մϴ�.",
						"�� ������ �ִ�ġ�� 100�Դϴ�.",
						"������ �������ּ���." 
			    };

			    for (int i = 0; i < introduce.length; i++) {
			      // 1.5�� �� �����Ѵ�
			      Thread.sleep(500);
			      // �޼����� ����Ѵ�
			      System.out.println(introduce[i]);
			    }
				
					break;
				
			} else { // 2�� �� 5�� �ݺ� �� �����ڵ�����ǵ��� �ϴ� ��� �����غ���!

				
				System.out.println("���Ӽ��� ���ô°� ���ƿ�!");
				System.out.println("���Ӽ����� �ʿ��Ͻʴϱ�?");	
				System.out.println("1. �ʿ��ϴ� 2. �ʿ����");
			}
			
		}
		
		System.out.println("===========================================================");
		System.out.println("	 	  1��		  2��		   3��");
		System.out.println("	 	��������		�������		  ������ũ");
		System.out.println("��������ĿƮ����  |     75		  75		   50");
		System.out.println("�ʱ�����ĿƮ����  |    100		  75		   50");
		System.out.println("��������ĿƮ����  |     50		  75		  100");
		System.out.println("���Ի�����ӿ���  |   4000����		4500����		 3500����");
		System.out.println("     �� �� ��          |     ����		   ����		     ����");
		System.out.println(" ");
		System.out.println("�� �� ���� �����ڰ� ���Ƿ� ������ ���������Դϴ�. ���ǰ� ���� �����ϴ�. ��");
		System.out.println("===========================================================");

		
		BankHuman ���������λ��� = new BankHuman();
		BankHuman ��������λ��� = new BankHuman();
		BankHuman ������ũ�λ��� = new BankHuman();
		
		���������λ���.�����̸� = "��������";
		���������λ���.��������_ĿƮ���� = 75;
		���������λ���.�ʱ�����_ĿƮ���� = 100;
		���������λ���.��������_ĿƮ���� = 50;
		���������λ���.���Ի��_�ʺ� = "4000����";
		���������λ���.����� = "����";
		
		
		��������λ���.�����̸� = "�������";
		��������λ���.��������_ĿƮ���� = 75;
		��������λ���.�ʱ�����_ĿƮ���� = 75;
		��������λ���.��������_ĿƮ���� = 75;
		��������λ���.���Ի��_�ʺ� = "4500����";
		��������λ���.����� = "����";

		
		������ũ�λ���.�����̸� = "������ũ";
		������ũ�λ���.��������_ĿƮ���� = 50;
		������ũ�λ���.�ʱ�����_ĿƮ���� = 50;
		������ũ�λ���.��������_ĿƮ���� = 100;
		������ũ�λ���.���Ի��_�ʺ� = "3500����";
		������ũ�λ���.����� = "����";
		
		
		int ���༱�� = scan.nextInt();
		
		if ( ���༱�� == 1) {
			Buttonbgm ButtonBgm = new Buttonbgm();
			
	        try {
	        	 ButtonBgm.LoadBgm();
	             Thread.sleep(0);
	        }catch(InterruptedException e) {
	             e.printStackTrace();
	        }
	        
        
			System.out.println("[�Ĵ�] ����! �������� ������!");
			System.out.println("===========================================================");
			System.out.println("�������� �䱸 �������� : " + ���������λ���.��������_ĿƮ����);
			System.out.println("�������� �䱸 �ʱ����� : " + ���������λ���.�ʱ�����_ĿƮ����);
			System.out.println("�������� �䱸 �������� : " + ���������λ���.��������_ĿƮ����);
			System.out.println("===========================================================");	
			
			�Ĵ�.�Ĵ�_�������� = 0; �Ĵ�.�Ĵ�_�ʱ����� = 0; �Ĵ�.�Ĵ�_�������� = 0;
			�Ĵ�.�Ĵ�_ü������ = 90; �Ĵ�.�Ĵ�_���������� = 90; �Ĵ�.�Ĵ�_��Ʈ�������� = 10;
			
			�Ĵ�.���¾˸�();

			System.out.println("===========================================================");
			System.out.println("[�Ĵ�] ���? ü������, ����������, ��Ʈ���������� ����?");
			System.out.println("���� Ȯ���Ͻ÷��� 1��, �����Ͻ÷��� 2��");
			
			int ���������� = scan.nextInt();
			
			if ( ���������� == 1) {
				Buttonbgm ButtonBgm2 = new Buttonbgm();
				
		        try {
		        	 ButtonBgm2.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
				System.out.println("===========================================================");
				System.out.println("�� ������ �ִ�ġ�� 100�̸� 100�� �ʰ��ϰų� 0 �̸��� �� �� �����ϴ�.");
				System.out.println("ü�������� 90���� ���۵Ǹ� 0�� �Ǹ� ���������Դϴ�.");
				System.out.println("������������ 90���� ���۵Ǹ� 0�� �Ǹ� ���������Դϴ�.");
				System.out.println("��Ʈ���������� 10���� ���۵Ǹ� 100�� �Ǹ� ���������Դϴ�.");
				System.out.println(" ");
				System.out.println("ü�������� 1~20, ������������ 1~20, ��Ʈ���������� 80~99�� �� ���â�� ��ϴ�.");		
				System.out.println("������ �������Դϴ�.");
				System.out.println("�� �������� �� �����ϴ°� ����� �ٽ��Դϴ�.");
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
			
			System.out.println("[�Ĵ�] ��.. ���� �ʱ�.");
			System.out.println("[�Ĵ�] �׷��� ������ �غ�����. ����غ� �����غ���?"); // 1�� Ȱ��, 2�� ����Ȯ��, 3�� ���θ޴�

		
			
			while (true) {
				Buttonbgm ButtonBgm5 = new Buttonbgm();
				
		        try {
		        	 ButtonBgm5.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
				System.out.println(" ");
				System.out.println("< ���θ޴� > ");
				System.out.println("1. Ȱ��"); // 1�� Ȱ��, 2�� ����Ȯ��, 3�� ��������
				System.out.println("2. ����Ȯ��");
				System.out.println("3. �ܿ���� ��������");
				System.out.println(" ");

				int ���θ޴�����â = scan.nextInt();
				
				if ( ���θ޴�����â == 1) {
					
					
					if (true) {
						Buttonbgm ButtonBgm2 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm2.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println(" ");
						System.out.println("�ܿ�����Դϴ�. �ܿ���п� �ڰ����� ����� �� �ֽ��ϴ�.");
						System.out.println("������ ����Ͻðڽ��ϱ�?");
						System.out.println("1. ��ǻ���ڰ��� ");
						System.out.println("2. �����ڰ���");
						System.out.println("3. �����ڰ���");
						System.out.println("4. �ڷΰ���");
						System.out.println(" ");
						
						int �ܿ���м���â = scan.nextInt(); // 70% Ȯ���� �ڰ��� ���

					    if (�ܿ���м���â == 1) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
					    	��ǻ���ڰ��� ��ǻ���ڰ��� = new ��ǻ���ڰ��� ();// ��ǻ���ڰ���Ŭ�������� ��ǻ���ڰ��� ��ü�� ��������.
							��ǻ���ڰ���.�����̸� = "��ǻ���ڰ���";
					    	
					    	System.out.println("��ǻ�� �ڰ����� �⺻����!!");
							System.out.println("��ǻ���ڰ��� ���迡 �����߽��ϴ�.");
							
							// 5�� ���� input���п� ���� �Է����� �ʾ��� �� ���ӽ���
							// �̸� ���� ���θ޼ҵ尡 �ִ� Ŭ������ inputCheck��� static boolean�� ����
							
							ComputerInputThread ComputerInputThread = new ComputerInputThread();
							ComputerCountdownThread ComputerCountdownThread = new ComputerCountdownThread(); 
							
							ComputerInputThread.start(); //���� ó��
							ComputerCountdownThread.start(); //ī��Ʈ�ٿ��� ó��
							ComputerCountdownThread.join();
							
							
							break;
					    
					    }else if(�ܿ���м���â == 2) {
							Buttonbgm ButtonBgm1 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm1.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							�����ڰ��� �����ڰ��� = new �����ڰ��� ();
							�����ڰ���.�����̸� = "�����ڰ���";
					    	
					    	System.out.println("Ȥ�� �𸣴� �����ڰ��� �ϳ��� ������!!!");
							System.out.println("�����ڰ��� ���迡 �����߽��ϴ�.");
							
							// 5�� ���� input���п� ���� �Է����� �ʾ��� �� ���ӽ���
							// �̸� ���� ���θ޼ҵ尡 �ִ� Ŭ������ inputCheck��� static boolean�� ����
							
							EnglishInputThread EnglishInputThread = new EnglishInputThread();
							EnglishCountdownThread EnglishCountdownThread = new EnglishCountdownThread(); 
							
							EnglishInputThread.start();
							EnglishCountdownThread.start();
							EnglishCountdownThread.join();
							
					    	

							break;
							
					    }else if(�ܿ���м���â == 3) {
							Buttonbgm ButtonBgm1 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm1.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							�����ڰ��� �����ڰ��� = new �����ڰ��� ();
							�����ڰ���.�����̸� = "�����ڰ���";
					    	
							System.out.println("������ �غ��ϴµ� �����ڰ����� �⺻����!!");
							System.out.println("�����ڰ��� ���迡 �����߽��ϴ�.");
							
							// 10�� ���� input�� ���� �Է����� �ʾ��� �� ���ӽ���
							// �̸� ���� ���θ޼ҵ尡 �ִ� Ŭ������ inputCheck��� static boolean�� ����
							
							FinanceInputThread FinanceInputThread = new FinanceInputThread();
							FinanceCountdownThread FinanceCountdownThread = new FinanceCountdownThread(); 
							
							FinanceInputThread.start();
							FinanceCountdownThread.start();
							FinanceCountdownThread.join();
							
					    							
							break;
							
					    }else if(�ܿ���м���â == 4) {
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
							System.out.println("�ٽ� �Է��ϼ���.");
					    	continue;
					    }
					    
					}
					
				}else if(���θ޴�����â == 2){
					Buttonbgm ButtonBgm1 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm1.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					�Ĵ�.���¾˸�();
					
				}else if(���θ޴�����â == 3) {
					Buttonbgm ButtonBgm1 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm1.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }	
					System.out.println("�ܿ���� ������ �����Ͻðڽ��ϱ�?");
					System.out.println("1. ��");
					System.out.println("2. �ƴϿ�");
					
					
					int �������⼱��â = scan.nextInt();
					
					if(�������⼱��â ==1) {
						Buttonbgm ButtonBgm2 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm2.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
				        System.out.println("�ܿ���� ����غ� �����߽��ϴ�.");
						
						break;

					}else if(�������⼱��â == 2) {
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
						System.out.println("�ٽ� �Է��ϼ���."); // ������ �����Ͻðٽ��ϱ�?�� �ߵ���. ��ó�� ���θ޴�â�� �ƴ϶�.
						continue; 						   // �� if���� while�� �ȿ� �ְ� �Ǹ� �������⼱��â == 2�� 1.Ȱ�� 2. ����Ȯ�� 3. �������Ⱑ ���;�
					}
					
					
				}else {
					Buttonbgm ButtonBgm1 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm1.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					System.out.println("�ٽ� �Է��ϼ���.");
					continue;
				}
				
			}	
					
			System.out.println("�ܿ������ ������,");
			System.out.println("4�г� 1�бⰡ ���۵Ǿ����ϴ�.");
			System.out.println(" ");
			System.out.println("�� �б�� �� 12������ �̷���� �ֽ��ϴ�.");
			System.out.println("���� ������ �� ���� Ȱ���� �� �� �ֽ��ϴ�.");
			System.out.println("������ �Ͻðڽ��ϱ�?"); // �� �ϴ� 1�ְ� ������ �� 16���� �ϸ� ������������ �Ѿ���� �������
			
			int turnsOfSpringsemester = 1; // 4�г� 1�б� �� 12��!!
			
			while (turnsOfSpringsemester <= 12) {
				System.out.println("< ���θ޴� > ");
				System.out.println("1. Ȱ��"); // 1�� Ȱ��, 2�� ����Ȯ��, 3�� ��������
				System.out.println("2. ����Ȯ��");
				System.out.println("3. 1�б� ��������");
						
				int ���θ޴�����â = scan.nextInt();
				
				if ( ���θ޴�����â == 1) {

					if (true) {
						Buttonbgm ButtonBgm1 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm1.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println(" ");
						System.out.println("4�г� 1�б� : " + turnsOfSpringsemester+"/12" + "��° ���Դϴ�.");
						System.out.println("��� ���ðڽ��ϱ�?");
						System.out.println("1. �б��� ����");
						System.out.println("2. ���׿� ����");
						System.out.println("3. ���� ����");
						System.out.println("4. �ڷΰ���");
						System.out.println("<< �б�, ����, �� ���� ����Ȯ���� �̺�Ʈ�� Ƣ��ɴϴ�. >>");
						System.out.println(" ");	

						
						int ���б⼱��â = scan.nextInt();

					    if (���б⼱��â == 1) {
							Buttonbgm ButtonBgm5 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm5.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println(" ");
							System.out.println("�б��� �Խ��ϴ�.");
							System.out.println("�б����� ������ �Ͻðڽ��ϱ�?");
							System.out.println("1. ��������");
							System.out.println("2. �������Ƹ�Ȱ��");
							System.out.println("3. ����������� ������");
							System.out.println("4. �������͵�");
							System.out.println("5. �ڷΰ���");
							System.out.println(" ");

							
							int �б�����â = scan.nextInt();
							
							if(�б�����â ==1) {
								Buttonbgm ButtonBgm2 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm2.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        System.out.println("��.. �������� ������ �ؾ���!!");
								System.out.println("�б����� ������ ���������� �մϴ�.");
								System.out.println(" ");
								�Ĵ�.��������();
								System.out.println(" ");
								
								SomethingGirl SomethingGirl = new SomethingGirl();

								SomethingGirl.SomethingGirlCome();
								SomethingGirl.join(); 
								System.out.println(" ");
								�Ĵ�.���¾˸�();
								
							}else if(�б�����â == 2) {
								Buttonbgm ButtonBgm2 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm2.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("���Ƹ����� ����鿡�� ��������� ����ϴ�.");
								�Ĵ�.�������Ƹ�����_����();
								System.out.println(" ");
								
								CircleBroThread CircleBro = new CircleBroThread();

								CircleBro.CircleBroCome();
								CircleBro.join(); 
								System.out.println(" ");
								�Ĵ�.���¾˸�();
								
							}else if(�б�����â == 3) {
								Buttonbgm ButtonBgm2 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm2.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("����������ο��� �������� �޽��ϴ�.");
								�Ĵ�.�����������_������();
								�Ĵ�.���¾˸�();
								
							}else if(�б�����â == 4) {
								Buttonbgm ButtonBgm2 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm2.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("�������͵� ���� ���������� ��ȭ��ŵ�ϴ�.");
								�Ĵ�.�������͵�_����();
								
								//�����̺�Ʈ �߻�
								
								InterviewStudyMember Studymember= new InterviewStudyMember();

								Studymember.GoFeedback();
								Studymember.join(); 
								
								
								
								�Ĵ�.���¾˸�();
								
							}else if(�б�����â == 5) {
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
								System.out.println("�ٽ� �Է��ϼ���."); // ������ �����Ͻðٽ��ϱ�?�� �ߵ���. ��ó�� ���θ޴�â�� �ƴ϶�.
								continue; 						   // �� if���� while�� �ȿ� �ְ� �Ǹ� �������⼱��â == 2�� 1.Ȱ�� 2. ����Ȯ�� 3. �������Ⱑ ���;�
							}
							
							
							BankHuman BankHuman = new BankHuman(); 
								
								if(BankHuman.�����ڸ��丵()) {
									
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
							        
									System.out.println("�б� ���� �̺�Ʈ <���� ������ ���丵>");
									System.out.println("���� ������ ���丵�� �����Ͻðڽ��ϱ�?");
									System.out.println("1. ����");
									System.out.println("2. ����");
		
									//��ü.��ü�Լ���. ��ü�� ���!	
									
									int ���丵����â = scan.nextInt();
									
									if(���丵����â == 1) {
										Buttonbgm ButtonBgm2 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm2.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("���丵�� ������ ���� ������� ����ϴ�.");	
										BankHuman.�Ĵ���_��������_����(5);
										BankHuman.�Ĵ���_�ʱ�����_����(5);
										BankHuman.�Ĵ���_��������_����(5);
										BankHuman.�Ĵ���_ü������_����(10);
										
										�Ĵ�.���¾˸�();
										
									}else if(���丵����â == 2) {
										Buttonbgm ButtonBgm2 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm2.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("���丵�� �����ϰ� ü���� ȸ���մϴ�.");
										BankHuman.�Ĵ���_ü������_����(10);
										�Ĵ�.���¾˸�();					
									}else {
										Buttonbgm ButtonBgm2 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm2.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("�ٽ� �Է��ϼ���."); // ���� ������ ���丵�� �����Ͻðڽ��ϱ�?�� �ߵ���.
										continue; 	
									}
									
								}else {
									System.out.println("�����̺�Ʈ�� �����ϴ�.");
								}
							
							
					    }else if(���б⼱��â == 2) {
							Buttonbgm ButtonBgm2 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm2.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println(" ");
					    	System.out.println("���׿� �Խ��ϴ�.");
							System.out.println("���׿��� ������ �Ͻðڽ��ϱ�?");
							System.out.println("1. �ｺ");
							System.out.println("2. ġ��");
							System.out.println("3. �ڷΰ���");
							System.out.println(" ");
							
							int ���׼���â = scan.nextInt();
							
							if(���׼���â ==1) {
								Buttonbgm ButtonBgm3 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm3.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        
						        System.out.println(" ");
						        
					    		String health[] = { // Ÿ���� ������ - �͸� Ŭ����
		
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
								      // �� �� �����Ѵ�
								      Thread.sleep(0);
								      // �޼����� ����Ѵ�
								      System.out.println(health[i]);
								}
							    
							    System.out.println(" ");
								System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
								System.out.println(" ");
								�Ĵ�.�ｺ��();
								�Ĵ�.���¾˸�();
								
							}else if(���׼���â == 2) {
								Buttonbgm ButtonBgm3 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm3.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
							    String ChickenandBeer[] = { // Ÿ���� ������ - �͸� Ŭ����

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
								      // �� �� �����Ѵ�
								      Thread.sleep(100);
								      // �޼����� ����Ѵ�
								      System.out.println(ChickenandBeer[i]);
								}
							    System.out.println(" ");
								System.out.println("ġ������ ��Ʈ������ Ǳ�ϴ�.");
								�Ĵ�.ġ��();
								�Ĵ�.���¾˸�();
								
							}else if(���׼���â == 3) {
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
								System.out.println("�ٽ� �Է��ϼ���."); // ������ �����Ͻðٽ��ϱ�?�� �ߵ���. ��ó�� ���θ޴�â�� �ƴ϶�.
								continue; 						   // �� if���� while�� �ȿ� �ְ� �Ǹ� �������⼱��â == 2�� 1.Ȱ�� 2. ����Ȯ�� 3. �������Ⱑ ���;�
							}
							
							// (����) ���׿��� ���뿡�� ����� ����ģ�� ���� // �� ����ģ���� ���� �� �ǳ� Ȯ�� 10% // �� ���� ��������!
							Character Xgirlfriend = new Character(); 
							Xgirlfriend.���� = "�� ����ģ��";
							
							if(Xgirlfriend.talkfirst()) {
								
								EventBgm EventBgm = new EventBgm();
								
						        try {
						        	EventBgm.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        
								System.out.println("���� ���� �̺�Ʈ <�� ����ģ������ ����>");
								System.out.println("���׿��� �쿬�� �� ����ģ���� �������ϴ�.");
								System.out.println("�� �����Ĵ� �Ⱥ��λ縦 �ǳ׿ɴϴ�.");
								System.out.println("1. ���� �Ⱥ��λ縦 ���ش�. ");
								System.out.println("2. �����ϰ� ��������. ");

								//��ü.��ü�Լ���. ��ü�� ���!	
								
								int ������ģ������â = scan.nextInt();
								
								if(������ģ������â == 1) {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[�Ĵ�] �� �������̳� ������");	
									Xgirlfriend.�Ĵ���_��Ʈ��������_����(10);
									�Ĵ�.���¾˸�();
									
								}else if(������ģ������â == 2) {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[�Ĵ�] (�λ縦 �� �ϴ°���)");
									Xgirlfriend.�Ĵ���_����������_����(10);
									�Ĵ�.���¾˸�();					
								}else {
									Buttonbgm ButtonBgm3 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm3.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 	
								}
								
							}else {
								System.out.println("�����̺�Ʈ�� �����ϴ�.");
							}
							
					    }else if(���б⼱��â == 3) {
							Buttonbgm ButtonBgm2 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm2.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println(" ");
					    	System.out.println("���� �Խ��ϴ�.");
							System.out.println("������ ������ �Ͻðڽ��ϱ�?");
							System.out.println("1. �θ�԰� �Ļ�");
							System.out.println("2. �ϱ⾲��");
							System.out.println("3. �����ڱ�");
							System.out.println("4. �ڷΰ���");
							System.out.println(" ");
							
							int ������â = scan.nextInt();
							
							if(������â ==1) {
								//��ưȿ����
								Buttonbgm ButtonBgm3 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm3.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        
								String parents[] = {
										"�θ�԰� �Ļ��ϸ� ��� ���� �̾߱⸦ �մϴ�.",
										"[�θ��] ����غ�� �� �� �ǰ� �ִ�?",
										"[�Ĵ�] ������� ������ �ϰ� �־�� ����",
										"[�θ��] �׷��׷� �� ȥ�� �˾Ƽ� �� �ϸ��� �ϴ´� ���� ",
										"[�Ĵ�] (��.. �̷��Գ� �� �Ͼ��ֽôµ� �� �ȵǳ� �Ф�) ",
										"[�θ��] �� ���� �԰� ������ �Ƶ�",
										" "
								};
								
								for (int i = 0; i <parents.length; i++) {
									Thread.sleep(500);//0.5�ʸ��� �� ���徿 ���
									System.out.println(parents[i]);
								}
								System.out.println(" ");

								�Ĵ�.�θ�԰��Ļ�();
								
								RelativeClass relative = new RelativeClass();
								relative.RelativeCome();
								relative.join(); 
//								RelativeClass uncle = new RelativeClass();
//								RelativeClass aunt = new RelativeClass();		
//								RelativeClass java = new RelativeClass();


								
//								sister.get("[���̵���] ����~~~ �� ���¾�??! ���� ��� ����");
//								uncle.get("[�̸��] �ĴϾ� �������̴�! ���� ���л��ΰ�?" );
//								aunt.get("[�̸�] �Ĵ� ���� ��� ������? ����� ���� �Ϸ���? �������� ������ ���� ����?");
								
								
								System.out.println(" ");
								System.out.println(" ");

								
								// �����̺�Ʈ ��
								
								�Ĵ�.���¾˸�();
								
								
							}else if(������â == 2) {
								Buttonbgm ButtonBgm3 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm3.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								
								 String Diary[] = { // Ÿ���� ������ - �͸� Ŭ����

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
										      // �� �� �����Ѵ�
										      Thread.sleep(100);
										      // �޼����� ����Ѵ�
										      System.out.println(Diary[i]);
										}
									    System.out.println(" ");
									    System.out.println("�ϱ⸦ ���� �Ϸ縦 �����ϰ� �����θ� �����̴ϴ�.");
								�Ĵ�.�ϱ�();
								�Ĵ�.���¾˸�();
								
					    	}else if(������â == 3) {
								Buttonbgm ButtonBgm3 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm3.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
					    		String nap[] = { // Ÿ���� ������ - �͸� Ŭ����
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
								      // �� �� �����Ѵ�
								      Thread.sleep(100);
								      // �޼����� ����Ѵ�
								      System.out.println(nap[i]);
								}
							    System.out.println(" ");
							    
					    		System.out.println("������ ���� ������ ü���� �����մϴ�.");
					    		�Ĵ�.����();
					    		�Ĵ�.���¾˸�();
					    		
					    	}else if(������â == 4) {
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
								System.out.println("�ٽ� �Է��ϼ���."); 
								continue; 						
							}
							
							//(��) ���� �ִµ� �����⿡�� ������ �հ��ߴٴ� ī���� �� Ȯ�� 10%
							
							Character UniversityFriend = new Character(); 
							UniversityFriend.���� = "������";
							
							if(UniversityFriend.kakaotalk()) {
								
								EventBgm EventBgm = new EventBgm();
								
						        try {
						        	EventBgm.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        
								System.out.println("�� ���� �̺�Ʈ <�������� ������ �հݼҽ�>");
								System.out.println("��ҿ� ������ ���� �����⿡�� ������ �հ��ߴٰ� �����ɴϴ�.");
								System.out.println("1. ���ϴ����� ���ش�.");
								System.out.println("2. �о��Ѵ�.");

								//��ü.��ü�Լ���. ��ü�� ���!	
								
								int �����⼱��â = scan.nextInt();
								
								if(�����⼱��â == 1) {
									Buttonbgm ButtonBgm3 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm3.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[�Ĵ�] ������ ������������");	
									UniversityFriend.�Ĵ���_��Ʈ��������_����(10);
									�Ĵ�.���¾˸�();
									
								}else if(�����⼱��â == 2) {
									Buttonbgm ButtonBgm3 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm3.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[�Ĵ�] (�о�) ���� ģ������ �ʾҴµ� ;;");
									UniversityFriend.�Ĵ���_����������_����(10);
									�Ĵ�.���¾˸�();					
								}else {
									Buttonbgm ButtonBgm3 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm3.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("�ٽ� �Է��ϼ���."); // ���� ������ ���丵�� �����Ͻðڽ��ϱ�?�� �ߵ���.
									continue; 	
								}
								
							}else {
								System.out.println("�����̺�Ʈ�� �����ϴ�.");
							}
							
					    }else if(���б⼱��â == 4) {
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
							System.out.println("�ٽ� �Է��ϼ���.");
					    	continue;
					    }
					    
					}
					
//					System.out.println("4�г� 1�б� : " + turnsOfSpringsemester+"/16" + "��° ���Դϴ�.");
					turnsOfSpringsemester ++;	
					
				}else if(���θ޴�����â == 2){
					Buttonbgm ButtonBgm2 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm2.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
				
					�Ĵ�.���¾˸�();
					
				}else if(���θ޴�����â == 3) {
					Buttonbgm ButtonBgm2 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm2.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
						
					System.out.println("������ �����Ͻðڽ��ϱ�?");
					System.out.println("1. ��");
					System.out.println("2. �ƴϿ�");
					
					int �������⼱��â = scan.nextInt();
					
					if(�������⼱��â ==1) {
						Buttonbgm ButtonBgm3 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm3.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println("4�г� 1�б� ����غ� �����߽��ϴ�.");
						
						
						break;

					}else if(�������⼱��â == 2) {
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
						System.out.println("�ٽ� �Է��ϼ���."); // ������ �����Ͻðٽ��ϱ�?�� �ߵ���. ��ó�� ���θ޴�â�� �ƴ϶�.
						continue; 						   // �� if���� while�� �ȿ� �ְ� �Ǹ� �������⼱��â == 2�� 1.Ȱ�� 2. ����Ȯ�� 3. �������Ⱑ ���;�
					}
					
				}else {
					Buttonbgm ButtonBgm2 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm2.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					System.out.println("�ٽ� �Է��ϼ���.");
					continue;
				}

			}	
			
			
			System.out.println("4�г� 1�бⰡ �������ϴ�.");
			System.out.println("���������� ���۵Ǿ����ϴ�.");
			System.out.println("�������п� �ڰ��� �ܿ� �پ��� ����� �� �ϳ��� ���� �� �ֽ��ϴ�.");
			
			
			while (true) {
				Buttonbgm ButtonBgm2 = new Buttonbgm();
				
		        try {
		        	 ButtonBgm2.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
				System.out.println(" ");
				System.out.println("< ���θ޴� > ");
				System.out.println("1. Ȱ��"); // 1�� Ȱ��, 2�� ����Ȯ��, 3�� ��������
				System.out.println("2. ����Ȯ��");
				System.out.println("3. �������� ��������");
				System.out.println(" ");
						
				int ���θ޴�����â = scan.nextInt();
				
				if ( ���θ޴�����â == 1) {

					if (true) {
						Buttonbgm ButtonBgm3 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm3.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println(" ");
						System.out.println("������ �Ͻðڽ��ϱ�?");
						System.out.println("1. ����");
						System.out.println("2. ���Ȱ��");
						System.out.println("3. ������");
						System.out.println("4. �ڷΰ���");
						System.out.println(" ");

						int �������м���â = scan.nextInt();

					    if (�������м���â == 1) {
							Buttonbgm ButtonBgm4 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm4.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println("�б� ������ ���������Դϴ�."); // ������� �����մϴ�. ���� ���� Ȯ��
							���� ���� = new ����();
							����.�Ĵ���_��������_����(10);
							����.�Ĵ���_�ʱ�����_����(5);
							����.�Ĵ���_��������_����(5);
							����.�Ĵ���_ü������_����(10);
							����.�Ĵ���_����������_����(5);
							����.�Ĵ���_��Ʈ��������_����(10);
//							����.����_�߰�();
							
							�Ĵ�.���¾˸�();
							
							break;
					    
					    }else if(�������м���â == 2) {
							Buttonbgm ButtonBgm4 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm4.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println(" ");
					    	System.out.println("� ���Ȱ���� �Ͻðڽ��ϱ�?");
							System.out.println("1. ���ڴ�");
							System.out.println("2. ��������");
							System.out.println("3. �ڷΰ���");
							System.out.println(" ");

							int ���Ȱ������â = scan.nextInt();
							
							if(���Ȱ������â ==1) {
								Buttonbgm ButtonBgm5 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm5.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("�������� ���� ���� ���ڴ��� �����մϴ�."); // ���� �� �������� ��簡 ����
								���ڴ� ���ڴ� = new ���ڴ�();
								���ڴ�.�Ĵ���_��������_����(10);
								���ڴ�.�Ĵ���_��������_����(5);
								���ڴ�.�Ĵ���_ü������_����(10);
								���ڴ�.�Ĵ���_��Ʈ��������_����(10);

								
								�Ĵ�.���¾˸�();
								
							}else if(���Ȱ������â == 2) {
								Buttonbgm ButtonBgm5 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm5.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("�������� ���� ���� ������� �����մϴ�."); // ���ڱ� ������ ����.
								�������� �������� = new ��������();
								��������.�Ĵ���_��������_����(10);
								��������.�Ĵ���_��������_����(5);
								��������.�Ĵ���_ü������_����(10);
								��������.�Ĵ���_��Ʈ��������_����(10);

								
								�Ĵ�.���¾˸�();
								
							}else if(���Ȱ������â == 3) {
								Buttonbgm ButtonBgm5 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm5.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								continue;
							}else {
								System.out.println("�ٽ� �Է��ϼ���.");
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
							
					    }else if(�������м���â == 3) {
							Buttonbgm ButtonBgm1 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm1.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println(" ");
					    	System.out.println("� �������� �Ͻðڽ��ϱ�?");
							System.out.println("1. ���̵�� ������");
							System.out.println("2. ��������");
							System.out.println("3. �ڷΰ���");
							System.out.println(" ");
							
							int ����������â = scan.nextInt();
							
							if(����������â ==1) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("�������� ���� ���̵�� �������� �����մϴ�."); // �ٸ� ���� �� ���̵�� ����
								���̵������� ���̵������� = new ���̵�������();
								���̵�������.�Ĵ���_��������_����(10);
								���̵�������.�Ĵ���_��������_����(5);
								���̵�������.�Ĵ���_ü������_����(10);
								���̵�������.�Ĵ���_��Ʈ��������_����(10);
								���̵�������.â�Ƿ�_�߰�();
								
								�Ĵ�.���¾˸�();
								
							}else if(����������â == 2) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("�������� ���� ���������� �����մϴ�."); // ���� ���԰� �ɻ��� Ȯ�� 	
								�������� �������� = new ��������();
								��������.�Ĵ���_��������_����(10);
								��������.�Ĵ���_��������_����(5);
								��������.�Ĵ���_ü������_����(10);
								��������.�Ĵ���_��Ʈ��������_����(10);
								��������.����_�߰�();
								
								�Ĵ�.���¾˸�();
								
					    	}else if(����������â == 3) {
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
								System.out.println("�ٽ� �Է��ϼ���."); 
								continue; 						   
							}
						
							break;	
							
					    }else if(�������м���â == 4) {
							Buttonbgm ButtonBgm4 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm4.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
					    	continue;
					    }else {
							System.out.println("�ٽ� �Է��ϼ���.");
					    	continue;
					    }
					    
					}	
					
				}else if(���θ޴�����â == 2){
					Buttonbgm ButtonBgm1 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm1.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
				
					�Ĵ�.���¾˸�();
					
				}else if(���θ޴�����â == 3) {
					Buttonbgm ButtonBgm1 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm1.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
						
					System.out.println("�������� ������ �����Ͻðڽ��ϱ�?");
					System.out.println("1. ��");
					System.out.println("2. �ƴϿ�");
					
					int �������⼱��â = scan.nextInt();
					
					if(�������⼱��â ==1) {
						Buttonbgm ButtonBgm3 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm3.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
				        System.out.println("�������� ����غ� �����߽��ϴ�.");
						
						
						break;

					}else if(�������⼱��â == 2) {
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
						System.out.println("�ٽ� �Է��ϼ���."); 
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
					System.out.println("�ٽ� �Է��ϼ���.");
					continue;
				}

			}
			
			System.out.println("���������� ������,");
			System.out.println("4�г� 2�бⰡ ���۵Ǿ����ϴ�.");
			System.out.println("===========================================================");
			System.out.println("2�б�� 9���� �� �� ���Դϴ�.");
			System.out.println("10���� �� �� �� ������ �����ؾ� �մϴ�.");
			System.out.println("11���� �� �� �� �ʱ������� �����ؾ� �մϴ�.");
			System.out.println("12���� �� �� �� ���������� �����ؾ� �մϴ�.");
			System.out.println("�� ������ �ʿ��� ������� �ڱ������ �����սô�!");
			System.out.println("===========================================================");	
			int Sep = 1; // 9�� �� ��!
			
			while (Sep <= 4) {
				Buttonbgm ButtonBgm1 = new Buttonbgm();
				
		        try {
		        	 ButtonBgm1.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
				System.out.println(" ");
				System.out.println("< ���θ޴� > ");
				System.out.println("1. Ȱ��"); // 1�� Ȱ��, 2�� ����Ȯ��, 3�� ��������
				System.out.println("2. ����Ȯ��");
				System.out.println("3. ��������");
				System.out.println(" ");

				int ���θ޴�����â = scan.nextInt();
				
				if ( ���θ޴�����â == 1) {

					if (true) {
						Buttonbgm ButtonBgm2 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm2.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println("4�г� 2�б� 9�� : " + Sep + "/4" + "��° ���Դϴ�.");
						System.out.println("��� ���ðڽ��ϱ�?");
						System.out.println("1. �б��� ����");
						System.out.println("2. ���׿� ����");
						System.out.println("3. ���� ����");
						System.out.println("4. �ڷΰ���");
						System.out.println("<< �б�, ����, �� ���� ����Ȯ���� �̺�Ʈ�� Ƣ��ɴϴ�. >>");

						
						int ���б⼱��â = scan.nextInt();

					    if (���б⼱��â == 1) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println("�б��� �Խ��ϴ�.");
							System.out.println("�б����� ������ �Ͻðڽ��ϱ�?");
							System.out.println("1. ��������");
							System.out.println("2. �������Ƹ�Ȱ��");
							System.out.println("3. ����������� ������");
							System.out.println("4. �������͵�");
							System.out.println("5. �ڷΰ���");

							int �б�����â = scan.nextInt();
							
							if(�б�����â ==1) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        System.out.println("��.. �������� ������ �ؾ���!!");
								System.out.println("�б����� ������ ���������� �մϴ�.");
								System.out.println(" ");
								�Ĵ�.��������();
								
								System.out.println(" ");
								
								SomethingGirl SomethingGirl = new SomethingGirl();

								SomethingGirl.SomethingGirlCome();
								SomethingGirl.join(); 
								System.out.println(" ");
								
								�Ĵ�.���¾˸�();
								
							}else if(�б�����â == 2) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("���Ƹ����� ����鿡�� ��������� ����ϴ�.");
								�Ĵ�.�������Ƹ�����_����();
								System.out.println(" ");
								
								CircleBroThread CircleBro = new CircleBroThread();

								CircleBro.CircleBroCome();
								CircleBro.join(); 
								System.out.println(" ");
								�Ĵ�.���¾˸�();
								
							}else if(�б�����â == 3) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("����������ο��� �������� �޽��ϴ�.");
								�Ĵ�.�����������_������();
								�Ĵ�.���¾˸�();
								
							}else if(�б�����â == 4) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("�������͵� ���� ���������� ��ȭ��ŵ�ϴ�.");
								�Ĵ�.�������͵�_����();
								
								InterviewStudyMember Studymember= new InterviewStudyMember();

								Studymember.GoFeedback();
								Studymember.join(); 
								
								�Ĵ�.���¾˸�();
								
							}else if(�б�����â == 5) {
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
								System.out.println("�ٽ� �Է��ϼ���."); 
								continue; 						 
							}
							
							
							Character InterviewFriend = new Character(); 
							InterviewFriend.���� = "������͵��";
							
								if(InterviewFriend.SuccessFirst()) {
									
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
							        
									System.out.println("�б� ���� �̺�Ʈ <������͵���� ���� �հ��߽��ϴ�.>");
									System.out.println("������Ƽ�� �����Ͻðڽ��ϱ�?");
									System.out.println("1. ����");
									System.out.println("2. ����");
		
									//��ü.��ü�Լ���. ��ü�� ���!	
									
									int goparty = scan.nextInt();
									
									if(goparty == 1) {
										Buttonbgm ButtonBgm5 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm5.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("������Ƽ�� ������ ���� ������� ����ϴ�.");	
										InterviewFriend.�Ĵ���_��������_����(5);
										InterviewFriend.�Ĵ���_�ʱ�����_����(5);
										InterviewFriend.�Ĵ���_��������_����(5);
										InterviewFriend.�Ĵ���_ü������_����(10);
										InterviewFriend.�Ĵ���_����������_����(5);
										
										�Ĵ�.���¾˸�();
										
									}else if(goparty == 2) {
										Buttonbgm ButtonBgm5 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm5.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("������Ƽ�� �����ϰ� ü���� ȸ���մϴ�.");
										InterviewFriend.�Ĵ���_ü������_����(15);
										InterviewFriend.�Ĵ���_����������_����(5);
										InterviewFriend.�Ĵ���_��Ʈ��������_����(5);
										
										�Ĵ�.���¾˸�();					
									}else {
										Buttonbgm ButtonBgm4 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm4.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("�ٽ� �Է��ϼ���.");
										continue; 	
									}
									
								}else {
									
									System.out.println("�����̺�Ʈ�� �����ϴ�.");
								}
							
							
					    }else if(���б⼱��â == 2) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
					    	System.out.println("���׿� �Խ��ϴ�.");
							System.out.println("���׿��� ������ �Ͻðڽ��ϱ�?");
							System.out.println("1. �ｺ");
							System.out.println("2. ġ��");
							System.out.println("3. �ڷΰ���");
							
							int ���׼���â = scan.nextInt();
							
							if(���׼���â ==1) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        
						        System.out.println(" ");
						        
					    		String health[] = { // Ÿ���� ������ - �͸� Ŭ����
		
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
								      // �� �� �����Ѵ�
								      Thread.sleep(0);
								      // �޼����� ����Ѵ�
								      System.out.println(health[i]);
								}
							    
							    System.out.println(" ");
								System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
								System.out.println(" ");
								�Ĵ�.�ｺ��();
								�Ĵ�.���¾˸�();
								
							}else if(���׼���â == 2) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								String ChickenandBeer[] = { // Ÿ���� ������ - �͸� Ŭ����

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
									      // �� �� �����Ѵ�
									      Thread.sleep(100);
									      // �޼����� ����Ѵ�
									      System.out.println(ChickenandBeer[i]);
									}
								    System.out.println(" ");
									System.out.println("ġ������ ��Ʈ������ Ǳ�ϴ�.");
									�Ĵ�.ġ��();
									�Ĵ�.���¾˸�();
							
								
							}else if(���׼���â == 3) {
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
								System.out.println("�ٽ� �Է��ϼ���."); 
								continue; 						 
							}
							
							// (����) ����б� ģ������ �Ⱥ���ȭ �� Ȯ�� 10% 
							
							Character HighschoolFriend = new Character(); 
							HighschoolFriend.���� = "����б� ģ��";
							
								if(HighschoolFriend.HiCall()) {
								EventBgm EventBgm = new EventBgm();
								
						        try {
						        	EventBgm.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								
								System.out.println("���� ���� �̺�Ʈ <����б� ģ���� �Ⱥ���ȭ>");
								System.out.println("�ذ� �ִ� ����б� ģ������ ��ȭ�� �ɴϴ�.");
								System.out.println("1. ��ȭ�� �޴´�. ");
								System.out.println("2. ��ȭ�� ���� �ʴ´�. ");

								//��ü.��ü�Լ���. ��ü�� ���!	
								
								int �Ⱥ���ȭ����â = scan.nextInt();
								
								if(�Ⱥ���ȭ����â == 1) {
									Buttonbgm ButtonBgm5 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm5.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[����б� ģ��] �� �ĴϾ�! �Ʊ� ���׿��� �� �� �� ���Ƽ� ��ȭ�߾�!");	
									System.out.println("[����б� ģ��] �� ������ �־���?");	
									System.out.println("[����б� ģ��] ������ ���ķ� �� ���� ���ôµ�! ���� �ʹپ�!");
									System.out.println("[�Ĵ�] ���� ƴ�� ���ֳ�!");
									System.out.println("[�Ĵ�] ���� ���� �ʹپ�!");
									
									HighschoolFriend.�Ĵ���_ü������_����(10);
									HighschoolFriend.�Ĵ���_����������_����(10);
									HighschoolFriend.�Ĵ���_��Ʈ��������_����(10);
									
									�Ĵ�.���¾˸�();
									
								}else if(�Ⱥ���ȭ����â == 2) {
									Buttonbgm ButtonBgm5 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm5.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[�Ĵ�] �� ���� ������.. �����ϱ� ������..");
									HighschoolFriend.�Ĵ���_����������_����(10);
									HighschoolFriend.�Ĵ���_��Ʈ��������_����(10);
									
									�Ĵ�.���¾˸�();					
								}else {
									Buttonbgm ButtonBgm5 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm5.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 	
								}
								
							}else {
								System.out.println("�����̺�Ʈ�� �����ϴ�.");
							}
							
					    }else if(���б⼱��â == 3) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
					    	System.out.println("���� �Խ��ϴ�.");
							System.out.println("������ ������ �Ͻðڽ��ϱ�?");
							System.out.println("1. �θ�԰� �Ļ�");
							System.out.println("2. �ϱ⾲��");
							System.out.println("3. �����ڱ�");
							System.out.println("4. �ڷΰ���");
							
							int ������â = scan.nextInt();
							
							if(������â ==1) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        String parents[] = {
										"�θ�԰� �Ļ��ϸ� ��� ���� �̾߱⸦ �մϴ�.",
										"[�θ��] ����غ�� �� �� �ǰ� �ִ�?",
										"[�Ĵ�] ������� ������ �ϰ� �־�� ����",
										"[�θ��] �׷��׷� �� ȥ�� �˾Ƽ� �� �ϸ��� �ϴ´� ���� ",
										"[�Ĵ�] (��.. �̷��Գ� �� �Ͼ��ֽôµ� �� �ȵǳ� �Ф�) ",
										"[�θ��] �� ���� �԰� ������ �Ƶ�",
										" "
								};
								
								for (int i = 0; i <parents.length; i++) {
									Thread.sleep(500);//0.5�ʸ��� �� ���徿 ���
									System.out.println(parents[i]);
								}
								System.out.println(" ");

								�Ĵ�.�θ�԰��Ļ�();
								System.out.println(" ");

								RelativeClass relative = new RelativeClass();
								relative.RelativeCome();
								relative.join(); 
								System.out.println(" ");

								�Ĵ�.���¾˸�();
								
							}else if(������â == 2) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								 String Diary[] = { // Ÿ���� ������ - �͸� Ŭ����

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
								      // �� �� �����Ѵ�
								      Thread.sleep(100);
								      // �޼����� ����Ѵ�
								      System.out.println(Diary[i]);
								}
							    System.out.println(" ");
							    System.out.println("�ϱ⸦ ���� �Ϸ縦 �����ϰ� �����θ� �����̴ϴ�.");
						�Ĵ�.�ϱ�();
						�Ĵ�.���¾˸�();
					    	}else if(������â == 3) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
					    		String nap[] = { // Ÿ���� ������ - �͸� Ŭ����
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
									      // �� �� �����Ѵ�
									      Thread.sleep(100);
									      // �޼����� ����Ѵ�
									      System.out.println(nap[i]);
									}
								    System.out.println(" ");
								    
						    		System.out.println("������ ���� ������ ü���� �����մϴ�.");
						    		�Ĵ�.����();
						    		�Ĵ�.���¾˸�();
					    		
					    	}else if(������â == 4) {
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
								System.out.println("�ٽ� �Է��ϼ���."); 
								continue; 						
							}
							
							//(��) ������ ����ȣ�� �ؾ��մϴ�.
							Character Bro = new Character(); 
							Bro.���� = "������";
							
							if(Bro.gohospital()) {
								EventBgm EventBgm = new EventBgm();
								
						        try {
						        	EventBgm.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("�� ���� �̺�Ʈ <������ �Կ�>");
								System.out.println("������ �Կ��߽��ϴ�.");
								System.out.println("����ȣ�� �Ͻðڽ��ϱ�?");
								System.out.println("1. ����ȣ�� �Ѵ�.");
								System.out.println("2. ���� �ʴ´�.");

								//��ü.��ü�Լ���. ��ü�� ���!	
								
								int ����ȣ����â = scan.nextInt();
								
								if(����ȣ����â == 1) {
									Buttonbgm ButtonBgm5 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm5.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[�Ĵ�] (��.. ���ؿ� �����ϱ���..)");	
									System.out.println("[�Ĵ�] ���� �� ���� �׷��� �Ф�");	
									Bro.�Ĵ���_ü������_����(5);
									Bro.�Ĵ���_��Ʈ��������_����(5);
									�Ĵ�.���¾˸�();
									
								}else if(����ȣ����â == 2) {
									Buttonbgm ButtonBgm5 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm5.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[�Ĵ�] �ʹ� �ٺ�.. �Ϲݱ� �غ��ؾ���..�Ф�");
									Bro.�Ĵ���_��Ʈ��������_����(5);
									Bro.�Ĵ���_����������_����(5);
									�Ĵ�.���¾˸�();					
								}else {
									Buttonbgm ButtonBgm5 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm5.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("�ٽ� �Է��ϼ���.");
									continue; 	
								}
								
							}else {
								System.out.println("�����̺�Ʈ�� �����ϴ�.");
							}
							
					    }else if(���б⼱��â == 4) {
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
							System.out.println("�ٽ� �Է��ϼ���.");
					    	continue;
					    }
					    
					}
					
					Sep ++;	
					
				}else if(���θ޴�����â == 2){
					Buttonbgm ButtonBgm2 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm2.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
				
					�Ĵ�.���¾˸�();
					
				}else if(���θ޴�����â == 3) {
					Buttonbgm ButtonBgm2 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm2.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
						
					System.out.println("������ �����Ͻðڽ��ϱ�?");
					System.out.println("1. ��");
					System.out.println("2. �ƴϿ�");
					
					int �������⼱��â = scan.nextInt();
					
					if(�������⼱��â ==1) {
						System.out.println("9�� ����غ� �����߽��ϴ�.");					
						System.out.println("���� 10���Դϴ�.");
						
//						FinishBgm FinishBgm = new FinishBgm(); // ���������ϸ� �ǴϽú�� ������!
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

					}else if(�������⼱��â == 2) {
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
						System.out.println("�ٽ� �Է��ϼ���."); // ������ �����Ͻðٽ��ϱ�?�� �ߵ���. ��ó�� ���θ޴�â�� �ƴ϶�.
						continue; 						   // �� if���� while�� �ȿ� �ְ� �Ǹ� �������⼱��â == 2�� 1.Ȱ�� 2. ����Ȯ�� 3. �������Ⱑ ���;�
					}
					
				}else {
					Buttonbgm ButtonBgm2 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm2.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					System.out.println("�ٽ� �Է��ϼ���.");
					continue;
				}

			}
			
			System.out.println("10���Դϴ�.");	
			System.out.println("10�� �������ֿ� ���������� �ֽ��ϴ�.");					
			
			int OCT = 1; // 10�� �� ��! �� ���� ����!!
			
			while (OCT <= 3) {
				Buttonbgm ButtonBgm1 = new Buttonbgm();
				
		        try {
		        	 ButtonBgm1.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
				System.out.println(" ");
				System.out.println("< ���θ޴� > ");
				System.out.println("1. Ȱ��"); // 1�� Ȱ��, 2�� ����Ȯ��, 3�� ��������
				System.out.println("2. ����Ȯ��");
				System.out.println("3. ��������");
				System.out.println(" ");
						
				int ���θ޴�����â = scan.nextInt();
				
				if ( ���θ޴�����â == 1) {

					if (true) {
						Buttonbgm ButtonBgm2 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm2.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println(" ");
						System.out.println("4�г� 2�б� 10�� : " + OCT + "/3" + "��° ���Դϴ�.");
						System.out.println("��� ���ðڽ��ϱ�?");
						System.out.println("1. �б��� ����");
						System.out.println("2. ���׿� ����");
						System.out.println("3. ���� ����");
						System.out.println("4. �ڷΰ���");
						System.out.println("<< �б�, ����, �� ���� ����Ȯ���� �̺�Ʈ�� Ƣ��ɴϴ�. >>");

						System.out.println(" ");
						
						int ���б⼱��â = scan.nextInt();

					    if (���б⼱��â == 1) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println(" ");
							System.out.println("�б��� �Խ��ϴ�.");
							System.out.println("�б����� ������ �Ͻðڽ��ϱ�?");
							System.out.println("1. ��������");
							System.out.println("2. �������Ƹ�Ȱ��");
							System.out.println("3. ����������� ������");
							System.out.println("4. �������͵�");
							System.out.println("5. �ڷΰ���");
							System.out.println(" ");

							int �б�����â = scan.nextInt();
							
							if(�б�����â ==1) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        System.out.println("��.. �������� ������ �ؾ���!!");
								System.out.println("�б����� ������ ���������� �մϴ�.");
								�Ĵ�.��������();
								
								System.out.println(" ");
								
								SomethingGirl SomethingGirl = new SomethingGirl();

								SomethingGirl.SomethingGirlCome();
								SomethingGirl.join(); 
								System.out.println(" ");
								�Ĵ�.���¾˸�();
								
							}else if(�б�����â == 2) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("���Ƹ����� ����鿡�� ��������� ����ϴ�.");
								�Ĵ�.�������Ƹ�����_����();
								System.out.println(" ");
								
								CircleBroThread CircleBro = new CircleBroThread();

								CircleBro.CircleBroCome();
								CircleBro.join(); 
								System.out.println(" ");
								�Ĵ�.���¾˸�();
								
							}else if(�б�����â == 3) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("����������ο��� �������� �޽��ϴ�.");
								�Ĵ�.�����������_������();
								�Ĵ�.���¾˸�();
								
							}else if(�б�����â == 4) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("�������͵� ���� ���������� ��ȭ��ŵ�ϴ�.");
								�Ĵ�.�������͵�_����();
								
								InterviewStudyMember Studymember= new InterviewStudyMember();

								Studymember.GoFeedback();
								Studymember.join(); 
								
								�Ĵ�.���¾˸�();
								
							}else if(�б�����â == 5) {
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
								System.out.println("�ٽ� �Է��ϼ���."); 
								continue; 						 
							}
							
							// (�б�) ������͵�� ���� �հ��ؼ� ����Ƽ �� Ȯ�� 10%

//							int ���丵Ƚ��;
//							���丵Ƚ�� = 0;
//							while(���丵Ƚ��<1)
							
							Character InterviewFriend = new Character(); 
							InterviewFriend.���� = "������͵��";
							
								if(InterviewFriend.SuccessFirst()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							             
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("�б� ���� �̺�Ʈ <������͵���� ���� �հ��߽��ϴ�.>");
									System.out.println("������Ƽ�� �����Ͻðڽ��ϱ�?");
									System.out.println("1. ����");
									System.out.println("2. ����");
		
									//��ü.��ü�Լ���. ��ü�� ���!	
									
									int goparty = scan.nextInt();
									
									if(goparty == 1) {
										Buttonbgm ButtonBgm5 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm5.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("������Ƽ�� ������ ���� ������� ����ϴ�.");	
										InterviewFriend.�Ĵ���_��������_����(5);
										InterviewFriend.�Ĵ���_�ʱ�����_����(5);
										InterviewFriend.�Ĵ���_��������_����(5);
										InterviewFriend.�Ĵ���_ü������_����(10);
										InterviewFriend.�Ĵ���_����������_����(5);
										
										�Ĵ�.���¾˸�();
										
									}else if(goparty == 2) {
										Buttonbgm ButtonBgm5 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm5.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("������Ƽ�� �����ϰ� ü���� ȸ���մϴ�.");
										InterviewFriend.�Ĵ���_ü������_����(15);
										InterviewFriend.�Ĵ���_����������_����(5);
										InterviewFriend.�Ĵ���_��Ʈ��������_����(5);
										
										�Ĵ�.���¾˸�();					
									}else {
										Buttonbgm ButtonBgm5 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm5.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("�ٽ� �Է��ϼ���.");
										continue; 	
									}
									
								}else {
									System.out.println("�����̺�Ʈ�� �����ϴ�.");
								}
							
							
					    }else if(���б⼱��â == 2) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println(" ");
					    	System.out.println("���׿� �Խ��ϴ�.");
							System.out.println("���׿��� ������ �Ͻðڽ��ϱ�?");
							System.out.println("1. �ｺ");
							System.out.println("2. ġ��");
							System.out.println("3. �ڷΰ���");
							System.out.println(" ");
							
							int ���׼���â = scan.nextInt();
							
							if(���׼���â ==1) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        
						        System.out.println(" ");
						        
					    		String health[] = { // Ÿ���� ������ - �͸� Ŭ����
		
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
								      // �� �� �����Ѵ�
								      Thread.sleep(0);
								      // �޼����� ����Ѵ�
								      System.out.println(health[i]);
								}
							    
							    System.out.println(" ");
								System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
								System.out.println(" ");
								�Ĵ�.�ｺ��();
								�Ĵ�.���¾˸�();
								
							}else if(���׼���â == 2) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
								�Ĵ�.�ｺ��();
								�Ĵ�.���¾˸�();
								String ChickenandBeer[] = { // Ÿ���� ������ - �͸� Ŭ����

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
									      // �� �� �����Ѵ�
									      Thread.sleep(100);
									      // �޼����� ����Ѵ�
									      System.out.println(ChickenandBeer[i]);
									}
								    System.out.println(" ");
									System.out.println("ġ������ ��Ʈ������ Ǳ�ϴ�.");
									�Ĵ�.ġ��();
									�Ĵ�.���¾˸�();
								
							}else if(���׼���â == 3) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
								�Ĵ�.�ｺ��();
								�Ĵ�.���¾˸�();
								continue;
							}else {
								System.out.println("�ٽ� �Է��ϼ���."); 
								continue; 						 
							}
							
							// (����) ����б� ģ������ �Ⱥ���ȭ �� Ȯ�� 10% 
							
							Character HighschoolFriend = new Character(); 
							HighschoolFriend.���� = "����б� ģ��";
							
							if(HighschoolFriend.HiCall()) {
								EventBgm EventBgm = new EventBgm();
								
						        try {
						        	EventBgm.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("���� ���� �̺�Ʈ <����б� ģ���� �Ⱥ���ȭ>");
								System.out.println("�ذ� �ִ� ����б� ģ������ ��ȭ�� �ɴϴ�.");
								System.out.println("1. ��ȭ�� �޴´�. ");
								System.out.println("2. ��ȭ�� ���� �ʴ´�. ");

								//��ü.��ü�Լ���. ��ü�� ���!	
								
								int �Ⱥ���ȭ����â = scan.nextInt();
								
								if(�Ⱥ���ȭ����â == 1) {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
									�Ĵ�.�ｺ��();
									�Ĵ�.���¾˸�();
									System.out.println("[����б� ģ��] �� �ĴϾ�! �Ʊ� ���׿��� �� �� �� ���Ƽ� ��ȭ�߾�!");	
									System.out.println("[����б� ģ��] �� ������ �־���?");	
									System.out.println("[����б� ģ��] ������ ���ķ� �� ���� ���ôµ�! ���� �ʹپ�!");
									System.out.println("[�Ĵ�] ���� ƴ�� ���ֳ�!");
									System.out.println("[�Ĵ�] ���� ���� �ʹپ�!");
									
									HighschoolFriend.�Ĵ���_ü������_����(10);
									HighschoolFriend.�Ĵ���_����������_����(10);
									HighschoolFriend.�Ĵ���_��Ʈ��������_����(10);
									
									�Ĵ�.���¾˸�();
									
								}else if(�Ⱥ���ȭ����â == 2) {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
									�Ĵ�.�ｺ��();
									�Ĵ�.���¾˸�();
									System.out.println("[�Ĵ�] �� ���� ������.. ���� ����� ������ ������..");
									HighschoolFriend.�Ĵ���_����������_����(10);
									HighschoolFriend.�Ĵ���_��Ʈ��������_����(10);
									
									�Ĵ�.���¾˸�();					
								}else {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
									�Ĵ�.�ｺ��();
									�Ĵ�.���¾˸�();
									System.out.println("�ٽ� �Է��ϼ���."); 
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
								System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
								�Ĵ�.�ｺ��();
								�Ĵ�.���¾˸�();
								System.out.println("�����̺�Ʈ�� �����ϴ�.");
							}
							
					    }else if(���б⼱��â == 3) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
							�Ĵ�.�ｺ��();
							�Ĵ�.���¾˸�();
							System.out.println(" ");
					    	System.out.println("���� �Խ��ϴ�.");
							System.out.println("������ ������ �Ͻðڽ��ϱ�?");
							System.out.println("1. �θ�԰� �Ļ�");
							System.out.println("2. �ϱ⾲��");
							System.out.println("3. �����ڱ�");
							System.out.println("4. �ڷΰ���");
							System.out.println(" ");
							
							int ������â = scan.nextInt();
							
							if(������â ==1) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        String parents[] = {
										"�θ�԰� �Ļ��ϸ� ��� ���� �̾߱⸦ �մϴ�.",
										"[�θ��] ����غ�� �� �� �ǰ� �ִ�?",
										"[�Ĵ�] ������� ������ �ϰ� �־�� ����",
										"[�θ��] �׷��׷� �� ȥ�� �˾Ƽ� �� �ϸ��� �ϴ´� ���� ",
										"[�Ĵ�] (��.. �̷��Գ� �� �Ͼ��ֽôµ� �� �ȵǳ� �Ф�) ",
										"[�θ��] �� ���� �԰� ������ �Ƶ�",
										" "
								};
								
								for (int i = 0; i <parents.length; i++) {
									Thread.sleep(500);//0.5�ʸ��� �� ���徿 ���
									System.out.println(parents[i]);
								}
								System.out.println(" ");

								�Ĵ�.�θ�԰��Ļ�();
								System.out.println(" ");
								
								RelativeClass relative = new RelativeClass();
								relative.RelativeCome();
								relative.join(); 
								
								�Ĵ�.���¾˸�();
								
							}else if(������â == 2) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }

								 String Diary[] = { // Ÿ���� ������ - �͸� Ŭ����

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
								      // �� �� �����Ѵ�
								      Thread.sleep(100);
								      // �޼����� ����Ѵ�
								      System.out.println(Diary[i]);
								}
							    System.out.println(" ");
							    System.out.println("�ϱ⸦ ���� �Ϸ縦 �����ϰ� �����θ� �����̴ϴ�.");
								�Ĵ�.�ϱ�();
								�Ĵ�.���¾˸�();
								
					    	}else if(������â == 3) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }

					    		String nap[] = { // Ÿ���� ������ - �͸� Ŭ����
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
										      // �� �� �����Ѵ�
										      Thread.sleep(100);
										      // �޼����� ����Ѵ�
										      System.out.println(nap[i]);
										}
									    System.out.println(" ");
									    
							    		System.out.println("������ ���� ������ ü���� �����մϴ�.");
							    		�Ĵ�.����();
							    		�Ĵ�.���¾˸�();
					    		
					    	}else if(������â == 4) {
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

								System.out.println("�ٽ� �Է��ϼ���."); 
								continue; 						
							}
							
							//(��) ������ ����ȣ�� �ؾ��մϴ�.
							Character Bro = new Character(); 
							Bro.���� = "������";
							
							if(Bro.gohospital()) {
								EventBgm EventBgm = new EventBgm();
								
						        try {
						        	EventBgm.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("�� ���� �̺�Ʈ <������ �Կ�>");
								System.out.println("������ �Կ��߽��ϴ�.");
								System.out.println("����ȣ�� �Ͻðڽ��ϱ�?");
								System.out.println("1. ����ȣ�� �Ѵ�.");
								System.out.println("2. ���� �ʴ´�.");

								//��ü.��ü�Լ���. ��ü�� ���!	
								
								int ����ȣ����â = scan.nextInt();
								
								if(����ȣ����â == 1) {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }

									
									System.out.println("[�Ĵ�] (��.. ���ؿ� �����ϱ���..)");	
									System.out.println("[�Ĵ�] ���� �� ���� �׷��� �Ф�");	
									Bro.�Ĵ���_ü������_����(5);
									Bro.�Ĵ���_��Ʈ��������_����(5);
									�Ĵ�.���¾˸�();
									
								}else if(����ȣ����â == 2) {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[�Ĵ�] �ʹ� �ٺ�.. �Ϲݱ� �غ��ؾ���..�Ф�");
									Bro.�Ĵ���_��Ʈ��������_����(5);
									Bro.�Ĵ���_����������_����(5);
									�Ĵ�.���¾˸�();					
								}else {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("�ٽ� �Է��ϼ���.");
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
								System.out.println("�����̺�Ʈ�� �����ϴ�.");
							}
							
					    }else if(���б⼱��â == 4) {
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
							System.out.println("�ٽ� �Է��ϼ���.");
					    	continue;
					    }
					    
					}
					
					OCT ++;	
					
				}else if(���θ޴�����â == 2){
					Buttonbgm ButtonBgm2 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm2.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
				
					�Ĵ�.���¾˸�();
					
				}else if(���θ޴�����â == 3) {
					Buttonbgm ButtonBgm2 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm2.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
						
					System.out.println("������ �����Ͻðڽ��ϱ�?");
					System.out.println("1. ��");
					System.out.println("2. �ƴϿ�");
					
					int �������⼱��â = scan.nextInt();
					
					if(�������⼱��â ==1) {
						Buttonbgm ButtonBgm3 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm3.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println("10�� ����غ� �����մϴ�.");					
						
//						FinishBgm FinishBgm = new FinishBgm(); // ���������ϸ� �ǴϽú�� ������!
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

					}else if(�������⼱��â == 2) {
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
						System.out.println("�ٽ� �Է��ϼ���."); // ������ �����Ͻðٽ��ϱ�?�� �ߵ���. ��ó�� ���θ޴�â�� �ƴ϶�.
						continue; 						   // �� if���� while�� �ȿ� �ְ� �Ǹ� �������⼱��â == 2�� 1.Ȱ�� 2. ����Ȯ�� 3. �������Ⱑ ���;�
					}
					
				}else {
					System.out.println("�ٽ� �Է��ϼ���.");
					continue;
				}

			}
			
			System.out.println("�Ϲݱ�ä�� ���� ���� �ְ��Դϴ�.");
			System.out.println("������ �����Ͻðڽ��ϱ�?");
			
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
			System.out.println("1�� : �����Ѵ�");
			System.out.println("2�� : ��������");
					
			int Apply2 = scan.nextInt();
			
			if(Apply2 == 1) {
	 			 
				 System.out.println(" ");
				 String JopPhoto[] = { // Ÿ���� ������ - �͸� Ŭ����

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
				      // �� �� �����Ѵ�
				      Thread.sleep(100);
				      // �޼����� ����Ѵ�
				      System.out.println(JopPhoto[i]);
				}
			    System.out.println(" ");
				

				
				System.out.println("�� ���������� ���� ĿƮ���ΰ� ���մϴ�.");
				System.out.println(" ");
				
				if(�Ĵ�.�Ĵ�_��������>=���������λ���.��������_ĿƮ����) {
					
			        //�н���� (�ε���ݰ� ����)
				   	LoadingBgm passBgm01 = new LoadingBgm();
			          
			        try {
			             passBgm01.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					
					System.out.println("===========================================================");
					System.out.println(" ");
					
					String PASS[] = { // Ÿ���� ������ - �͸� Ŭ����
				            "______   ___   _____  _____ ",    
				            "| ___ \\ / _ \\ /  ___|/  ___|",
				            "| |_/ // /_\\ \\\\ `--. \\ `--. ",
				            "|  __/ |  _  | `--. \\ `--. \\",
				            "| |    | | | |/\\__/ //\\__/ /",
				            "\\_|    \\_| |_/\\____/ \\____/"
				    };

			        
				    for (int i = 0; i < PASS.length; i++) {
					      // �� �� �����Ѵ�
					      Thread.sleep(450);
					      // �޼����� ����Ѵ�
					      System.out.println(PASS[i]);
					} 
					System.out.println(" ");
					System.out.println("���������� �հ��Ͽ����ϴ�!!");
					System.out.println("�ʱ������� �غ��ϼ���!!");
					System.out.println("===========================================================");
					
					break ;
					
				}else {

					System.out.println("���ϴ� �ƽ��Ե� �ݹ� �ű����� ä�� �����ɻ翡�� ���հ��Ͽ����ϴ�.");
					System.out.println("������ ����Ǿ����ϴ�."); 
					
				
					GoodbyeWorldBgm GoodbyeWorldBgm = new GoodbyeWorldBgm();
					
			        try {
			        	GoodbyeWorldBgm.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					
					String GameEnd[] = { // Ÿ���� ������ - �͸� Ŭ����
							
							
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
					      // �� �� �����Ѵ�
					      Thread.sleep(250);
					      // �޼����� ����Ѵ�
					      System.out.println(GameEnd[i]);
					} 
				   	    
					
	//������ ����Ǿ��      
					System.exit(0);
					
//					FinishBgm FinishBgm = new FinishBgm(); // ���������ϸ� �ǴϽú�� ������!
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
				String GameEnd[] = { // Ÿ���� ������ - �͸� Ŭ����

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
				      // �� �� �����Ѵ�
				      Thread.sleep(250);
				      // �޼����� ����Ѵ�
				      System.out.println(GameEnd[i]);
				} 
				
				System.out.println("������ �����߽��ϴ�.");
				System.out.println("������ ����Ǿ����ϴ�.");
				
	//������ ����Ǿ��
				
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
				System.out.println("�ٽ� �Է��ϼ���.");
				 
				continue;
			}
			Apply++;
			}
			
			System.out.println("11���Դϴ�.");
			System.out.println("11�� ������ �ֿ� �ִ� �ʱ������� �غ��սô�.");
			
			
			int NOV = 1; // 11�� �� ��! �� �ʱ� ����!!
			
			while (NOV <= 3) {
				Buttonbgm ButtonBgm1 = new Buttonbgm();
				
		        try {
		        	 ButtonBgm1.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
				System.out.println(" ");
				System.out.println("< ���θ޴� > ");
				System.out.println("1. Ȱ��"); // 1�� Ȱ��, 2�� ����Ȯ��, 3�� ��������
				System.out.println("2. ����Ȯ��");
				System.out.println("3. 11�� ��������");
				System.out.println(" ");
						
				int ���θ޴�����â = scan.nextInt();
				
				if ( ���θ޴�����â == 1) {

					if (true) {
						Buttonbgm ButtonBgm2 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm2.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println(" ");
						System.out.println("4�г� 2�б� 11�� : " + NOV + "/3" + "��° ���Դϴ�.");
						System.out.println("��� ���ðڽ��ϱ�?");
						System.out.println("1. �б��� ����");
						System.out.println("2. ���׿� ����");
						System.out.println("3. ���� ����");
						System.out.println("4. �ڷΰ���");
						System.out.println("<< �б�, ����, �� ���� ����Ȯ���� �̺�Ʈ�� Ƣ��ɴϴ�. >>");

						System.out.println(" ");
						
						int ���б⼱��â = scan.nextInt();

					    if (���б⼱��â == 1) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println(" ");
					    	System.out.println("�б��� �Խ��ϴ�.");
							System.out.println("�б����� ������ �Ͻðڽ��ϱ�?");
							System.out.println("1. ��������");
							System.out.println("2. �������Ƹ�Ȱ��");
							System.out.println("3. ����������� ������");
							System.out.println("4. �������͵�");
							System.out.println("5. �ڷΰ���");
							System.out.println(" ");

							int �б�����â = scan.nextInt();
							
							if(�б�����â ==1) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        System.out.println("��.. �������� ������ �ؾ���!!");
								System.out.println("�б����� ������ ���������� �մϴ�.");
								�Ĵ�.��������();
								
								System.out.println(" ");
								
								SomethingGirl SomethingGirl = new SomethingGirl();

								SomethingGirl.SomethingGirlCome();
								SomethingGirl.join(); 
								System.out.println(" ");
								
								�Ĵ�.���¾˸�();
								
							}else if(�б�����â == 2) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("���Ƹ����� ����鿡�� ��������� ����ϴ�.");
								�Ĵ�.�������Ƹ�����_����();
								System.out.println(" ");
								
								CircleBroThread CircleBro = new CircleBroThread();

								CircleBro.CircleBroCome();
								CircleBro.join(); 
								System.out.println(" ");
								�Ĵ�.���¾˸�();
								
							}else if(�б�����â == 3) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("����������ο��� �������� �޽��ϴ�.");
								�Ĵ�.�����������_������();
								�Ĵ�.���¾˸�();
								
							}else if(�б�����â == 4) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("�������͵� ���� ���������� ��ȭ��ŵ�ϴ�.");
								�Ĵ�.�������͵�_����();
								
								InterviewStudyMember Studymember= new InterviewStudyMember();

								Studymember.GoFeedback();
								Studymember.join(); 
								
								�Ĵ�.���¾˸�();
								
							}else if(�б�����â == 5) {
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
								System.out.println("�ٽ� �Է��ϼ���."); 
								continue; 						 
							}
							
							// (�б�) ������͵�� ���� �հ��ؼ� ����Ƽ �� Ȯ�� 10%

//							int ���丵Ƚ��;
//							���丵Ƚ�� = 0;
//							while(���丵Ƚ��<1)
							
							Character InterviewFriend = new Character(); 
							InterviewFriend.���� = "������͵��";
							
								if(InterviewFriend.SuccessFirst()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									
									System.out.println("�б� ���� �̺�Ʈ <������͵���� ���� �հ��߽��ϴ�.>");
									System.out.println("������Ƽ�� �����Ͻðڽ��ϱ�?");
									System.out.println("1. ����");
									System.out.println("2. ����");
		
									//��ü.��ü�Լ���. ��ü�� ���!	
									
									int goparty = scan.nextInt();
									
									if(goparty == 1) {
										Buttonbgm ButtonBgm4 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm4.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("������Ƽ�� ������ ���� ������� ����ϴ�.");	
										InterviewFriend.�Ĵ���_��������_����(5);
										InterviewFriend.�Ĵ���_�ʱ�����_����(5);
										InterviewFriend.�Ĵ���_��������_����(5);
										InterviewFriend.�Ĵ���_ü������_����(10);
										InterviewFriend.�Ĵ���_����������_����(5);
										
										�Ĵ�.���¾˸�();
										
									}else if(goparty == 2) {
										Buttonbgm ButtonBgm4 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm4.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("������Ƽ�� �����ϰ� ü���� ȸ���մϴ�.");
										InterviewFriend.�Ĵ���_ü������_����(15);
										InterviewFriend.�Ĵ���_����������_����(5);
										InterviewFriend.�Ĵ���_��Ʈ��������_����(5);
										
										�Ĵ�.���¾˸�();					
									}else {
										Buttonbgm ButtonBgm4 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm4.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("�ٽ� �Է��ϼ���.");
										continue; 	
									}
									
								}else {
									System.out.println("�����̺�Ʈ�� �����ϴ�.");
								}
							
							
					    }else if(���б⼱��â == 2) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println(" ");
					    	System.out.println("���׿� �Խ��ϴ�.");
							System.out.println("���׿��� ������ �Ͻðڽ��ϱ�?");
							System.out.println("1. �ｺ");
							System.out.println("2. ġ��");
							System.out.println("3. �ڷΰ���");
							System.out.println(" ");
							
							int ���׼���â = scan.nextInt();
							
							if(���׼���â ==1) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        
						        System.out.println(" ");
						        
					    		String health[] = { // Ÿ���� ������ - �͸� Ŭ����
		
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
								      // �� �� �����Ѵ�
								      Thread.sleep(0);
								      // �޼����� ����Ѵ�
								      System.out.println(health[i]);
								}
							    
							    System.out.println(" ");
								System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
								System.out.println(" ");
								�Ĵ�.�ｺ��();
								�Ĵ�.���¾˸�();
								
							}else if(���׼���â == 2) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								String ChickenandBeer[] = { // Ÿ���� ������ - �͸� Ŭ����

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
									      // �� �� �����Ѵ�
									      Thread.sleep(100);
									      // �޼����� ����Ѵ�
									      System.out.println(ChickenandBeer[i]);
									}
								    System.out.println(" ");
									System.out.println("ġ������ ��Ʈ������ Ǳ�ϴ�.");
									�Ĵ�.ġ��();
									�Ĵ�.���¾˸�();
								
							}else if(���׼���â == 3) {
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
								System.out.println("�ٽ� �Է��ϼ���."); 
								continue; 						 
							}
							
							// (����) ����б� ģ������ �Ⱥ���ȭ �� Ȯ�� 10% 
							
							Character HighschoolFriend = new Character(); 
							HighschoolFriend.���� = "����б� ģ��";
							
							if(HighschoolFriend.HiCall()) {
								EventBgm EventBgm = new EventBgm();
								
						        try {
						        	EventBgm.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								
								System.out.println("���� ���� �̺�Ʈ <����б� ģ���� �Ⱥ���ȭ>");
								System.out.println("�ذ� �ִ� ����б� ģ������ ��ȭ�� �ɴϴ�.");
								System.out.println("1. ��ȭ�� �޴´�. ");
								System.out.println("2. ��ȭ�� ���� �ʴ´�. ");

								//��ü.��ü�Լ���. ��ü�� ���!	
								
								int �Ⱥ���ȭ����â = scan.nextInt();
								
								if(�Ⱥ���ȭ����â == 1) {
									Buttonbgm ButtonBgm5 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm5.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[����б� ģ��] �� �ĴϾ�! �Ʊ� ���׿��� �� �� �� ���Ƽ� ��ȭ�߾�!");	
									System.out.println("[����б� ģ��] �� ������ �־���?");	
									System.out.println("[����б� ģ��] ������ ���ķ� �� ���� ���ôµ�! ���� �ʹپ�!");
									System.out.println("[�Ĵ�] ���� ƴ�� ���ֳ�!");
									System.out.println("[�Ĵ�] ���� ���� �ʹپ�!");
									
									HighschoolFriend.�Ĵ���_ü������_����(10);
									HighschoolFriend.�Ĵ���_����������_����(10);
									HighschoolFriend.�Ĵ���_��Ʈ��������_����(10);
									
									�Ĵ�.���¾˸�();
									
								}else if(�Ⱥ���ȭ����â == 2) {
									Buttonbgm ButtonBgm5 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm5.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[�Ĵ�] �� ���� ������.. ���� ����� ������ ������..");
									HighschoolFriend.�Ĵ���_����������_����(10);
									HighschoolFriend.�Ĵ���_��Ʈ��������_����(10);
									
									�Ĵ�.���¾˸�();					
								}else {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 	
								}
								
							}else {
								System.out.println("�����̺�Ʈ�� �����ϴ�.");
							}
							
					    }else if(���б⼱��â == 3) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println(" ");
					    	System.out.println("���� �Խ��ϴ�.");
							System.out.println("������ ������ �Ͻðڽ��ϱ�?");
							System.out.println("1. �θ�԰� �Ļ�");
							System.out.println("2. �ϱ⾲��");
							System.out.println("3. �����ڱ�");
							System.out.println("4. �ڷΰ���");
							System.out.println(" ");

							int ������â = scan.nextInt();
							
							if(������â ==1) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        String parents[] = {
										"�θ�԰� �Ļ��ϸ� ��� ���� �̾߱⸦ �մϴ�.",
										"[�θ��] ����غ�� �� �� �ǰ� �ִ�?",
										"[�Ĵ�] ������� ������ �ϰ� �־�� ����",
										"[�θ��] �׷��׷� �� ȥ�� �˾Ƽ� �� �ϸ��� �ϴ´� ���� ",
										"[�Ĵ�] (��.. �̷��Գ� �� �Ͼ��ֽôµ� �� �ȵǳ� �Ф�) ",
										"[�θ��] �� ���� �԰� ������ �Ƶ�",
										" "
								};
								
								for (int i = 0; i <parents.length; i++) {
									Thread.sleep(500);//0.5�ʸ��� �� ���徿 ���
									System.out.println(parents[i]);
								}
								System.out.println(" ");

								�Ĵ�.�θ�԰��Ļ�();
								System.out.println(" ");
								
								RelativeClass relative = new RelativeClass();
								relative.RelativeCome();
								relative.join(); 
								
								�Ĵ�.���¾˸�();
								
							}else if(������â == 2) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								 String Diary[] = { // Ÿ���� ������ - �͸� Ŭ����

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
								      // �� �� �����Ѵ�
								      Thread.sleep(100);
								      // �޼����� ����Ѵ�
								      System.out.println(Diary[i]);
								}
							    System.out.println(" ");
							    System.out.println("�ϱ⸦ ���� �Ϸ縦 �����ϰ� �����θ� �����̴ϴ�.");
								�Ĵ�.�ϱ�();
								�Ĵ�.���¾˸�();
								
					    	}else if(������â == 3) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
					    		String nap[] = { // Ÿ���� ������ - �͸� Ŭ����
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
										      // �� �� �����Ѵ�
										      Thread.sleep(100);
										      // �޼����� ����Ѵ�
										      System.out.println(nap[i]);
										}
									    System.out.println(" ");
									    
							    		System.out.println("������ ���� ������ ü���� �����մϴ�.");
							    		�Ĵ�.����();
							    		�Ĵ�.���¾˸�();
					    		
					    	}else if(������â == 4) {
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
								System.out.println("�ٽ� �Է��ϼ���."); 
								continue; 						
							}
							
							//(��) ������ ����ȣ�� �ؾ��մϴ�.
							Character Bro = new Character(); 
							Bro.���� = "������";
							
							if(Bro.gohospital()) {
								
								EventBgm EventBgm = new EventBgm();
								
						        try {
						        	EventBgm.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        
								System.out.println("�� ���� �̺�Ʈ <������ �Կ�>");
								System.out.println("������ �Կ��߽��ϴ�.");
								System.out.println("����ȣ�� �Ͻðڽ��ϱ�?");
								System.out.println("1. ����ȣ�� �Ѵ�.");
								System.out.println("2. ���� �ʴ´�.");

								//��ü.��ü�Լ���. ��ü�� ���!	
								
								int ����ȣ����â = scan.nextInt();
								
								if(����ȣ����â == 1) {
									Buttonbgm ButtonBgm5 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm5.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[�Ĵ�] (��.. ���ؿ� �����ϱ���..)");	
									System.out.println("[�Ĵ�] ���� �� ���� �׷��� �Ф�");	
									Bro.�Ĵ���_ü������_����(5);
									Bro.�Ĵ���_��Ʈ��������_����(5);
									�Ĵ�.���¾˸�();
									
								}else if(����ȣ����â == 2) {
									Buttonbgm ButtonBgm5 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm5.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[�Ĵ�] �ʹ� �ٺ�.. �Ϲݱ� �غ��ؾ���..�Ф�");
									Bro.�Ĵ���_��Ʈ��������_����(5);
									Bro.�Ĵ���_����������_����(5);
									�Ĵ�.���¾˸�();					
								}else {
									System.out.println("�ٽ� �Է��ϼ���.");
									continue; 	
								}
								
							}else {
								System.out.println("�����̺�Ʈ�� �����ϴ�.");
							}
							
					    }else if(���б⼱��â == 4) {
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
							System.out.println("�ٽ� �Է��ϼ���.");
					    	continue;
					    }
					    
					}
					
					NOV ++;	
					
				}else if(���θ޴�����â == 2){
					Buttonbgm ButtonBgm2 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm2.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
				
					�Ĵ�.���¾˸�();
					
				}else if(���θ޴�����â == 3) {
					Buttonbgm ButtonBgm2 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm2.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
						
					System.out.println("11�� ������ �����Ͻðڽ��ϱ�?");
					System.out.println("1. ��");
					System.out.println("2. �ƴϿ�");
					
					int �������⼱��â = scan.nextInt();
					
					if(�������⼱��â ==1) {
						Buttonbgm ButtonBgm3 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm3.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println("11�� ����غ� �����߽��ϴ�.");					

						
//						FinishBgm FinishBgm = new FinishBgm(); // ���������ϸ� �ǴϽú�� ������!
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

					}else if(�������⼱��â == 2) {
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
						System.out.println("�ٽ� �Է��ϼ���."); // ������ �����Ͻðٽ��ϱ�?�� �ߵ���. ��ó�� ���θ޴�â�� �ƴ϶�.
						continue; 						   // �� if���� while�� �ȿ� �ְ� �Ǹ� �������⼱��â == 2�� 1.Ȱ�� 2. ����Ȯ�� 3. �������Ⱑ ���;�
					}
					
				}else {
					Buttonbgm ButtonBgm2 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm2.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					System.out.println("�ٽ� �Է��ϼ���.");
					continue;
				}

			}
			
			System.out.println("�Ϲݱ�ä�� �ʱ� ���� �ְ��Դϴ�.");
			System.out.println("�ʱ� ������ ���� ���ðڽ��ϱ�?");
			
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
			System.out.println("1�� : �����Ѵ�");
			System.out.println("2�� : �����ܴ�");
					
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
				String JopPhoto[] = { // Ÿ���� ������ - �͸� Ŭ����

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
				      // �� �� �����Ѵ�
				      Thread.sleep(100);
				      // �޼����� ����Ѵ�
				      System.out.println(JopPhoto[i]);
				}
			    System.out.println(" ");
				
			    System.out.println("�� �ʱ������� ���� ĿƮ���ΰ� ���մϴ�.");
			    
				if(�Ĵ�.�Ĵ�_�ʱ�����>=���������λ���.�ʱ�����_ĿƮ����) {
					
			        //�н���� (�ε���ݰ� ����)
				   	LoadingBgm passBgm02 = new LoadingBgm();
			          
			        try {
			             passBgm02.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }

					
					System.out.println("===========================================================");
					System.out.println(" ");
					
					String PASS[] = { // Ÿ���� ������ - �͸� Ŭ����
				            "______   ___   _____  _____ ",    
				            "| ___ \\ / _ \\ /  ___|/  ___|",
				            "| |_/ // /_\\ \\\\ `--. \\ `--. ",
				            "|  __/ |  _  | `--. \\ `--. \\",
				            "| |    | | | |/\\__/ //\\__/ /",
				            "\\_|    \\_| |_/\\____/ \\____/"
				    };

			        
				    for (int i = 0; i < PASS.length; i++) {
					      // �� �� �����Ѵ�
					      Thread.sleep(450);
					      // �޼����� ����Ѵ�
					      System.out.println(PASS[i]);
					} 
					System.out.println(" ");
					System.out.println("�ʱ������� �հ��Ͽ����ϴ�!!");
					System.out.println("���������� �غ��ϼ���!!");
					System.out.println("===========================================================");
					
					break;
					
				}else {
					
					System.out.println("���ϲ����� �ƽ��Ե� ���� ��ܿ� ������ �˷��帳�ϴ�. �����մϴ�.");	
					System.out.println("������ ����Ǿ����ϴ�.");
					
					GoodbyeWorldBgm GoodbyeWorldBgm = new GoodbyeWorldBgm();
					GoodbyeWorldBgm.join();
					
			        try {
			        	GoodbyeWorldBgm.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					
					String GameEnd[] = { // Ÿ���� ������ - �͸� Ŭ����

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
					      // �� �� �����Ѵ�
					      Thread.sleep(250);
					      // �޼����� ����Ѵ�
					      System.out.println(GameEnd[i]);
					} 
					

					
					System.exit(0);
				}
	//������ ����Ǿ�� �Ѵ�.			
			}else if(WriteTest2 == 2) {
				GoodbyeWorldBgm GoodbyeWorldBgm = new GoodbyeWorldBgm();
				GoodbyeWorldBgm.join();
				
		        try {
		        	GoodbyeWorldBgm.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
				String GameEnd[] = { // Ÿ���� ������ - �͸� Ŭ����

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
				      // �� �� �����Ѵ�
				      Thread.sleep(250);
				      // �޼����� ����Ѵ�
				      System.out.println(GameEnd[i]);
				} 
				
			    System.out.println("����غ� �����߽��ϴ�.");
				System.out.println("������ ����Ǿ����ϴ�.");
				
				System.exit(0);
	//������ ����Ǿ�� �Ѵ�.			
				break;
				
								
			}else {
				Buttonbgm ButtonBgm2 = new Buttonbgm();
				
		        try {
		        	 ButtonBgm2.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
				System.out.println("�ٽ� �Է��ϼ���.");
				 
				continue;
			}
			WriteTest++;
			}
			
			System.out.println("12�� ������ �ֿ� �ִ� ���������� �غ��սô�.");
			
			int DEC = 1; // 12�� �� ��! �� ���� ����!!
			
			while (DEC <= 3) {
				Buttonbgm ButtonBgm1 = new Buttonbgm();
				
		        try {
		        	 ButtonBgm1.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
				System.out.println("< ���θ޴� > ");
				System.out.println("1. Ȱ��"); // 1�� Ȱ��, 2�� ����Ȯ��, 3�� ��������
				System.out.println("2. ����Ȯ��");
				System.out.println("3. ��������");
						
				int ���θ޴�����â = scan.nextInt();
				
				if ( ���θ޴�����â == 1) {

					if (true) {
						Buttonbgm ButtonBgm2 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm2.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println(" ");
						System.out.println("4�г� 2�б� 12�� : " + DEC + "/3" + "��° ���Դϴ�.");
						System.out.println("��� ���ðڽ��ϱ�?");
						System.out.println("1. �б��� ����");
						System.out.println("2. ���׿� ����");
						System.out.println("3. ���� ����");
						System.out.println("4. �ڷΰ���");
						System.out.println("<< �б�, ����, �� ���� ����Ȯ���� �̺�Ʈ�� Ƣ��ɴϴ�. >>");
						System.out.println(" ");
						
						int ���б⼱��â = scan.nextInt();

					    if (���б⼱��â == 1) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println(" ");
							System.out.println("�б��� �Խ��ϴ�.");
							System.out.println("�б����� ������ �Ͻðڽ��ϱ�?");
							System.out.println("1. ��������");
							System.out.println("2. �������Ƹ�Ȱ��");
							System.out.println("3. ����������� ������");
							System.out.println("4. �������͵�");
							System.out.println("5. �ڷΰ���");
							System.out.println(" ");

							int �б�����â = scan.nextInt();
							
							if(�б�����â ==1) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        System.out.println("��.. �������� ������ �ؾ���!!");
								System.out.println("�б����� ������ ���������� �մϴ�.");
								�Ĵ�.��������();
								System.out.println(" ");
								
								SomethingGirl SomethingGirl = new SomethingGirl();

								SomethingGirl.SomethingGirlCome();
								SomethingGirl.join(); 
								System.out.println(" ");
								
								�Ĵ�.���¾˸�();
								
							}else if(�б�����â == 2) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("���Ƹ����� ����鿡�� ��������� ����ϴ�.");
								�Ĵ�.�������Ƹ�����_����();
								System.out.println(" ");
								
								CircleBroThread CircleBro = new CircleBroThread();

								CircleBro.CircleBroCome();
								CircleBro.join(); 
								System.out.println(" ");
								�Ĵ�.���¾˸�();
								
							}else if(�б�����â == 3) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("����������ο��� �������� �޽��ϴ�.");
								�Ĵ�.�����������_������();
								�Ĵ�.���¾˸�();
								
							}else if(�б�����â == 4) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								System.out.println("�������͵� ���� ���������� ��ȭ��ŵ�ϴ�.");
								�Ĵ�.�������͵�_����();
								
								InterviewStudyMember Studymember= new InterviewStudyMember();

								Studymember.GoFeedback();
								Studymember.join(); 
								�Ĵ�.���¾˸�();
								
							}else if(�б�����â == 5) {
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
								System.out.println("�ٽ� �Է��ϼ���."); 
								continue; 						 
							}
							
							// (�б�) ������͵�� ���� �հ��ؼ� ����Ƽ �� Ȯ�� 10%

//							int ���丵Ƚ��;
//							���丵Ƚ�� = 0;
//							while(���丵Ƚ��<1)
							
							Character InterviewFriend = new Character(); 
							InterviewFriend.���� = "������͵��";
							
								if(InterviewFriend.SuccessFirst()) {
									
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
							        
									System.out.println("�б� ���� �̺�Ʈ <������͵���� ���� �հ��߽��ϴ�.>");
									System.out.println("������Ƽ�� �����Ͻðڽ��ϱ�?");
									System.out.println("1. ����");
									System.out.println("2. ����");
		
									//��ü.��ü�Լ���. ��ü�� ���!	
									
									int goparty = scan.nextInt();
									
									if(goparty == 1) {
										Buttonbgm ButtonBgm4 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm4.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("������Ƽ�� ������ ���� ������� ����ϴ�.");	
										InterviewFriend.�Ĵ���_��������_����(5);
										InterviewFriend.�Ĵ���_�ʱ�����_����(5);
										InterviewFriend.�Ĵ���_��������_����(5);
										InterviewFriend.�Ĵ���_ü������_����(10);
										InterviewFriend.�Ĵ���_����������_����(5);
										
										�Ĵ�.���¾˸�();
										
									}else if(goparty == 2) {
										Buttonbgm ButtonBgm4 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm4.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("������Ƽ�� �����ϰ� ü���� ȸ���մϴ�.");
										InterviewFriend.�Ĵ���_ü������_����(15);
										InterviewFriend.�Ĵ���_����������_����(5);
										InterviewFriend.�Ĵ���_��Ʈ��������_����(5);
										
										�Ĵ�.���¾˸�();					
									}else {
										Buttonbgm ButtonBgm4 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm4.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("�ٽ� �Է��ϼ���.");
										continue; 	
									}
									
								}else {
									System.out.println("�����̺�Ʈ�� �����ϴ�.");
								}
							
							
					    }else if(���б⼱��â == 2) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println(" ");
					    	System.out.println("���׿� �Խ��ϴ�.");
							System.out.println("���׿��� ������ �Ͻðڽ��ϱ�?");
							System.out.println("1. �ｺ");
							System.out.println("2. ġ��");
							System.out.println("3. �ڷΰ���");
							System.out.println(" ");
							
							int ���׼���â = scan.nextInt();
							
							if(���׼���â ==1) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        
						        System.out.println(" ");
						        
					    		String health[] = { // Ÿ���� ������ - �͸� Ŭ����
		
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
								      // �� �� �����Ѵ�
								      Thread.sleep(0);
								      // �޼����� ����Ѵ�
								      System.out.println(health[i]);
								}
							    
							    System.out.println(" ");
								System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
								System.out.println(" ");
								�Ĵ�.�ｺ��();
								�Ĵ�.���¾˸�();
								
							}else if(���׼���â == 2) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								String ChickenandBeer[] = { // Ÿ���� ������ - �͸� Ŭ����

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
									      // �� �� �����Ѵ�
									      Thread.sleep(100);
									      // �޼����� ����Ѵ�
									      System.out.println(ChickenandBeer[i]);
									}
								    System.out.println(" ");
									System.out.println("ġ������ ��Ʈ������ Ǳ�ϴ�.");
									�Ĵ�.ġ��();
									�Ĵ�.���¾˸�();
								
							}else if(���׼���â == 3) {
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
								System.out.println("�ٽ� �Է��ϼ���."); 
								continue; 						 
							}
							
							// (����) ����б� ģ������ �Ⱥ���ȭ �� Ȯ�� 10% 
							
							Character HighschoolFriend = new Character(); 
							HighschoolFriend.���� = "����б� ģ��";
							
							if(HighschoolFriend.HiCall()) {
								EventBgm EventBgm = new EventBgm();
								
						        try {
						        	EventBgm.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								
								System.out.println("���� ���� �̺�Ʈ <����б� ģ���� �Ⱥ���ȭ>");
								System.out.println("�ذ� �ִ� ����б� ģ������ ��ȭ�� �ɴϴ�.");
								System.out.println("1. ��ȭ�� �޴´�. ");
								System.out.println("2. ��ȭ�� ���� �ʴ´�. ");

								//��ü.��ü�Լ���. ��ü�� ���!	
								
								int �Ⱥ���ȭ����â = scan.nextInt();
								
								if(�Ⱥ���ȭ����â == 1) {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[����б� ģ��] �� �ĴϾ�! �Ʊ� ���׿��� �� �� �� ���Ƽ� ��ȭ�߾�!");	
									System.out.println("[����б� ģ��] �� ������ �־���?");	
									System.out.println("[����б� ģ��] ������ ���ķ� �� ���� ���ôµ�! ���� �ʹپ�!");
									System.out.println("[�Ĵ�] ���� ƴ�� ���ֳ�!");
									System.out.println("[�Ĵ�] ���� ���� �ʹپ�!");
									
									HighschoolFriend.�Ĵ���_ü������_����(10);
									HighschoolFriend.�Ĵ���_����������_����(10);
									HighschoolFriend.�Ĵ���_��Ʈ��������_����(10);
									
									�Ĵ�.���¾˸�();
									
								}else if(�Ⱥ���ȭ����â == 2) {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[�Ĵ�] �� ���� ������.. ���� ����� ������ ������..");
									HighschoolFriend.�Ĵ���_����������_����(10);
									HighschoolFriend.�Ĵ���_��Ʈ��������_����(10);
									
									�Ĵ�.���¾˸�();					
								}else {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 	
								}
								
							}else {
								System.out.println("�����̺�Ʈ�� �����ϴ�.");
							}
							
					    }else if(���б⼱��â == 3) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println(" ");
					    	System.out.println("���� �Խ��ϴ�.");
							System.out.println("������ ������ �Ͻðڽ��ϱ�?");
							System.out.println("1. �θ�԰� �Ļ�");
							System.out.println("2. �ϱ⾲��");
							System.out.println("3. �����ڱ�");
							System.out.println("4. �ڷΰ���");
							System.out.println(" ");
							
							int ������â = scan.nextInt();
							
							if(������â ==1) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
						        String parents[] = {
										"�θ�԰� �Ļ��ϸ� ��� ���� �̾߱⸦ �մϴ�.",
										"[�θ��] ����غ�� �� �� �ǰ� �ִ�?",
										"[�Ĵ�] ������� ������ �ϰ� �־�� ����",
										"[�θ��] �׷��׷� �� ȥ�� �˾Ƽ� �� �ϸ��� �ϴ´� ���� ",
										"[�Ĵ�] (��.. �̷��Գ� �� �Ͼ��ֽôµ� �� �ȵǳ� �Ф�) ",
										"[�θ��] �� ���� �԰� ������ �Ƶ�",
										" "
								};
								
								for (int i = 0; i <parents.length; i++) {
									Thread.sleep(500);//0.5�ʸ��� �� ���徿 ���
									System.out.println(parents[i]);
								}
								System.out.println(" ");

								�Ĵ�.�θ�԰��Ļ�();
								System.out.println(" ");
								
								RelativeClass relative = new RelativeClass();
								relative.RelativeCome();
								relative.join(); 
								
								�Ĵ�.���¾˸�();
								
							}else if(������â == 2) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								 String Diary[] = { // Ÿ���� ������ - �͸� Ŭ����

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
								      // �� �� �����Ѵ�
								      Thread.sleep(100);
								      // �޼����� ����Ѵ�
								      System.out.println(Diary[i]);
								}
							    System.out.println(" ");
							    System.out.println("�ϱ⸦ ���� �Ϸ縦 �����ϰ� �����θ� �����̴ϴ�.");
								�Ĵ�.�ϱ�();
								�Ĵ�.���¾˸�();
								
					    	}else if(������â == 3) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
					    		String nap[] = { // Ÿ���� ������ - �͸� Ŭ����
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
										      // �� �� �����Ѵ�
										      Thread.sleep(100);
										      // �޼����� ����Ѵ�
										      System.out.println(nap[i]);
										}
									    System.out.println(" ");
									    
							    		System.out.println("������ ���� ������ ü���� �����մϴ�.");
							    		�Ĵ�.����();
							    		�Ĵ�.���¾˸�();
					    		
					    	}else if(������â == 4) {
								Buttonbgm ButtonBgm4 = new Buttonbgm();
								
						        try {
						        	 ButtonBgm4.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								continue;
							}else {
								System.out.println("�ٽ� �Է��ϼ���."); 
								continue; 						
							}
							
							//(��) ������ ����ȣ�� �ؾ��մϴ�.
							Character Bro = new Character(); 
							Bro.���� = "������";
							
							if(Bro.gohospital()) {
								EventBgm EventBgm = new EventBgm();
								
						        try {
						        	EventBgm.LoadBgm();
						             Thread.sleep(0);
						        }catch(InterruptedException e) {
						             e.printStackTrace();
						        }
								
								System.out.println("�� ���� �̺�Ʈ <������ �Կ�>");
								System.out.println("������ �Կ��߽��ϴ�.");
								System.out.println("����ȣ�� �Ͻðڽ��ϱ�?");
								System.out.println("1. ����ȣ�� �Ѵ�.");
								System.out.println("2. ���� �ʴ´�.");

								//��ü.��ü�Լ���. ��ü�� ���!	
								
								int ����ȣ����â = scan.nextInt();
								
								if(����ȣ����â == 1) {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[�Ĵ�] (��.. ���ؿ� �����ϱ���..)");	
									System.out.println("[�Ĵ�] ���� �� ���� �׷��� �Ф�");	
									Bro.�Ĵ���_ü������_����(5);
									Bro.�Ĵ���_��Ʈ��������_����(5);
									�Ĵ�.���¾˸�();
									
								}else if(����ȣ����â == 2) {
									Buttonbgm ButtonBgm4 = new Buttonbgm();
									
							        try {
							        	 ButtonBgm4.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("[�Ĵ�] �ʹ� �ٺ�.. �Ϲݱ� �غ��ؾ���..�Ф�");
									Bro.�Ĵ���_��Ʈ��������_����(5);
									Bro.�Ĵ���_����������_����(5);
									�Ĵ�.���¾˸�();					
								}else {
									System.out.println("�ٽ� �Է��ϼ���.");
									continue; 	
								}
								
							}else {
								System.out.println("�����̺�Ʈ�� �����ϴ�.");
							}
							
					    }else if(���б⼱��â == 4) {
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
							System.out.println("�ٽ� �Է��ϼ���.");
					    	continue;
					    }
					    
					}
					
					DEC ++;	
					
				}else if(���θ޴�����â == 2){
					Buttonbgm ButtonBgm3 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm3.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
				
					�Ĵ�.���¾˸�();
					
				}else if(���θ޴�����â == 3) {
					Buttonbgm ButtonBgm3 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm3.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
						
					System.out.println("������ �����Ͻðڽ��ϱ�?");
					System.out.println("1. ��");
					System.out.println("2. �ƴϿ�");
					
					int �������⼱��â = scan.nextInt();
					
					if(�������⼱��â ==1) {
						Buttonbgm ButtonBgm4 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm4.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println("12�� ����غ� �����߽��ϴ�.");					
						
//						FinishBgm FinishBgm = new FinishBgm(); // ���������ϸ� �ǴϽú�� ������!
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

					}else if(�������⼱��â == 2) {
						Buttonbgm ButtonBgm4 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm4.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						continue;
					}else {
						System.out.println("�ٽ� �Է��ϼ���."); // ������ �����Ͻðٽ��ϱ�?�� �ߵ���. ��ó�� ���θ޴�â�� �ƴ϶�.
						continue; 						   // �� if���� while�� �ȿ� �ְ� �Ǹ� �������⼱��â == 2�� 1.Ȱ�� 2. ����Ȯ�� 3. �������Ⱑ ���;�
					}
					
				}else {
					Buttonbgm ButtonBgm3 = new Buttonbgm();
					
			        try {
			        	 ButtonBgm3.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					System.out.println("�ٽ� �Է��ϼ���.");
					continue;
				}

			}
			
			System.out.println("���� ���Դϴ�.");
			System.out.println("������ �������ðڽ��ϱ�?");

			int InterviewTest;
			InterviewTest = 0;
			
			while(InterviewTest<1) {
			System.out.println("1�� : �����Ѵ�");
			System.out.println("2�� : �����ܴ�");
					
			int InterviewTest2 = scan.nextInt();
			
			if(InterviewTest2  == 1) {
				
				System.out.println(" ");
				String JopPhoto[] = { // Ÿ���� ������ - �͸� Ŭ����

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
				      // �� �� �����Ѵ�
				      Thread.sleep(100);
				      // �޼����� ����Ѵ�
				      System.out.println(JopPhoto[i]);
				}
			    System.out.println(" ");
				
				System.out.println("�� ���������� ���� ĿƮ���ΰ� ���մϴ�.");
				System.out.println(" ");
				
				if(�Ĵ�.�Ĵ�_��������>=���������λ���.��������_ĿƮ����) {
					
			        //�н���� (�ε���ݰ� ����)
				   	LoadingBgm passBgm02 = new LoadingBgm();
			          
			        try {
			             passBgm02.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }

					
					System.out.println("===========================================================");
					System.out.println(" ");
					
					String PASS[] = { // Ÿ���� ������ - �͸� Ŭ����
				            "______   ___   _____  _____ ",    
				            "| ___ \\ / _ \\ /  ___|/  ___|",
				            "| |_/ // /_\\ \\\\ `--. \\ `--. ",
				            "|  __/ |  _  | `--. \\ `--. \\",
				            "| |    | | | |/\\__/ //\\__/ /",
				            "\\_|    \\_| |_/\\____/ \\____/"
				    };

			        
				    for (int i = 0; i < PASS.length; i++) {
					      // �� �� �����Ѵ�
					      Thread.sleep(450);
					      // �޼����� ����Ѵ�
					      System.out.println(PASS[i]);
					} 
					System.out.println(" ");
					System.out.println("�Ϲݱ� ä�뿡 �����հ��Ͽ����ϴ�!!");
					System.out.println("���Ի�� ���� �� �˰ڽ��ϴ�.");
					System.out.println("===========================================================");
					
					break;
					
				}else {
					
					System.out.println(" ");
					System.out.println("���ϲ����� �ƽ��Ե� ���� ��ܿ� ������ �˷��帳�ϴ�. �����մϴ�.");				
					System.out.println("������ ����Ǿ����ϴ�.");
					System.out.println(" ");
					
					GoodbyeWorldBgm GoodbyeWorldBgm = new GoodbyeWorldBgm();
					GoodbyeWorldBgm.join();
					
			        try {
			        	GoodbyeWorldBgm.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					
					String GameEnd[] = { // Ÿ���� ������ - �͸� Ŭ����

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
					      // �� �� �����Ѵ�
					      Thread.sleep(250);
					      // �޼����� ����Ѵ�
					      System.out.println(GameEnd[i]);
					} 
					

					
					System.exit(0);
	//������ ����Ǿ��				
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
				
				String GameEnd[] = { // Ÿ���� ������ - �͸� Ŭ����

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
				      // �� �� �����Ѵ�
				      Thread.sleep(250);
				      // �޼����� ����Ѵ�
				      System.out.println(GameEnd[i]);
				} 
				System.out.println("����غ� �����߽��ϴ�.");
				System.out.println("������ ����Ǿ����ϴ�.");
				
				System.exit(0);
	//������ ����Ǿ��				
				
				break;
				
								
			}else {
				System.out.println("�ٽ� �Է��ϼ���.");
				 
				continue;
			}
			InterviewTest2 ++;
			}
			
			
			}else if (���༱�� ==2) {
				Buttonbgm ButtonBgm = new Buttonbgm();
				
		        try {
		        	 ButtonBgm.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
				
				System.out.println("[�Ĵ�] ����! ������� ������!");
				System.out.println("===========================================================");
				System.out.println("������� �䱸 �������� : " + ��������λ���.��������_ĿƮ����);
				System.out.println("������� �䱸 �ʱ����� : " + ��������λ���.�ʱ�����_ĿƮ����);
				System.out.println("������� �䱸 �������� : " + ��������λ���.��������_ĿƮ����);
				System.out.println("===========================================================");
				
				�Ĵ�.�Ĵ�_�������� = 0; �Ĵ�.�Ĵ�_�ʱ����� = 0; �Ĵ�.�Ĵ�_�������� = 0;
				�Ĵ�.�Ĵ�_ü������ = 90; �Ĵ�.�Ĵ�_���������� = 90; �Ĵ�.�Ĵ�_��Ʈ�������� = 10;
				
				�Ĵ�.���¾˸�();

				System.out.println("===========================================================");
				System.out.println("[�Ĵ�] ���? ü������, ����������, ��Ʈ���������� ����?");
				System.out.println("���� Ȯ���Ͻ÷��� 1��, �����Ͻ÷��� 2��");
				
				int ���������� = scan.nextInt();
				
				if ( ���������� == 1) {
					System.out.println("===========================================================");
					System.out.println("�� ������ �ִ�ġ�� 100�̸� 100�� �ʰ��ϰų� 0 �̾��� �� �� �����ϴ�.");
					System.out.println("ü�������� 90���� ���۵Ǹ� 0�� �Ǹ� ���������Դϴ�.");
					System.out.println("������������ 90���� ���۵Ǹ� 0�� �Ǹ� ���������Դϴ�.");
					System.out.println("��Ʈ���������� 10���� ���۵Ǹ� 100�� �Ǹ� ���������Դϴ�.");
					System.out.println(" ");
					System.out.println("ü�������� 1~20, ������������ 1~20, ��Ʈ���������� 80~99�� �� ���â�� ��ϴ�.");		
					System.out.println("������ �������Դϴ�.");
					System.out.println("�� �������� �� �����ϴ°� ����� �ٽ��Դϴ�.");
					System.out.println("===========================================================");
							
					}else{
						System.out.println("===========================================================");
				}		
				
				System.out.println("[�Ĵ�] ��.. ���� �ʱ�.");
				System.out.println("[�Ĵ�] �׷��� ������ �غ�����. ����غ� �����غ���?"); // 1�� Ȱ��, 2�� ����Ȯ��, 3�� ���θ޴�

			
				
				while (true) {
					System.out.println(" ");
					System.out.println("< ���θ޴� > ");
					System.out.println("1. Ȱ��"); // 1�� Ȱ��, 2�� ����Ȯ��, 3�� ��������
					System.out.println("2. ����Ȯ��");
					System.out.println("3. �ܿ���� ��������");
					System.out.println(" ");

					int ���θ޴�����â = scan.nextInt();
					
					if ( ���θ޴�����â == 1) {
						
						if (true) {
							System.out.println(" ");
							System.out.println("�ܿ�����Դϴ�. �ܿ���п� �ڰ����� ����� �� �ֽ��ϴ�.");
							System.out.println("������ ����Ͻðڽ��ϱ�?");
							System.out.println("1. ��ǻ���ڰ��� ");
							System.out.println("2. �����ڰ���");
							System.out.println("3. �����ڰ���");
							System.out.println("4. �ڷΰ���");
							System.out.println(" ");
							
							int �ܿ���м���â = scan.nextInt(); // 70% Ȯ���� �ڰ��� ���

						    if (�ܿ���м���â == 1) {
						    	��ǻ���ڰ��� ��ǻ���ڰ��� = new ��ǻ���ڰ��� ();// ��ǻ���ڰ���Ŭ�������� ��ǻ���ڰ��� ��ü�� ��������.
								��ǻ���ڰ���.�����̸� = "��ǻ���ڰ���";
						    	
						    	System.out.println("��ǻ�� �ڰ����� �⺻����!!");
								System.out.println("��ǻ���ڰ��� ���迡 �����߽��ϴ�.");
								
								
								ComputerInputThread ComputerInputThread = new ComputerInputThread();
								ComputerCountdownThread ComputerCountdownThread = new ComputerCountdownThread(); 
								
								ComputerInputThread.start(); //���� ó��
								ComputerCountdownThread.start(); //ī��Ʈ�ٿ��� ó��
								ComputerCountdownThread.join();
								
								
								break;
						    
						    }else if(�ܿ���м���â == 2) {
								�����ڰ��� �����ڰ��� = new �����ڰ��� ();
								�����ڰ���.�����̸� = "�����ڰ���";
						    	
						    	System.out.println("Ȥ�� �𸣴� �����ڰ��� �ϳ��� ������!!!");
								System.out.println("�����ڰ��� ���迡 �����߽��ϴ�.");
								
								// 5�� ���� input���п� ���� �Է����� �ʾ��� �� ���ӽ���
								// �̸� ���� ���θ޼ҵ尡 �ִ� Ŭ������ inputCheck��� static boolean�� ����
								
								EnglishInputThread EnglishInputThread = new EnglishInputThread();
								EnglishCountdownThread EnglishCountdownThread = new EnglishCountdownThread(); 
								
								EnglishInputThread.start();
								EnglishCountdownThread.start();
								EnglishCountdownThread.join();
								
								break;
								
						    }else if(�ܿ���м���â == 3) {
								�����ڰ��� �����ڰ��� = new �����ڰ��� ();
								�����ڰ���.�����̸� = "�����ڰ���";
						    	
								System.out.println("������ �غ��ϴµ� �����ڰ����� �⺻����!!");
								System.out.println("�����ڰ��� ���迡 �����߽��ϴ�.");
								
								// 10�� ���� input�� ���� �Է����� �ʾ��� �� ���ӽ���
								// �̸� ���� ���θ޼ҵ尡 �ִ� Ŭ������ inputCheck��� static boolean�� ����
								
								FinanceInputThread FinanceInputThread = new FinanceInputThread();
								FinanceCountdownThread FinanceCountdownThread = new FinanceCountdownThread(); 
								
								FinanceInputThread.start();
								FinanceCountdownThread.start();
								FinanceCountdownThread.join();
								
						    							
								break;
								
						    }else if(�ܿ���м���â == 4) {
						    	continue;
						    }else {
								System.out.println("�ٽ� �Է��ϼ���.");
						    	continue;
						    }
						    
						}
						
					}else if(���θ޴�����â == 2){
						�Ĵ�.���¾˸�();
						
					}else if(���θ޴�����â == 3) {
						System.out.println("�ܿ���� ������ �����Ͻðڽ��ϱ�?");
						System.out.println("1. ��");
						System.out.println("2. �ƴϿ�");
						
						
						int �������⼱��â = scan.nextInt();
						
						if(�������⼱��â ==1) {
					        System.out.println("�ܿ���� ����غ� �����߽��ϴ�.");
							
							break;

						}else if(�������⼱��â == 2) {
							continue;
						}else {
							System.out.println("�ٽ� �Է��ϼ���."); // ������ �����Ͻðٽ��ϱ�?�� �ߵ���. ��ó�� ���θ޴�â�� �ƴ϶�.
							continue; 						   // �� if���� while�� �ȿ� �ְ� �Ǹ� �������⼱��â == 2�� 1.Ȱ�� 2. ����Ȯ�� 3. �������Ⱑ ���;�
						}
						
					}else {
						System.out.println("�ٽ� �Է��ϼ���.");
						continue;
					}
					
				}	
						
				System.out.println("�ܿ������ ������,");
				System.out.println("4�г� 1�бⰡ ���۵Ǿ����ϴ�.");
				System.out.println(" ");
				System.out.println("�� �б�� �� 12������ �̷���� �ֽ��ϴ�.");
				System.out.println("���� ������ �� ���� Ȱ���� �� �� �ֽ��ϴ�.");
				System.out.println("������ �Ͻðڽ��ϱ�?"); // �� �ϴ� 1�ְ� ������ �� 16���� �ϸ� ������������ �Ѿ���� �������
				
				int turnsOfSpringsemester = 1; // 4�г� 1�б� �� 12��!!
				
				while (turnsOfSpringsemester <= 12) {
					System.out.println("< ���θ޴� > ");
					System.out.println("1. Ȱ��"); // 1�� Ȱ��, 2�� ����Ȯ��, 3�� ��������
					System.out.println("2. ����Ȯ��");
					System.out.println("3. 1�б� ��������");
							
					int ���θ޴�����â = scan.nextInt();
					
					if ( ���θ޴�����â == 1) {

						if (true) {
							System.out.println(" ");
							System.out.println("4�г� 1�б� : " + turnsOfSpringsemester+"/12" + "��° ���Դϴ�.");
							System.out.println("��� ���ðڽ��ϱ�?");
							System.out.println("1. �б��� ����");
							System.out.println("2. ���׿� ����");
							System.out.println("3. ���� ����");
							System.out.println("4. �ڷΰ���");
							System.out.println("<< �б�, ����, �� ���� ����Ȯ���� �̺�Ʈ�� Ƣ��ɴϴ�. >>");
							System.out.println(" ");	

							
							int ���б⼱��â = scan.nextInt();

						    if (���б⼱��â == 1) {
								System.out.println(" ");
								System.out.println("�б��� �Խ��ϴ�.");
								System.out.println("�б����� ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. ��������");
								System.out.println("2. �������Ƹ�Ȱ��");
								System.out.println("3. ����������� ������");
								System.out.println("4. �������͵�");
								System.out.println("5. �ڷΰ���");
								System.out.println(" ");

								
								int �б�����â = scan.nextInt();
								
								if(�б�����â ==1) {
							        System.out.println("��.. �������� ������ �ؾ���!!");
									System.out.println("�б����� ������ ���������� �մϴ�.");
									System.out.println(" ");
									�Ĵ�.��������();
									System.out.println(" ");
									
									SomethingGirl SomethingGirl = new SomethingGirl();

									SomethingGirl.SomethingGirlCome();
									SomethingGirl.join(); 
									System.out.println(" ");
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 2) {
									System.out.println("���Ƹ����� ����鿡�� ��������� ����ϴ�.");
									�Ĵ�.�������Ƹ�����_����();
									System.out.println(" ");
									
									CircleBroThread CircleBro = new CircleBroThread();

									CircleBro.CircleBroCome();
									CircleBro.join(); 
									System.out.println(" ");
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 3) {
									System.out.println("����������ο��� �������� �޽��ϴ�.");
									�Ĵ�.�����������_������();
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 4) {
									System.out.println("�������͵� ���� ���������� ��ȭ��ŵ�ϴ�.");
									�Ĵ�.�������͵�_����();
									
									//�����̺�Ʈ �߻�
									
									InterviewStudyMember Studymember= new InterviewStudyMember();

									Studymember.GoFeedback();
									Studymember.join(); 
									
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 5) {
									continue;
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); // ������ �����Ͻðٽ��ϱ�?�� �ߵ���. ��ó�� ���θ޴�â�� �ƴ϶�.
									continue; 						   // �� if���� while�� �ȿ� �ְ� �Ǹ� �������⼱��â == 2�� 1.Ȱ�� 2. ����Ȯ�� 3. �������Ⱑ ���;�
								}
								
								
								BankHuman BankHuman = new BankHuman(); 
									
									if(BankHuman.�����ڸ��丵()) {
										
										System.out.println("�б� ���� �̺�Ʈ <���� ������ ���丵>");
										System.out.println("���� ������ ���丵�� �����Ͻðڽ��ϱ�?");
										System.out.println("1. ����");
										System.out.println("2. ����");
			
										//��ü.��ü�Լ���. ��ü�� ���!	
										
										int ���丵����â = scan.nextInt();
										
										if(���丵����â == 1) {
											System.out.println("���丵�� ������ ���� ������� ����ϴ�.");	
											BankHuman.�Ĵ���_��������_����(5);
											BankHuman.�Ĵ���_�ʱ�����_����(5);
											BankHuman.�Ĵ���_��������_����(5);
											BankHuman.�Ĵ���_ü������_����(10);
											
											�Ĵ�.���¾˸�();
											
										}else if(���丵����â == 2) {
											System.out.println("���丵�� �����ϰ� ü���� ȸ���մϴ�.");
											BankHuman.�Ĵ���_ü������_����(10);
											�Ĵ�.���¾˸�();					
										}else {
											System.out.println("�ٽ� �Է��ϼ���."); // ���� ������ ���丵�� �����Ͻðڽ��ϱ�?�� �ߵ���.
											continue; 	
										}
										
									}else {
										System.out.println("�����̺�Ʈ�� �����ϴ�.");
									}
								
								
						    }else if(���б⼱��â == 2) {
								System.out.println(" ");
						    	System.out.println("���׿� �Խ��ϴ�.");
								System.out.println("���׿��� ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. �ｺ");
								System.out.println("2. ġ��");
								System.out.println("3. �ڷΰ���");
								System.out.println(" ");
								
								int ���׼���â = scan.nextInt();
								
								if(���׼���â ==1) {
							        
							        System.out.println(" ");
							        
								    
								    System.out.println(" ");
									System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
									System.out.println(" ");
									�Ĵ�.�ｺ��();
									�Ĵ�.���¾˸�();
									
								}else if(���׼���â == 2) {
								    System.out.println(" ");
									System.out.println("ġ������ ��Ʈ������ Ǳ�ϴ�.");
									�Ĵ�.ġ��();
									�Ĵ�.���¾˸�();
									
								}else if(���׼���â == 3) {
									continue;
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); // ������ �����Ͻðٽ��ϱ�?�� �ߵ���. ��ó�� ���θ޴�â�� �ƴ϶�.
									continue; 						   // �� if���� while�� �ȿ� �ְ� �Ǹ� �������⼱��â == 2�� 1.Ȱ�� 2. ����Ȯ�� 3. �������Ⱑ ���;�
								}
								
								// (����) ���׿��� ���뿡�� ����� ����ģ�� ���� // �� ����ģ���� ���� �� �ǳ� Ȯ�� 10% // �� ���� ��������!
								Character Xgirlfriend = new Character(); 
								Xgirlfriend.���� = "�� ����ģ��";
								
								if(Xgirlfriend.talkfirst()) {
									
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
							        
									System.out.println("���� ���� �̺�Ʈ <�� ����ģ������ ����>");
									System.out.println("���׿��� �쿬�� �� ����ģ���� �������ϴ�.");
									System.out.println("�� �����Ĵ� �Ⱥ��λ縦 �ǳ׿ɴϴ�.");
									System.out.println("1. ���� �Ⱥ��λ縦 ���ش�. ");
									System.out.println("2. �����ϰ� ��������. ");

									//��ü.��ü�Լ���. ��ü�� ���!	
									
									int ������ģ������â = scan.nextInt();
									
									if(������ģ������â == 1) {
										System.out.println("[�Ĵ�] �� �������̳� ������");	
										Xgirlfriend.�Ĵ���_��Ʈ��������_����(10);
										�Ĵ�.���¾˸�();
										
									}else if(������ģ������â == 2) {
										System.out.println("[�Ĵ�] (�λ縦 �� �ϴ°���)");
										Xgirlfriend.�Ĵ���_����������_����(10);
										�Ĵ�.���¾˸�();					
									}else {
										System.out.println("�ٽ� �Է��ϼ���."); 
										continue; 	
									}
									
								}else {
									System.out.println("�����̺�Ʈ�� �����ϴ�.");
								}
								
						    }else if(���б⼱��â == 3) {
								System.out.println(" ");
						    	System.out.println("���� �Խ��ϴ�.");
								System.out.println("������ ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. �θ�԰� �Ļ�");
								System.out.println("2. �ϱ⾲��");
								System.out.println("3. �����ڱ�");
								System.out.println("4. �ڷΰ���");
								System.out.println(" ");
								
								int ������â = scan.nextInt();
								
								if(������â ==1) {
									//��ưȿ����
									
									String parents[] = {
											"�θ�԰� �Ļ��ϸ� ��� ���� �̾߱⸦ �մϴ�.",
											"[�θ��] ����غ�� �� �� �ǰ� �ִ�?",
											"[�Ĵ�] ������� ������ �ϰ� �־�� ����",
											"[�θ��] �׷��׷� �� ȥ�� �˾Ƽ� �� �ϸ��� �ϴ´� ���� ",
											"[�Ĵ�] (��.. �̷��Գ� �� �Ͼ��ֽôµ� �� �ȵǳ� �Ф�) ",
											"[�θ��] �� ���� �԰� ������ �Ƶ�",
											" "
									};
									
									for (int i = 0; i <parents.length; i++) {
										Thread.sleep(500);//0.5�ʸ��� �� ���徿 ���
										System.out.println(parents[i]);
									}
									System.out.println(" ");

									�Ĵ�.�θ�԰��Ļ�();
									
									
									RelativeClass relative = new RelativeClass();
									relative.RelativeCome();
									relative.join(); 
									
									System.out.println(" ");
									System.out.println(" ");
									
									�Ĵ�.���¾˸�();
									
									
								}else if(������â == 2) {
										    System.out.println(" ");
										    System.out.println("�ϱ⸦ ���� �Ϸ縦 �����ϰ� �����θ� �����̴ϴ�.");
									�Ĵ�.�ϱ�();
									�Ĵ�.���¾˸�();
									
						    	}else if(������â == 3) {
								    System.out.println(" ");
								    
						    		System.out.println("������ ���� ������ ü���� �����մϴ�.");
						    		�Ĵ�.����();
						    		�Ĵ�.���¾˸�();
						    		
						    	}else if(������â == 4) {
									continue;
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						
								}
								
								
								Character UniversityFriend = new Character(); 
								UniversityFriend.���� = "������";
								
								if(UniversityFriend.kakaotalk()) {
									
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
							        
									System.out.println("�� ���� �̺�Ʈ <�������� ������ �հݼҽ�>");
									System.out.println("��ҿ� ������ ���� �����⿡�� ������ �հ��ߴٰ� �����ɴϴ�.");
									System.out.println("1. ���ϴ����� ���ش�.");
									System.out.println("2. �о��Ѵ�.");

									//��ü.��ü�Լ���. ��ü�� ���!	
									
									int �����⼱��â = scan.nextInt();
									
									if(�����⼱��â == 1) {
										System.out.println("[�Ĵ�] ������ ������������");	
										UniversityFriend.�Ĵ���_��Ʈ��������_����(10);
										�Ĵ�.���¾˸�();
										
									}else if(�����⼱��â == 2) {
										System.out.println("[�Ĵ�] (�о�) ���� ģ������ �ʾҴµ� ;;");
										UniversityFriend.�Ĵ���_����������_����(10);
										�Ĵ�.���¾˸�();					
									}else {
										System.out.println("�ٽ� �Է��ϼ���."); // ���� ������ ���丵�� �����Ͻðڽ��ϱ�?�� �ߵ���.
										continue; 	
									}
									
								}else {
									System.out.println("�����̺�Ʈ�� �����ϴ�.");
								}
								
						    }else if(���б⼱��â == 4) {
						    	continue;
						    }else {
								System.out.println("�ٽ� �Է��ϼ���.");
						    	continue;
						    }
						    
						}
						
						turnsOfSpringsemester ++;	
						
					}else if(���θ޴�����â == 2){
					
						�Ĵ�.���¾˸�();
						
					}else if(���θ޴�����â == 3) {
							
						System.out.println("������ �����Ͻðڽ��ϱ�?");
						System.out.println("1. ��");
						System.out.println("2. �ƴϿ�");
						
						int �������⼱��â = scan.nextInt();
						
						if(�������⼱��â ==1) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
							System.out.println("4�г� 1�б� ����غ� �����߽��ϴ�.");
							
//							FinishBgm FinishBgm = new FinishBgm(); // ���������ϸ� �ǴϽú�� ������!
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

						}else if(�������⼱��â == 2) {
							continue;
						}else {
							System.out.println("�ٽ� �Է��ϼ���."); // ������ �����Ͻðٽ��ϱ�?�� �ߵ���. ��ó�� ���θ޴�â�� �ƴ϶�.
							continue; 						   // �� if���� while�� �ȿ� �ְ� �Ǹ� �������⼱��â == 2�� 1.Ȱ�� 2. ����Ȯ�� 3. �������Ⱑ ���;�
						}
						
					}else {
						System.out.println("�ٽ� �Է��ϼ���.");
						continue;
					}

				}	
				
				
				System.out.println("4�г� 1�бⰡ �������ϴ�.");
				System.out.println("���������� ���۵Ǿ����ϴ�.");
				System.out.println("�������п� �ڰ��� �ܿ� �پ��� ����� �� �ϳ��� ���� �� �ֽ��ϴ�.");
				
				
				while (true) {
					System.out.println(" ");
					System.out.println("< ���θ޴� > ");
					System.out.println("1. Ȱ��"); // 1�� Ȱ��, 2�� ����Ȯ��, 3�� ��������
					System.out.println("2. ����Ȯ��");
					System.out.println("3. �������� ��������");
					System.out.println(" ");
							
					int ���θ޴�����â = scan.nextInt();
					
					if ( ���θ޴�����â == 1) {

						if (true) {
							System.out.println(" ");
							System.out.println("������ �Ͻðڽ��ϱ�?");
							System.out.println("1. ����");
							System.out.println("2. ���Ȱ��");
							System.out.println("3. ������");
							System.out.println("4. �ڷΰ���");
							System.out.println(" ");

							int �������м���â = scan.nextInt();

						    if (�������м���â == 1) {
								System.out.println("�б� ������ ���������Դϴ�."); // ������� �����մϴ�. ���� ���� Ȯ��
								���� ���� = new ����();
								����.�Ĵ���_��������_����(10);
								����.�Ĵ���_�ʱ�����_����(5);
								����.�Ĵ���_��������_����(5);
								����.�Ĵ���_ü������_����(10);
								����.�Ĵ���_����������_����(5);
								����.�Ĵ���_��Ʈ��������_����(10);
//								����.����_�߰�();
								
								�Ĵ�.���¾˸�();
								
								break;
						    
						    }else if(�������м���â == 2) {
								System.out.println(" ");
						    	System.out.println("� ���Ȱ���� �Ͻðڽ��ϱ�?");
								System.out.println("1. ���ڴ�");
								System.out.println("2. ��������");
								System.out.println("3. �ڷΰ���");
								System.out.println(" ");

								int ���Ȱ������â = scan.nextInt();
								
								if(���Ȱ������â ==1) {
									System.out.println("�������� ���� ���� ���ڴ��� �����մϴ�."); // ���� �� �������� ��簡 ����
									���ڴ� ���ڴ� = new ���ڴ�();
									���ڴ�.�Ĵ���_��������_����(10);
									���ڴ�.�Ĵ���_��������_����(5);
									���ڴ�.�Ĵ���_ü������_����(10);
									���ڴ�.�Ĵ���_��Ʈ��������_����(10);

									
									�Ĵ�.���¾˸�();
									
								}else if(���Ȱ������â == 2) {
									System.out.println("�������� ���� ���� ������� �����մϴ�."); // ���ڱ� ������ ����.
									�������� �������� = new ��������();
									��������.�Ĵ���_��������_����(10);
									��������.�Ĵ���_��������_����(5);
									��������.�Ĵ���_ü������_����(10);
									��������.�Ĵ���_��Ʈ��������_����(10);

									
									�Ĵ�.���¾˸�();
									
								}else if(���Ȱ������â == 3) {
									continue;
								}else {
									System.out.println("�ٽ� �Է��ϼ���.");
									continue; 						 
								}
								
								break;
								
						    }else if(�������м���â == 3) {
								System.out.println(" ");
						    	System.out.println("� �������� �Ͻðڽ��ϱ�?");
								System.out.println("1. ���̵�� ������");
								System.out.println("2. ��������");
								System.out.println("3. �ڷΰ���");
								System.out.println(" ");
								
								int ����������â = scan.nextInt();
								
								if(����������â ==1) {
									System.out.println("�������� ���� ���̵�� �������� �����մϴ�."); // �ٸ� ���� �� ���̵�� ����
									���̵������� ���̵������� = new ���̵�������();
									���̵�������.�Ĵ���_��������_����(10);
									���̵�������.�Ĵ���_��������_����(5);
									���̵�������.�Ĵ���_ü������_����(10);
									���̵�������.�Ĵ���_��Ʈ��������_����(10);
									���̵�������.â�Ƿ�_�߰�();
									
									�Ĵ�.���¾˸�();
									
								}else if(����������â == 2) {
									System.out.println("�������� ���� ���������� �����մϴ�."); // ���� ���԰� �ɻ��� Ȯ�� 	
									�������� �������� = new ��������();
									��������.�Ĵ���_��������_����(10);
									��������.�Ĵ���_��������_����(5);
									��������.�Ĵ���_ü������_����(10);
									��������.�Ĵ���_��Ʈ��������_����(10);
									��������.����_�߰�();
									
									�Ĵ�.���¾˸�();
									
						    	}else if(����������â == 3) {
						    		continue;
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						   
								}
							
								break;	
								
						    }else if(�������м���â == 4) {
						    	continue;
						    }else {
								System.out.println("�ٽ� �Է��ϼ���.");
						    	continue;
						    }
						    
						}	
						
					}else if(���θ޴�����â == 2){
						Buttonbgm ButtonBgm1 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm1.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
					
						�Ĵ�.���¾˸�();
						
					}else if(���θ޴�����â == 3) {
						Buttonbgm ButtonBgm1 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm1.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
							
						System.out.println("�������� ������ �����Ͻðڽ��ϱ�?");
						System.out.println("1. ��");
						System.out.println("2. �ƴϿ�");
						
						int �������⼱��â = scan.nextInt();
						
						if(�������⼱��â ==1) {
							Buttonbgm ButtonBgm3 = new Buttonbgm();
							
					        try {
					        	 ButtonBgm3.LoadBgm();
					             Thread.sleep(0);
					        }catch(InterruptedException e) {
					             e.printStackTrace();
					        }
					        System.out.println("�������� ����غ� �����߽��ϴ�.");
							
//							FinishBgm FinishBgm = new FinishBgm(); // ���������ϸ� �ǴϽú�� ������!
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

						}else if(�������⼱��â == 2) {
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
							System.out.println("�ٽ� �Է��ϼ���."); 
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
						System.out.println("�ٽ� �Է��ϼ���.");
						continue;
					}

				}
				
				System.out.println("���������� ������,");
				System.out.println("4�г� 2�бⰡ ���۵Ǿ����ϴ�.");
				System.out.println("===========================================================");
				System.out.println("2�б�� 9���� �� �� ���Դϴ�.");
				System.out.println("10���� �� �� �� ������ �����ؾ� �մϴ�.");
				System.out.println("11���� �� �� �� �ʱ������� �����ؾ� �մϴ�.");
				System.out.println("12���� �� �� �� ���������� �����ؾ� �մϴ�.");
				System.out.println("�� ������ �ʿ��� ������� �ڱ������ �����սô�!");
				System.out.println("===========================================================");	
				int Sep = 1; // 9�� �� ��!
				
				while (Sep <= 4) {
					System.out.println(" ");
					System.out.println("< ���θ޴� > ");
					System.out.println("1. Ȱ��"); // 1�� Ȱ��, 2�� ����Ȯ��, 3�� ��������
					System.out.println("2. ����Ȯ��");
					System.out.println("3. ��������");
					System.out.println(" ");

					int ���θ޴�����â = scan.nextInt();
					
					if ( ���θ޴�����â == 1) {

						if (true) {
							System.out.println("4�г� 2�б� 9�� : " + Sep + "/4" + "��° ���Դϴ�.");
							System.out.println("��� ���ðڽ��ϱ�?");
							System.out.println("1. �б��� ����");
							System.out.println("2. ���׿� ����");
							System.out.println("3. ���� ����");
							System.out.println("4. �ڷΰ���");
							System.out.println("<< �б�, ����, �� ���� ����Ȯ���� �̺�Ʈ�� Ƣ��ɴϴ�. >>");

							
							int ���б⼱��â = scan.nextInt();

						    if (���б⼱��â == 1) {
								System.out.println("�б��� �Խ��ϴ�.");
								System.out.println("�б����� ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. ��������");
								System.out.println("2. �������Ƹ�Ȱ��");
								System.out.println("3. ����������� ������");
								System.out.println("4. �������͵�");
								System.out.println("5. �ڷΰ���");

								int �б�����â = scan.nextInt();
								
								if(�б�����â ==1) {
							        System.out.println("��.. �������� ������ �ؾ���!!");
									System.out.println("�б����� ������ ���������� �մϴ�.");
									System.out.println(" ");
									�Ĵ�.��������();
									
									System.out.println(" ");
									
									SomethingGirl SomethingGirl = new SomethingGirl();

									SomethingGirl.SomethingGirlCome();
									SomethingGirl.join(); 
									System.out.println(" ");
									
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 2) {
									System.out.println("���Ƹ����� ����鿡�� ��������� ����ϴ�.");
									�Ĵ�.�������Ƹ�����_����();
									System.out.println(" ");
									
									CircleBroThread CircleBro = new CircleBroThread();

									CircleBro.CircleBroCome();
									CircleBro.join(); 
									System.out.println(" ");
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 3) {
									System.out.println("����������ο��� �������� �޽��ϴ�.");
									�Ĵ�.�����������_������();
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 4) {
									System.out.println("�������͵� ���� ���������� ��ȭ��ŵ�ϴ�.");
									�Ĵ�.�������͵�_����();
									
									InterviewStudyMember Studymember= new InterviewStudyMember();

									Studymember.GoFeedback();
									Studymember.join(); 
									
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 5) {
									continue;
							
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						 
								}
								
								
								Character InterviewFriend = new Character(); 
								InterviewFriend.���� = "������͵��";
								
									if(InterviewFriend.SuccessFirst()) {
										
										EventBgm EventBgm = new EventBgm();
										
								        try {
								        	EventBgm.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
								        
										System.out.println("�б� ���� �̺�Ʈ <������͵���� ���� �հ��߽��ϴ�.>");
										System.out.println("������Ƽ�� �����Ͻðڽ��ϱ�?");
										System.out.println("1. ����");
										System.out.println("2. ����");
			
										//��ü.��ü�Լ���. ��ü�� ���!	
										
										int goparty = scan.nextInt();
										
										if(goparty == 1) {
											System.out.println("������Ƽ�� ������ ���� ������� ����ϴ�.");	
											InterviewFriend.�Ĵ���_��������_����(5);
											InterviewFriend.�Ĵ���_�ʱ�����_����(5);
											InterviewFriend.�Ĵ���_��������_����(5);
											InterviewFriend.�Ĵ���_ü������_����(10);
											InterviewFriend.�Ĵ���_����������_����(5);
											
											�Ĵ�.���¾˸�();
											
										}else if(goparty == 2) {
											System.out.println("������Ƽ�� �����ϰ� ü���� ȸ���մϴ�.");
											InterviewFriend.�Ĵ���_ü������_����(15);
											InterviewFriend.�Ĵ���_����������_����(5);
											InterviewFriend.�Ĵ���_��Ʈ��������_����(5);
											
											�Ĵ�.���¾˸�();					
										}else {
											System.out.println("�ٽ� �Է��ϼ���.");
											continue; 	
										}
										
									}else {
										System.out.println("�����̺�Ʈ�� �����ϴ�.");
									}
								
						    }else if(���б⼱��â == 2) {
						    	System.out.println("���׿� �Խ��ϴ�.");
								System.out.println("���׿��� ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. �ｺ");
								System.out.println("2. ġ��");
								System.out.println("3. �ڷΰ���");
								
								int ���׼���â = scan.nextInt();
								
								if(���׼���â ==1) {
							        System.out.println(" ");
									System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
									System.out.println(" ");
									�Ĵ�.�ｺ��();
									�Ĵ�.���¾˸�();
									
								}else if(���׼���â == 2) {
									    System.out.println(" ");
										System.out.println("ġ������ ��Ʈ������ Ǳ�ϴ�.");
										�Ĵ�.ġ��();
										�Ĵ�.���¾˸�();
								
									
								}else if(���׼���â == 3) {
									continue;
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						 
								}
								
								// (����) ����б� ģ������ �Ⱥ���ȭ �� Ȯ�� 10% 
								
								Character HighschoolFriend = new Character(); 
								HighschoolFriend.���� = "����б� ģ��";
								
									if(HighschoolFriend.HiCall()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									
									System.out.println("���� ���� �̺�Ʈ <����б� ģ���� �Ⱥ���ȭ>");
									System.out.println("�ذ� �ִ� ����б� ģ������ ��ȭ�� �ɴϴ�.");
									System.out.println("1. ��ȭ�� �޴´�. ");
									System.out.println("2. ��ȭ�� ���� �ʴ´�. ");

									//��ü.��ü�Լ���. ��ü�� ���!	
									
									int �Ⱥ���ȭ����â = scan.nextInt();
									
									if(�Ⱥ���ȭ����â == 1) {
										System.out.println("[����б� ģ��] �� �ĴϾ�! �Ʊ� ���׿��� �� �� �� ���Ƽ� ��ȭ�߾�!");	
										System.out.println("[����б� ģ��] �� ������ �־���?");	
										System.out.println("[����б� ģ��] ������ ���ķ� �� ���� ���ôµ�! ���� �ʹپ�!");
										System.out.println("[�Ĵ�] ���� ƴ�� ���ֳ�!");
										System.out.println("[�Ĵ�] ���� ���� �ʹپ�!");
										
										HighschoolFriend.�Ĵ���_ü������_����(10);
										HighschoolFriend.�Ĵ���_����������_����(10);
										HighschoolFriend.�Ĵ���_��Ʈ��������_����(10);
										
										�Ĵ�.���¾˸�();
										
									}else if(�Ⱥ���ȭ����â == 2) {
										System.out.println("[�Ĵ�] �� ���� ������.. �����ϱ� ������..");
										HighschoolFriend.�Ĵ���_����������_����(10);
										HighschoolFriend.�Ĵ���_��Ʈ��������_����(10);
										
										�Ĵ�.���¾˸�();					
									}else {
										System.out.println("�ٽ� �Է��ϼ���."); 
										continue; 	
									}
									
								}else {
									System.out.println("�����̺�Ʈ�� �����ϴ�.");
								}
								
						    }else if(���б⼱��â == 3) {
						    	System.out.println("���� �Խ��ϴ�.");
								System.out.println("������ ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. �θ�԰� �Ļ�");
								System.out.println("2. �ϱ⾲��");
								System.out.println("3. �����ڱ�");
								System.out.println("4. �ڷΰ���");
								
								int ������â = scan.nextInt();
								
								if(������â ==1) {
							        String parents[] = {
											"�θ�԰� �Ļ��ϸ� ��� ���� �̾߱⸦ �մϴ�.",
											"[�θ��] ����غ�� �� �� �ǰ� �ִ�?",
											"[�Ĵ�] ������� ������ �ϰ� �־�� ����",
											"[�θ��] �׷��׷� �� ȥ�� �˾Ƽ� �� �ϸ��� �ϴ´� ���� ",
											"[�Ĵ�] (��.. �̷��Գ� �� �Ͼ��ֽôµ� �� �ȵǳ� �Ф�) ",
											"[�θ��] �� ���� �԰� ������ �Ƶ�",
											" "
									};
									
									for (int i = 0; i <parents.length; i++) {
										Thread.sleep(500);//0.5�ʸ��� �� ���徿 ���
										System.out.println(parents[i]);
									}
									System.out.println(" ");

									�Ĵ�.�θ�԰��Ļ�();
									System.out.println(" ");

									RelativeClass relative = new RelativeClass();
									relative.RelativeCome();
									relative.join(); 
									System.out.println(" ");

									�Ĵ�.���¾˸�();
									
								}else if(������â == 2) {
									 String Diary[] = { // Ÿ���� ������ - �͸� Ŭ����

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
									      // �� �� �����Ѵ�
									      Thread.sleep(100);
									      // �޼����� ����Ѵ�
									      System.out.println(Diary[i]);
									}
								    System.out.println(" ");
								    System.out.println("�ϱ⸦ ���� �Ϸ縦 �����ϰ� �����θ� �����̴ϴ�.");
							�Ĵ�.�ϱ�();
							�Ĵ�.���¾˸�();
						    	}else if(������â == 3) {
									    System.out.println(" ");
									    
							    		System.out.println("������ ���� ������ ü���� �����մϴ�.");
							    		�Ĵ�.����();
							    		�Ĵ�.���¾˸�();
						    		
						    	}else if(������â == 4) {
									continue;
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						
								}
								
								//(��) ������ ����ȣ�� �ؾ��մϴ�.
								Character Bro = new Character(); 
								Bro.���� = "������";
								
								if(Bro.gohospital()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("�� ���� �̺�Ʈ <������ �Կ�>");
									System.out.println("������ �Կ��߽��ϴ�.");
									System.out.println("����ȣ�� �Ͻðڽ��ϱ�?");
									System.out.println("1. ����ȣ�� �Ѵ�.");
									System.out.println("2. ���� �ʴ´�.");

									//��ü.��ü�Լ���. ��ü�� ���!	
									
									int ����ȣ����â = scan.nextInt();
									
									if(����ȣ����â == 1) {
										System.out.println("[�Ĵ�] (��.. ���ؿ� �����ϱ���..)");	
										System.out.println("[�Ĵ�] ���� �� ���� �׷��� �Ф�");	
										Bro.�Ĵ���_ü������_����(5);
										Bro.�Ĵ���_��Ʈ��������_����(5);
										�Ĵ�.���¾˸�();
										
									}else if(����ȣ����â == 2) {
										System.out.println("[�Ĵ�] �ʹ� �ٺ�.. �Ϲݱ� �غ��ؾ���..�Ф�");
										Bro.�Ĵ���_��Ʈ��������_����(5);
										Bro.�Ĵ���_����������_����(5);
										�Ĵ�.���¾˸�();					
									}else {
										System.out.println("�ٽ� �Է��ϼ���.");
										continue; 	
									}
									
								}else {
									System.out.println("�����̺�Ʈ�� �����ϴ�.");
								}
								
						    }else if(���б⼱��â == 4) {
						    	continue;
						    }else {
								System.out.println("�ٽ� �Է��ϼ���.");
						    	continue;
						    }
						    
						}
						
						Sep ++;	
						
					}else if(���θ޴�����â == 2){
						�Ĵ�.���¾˸�();
						
					}else if(���θ޴�����â == 3) {
							
						System.out.println("������ �����Ͻðڽ��ϱ�?");
						System.out.println("1. ��");
						System.out.println("2. �ƴϿ�");
						
						int �������⼱��â = scan.nextInt();
						
						if(�������⼱��â ==1) {
							System.out.println("9�� ����غ� �����߽��ϴ�.");					
							System.out.println("���� 10���Դϴ�.");
							
							break;

						}else if(�������⼱��â == 2) {
							continue;
						}else {
							System.out.println("�ٽ� �Է��ϼ���."); // ������ �����Ͻðٽ��ϱ�?�� �ߵ���. ��ó�� ���θ޴�â�� �ƴ϶�.
							continue; 						   // �� if���� while�� �ȿ� �ְ� �Ǹ� �������⼱��â == 2�� 1.Ȱ�� 2. ����Ȯ�� 3. �������Ⱑ ���;�
						}
						
					}else {
						System.out.println("�ٽ� �Է��ϼ���.");
						continue;
					}

				}
				
				System.out.println("10���Դϴ�.");	
				System.out.println("10�� �������ֿ� ���������� �ֽ��ϴ�.");					
				
				int OCT = 1; // 10�� �� ��! �� ���� ����!!
				
				while (OCT <= 3) {
					System.out.println(" ");
					System.out.println("< ���θ޴� > ");
					System.out.println("1. Ȱ��"); // 1�� Ȱ��, 2�� ����Ȯ��, 3�� ��������
					System.out.println("2. ����Ȯ��");
					System.out.println("3. ��������");
					System.out.println(" ");
							
					int ���θ޴�����â = scan.nextInt();
					
					if ( ���θ޴�����â == 1) {

						if (true) {
							System.out.println(" ");
							System.out.println("4�г� 2�б� 10�� : " + OCT + "/3" + "��° ���Դϴ�.");
							System.out.println("��� ���ðڽ��ϱ�?");
							System.out.println("1. �б��� ����");
							System.out.println("2. ���׿� ����");
							System.out.println("3. ���� ����");
							System.out.println("4. �ڷΰ���");
							System.out.println("<< �б�, ����, �� ���� ����Ȯ���� �̺�Ʈ�� Ƣ��ɴϴ�. >>");

							System.out.println(" ");
							
							int ���б⼱��â = scan.nextInt();

						    if (���б⼱��â == 1) {
								System.out.println(" ");
								System.out.println("�б��� �Խ��ϴ�.");
								System.out.println("�б����� ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. ��������");
								System.out.println("2. �������Ƹ�Ȱ��");
								System.out.println("3. ����������� ������");
								System.out.println("4. �������͵�");
								System.out.println("5. �ڷΰ���");
								System.out.println(" ");

								int �б�����â = scan.nextInt();
								
								if(�б�����â ==1) {
							        System.out.println("��.. �������� ������ �ؾ���!!");
									System.out.println("�б����� ������ ���������� �մϴ�.");
									�Ĵ�.��������();
									
									System.out.println(" ");
									
									SomethingGirl SomethingGirl = new SomethingGirl();

									SomethingGirl.SomethingGirlCome();
									SomethingGirl.join(); 
									System.out.println(" ");
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 2) {
									System.out.println("���Ƹ����� ����鿡�� ��������� ����ϴ�.");
									�Ĵ�.�������Ƹ�����_����();
									System.out.println(" ");
									
									CircleBroThread CircleBro = new CircleBroThread();

									CircleBro.CircleBroCome();
									CircleBro.join(); 
									System.out.println(" ");
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 3) {
									System.out.println("����������ο��� �������� �޽��ϴ�.");
									�Ĵ�.�����������_������();
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 4) {
									System.out.println("�������͵� ���� ���������� ��ȭ��ŵ�ϴ�.");
									�Ĵ�.�������͵�_����();
									
									InterviewStudyMember Studymember= new InterviewStudyMember();

									Studymember.GoFeedback();
									Studymember.join(); 
									
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 5) {
									continue;
							
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						 
								}
								Character InterviewFriend = new Character(); 
								InterviewFriend.���� = "������͵��";
								
									if(InterviewFriend.SuccessFirst()) {
										EventBgm EventBgm = new EventBgm();
										
								        try {
								        	EventBgm.LoadBgm();
								             Thread.sleep(0);
								             
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("�б� ���� �̺�Ʈ <������͵���� ���� �հ��߽��ϴ�.>");
										System.out.println("������Ƽ�� �����Ͻðڽ��ϱ�?");
										System.out.println("1. ����");
										System.out.println("2. ����");
			
										//��ü.��ü�Լ���. ��ü�� ���!	
										
										int goparty = scan.nextInt();
										
										if(goparty == 1) {
											System.out.println("������Ƽ�� ������ ���� ������� ����ϴ�.");	
											InterviewFriend.�Ĵ���_��������_����(5);
											InterviewFriend.�Ĵ���_�ʱ�����_����(5);
											InterviewFriend.�Ĵ���_��������_����(5);
											InterviewFriend.�Ĵ���_ü������_����(10);
											InterviewFriend.�Ĵ���_����������_����(5);
											
											�Ĵ�.���¾˸�();
											
										}else if(goparty == 2) {
											System.out.println("������Ƽ�� �����ϰ� ü���� ȸ���մϴ�.");
											InterviewFriend.�Ĵ���_ü������_����(15);
											InterviewFriend.�Ĵ���_����������_����(5);
											InterviewFriend.�Ĵ���_��Ʈ��������_����(5);
											
											�Ĵ�.���¾˸�();					
										}else {
											System.out.println("�ٽ� �Է��ϼ���.");
											continue; 	
										}
										
									}else {
										System.out.println("�����̺�Ʈ�� �����ϴ�.");
									}
								
								
						    }else if(���б⼱��â == 2) {
								System.out.println(" ");
						    	System.out.println("���׿� �Խ��ϴ�.");
								System.out.println("���׿��� ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. �ｺ");
								System.out.println("2. ġ��");
								System.out.println("3. �ڷΰ���");
								System.out.println(" ");
								
								int ���׼���â = scan.nextInt();
								
								if(���׼���â ==1) {
								    
								    System.out.println(" ");
									System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
									System.out.println(" ");
									�Ĵ�.�ｺ��();
									�Ĵ�.���¾˸�();
									
								}else if(���׼���â == 2) {
									String ChickenandBeer[] = { // Ÿ���� ������ - �͸� Ŭ����

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
										      // �� �� �����Ѵ�
										      Thread.sleep(100);
										      // �޼����� ����Ѵ�
										      System.out.println(ChickenandBeer[i]);
										}
									    System.out.println(" ");
										System.out.println("ġ������ ��Ʈ������ Ǳ�ϴ�.");
										�Ĵ�.ġ��();
										�Ĵ�.���¾˸�();
									
								}else if(���׼���â == 3) {
									System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
									�Ĵ�.�ｺ��();
									�Ĵ�.���¾˸�();
									continue;
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						 
								}
								
								// (����) ����б� ģ������ �Ⱥ���ȭ �� Ȯ�� 10% 
								
								Character HighschoolFriend = new Character(); 
								HighschoolFriend.���� = "����б� ģ��";
								
								if(HighschoolFriend.HiCall()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("���� ���� �̺�Ʈ <����б� ģ���� �Ⱥ���ȭ>");
									System.out.println("�ذ� �ִ� ����б� ģ������ ��ȭ�� �ɴϴ�.");
									System.out.println("1. ��ȭ�� �޴´�. ");
									System.out.println("2. ��ȭ�� ���� �ʴ´�. ");

									//��ü.��ü�Լ���. ��ü�� ���!	
									
									int �Ⱥ���ȭ����â = scan.nextInt();
									
									if(�Ⱥ���ȭ����â == 1) {
										System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
										�Ĵ�.�ｺ��();
										�Ĵ�.���¾˸�();
										System.out.println("[����б� ģ��] �� �ĴϾ�! �Ʊ� ���׿��� �� �� �� ���Ƽ� ��ȭ�߾�!");	
										System.out.println("[����б� ģ��] �� ������ �־���?");	
										System.out.println("[����б� ģ��] ������ ���ķ� �� ���� ���ôµ�! ���� �ʹپ�!");
										System.out.println("[�Ĵ�] ���� ƴ�� ���ֳ�!");
										System.out.println("[�Ĵ�] ���� ���� �ʹپ�!");
										
										HighschoolFriend.�Ĵ���_ü������_����(10);
										HighschoolFriend.�Ĵ���_����������_����(10);
										HighschoolFriend.�Ĵ���_��Ʈ��������_����(10);
										
										�Ĵ�.���¾˸�();
										
									}else if(�Ⱥ���ȭ����â == 2) {
										System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
										�Ĵ�.�ｺ��();
										�Ĵ�.���¾˸�();
										System.out.println("[�Ĵ�] �� ���� ������.. ���� ����� ������ ������..");
										HighschoolFriend.�Ĵ���_����������_����(10);
										HighschoolFriend.�Ĵ���_��Ʈ��������_����(10);
										
										�Ĵ�.���¾˸�();					
									}else {
										Buttonbgm ButtonBgm4 = new Buttonbgm();
										
								        try {
								        	 ButtonBgm4.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
										�Ĵ�.�ｺ��();
										�Ĵ�.���¾˸�();
										System.out.println("�ٽ� �Է��ϼ���."); 
										continue; 	
									}
									
								}else {
									System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
									�Ĵ�.�ｺ��();
									�Ĵ�.���¾˸�();
									System.out.println("�����̺�Ʈ�� �����ϴ�.");
								}
								
						    }else if(���б⼱��â == 3) {
								System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
								�Ĵ�.�ｺ��();
								�Ĵ�.���¾˸�();
								System.out.println(" ");
						    	System.out.println("���� �Խ��ϴ�.");
								System.out.println("������ ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. �θ�԰� �Ļ�");
								System.out.println("2. �ϱ⾲��");
								System.out.println("3. �����ڱ�");
								System.out.println("4. �ڷΰ���");
								System.out.println(" ");
								
								int ������â = scan.nextInt();
								
								if(������â ==1) {
							        String parents[] = {
											"�θ�԰� �Ļ��ϸ� ��� ���� �̾߱⸦ �մϴ�.",
											"[�θ��] ����غ�� �� �� �ǰ� �ִ�?",
											"[�Ĵ�] ������� ������ �ϰ� �־�� ����",
											"[�θ��] �׷��׷� �� ȥ�� �˾Ƽ� �� �ϸ��� �ϴ´� ���� ",
											"[�Ĵ�] (��.. �̷��Գ� �� �Ͼ��ֽôµ� �� �ȵǳ� �Ф�) ",
											"[�θ��] �� ���� �԰� ������ �Ƶ�",
											" "
									};
									
									for (int i = 0; i <parents.length; i++) {
										Thread.sleep(500);//0.5�ʸ��� �� ���徿 ���
										System.out.println(parents[i]);
									}
									System.out.println(" ");

									�Ĵ�.�θ�԰��Ļ�();
									System.out.println(" ");
									
									RelativeClass relative = new RelativeClass();
									relative.RelativeCome();
									relative.join(); 
									
									�Ĵ�.���¾˸�();
									
								}else if(������â == 2) {
							        
								    System.out.println(" ");
								    System.out.println("�ϱ⸦ ���� �Ϸ縦 �����ϰ� �����θ� �����̴ϴ�.");
									�Ĵ�.�ϱ�();
									�Ĵ�.���¾˸�();
									
						    	}else if(������â == 3) {
										    System.out.println(" ");
								    		System.out.println("������ ���� ������ ü���� �����մϴ�.");
								    		�Ĵ�.����();
								    		�Ĵ�.���¾˸�();
						    		
						    	}else if(������â == 4) {

									continue;
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						
								}
								
								//(��) ������ ����ȣ�� �ؾ��մϴ�.
								Character Bro = new Character(); 
								Bro.���� = "������";
								
								if(Bro.gohospital()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("�� ���� �̺�Ʈ <������ �Կ�>");
									System.out.println("������ �Կ��߽��ϴ�.");
									System.out.println("����ȣ�� �Ͻðڽ��ϱ�?");
									System.out.println("1. ����ȣ�� �Ѵ�.");
									System.out.println("2. ���� �ʴ´�.");

									//��ü.��ü�Լ���. ��ü�� ���!	
									
									int ����ȣ����â = scan.nextInt();
									
									if(����ȣ����â == 1) {
										
										System.out.println("[�Ĵ�] (��.. ���ؿ� �����ϱ���..)");	
										System.out.println("[�Ĵ�] ���� �� ���� �׷��� �Ф�");	
										Bro.�Ĵ���_ü������_����(5);
										Bro.�Ĵ���_��Ʈ��������_����(5);
										�Ĵ�.���¾˸�();
										
									}else if(����ȣ����â == 2) {
										System.out.println("[�Ĵ�] �ʹ� �ٺ�.. �Ϲݱ� �غ��ؾ���..�Ф�");
										Bro.�Ĵ���_��Ʈ��������_����(5);
										Bro.�Ĵ���_����������_����(5);
										�Ĵ�.���¾˸�();					
									}else {
										System.out.println("�ٽ� �Է��ϼ���.");
										continue; 	
									}
									
								}else {
									System.out.println("�����̺�Ʈ�� �����ϴ�.");
								}
								
						    }else if(���б⼱��â == 4) {
						    	continue;
						    }else {
								System.out.println("�ٽ� �Է��ϼ���.");
						    	continue;
						    }
						}
						
						OCT ++;	
						
					}else if(���θ޴�����â == 2){
						�Ĵ�.���¾˸�();
						
					}else if(���θ޴�����â == 3) {
							
						System.out.println("������ �����Ͻðڽ��ϱ�?");
						System.out.println("1. ��");
						System.out.println("2. �ƴϿ�");
						
						int �������⼱��â = scan.nextInt();
						
						if(�������⼱��â ==1) {
							System.out.println("10�� ����غ� �����մϴ�.");					
							
							break;

						}else if(�������⼱��â == 2) {
							continue;
						}else {
							System.out.println("�ٽ� �Է��ϼ���."); // ������ �����Ͻðٽ��ϱ�?�� �ߵ���. ��ó�� ���θ޴�â�� �ƴ϶�.
							continue; 						   // �� if���� while�� �ȿ� �ְ� �Ǹ� �������⼱��â == 2�� 1.Ȱ�� 2. ����Ȯ�� 3. �������Ⱑ ���;�
						}
						
					}else {
						System.out.println("�ٽ� �Է��ϼ���.");
						continue;
					}

				}
				
				System.out.println("�Ϲݱ�ä�� ���� ���� �ְ��Դϴ�.");
				System.out.println("������ �����Ͻðڽ��ϱ�?");
				
				int Apply;
				Apply = 0;
				
				while(Apply<1) {
				System.out.println("1�� : �����Ѵ�");
				System.out.println("2�� : ��������");
						
				int Apply2 = scan.nextInt();
				
				if(Apply2 == 1) {
		 			 
					 System.out.println(" ");
					 String JopPhoto[] = { // Ÿ���� ������ - �͸� Ŭ����

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
					      // �� �� �����Ѵ�
					      Thread.sleep(100);
					      // �޼����� ����Ѵ�
					      System.out.println(JopPhoto[i]);
					}
				    System.out.println(" ");
					

					
					System.out.println("�� ���������� ���� ĿƮ���ΰ� ���մϴ�.");
					System.out.println(" ");
					
					if(�Ĵ�.�Ĵ�_��������>=��������λ���.��������_ĿƮ����) {
						
				        //�н���� (�ε���ݰ� ����)
					   	LoadingBgm passBgm01 = new LoadingBgm();
				          
				        try {
				             passBgm01.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						
						System.out.println("===========================================================");
						System.out.println(" ");
						
						String PASS[] = { // Ÿ���� ������ - �͸� Ŭ����
					            "______   ___   _____  _____ ",    
					            "| ___ \\ / _ \\ /  ___|/  ___|",
					            "| |_/ // /_\\ \\\\ `--. \\ `--. ",
					            "|  __/ |  _  | `--. \\ `--. \\",
					            "| |    | | | |/\\__/ //\\__/ /",
					            "\\_|    \\_| |_/\\____/ \\____/"
					    };

				        
					    for (int i = 0; i < PASS.length; i++) {
						      // �� �� �����Ѵ�
						      Thread.sleep(450);
						      // �޼����� ����Ѵ�
						      System.out.println(PASS[i]);
						} 
						System.out.println(" ");
						System.out.println("���������� �հ��Ͽ����ϴ�!!");
						System.out.println("�ʱ������� �غ��ϼ���!!");
						System.out.println("===========================================================");
						
						break ;
						
					}else {

						System.out.println("���ϴ� �ƽ��Ե� �ݹ� �ű����� ä�� �����ɻ翡�� ���հ��Ͽ����ϴ�.");
						System.out.println("������ ����Ǿ����ϴ�."); 
						
						
						String GameEnd[] = { // Ÿ���� ������ - �͸� Ŭ����
								
								
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
						      // �� �� �����Ѵ�
						      Thread.sleep(250);
						      // �޼����� ����Ѵ�
						      System.out.println(GameEnd[i]);
						} 
					   	    
						
		//������ ����Ǿ��      
						System.exit(0);
						
//						
					}
					
					
					
				}else if(Apply2 == 2) {
					String GameEnd[] = { // Ÿ���� ������ - �͸� Ŭ����

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
					      // �� �� �����Ѵ�
					      Thread.sleep(250);
					      // �޼����� ����Ѵ�
					      System.out.println(GameEnd[i]);
					} 
					
					System.out.println("������ �����߽��ϴ�.");
					System.out.println("������ ����Ǿ����ϴ�.");
					
		//������ ����Ǿ��
					
					System.exit(0);
					
					break;
					
									
				}else {
					System.out.println("�ٽ� �Է��ϼ���.");
					 
					continue;
				}
				Apply++;
				}
				
				System.out.println("11���Դϴ�.");
				System.out.println("11�� ������ �ֿ� �ִ� �ʱ������� �غ��սô�.");
				
				
				int NOV = 1; // 11�� �� ��! �� �ʱ� ����!!
				
				while (NOV <= 3) {
					System.out.println(" ");
					System.out.println("< ���θ޴� > ");
					System.out.println("1. Ȱ��"); // 1�� Ȱ��, 2�� ����Ȯ��, 3�� ��������
					System.out.println("2. ����Ȯ��");
					System.out.println("3. 11�� ��������");
					System.out.println(" ");
							
					int ���θ޴�����â = scan.nextInt();
					
					if ( ���θ޴�����â == 1) {

						if (true) {
							System.out.println(" ");
							System.out.println("4�г� 2�б� 11�� : " + NOV + "/3" + "��° ���Դϴ�.");
							System.out.println("��� ���ðڽ��ϱ�?");
							System.out.println("1. �б��� ����");
							System.out.println("2. ���׿� ����");
							System.out.println("3. ���� ����");
							System.out.println("4. �ڷΰ���");
							System.out.println("<< �б�, ����, �� ���� ����Ȯ���� �̺�Ʈ�� Ƣ��ɴϴ�. >>");

							System.out.println(" ");
							
							int ���б⼱��â = scan.nextInt();

						    if (���б⼱��â == 1) {
								System.out.println(" ");
						    	System.out.println("�б��� �Խ��ϴ�.");
								System.out.println("�б����� ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. ��������");
								System.out.println("2. �������Ƹ�Ȱ��");
								System.out.println("3. ����������� ������");
								System.out.println("4. �������͵�");
								System.out.println("5. �ڷΰ���");
								System.out.println(" ");

								int �б�����â = scan.nextInt();
								
								if(�б�����â ==1) {
							        System.out.println("��.. �������� ������ �ؾ���!!");
									System.out.println("�б����� ������ ���������� �մϴ�.");
									�Ĵ�.��������();
									
									System.out.println(" ");
									
									SomethingGirl SomethingGirl = new SomethingGirl();

									SomethingGirl.SomethingGirlCome();
									SomethingGirl.join(); 
									System.out.println(" ");
									
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 2) {
									System.out.println("���Ƹ����� ����鿡�� ��������� ����ϴ�.");
									�Ĵ�.�������Ƹ�����_����();
									System.out.println(" ");
									
									CircleBroThread CircleBro = new CircleBroThread();

									CircleBro.CircleBroCome();
									CircleBro.join(); 
									System.out.println(" ");
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 3) {
									System.out.println("����������ο��� �������� �޽��ϴ�.");
									�Ĵ�.�����������_������();
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 4) {
									System.out.println("�������͵� ���� ���������� ��ȭ��ŵ�ϴ�.");
									�Ĵ�.�������͵�_����();
									
									InterviewStudyMember Studymember= new InterviewStudyMember();

									Studymember.GoFeedback();
									Studymember.join(); 
									
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 5) {
									continue;
							
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						 
								}
								
								// (�б�) ������͵�� ���� �հ��ؼ� ����Ƽ �� Ȯ�� 10%

//								int ���丵Ƚ��;
//								���丵Ƚ�� = 0;
//								while(���丵Ƚ��<1)
								
								Character InterviewFriend = new Character(); 
								InterviewFriend.���� = "������͵��";
								
									if(InterviewFriend.SuccessFirst()) {
										EventBgm EventBgm = new EventBgm();
										
								        try {
								        	EventBgm.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										
										System.out.println("�б� ���� �̺�Ʈ <������͵���� ���� �հ��߽��ϴ�.>");
										System.out.println("������Ƽ�� �����Ͻðڽ��ϱ�?");
										System.out.println("1. ����");
										System.out.println("2. ����");
			
										//��ü.��ü�Լ���. ��ü�� ���!	
										
										int goparty = scan.nextInt();
										
										if(goparty == 1) {
											System.out.println("������Ƽ�� ������ ���� ������� ����ϴ�.");	
											InterviewFriend.�Ĵ���_��������_����(5);
											InterviewFriend.�Ĵ���_�ʱ�����_����(5);
											InterviewFriend.�Ĵ���_��������_����(5);
											InterviewFriend.�Ĵ���_ü������_����(10);
											InterviewFriend.�Ĵ���_����������_����(5);
											
											�Ĵ�.���¾˸�();
											
										}else if(goparty == 2) {
											System.out.println("������Ƽ�� �����ϰ� ü���� ȸ���մϴ�.");
											InterviewFriend.�Ĵ���_ü������_����(15);
											InterviewFriend.�Ĵ���_����������_����(5);
											InterviewFriend.�Ĵ���_��Ʈ��������_����(5);
											
											�Ĵ�.���¾˸�();					
										}else {
											System.out.println("�ٽ� �Է��ϼ���.");
											continue; 	
										}
										
									}else {
										System.out.println("�����̺�Ʈ�� �����ϴ�.");
									}
								
								
						    }else if(���б⼱��â == 2) {
								System.out.println(" ");
						    	System.out.println("���׿� �Խ��ϴ�.");
								System.out.println("���׿��� ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. �ｺ");
								System.out.println("2. ġ��");
								System.out.println("3. �ڷΰ���");
								System.out.println(" ");
								
								int ���׼���â = scan.nextInt();
								
								if(���׼���â ==1) {
								    
								    System.out.println(" ");
									System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
									System.out.println(" ");
									�Ĵ�.�ｺ��();
									�Ĵ�.���¾˸�();
									
								}else if(���׼���â == 2) {
									    System.out.println(" ");
										System.out.println("ġ������ ��Ʈ������ Ǳ�ϴ�.");
										�Ĵ�.ġ��();
										�Ĵ�.���¾˸�();
									
								}else if(���׼���â == 3) {
									continue;
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						 
								}
								
								// (����) ����б� ģ������ �Ⱥ���ȭ �� Ȯ�� 10% 
								
								Character HighschoolFriend = new Character(); 
								HighschoolFriend.���� = "����б� ģ��";
								
								if(HighschoolFriend.HiCall()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									
									System.out.println("���� ���� �̺�Ʈ <����б� ģ���� �Ⱥ���ȭ>");
									System.out.println("�ذ� �ִ� ����б� ģ������ ��ȭ�� �ɴϴ�.");
									System.out.println("1. ��ȭ�� �޴´�. ");
									System.out.println("2. ��ȭ�� ���� �ʴ´�. ");

									//��ü.��ü�Լ���. ��ü�� ���!	
									
									int �Ⱥ���ȭ����â = scan.nextInt();
									
									if(�Ⱥ���ȭ����â == 1) {
										System.out.println("[����б� ģ��] �� �ĴϾ�! �Ʊ� ���׿��� �� �� �� ���Ƽ� ��ȭ�߾�!");	
										System.out.println("[����б� ģ��] �� ������ �־���?");	
										System.out.println("[����б� ģ��] ������ ���ķ� �� ���� ���ôµ�! ���� �ʹپ�!");
										System.out.println("[�Ĵ�] ���� ƴ�� ���ֳ�!");
										System.out.println("[�Ĵ�] ���� ���� �ʹپ�!");
										
										HighschoolFriend.�Ĵ���_ü������_����(10);
										HighschoolFriend.�Ĵ���_����������_����(10);
										HighschoolFriend.�Ĵ���_��Ʈ��������_����(10);
										
										�Ĵ�.���¾˸�();
										
									}else if(�Ⱥ���ȭ����â == 2) {
										System.out.println("[�Ĵ�] �� ���� ������.. ���� ����� ������ ������..");
										HighschoolFriend.�Ĵ���_����������_����(10);
										HighschoolFriend.�Ĵ���_��Ʈ��������_����(10);
										
										�Ĵ�.���¾˸�();					
									}else {
										System.out.println("�ٽ� �Է��ϼ���."); 
										continue; 	
									}
									
								}else {
									System.out.println("�����̺�Ʈ�� �����ϴ�.");
								}
								
						    }else if(���б⼱��â == 3) {
								System.out.println(" ");
						    	System.out.println("���� �Խ��ϴ�.");
								System.out.println("������ ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. �θ�԰� �Ļ�");
								System.out.println("2. �ϱ⾲��");
								System.out.println("3. �����ڱ�");
								System.out.println("4. �ڷΰ���");
								System.out.println(" ");

								int ������â = scan.nextInt();
								
								if(������â ==1) {
							        String parents[] = {
											"�θ�԰� �Ļ��ϸ� ��� ���� �̾߱⸦ �մϴ�.",
											"[�θ��] ����غ�� �� �� �ǰ� �ִ�?",
											"[�Ĵ�] ������� ������ �ϰ� �־�� ����",
											"[�θ��] �׷��׷� �� ȥ�� �˾Ƽ� �� �ϸ��� �ϴ´� ���� ",
											"[�Ĵ�] (��.. �̷��Գ� �� �Ͼ��ֽôµ� �� �ȵǳ� �Ф�) ",
											"[�θ��] �� ���� �԰� ������ �Ƶ�",
											" "
									};
									
									for (int i = 0; i <parents.length; i++) {
										Thread.sleep(500);//0.5�ʸ��� �� ���徿 ���
										System.out.println(parents[i]);
									}
									System.out.println(" ");

									�Ĵ�.�θ�԰��Ļ�();
									System.out.println(" ");
									
									RelativeClass relative = new RelativeClass();
									relative.RelativeCome();
									relative.join(); 
									
									�Ĵ�.���¾˸�();
									
								}else if(������â == 2) {
								    System.out.println(" ");
								    System.out.println("�ϱ⸦ ���� �Ϸ縦 �����ϰ� �����θ� �����̴ϴ�.");
									�Ĵ�.�ϱ�();
									�Ĵ�.���¾˸�();
									
						    	}else if(������â == 3) {
										    System.out.println(" ");
										    
								    		System.out.println("������ ���� ������ ü���� �����մϴ�.");
								    		�Ĵ�.����();
								    		�Ĵ�.���¾˸�();
						    		
						    	}else if(������â == 4) {
									continue;
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						
								}
								
								//(��) ������ ����ȣ�� �ؾ��մϴ�.
								Character Bro = new Character(); 
								Bro.���� = "������";
								
								if(Bro.gohospital()) {
									
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
							        
									System.out.println("�� ���� �̺�Ʈ <������ �Կ�>");
									System.out.println("������ �Կ��߽��ϴ�.");
									System.out.println("����ȣ�� �Ͻðڽ��ϱ�?");
									System.out.println("1. ����ȣ�� �Ѵ�.");
									System.out.println("2. ���� �ʴ´�.");

									//��ü.��ü�Լ���. ��ü�� ���!	
									
									int ����ȣ����â = scan.nextInt();
									
									if(����ȣ����â == 1) {
										System.out.println("[�Ĵ�] (��.. ���ؿ� �����ϱ���..)");	
										System.out.println("[�Ĵ�] ���� �� ���� �׷��� �Ф�");	
										Bro.�Ĵ���_ü������_����(5);
										Bro.�Ĵ���_��Ʈ��������_����(5);
										�Ĵ�.���¾˸�();
										
									}else if(����ȣ����â == 2) {
										System.out.println("[�Ĵ�] �ʹ� �ٺ�.. �Ϲݱ� �غ��ؾ���..�Ф�");
										Bro.�Ĵ���_��Ʈ��������_����(5);
										Bro.�Ĵ���_����������_����(5);
										�Ĵ�.���¾˸�();					
									}else {
										System.out.println("�ٽ� �Է��ϼ���.");
										continue; 	
									}
									
								}else {
									System.out.println("�����̺�Ʈ�� �����ϴ�.");
								}
								
						    }else if(���б⼱��â == 4) {
						    	continue;
						    }else {
								System.out.println("�ٽ� �Է��ϼ���.");
						    	continue;
						    }
						    
						}
						
						NOV ++;	
						
					}else if(���θ޴�����â == 2){
					
						�Ĵ�.���¾˸�();
						
					}else if(���θ޴�����â == 3) {
							
						System.out.println("11�� ������ �����Ͻðڽ��ϱ�?");
						System.out.println("1. ��");
						System.out.println("2. �ƴϿ�");
						
						int �������⼱��â = scan.nextInt();
						
						if(�������⼱��â ==1) {
							System.out.println("11�� ����غ� �����߽��ϴ�.");					

							
							break;

						}else if(�������⼱��â == 2) {
							continue;
						}else {
							System.out.println("�ٽ� �Է��ϼ���."); // ������ �����Ͻðٽ��ϱ�?�� �ߵ���. ��ó�� ���θ޴�â�� �ƴ϶�.
							continue; 						   // �� if���� while�� �ȿ� �ְ� �Ǹ� �������⼱��â == 2�� 1.Ȱ�� 2. ����Ȯ�� 3. �������Ⱑ ���;�
						}
						
					}else {
						System.out.println("�ٽ� �Է��ϼ���.");
						continue;
					}

				}
				
				System.out.println("�Ϲݱ�ä�� �ʱ� ���� �ְ��Դϴ�.");
				System.out.println("�ʱ� ������ ���� ���ðڽ��ϱ�?");
				
				int WriteTest;
				WriteTest = 0;
				
				while(WriteTest<1) {
				System.out.println("1�� : �����Ѵ�");
				System.out.println("2�� : �����ܴ�");
						
				int WriteTest2 = scan.nextInt();
				
				if(WriteTest2 == 1) {
					
					System.out.println(" ");
					String JopPhoto[] = { // Ÿ���� ������ - �͸� Ŭ����

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
					      // �� �� �����Ѵ�
					      Thread.sleep(100);
					      // �޼����� ����Ѵ�
					      System.out.println(JopPhoto[i]);
					}
				    System.out.println(" ");
					
				    System.out.println("�� �ʱ������� ���� ĿƮ���ΰ� ���մϴ�.");
				    
					if(�Ĵ�.�Ĵ�_�ʱ�����>=��������λ���.�ʱ�����_ĿƮ����) {
						
				        //�н���� (�ε���ݰ� ����)
					   	LoadingBgm passBgm02 = new LoadingBgm();
				          
				        try {
				             passBgm02.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }

						
						System.out.println("===========================================================");
						System.out.println(" ");
						
						String PASS[] = { // Ÿ���� ������ - �͸� Ŭ����
					            "______   ___   _____  _____ ",    
					            "| ___ \\ / _ \\ /  ___|/  ___|",
					            "| |_/ // /_\\ \\\\ `--. \\ `--. ",
					            "|  __/ |  _  | `--. \\ `--. \\",
					            "| |    | | | |/\\__/ //\\__/ /",
					            "\\_|    \\_| |_/\\____/ \\____/"
					    };

				        
					    for (int i = 0; i < PASS.length; i++) {
						      // �� �� �����Ѵ�
						      Thread.sleep(450);
						      // �޼����� ����Ѵ�
						      System.out.println(PASS[i]);
						} 
						System.out.println(" ");
						System.out.println("�ʱ������� �հ��Ͽ����ϴ�!!");
						System.out.println("���������� �غ��ϼ���!!");
						System.out.println("===========================================================");
						
						break;
						
					}else {
						
						System.out.println("���ϲ����� �ƽ��Ե� ���� ��ܿ� ������ �˷��帳�ϴ�. �����մϴ�.");	
						System.out.println("������ ����Ǿ����ϴ�.");
						
						GoodbyeWorldBgm GoodbyeWorldBgm = new GoodbyeWorldBgm();
						GoodbyeWorldBgm.join();
						
				        try {
				        	GoodbyeWorldBgm.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						
						String GameEnd[] = { // Ÿ���� ������ - �͸� Ŭ����

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
						      // �� �� �����Ѵ�
						      Thread.sleep(250);
						      // �޼����� ����Ѵ�
						      System.out.println(GameEnd[i]);
						} 
						

						
						System.exit(0);
					}
		//������ ����Ǿ�� �Ѵ�.			
				}else if(WriteTest2 == 2) {
					GoodbyeWorldBgm GoodbyeWorldBgm = new GoodbyeWorldBgm();
					GoodbyeWorldBgm.join();
					
			        try {
			        	GoodbyeWorldBgm.LoadBgm();
			             Thread.sleep(0);
			        }catch(InterruptedException e) {
			             e.printStackTrace();
			        }
					String GameEnd[] = { // Ÿ���� ������ - �͸� Ŭ����

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
					      // �� �� �����Ѵ�
					      Thread.sleep(250);
					      // �޼����� ����Ѵ�
					      System.out.println(GameEnd[i]);
					} 
					
				    System.out.println("����غ� �����߽��ϴ�.");
					System.out.println("������ ����Ǿ����ϴ�.");
					
					System.exit(0);
		//������ ����Ǿ�� �Ѵ�.			
					break;
					
									
				}else {
					System.out.println("�ٽ� �Է��ϼ���.");
					 
					continue;
				}
				WriteTest++;
				}
				
				System.out.println("12�� ������ �ֿ� �ִ� ���������� �غ��սô�.");
				
				int DEC = 1; // 12�� �� ��! �� ���� ����!!
				
				while (DEC <= 3) {
					System.out.println("< ���θ޴� > ");
					System.out.println("1. Ȱ��"); // 1�� Ȱ��, 2�� ����Ȯ��, 3�� ��������
					System.out.println("2. ����Ȯ��");
					System.out.println("3. ��������");
							
					int ���θ޴�����â = scan.nextInt();
					
					if ( ���θ޴�����â == 1) {

						if (true) {
							System.out.println(" ");
							System.out.println("4�г� 2�б� 12�� : " + DEC + "/3" + "��° ���Դϴ�.");
							System.out.println("��� ���ðڽ��ϱ�?");
							System.out.println("1. �б��� ����");
							System.out.println("2. ���׿� ����");
							System.out.println("3. ���� ����");
							System.out.println("4. �ڷΰ���");
							System.out.println("<< �б�, ����, �� ���� ����Ȯ���� �̺�Ʈ�� Ƣ��ɴϴ�. >>");
							System.out.println(" ");
							
							int ���б⼱��â = scan.nextInt();

						    if (���б⼱��â == 1) {
								System.out.println(" ");
								System.out.println("�б��� �Խ��ϴ�.");
								System.out.println("�б����� ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. ��������");
								System.out.println("2. �������Ƹ�Ȱ��");
								System.out.println("3. ����������� ������");
								System.out.println("4. �������͵�");
								System.out.println("5. �ڷΰ���");
								System.out.println(" ");

								int �б�����â = scan.nextInt();
								
								if(�б�����â ==1) {
							        System.out.println("��.. �������� ������ �ؾ���!!");
									System.out.println("�б����� ������ ���������� �մϴ�.");
									�Ĵ�.��������();
									System.out.println(" ");
									
									SomethingGirl SomethingGirl = new SomethingGirl();

									SomethingGirl.SomethingGirlCome();
									SomethingGirl.join(); 
									System.out.println(" ");
									
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 2) {
									System.out.println("���Ƹ����� ����鿡�� ��������� ����ϴ�.");
									�Ĵ�.�������Ƹ�����_����();
									System.out.println(" ");
									
									CircleBroThread CircleBro = new CircleBroThread();

									CircleBro.CircleBroCome();
									CircleBro.join(); 
									System.out.println(" ");
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 3) {
									System.out.println("����������ο��� �������� �޽��ϴ�.");
									�Ĵ�.�����������_������();
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 4) {
									System.out.println("�������͵� ���� ���������� ��ȭ��ŵ�ϴ�.");
									�Ĵ�.�������͵�_����();
									
									InterviewStudyMember Studymember= new InterviewStudyMember();

									Studymember.GoFeedback();
									Studymember.join(); 
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 5) {
									continue;
							
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						 
								}
								
								Character InterviewFriend = new Character(); 
								InterviewFriend.���� = "������͵��";
								
									if(InterviewFriend.SuccessFirst()) {
										
										EventBgm EventBgm = new EventBgm();
										
								        try {
								        	EventBgm.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
								        
										System.out.println("�б� ���� �̺�Ʈ <������͵���� ���� �հ��߽��ϴ�.>");
										System.out.println("������Ƽ�� �����Ͻðڽ��ϱ�?");
										System.out.println("1. ����");
										System.out.println("2. ����");
			
										//��ü.��ü�Լ���. ��ü�� ���!	
										
										int goparty = scan.nextInt();
										
										if(goparty == 1) {
											System.out.println("������Ƽ�� ������ ���� ������� ����ϴ�.");	
											InterviewFriend.�Ĵ���_��������_����(5);
											InterviewFriend.�Ĵ���_�ʱ�����_����(5);
											InterviewFriend.�Ĵ���_��������_����(5);
											InterviewFriend.�Ĵ���_ü������_����(10);
											InterviewFriend.�Ĵ���_����������_����(5);
											
											�Ĵ�.���¾˸�();
											
										}else if(goparty == 2) {
											System.out.println("������Ƽ�� �����ϰ� ü���� ȸ���մϴ�.");
											InterviewFriend.�Ĵ���_ü������_����(15);
											InterviewFriend.�Ĵ���_����������_����(5);
											InterviewFriend.�Ĵ���_��Ʈ��������_����(5);
											
											�Ĵ�.���¾˸�();					
										}else {
											System.out.println("�ٽ� �Է��ϼ���.");
											continue; 	
										}
										
									}else {
										System.out.println("�����̺�Ʈ�� �����ϴ�.");
									}
								
								
						    }else if(���б⼱��â == 2) {
								System.out.println(" ");
						    	System.out.println("���׿� �Խ��ϴ�.");
								System.out.println("���׿��� ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. �ｺ");
								System.out.println("2. ġ��");
								System.out.println("3. �ڷΰ���");
								System.out.println(" ");
								
								int ���׼���â = scan.nextInt();
								
								if(���׼���â ==1) {
							        
							        System.out.println(" ");
							        
								    System.out.println(" ");
									System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
									System.out.println(" ");
									�Ĵ�.�ｺ��();
									�Ĵ�.���¾˸�();
									
								}else if(���׼���â == 2) {
									    System.out.println(" ");
										System.out.println("ġ������ ��Ʈ������ Ǳ�ϴ�.");
										�Ĵ�.ġ��();
										�Ĵ�.���¾˸�();
									
								}else if(���׼���â == 3) {
									continue;
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						 
								}
								
								// (����) ����б� ģ������ �Ⱥ���ȭ �� Ȯ�� 10% 
								
								Character HighschoolFriend = new Character(); 
								HighschoolFriend.���� = "����б� ģ��";
								
								if(HighschoolFriend.HiCall()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									
									System.out.println("���� ���� �̺�Ʈ <����б� ģ���� �Ⱥ���ȭ>");
									System.out.println("�ذ� �ִ� ����б� ģ������ ��ȭ�� �ɴϴ�.");
									System.out.println("1. ��ȭ�� �޴´�. ");
									System.out.println("2. ��ȭ�� ���� �ʴ´�. ");

									//��ü.��ü�Լ���. ��ü�� ���!	
									
									int �Ⱥ���ȭ����â = scan.nextInt();
									
									if(�Ⱥ���ȭ����â == 1) {
										System.out.println("[����б� ģ��] �� �ĴϾ�! �Ʊ� ���׿��� �� �� �� ���Ƽ� ��ȭ�߾�!");	
										System.out.println("[����б� ģ��] �� ������ �־���?");	
										System.out.println("[����б� ģ��] ������ ���ķ� �� ���� ���ôµ�! ���� �ʹپ�!");
										System.out.println("[�Ĵ�] ���� ƴ�� ���ֳ�!");
										System.out.println("[�Ĵ�] ���� ���� �ʹپ�!");
										
										HighschoolFriend.�Ĵ���_ü������_����(10);
										HighschoolFriend.�Ĵ���_����������_����(10);
										HighschoolFriend.�Ĵ���_��Ʈ��������_����(10);
										
										�Ĵ�.���¾˸�();
										
									}else if(�Ⱥ���ȭ����â == 2) {
										System.out.println("[�Ĵ�] �� ���� ������.. ���� ����� ������ ������..");
										HighschoolFriend.�Ĵ���_����������_����(10);
										HighschoolFriend.�Ĵ���_��Ʈ��������_����(10);
										
										�Ĵ�.���¾˸�();					
									}else {
										System.out.println("�ٽ� �Է��ϼ���."); 
										continue; 	
									}
									
								}else {
									System.out.println("�����̺�Ʈ�� �����ϴ�.");
								}
								
						    }else if(���б⼱��â == 3) {
								System.out.println(" ");
						    	System.out.println("���� �Խ��ϴ�.");
								System.out.println("������ ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. �θ�԰� �Ļ�");
								System.out.println("2. �ϱ⾲��");
								System.out.println("3. �����ڱ�");
								System.out.println("4. �ڷΰ���");
								System.out.println(" ");
								
								int ������â = scan.nextInt();
								
								if(������â ==1) {
							        String parents[] = {
											"�θ�԰� �Ļ��ϸ� ��� ���� �̾߱⸦ �մϴ�.",
											"[�θ��] ����غ�� �� �� �ǰ� �ִ�?",
											"[�Ĵ�] ������� ������ �ϰ� �־�� ����",
											"[�θ��] �׷��׷� �� ȥ�� �˾Ƽ� �� �ϸ��� �ϴ´� ���� ",
											"[�Ĵ�] (��.. �̷��Գ� �� �Ͼ��ֽôµ� �� �ȵǳ� �Ф�) ",
											"[�θ��] �� ���� �԰� ������ �Ƶ�",
											" "
									};
									
									for (int i = 0; i <parents.length; i++) {
										Thread.sleep(500);//0.5�ʸ��� �� ���徿 ���
										System.out.println(parents[i]);
									}
									System.out.println(" ");

									�Ĵ�.�θ�԰��Ļ�();
									System.out.println(" ");
									
									RelativeClass relative = new RelativeClass();
									relative.RelativeCome();
									relative.join(); 
									
									�Ĵ�.���¾˸�();
									
								}else if(������â == 2) {
								    System.out.println(" ");
								    System.out.println("�ϱ⸦ ���� �Ϸ縦 �����ϰ� �����θ� �����̴ϴ�.");
									�Ĵ�.�ϱ�();
									�Ĵ�.���¾˸�();
									
						    	}else if(������â == 3) {
								    		System.out.println("������ ���� ������ ü���� �����մϴ�.");
								    		�Ĵ�.����();
								    		�Ĵ�.���¾˸�();
						    		
						    	}else if(������â == 4) {
									continue;
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						
								}
								
								//(��) ������ ����ȣ�� �ؾ��մϴ�.
								Character Bro = new Character(); 
								Bro.���� = "������";
								
								if(Bro.gohospital()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									
									System.out.println("�� ���� �̺�Ʈ <������ �Կ�>");
									System.out.println("������ �Կ��߽��ϴ�.");
									System.out.println("����ȣ�� �Ͻðڽ��ϱ�?");
									System.out.println("1. ����ȣ�� �Ѵ�.");
									System.out.println("2. ���� �ʴ´�.");

									//��ü.��ü�Լ���. ��ü�� ���!	
									
									int ����ȣ����â = scan.nextInt();
									
									if(����ȣ����â == 1) {
										System.out.println("[�Ĵ�] (��.. ���ؿ� �����ϱ���..)");	
										System.out.println("[�Ĵ�] ���� �� ���� �׷��� �Ф�");	
										Bro.�Ĵ���_ü������_����(5);
										Bro.�Ĵ���_��Ʈ��������_����(5);
										�Ĵ�.���¾˸�();
										
									}else if(����ȣ����â == 2) {
										System.out.println("[�Ĵ�] �ʹ� �ٺ�.. �Ϲݱ� �غ��ؾ���..�Ф�");
										Bro.�Ĵ���_��Ʈ��������_����(5);
										Bro.�Ĵ���_����������_����(5);
										�Ĵ�.���¾˸�();					
									}else {
										System.out.println("�ٽ� �Է��ϼ���.");
										continue; 	
									}
									
								}else {
									System.out.println("�����̺�Ʈ�� �����ϴ�.");
								}
								
						    }else if(���б⼱��â == 4) {
						    	continue;
						    }else {
								System.out.println("�ٽ� �Է��ϼ���.");
						    	continue;
						    }
						    
						}
						
						DEC ++;	
						
					}else if(���θ޴�����â == 2){
					
						�Ĵ�.���¾˸�();
						
					}else if(���θ޴�����â == 3) {
							
						System.out.println("������ �����Ͻðڽ��ϱ�?");
						System.out.println("1. ��");
						System.out.println("2. �ƴϿ�");
						
						int �������⼱��â = scan.nextInt();
						
						if(�������⼱��â ==1) {
							System.out.println("12�� ����غ� �����߽��ϴ�.");					
							
							break;

						}else if(�������⼱��â == 2) {
							continue;
						}else {
							System.out.println("�ٽ� �Է��ϼ���."); // ������ �����Ͻðٽ��ϱ�?�� �ߵ���. ��ó�� ���θ޴�â�� �ƴ϶�.
							continue; 						   // �� if���� while�� �ȿ� �ְ� �Ǹ� �������⼱��â == 2�� 1.Ȱ�� 2. ����Ȯ�� 3. �������Ⱑ ���;�
						}
						
					}else {
						System.out.println("�ٽ� �Է��ϼ���.");
						continue;
					}

				}
				
				System.out.println("���� ���Դϴ�.");
				System.out.println("������ �������ðڽ��ϱ�?");

				int InterviewTest;
				InterviewTest = 0;
				
				while(InterviewTest<1) {
				System.out.println("1�� : �����Ѵ�");
				System.out.println("2�� : �����ܴ�");
						
				int InterviewTest2 = scan.nextInt();
				
				if(InterviewTest2  == 1) {
					
					System.out.println(" ");
					String JopPhoto[] = { // Ÿ���� ������ - �͸� Ŭ����

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
					      // �� �� �����Ѵ�
					      Thread.sleep(100);
					      // �޼����� ����Ѵ�
					      System.out.println(JopPhoto[i]);
					}
				    System.out.println(" ");
					
					System.out.println("�� ���������� ���� ĿƮ���ΰ� ���մϴ�.");
					System.out.println(" ");
					
					if(�Ĵ�.�Ĵ�_��������>=��������λ���.��������_ĿƮ����) {
						
				        //�н���� (�ε���ݰ� ����)
					   	LoadingBgm passBgm02 = new LoadingBgm();
				          
				        try {
				             passBgm02.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }

						
						System.out.println("===========================================================");
						System.out.println(" ");
						
						String PASS[] = { // Ÿ���� ������ - �͸� Ŭ����
					            "______   ___   _____  _____ ",    
					            "| ___ \\ / _ \\ /  ___|/  ___|",
					            "| |_/ // /_\\ \\\\ `--. \\ `--. ",
					            "|  __/ |  _  | `--. \\ `--. \\",
					            "| |    | | | |/\\__/ //\\__/ /",
					            "\\_|    \\_| |_/\\____/ \\____/"
					    };

				        
					    for (int i = 0; i < PASS.length; i++) {
						      // �� �� �����Ѵ�
						      Thread.sleep(450);
						      // �޼����� ����Ѵ�
						      System.out.println(PASS[i]);
						} 
						System.out.println(" ");
						System.out.println("�Ϲݱ� ä�뿡 �����հ��Ͽ����ϴ�!!");
						System.out.println("���Ի�� ���� �� �˰ڽ��ϴ�.");
						System.out.println("===========================================================");
						
						break;
						
					}else {
						
						System.out.println(" ");
						System.out.println("���ϲ����� �ƽ��Ե� ���� ��ܿ� ������ �˷��帳�ϴ�. �����մϴ�.");				
						System.out.println("������ ����Ǿ����ϴ�.");
						System.out.println(" ");
						
						
						String GameEnd[] = { // Ÿ���� ������ - �͸� Ŭ����

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
						      // �� �� �����Ѵ�
						      Thread.sleep(250);
						      // �޼����� ����Ѵ�
						      System.out.println(GameEnd[i]);
						} 
						

						
						System.exit(0);
		//������ ����Ǿ��				
					}
					
				}else if(InterviewTest2  == 2) {
					
					
					String GameEnd[] = { // Ÿ���� ������ - �͸� Ŭ����

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
					      // �� �� �����Ѵ�
					      Thread.sleep(250);
					      // �޼����� ����Ѵ�
					      System.out.println(GameEnd[i]);
					} 
					System.out.println("����غ� �����߽��ϴ�.");
					System.out.println("������ ����Ǿ����ϴ�.");
					
					System.exit(0);
		//������ ����Ǿ��				
					
					break;
					
									
				}else {
					System.out.println("�ٽ� �Է��ϼ���.");
					 
					continue;
				}
				InterviewTest2 ++;
				}
				
			}else if(���༱�� == 3){
				Buttonbgm ButtonBgm = new Buttonbgm();
				
		        try {
		        	 ButtonBgm.LoadBgm();
		             Thread.sleep(0);
		        }catch(InterruptedException e) {
		             e.printStackTrace();
		        }
				System.out.println("[�Ĵ�] ����! ������ũ ������!");
				System.out.println("===========================================================");
				System.out.println("������ũ �䱸 �������� : " + ������ũ�λ���.��������_ĿƮ����);
				System.out.println("������ũ �䱸 �ʱ����� : " + ������ũ�λ���.�ʱ�����_ĿƮ����);
				System.out.println("������ũ �䱸 �������� : " + ������ũ�λ���.��������_ĿƮ����);
				System.out.println("===========================================================");
				
				�Ĵ�.�Ĵ�_�������� = 0; �Ĵ�.�Ĵ�_�ʱ����� = 0; �Ĵ�.�Ĵ�_�������� = 0;
				�Ĵ�.�Ĵ�_ü������ = 90; �Ĵ�.�Ĵ�_���������� = 90; �Ĵ�.�Ĵ�_��Ʈ�������� = 10;
				
				�Ĵ�.���¾˸�();

				System.out.println("===========================================================");
				System.out.println("[�Ĵ�] ���? ü������, ����������, ��Ʈ���������� ����?");
				System.out.println("���� Ȯ���Ͻ÷��� 1��, �����Ͻ÷��� 2��");
				
				int ���������� = scan.nextInt();
				
				if ( ���������� == 1) {
					System.out.println("===========================================================");
					System.out.println("�� ������ �ִ�ġ�� 100�̸� 100�� �ʰ��ϰų� 0 �̾��� �� �� �����ϴ�.");
					System.out.println("ü�������� 90���� ���۵Ǹ� 0�� �Ǹ� ���������Դϴ�.");
					System.out.println("������������ 90���� ���۵Ǹ� 0�� �Ǹ� ���������Դϴ�.");
					System.out.println("��Ʈ���������� 10���� ���۵Ǹ� 100�� �Ǹ� ���������Դϴ�.");
					System.out.println(" ");
					System.out.println("ü�������� 1~20, ������������ 1~20, ��Ʈ���������� 80~99�� �� ���â�� ��ϴ�.");		
					System.out.println("������ �������Դϴ�.");
					System.out.println("�� �������� �� �����ϴ°� ����� �ٽ��Դϴ�.");
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
				
				System.out.println("[�Ĵ�] ��.. ���� �ʱ�.");
				System.out.println("[�Ĵ�] �׷��� ������ �غ�����. ����غ� �����غ���?"); // 1�� Ȱ��, 2�� ����Ȯ��, 3�� ���θ޴�

			
				
				while (true) {
					System.out.println(" ");
					System.out.println("< ���θ޴� > ");
					System.out.println("1. Ȱ��"); // 1�� Ȱ��, 2�� ����Ȯ��, 3�� ��������
					System.out.println("2. ����Ȯ��");
					System.out.println("3. �ܿ���� ��������");
					System.out.println(" ");

					int ���θ޴�����â = scan.nextInt();
					
					if ( ���θ޴�����â == 1) {
						
						
						if (true) {
							System.out.println(" ");
							System.out.println("�ܿ�����Դϴ�. �ܿ���п� �ڰ����� ����� �� �ֽ��ϴ�.");
							System.out.println("������ ����Ͻðڽ��ϱ�?");
							System.out.println("1. ��ǻ���ڰ��� ");
							System.out.println("2. �����ڰ���");
							System.out.println("3. �����ڰ���");
							System.out.println("4. �ڷΰ���");
							System.out.println(" ");
							
							int �ܿ���м���â = scan.nextInt(); // 70% Ȯ���� �ڰ��� ���

						    if (�ܿ���м���â == 1) {
						    	��ǻ���ڰ��� ��ǻ���ڰ��� = new ��ǻ���ڰ��� ();// ��ǻ���ڰ���Ŭ�������� ��ǻ���ڰ��� ��ü�� ��������.
								��ǻ���ڰ���.�����̸� = "��ǻ���ڰ���";
						    	
						    	System.out.println("��ǻ�� �ڰ����� �⺻����!!");
								System.out.println("��ǻ���ڰ��� ���迡 �����߽��ϴ�.");
								
								// 5�� ���� input���п� ���� �Է����� �ʾ��� �� ���ӽ���
								// �̸� ���� ���θ޼ҵ尡 �ִ� Ŭ������ inputCheck��� static boolean�� ����
								
								ComputerInputThread ComputerInputThread = new ComputerInputThread();
								ComputerCountdownThread ComputerCountdownThread = new ComputerCountdownThread(); 
								
								ComputerInputThread.start(); //���� ó��
								ComputerCountdownThread.start(); //ī��Ʈ�ٿ��� ó��
								ComputerCountdownThread.join();

								break;
						    
						    }else if(�ܿ���м���â == 2) {
								�����ڰ��� �����ڰ��� = new �����ڰ��� ();
								�����ڰ���.�����̸� = "�����ڰ���";
						    	
						    	System.out.println("Ȥ�� �𸣴� �����ڰ��� �ϳ��� ������!!!");
								System.out.println("�����ڰ��� ���迡 �����߽��ϴ�.");
								
								// 5�� ���� input���п� ���� �Է����� �ʾ��� �� ���ӽ���
								// �̸� ���� ���θ޼ҵ尡 �ִ� Ŭ������ inputCheck��� static boolean�� ����
								
								EnglishInputThread EnglishInputThread = new EnglishInputThread();
								EnglishCountdownThread EnglishCountdownThread = new EnglishCountdownThread(); 
								
								EnglishInputThread.start();
								EnglishCountdownThread.start();
								EnglishCountdownThread.join();
								
					    	

								break;
								
						    }else if(�ܿ���м���â == 3) {
								�����ڰ��� �����ڰ��� = new �����ڰ��� ();
								�����ڰ���.�����̸� = "�����ڰ���";
						    	
								System.out.println("������ �غ��ϴµ� �����ڰ����� �⺻����!!");
								System.out.println("�����ڰ��� ���迡 �����߽��ϴ�.");
								
								// 10�� ���� input�� ���� �Է����� �ʾ��� �� ���ӽ���
								// �̸� ���� ���θ޼ҵ尡 �ִ� Ŭ������ inputCheck��� static boolean�� ����
								
								FinanceInputThread FinanceInputThread = new FinanceInputThread();
								FinanceCountdownThread FinanceCountdownThread = new FinanceCountdownThread(); 
								
								FinanceInputThread.start();
								FinanceCountdownThread.start();
								FinanceCountdownThread.join();
								
						    							
								break;
								
						    }else if(�ܿ���м���â == 4) {
						    	continue;
						    }else {
								System.out.println("�ٽ� �Է��ϼ���.");
						    	continue;
						    }
						    
						}
						
					}else if(���θ޴�����â == 2){
						Buttonbgm ButtonBgm1 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm1.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						�Ĵ�.���¾˸�();
						
					}else if(���θ޴�����â == 3) {
						Buttonbgm ButtonBgm1 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm1.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }	
						System.out.println("�ܿ���� ������ �����Ͻðڽ��ϱ�?");
						System.out.println("1. ��");
						System.out.println("2. �ƴϿ�");
						
						
						int �������⼱��â = scan.nextInt();
						
						if(�������⼱��â ==1) {
					        System.out.println("�ܿ���� ����غ� �����߽��ϴ�.");
							
							break;

						}else if(�������⼱��â == 2) {
							continue;
						}else {
							System.out.println("�ٽ� �Է��ϼ���."); // ������ �����Ͻðٽ��ϱ�?�� �ߵ���. ��ó�� ���θ޴�â�� �ƴ϶�.
							continue; 						   // �� if���� while�� �ȿ� �ְ� �Ǹ� �������⼱��â == 2�� 1.Ȱ�� 2. ����Ȯ�� 3. �������Ⱑ ���;�
						}
						
						
					}else {
						System.out.println("�ٽ� �Է��ϼ���.");
						continue;
					}
					
				}	
						
				System.out.println("�ܿ������ ������,");
				System.out.println("4�г� 1�бⰡ ���۵Ǿ����ϴ�.");
				System.out.println(" ");
				System.out.println("�� �б�� �� 12������ �̷���� �ֽ��ϴ�.");
				System.out.println("���� ������ �� ���� Ȱ���� �� �� �ֽ��ϴ�.");
				System.out.println("������ �Ͻðڽ��ϱ�?"); // �� �ϴ� 1�ְ� ������ �� 16���� �ϸ� ������������ �Ѿ���� �������
				
				int turnsOfSpringsemester = 1; // 4�г� 1�б� �� 12��!!
				
				while (turnsOfSpringsemester <= 12) {
					System.out.println("< ���θ޴� > ");
					System.out.println("1. Ȱ��"); // 1�� Ȱ��, 2�� ����Ȯ��, 3�� ��������
					System.out.println("2. ����Ȯ��");
					System.out.println("3. 1�б� ��������");
							
					int ���θ޴�����â = scan.nextInt();
					
					if ( ���θ޴�����â == 1) {

						if (true) {
							System.out.println(" ");
							System.out.println("4�г� 1�б� : " + turnsOfSpringsemester+"/12" + "��° ���Դϴ�.");
							System.out.println("��� ���ðڽ��ϱ�?");
							System.out.println("1. �б��� ����");
							System.out.println("2. ���׿� ����");
							System.out.println("3. ���� ����");
							System.out.println("4. �ڷΰ���");
							System.out.println("<< �б�, ����, �� ���� ����Ȯ���� �̺�Ʈ�� Ƣ��ɴϴ�. >>");
							System.out.println(" ");	

							
							int ���б⼱��â = scan.nextInt();

						    if (���б⼱��â == 1) {
								System.out.println(" ");
								System.out.println("�б��� �Խ��ϴ�.");
								System.out.println("�б����� ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. ��������");
								System.out.println("2. �������Ƹ�Ȱ��");
								System.out.println("3. ����������� ������");
								System.out.println("4. �������͵�");
								System.out.println("5. �ڷΰ���");
								System.out.println(" ");

								
								int �б�����â = scan.nextInt();
								
								if(�б�����â ==1) {
							        System.out.println("��.. �������� ������ �ؾ���!!");
									System.out.println("�б����� ������ ���������� �մϴ�.");
									System.out.println(" ");
									�Ĵ�.��������();
									System.out.println(" ");
									
									SomethingGirl SomethingGirl = new SomethingGirl();

									SomethingGirl.SomethingGirlCome();
									SomethingGirl.join(); 
									System.out.println(" ");
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 2) {
									System.out.println("���Ƹ����� ����鿡�� ��������� ����ϴ�.");
									�Ĵ�.�������Ƹ�����_����();
									System.out.println(" ");
									
									CircleBroThread CircleBro = new CircleBroThread();

									CircleBro.CircleBroCome();
									CircleBro.join(); 
									System.out.println(" ");
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 3) {
									System.out.println("����������ο��� �������� �޽��ϴ�.");
									�Ĵ�.�����������_������();
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 4) {
									System.out.println("�������͵� ���� ���������� ��ȭ��ŵ�ϴ�.");
									�Ĵ�.�������͵�_����();
									
									//�����̺�Ʈ �߻�
									
									InterviewStudyMember Studymember= new InterviewStudyMember();

									Studymember.GoFeedback();
									Studymember.join(); 
									
									
									
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 5) {
									continue;
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); // ������ �����Ͻðٽ��ϱ�?�� �ߵ���. ��ó�� ���θ޴�â�� �ƴ϶�.
									continue; 						   // �� if���� while�� �ȿ� �ְ� �Ǹ� �������⼱��â == 2�� 1.Ȱ�� 2. ����Ȯ�� 3. �������Ⱑ ���;�
								}
								
								// (�б�) �б����� ���� �����ڸ��丵 ���� // ���丵 ���� Ȯ�� 20%

//								int ���丵Ƚ��;
//								���丵Ƚ�� = 0;
//								while(���丵Ƚ��<1)
								
								BankHuman BankHuman = new BankHuman(); 
									
									if(BankHuman.�����ڸ��丵()) {
										
										EventBgm EventBgm = new EventBgm();
										
								        try {
								        	EventBgm.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
								        
										System.out.println("�б� ���� �̺�Ʈ <���� ������ ���丵>");
										System.out.println("���� ������ ���丵�� �����Ͻðڽ��ϱ�?");
										System.out.println("1. ����");
										System.out.println("2. ����");
			
										//��ü.��ü�Լ���. ��ü�� ���!	
										
										int ���丵����â = scan.nextInt();
										
										if(���丵����â == 1) {
											System.out.println("���丵�� ������ ���� ������� ����ϴ�.");	
											BankHuman.�Ĵ���_��������_����(5);
											BankHuman.�Ĵ���_�ʱ�����_����(5);
											BankHuman.�Ĵ���_��������_����(5);
											BankHuman.�Ĵ���_ü������_����(10);
											
											�Ĵ�.���¾˸�();
											
										}else if(���丵����â == 2) {
											System.out.println("���丵�� �����ϰ� ü���� ȸ���մϴ�.");
											BankHuman.�Ĵ���_ü������_����(10);
											�Ĵ�.���¾˸�();					
										}else {
											System.out.println("�ٽ� �Է��ϼ���."); // ���� ������ ���丵�� �����Ͻðڽ��ϱ�?�� �ߵ���.
											continue; 	
										}
										
									}else {
										System.out.println("�����̺�Ʈ�� �����ϴ�.");
									}
								
								
						    }else if(���б⼱��â == 2) {
								System.out.println(" ");
						    	System.out.println("���׿� �Խ��ϴ�.");
								System.out.println("���׿��� ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. �ｺ");
								System.out.println("2. ġ��");
								System.out.println("3. �ڷΰ���");
								System.out.println(" ");
								
								int ���׼���â = scan.nextInt();
								
								if(���׼���â ==1) {
							        
							        System.out.println(" ");
							        
						    		String health[] = { // Ÿ���� ������ - �͸� Ŭ����
			
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
									      // �� �� �����Ѵ�
									      Thread.sleep(0);
									      // �޼����� ����Ѵ�
									      System.out.println(health[i]);
									}
								    
								    System.out.println(" ");
									System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
									System.out.println(" ");
									�Ĵ�.�ｺ��();
									�Ĵ�.���¾˸�();
									
								}else if(���׼���â == 2) {
								    System.out.println(" ");
									System.out.println("ġ������ ��Ʈ������ Ǳ�ϴ�.");
									�Ĵ�.ġ��();
									�Ĵ�.���¾˸�();
									
								}else if(���׼���â == 3) {
									continue;
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); // ������ �����Ͻðٽ��ϱ�?�� �ߵ���. ��ó�� ���θ޴�â�� �ƴ϶�.
									continue; 						   // �� if���� while�� �ȿ� �ְ� �Ǹ� �������⼱��â == 2�� 1.Ȱ�� 2. ����Ȯ�� 3. �������Ⱑ ���;�
								}
								
								// (����) ���׿��� ���뿡�� ����� ����ģ�� ���� // �� ����ģ���� ���� �� �ǳ� Ȯ�� 10% // �� ���� ��������!
								Character Xgirlfriend = new Character(); 
								Xgirlfriend.���� = "�� ����ģ��";
								
								if(Xgirlfriend.talkfirst()) {
									
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
							        
									System.out.println("���� ���� �̺�Ʈ <�� ����ģ������ ����>");
									System.out.println("���׿��� �쿬�� �� ����ģ���� �������ϴ�.");
									System.out.println("�� �����Ĵ� �Ⱥ��λ縦 �ǳ׿ɴϴ�.");
									System.out.println("1. ���� �Ⱥ��λ縦 ���ش�. ");
									System.out.println("2. �����ϰ� ��������. ");

									//��ü.��ü�Լ���. ��ü�� ���!	
									
									int ������ģ������â = scan.nextInt();
									
									if(������ģ������â == 1) {
										System.out.println("[�Ĵ�] �� �������̳� ������");	
										Xgirlfriend.�Ĵ���_��Ʈ��������_����(10);
										�Ĵ�.���¾˸�();
										
									}else if(������ģ������â == 2) {
										System.out.println("[�Ĵ�] (�λ縦 �� �ϴ°���)");
										Xgirlfriend.�Ĵ���_����������_����(10);
										�Ĵ�.���¾˸�();					
									}else {
										System.out.println("�ٽ� �Է��ϼ���."); 
										continue; 	
									}
									
								}else {
									System.out.println("�����̺�Ʈ�� �����ϴ�.");
								}
								
						    }else if(���б⼱��â == 3) {
								System.out.println(" ");
						    	System.out.println("���� �Խ��ϴ�.");
								System.out.println("������ ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. �θ�԰� �Ļ�");
								System.out.println("2. �ϱ⾲��");
								System.out.println("3. �����ڱ�");
								System.out.println("4. �ڷΰ���");
								System.out.println(" ");
								
								int ������â = scan.nextInt();
								
								if(������â ==1) {
									//��ưȿ����
									
									String parents[] = {
											"�θ�԰� �Ļ��ϸ� ��� ���� �̾߱⸦ �մϴ�.",
											"[�θ��] ����غ�� �� �� �ǰ� �ִ�?",
											"[�Ĵ�] ������� ������ �ϰ� �־�� ����",
											"[�θ��] �׷��׷� �� ȥ�� �˾Ƽ� �� �ϸ��� �ϴ´� ���� ",
											"[�Ĵ�] (��.. �̷��Գ� �� �Ͼ��ֽôµ� �� �ȵǳ� �Ф�) ",
											"[�θ��] �� ���� �԰� ������ �Ƶ�",
											" "
									};
									
									for (int i = 0; i <parents.length; i++) {
										Thread.sleep(500);//0.5�ʸ��� �� ���徿 ���
										System.out.println(parents[i]);
									}
									System.out.println(" ");

									�Ĵ�.�θ�԰��Ļ�();
									
									
									RelativeClass relative = new RelativeClass();
									relative.RelativeCome();
									relative.join(); 
									
									
									System.out.println(" ");
									System.out.println(" ");
									
									�Ĵ�.���¾˸�();
									
									
								}else if(������â == 2) {
										    System.out.println(" ");
										    System.out.println("�ϱ⸦ ���� �Ϸ縦 �����ϰ� �����θ� �����̴ϴ�.");
									�Ĵ�.�ϱ�();
									�Ĵ�.���¾˸�();
									
						    	}else if(������â == 3) {
								    System.out.println(" ");
								    
						    		System.out.println("������ ���� ������ ü���� �����մϴ�.");
						    		�Ĵ�.����();
						    		�Ĵ�.���¾˸�();
						    		
						    	}else if(������â == 4) {
									continue;
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						
								}
								
								//(��) ���� �ִµ� �����⿡�� ������ �հ��ߴٴ� ī���� �� Ȯ�� 10%
								
								Character UniversityFriend = new Character(); 
								UniversityFriend.���� = "������";
								
								if(UniversityFriend.kakaotalk()) {
									
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
							        
									System.out.println("�� ���� �̺�Ʈ <�������� ������ �հݼҽ�>");
									System.out.println("��ҿ� ������ ���� �����⿡�� ������ �հ��ߴٰ� �����ɴϴ�.");
									System.out.println("1. ���ϴ����� ���ش�.");
									System.out.println("2. �о��Ѵ�.");

									//��ü.��ü�Լ���. ��ü�� ���!	
									
									int �����⼱��â = scan.nextInt();
									
									if(�����⼱��â == 1) {
										System.out.println("[�Ĵ�] ������ ������������");	
										UniversityFriend.�Ĵ���_��Ʈ��������_����(10);
										�Ĵ�.���¾˸�();
										
									}else if(�����⼱��â == 2) {
										System.out.println("[�Ĵ�] (�о�) ���� ģ������ �ʾҴµ� ;;");
										UniversityFriend.�Ĵ���_����������_����(10);
										�Ĵ�.���¾˸�();					
									}else {
										System.out.println("�ٽ� �Է��ϼ���."); // ���� ������ ���丵�� �����Ͻðڽ��ϱ�?�� �ߵ���.
										continue; 	
									}
									
								}else {
									System.out.println("�����̺�Ʈ�� �����ϴ�.");
								}
								
						    }else if(���б⼱��â == 4) {
						    	continue;
						    }else {
								System.out.println("�ٽ� �Է��ϼ���.");
						    	continue;
						    }
						    
						}
						
//						System.out.println("4�г� 1�б� : " + turnsOfSpringsemester+"/16" + "��° ���Դϴ�.");
						turnsOfSpringsemester ++;	
						
					}else if(���θ޴�����â == 2){
					
						�Ĵ�.���¾˸�();
						
					}else if(���θ޴�����â == 3) {
							
						System.out.println("������ �����Ͻðڽ��ϱ�?");
						System.out.println("1. ��");
						System.out.println("2. �ƴϿ�");
						
						int �������⼱��â = scan.nextInt();
						
						if(�������⼱��â ==1) {
							System.out.println("4�г� 1�б� ����غ� �����߽��ϴ�.");
							
							break;

						}else if(�������⼱��â == 2) {
							continue;
						}else {
							System.out.println("�ٽ� �Է��ϼ���."); // ������ �����Ͻðٽ��ϱ�?�� �ߵ���. ��ó�� ���θ޴�â�� �ƴ϶�.
							continue; 						   // �� if���� while�� �ȿ� �ְ� �Ǹ� �������⼱��â == 2�� 1.Ȱ�� 2. ����Ȯ�� 3. �������Ⱑ ���;�
						}
						
					}else {
						System.out.println("�ٽ� �Է��ϼ���.");
						continue;
					}

				}	
				
				
				System.out.println("4�г� 1�бⰡ �������ϴ�.");
				System.out.println("���������� ���۵Ǿ����ϴ�.");
				System.out.println("�������п� �ڰ��� �ܿ� �پ��� ����� �� �ϳ��� ���� �� �ֽ��ϴ�.");
				
				
				while (true) {
					System.out.println(" ");
					System.out.println("< ���θ޴� > ");
					System.out.println("1. Ȱ��"); // 1�� Ȱ��, 2�� ����Ȯ��, 3�� ��������
					System.out.println("2. ����Ȯ��");
					System.out.println("3. �������� ��������");
					System.out.println(" ");
							
					int ���θ޴�����â = scan.nextInt();
					
					if ( ���θ޴�����â == 1) {

						if (true) {
							System.out.println(" ");
							System.out.println("������ �Ͻðڽ��ϱ�?");
							System.out.println("1. ����");
							System.out.println("2. ���Ȱ��");
							System.out.println("3. ������");
							System.out.println("4. �ڷΰ���");
							System.out.println(" ");

							int �������м���â = scan.nextInt();

						    if (�������м���â == 1) {
								System.out.println("�б� ������ ���������Դϴ�."); // ������� �����մϴ�. ���� ���� Ȯ��
								���� ���� = new ����();
								����.�Ĵ���_��������_����(10);
								����.�Ĵ���_�ʱ�����_����(5);
								����.�Ĵ���_��������_����(5);
								����.�Ĵ���_ü������_����(10);
								����.�Ĵ���_����������_����(5);
								����.�Ĵ���_��Ʈ��������_����(10);
//								����.����_�߰�();
								
								�Ĵ�.���¾˸�();
								
								break;
						    
						    }else if(�������м���â == 2) {
								System.out.println(" ");
						    	System.out.println("� ���Ȱ���� �Ͻðڽ��ϱ�?");
								System.out.println("1. ���ڴ�");
								System.out.println("2. ��������");
								System.out.println("3. �ڷΰ���");
								System.out.println(" ");

								int ���Ȱ������â = scan.nextInt();
								
								if(���Ȱ������â ==1) {
									System.out.println("�������� ���� ���� ���ڴ��� �����մϴ�."); // ���� �� �������� ��簡 ����
									���ڴ� ���ڴ� = new ���ڴ�();
									���ڴ�.�Ĵ���_��������_����(10);
									���ڴ�.�Ĵ���_��������_����(5);
									���ڴ�.�Ĵ���_ü������_����(10);
									���ڴ�.�Ĵ���_��Ʈ��������_����(10);

									
									�Ĵ�.���¾˸�();
									
								}else if(���Ȱ������â == 2) {
									System.out.println("�������� ���� ���� ������� �����մϴ�."); // ���ڱ� ������ ����.
									�������� �������� = new ��������();
									��������.�Ĵ���_��������_����(10);
									��������.�Ĵ���_��������_����(5);
									��������.�Ĵ���_ü������_����(10);
									��������.�Ĵ���_��Ʈ��������_����(10);

									
									�Ĵ�.���¾˸�();
									
								}else if(���Ȱ������â == 3) {
									continue;
								}else {
									System.out.println("�ٽ� �Է��ϼ���.");
									continue; 						 
								}
								
								break;
								
						    }else if(�������м���â == 3) {
								System.out.println(" ");
						    	System.out.println("� �������� �Ͻðڽ��ϱ�?");
								System.out.println("1. ���̵�� ������");
								System.out.println("2. ��������");
								System.out.println("3. �ڷΰ���");
								System.out.println(" ");
								
								int ����������â = scan.nextInt();
								
								if(����������â ==1) {
									System.out.println("�������� ���� ���̵�� �������� �����մϴ�."); // �ٸ� ���� �� ���̵�� ����
									���̵������� ���̵������� = new ���̵�������();
									���̵�������.�Ĵ���_��������_����(10);
									���̵�������.�Ĵ���_��������_����(5);
									���̵�������.�Ĵ���_ü������_����(10);
									���̵�������.�Ĵ���_��Ʈ��������_����(10);
									���̵�������.â�Ƿ�_�߰�();
									
									�Ĵ�.���¾˸�();
									
								}else if(����������â == 2) {
									System.out.println("�������� ���� ���������� �����մϴ�."); // ���� ���԰� �ɻ��� Ȯ�� 	
									�������� �������� = new ��������();
									��������.�Ĵ���_��������_����(10);
									��������.�Ĵ���_��������_����(5);
									��������.�Ĵ���_ü������_����(10);
									��������.�Ĵ���_��Ʈ��������_����(10);
									��������.����_�߰�();
									
									�Ĵ�.���¾˸�();
									
						    	}else if(����������â == 3) {
						    		continue;
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						   
								}
							
								break;	
								
						    }else if(�������м���â == 4) {
						    	continue;
						    }else {
								System.out.println("�ٽ� �Է��ϼ���.");
						    	continue;
						    }
						    
						}	
						
					}else if(���θ޴�����â == 2){
						�Ĵ�.���¾˸�();
						
					}else if(���θ޴�����â == 3) {
							
						System.out.println("�������� ������ �����Ͻðڽ��ϱ�?");
						System.out.println("1. ��");
						System.out.println("2. �ƴϿ�");
						
						int �������⼱��â = scan.nextInt();
						
						if(�������⼱��â ==1) {
					        System.out.println("�������� ����غ� �����߽��ϴ�.");
							
							break;

						}else if(�������⼱��â == 2) {
							continue;
						}else {
							System.out.println("�ٽ� �Է��ϼ���."); 
							continue; 					
						}
						
					}else {
						System.out.println("�ٽ� �Է��ϼ���.");
						continue;
					}

				}
				
				System.out.println("���������� ������,");
				System.out.println("4�г� 2�бⰡ ���۵Ǿ����ϴ�.");
				System.out.println("===========================================================");
				System.out.println("2�б�� 9���� �� �� ���Դϴ�.");
				System.out.println("10���� �� �� �� ������ �����ؾ� �մϴ�.");
				System.out.println("11���� �� �� �� �ʱ������� �����ؾ� �մϴ�.");
				System.out.println("12���� �� �� �� ���������� �����ؾ� �մϴ�.");
				System.out.println("�� ������ �ʿ��� ������� �ڱ������ �����սô�!");
				System.out.println("===========================================================");	
				int Sep = 1; // 9�� �� ��!
				
				while (Sep <= 4) {
					System.out.println(" ");
					System.out.println("< ���θ޴� > ");
					System.out.println("1. Ȱ��"); // 1�� Ȱ��, 2�� ����Ȯ��, 3�� ��������
					System.out.println("2. ����Ȯ��");
					System.out.println("3. ��������");
					System.out.println(" ");

					int ���θ޴�����â = scan.nextInt();
					
					if ( ���θ޴�����â == 1) {

						if (true) {
							System.out.println("4�г� 2�б� 9�� : " + Sep + "/4" + "��° ���Դϴ�.");
							System.out.println("��� ���ðڽ��ϱ�?");
							System.out.println("1. �б��� ����");
							System.out.println("2. ���׿� ����");
							System.out.println("3. ���� ����");
							System.out.println("4. �ڷΰ���");
							System.out.println("<< �б�, ����, �� ���� ����Ȯ���� �̺�Ʈ�� Ƣ��ɴϴ�. >>");

							
							int ���б⼱��â = scan.nextInt();

						    if (���б⼱��â == 1) {
								System.out.println("�б��� �Խ��ϴ�.");
								System.out.println("�б����� ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. ��������");
								System.out.println("2. �������Ƹ�Ȱ��");
								System.out.println("3. ����������� ������");
								System.out.println("4. �������͵�");
								System.out.println("5. �ڷΰ���");

								int �б�����â = scan.nextInt();
								
								if(�б�����â ==1) {
							        System.out.println("��.. �������� ������ �ؾ���!!");
									System.out.println("�б����� ������ ���������� �մϴ�.");
									System.out.println(" ");
									�Ĵ�.��������();
									
									System.out.println(" ");
									
									SomethingGirl SomethingGirl = new SomethingGirl();

									SomethingGirl.SomethingGirlCome();
									SomethingGirl.join(); 
									System.out.println(" ");
									
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 2) {
									System.out.println("���Ƹ����� ����鿡�� ��������� ����ϴ�.");
									�Ĵ�.�������Ƹ�����_����();
									System.out.println(" ");
									
									CircleBroThread CircleBro = new CircleBroThread();

									CircleBro.CircleBroCome();
									CircleBro.join(); 
									System.out.println(" ");
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 3) {
									System.out.println("����������ο��� �������� �޽��ϴ�.");
									�Ĵ�.�����������_������();
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 4) {
									System.out.println("�������͵� ���� ���������� ��ȭ��ŵ�ϴ�.");
									�Ĵ�.�������͵�_����();
									
									InterviewStudyMember Studymember= new InterviewStudyMember();

									Studymember.GoFeedback();
									Studymember.join(); 
									
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 5) {
									continue;
							
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						 
								}
								
								Character InterviewFriend = new Character(); 
								InterviewFriend.���� = "������͵��";
								
									if(InterviewFriend.SuccessFirst()) {
										
										EventBgm EventBgm = new EventBgm();
										
								        try {
								        	EventBgm.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
								        
										System.out.println("�б� ���� �̺�Ʈ <������͵���� ���� �հ��߽��ϴ�.>");
										System.out.println("������Ƽ�� �����Ͻðڽ��ϱ�?");
										System.out.println("1. ����");
										System.out.println("2. ����");
			
										//��ü.��ü�Լ���. ��ü�� ���!	
										
										int goparty = scan.nextInt();
										
										if(goparty == 1) {
											System.out.println("������Ƽ�� ������ ���� ������� ����ϴ�.");	
											InterviewFriend.�Ĵ���_��������_����(5);
											InterviewFriend.�Ĵ���_�ʱ�����_����(5);
											InterviewFriend.�Ĵ���_��������_����(5);
											InterviewFriend.�Ĵ���_ü������_����(10);
											InterviewFriend.�Ĵ���_����������_����(5);
											
											�Ĵ�.���¾˸�();
											
										}else if(goparty == 2) {
											System.out.println("������Ƽ�� �����ϰ� ü���� ȸ���մϴ�.");
											InterviewFriend.�Ĵ���_ü������_����(15);
											InterviewFriend.�Ĵ���_����������_����(5);
											InterviewFriend.�Ĵ���_��Ʈ��������_����(5);
											
											�Ĵ�.���¾˸�();					
										}else {
											System.out.println("�ٽ� �Է��ϼ���.");
											continue; 	
										}
										
									}else {
										
										System.out.println("�����̺�Ʈ�� �����ϴ�.");
									}
								
								
						    }else if(���б⼱��â == 2) {
						    	System.out.println("���׿� �Խ��ϴ�.");
								System.out.println("���׿��� ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. �ｺ");
								System.out.println("2. ġ��");
								System.out.println("3. �ڷΰ���");
								
								int ���׼���â = scan.nextInt();
								
								if(���׼���â ==1) {
							        
							        System.out.println(" ");
								    System.out.println(" ");
									System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
									System.out.println(" ");
									�Ĵ�.�ｺ��();
									�Ĵ�.���¾˸�();
									
								}else if(���׼���â == 2) {
									    System.out.println(" ");
										System.out.println("ġ������ ��Ʈ������ Ǳ�ϴ�.");
										�Ĵ�.ġ��();
										�Ĵ�.���¾˸�();
								
									
								}else if(���׼���â == 3) {
									continue;
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						 
								}
								
								// (����) ����б� ģ������ �Ⱥ���ȭ �� Ȯ�� 10% 
								
								Character HighschoolFriend = new Character(); 
								HighschoolFriend.���� = "����б� ģ��";
								
									if(HighschoolFriend.HiCall()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									
									System.out.println("���� ���� �̺�Ʈ <����б� ģ���� �Ⱥ���ȭ>");
									System.out.println("�ذ� �ִ� ����б� ģ������ ��ȭ�� �ɴϴ�.");
									System.out.println("1. ��ȭ�� �޴´�. ");
									System.out.println("2. ��ȭ�� ���� �ʴ´�. ");

									//��ü.��ü�Լ���. ��ü�� ���!	
									
									int �Ⱥ���ȭ����â = scan.nextInt();
									
									if(�Ⱥ���ȭ����â == 1) {
										System.out.println("[����б� ģ��] �� �ĴϾ�! �Ʊ� ���׿��� �� �� �� ���Ƽ� ��ȭ�߾�!");	
										System.out.println("[����б� ģ��] �� ������ �־���?");	
										System.out.println("[����б� ģ��] ������ ���ķ� �� ���� ���ôµ�! ���� �ʹپ�!");
										System.out.println("[�Ĵ�] ���� ƴ�� ���ֳ�!");
										System.out.println("[�Ĵ�] ���� ���� �ʹپ�!");
										
										HighschoolFriend.�Ĵ���_ü������_����(10);
										HighschoolFriend.�Ĵ���_����������_����(10);
										HighschoolFriend.�Ĵ���_��Ʈ��������_����(10);
										
										�Ĵ�.���¾˸�();
										
									}else if(�Ⱥ���ȭ����â == 2) {
										System.out.println("[�Ĵ�] �� ���� ������.. �����ϱ� ������..");
										HighschoolFriend.�Ĵ���_����������_����(10);
										HighschoolFriend.�Ĵ���_��Ʈ��������_����(10);
										
										�Ĵ�.���¾˸�();					
									}else {
										System.out.println("�ٽ� �Է��ϼ���."); 
										continue; 	
									}
									
								}else {
									System.out.println("�����̺�Ʈ�� �����ϴ�.");
								}
								
						    }else if(���б⼱��â == 3) {
						    	System.out.println("���� �Խ��ϴ�.");
								System.out.println("������ ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. �θ�԰� �Ļ�");
								System.out.println("2. �ϱ⾲��");
								System.out.println("3. �����ڱ�");
								System.out.println("4. �ڷΰ���");
								
								int ������â = scan.nextInt();
								
								if(������â ==1) {
							        String parents[] = {
											"�θ�԰� �Ļ��ϸ� ��� ���� �̾߱⸦ �մϴ�.",
											"[�θ��] ����غ�� �� �� �ǰ� �ִ�?",
											"[�Ĵ�] ������� ������ �ϰ� �־�� ����",
											"[�θ��] �׷��׷� �� ȥ�� �˾Ƽ� �� �ϸ��� �ϴ´� ���� ",
											"[�Ĵ�] (��.. �̷��Գ� �� �Ͼ��ֽôµ� �� �ȵǳ� �Ф�) ",
											"[�θ��] �� ���� �԰� ������ �Ƶ�",
											" "
									};
									
									for (int i = 0; i <parents.length; i++) {
										Thread.sleep(500);//0.5�ʸ��� �� ���徿 ���
										System.out.println(parents[i]);
									}
									System.out.println(" ");

									�Ĵ�.�θ�԰��Ļ�();
									System.out.println(" ");

									RelativeClass relative = new RelativeClass();
									relative.RelativeCome();
									relative.join(); 
									System.out.println(" ");

									�Ĵ�.���¾˸�();
									
								}else if(������â == 2) {
								    System.out.println(" ");
								    System.out.println("�ϱ⸦ ���� �Ϸ縦 �����ϰ� �����θ� �����̴ϴ�.");
							�Ĵ�.�ϱ�();
							�Ĵ�.���¾˸�();
						    	}else if(������â == 3) {
									    System.out.println(" ");
							    		System.out.println("������ ���� ������ ü���� �����մϴ�.");
							    		�Ĵ�.����();
							    		�Ĵ�.���¾˸�();
						    		
						    	}else if(������â == 4) {
									continue;
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						
								}
								
								//(��) ������ ����ȣ�� �ؾ��մϴ�.
								Character Bro = new Character(); 
								Bro.���� = "������";
								
								if(Bro.gohospital()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("�� ���� �̺�Ʈ <������ �Կ�>");
									System.out.println("������ �Կ��߽��ϴ�.");
									System.out.println("����ȣ�� �Ͻðڽ��ϱ�?");
									System.out.println("1. ����ȣ�� �Ѵ�.");
									System.out.println("2. ���� �ʴ´�.");

									//��ü.��ü�Լ���. ��ü�� ���!	
									
									int ����ȣ����â = scan.nextInt();
									
									if(����ȣ����â == 1) {
										System.out.println("[�Ĵ�] (��.. ���ؿ� �����ϱ���..)");	
										System.out.println("[�Ĵ�] ���� �� ���� �׷��� �Ф�");	
										Bro.�Ĵ���_ü������_����(5);
										Bro.�Ĵ���_��Ʈ��������_����(5);
										�Ĵ�.���¾˸�();
										
									}else if(����ȣ����â == 2) {
										System.out.println("[�Ĵ�] �ʹ� �ٺ�.. �Ϲݱ� �غ��ؾ���..�Ф�");
										Bro.�Ĵ���_��Ʈ��������_����(5);
										Bro.�Ĵ���_����������_����(5);
										�Ĵ�.���¾˸�();					
									}else {
										System.out.println("�ٽ� �Է��ϼ���.");
										continue; 	
									}
									
								}else {
									System.out.println("�����̺�Ʈ�� �����ϴ�.");
								}
								
						    }else if(���б⼱��â == 4) {
						    	continue;
						    }else {
								System.out.println("�ٽ� �Է��ϼ���.");
						    	continue;
						    }
						    
						}
						
						Sep ++;	
						
					}else if(���θ޴�����â == 2){
						�Ĵ�.���¾˸�();
						
					}else if(���θ޴�����â == 3) {
						System.out.println("������ �����Ͻðڽ��ϱ�?");
						System.out.println("1. ��");
						System.out.println("2. �ƴϿ�");
						
						int �������⼱��â = scan.nextInt();
						
						if(�������⼱��â ==1) {
							System.out.println("9�� ����غ� �����߽��ϴ�.");					
							System.out.println("���� 10���Դϴ�.");
							
							break;

						}else if(�������⼱��â == 2) {
							continue;
						}else {
							System.out.println("�ٽ� �Է��ϼ���."); // ������ �����Ͻðٽ��ϱ�?�� �ߵ���. ��ó�� ���θ޴�â�� �ƴ϶�.
							continue; 						   // �� if���� while�� �ȿ� �ְ� �Ǹ� �������⼱��â == 2�� 1.Ȱ�� 2. ����Ȯ�� 3. �������Ⱑ ���;�
						}
						
					}else {
						System.out.println("�ٽ� �Է��ϼ���.");
						continue;
					}

				}
				
				System.out.println("10���Դϴ�.");	
				System.out.println("10�� �������ֿ� ���������� �ֽ��ϴ�.");					
				
				int OCT = 1; // 10�� �� ��! �� ���� ����!!
				
				while (OCT <= 3) {
					System.out.println(" ");
					System.out.println("1. Ȱ��"); // 1�� Ȱ��, 2�� ����Ȯ��, 3�� ��������
					System.out.println("2. ����Ȯ��");
					System.out.println("3. ��������");
					System.out.println(" ");
							
					int ���θ޴�����â = scan.nextInt();
					
					if ( ���θ޴�����â == 1) {

						if (true) {
							System.out.println(" ");
							System.out.println("4�г� 2�б� 10�� : " + OCT + "/3" + "��° ���Դϴ�.");
							System.out.println("��� ���ðڽ��ϱ�?");
							System.out.println("1. �б��� ����");
							System.out.println("2. ���׿� ����");
							System.out.println("3. ���� ����");
							System.out.println("4. �ڷΰ���");
							System.out.println("<< �б�, ����, �� ���� ����Ȯ���� �̺�Ʈ�� Ƣ��ɴϴ�. >>");

							System.out.println(" ");
							
							int ���б⼱��â = scan.nextInt();

						    if (���б⼱��â == 1) {
								System.out.println(" ");
								System.out.println("�б��� �Խ��ϴ�.");
								System.out.println("�б����� ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. ��������");
								System.out.println("2. �������Ƹ�Ȱ��");
								System.out.println("3. ����������� ������");
								System.out.println("4. �������͵�");
								System.out.println("5. �ڷΰ���");
								System.out.println(" ");

								int �б�����â = scan.nextInt();
								
								if(�б�����â ==1) {
							        System.out.println("��.. �������� ������ �ؾ���!!");
									System.out.println("�б����� ������ ���������� �մϴ�.");
									�Ĵ�.��������();
									
									System.out.println(" ");
									
									SomethingGirl SomethingGirl = new SomethingGirl();

									SomethingGirl.SomethingGirlCome();
									SomethingGirl.join(); 
									System.out.println(" ");
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 2) {
									System.out.println("���Ƹ����� ����鿡�� ��������� ����ϴ�.");
									�Ĵ�.�������Ƹ�����_����();
									System.out.println(" ");
									
									CircleBroThread CircleBro = new CircleBroThread();

									CircleBro.CircleBroCome();
									CircleBro.join(); 
									System.out.println(" ");
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 3) {
									System.out.println("����������ο��� �������� �޽��ϴ�.");
									�Ĵ�.�����������_������();
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 4) {
									System.out.println("�������͵� ���� ���������� ��ȭ��ŵ�ϴ�.");
									�Ĵ�.�������͵�_����();
									
									InterviewStudyMember Studymember= new InterviewStudyMember();

									Studymember.GoFeedback();
									Studymember.join(); 
									
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 5) {
									continue;
							
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						 
								}
								
								// (�б�) ������͵�� ���� �հ��ؼ� ����Ƽ �� Ȯ�� 10%

//								int ���丵Ƚ��;
//								���丵Ƚ�� = 0;
//								while(���丵Ƚ��<1)
								
								Character InterviewFriend = new Character(); 
								InterviewFriend.���� = "������͵��";
								
									if(InterviewFriend.SuccessFirst()) {
										EventBgm EventBgm = new EventBgm();
										
								        try {
								        	EventBgm.LoadBgm();
								             Thread.sleep(0);
								             
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										System.out.println("�б� ���� �̺�Ʈ <������͵���� ���� �հ��߽��ϴ�.>");
										System.out.println("������Ƽ�� �����Ͻðڽ��ϱ�?");
										System.out.println("1. ����");
										System.out.println("2. ����");
			
										//��ü.��ü�Լ���. ��ü�� ���!	
										
										int goparty = scan.nextInt();
										
										if(goparty == 1) {
											System.out.println("������Ƽ�� ������ ���� ������� ����ϴ�.");	
											InterviewFriend.�Ĵ���_��������_����(5);
											InterviewFriend.�Ĵ���_�ʱ�����_����(5);
											InterviewFriend.�Ĵ���_��������_����(5);
											InterviewFriend.�Ĵ���_ü������_����(10);
											InterviewFriend.�Ĵ���_����������_����(5);
											
											�Ĵ�.���¾˸�();
											
										}else if(goparty == 2) {
											System.out.println("������Ƽ�� �����ϰ� ü���� ȸ���մϴ�.");
											InterviewFriend.�Ĵ���_ü������_����(15);
											InterviewFriend.�Ĵ���_����������_����(5);
											InterviewFriend.�Ĵ���_��Ʈ��������_����(5);
											
											�Ĵ�.���¾˸�();					
										}else {
											System.out.println("�ٽ� �Է��ϼ���.");
											continue; 	
										}
										
									}else {
										System.out.println("�����̺�Ʈ�� �����ϴ�.");
									}
								
								
						    }else if(���б⼱��â == 2) {
								System.out.println(" ");
						    	System.out.println("���׿� �Խ��ϴ�.");
								System.out.println("���׿��� ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. �ｺ");
								System.out.println("2. ġ��");
								System.out.println("3. �ڷΰ���");
								System.out.println(" ");
								
								int ���׼���â = scan.nextInt();
								
								if(���׼���â ==1) {
								    
								    System.out.println(" ");
									System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
									System.out.println(" ");
									�Ĵ�.�ｺ��();
									�Ĵ�.���¾˸�();
									
								}else if(���׼���â == 2) {
									String ChickenandBeer[] = { // Ÿ���� ������ - �͸� Ŭ����

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
										      // �� �� �����Ѵ�
										      Thread.sleep(100);
										      // �޼����� ����Ѵ�
										      System.out.println(ChickenandBeer[i]);
										}
									    System.out.println(" ");
										System.out.println("ġ������ ��Ʈ������ Ǳ�ϴ�.");
										�Ĵ�.ġ��();
										�Ĵ�.���¾˸�();
									
								}else if(���׼���â == 3) {
									continue;
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						 
								}
								
								// (����) ����б� ģ������ �Ⱥ���ȭ �� Ȯ�� 10% 
								
								Character HighschoolFriend = new Character(); 
								HighschoolFriend.���� = "����б� ģ��";
								
								if(HighschoolFriend.HiCall()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("���� ���� �̺�Ʈ <����б� ģ���� �Ⱥ���ȭ>");
									System.out.println("�ذ� �ִ� ����б� ģ������ ��ȭ�� �ɴϴ�.");
									System.out.println("1. ��ȭ�� �޴´�. ");
									System.out.println("2. ��ȭ�� ���� �ʴ´�. ");

									//��ü.��ü�Լ���. ��ü�� ���!	
									
									int �Ⱥ���ȭ����â = scan.nextInt();
									
									if(�Ⱥ���ȭ����â == 1) {
										System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
										�Ĵ�.�ｺ��();
										�Ĵ�.���¾˸�();
										System.out.println("[����б� ģ��] �� �ĴϾ�! �Ʊ� ���׿��� �� �� �� ���Ƽ� ��ȭ�߾�!");	
										System.out.println("[����б� ģ��] �� ������ �־���?");	
										System.out.println("[����б� ģ��] ������ ���ķ� �� ���� ���ôµ�! ���� �ʹپ�!");
										System.out.println("[�Ĵ�] ���� ƴ�� ���ֳ�!");
										System.out.println("[�Ĵ�] ���� ���� �ʹپ�!");
										
										HighschoolFriend.�Ĵ���_ü������_����(10);
										HighschoolFriend.�Ĵ���_����������_����(10);
										HighschoolFriend.�Ĵ���_��Ʈ��������_����(10);
										
										�Ĵ�.���¾˸�();
										
									}else if(�Ⱥ���ȭ����â == 2) {
										System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
										�Ĵ�.�ｺ��();
										�Ĵ�.���¾˸�();
										System.out.println("[�Ĵ�] �� ���� ������.. ���� ����� ������ ������..");
										HighschoolFriend.�Ĵ���_����������_����(10);
										HighschoolFriend.�Ĵ���_��Ʈ��������_����(10);
										
										�Ĵ�.���¾˸�();					
									}else {
										System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
										�Ĵ�.�ｺ��();
										�Ĵ�.���¾˸�();
										System.out.println("�ٽ� �Է��ϼ���."); 
										continue; 	
									}
									
								}else {
									System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
									�Ĵ�.�ｺ��();
									�Ĵ�.���¾˸�();
									System.out.println("�����̺�Ʈ�� �����ϴ�.");
								}
								
						    }else if(���б⼱��â == 3) {
						    	System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
								�Ĵ�.�ｺ��();
								�Ĵ�.���¾˸�();
								System.out.println(" ");
						    	System.out.println("���� �Խ��ϴ�.");
								System.out.println("������ ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. �θ�԰� �Ļ�");
								System.out.println("2. �ϱ⾲��");
								System.out.println("3. �����ڱ�");
								System.out.println("4. �ڷΰ���");
								System.out.println(" ");
								
								int ������â = scan.nextInt();
								
								if(������â ==1) {
							        String parents[] = {
											"�θ�԰� �Ļ��ϸ� ��� ���� �̾߱⸦ �մϴ�.",
											"[�θ��] ����غ�� �� �� �ǰ� �ִ�?",
											"[�Ĵ�] ������� ������ �ϰ� �־�� ����",
											"[�θ��] �׷��׷� �� ȥ�� �˾Ƽ� �� �ϸ��� �ϴ´� ���� ",
											"[�Ĵ�] (��.. �̷��Գ� �� �Ͼ��ֽôµ� �� �ȵǳ� �Ф�) ",
											"[�θ��] �� ���� �԰� ������ �Ƶ�",
											" "
									};
									
									for (int i = 0; i <parents.length; i++) {
										Thread.sleep(500);//0.5�ʸ��� �� ���徿 ���
										System.out.println(parents[i]);
									}
									System.out.println(" ");

									�Ĵ�.�θ�԰��Ļ�();
									System.out.println(" ");
									
									RelativeClass relative = new RelativeClass();
									relative.RelativeCome();
									relative.join(); 
									
									�Ĵ�.���¾˸�();
									
								}else if(������â == 2) {
								    System.out.println(" ");
								    System.out.println("�ϱ⸦ ���� �Ϸ縦 �����ϰ� �����θ� �����̴ϴ�.");
									�Ĵ�.�ϱ�();
									�Ĵ�.���¾˸�();
									
						    	}else if(������â == 3) {
										    System.out.println(" ");
										    
								    		System.out.println("������ ���� ������ ü���� �����մϴ�.");
								    		�Ĵ�.����();
								    		�Ĵ�.���¾˸�();
						    		
						    	}else if(������â == 4) {
									continue;
								}else {

									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						
								}
								
								//(��) ������ ����ȣ�� �ؾ��մϴ�.
								Character Bro = new Character(); 
								Bro.���� = "������";
								
								if(Bro.gohospital()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									System.out.println("�� ���� �̺�Ʈ <������ �Կ�>");
									System.out.println("������ �Կ��߽��ϴ�.");
									System.out.println("����ȣ�� �Ͻðڽ��ϱ�?");
									System.out.println("1. ����ȣ�� �Ѵ�.");
									System.out.println("2. ���� �ʴ´�.");

									//��ü.��ü�Լ���. ��ü�� ���!	
									
									int ����ȣ����â = scan.nextInt();
									
									if(����ȣ����â == 1) {
										
										System.out.println("[�Ĵ�] (��.. ���ؿ� �����ϱ���..)");	
										System.out.println("[�Ĵ�] ���� �� ���� �׷��� �Ф�");	
										Bro.�Ĵ���_ü������_����(5);
										Bro.�Ĵ���_��Ʈ��������_����(5);
										�Ĵ�.���¾˸�();
										
									}else if(����ȣ����â == 2) {
										System.out.println("[�Ĵ�] �ʹ� �ٺ�.. �Ϲݱ� �غ��ؾ���..�Ф�");
										Bro.�Ĵ���_��Ʈ��������_����(5);
										Bro.�Ĵ���_����������_����(5);
										�Ĵ�.���¾˸�();					
									}else {
										System.out.println("�ٽ� �Է��ϼ���.");
										continue; 	
									}
									
								}else {
									System.out.println("�����̺�Ʈ�� �����ϴ�.");
								}
								
						    }else if(���б⼱��â == 4) {
						    	continue;
						    }else {
								System.out.println("�ٽ� �Է��ϼ���.");
						    	continue;
						    }
						    
						}
						
						OCT ++;	
						
					}else if(���θ޴�����â == 2){
						�Ĵ�.���¾˸�();
						
					}else if(���θ޴�����â == 3) {
						System.out.println("������ �����Ͻðڽ��ϱ�?");
						System.out.println("1. ��");
						System.out.println("2. �ƴϿ�");
						
						int �������⼱��â = scan.nextInt();
						
						if(�������⼱��â ==1) {
							System.out.println("10�� ����غ� �����մϴ�.");					
							
							
							break;

						}else if(�������⼱��â == 2) {
							continue;
						}else {
							System.out.println("�ٽ� �Է��ϼ���."); // ������ �����Ͻðٽ��ϱ�?�� �ߵ���. ��ó�� ���θ޴�â�� �ƴ϶�.
							continue; 						   // �� if���� while�� �ȿ� �ְ� �Ǹ� �������⼱��â == 2�� 1.Ȱ�� 2. ����Ȯ�� 3. �������Ⱑ ���;�
						}
						
					}else {
						System.out.println("�ٽ� �Է��ϼ���.");
						continue;
					}

				}
				
				System.out.println("�Ϲݱ�ä�� ���� ���� �ְ��Դϴ�.");
				System.out.println("������ �����Ͻðڽ��ϱ�?");
				
				int Apply;
				Apply = 0;
				
				while(Apply<1) {
				System.out.println("1�� : �����Ѵ�");
				System.out.println("2�� : ��������");
						
				int Apply2 = scan.nextInt();
				
				if(Apply2 == 1) {
		 			 
					 System.out.println(" ");
					 String JopPhoto[] = { // Ÿ���� ������ - �͸� Ŭ����

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
					      // �� �� �����Ѵ�
					      Thread.sleep(100);
					      // �޼����� ����Ѵ�
					      System.out.println(JopPhoto[i]);
					}
				    System.out.println(" ");
					

					
					System.out.println("�� ���������� ���� ĿƮ���ΰ� ���մϴ�.");
					System.out.println(" ");
					
					if(�Ĵ�.�Ĵ�_��������>=������ũ�λ���.��������_ĿƮ����) {
						
				        //�н���� (�ε���ݰ� ����)
					   	LoadingBgm passBgm01 = new LoadingBgm();
				          
				        try {
				             passBgm01.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						
						System.out.println("===========================================================");
						System.out.println(" ");
						
						String PASS[] = { // Ÿ���� ������ - �͸� Ŭ����
					            "______   ___   _____  _____ ",    
					            "| ___ \\ / _ \\ /  ___|/  ___|",
					            "| |_/ // /_\\ \\\\ `--. \\ `--. ",
					            "|  __/ |  _  | `--. \\ `--. \\",
					            "| |    | | | |/\\__/ //\\__/ /",
					            "\\_|    \\_| |_/\\____/ \\____/"
					    };

				        
					    for (int i = 0; i < PASS.length; i++) {
						      // �� �� �����Ѵ�
						      Thread.sleep(450);
						      // �޼����� ����Ѵ�
						      System.out.println(PASS[i]);
						} 
						System.out.println(" ");
						System.out.println("���������� �հ��Ͽ����ϴ�!!");
						System.out.println("�ʱ������� �غ��ϼ���!!");
						System.out.println("===========================================================");
						
						break ;
						
					}else {

						System.out.println("���ϴ� �ƽ��Ե� �ݹ� �ű����� ä�� �����ɻ翡�� ���հ��Ͽ����ϴ�.");
						System.out.println("������ ����Ǿ����ϴ�."); 
						
					
						
						String GameEnd[] = { // Ÿ���� ������ - �͸� Ŭ����
								
								
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
						      // �� �� �����Ѵ�
						      Thread.sleep(250);
						      // �޼����� ����Ѵ�
						      System.out.println(GameEnd[i]);
						} 
					   	    
						
		//������ ����Ǿ��      
						System.exit(0);
						

						
					}
					
					
					
				}else if(Apply2 == 2) {

					String GameEnd[] = { // Ÿ���� ������ - �͸� Ŭ����

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
					      // �� �� �����Ѵ�
					      Thread.sleep(250);
					      // �޼����� ����Ѵ�
					      System.out.println(GameEnd[i]);
					} 
					
					System.out.println("������ �����߽��ϴ�.");
					System.out.println("������ ����Ǿ����ϴ�.");
					
		//������ ����Ǿ��
					
					System.exit(0);
					
					break;
					
									
				}else {
					System.out.println("�ٽ� �Է��ϼ���.");
					 
					continue;
				}
				Apply++;
				}
				
				System.out.println("11���Դϴ�.");
				System.out.println("11�� ������ �ֿ� �ִ� �ʱ������� �غ��սô�.");
				
				
				int NOV = 1; // 11�� �� ��! �� �ʱ� ����!!
				
				while (NOV <= 3) {
					System.out.println(" ");
					System.out.println("1. Ȱ��"); // 1�� Ȱ��, 2�� ����Ȯ��, 3�� ��������
					System.out.println("2. ����Ȯ��");
					System.out.println("3. 11�� ��������");
					System.out.println(" ");
							
					int ���θ޴�����â = scan.nextInt();
					
					if ( ���θ޴�����â == 1) {

						if (true) {
							System.out.println(" ");
							System.out.println("4�г� 2�б� 11�� : " + NOV + "/3" + "��° ���Դϴ�.");
							System.out.println("��� ���ðڽ��ϱ�?");
							System.out.println("1. �б��� ����");
							System.out.println("2. ���׿� ����");
							System.out.println("3. ���� ����");
							System.out.println("4. �ڷΰ���");
							System.out.println("<< �б�, ����, �� ���� ����Ȯ���� �̺�Ʈ�� Ƣ��ɴϴ�. >>");

							System.out.println(" ");
							
							int ���б⼱��â = scan.nextInt();

						    if (���б⼱��â == 1) {
								System.out.println(" ");
						    	System.out.println("�б��� �Խ��ϴ�.");
								System.out.println("�б����� ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. ��������");
								System.out.println("2. �������Ƹ�Ȱ��");
								System.out.println("3. ����������� ������");
								System.out.println("4. �������͵�");
								System.out.println("5. �ڷΰ���");
								System.out.println(" ");

								int �б�����â = scan.nextInt();
								
								if(�б�����â ==1) {
							        System.out.println("��.. �������� ������ �ؾ���!!");
									System.out.println("�б����� ������ ���������� �մϴ�.");
									�Ĵ�.��������();
									
									System.out.println(" ");
									
									SomethingGirl SomethingGirl = new SomethingGirl();

									SomethingGirl.SomethingGirlCome();
									SomethingGirl.join(); 
									System.out.println(" ");
									
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 2) {
									System.out.println("���Ƹ����� ����鿡�� ��������� ����ϴ�.");
									�Ĵ�.�������Ƹ�����_����();
									System.out.println(" ");
									
									CircleBroThread CircleBro = new CircleBroThread();

									CircleBro.CircleBroCome();
									CircleBro.join(); 
									System.out.println(" ");
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 3) {
									System.out.println("����������ο��� �������� �޽��ϴ�.");
									�Ĵ�.�����������_������();
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 4) {
									System.out.println("�������͵� ���� ���������� ��ȭ��ŵ�ϴ�.");
									�Ĵ�.�������͵�_����();
									
									InterviewStudyMember Studymember= new InterviewStudyMember();

									Studymember.GoFeedback();
									Studymember.join(); 
									
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 5) {
									continue;
							
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						 
								}
								
								// (�б�) ������͵�� ���� �հ��ؼ� ����Ƽ �� Ȯ�� 10%

//								int ���丵Ƚ��;
//								���丵Ƚ�� = 0;
//								while(���丵Ƚ��<1)
								
								Character InterviewFriend = new Character(); 
								InterviewFriend.���� = "������͵��";
								
									if(InterviewFriend.SuccessFirst()) {
										EventBgm EventBgm = new EventBgm();
										
								        try {
								        	EventBgm.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
										
										System.out.println("�б� ���� �̺�Ʈ <������͵���� ���� �հ��߽��ϴ�.>");
										System.out.println("������Ƽ�� �����Ͻðڽ��ϱ�?");
										System.out.println("1. ����");
										System.out.println("2. ����");
			
										//��ü.��ü�Լ���. ��ü�� ���!	
										
										int goparty = scan.nextInt();
										
										if(goparty == 1) {
											System.out.println("������Ƽ�� ������ ���� ������� ����ϴ�.");	
											InterviewFriend.�Ĵ���_��������_����(5);
											InterviewFriend.�Ĵ���_�ʱ�����_����(5);
											InterviewFriend.�Ĵ���_��������_����(5);
											InterviewFriend.�Ĵ���_ü������_����(10);
											InterviewFriend.�Ĵ���_����������_����(5);
											
											�Ĵ�.���¾˸�();
											
										}else if(goparty == 2) {
											System.out.println("������Ƽ�� �����ϰ� ü���� ȸ���մϴ�.");
											InterviewFriend.�Ĵ���_ü������_����(15);
											InterviewFriend.�Ĵ���_����������_����(5);
											InterviewFriend.�Ĵ���_��Ʈ��������_����(5);
											
											�Ĵ�.���¾˸�();					
										}else {
											continue; 	
										}
										
									}else {
										System.out.println("�����̺�Ʈ�� �����ϴ�.");
									}
								
								
						    }else if(���б⼱��â == 2) {
								System.out.println(" ");
						    	System.out.println("���׿� �Խ��ϴ�.");
								System.out.println("���׿��� ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. �ｺ");
								System.out.println("2. ġ��");
								System.out.println("3. �ڷΰ���");
								System.out.println(" ");
								
								int ���׼���â = scan.nextInt();
								
								if(���׼���â ==1) {
							        
								    
								    System.out.println(" ");
									System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
									System.out.println(" ");
									�Ĵ�.�ｺ��();
									�Ĵ�.���¾˸�();
									
								}else if(���׼���â == 2) {
									    System.out.println(" ");
										System.out.println("ġ������ ��Ʈ������ Ǳ�ϴ�.");
										�Ĵ�.ġ��();
										�Ĵ�.���¾˸�();
									
								}else if(���׼���â == 3) {
									continue;
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						 
								}
								
								// (����) ����б� ģ������ �Ⱥ���ȭ �� Ȯ�� 10% 
								
								Character HighschoolFriend = new Character(); 
								HighschoolFriend.���� = "����б� ģ��";
								
								if(HighschoolFriend.HiCall()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									
									System.out.println("���� ���� �̺�Ʈ <����б� ģ���� �Ⱥ���ȭ>");
									System.out.println("�ذ� �ִ� ����б� ģ������ ��ȭ�� �ɴϴ�.");
									System.out.println("1. ��ȭ�� �޴´�. ");
									System.out.println("2. ��ȭ�� ���� �ʴ´�. ");

									//��ü.��ü�Լ���. ��ü�� ���!	
									
									int �Ⱥ���ȭ����â = scan.nextInt();
									
									if(�Ⱥ���ȭ����â == 1) {
										System.out.println("[����б� ģ��] �� �ĴϾ�! �Ʊ� ���׿��� �� �� �� ���Ƽ� ��ȭ�߾�!");	
										System.out.println("[����б� ģ��] �� ������ �־���?");	
										System.out.println("[����б� ģ��] ������ ���ķ� �� ���� ���ôµ�! ���� �ʹپ�!");
										System.out.println("[�Ĵ�] ���� ƴ�� ���ֳ�!");
										System.out.println("[�Ĵ�] ���� ���� �ʹپ�!");
										
										HighschoolFriend.�Ĵ���_ü������_����(10);
										HighschoolFriend.�Ĵ���_����������_����(10);
										HighschoolFriend.�Ĵ���_��Ʈ��������_����(10);
										
										�Ĵ�.���¾˸�();
										
									}else if(�Ⱥ���ȭ����â == 2) {
										System.out.println("[�Ĵ�] �� ���� ������.. ���� ����� ������ ������..");
										HighschoolFriend.�Ĵ���_����������_����(10);
										HighschoolFriend.�Ĵ���_��Ʈ��������_����(10);
										
										�Ĵ�.���¾˸�();					
									}else {
										System.out.println("�ٽ� �Է��ϼ���."); 
										continue; 	
									}
									
								}else {
									System.out.println("�����̺�Ʈ�� �����ϴ�.");
								}
								
						    }else if(���б⼱��â == 3) {
								System.out.println(" ");
						    	System.out.println("���� �Խ��ϴ�.");
								System.out.println("������ ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. �θ�԰� �Ļ�");
								System.out.println("2. �ϱ⾲��");
								System.out.println("3. �����ڱ�");
								System.out.println("4. �ڷΰ���");
								System.out.println(" ");

								int ������â = scan.nextInt();
								
								if(������â ==1) {
							        String parents[] = {
											"�θ�԰� �Ļ��ϸ� ��� ���� �̾߱⸦ �մϴ�.",
											"[�θ��] ����غ�� �� �� �ǰ� �ִ�?",
											"[�Ĵ�] ������� ������ �ϰ� �־�� ����",
											"[�θ��] �׷��׷� �� ȥ�� �˾Ƽ� �� �ϸ��� �ϴ´� ���� ",
											"[�Ĵ�] (��.. �̷��Գ� �� �Ͼ��ֽôµ� �� �ȵǳ� �Ф�) ",
											"[�θ��] �� ���� �԰� ������ �Ƶ�",
											" "
									};
									
									for (int i = 0; i <parents.length; i++) {
										Thread.sleep(500);//0.5�ʸ��� �� ���徿 ���
										System.out.println(parents[i]);
									}
									System.out.println(" ");

									�Ĵ�.�θ�԰��Ļ�();
									System.out.println(" ");
									
									RelativeClass relative = new RelativeClass();
									relative.RelativeCome();
									relative.join(); 
									
									�Ĵ�.���¾˸�();
									
								}else if(������â == 2) {
								    System.out.println(" ");
								    System.out.println("�ϱ⸦ ���� �Ϸ縦 �����ϰ� �����θ� �����̴ϴ�.");
									�Ĵ�.�ϱ�();
									�Ĵ�.���¾˸�();
									
						    	}else if(������â == 3) {
										    
								    		System.out.println("������ ���� ������ ü���� �����մϴ�.");
								    		�Ĵ�.����();
								    		�Ĵ�.���¾˸�();
						    		
						    	}else if(������â == 4) {
									continue;
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						
								}
								
								//(��) ������ ����ȣ�� �ؾ��մϴ�.
								Character Bro = new Character(); 
								Bro.���� = "������";
								
								if(Bro.gohospital()) {
									
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
							        
									System.out.println("�� ���� �̺�Ʈ <������ �Կ�>");
									System.out.println("������ �Կ��߽��ϴ�.");
									System.out.println("����ȣ�� �Ͻðڽ��ϱ�?");
									System.out.println("1. ����ȣ�� �Ѵ�.");
									System.out.println("2. ���� �ʴ´�.");

									//��ü.��ü�Լ���. ��ü�� ���!	
									
									int ����ȣ����â = scan.nextInt();
									
									if(����ȣ����â == 1) {
										System.out.println("[�Ĵ�] (��.. ���ؿ� �����ϱ���..)");	
										System.out.println("[�Ĵ�] ���� �� ���� �׷��� �Ф�");	
										Bro.�Ĵ���_ü������_����(5);
										Bro.�Ĵ���_��Ʈ��������_����(5);
										�Ĵ�.���¾˸�();
										
									}else if(����ȣ����â == 2) {
										System.out.println("[�Ĵ�] �ʹ� �ٺ�.. �Ϲݱ� �غ��ؾ���..�Ф�");
										Bro.�Ĵ���_��Ʈ��������_����(5);
										Bro.�Ĵ���_����������_����(5);
										�Ĵ�.���¾˸�();					
									}else {
										System.out.println("�ٽ� �Է��ϼ���.");
										continue; 	
									}
									
								}else {
									System.out.println("�����̺�Ʈ�� �����ϴ�.");
								}
								
						    }else if(���б⼱��â == 4) {
						    	continue;
						    }else {
								System.out.println("�ٽ� �Է��ϼ���.");
						    	continue;
						    }
						    
						}
						
						NOV ++;	
						
					}else if(���θ޴�����â == 2){
					
						�Ĵ�.���¾˸�();
						
					}else if(���θ޴�����â == 3) {
							
						System.out.println("11�� ������ �����Ͻðڽ��ϱ�?");
						System.out.println("1. ��");
						System.out.println("2. �ƴϿ�");
						
						int �������⼱��â = scan.nextInt();
						
						if(�������⼱��â ==1) {
							System.out.println("11�� ����غ� �����߽��ϴ�.");					

							break;

						}else if(�������⼱��â == 2) {
							continue;
						}else {
							System.out.println("�ٽ� �Է��ϼ���."); // ������ �����Ͻðٽ��ϱ�?�� �ߵ���. ��ó�� ���θ޴�â�� �ƴ϶�.
							continue; 						   // �� if���� while�� �ȿ� �ְ� �Ǹ� �������⼱��â == 2�� 1.Ȱ�� 2. ����Ȯ�� 3. �������Ⱑ ���;�
						}
						
					}else {
						System.out.println("�ٽ� �Է��ϼ���.");
						continue;
					}

				}
				
				System.out.println("�Ϲݱ�ä�� �ʱ� ���� �ְ��Դϴ�.");
				System.out.println("�ʱ� ������ ���� ���ðڽ��ϱ�?");
				
				int WriteTest;
				WriteTest = 0;
				
				while(WriteTest<1) {
					System.out.println("1�� : �����Ѵ�");
					System.out.println("2�� : �����ܴ�");
						
				int WriteTest2 = scan.nextInt();
				
				if(WriteTest2 == 1) {
					
					System.out.println(" ");
					String JopPhoto[] = { // Ÿ���� ������ - �͸� Ŭ����

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
					      // �� �� �����Ѵ�
					      Thread.sleep(100);
					      // �޼����� ����Ѵ�
					      System.out.println(JopPhoto[i]);
					}
				    System.out.println(" ");
					
				    System.out.println("�� �ʱ������� ���� ĿƮ���ΰ� ���մϴ�.");
				    
					if(�Ĵ�.�Ĵ�_�ʱ�����>=������ũ�λ���.�ʱ�����_ĿƮ����) {
						
				        //�н���� (�ε���ݰ� ����)
					   	LoadingBgm passBgm02 = new LoadingBgm();
				          
				        try {
				             passBgm02.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }

						
						System.out.println("===========================================================");
						System.out.println(" ");
						
						String PASS[] = { // Ÿ���� ������ - �͸� Ŭ����
					            "______   ___   _____  _____ ",    
					            "| ___ \\ / _ \\ /  ___|/  ___|",
					            "| |_/ // /_\\ \\\\ `--. \\ `--. ",
					            "|  __/ |  _  | `--. \\ `--. \\",
					            "| |    | | | |/\\__/ //\\__/ /",
					            "\\_|    \\_| |_/\\____/ \\____/"
					    };

				        
					    for (int i = 0; i < PASS.length; i++) {
						      // �� �� �����Ѵ�
						      Thread.sleep(450);
						      // �޼����� ����Ѵ�
						      System.out.println(PASS[i]);
						} 
						System.out.println(" ");
						System.out.println("�ʱ������� �հ��Ͽ����ϴ�!!");
						System.out.println("���������� �غ��ϼ���!!");
						System.out.println("===========================================================");
						
						break;
						
					}else {
						
						System.out.println("���ϲ����� �ƽ��Ե� ���� ��ܿ� ������ �˷��帳�ϴ�. �����մϴ�.");	
						System.out.println("������ ����Ǿ����ϴ�.");
						
						
						String GameEnd[] = { // Ÿ���� ������ - �͸� Ŭ����

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
						      // �� �� �����Ѵ�
						      Thread.sleep(250);
						      // �޼����� ����Ѵ�
						      System.out.println(GameEnd[i]);
						} 
						

						
						System.exit(0);
					}
		//������ ����Ǿ�� �Ѵ�.			
				}else if(WriteTest2 == 2) {

					String GameEnd[] = { // Ÿ���� ������ - �͸� Ŭ����

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
					      // �� �� �����Ѵ�
					      Thread.sleep(250);
					      // �޼����� ����Ѵ�
					      System.out.println(GameEnd[i]);
					} 
					
				    System.out.println("����غ� �����߽��ϴ�.");
					System.out.println("������ ����Ǿ����ϴ�.");
					
					System.exit(0);
		//������ ����Ǿ�� �Ѵ�.			
					break;
					
									
				}else {
					System.out.println("�ٽ� �Է��ϼ���.");
					 
					continue;
				}
				WriteTest++;
				}
				
				System.out.println("12�� ������ �ֿ� �ִ� ���������� �غ��սô�.");
				
				int DEC = 1; // 12�� �� ��! �� ���� ����!!
				
				while (DEC <= 3) {
					System.out.println("1. Ȱ��"); // 1�� Ȱ��, 2�� ����Ȯ��, 3�� ��������
					System.out.println("2. ����Ȯ��");
					System.out.println("3. ��������");
							
					int ���θ޴�����â = scan.nextInt();
					
					if ( ���θ޴�����â == 1) {

						if (true) {
							System.out.println(" ");
							System.out.println("4�г� 2�б� 12�� : " + DEC + "/3" + "��° ���Դϴ�.");
							System.out.println("��� ���ðڽ��ϱ�?");
							System.out.println("1. �б��� ����");
							System.out.println("2. ���׿� ����");
							System.out.println("3. ���� ����");
							System.out.println("4. �ڷΰ���");
							System.out.println("<< �б�, ����, �� ���� ����Ȯ���� �̺�Ʈ�� Ƣ��ɴϴ�. >>");
							System.out.println(" ");
							
							int ���б⼱��â = scan.nextInt();

						    if (���б⼱��â == 1) {
								System.out.println(" ");
								System.out.println("�б��� �Խ��ϴ�.");
								System.out.println("�б����� ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. ��������");
								System.out.println("2. �������Ƹ�Ȱ��");
								System.out.println("3. ����������� ������");
								System.out.println("4. �������͵�");
								System.out.println("5. �ڷΰ���");
								System.out.println(" ");

								int �б�����â = scan.nextInt();
								
								if(�б�����â ==1) {
							        System.out.println("��.. �������� ������ �ؾ���!!");
									System.out.println("�б����� ������ ���������� �մϴ�.");
									�Ĵ�.��������();
									System.out.println(" ");
									
									SomethingGirl SomethingGirl = new SomethingGirl();

									SomethingGirl.SomethingGirlCome();
									SomethingGirl.join(); 
									System.out.println(" ");
									
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 2) {
									System.out.println("���Ƹ����� ����鿡�� ��������� ����ϴ�.");
									�Ĵ�.�������Ƹ�����_����();
									System.out.println(" ");
									
									CircleBroThread CircleBro = new CircleBroThread();

									CircleBro.CircleBroCome();
									CircleBro.join(); 
									System.out.println(" ");
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 3) {
									System.out.println("����������ο��� �������� �޽��ϴ�.");
									�Ĵ�.�����������_������();
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 4) {
									System.out.println("�������͵� ���� ���������� ��ȭ��ŵ�ϴ�.");
									�Ĵ�.�������͵�_����();
									
									InterviewStudyMember Studymember= new InterviewStudyMember();

									Studymember.GoFeedback();
									Studymember.join(); 
									�Ĵ�.���¾˸�();
									
								}else if(�б�����â == 5) {
									continue;
							
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						 
								}
								
								Character InterviewFriend = new Character(); 
								InterviewFriend.���� = "������͵��";
								
									if(InterviewFriend.SuccessFirst()) {
										
										EventBgm EventBgm = new EventBgm();
										
								        try {
								        	EventBgm.LoadBgm();
								             Thread.sleep(0);
								        }catch(InterruptedException e) {
								             e.printStackTrace();
								        }
								        
										System.out.println("�б� ���� �̺�Ʈ <������͵���� ���� �հ��߽��ϴ�.>");
										System.out.println("������Ƽ�� �����Ͻðڽ��ϱ�?");
										System.out.println("1. ����");
										System.out.println("2. ����");
			
										//��ü.��ü�Լ���. ��ü�� ���!	
										
										int goparty = scan.nextInt();
										
										if(goparty == 1) {
											System.out.println("������Ƽ�� ������ ���� ������� ����ϴ�.");	
											InterviewFriend.�Ĵ���_��������_����(5);
											InterviewFriend.�Ĵ���_�ʱ�����_����(5);
											InterviewFriend.�Ĵ���_��������_����(5);
											InterviewFriend.�Ĵ���_ü������_����(10);
											InterviewFriend.�Ĵ���_����������_����(5);
											
											�Ĵ�.���¾˸�();
											
										}else if(goparty == 2) {
											System.out.println("������Ƽ�� �����ϰ� ü���� ȸ���մϴ�.");
											InterviewFriend.�Ĵ���_ü������_����(15);
											InterviewFriend.�Ĵ���_����������_����(5);
											InterviewFriend.�Ĵ���_��Ʈ��������_����(5);
											
											�Ĵ�.���¾˸�();					
										}else {
											System.out.println("�ٽ� �Է��ϼ���.");
											continue; 	
										}
										
									}else {
										System.out.println("�����̺�Ʈ�� �����ϴ�.");
									}
								
								
						    }else if(���б⼱��â == 2) {
								System.out.println(" ");
						    	System.out.println("���׿� �Խ��ϴ�.");
								System.out.println("���׿��� ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. �ｺ");
								System.out.println("2. ġ��");
								System.out.println("3. �ڷΰ���");
								System.out.println(" ");
								
								int ���׼���â = scan.nextInt();
								
								if(���׼���â ==1) {
							        System.out.println(" ");
							        
									System.out.println("ü���� �淯 ����غ��ϴ� ���� ���� ���� �ʵ��� �սô�.");
									System.out.println(" ");
									�Ĵ�.�ｺ��();
									�Ĵ�.���¾˸�();
									
								}else if(���׼���â == 2) {
									    System.out.println(" ");
										System.out.println("ġ������ ��Ʈ������ Ǳ�ϴ�.");
										�Ĵ�.ġ��();
										�Ĵ�.���¾˸�();
									
								}else if(���׼���â == 3) {
									continue;
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						 
								}
								
								// (����) ����б� ģ������ �Ⱥ���ȭ �� Ȯ�� 10% 
								
								Character HighschoolFriend = new Character(); 
								HighschoolFriend.���� = "����б� ģ��";
								
								if(HighschoolFriend.HiCall()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									
									System.out.println("���� ���� �̺�Ʈ <����б� ģ���� �Ⱥ���ȭ>");
									System.out.println("�ذ� �ִ� ����б� ģ������ ��ȭ�� �ɴϴ�.");
									System.out.println("1. ��ȭ�� �޴´�. ");
									System.out.println("2. ��ȭ�� ���� �ʴ´�. ");

									//��ü.��ü�Լ���. ��ü�� ���!	
									
									int �Ⱥ���ȭ����â = scan.nextInt();
									
									if(�Ⱥ���ȭ����â == 1) {
										System.out.println("[����б� ģ��] �� �ĴϾ�! �Ʊ� ���׿��� �� �� �� ���Ƽ� ��ȭ�߾�!");	
										System.out.println("[����б� ģ��] �� ������ �־���?");	
										System.out.println("[����б� ģ��] ������ ���ķ� �� ���� ���ôµ�! ���� �ʹپ�!");
										System.out.println("[�Ĵ�] ���� ƴ�� ���ֳ�!");
										System.out.println("[�Ĵ�] ���� ���� �ʹپ�!");
										
										HighschoolFriend.�Ĵ���_ü������_����(10);
										HighschoolFriend.�Ĵ���_����������_����(10);
										HighschoolFriend.�Ĵ���_��Ʈ��������_����(10);
										
										�Ĵ�.���¾˸�();
										
									}else if(�Ⱥ���ȭ����â == 2) {
										System.out.println("[�Ĵ�] �� ���� ������.. ���� ����� ������ ������..");
										HighschoolFriend.�Ĵ���_����������_����(10);
										HighschoolFriend.�Ĵ���_��Ʈ��������_����(10);
										
										�Ĵ�.���¾˸�();					
									}else {
										System.out.println("�ٽ� �Է��ϼ���."); 
										continue; 	
									}
									
								}else {
									System.out.println("�����̺�Ʈ�� �����ϴ�.");
								}
								
						    }else if(���б⼱��â == 3) {
								System.out.println(" ");
						    	System.out.println("���� �Խ��ϴ�.");
								System.out.println("������ ������ �Ͻðڽ��ϱ�?");
								System.out.println("1. �θ�԰� �Ļ�");
								System.out.println("2. �ϱ⾲��");
								System.out.println("3. �����ڱ�");
								System.out.println("4. �ڷΰ���");
								System.out.println(" ");
								
								int ������â = scan.nextInt();
								
								if(������â ==1) {
							        String parents[] = {
											"�θ�԰� �Ļ��ϸ� ��� ���� �̾߱⸦ �մϴ�.",
											"[�θ��] ����غ�� �� �� �ǰ� �ִ�?",
											"[�Ĵ�] ������� ������ �ϰ� �־�� ����",
											"[�θ��] �׷��׷� �� ȥ�� �˾Ƽ� �� �ϸ��� �ϴ´� ���� ",
											"[�Ĵ�] (��.. �̷��Գ� �� �Ͼ��ֽôµ� �� �ȵǳ� �Ф�) ",
											"[�θ��] �� ���� �԰� ������ �Ƶ�",
											" "
									};
									
									for (int i = 0; i <parents.length; i++) {
										Thread.sleep(500);//0.5�ʸ��� �� ���徿 ���
										System.out.println(parents[i]);
									}
									System.out.println(" ");

									�Ĵ�.�θ�԰��Ļ�();
									System.out.println(" ");
									
									RelativeClass relative = new RelativeClass();
									relative.RelativeCome();
									relative.join(); 
									
									�Ĵ�.���¾˸�();
									
								}else if(������â == 2) {
								    System.out.println(" ");
								    System.out.println("�ϱ⸦ ���� �Ϸ縦 �����ϰ� �����θ� �����̴ϴ�.");
									�Ĵ�.�ϱ�();
									�Ĵ�.���¾˸�();
									
						    	}else if(������â == 3) {
										    
								    		System.out.println("������ ���� ������ ü���� �����մϴ�.");
								    		�Ĵ�.����();
								    		�Ĵ�.���¾˸�();
						    		
						    	}else if(������â == 4) {
									continue;
								}else {
									System.out.println("�ٽ� �Է��ϼ���."); 
									continue; 						
								}
								
								//(��) ������ ����ȣ�� �ؾ��մϴ�.
								Character Bro = new Character(); 
								Bro.���� = "������";
								
								if(Bro.gohospital()) {
									EventBgm EventBgm = new EventBgm();
									
							        try {
							        	EventBgm.LoadBgm();
							             Thread.sleep(0);
							        }catch(InterruptedException e) {
							             e.printStackTrace();
							        }
									
									System.out.println("�� ���� �̺�Ʈ <������ �Կ�>");
									System.out.println("������ �Կ��߽��ϴ�.");
									System.out.println("����ȣ�� �Ͻðڽ��ϱ�?");
									System.out.println("1. ����ȣ�� �Ѵ�.");
									System.out.println("2. ���� �ʴ´�.");

									//��ü.��ü�Լ���. ��ü�� ���!	
									
									int ����ȣ����â = scan.nextInt();
									
									if(����ȣ����â == 1) {
										System.out.println("[�Ĵ�] (��.. ���ؿ� �����ϱ���..)");	
										System.out.println("[�Ĵ�] ���� �� ���� �׷��� �Ф�");	
										Bro.�Ĵ���_ü������_����(5);
										Bro.�Ĵ���_��Ʈ��������_����(5);
										�Ĵ�.���¾˸�();
										
									}else if(����ȣ����â == 2) {
										System.out.println("[�Ĵ�] �ʹ� �ٺ�.. �Ϲݱ� �غ��ؾ���..�Ф�");
										Bro.�Ĵ���_��Ʈ��������_����(5);
										Bro.�Ĵ���_����������_����(5);
										�Ĵ�.���¾˸�();					
									}else {
										System.out.println("�ٽ� �Է��ϼ���.");
										continue; 	
									}
									
								}else {
									System.out.println("�����̺�Ʈ�� �����ϴ�.");
								}
								
						    }else if(���б⼱��â == 4) {
						    	continue;
						    }else {
								System.out.println("�ٽ� �Է��ϼ���.");
						    	continue;
						    }
						    
						}
						
						DEC ++;	
						
					}else if(���θ޴�����â == 2){
						�Ĵ�.���¾˸�();
						
					}else if(���θ޴�����â == 3) {
							
						System.out.println("������ �����Ͻðڽ��ϱ�?");
						System.out.println("1. ��");
						System.out.println("2. �ƴϿ�");
						
						int �������⼱��â = scan.nextInt();
						
						if(�������⼱��â ==1) {
							System.out.println("12�� ����غ� �����߽��ϴ�.");					
							
							break;

						}else if(�������⼱��â == 2) {
							continue;
						}else {
							System.out.println("�ٽ� �Է��ϼ���."); // ������ �����Ͻðٽ��ϱ�?�� �ߵ���. ��ó�� ���θ޴�â�� �ƴ϶�.
							continue; 						   // �� if���� while�� �ȿ� �ְ� �Ǹ� �������⼱��â == 2�� 1.Ȱ�� 2. ����Ȯ�� 3. �������Ⱑ ���;�
						}
						
					}else {
						Buttonbgm ButtonBgm3 = new Buttonbgm();
						
				        try {
				        	 ButtonBgm3.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }
						System.out.println("�ٽ� �Է��ϼ���.");
						continue;
					}

				}
				
				System.out.println("���� ���Դϴ�.");
				System.out.println("������ �������ðڽ��ϱ�?");

				int InterviewTest;
				InterviewTest = 0;
				
				while(InterviewTest<1) {
				System.out.println("1�� : �����Ѵ�");
				System.out.println("2�� : �����ܴ�");
						
				int InterviewTest2 = scan.nextInt();
				
				if(InterviewTest2  == 1) {
					
					System.out.println(" ");
					String JopPhoto[] = { // Ÿ���� ������ - �͸� Ŭ����

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
					      // �� �� �����Ѵ�
					      Thread.sleep(100);
					      // �޼����� ����Ѵ�
					      System.out.println(JopPhoto[i]);
					}
				    System.out.println(" ");
					
					System.out.println("�� ���������� ���� ĿƮ���ΰ� ���մϴ�.");
					System.out.println(" ");
					
					if(�Ĵ�.�Ĵ�_��������>=������ũ�λ���.��������_ĿƮ����) {
						
				        //�н���� (�ε���ݰ� ����)
					   	LoadingBgm passBgm02 = new LoadingBgm();
				          
				        try {
				             passBgm02.LoadBgm();
				             Thread.sleep(0);
				        }catch(InterruptedException e) {
				             e.printStackTrace();
				        }

						
						System.out.println("===========================================================");
						System.out.println(" ");
						
						String PASS[] = { // Ÿ���� ������ - �͸� Ŭ����
					            "______   ___   _____  _____ ",    
					            "| ___ \\ / _ \\ /  ___|/  ___|",
					            "| |_/ // /_\\ \\\\ `--. \\ `--. ",
					            "|  __/ |  _  | `--. \\ `--. \\",
					            "| |    | | | |/\\__/ //\\__/ /",
					            "\\_|    \\_| |_/\\____/ \\____/"
					    };

				        
					    for (int i = 0; i < PASS.length; i++) {
						      // �� �� �����Ѵ�
						      Thread.sleep(450);
						      // �޼����� ����Ѵ�
						      System.out.println(PASS[i]);
						} 
						System.out.println(" ");
						System.out.println("�Ϲݱ� ä�뿡 �����հ��Ͽ����ϴ�!!");
						System.out.println("���Ի�� ���� �� �˰ڽ��ϴ�.");
						System.out.println("===========================================================");
						
						break;
						
					}else {
						
						System.out.println(" ");
						System.out.println("���ϲ����� �ƽ��Ե� ���� ��ܿ� ������ �˷��帳�ϴ�. �����մϴ�.");				
						System.out.println("������ ����Ǿ����ϴ�.");
						System.out.println(" ");
						
						
						String GameEnd[] = { // Ÿ���� ������ - �͸� Ŭ����

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
						      // �� �� �����Ѵ�
						      Thread.sleep(250);
						      // �޼����� ����Ѵ�
						      System.out.println(GameEnd[i]);
						} 
						

						
						System.exit(0);
		//������ ����Ǿ��				
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
					
					String GameEnd[] = { // Ÿ���� ������ - �͸� Ŭ����

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
					      // �� �� �����Ѵ�
					      Thread.sleep(250);
					      // �޼����� ����Ѵ�
					      System.out.println(GameEnd[i]);
					} 
					System.out.println("����غ� �����߽��ϴ�.");
					System.out.println("������ ����Ǿ����ϴ�.");
					
					System.exit(0);
		//������ ����Ǿ��				
					break;
									
				}else {
					System.out.println("�ٽ� �Է��ϼ���.");
					continue;
				}
				InterviewTest2 ++;
				}

			}else {
				
		}
	}
	

}
