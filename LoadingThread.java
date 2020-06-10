package game;

public class LoadingThread extends Thread{

    String str; 

    public LoadingThread(String str){ // 생성자
        this.str = str;
    }

    public void run(){ // run 메서드는 수행 흐름이 하나 더 생겼을 때의 메서드이다. 
//    	super.run();				// 또 다른 메인메서드라고 생각하면 된다.
    	
    	for(int i = 0; i <15; i ++){
        	
        	System.out.print(str);
            try {
                //컴퓨터가 너무 빠르기 때문에 수행결과를 잘 확인 할 수 없어서 
                // Thread.sleep() 메서드를 이용해서 조금씩 쉬었다가 출력할 수 있게한다. 
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace(); // e.printStackTrace(); 메소드 getMessage, toString과는 다르게 printStackTrace는 리턴값이 없다. 이 메소드를 호출하면 메소드가 내부적으로 예외 결과를 화면에 출력한다.
            }
        }   
    	
    	System.out.println(" ");
    	
//    	char[] timerate = new char[]{'|', '/', '-', '\\'};
//
//        for (int i = 0; i <= 100; i++) {
//            System.out.print("로딩 중..." + i + "% " + timerate[i % 4] + "\r");
//
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

        System.out.println("로딩완료!");
    	System.out.println(" ");
    	System.out.println("게임설명이 필요하십니까?");	
		System.out.println("1. 필요하다 2. 필요없다");
    }
	
}

//2. Runnable 인터페이스를 implements 하는 방법이다.
//다른 클래스를 extends하여 Thread클래스를 상속하지 못 하는 경우에 Runnable을 구현하여 쓰레드를 생성한다.
//* extends는 하나의 클래스에 한개만 가능하다.
//* 인터페이스는 implements를 통하여 다중 상속도 가능하다는 장점이 있습니다 하지만 구현부가 없어 아무런 기능도 하지 않습니다 또한 내부 함수들을 모두 오버라이딩 해주어야 합니다. 
