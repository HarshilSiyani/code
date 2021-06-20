
public class DeliveryVehicleTester
{
   public static void main(String[] args)
   {
		  Driver testDriver = new Driver("Matt");
		  Cake testCake1 = new Cake("Birthday Cake", 2, 40, 30, 20);
		  Order testOrder = new Order("23 Fake St", testCake1);
		  
		  DeliveryVehicle testVehicle = new DeliveryVehicle(45);
		  
		  
		  System.out.println("\nTest hasDriver()");
		  System.out.println("Expected: false, Actual: " + testVehicle.hasDriver());
		  
		  testVehicle.setDriver(testDriver);
		  
		  System.out.println("\nTest setDriver(), hasDriver()");
		  System.out.println("Expected: true, Actual: " + testVehicle.hasDriver());
		  
		  System.out.println("\nTest getVehicleID()");
		  System.out.println("Expected: 45, Actual: " + testVehicle.getVehicleID());
		  
		  System.out.println("\nTest getNumOrdersDelievered()");
		  System.out.println("Expected: 0, Actual: " + testVehicle.getNumOrdersDelievered());
		  
		  System.out.println("\nTest getNumOrdersOnBoard()");
		  System.out.println("Expected: 0, Actual: " + testVehicle.getNumOrdersOnBoard());
		  
		  testVehicle.addOrder(testOrder);
		  System.out.println("\nTest addOrder(testOrder),  getNumOrdersOnBoard()");
		  System.out.println("Expected: 1, Actual: " + testVehicle.getNumOrdersOnBoard());
		  
		  System.out.println("\nTest makeDelivery()");
		  System.out.println("Expected: ");
		  System.out.println("DeliveryVehicle[ vehicleID: 45\n" +
										", driver: Driver[ driverName: Matt ]\n" +
										", order1: Order[ orderNumber: 1, orderAddress: 23 Fake St, numberOfCakes: 1,\n" +
										"cake: Cake[ name: Birthday Cake, eggs: 2, sugarGrams: 40, mulkMilliLitres: 20 ] ]\n" +
										", order2: No Order\n" +
										", order3: No Order\n" +
										", numOrdersDelivered: 0 ]");
		  System.out.println("Actual:");
		  System.out.println(testVehicle.makeDelivery());
		  
		  System.out.println("\nTest getNumOrdersOnBoard()");
		  System.out.println("Expected: 0, Actual: " + testVehicle.getNumOrdersOnBoard());
		  
		  System.out.println("\nTest getNumOrdersDelievered()");
		  System.out.println("Expected: 1, Actual: " + testVehicle.getNumOrdersDelievered());
		  
		  System.out.println("\nTest toString()");
		  System.out.println("Expected: ");
		  System.out.println("DeliveryVehicle[ vehicleID: 45\n" +
										", driver: Driver[ driverName: Matt ]\n" +
										", order1: No Order\n" +
										", order2: No Order\n" +
										", order3: No Order\n" +
										", numOrdersDelivered: 1 ]");
		  System.out.println("Actual:");
		  System.out.println(testVehicle.toString());
		  
   }
}