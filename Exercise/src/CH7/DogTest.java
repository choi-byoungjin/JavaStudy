package CH7;

public class DogTest {

	public static void main(String[] args) {
		
		Dog[] dogArray = new Dog[5];
		dogArray[0] = new Dog("�ٵ���", "������");
		dogArray[1] = new Dog("����", "Ǫ��");
		dogArray[2] = new Dog("�ǻ�", "��Ƽ��");
		dogArray[3] = new Dog("ƼƼ", "ġ�Ϳ�");
		dogArray[4] = new Dog("����", "�ùٰ�");
	
	
		for(int i = 0; i < dogArray.length; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}
		
		for(Dog dog : dogArray) {
			System.out.println(dog.showDogInfo());
		}
	}
}
