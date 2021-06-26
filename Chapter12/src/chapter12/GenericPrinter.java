package chapter12;

public class GenericPrinter<T extends Material> {//���׸� Ŭ���� / Type�� ����. �ڷ��� �Ű����� /extends ������ ����� �� �ִ� �ڷ����� ������ ��
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
