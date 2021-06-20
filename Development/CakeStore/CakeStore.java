t java.util.*;
 import java.io.*;


public class CakeStore
{

   private Scanner keyboard;
   private DeliveryVehicle deliveryVehicle;
   private int totalEggs;
   private int totalSugarGrams;
   private int totalFlourGrams;
   private int totalMilkMilliLitres;
   private Cake[] cakes;
   private int numOfCakes;


   public static void main(String[] args) throws IOException
   {
      CakeStore cakeStore = new CakeStore();
      System.out.println("***Name StudentNumber***");
      System.out.println("***   Cake Store   ***");
      cakeStore.run();
   }

   public CakeStore()
   {
      keyboard = new Scanner(System.in);
      deliveryVehicle = null;
     totalEggs = 0;
      totalSugarGrams = 0;
      totalFlourGrams = 0;
      totalMilkMilliLitres = 0;
   }

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

   private boolean loadCakesFromFile() throws IOException
   {
      boolean fileExists = false;
      System.out.print("Enter name of cake file: ");
      String filename = keyboard.nextLine();

      File fileName = new File(filename);
      Scanner cakeFile = new Scanner(fileName);
      if(cakeFile.exists())
      {
         int numOfCakes = cakeFile.nextLine();
         Cake cake[] = new cake[numOfCakes];

         for(int i = 0; i<numOfCakes; i++)
         {
         String cakeName = cakeFile.nextLine();
         int numOfEggs = cakeFile.nextInt();
         int sugarGrams = cakeFile.nextInt();
         int flourGrams = cakeFile.nextInt();
         int milkMilliLitres = cakeFile.nextInt();

            cake[i] = new cake (cakeName, numOfEggs, sugarGrams, flourGrams, milkMilliLitres);
      }
      }

      return(fileExists);
   }

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
      System.out.println("7. Display Cakes from Order");
      System.out.println("8. Display Delivery Vehicle");
      System.out.println("9. Display Total Number of Orders");
      System.out.println("0. Quit");
   }


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
         displayCakesFromOrder();
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
      if(deliveryVehicle == null)
      {
         System.out.println("No Delivery Vehicle");
      }
      else if(deliveryVehicle.getNumOrdersOnBoard() == 3)
      {
         System.out.println("Delivery Vehicle already full");
      }
      else
      {
         getNumOfOrders =0;
         Cake[] cakes = new Cake[MAX_NUM_OF_CAKES];

         do{
            printCakeMenu();
      System.out.println(" Enter the cake number: ");
      int cakeId = keyboard.nextInt();

      if((cakeId > 3) || (cakeId < 1))
      {
         System.out.println("Please enter a valid choice");
      } else {
         Cake seletectedCake;
         if (cakeId == 1)
         {
            seletectedCake = cake1;
         }
         else if (cakeId == 2)
         {
            seletectedCake = cake2;
         }
         else if (cakeId == 3)
         {
            seletectedCake = cake3;
         }
         else
            seletectedCake = null;
         }
         }
         while(numOfOrders< maxNumOfOrders);

         // Ingredients
         // limitation
         if
            (((totalEggs - seletectedCake.getEggs())<0)||((totalSugarGrams - seletectedCake.getSugarGrams())<0))
            {
               System.out.println("Notenough ingredients");
            }

      else
      {
         totalEggs =totalEggs-selectedCake.getEggs;
         totalSugarGrams=totalSugarGrams-selectedCake.getSugarGrams;

         System.out.println("Enter your address");
         String address = keyboard.nextLine();
      }
      }
   }

   private void printCakeMenu()
   {

      System.out.println();

      System.out.println("Cake 1: "+ cake1.getName());
      System.out.println("Cake 2: "+ cake2.getName());
      System.out.println("Cake 3: "+ cake3.getName());


   }

   private void dispatchVehicle()
   {
      if(driver != null && numOfOrdersOnBoards != 0)
      {
         makeDelivery();
      }
      else
      {
         System.out.println("Vehicle cannot dispatch");
      }
   }

   private void addDeliveryVehicle()
   {
      if(deliveryVehicle != null)
      {
         System.out.println("Vehicle is already added");
      }
      else
      {
         System.out.println("Enter Vehicle ID: ");
         int vehicleID = keyboard.nextInt();

         System.out.println("Enter Store: ");
         String store = keyboard.nextLine();
        }

   }

   private void addDeliveryDriverToVehicle()
   {

   }

   private void orderStock()
   {
      return(displayStock);
      System.out.println("Enter the ingredient you want to order: ");
      String ingredrientOrder = keyboard.nextLine();
      System.out.println("Enter the quantity to order:");
      int quantityOrder = keyboard.nextInt();


   }

   private void displayStock()
   {
      return(totalEggs);
      return(totalSugarGrams);
      return(totalFlourGrams);
      return(totalMilkMilliLitres);
   }

   private void displayCakesFromOrder()
   {
      System.out.println("Enter order number to display: ");
      int num = keyboard.nextInt();
      return(cakes[num]);

   }

   private void displayDeliveryVehicle()
   {
      return(getVehicleID);

   }

   private void displayTotalNumberOfOrders()
   {
      return(getTotalNumberOfOrders);
   }
}
~                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
~                