package chapter12;

public class GenericPrinter<T> {//���׸� Ŭ���� / Type�� ����. �ڷ��� �Ű�����
	private T material;//T �ڷ������� ������ ����
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}//T �ڷ��� ���� material�� ��ȯ�ϴ� ���׸� �޼���
	
	public String toString() {
		return material.toString();
	}
}
