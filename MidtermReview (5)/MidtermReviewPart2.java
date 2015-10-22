import java.util.Scanner;
import javax.swing.JOptionPane;
public class MidtermReviewPart2 {

	public static void main(String[] args) {
		
		
		//Conditional
		
		int i=0;
		String response1=null;
		String response2=null;
		do{
		int random = 1 + (int)(Math.random()*100);
		if (random <50){
			response1 = "The number is less than 50. ";
		}
		response2= response1 + "The number is "+ random+ ".";
		JOptionPane.showMessageDialog(null,response2);
		i++;
		}while (i<3);
	}

}
