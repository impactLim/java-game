package game;

import java.util.Random;

public class Character {

	//객체변수
	String 관계;
	
	//생성자
	public Character() {
		
	}
	
	class 친구 extends Character{
		
	}

	class 대학교사람들 extends Character{
		
	}
	


	
	//부장님, 팀장님 기능 //  50%의 확률로 꼰대질
	public static boolean 꼰대질() {
		Random random = new Random();
		boolean result = false;
		int rate = 0;
		
		rate = (int)random.nextInt(100); 
		
		if(rate >= 50) { 
			result = true;
		}
		return result;
	}
	
	//전 여자친구 기능 //  30%의 확률로 먼저 말 건네옴!
	public static boolean talkfirst() {
		Random random = new Random();
		boolean result = false;
		int rate = 0;
		
		rate = (int)random.nextInt(100); 
		
		if(rate >= 71) { 
			result = true;
		}
		return result;
	}
	
	//과동기 기능 //  30%의 확률로 과동기에게 카톡이 옴!
	public static boolean kakaotalk() {
		Random random = new Random();
		boolean result = false;
		int rate = 0;
		
		rate = (int)random.nextInt(100); 
		
		if(rate >= 71) { 
			result = true;
		}
		return result;
	}
	
	// 면접스터디원 기능 //  20%의 확률로 먼저 합격해서 축하파티를 연다!
	public static boolean SuccessFirst() {
		Random random = new Random();
		boolean result = false;
		int rate = 0;
		
		rate = (int)random.nextInt(100); 
		
		if(rate >= 81) { 
			result = true;
		}
		return result;
	}
	
	//고등학교 친구 //  30%의 확률로 고등학교 친구에게 안부전화가 옴!
	public static boolean HiCall() {
		Random random = new Random();
		boolean result = false;
		int rate = 0;
		
		rate = (int)random.nextInt(100); 
		
		if(rate >= 71) { 
			result = true;
		}
		return result;
	}
	
	//남동생 //  30%의 확률로 동생이 입원함!
	public static boolean gohospital() {
		Random random = new Random();
		boolean result = false;
		int rate = 0;
		
		rate = (int)random.nextInt(100); 
		
		if(rate >= 71) { 
			result = true;
		}
		return result;
	}
	
	void 후니의_서류지수_증가(int 서류지수) { //public void 후니의_서류지수_향상(int 후니_서류지수) {
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
	
	void 후니의_스트레스지수_감소(int 스트레스지수) {
		후니.후니_스트레스지수 -= 스트레스지수;
		System.out.println("후니의 스트레스지수가 " + 스트레스지수 + " 낮아졌습니다." );
	}
	
	void 후니의_자존감지수_증가(int 자존감지수) {
		후니.후니_자존감지수 += 자존감지수;
		System.out.println("후니의 자존감지수가 " + 자존감지수 + " 높아졌습니다." );
		}
		
	void 후니의_자존감지수_감소(int 자존감지수) {
		후니.후니_자존감지수 -= 자존감지수;
		System.out.println("후니의 자존감지수가 " + 자존감지수 + " 낮아졌습니다." );
	}

}
