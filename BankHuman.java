package game;

import java.util.Random;

public class BankHuman {

	String 은행이름;
	int 서류지수_커트라인;
	int 필기지수_커트라인;
	int 면접지수_커트라인;
	
	String 신입사원_초봉;
	String 워라밸;

	//
	
	public BankHuman() {
		
	}
	
	//
	
	public void 하반기채용_서류전형 () {
		System.out.println("하반기채용 서류전형이 시작되었습니다.");
	}
	
	public void 하반기채용_필기전형() {
		System.out.println("하반기채용 필기전형이 시작되었습니다.");		
	}

	public void 하반기채용_면접전형() {
		System.out.println("하반기채용 면접전형이 시작되었습니다.");		
	}
	
	public void 여름방학_대외활동() {
		System.out.println("대외활동 모집을 시작했습니다.");		
	}

	public void 여름방학_공모전() {
		System.out.println("공모전 참여자 모집을 시작했습니다.");		
	}

	public void 여름방학_인턴() {
		System.out.println("인턴 모집을 시작했습니다.");		
	}
	
	public static boolean 현직자멘토링() {
		Random random = new Random();
		boolean result = false;
		int rate = 0;
		
		rate = (int)random.nextInt(100); 
		
		if(rate >= 81) { //  20%의 확률로 현직자멘토링!
			result = true;
		}
		return result;
	}
	
	void 후니의_서류지수_증가(int 서류지수) { 		
		후니.후니_서류지수 +=서류지수;
		System.out.println("후니의 서류지수가 " + 서류지수 + " 높아졌습니다." );
	}
	
	void 후니의_필기지수_증가(int 필기지수) {
		후니.후니_필기지수 +=필기지수;
		System.out.println("후니의 필기지수가 " + 필기지수 + " 높아졌습니다." );
	}
	
	void 후니의_면접지수_증가(int 면접지수) {
		후니.후니_면접지수 +=면접지수;
		System.out.println("후니의 면접지수가 " + 면접지수 + " 높아졌습니다." );
	}
	
	void 후니의_체력지수_감소(int 체력지수) {
		후니.후니_체력지수 -= 체력지수;
		System.out.println("후니의 체력지수가 " + 체력지수 + " 낮아졌습니다." );
	}
	
	void 후니의_체력지수_증가(int 체력지수) {
		후니.후니_체력지수 += 체력지수;
		System.out.println("후니의 체력지수가 " + 체력지수 + " 높아졌습니다." );
	}
	
	void 후니의_스트레스지수_증가(int 스트레스지수) {
		후니.후니_스트레스지수 += 스트레스지수;
		System.out.println("후니의 스트레스지수가 " + 스트레스지수 + " 높아졌습니다." );
	}
	
	void 후니의_자존감지수_증가(int 자존감지수) {
		후니.후니_자존감지수 += 자존감지수;
		System.out.println("후니의 자존감지수가 " + 자존감지수 + " 높아졌습니다." );
		}
		
	void 후니의_자존감지수_감소(int 자존감지수) {
		후니.후니_자존감지수 -= 자존감지수;
		System.out.println("후니의 자존감지수가 " + 자존감지수 + " 낮아졌습니다." );
	}
	
	//
//		class 한쿡은행인사팀 extends BankHuman{
//		
//			public 한쿡은행인사팀() {
//				
//			}
//			
//		}
//		
//		class 쿡민은행인사팀 extends BankHuman{
//			
//			public 쿡민은행인사팀() {
//				
//			}
//		}
//
//		class 까까오뱅크인사팀 extends BankHuman{
//		
//			public 까까오뱅크인사팀() {
//				
//			}
//		}
		
		
}

	

