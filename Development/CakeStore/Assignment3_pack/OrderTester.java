

public class OrderTester
{
   public static void main(String[] args)
   {
		  Cake testCake1 = new Cake("Birthday Cake", 2, 40, 30, 20);
  		  
		  Order testOrder = new Order("23 Fake St", testCake1);
		  
		  System.out.println("\nTest getOrderNumber()");
		  System.out.println("Expected: 1, Actual: " + testOrder.getOrderNumber());
		  
		  System.out.println("\nTest getOrderAddress()");
		  System.out.println("Expected: 23 Fake St, Actual: " + testOrder.getOrderAddress());
		  
		  System.out.println("\nTest getNumberOfCakes()");
		  System.out.println("Expected: 1, Actual: " + testOrder.getNumberOfCakes());
		  
		  System.out.println("\nTest getTotalNumOfOrders()");
		  System.out.println("Expected: 1, Actual: " + testOrder.getTotalNumOfOrders());
		  System.out.println("Expected: 1, Actual: " + Order.getTotalNumOfOrders());
		  
		  System.out.println("\nTest getCake()");
		  System.out.println("Expected: ");
		  System.out.println("Cake[ name: Birthday Cake, eggs: 2, sugarGrams: 40, mulkMilliLitres: 20 ]");
		  System.out.println("Actual:");
		  System.out.println(testOrder.getCake());
		  
		  System.out.println("\nTest toString()");
		  System.out.println("Expected: ");
		  System.out.println("Order[ orderNumber: 1, orderAddress: 23 Fake St, numberOfCakes: 1,\n"
			+ "cake: Cake[ name: Birthday Cake, eggs: 2, sugarGrams: 40, mulkMilliLitres: 20 ] ]");
		  System.out.println("Actual:");
		  System.out.println(testOrder.toString());
   }
}

