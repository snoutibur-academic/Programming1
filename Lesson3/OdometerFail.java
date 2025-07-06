/* Last modified: 2022-09-27 */

import java.util.concurrent.TimeUnit;

public class OdometerFail {

	public static void main(String[] args) throws InterruptedException {
		int sec = 0;
		int sec2 = 0;
		int loopcount = 0;
		
		
		while(true) {
			while(true) {
				sec = sec + 1;
				TimeUnit.SECONDS.sleep(1);
				System.out.println(sec + " seconds have passed!");
			}
				
			// while(true) {
				// sec2 = sec2 + 1;
				// TimeUnit.MILLISECONDS.sleep(1);
				// System.out.println(sec2 + "  have passed!");
			}
			
			/// while(true) { 
				/// loopcount = loopcount+1;
				/// System.out.println("This has looped " + loopcount + " times!");
			}
		}
	


