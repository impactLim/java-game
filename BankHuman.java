package game;

import java.util.Random;

public class BankHuman {

	String �����̸�;
	int ��������_ĿƮ����;
	int �ʱ�����_ĿƮ����;
	int ��������_ĿƮ����;
	
	String ���Ի��_�ʺ�;
	String �����;

	//
	
	public BankHuman() {
		
	}
	
	//
	
	public void �Ϲݱ�ä��_�������� () {
		System.out.println("�Ϲݱ�ä�� ���������� ���۵Ǿ����ϴ�.");
	}
	
	public void �Ϲݱ�ä��_�ʱ�����() {
		System.out.println("�Ϲݱ�ä�� �ʱ������� ���۵Ǿ����ϴ�.");		
	}

	public void �Ϲݱ�ä��_��������() {
		System.out.println("�Ϲݱ�ä�� ���������� ���۵Ǿ����ϴ�.");		
	}
	
	public void ��������_���Ȱ��() {
		System.out.println("���Ȱ�� ������ �����߽��ϴ�.");		
	}

	public void ��������_������() {
		System.out.println("������ ������ ������ �����߽��ϴ�.");		
	}

	public void ��������_����() {
		System.out.println("���� ������ �����߽��ϴ�.");		
	}
	
	public static boolean �����ڸ��丵() {
		Random random = new Random();
		boolean result = false;
		int rate = 0;
		
		rate = (int)random.nextInt(100); 
		
		if(rate >= 81) { //  20%�� Ȯ���� �����ڸ��丵!
			result = true;
		}
		return result;
	}
	
	void �Ĵ���_��������_����(int ��������) { 		
		�Ĵ�.�Ĵ�_�������� +=��������;
		System.out.println("�Ĵ��� ���������� " + �������� + " ���������ϴ�." );
	}
	
	void �Ĵ���_�ʱ�����_����(int �ʱ�����) {
		�Ĵ�.�Ĵ�_�ʱ����� +=�ʱ�����;
		System.out.println("�Ĵ��� �ʱ������� " + �ʱ����� + " ���������ϴ�." );
	}
	
	void �Ĵ���_��������_����(int ��������) {
		�Ĵ�.�Ĵ�_�������� +=��������;
		System.out.println("�Ĵ��� ���������� " + �������� + " ���������ϴ�." );
	}
	
	void �Ĵ���_ü������_����(int ü������) {
		�Ĵ�.�Ĵ�_ü������ -= ü������;
		System.out.println("�Ĵ��� ü�������� " + ü������ + " ���������ϴ�." );
	}
	
	void �Ĵ���_ü������_����(int ü������) {
		�Ĵ�.�Ĵ�_ü������ += ü������;
		System.out.println("�Ĵ��� ü�������� " + ü������ + " ���������ϴ�." );
	}
	
	void �Ĵ���_��Ʈ��������_����(int ��Ʈ��������) {
		�Ĵ�.�Ĵ�_��Ʈ�������� += ��Ʈ��������;
		System.out.println("�Ĵ��� ��Ʈ���������� " + ��Ʈ�������� + " ���������ϴ�." );
	}
	
	void �Ĵ���_����������_����(int ����������) {
		�Ĵ�.�Ĵ�_���������� += ����������;
		System.out.println("�Ĵ��� ������������ " + ���������� + " ���������ϴ�." );
		}
		
	void �Ĵ���_����������_����(int ����������) {
		�Ĵ�.�Ĵ�_���������� -= ����������;
		System.out.println("�Ĵ��� ������������ " + ���������� + " ���������ϴ�." );
	}
	
	//
//		class ���������λ��� extends BankHuman{
//		
//			public ���������λ���() {
//				
//			}
//			
//		}
//		
//		class ��������λ��� extends BankHuman{
//			
//			public ��������λ���() {
//				
//			}
//		}
//
//		class ������ũ�λ��� extends BankHuman{
//		
//			public ������ũ�λ���() {
//				
//			}
//		}
		
		
}

	

