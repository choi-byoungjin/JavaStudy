package chapter10;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {//���ڸ� �Է¹޴� System.in.read()�� ����Ϸ��� IOExeption���� ������ ó���ؾ� ��
		System.out.println("��ȭ ��� �Ҵ� ����� ���� �ϼ���.");
		System.out.println("R : �Ѹ� ���ʷ� �Ҵ� ");
		System.out.println("L : ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ� ");
		System.out.println("P : �켱������ ���� �� ���� �Ҵ� ");
		
		int ch = System.in.read();//�Ҵ� ����� �Է¹޾� ch ������ ����
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r'){
			scheduler = new RoundRobin();
		}//�Է¹��� ���� R �Ǵ� r �̸� RoundRobin Ŭ���� ����
		else if(ch == 'L' || ch == 'l'){
			scheduler = new LeastJob();
		}//�Է¹��� ���� L �Ǵ� �� �̸� Leastjob Ŭ���� ����
		else if(ch == 'P'|| ch == 'p'){
			scheduler = new PriorityAllocation();
		}//�Է¹��� ���� P �Ǵ� p �̸� PriorityAllocation Ŭ���� ����
		else{
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();//� ��å�ΰ��� ������� �������̽��� ������ �޼��� ȣ��

	}

}
