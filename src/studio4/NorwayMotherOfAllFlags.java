package studio4;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import support.cse131.DialogBoxes;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class NorwayMotherOfAllFlags {
	private static void mother() {
		StdDraw.clear();
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(3, 3, 3, 3);
		StdDraw.filledRectangle(3, 13, 3, 3);
		StdDraw.filledRectangle(16, 3, 6, 3);
		StdDraw.filledRectangle(16, 13, 6, 3);
		StdDraw.setPenColor(0, 0, 127);
		StdDraw.filledRectangle(11, 8, 11, 1);
		StdDraw.filledRectangle(8, 8, 1, 8);
	}

	public static void norway() {
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		mother();
	}

	public static void france() {
		StdDraw.clear();
		StdDraw.setXscale(0, 24);
		StdDraw.setYscale(0, 16);
		StdDraw.setPenColor(25, 13, 186);
		StdDraw.filledRectangle(4, 8, 4, 8);
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledRectangle(12, 8, 4, 8);
		StdDraw.setPenColor(227, 23, 23);
		StdDraw.filledRectangle(20, 8, 4, 8);
	}

	public static void indonesia() {
		
		StdDraw.clear();
		StdDraw.setXscale(0, 24);
		StdDraw.setYscale(0, 16);
		StdDraw.setPenColor(255, 23, 23);
		StdDraw.filledRectangle(12, 12, 12, 4);
	}
	

	public static void netherlands() {
		
		StdDraw.clear();
		StdDraw.setXscale(0, 24);
		StdDraw.setYscale(0, 18);
		StdDraw.setPenColor(25, 13, 186);
		StdDraw.filledRectangle(12, 3, 12, 3);
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledRectangle(12, 9, 12, 3);
		StdDraw.setPenColor(227, 23, 23);
		StdDraw.filledRectangle(12, 15, 12, 3);
	}

	public static void poland() {
		
		StdDraw.clear();
		StdDraw.setXscale(0, 24);
		StdDraw.setYscale(0, 16);
		StdDraw.setPenColor(255, 23, 23);
		StdDraw.filledRectangle(12, 4, 12, 4);
	}

	public static void thailand() {
		
		StdDraw.clear();
		StdDraw.setXscale(0, 24);
		StdDraw.setYscale(0, 18);
		StdDraw.setPenColor(25, 13, 186);
		StdDraw.filledRectangle(12, 9, 12, 3);
		StdDraw.setPenColor(227, 23, 23);
		StdDraw.filledRectangle(12, 16.5, 12, 1.5);
		StdDraw.filledRectangle(12, 1.5, 12, 1.5);
	}

	public static void finland() {
		
		StdDraw.clear();
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		StdDraw.setPenColor(0, 0, 127);
		StdDraw.filledRectangle(11, 8, 11, 2.5);
		StdDraw.filledRectangle(8, 8, 2, 8);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			int canvasHeight = 512;
			int canvasWidth = 22 * canvasHeight / 16;
			StdDraw.setCanvasSize(canvasWidth, canvasHeight);
			Object[] options = { "Continue", "Exit" };
			while (true) {
				norway();
				if (DialogBoxes.askUser("Continue to Flag of France?", "Current: Norway", JOptionPane.QUESTION_MESSAGE,
						options)) {
					france();
					if (DialogBoxes.askUser("Continue to Flag of Indonesia?", "Current: France",
							JOptionPane.QUESTION_MESSAGE, options)) {
						indonesia();
						if (DialogBoxes.askUser("Continue to Flag of Netherlands?", "Current: Indonesia",
								JOptionPane.QUESTION_MESSAGE, options)) {
							netherlands();
							if (DialogBoxes.askUser("Continue to Flag of Poland?", "Current: Netherlands",
									JOptionPane.QUESTION_MESSAGE, options)) {
								poland();
								if (DialogBoxes.askUser("Continue to Flag of Thailand?", "Current: Poland",
										JOptionPane.QUESTION_MESSAGE, options)) {
									thailand();
									if (DialogBoxes.askUser("Continue to Flag of Finland?", "Current: Thailand",
											JOptionPane.QUESTION_MESSAGE, options)) {
										finland();
										if (DialogBoxes.askUser("Exit?", "Current: Finland")) {
											// pass
										} else {
											continue;
										}
									}
								}
							}
						}
					}
				}
				System.exit(0);
			}
		});
	}
}
