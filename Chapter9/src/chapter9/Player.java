package chapter9;

public class Player {
	private PlayerLevel level;//Player�� ������ level ���� ����
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}//����Ʈ ������. ó�� �����Ǹ� BeginnerLevel�� �����ϸ� ���� �޽��� ���
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level){//�Ű����� �ڷ����� ��� ������ ��ȯ ������ PlayerLevel
		this.level = level;
		level.showLevelMessage();
	}//���� ���� �޼���. ���� �ڽ��� level�� �Ű������� ���� level�� �����ϰ� ���� �޽��� ���
	
	public void play(int count) {
		level.go(count);//PlayerLevel�� ���ø� �޼��� go() ȣ��
	}
}
