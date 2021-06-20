public class DriverTester
{
   public static void main(String[] args)
   {
      Driver testDriver = new Driver("Matt");

      System.out.println("\nTest getName()");
      System.out.println("Expected: Matt, Actual: " + testDriver.getName());

      System.out.println("\nTest toString()");
      System.out.println("Expected: ");
      System.out.println("Driver[ driverName: Matt ]");
      System.out.println("Actual:");
      System.out.println(testDriver.toString());
   }
}
   