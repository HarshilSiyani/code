public class OrderTester
{
   public static void main(String[] args)
   {
      final String RESET = "\u001B[0m";
      final String RED = "\u001B[31m";
      final String YELLOW = "\u001B[44m";
      final String GREEN = "\u001B[32m";

      final int NUM_OF_CAKES = 3;
      Cake cakes[] = new Cake[NUM_OF_CAKES];
      cakes[0] = new Cake("Chocolate Cake", 1, 50, 45, 100);
      cakes[1] = new Cake("Vanilla Cake", 2, 30, 30, 100);
      cakes[2] = new Cake("Memory Cake", 2,3,4,5);
     // Cake testCake = new Cake[10];
      Order testOrder = new Order("41 Flinders Lane", cakes, NUM_OF_CAKES);

      System.out.println(YELLOW+ "\nTesting: getOrderNumber()"+RESET+"\n");
      System.out.println(RED+ "Expected: 1"+GREEN+"\nActual: " + testOrder.getOrderNumber()+ RESET);

      System.out.println(YELLOW+"\nTesting: getOrderAddress()"+RESET+"\n");
      System.out.println(RED+"Expected: 41 Flinder Lane"+GREEN+"\nActual: "+ testOrder.getOrderAddress()+RESET);

      System.out.println(YELLOW+"\nTesting: getNumberOfCakes()"+RESET+"\n");
      System.out.println(RED+"Expected: 1"+GREEN+"\nActual: "+ testOrder.getNumberOfCakes()+RESET);

      System.out.println(YELLOW+"\nTesting: getTotalNumOfOrder()"+RESET+"\n");
      System.out.println(RED+"Expected: 1"+GREEN+"\nActual: "+ testOrder.getTotalNumOfOrders()+RESET);

      System.out.println(YELLOW+"\nTesting: getCake()"+RESET+"\n");
      System.out.println(RED+"Expected: \n"
      +"Cake[ name: Chocolate Cake, eggs: 1, sugarGrams: 50, flourGrams: 45, milkMilliLitres: 100 ]");
      System.out.println(GREEN+"Actual: ");
      for(int i = 0; i<testOrder.getNumberOfCakes(); i++)
      {
         System.out.println(GREEN+testOrder.getCakes()[i].toString()+RESET);
      }


      System.out.println(YELLOW+"\nTesting: toString()"+RESET+"\n");
      System.out.println(RED+"Expected: Order:"
      +"Order Number: 1, \n"
      +"Order Address: 41 Flinders Lane, \n"
      +"Number of cakes: 1, \n"
      +"Cake: Cake[ name: Chocolate Cake, eggs: 1, sugarGrams: 50, flourGrams: 45, milkMilliLitres: 100 ]");
      System.out.println(GREEN +"Actual: " +testOrder.toString()+RESET);

     /* Cake[] cakesMemLeakTest = testOrder.getCakes();
      cakesMemLeakTest[0] = null;
      cakesMemLeakTest[1] = cakesMemLeakTest[2];
      System.out.println("Mem leak test");
      for(int i = 0; i<testOrder.getNumberOfCakes(); i++)
      {
         System.out.println(GREEN+testOrder.getCakes()[i].toString()+RESET);
      }
*/
  }
}
