package CH7;

public class DogTest {

	public static void main(String[] args) {
		
		Dog[] dogArray = new Dog[5];
		dogArray[0] = new Dog("¹ÙµÏÀÌ", "Áøµ¾°³");
		dogArray[1] = new Dog("Æ÷µµ", "Çªµé");
		dogArray[2] = new Dog("»Ç»ß", "¸»Æ¼Áî");
		dogArray[3] = new Dog("Æ¼Æ¼", "Ä¡¿Í¿Í");
		dogArray[4] = new Dog("¿Àµ­", "½Ã¹Ù°ß");
	
	
		for(int i = 0; i < dogArray.length; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}
		
		for(Dog dog : dogArray) {
			System.out.println(dog.showDogInfo());
		}
	}
}
