/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 How many times do you expect the loop to repeat? Remember that 
 “zero,” “infinity,” and “unknown” are legal answers.
 
 What do you expect the loop to output?
 
 (a)
 Repeats:9
 Expected output:91
 (b)
 Repeats:0
 Expected output:0
 (c)
 Repeats:infinite 
 Expected output:250
 (d)
 Repeats:0
 Expected output:0
   
 */

/*
 Was your prediction correct?
 
 (a)Correct
 (b)Correct
 (c)Correct
 (d)Correct

*/
public class P1_LoopPredictions {

	public static void main(String[] args) {
		System.out.println("STARTING LOOP TEST");
		int x = 1;
		while(x < 100) {
			System.out.print(x + "");
			x += 10;
			
		}
		int max = 10;
		while(max < 10) {
			System.out.println("count down); " + max);
			max--;
			
		}
		int y = 250;
		while(y % 3 != 0) {
			System.out.println(y);
		}
		String word = "a";
		while(word.length()<10) {
			word= "b"+ word + "b";
		}
		System.out.println(word);
		

		// copy and paste the loop to test between here, between the println statements
		
				
		System.out.println("ENDING LOOP TEST");
	}

}
