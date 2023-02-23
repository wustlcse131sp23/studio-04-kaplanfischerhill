package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {

		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledRectangle(0.5,0.5,0.35,0.2);
		Color cyan = new Color(70, 242, 222);
		StdDraw.setPenColor(cyan);
		StdDraw.filledCircle(0.5,0.5, 0.1);
		StdDraw.setPenRadius(.02);
		StdDraw.line(0.15,.3,.85,.7);
		StdDraw.line(0.15, 0.7, 0.85, 0.3);
		StdDraw.setPenRadius(.02);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.rectangle(0.5, 0.5, 0.35, 0.2);
		Color shade = new Color(242, 216, 70);
		StdDraw.setPenColor(shade);
		StdDraw.filledCircle(0.5,0.5,.08);
	}
}