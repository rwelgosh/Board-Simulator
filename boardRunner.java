import processing.core.PApplet;

public class boardRunner extends PApplet {
	private int event, heat;
	
	public static void main(String[] args) {
		PApplet.main("boardRunner");
	}
	
	public void settings() {
		size(570, 300);
		event = heat = 1;
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
		
		//Stuff underneath
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
		}
		System.out.println(event + " " + heat);
	}
	
}
