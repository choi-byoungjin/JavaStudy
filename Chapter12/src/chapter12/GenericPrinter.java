package chapter12;

public class GenericPrinter<T> {//제네릭 클래스 / Type의 약자. 자료형 매개변수
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
}
