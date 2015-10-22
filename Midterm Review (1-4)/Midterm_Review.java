import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.JFrame;

public class Midterm_Review {

	public static void main(String[] args) {
		
		String x = "Brian";
		
		System.out.println("My name is " + x);
		
		System.out.println("Hello");
		
		JOptionPane.showMessageDialog(null, "Hello");
		
		JOptionPane.showMessageDialog(null, "Hello " + x);
		
		System.out.printf("My name is %s and I am %d old. \n", "Brian", 21);
		
		JOptionPane.showMessageDialog(null, String.format
				("Hello my name is %s and I am %d old. I owe my friend %s 3$." , "Brian", 21, "Donny"));
		
		JOptionPane.showMessageDialog(null, String.format("Hello " + x ));
		
		Scanner input = new Scanner(System.in);
		
		String response = "Brian";
		
		String myChoice = JOptionPane.showInputDialog(response);
		
		JFrame frame = new JFrame();
		
		Object result = JOptionPane.showInputDialog(frame, "What is your name?" );
		
		System.out.println("Your name is: " + result);
		
		int num1,num;
		num1 = 1 + (int)(Math.random() * 100);
		System.out.println(num1);
		
		JOptionPane.showMessageDialog(null, "Here's a random number " + num1);
		
		int i = 0;
		while(i < 3)
		{
			num = 1 + (int)(Math.random() * 100);
			System.out.println(num);
			i+=1;
			if (num > 50)
			{
				System.out.println("Your number is less than 50");
			}
			else
			{
				System.out.println("Your number is over 50");
			}
			if (num > 10)
			{
				System.out.println("Your number is less than 10");
			}
			else 
			{
				System.out.println("Your number is over 10 you dwight");
			}
			
		}
		
		
		for (int v=0; v<3; v++)
		{
			num = 1 + (int)(Math.random() * 100);
			System.out.println(num);
			i+=1;
			
		}
		
		int b=0;
		do 
		{
			num = 1 + (int)(Math.random() * 100);
			System.out.println(num);
			i+=1;
		}
		while(b<3);
		
		
	}

}
