import processing.core.PApplet;

public class boardRunner extends PApplet {
	private int event, heat, setEvent, EventNum;
	private boolean check;
	
	public static void main(String[] args) {
		PApplet.main("boardRunner");
	}
	
	public void settings() {
		size(570, 300);
		event = heat = 1;
		setEvent = 255;
		EventNum = 0;
		check = false;
	}
	
	public void setup() {
		background(255);
	}
	
	public void draw() {
		background(255);
		
		//Drawing out the event and heat things
		stroke(0);
		fill(0);
		line(0, 30, 570, 30);
		line(0, 130, 570, 130);
		textSize(60);
		text("Event", 20, 100);
		line(200, 30, 200, 130);
		text(Integer.toString(event), 220, 100);
		line(300, 30, 300, 130);
		text("Heat", 320, 100);
		line(470, 30, 470, 130);
		text(Integer.toString(heat), 490, 100);
		line(570, 30, 570, 130);
		
		//Details
		textSize(15);
		text("Use up and down arrows to change event. Use right and left arrows to change heat.", 5, 160);
		text("Press CTRL and then enter a heat number and then click 's' to set the heat.", 5, 180);
		
		textSize(60);
		fill(setEvent);
		text("Enter Event: " + Integer.toString(EventNum), 20, 270);
		
	}
	
	public void keyPressed() {
		if(key == CODED) {
			if(keyCode == UP) {
				event++;
				heat = 1;
			}
			if(keyCode == DOWN) {
				event--;
				heat = 1;
			}
			if(keyCode == RIGHT) {
				heat++;
			}
			if(keyCode == LEFT) {
				heat--;
			}
			if(keyCode == CONTROL) {
				if(setEvent == 255) {
					setEvent = 0;
					check = true;
				} else {
					setEvent = 255;
					check = false;
				}
			}
		}
		if(check) {
			System.out.println("check = true");
			if(key == 's' || key == 'S') {
				System.out.println("s pressed");
				event = EventNum;
				EventNum = 0;
				heat = 1;
				check = false;
				setEvent = 255;
			}
		}
		if(check) {
			if (key == '0') {
				EventNum *= 10;
				EventNum += 0;
			} else if (key == '1') {
				EventNum *= 10;
				EventNum += 1;
			} else if (key == '2') {
				EventNum *= 10;
				EventNum += 2;
			} else if (key == '3') {
				EventNum *= 10;
				EventNum += 3;
			} else if (key == '4') {
				EventNum *= 10;
				EventNum += 4;
			} else if (key == '5') {
				EventNum *= 10;
				EventNum += 5;
			} else if (key == '6') {
				EventNum *= 10;
				EventNum += 6;
			} else if (key == '7') {
				EventNum *= 10;
				EventNum += 7;
			} else if (key == '8') {
				EventNum *= 10;
				EventNum += 8;
			} else if (key == '9') {
				EventNum *= 10;
				EventNum += 9;
			}
		}
	}
	
}
