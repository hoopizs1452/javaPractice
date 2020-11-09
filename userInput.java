import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("請輸入姓名，年齡，薪資:");
		
		String name = userInput.nextLine();
		int age = userInput.nextInt();
		double money = userInput.nextDouble();
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + money);
	}

}
