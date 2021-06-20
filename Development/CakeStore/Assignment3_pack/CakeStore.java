/*
 * Class Name:    CakeStore
 *
 * Student Number:        Write your student number here
 * 
 * Class Description:       Describe your class here
 *
 */

 import java.util.*;
 import java.io.*;
 
 
public class CakeStore
{
	//Do not edit attributes
   private Scanner keyboard;
   private DeliveryVehicle deliveryVehicle;
   private int totalEggs;
   private int totalSugarGrams;
   private int totalFlourGrams;
   private int totalMilkMilliLitres;
   private Cake cake1;
   private Cake cake2;
   private Cake cake3;

	//Only edit name and student number in this method
   public static void main(String[] args) throws IOException
   {
      CakeStore cakeStore = new CakeStore();
      System.out.println("***Name StudentNumber***");
      System.out.println("***   Cake Store   ***");
      cakeStore.run();
   }

   //Do not edit this method
   public CakeStore()
   {
      keyboard = new Scanner(System.in);
      deliveryVehicle = null;
	  totalEggs = 0;
      totalSugarGrams = 0;
      totalFlourGrams = 0;
      totalMilkMilliLitres = 0;
      cake1 = null;
      cake2 = null;
      cake3 = null;
   }

   //Do not edit this method
   public void run() throws IOException
   {
      if(loadCakesFromFile())
      {
         int choice = -1;
         while(choice != 0)
         {
            displayMenu();
            System.out.print("Enter choice >> ");
            choice = keyboard.nextInt();
            System.out.println();
            keyboard.nextLine();
            process( choice );
         }
      }
      else
      {
         System.out.println("Cakes could not be loaded from file");
      }
   }

   //Do not edit this method
   private boolean loadCakesFromFile() throws IOException
   {
	   boolean fileExists = false;
	   System.out.print("Enter name of cake file: ");
	   File cakeFile = new File(keyboard.nextLine());
	   
	   if(cakeFile.exists())
	   {
		   fileExists=true;
		   Scanner cakeFileScanner = new Scanner(cakeFile);
		   for(int i = 0; i < 3; i ++)
		   {
				String cakeName = cakeFileScanner.nextLine();
				int cakeEggs =  cakeFileScanner.nextInt();
			    int cakeSugarGrams =  cakeFileScanner.nextInt();
				int cakeFlourGrams =  cakeFileScanner.nextInt();
				int cakeMilkMilliLitres =  cakeFileScanner.nextInt();
				cakeFileScanner.nextLine();
				
				if(i==0)
				{
					cake1 = new Cake(cakeName, cakeEggs, cakeSugarGrams, cakeFlourGrams, cakeMilkMilliLitres);
				}
				else if(i==1)
				{
					cake2 = new Cake(cakeName, cakeEggs, cakeSugarGrams, cakeFlourGrams, cakeMilkMilliLitres);
				}
				else
				{
					cake3 = new Cake(cakeName, cakeEggs, cakeSugarGrams, cakeFlourGrams, cakeMilkMilliLitres);
				}
		   }
	   }
	   return(fileExists);
   }

   //Do not edit this method
	private void displayMenu()
	{
		System.out.println();
		System.out.println("~~~ CAKE MENU ~~~");
		System.out.println("1. Add Order");
		System.out.println("2. Dispatch Vehicle");
		System.out.println("3. Add Delivery Vehicle");
		System.out.println("4. Add Delivery Driver to Vehicle");
		System.out.println("5. Order Stock");
		System.out.println("6. Display Stock");
		System.out.println("7. Display Cakes");
		System.out.println("8. Display Delivery Vehicle");
		System.out.println("9. Display Total Number of Orders");
		System.out.println("0. Quit");
	}
	
	//Do not edit this method
	private void process(int choice)
	{
		if(choice == 1)
		{
			addOrder();
		}
		else if(choice == 2)
		{
			dispatchVehicle();
		}
		else if(choice == 3)
		{
			addDeliveryVehicle();
		}
		else if(choice == 4)
		{
			addDeliveryDriverToVehicle();
		}
		else if(choice == 5)
		{
			orderStock();
		}
		else if(choice == 6)
		{
			displayStock();
		}
		else if(choice == 7)
		{
			displayCakes();
		}
		else if(choice == 8)
		{
			displayDeliveryVehicle();
		}
		else if(choice == 9)
		{
			displayTotalNumberOfOrders();
		}
	}
	
	private void addOrder()
	{
		
	}
	
	private void printCakeMenu()
	{
		
	}
	
	private void dispatchVehicle()
	{
		
	}
	
	private void addDeliveryVehicle()
	{
		
	}		
	
	private void addDeliveryDriverToVehicle()
	{
		
	}		
	
	private void orderStock()
	{
		
	}
	
	private void displayStock()
	{
		
	}
	
	private void displayCakes()
	{
		
	}
	
	private void displayDeliveryVehicle()
	{
		
	}
	
	private void displayTotalNumberOfOrders()
	{
		
	}
}