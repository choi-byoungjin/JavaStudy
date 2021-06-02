package chapter8;
import java.util.ArrayList;

class Animal{//���� Ŭ���� Animal
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{//Animal�� ��ӹ��� Human Ŭ����
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal{//Animal�� ��ӹ��� Tiger Ŭ����
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal{//Animal�� ��ӹ��� Eagle Ŭ����
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	public void flaying() {
		System.out.println("�������� ������ �� ��� �ָ� ���ư��ϴ�.");
	}
}
public class AnimalTest {
	ArrayList<Animal> aniList = new ArrayList<Animal>();//�迭�� �ڷ����� Animal�� ����
	
	
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println("���� ������ �ٿ� ĳ����");
		aTest.testCasting();
	}
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());//ArrayList�� �߰��Ǹ鼭 Animal������ �� ��ȯ
		
		for(Animal ani : aniList) {
			ani.move();
		}
	}
	
	public void testCasting() {
		for(int i = 0; i < aniList.size(); i++) {	//��� �迭 ��Ҹ� �ϳ��� ���鼭
			Animal ani = aniList.get(i);			//Animal������ ������
			if(ani instanceof Human) {				//Human�̸�
				Human h = (Human)ani;				//Human������ �ٿ� ĳ����
				h.readBook();
			}
			else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.flaying();
			}
			else {
				System.out.println("�������� �ʴ� ���Դϴ�.");
			}
		}
	}
}
