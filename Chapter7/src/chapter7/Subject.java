package chapter7;

public class Subject {
	private String name;	//과목 이름
	private int scorePoint;	//과목 점수
	//Subject 클래스의 멤버 변수
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScorePoint() {
		return scorePoint;
	}
	
	public void setScorePoint(int scorePiont) {
		this.scorePoint = scorePiont;
	}
}
