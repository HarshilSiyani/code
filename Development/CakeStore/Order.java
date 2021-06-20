
public class Order
{
   private int orderNumber;
   private String orderAddress;
   private int numberOfCakes;
   private static int totalNumOfOrders = 0;
   private Cake[] cakes;
   public static final int MAX_NUM_OF_CAKES = 10;

   public Order(String orderAddress, Cake[] cakes, int numberOfCakes)
   {
      this.orderAddress = orderAddress;
      this.cakes = cakes;
      this.numberOfCakes = numberOfCakes;
      totalNumOfOrders++;
      orderNumber = totalNumOfOrders;
   }

   public int getOrderNumber()
   {
      return(orderNumber);
   }

   public String getOrderAddress()
   {
      return(orderAddress);
   }

   public int getNumberOfCakes()
   {
      return(numberOfCakes);
   }

   public Cake[] getCakes()
   {
      Cake[] cakeCopy = new Cake[numberOfCakes];

      for(int i = 0; i<numberOfCakes; i++)
      {
        cakeCopy[i] = cakes[i];
      }
      return(cakeCopy);
   }

   public static int getTotalNumOfOrders()
   {
      return(totalNumOfOrders);
   }

   public String toString()
   {
      String cakesDesc = "";

      for(int i=0; i<numberOfCakes; i++)
      {
         cakesDesc = cakesDesc + cakes[i].toString();

      }

      return("Order: \n"
      +"Order Number: " + orderNumber +", \n"
      +"Order Address: " + orderAddress + ", \n"
      +"Number of cakes: " + numberOfCakes + ", \n"
      +"Cake: " + cakesDesc + ", ");
   }
}


