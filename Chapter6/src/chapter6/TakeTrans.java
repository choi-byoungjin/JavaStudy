package chapter6;

public class TakeTrans {
	public static void main(String[] args) {
		
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);	//�л� �� �� ����
		Student studentEdward = new Student("Edward", 30000);
		
		Bus bus100 = new Bus(100);					//�뼱 ��ȣ�� 100���� ���� ����
		
		studentJames.takeBus(bus100);				//james�� 100�� ������ Ž
		studentJames.showInfo();					//james ���� ���
		bus100.showInfo();							//���� ���� ��� 
		
		Subway subwayGreen = new Subway("2ȣ��");		//�뼱 ��ȣ�� 2ȣ���� ����ö ����
		
		studentTomas.takeSubway(subwayGreen);		//Tomas�� 2ȣ���� Ž
		studentTomas.showInfo();					//Tomas ���� ���
		subwayGreen.showInfo();						//����ö ���� ���
		
		Taxi taxiKakao = new Taxi("īī��");
		
		studentEdward.takeTaxi(taxiKakao);
		studentEdward.showInfo();
		taxiKakao.showInfo();
		
		
	}

}
