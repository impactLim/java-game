package game;

import java.util.Random;

public class Spec {

	//객체변수
	String 스펙이름;
	
	//생성자
	public Spec() {
		
	}

	
	//객체기능
	
	static void 후니의_서류지수_증가(int 서류지수) { 		//public void 후니의_서류지수_향상(int 후니_서류지수) {
		후니.후니_서류지수 += 서류지수;
		System.out.println("후니의 서류지수가 " + 서류지수 + " 높아졌습니다." );
	}
	
	static void 후니의_체력지수_감소(int 체력지수) {
		후니.후니_체력지수 -=체력지수;
		System.out.println("후니의 체력지수가 " + 체력지수 + " 낮아졌습니다." );
	}
	
	static void 후니의_스트레스지수_증가(int 스트레스지수) {
		후니.후니_스트레스지수 += 스트레스지수;
		System.out.println("후니의 스트레스지수가 " + 스트레스지수 + " 높아졌습니다." );
	}
	
}

		class 자격증 extends Spec{
			
			int 자존감지수;
			
			public 자격증() {
				
			}
			
			static void 후니의_자존감지수_증가(int a) {

			후니.후니_자존감지수 += a;
			System.out.println("후니의 자존감지수가 " + a + " 높아졌습니다." );
			
			}
			
			static void 후니의_자존감지수_감소(int 자존감지수) {

			후니.후니_자존감지수 -= 자존감지수;
			System.out.println("후니의 자존감지수가 " + 자존감지수 + " 낮아졌습니다." );
			
			}

		}
		
				class 컴퓨터자격증 extends 자격증{
					
					int 컴퓨터활용능력;
					
					public 컴퓨터자격증() {
						
					}
					
					public void 컴퓨터활용능력_추가() {
						System.out.println("후니의 능력에 컴퓨터활용능력이 추가되었습니다.");
					}
				}
				
				class 어학자격증 extends 자격증{
					
					int 영어회화능력;
					
					public 어학자격증() {
						
					}
					
					public void 영어회화능력_추가() {
						System.out.println("후니의 능력에 영어회화능력이 추가되었습니다.");
					}
				}
				
				class 금융자격증 extends 자격증{
					
					int 금융지식활용능력;
					
					public 금융자격증() {

					}
					
					public void 금융지식활용능력_추가(int 필기지수) {
						후니.후니_필기지수 +=필기지수;
						System.out.println("후니의 필기지수가 " + 필기지수 + " 높아졌습니다." );
//						System.out.println("후니의 능력에 금융지식활용능력이 추가되었습니다.");
					}
				}
				
		class 대외활동 extends Spec{
			
			int 면접지수;
			
			public 대외활동() {

			}
			
			public void 후니의_면접지수_증가(int 면접지수) {
				후니.후니_면접지수 += 면접지수;		
				System.out.println("후니의 면접지수가 " + 면접지수 + " 높아졌습니다." );
			}
		}
				class 기자단 extends 대외활동{
					
					int 글쓰기능력;
					
					public 기자단() {
						
					}
					
					public void 글쓰기능력_추가() {
						System.out.println("후니의 능력에 글쓰기능력이 추가되었습니다.");
					}
				}
				
				class 서포터즈 extends 대외활동{
					
					int 홍보능력;
					
					public 서포터즈() {
						
					}
					
					public void 홍보능력_추가() {
						System.out.println("후니의 능력에 홍보능력이 추가되었습니다.");
					}
				}
				
		class 공모전 extends Spec{
			
			
			int 면접지수 ;

			public 공모전() {
				
				
			}
			
			
			public void 후니의_면접지수_증가(int 면접지수) {
				후니.후니_면접지수 += 면접지수;		
				System.out.println("후니의 면접지수가 " + 면접지수 + " 높아졌습니다." );
			}
						
		}
				class 아이디어공모전 extends 공모전 { //아이디어공모전 다시 생각
					
					int 창의력 ;
					
					public 아이디어공모전() {
						
					}
					
					public void 창의력_추가() {
						System.out.println("후니의 능력에 창의력이 추가되었습니다.");
					}
							
				}
				
				class 논문공모전 extends 공모전{
					
					int 사고력 ;
					
					public 논문공모전() {
						
					}
					
					public void 사고력_추가() {
						System.out.println("후니의 능력에 사고력이 추가되었습니다.");
					}
				}
				
		class 인턴 extends Spec{
			
			int 자존감지수 ;
			int 필기지수 ;
			int 면접지수 ;
			int 센스 ;
			
			public 인턴() {
				
			}
			
			void 후니의_자존감지수_증가(int 자존감지수) {
				후니.후니_자존감지수 += 자존감지수;
				System.out.println("후니의 자존감지수가 " + 자존감지수 + " 높아졌습니다." );
			}
			
			void 후니의_필기지수_증가(int 필기지수) {
				후니.후니_필기지수 += 필기지수;
				System.out.println("후니의 필기지수가 " + 필기지수 + " 높아졌습니다." );
			}
			
			void 후니의_면접지수_증가(int 면접지수) {
				후니.후니_면접지수 += 면접지수;
				System.out.println("후니의 면접지수가 " + 면접지수 + " 높아졌습니다." );
			}
			void 센스_추가() {
				System.out.println("후니의 능력에 센스가 추가되었습니다.");
			}
		}