package CH7;
import java.util.ArrayList;

public class DogTesList {

	public static void main(String[] args) {
		ArrayList<Dog> animal = new ArrayList<Dog>();
		
		animal.add(new Dog("¹ÙµÏÀÌ", "Áøµ¾°³"));
		animal.add(new Dog("Æ÷µµ", "Çªµé"));
		animal.add(new Dog("»Ç»ß", "¸»Æ¼Áî"));
		animal.add(new Dog("Æ¼Æ¼", "Ä¡¿Í¿Í"));
		animal.add(new Dog("¿Àµ­", "½Ã¹Ù°ß"));
		
		for(Dog dog : animal) {
			dog.showDogInfo();
		}
	}

}
