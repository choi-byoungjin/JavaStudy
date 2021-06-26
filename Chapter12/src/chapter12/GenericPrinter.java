package chapter12;

public class GenericPrinter<T extends Material> {//제네릭 클래스 / Type의 약자. 자료형 매개변수 /extends 예약어로 사용할 수 있는 자료형에 제한을 둠
	private T material;//T 자료형으로 선언한 변수
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}//T 자료형 변수 material을 반환하는 제네릭 메서드
	
	public String toString() {
		return material.toString();
	}
}
