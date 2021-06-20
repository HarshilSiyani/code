
public class DeliveryVehicleTester
{
   public static void main(String[] args)
   {
      final int MAX_NUM_OF_CAKES = 10;
      Driver testDriver = new Driver("Matt");
      Cake cakes[] = new Cake[1];

      cakes[0]=new Cake("Birthday Cake", 2, 40, 30, 20);

      Order orders[] = new Order[1];
      orders[0] = new Order("41 Flinders", cakes, MAX_NUM_OF_CAKES);


      DeliveryVehicle testVehicle = new DeliveryVehicle(45, 3);


      System.out.println("\nTest hasDriver()");
      System.out.println("Expected: false, Actual: " + testVehicle.hasDriver());

      testVehicle.setDriver(testDriver);

      System.out.println("\nTest setDriver(), hasDriver()");
      System.out.println("Expected: true, Actual: " + testVehicle.hasDriver());

      System.out.println("\nTest getVehicleID()");
      System.out.println("Expected: 45, Actual: " + testVehicle.getVehicleID());

      System.out.println("\nTest getNumOrdersDelievered()");
      System.out.println("Expected: 0, Actual: " + testVehicle.getNumOrdersDelivered());

      System.out.println("\nTest getNumOrdersOnBoard()");
      System.out.println("Expected: 0, Actual: " + testVehicle.getNumOrdersOnBoard());

      testVehicle.addOrder();
      System.out.println("\nTest addOrder(testOrder),  getNumOrdersOnBoard()");
      System.out.println("Expected: 1, Actual: " + testVehicle.getNumOrdersOnBoard());

      System.out.println("\nTest makeDelivery()");
      System.out.println("Expected: ");
      System.out.println("DeliveryVehicle[ vehicleID: 45\n" +
            ", driver: Driver[ driverName: Matt ]\n" +
            ", order1: Order[ orderNumber: 1, orderAddress: 23 Fake St, numberOfCakes: 1,\n" +
            "cake: Cake[ name: Birthday Cake, eggs: 2, sugarGrams: 40, flourGrams: 30, milkMilliLitres: 20 ] ]\n" +
            ", order2: No Order\n" +
            ", order3: No Order\n" +
            ", numOrdersDelivered: 0 ]");
      System.out.println("Actual:");
      System.out.println(testVehicle.makeDelivery());

      System.out.println("\nTest getNumOrdersOnBoard()");
      System.out.println("Expected: 0, Actual: " + testVehicle.getNumOrdersOnBoard());

      System.out.println("\nTest getNumOrdersDelievered()");
      System.out.println("Expected: 1, Actual: " + testVehicle.getNumOrdersDelivered());

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

