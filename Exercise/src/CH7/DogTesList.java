package CH7;
import java.util.ArrayList;

public class DogTesList {

	public static void main(String[] args) {
		ArrayList<Dog> animal = new ArrayList<Dog>();
		
		animal.add(new Dog("�ٵ���", "������"));
		animal.add(new Dog("����", "Ǫ��"));
		animal.add(new Dog("�ǻ�", "��Ƽ��"));
		animal.add(new Dog("ƼƼ", "ġ�Ϳ�"));
		animal.add(new Dog("����", "�ùٰ�"));
		
		for(Dog dog : animal) {
			dog.showDogInfo();
		}
	}

}
