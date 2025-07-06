/* Last modified: 2022-09-23 */

import java.util.concurrent.TimeUnit;

public class xdaspot {

	public static void main(String[] args) throws InterruptedException {
		while (true) {
			for (int y = 0; y < 10; y++) {
				for (int x = 0; x < 10; x++) {
					TimeUnit.MILLISECONDS.sleep(5);
					if (x == y) {
						System.out.print("     ");
					} else if (x + y == 9) {
						System.out.print("     ");
					} else {
						System.out.print("(" + x + "," + y + ")");
					}

				}
				System.out.println();
			}
		}

	}

}