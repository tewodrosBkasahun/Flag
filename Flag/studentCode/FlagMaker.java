package studentCode;

import java.awt.Color;
import cmsc131_GridTools.MyGrid;

public class FlagMaker {

	/*
	 * This drawExample method provided colors the grid for a flag (one that is not
	 * the flag of any country - not any I know of anyway). The code provided here
	 * is also not a correct error flag - it is just provided to help you see how
	 * you can color in the flag you are given by the driver.
	 */
	private static void drawExample(MyGrid grid) {
		grid.setColor(0, 0, Color.BLUE);
		grid.setColor(0, grid.getWd() - 1, Color.BLUE);

		grid.setColor(1, 1, Color.RED);
		grid.setColor(1, grid.getWd() - 2, Color.RED);

		grid.setColor(grid.getHt() - 1, 0, Color.GREEN);
		grid.setColor(grid.getHt() - 1, grid.getWd() - 1, Color.GREEN);

		grid.setColor(grid.getHt() - 2, 1, Color.YELLOW);
		grid.setColor(grid.getHt() - 2, grid.getWd() - 2, Color.YELLOW);
	}

	/*
	 * The following helper method is provided as an example of the ones that you
	 * will be writing. This one specifically draws the star that is needed by the
	 * flags of Somalia and Vietnam and Senegal.
	 * 
	 * For starters, just use it. However, later in your project work tracing this
	 * code to see how it works might be very useful before attempting to write your
	 * own code for anything involving diagonal lines.
	 */
	private static void helperCenterStar(MyGrid grid, Color theColor) {
		int middleX = grid.getWd() / 2;
		int middleY = grid.getHt() / 2;

		// Do the left side of things
		for (int radius = 0; radius < middleY - 3; radius++) {
			// The left leg
			grid.setColor(middleY + radius, middleX - radius - 1, theColor);
			grid.setColor(middleY + radius, middleX - radius, theColor);

			// The right leg
			grid.setColor(middleY + radius, middleX + radius - 1, theColor);
			grid.setColor(middleY + radius, middleX + radius, theColor);

			// The arms
			grid.setColor(middleY, middleX + radius, theColor);
			grid.setColor(middleY, middleX - radius - 1, theColor);

			// The head
			grid.setColor(middleY - radius, middleX - 1, theColor);
			grid.setColor(middleY - radius, middleX, theColor);
		}
	}

	/*
	 * As you start the project, you'll need to implement the following helper
	 * method. It needs to set the color of every position in the grid to the color
	 * passed in as the parameter.
	 */
	private static void helperSolid(MyGrid grid, Color theColor) {
		// You'll need to add code here...
		int ht = grid.getHt();
		int wd = grid.getWd();
		int row = 0;
		int column = 0;

		for (int r = 0; r < ht; r++) {
			column = 0;
			for (int c = 0; c < wd; c++) {
				grid.setColor(row, column, theColor);
				column++;
			}
			row++;
		}

	}

	private static void drawTwoColorFlag(MyGrid grid, Color topcolor, Color loweColor) {
		int ht = grid.getHt();
		int wd = grid.getWd();
		int row = 0;
		int column = 0;
		// To create the and color the top of the flag.

		for (int r = 0; r < ht / 2; r++) {
			column = 0;
			for (int c = 0; c < wd; c++) {
				grid.setColor(row, column, topcolor);
				column++;
			}
			row++;
		}
		// To color the rest of the flag white.

		for (int r = 0; r < ht / 2; r++) {
			column = 0;
			for (int c = 0; c < wd; c++) {
				grid.setColor(row, column, loweColor);
				column++;
			}
			row++;
		}

	}

	private static void drawThreeColorFlag(MyGrid grid, Color topcolor, Color middleColor, Color lowerColor) {
		int ht = grid.getHt();
		int wd = grid.getWd();
		int row = 0;
		int column = 0;
		// To create the first 1/3 of the given height and color it.
		for (int r = 0; r < (ht / 3); r++) {
			column = 0;
			for (int c = 0; c < wd; c++) {
				grid.setColor(row, column, topcolor);
				column++;
			}
			row++;
		}
		// To create the second 1/3 of the given height and color it.
		for (int r = 0; r < (ht / 3); r++) {
			column = 0;
			for (int c = 0; c < wd; c++) {
				grid.setColor(row, column, middleColor);
				column++;
			}
			row++;
		}
		// To create the last 1/3 of the given height and color it.
		for (int r = 0; r < (ht / 3); r++) {
			column = 0;
			for (int c = 0; c < wd; c++) {
				grid.setColor(row, column, lowerColor);
				column++;
			}
			row++;
		}

	}

	private static void drawThreeForVerticalColorFlag(MyGrid grid, Color topcolor, Color middleColor,
			Color lowerColor) {
		int ht = grid.getHt();
		int wd = grid.getWd();
		int row = 0;
		int column = 0;
		// To create the first 1/3 of the given height and color it, VERTICALLY.
		for (int r = 0; r < (ht); r++) {
			column = 0;
			for (int c = 0; c < wd / 3; c++) {
				grid.setColor(row, column, topcolor);
				column++;
			}
			row++;
		}
		// To create the Second 1/3 of the given height and color it, VERTICALLY.
		row = 0;
		for (int r = 0; r < (ht); r++) {
			column = wd / 3;

			for (int c = 0; c < wd / 3; c++) {
				grid.setColor(row, column, middleColor);
				column++;
			}
			row++;
		}
		// To create the last 1/3 of the given height and color it, VERTICALLY.
		row = 0;
		for (int r = 0; r < (ht); r++) {
			column = (wd / 3) + (wd / 3);
			for (int c = 0; c < wd / 3; c++) {
				grid.setColor(row, column, lowerColor);
				column++;
			}
			row++;
		}
	}

	private static void toDrawTheMacedoniaInnerSymbol(MyGrid grid, Color theColor) {
		int ht = grid.getHt();
		int wd = grid.getWd();
		int row = 0;
		int column = 0;
		// It will draw the horizontal line in the middle raw
		for (int c = 0; c < wd; c++) {
			row = (ht / 2);
			grid.setColor(row, column, theColor);
			column++;
		}
		// It will draw the middle two column.
		row = 0;
		column = 0;

		for (int r = 0; r < ht; r++) {
			column = ht - 1;
			for (int c = ht; c <= (ht + 1); c++) {

				grid.setColor(row, column, theColor);
				column++;
			}
			row++;

		}
		// To draw the diagonal going from left to right
		row = 0;
		column = 0;
		for (int r = 0; r < ht; r++) {
			for (int c = 0; c < 2; c++) {
				grid.setColor(row, column, theColor);
				column++;
			}
			row++;
		}
		// To draw the diagonal going from right to left
		row = 0;
		column = wd - 1;
		for (int r = 0; r < ht; r++) {
			for (int c = 0; c < 2; c++) {
				grid.setColor(row, column, theColor);
				column--;
			}
			row++;
		}

	}

	private static void toDrawTheTwoTrianglesForBahamas(MyGrid grid, Color theColor) {
		int ht = grid.getHt();
		int wd = grid.getWd();
		int row = 0;
		int column = 0;
		// To draw the top triangle.
		row = 0;
		column = 0;
		// If height is even the top triangle use the following code.
		if (ht % 2 == 0) {
			for (int r = 0; r < (ht / 2); r++) {
				for (int c = 0; c <= r; c++) {
					if (c <= r)

						grid.setColor(row, column, theColor);
					column++;
				}
				row++;
				column = 0;
			}
			// If height is even the bottom triangle use the following code.
			row = (ht / 2);
			column = 0;
			for (int r = 0; r < (ht / 2); r++) {

				for (int l = 0; l < ((ht / 2) - r); l++) {
					grid.setColor(row, column, theColor);
					column++;
				}
				row++;
				column = 0;
			}

		}
		// If the height is odd the top triangle use the following code.
		if (ht % 2 == 1) {
			row = 0;
			column = 0;
			for (int r = 0; r < ((ht / 2) + (ht % 2)); r++) {
				for (int y = 0; y <= r; y++) {
					grid.setColor(row, column, theColor);
					column++;
				}
				row++;
				column = 0;
			}
			// If the height is odd the bottom triangle use the following code.
			row = ((ht / 2) + (ht % 2));
			for (int r = 0; r < (ht - ((ht / 2) + 1)); r++) {
				for (int c = 0; c < (ht - ((ht / 2) + 1)) - r; c++) {
					grid.setColor(row, column, theColor);
					column++;
				}
				row++;
				column = 0;
			}
		}

	}

	private static void drawTheErrorFlag(MyGrid grid, Color color) {
		int ht = grid.getHt();
		int wd = grid.getWd();
		int row = 0;
		int column = 0;
		helperSolid(grid, Color.WHITE);
		row = 0;
		column = 0;
		grid.setColor(row, column, color);
		row = ht - 1;
		column = 0;
		grid.setColor(row, column, color);
		row = 0;
		column = wd - 1;
		grid.setColor(row, column, color);
		row = ht - 1;
		column = wd - 1;
		grid.setColor(row, column, color);
	}

	/*
	 * This is an example of what the draw method for a particular flag will tend to
	 * look like. For this example to work, you need to implement the body of the
	 * helperSolid method above.
	 */
	private static void drawSomalia(MyGrid grid) {
		helperSolid(grid, Color.BLUE);
		helperCenterStar(grid, Color.WHITE);
	}

	private static void drawVietnam(MyGrid grid) {
		helperSolid(grid, Color.RED);
		helperCenterStar(grid, Color.YELLOW);
	}

	private static void drawIndonesia(MyGrid grid) {
		drawTwoColorFlag(grid, Color.RED, Color.WHITE);
	}

	private static void drawPoland(MyGrid grid) {
		drawTwoColorFlag(grid, Color.WHITE, Color.RED);
	}

	private static void drawEstoniva(MyGrid grid) {
		drawThreeColorFlag(grid, Color.BLUE, Color.BLACK, Color.WHITE);
	}

	private static void drawBolivia(MyGrid grid) {
		drawThreeColorFlag(grid, Color.RED, Color.YELLOW, Color.GREEN);
	}

	private static void drawFrance(MyGrid grid) {
		drawThreeForVerticalColorFlag(grid, Color.BLUE, Color.WHITE, Color.RED);
	}

	private static void drawSenegal(MyGrid grid) {
		drawThreeForVerticalColorFlag(grid, Color.GREEN, Color.YELLOW, Color.RED);
		helperCenterStar(grid, Color.GREEN);
	}

	private static void drawBahamas(MyGrid grid) {
		drawThreeColorFlag(grid, Color.CYAN, Color.YELLOW, Color.CYAN);
		toDrawTheTwoTrianglesForBahamas(grid, Color.BLACK);
	}

	private static void drawMacedonia(MyGrid grid) {
		helperSolid(grid, Color.RED);
		toDrawTheMacedoniaInnerSymbol(grid, Color.YELLOW);
	}

	private static void drawError(MyGrid grid) {
		drawTheErrorFlag(grid, Color.RED);
	}

	/*
	 * The skeleton given here just calls an example flag to be put into the grid
	 * passed as the first parameter. (note: In its current form it is ignoring the
	 * second parameter.)
	 * 
	 * You need to modify this method so that the correct flag (the one that
	 * corresponds to the country code passed as the second parameter) is colored
	 * correctly in the grid passed in as the first parameter. Note: you can assume
	 * the grid is already created an waiting for you to put the correct colors into
	 * the correct squares. You can also assume that the method that calls the one
	 * you are writing here will take care of actually displaying the flag - you do
	 * not need to do anything about that.
	 */
	public static void drawFlag(MyGrid grid, int countryCode) {
		if (countryCode == 1 && grid.getHt() % 2 == 1 && grid.getHt() >= 99) {
			drawSomalia(grid);
		}

		else if (countryCode == 2 && grid.getHt() % 2 == 1 && grid.getHt() >= 9) {
			drawVietnam(grid);
		} else if (countryCode == 3 && grid.getHt() % 2 == 0) {
			drawIndonesia(grid);
		} else if (countryCode == 4 && grid.getHt() % 2 == 0) {
			drawPoland(grid);
		} else if (countryCode == 5 && grid.getHt() % 3 == 0) {
			drawEstoniva(grid);
		} else if (countryCode == 6 && grid.getHt() % 3 == 0) {
			drawBolivia(grid);
		} else if (countryCode == 7 && grid.getHt() % 3 == 0) {
			drawFrance(grid);
		} else if (countryCode == 8 && grid.getHt() % 2 == 1 && grid.getHt() % 3 == 0 && grid.getHt() >= 9) {
			drawSenegal(grid);
		} else if (countryCode == 9 && grid.getHt() % 3 == 0) {
			drawBahamas(grid);
		} else if (countryCode == 10 && grid.getHt() % 2 == 1 && grid.getHt() >= 8) {
			drawMacedonia(grid);
		} else {
			drawError(grid);
		}
	}
}
