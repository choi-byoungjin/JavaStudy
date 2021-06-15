package chapter10;

public interface Queue {
	
	void enQueue(String title);	//배열의 맨 마지막에 추가
	String deQueue();			//배열의 맨 처음 항목 반환
	int getSize();				//현재 Queue에 있는 개수 반환
}
//enQueue()는 입력되는 요소 값을 배열의 맨 뒤에 추가합니다.
//deQueue()는 배열에서 맨 앞에 있는 요소를 제거하고 그 값을 반환합니다.