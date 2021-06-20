public class CakeTester
{
   public static void main(String[] args)
   {
      Cake testCake = new Cake("Birthday Cake", 2, 40, 30, 20);

      System.out.println("Test getName()");
      System.out.println("Expected: Birthday Cake, Actual: " + testCake.getName());

      System.out.println("Test getEggs()");
      System.out.println("Expected: 2, Actual: " + testCake.getEggs());

      System.out.println("Test getSugarGrams()");
      System.out.println("Expected: 40, Actual: " + testCake.getSugarGrams());

      System.out.println("Test getFlourGrams()");
      System.out.println("Expected: 30, Actual: " + testCake.getFlourGrams());

      System.out.println("Test getMilkMilliLitres()");
      System.out.println("Expected: 20, Actual: " + testCake.getMilkMilliLitres());

      System.out.println("Test toString()");
      System.out.println("Expected: ");
      System.out.println("Cake[ name: Birthday Cake, eggs: 2, sugarGrams: 40, flourGrams: 30, milkMilliLitres: 20 ]");
      System.out.println("Actual:");
      System.out.println(testCake.toString());
   }
}
   