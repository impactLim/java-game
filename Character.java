package game;

import java.util.Random;

public class Character {

	//��ü����
	String ����;
	
	//������
	public Character() {
		
	}
	
	class ģ�� extends Character{
		
	}

	class ���б������ extends Character{
		
	}
	


	
	//�����, ����� ��� //  50%�� Ȯ���� ������
	public static boolean ������() {
		Random random = new Random();
		boolean result = false;
		int rate = 0;
		
		rate = (int)random.nextInt(100); 
		
		if(rate >= 50) { 
			result = true;
		}
		return result;
	}
	
	//�� ����ģ�� ��� //  30%�� Ȯ���� ���� �� �ǳ׿�!
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
	
	//������ ��� //  30%�� Ȯ���� �����⿡�� ī���� ��!
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
	
	// �������͵�� ��� //  20%�� Ȯ���� ���� �հ��ؼ� ������Ƽ�� ����!
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
	
	//����б� ģ�� //  30%�� Ȯ���� ����б� ģ������ �Ⱥ���ȭ�� ��!
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
	
	//������ //  30%�� Ȯ���� ������ �Կ���!
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
	
	void �Ĵ���_��������_����(int ��������) { //public void �Ĵ���_��������_���(int �Ĵ�_��������) {
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
	
	void �Ĵ���_��Ʈ��������_����(int ��Ʈ��������) {
		�Ĵ�.�Ĵ�_��Ʈ�������� -= ��Ʈ��������;
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

}
