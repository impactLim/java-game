package game;

public class LoadingThread extends Thread{

    String str; 

    public LoadingThread(String str){ // ������
        this.str = str;
    }

    public void run(){ // run �޼���� ���� �帧�� �ϳ� �� ������ ���� �޼����̴�. 
//    	super.run();				// �� �ٸ� ���θ޼����� �����ϸ� �ȴ�.
    	
    	for(int i = 0; i <15; i ++){
        	
        	System.out.print(str);
            try {
                //��ǻ�Ͱ� �ʹ� ������ ������ �������� �� Ȯ�� �� �� ��� 
                // Thread.sleep() �޼��带 �̿��ؼ� ���ݾ� �����ٰ� ����� �� �ְ��Ѵ�. 
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace(); // e.printStackTrace(); �޼ҵ� getMessage, toString���� �ٸ��� printStackTrace�� ���ϰ��� ����. �� �޼ҵ带 ȣ���ϸ� �޼ҵ尡 ���������� ���� ����� ȭ�鿡 ����Ѵ�.
            }
        }   
    	
    	System.out.println(" ");
    	
//    	char[] timerate = new char[]{'|', '/', '-', '\\'};
//
//        for (int i = 0; i <= 100; i++) {
//            System.out.print("�ε� ��..." + i + "% " + timerate[i % 4] + "\r");
//
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

        System.out.println("�ε��Ϸ�!");
    	System.out.println(" ");
    	System.out.println("���Ӽ����� �ʿ��Ͻʴϱ�?");	
		System.out.println("1. �ʿ��ϴ� 2. �ʿ����");
    }
	
}

//2. Runnable �������̽��� implements �ϴ� ����̴�.
//�ٸ� Ŭ������ extends�Ͽ� ThreadŬ������ ������� �� �ϴ� ��쿡 Runnable�� �����Ͽ� �����带 �����Ѵ�.
//* extends�� �ϳ��� Ŭ������ �Ѱ��� �����ϴ�.
//* �������̽��� implements�� ���Ͽ� ���� ��ӵ� �����ϴٴ� ������ �ֽ��ϴ� ������ �����ΰ� ���� �ƹ��� ��ɵ� ���� �ʽ��ϴ� ���� ���� �Լ����� ��� �������̵� ���־�� �մϴ�. 
