package chapter12;

public class GenericPrinter<T> {//���׸� Ŭ���� / Type�� ����. �ڷ��� �Ű�����
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
}
