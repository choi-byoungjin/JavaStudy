import javax.swing.JOptionPane;

public class OkJavaGoInHomeInput {

	//args = parameter, 매개변수
	public static void main(String[] args) {
		
		String id = args[0];
		String bright = args[1];
		
		// Elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);//1층으로 엘리베이터 보내라는 신호
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();//off메소드
		
		// Light on
		Lighting hallLamp = new Lighting(id+" / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+" / floorLamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
	}

}
