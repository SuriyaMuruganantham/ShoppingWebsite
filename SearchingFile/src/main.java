import java.io.IOException;
import java.util.Scanner;

public class main extends search {
	public static void main(String[] args) throws IOException
	{
		System.out.println("***************************************************************\n");
		System.out.println("***Welcome to File Searching***\n");
		System.out.println("***************************************************************\n");
		System.out.println("Instructions:-");
		System.out.println("Please ensure that the string has been given for searching\n");
		menu();
	}
		static void menu() throws IOException
		{
			
			Scanner sc = new Scanner(System.in);
			int ch;
		while(true)
		{
			System.out.println("**Main Menu**\n");
			System.out.println("Choose the options to be performed\n");
			System.out.println("1.Compare two files");
			System.out.println("2.Search string in a file");
			System.out.println("3.Close the application");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				compare();
			break;
			case 2:
				System.out.println("**Search operations**\n");
				int choice;
               
				while(true)
				{
					System.out.println("1.Regular expression");
					System.out.println("2.Brute Force");
					System.out.println("3.Hash map");
					System.out.println("4.Go back to the main menu");	
					choice= sc.nextInt();
				
				if(choice==1)
				regexp();
				else if(choice==2)
				brute();
				else if(choice==3)
				binarySearch();
				else if(choice==4)
				menu();
				}
					
			
			case 3:
				System.out.println("****Thank you****");
				System.exit(0);
			}
		}
      	}
	
}

