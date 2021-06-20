public class DeliveryVehicle
{
   private int vehicleID;
   private Driver driver;
   private Order[] orders;
   private int maxOrdersOnBoard;
   private int numOrdersOnBoard;
   private int numOrdersDelivered;

   public DeliveryVehicle(int vehicleID, int maxOrdersOnBoard)
   {
      this.vehicleID = vehicleID;
      this.maxOrdersOnBoard = maxOrdersOnBoard;
      driver = null;
      numOrdersOnBoard = 0;
      numOrdersDelivered = 0;
      orders = new Order[maxOrdersOnBoard];

   }

   public boolean hasDriver()
   {
      if(driver == null)
      {
         return(false);
      }
      return false;
   }

   public void setDriver(Driver driver)
   {
      this.driver = driver;
   }

   public int getNumOrdersDelivered()
   {
      return(numOrdersDelivered);
   }

   public int getNumOrdersOnBoard()
   {
      return(numOrdersOnBoard);
   }

   public int getMaxOrdersOnBoard()
   {
      return(maxOrdersOnBoard);
   }

   public Order getOrder(int index)
   {

      for (int i = 0; i<maxOrdersOnBoard; i++)
      {
         return(orders.indexOf());
      //not shown in the description }  
   }
   }

   public int getVehicleID()
   {
      this.vehicleID = vehicleID;
      return(vehicleID);
   }

   public void addOrder(Order orders)
   {
      this.orders = orders;
      for (int i = 0; i<10; i++)
      {
         Order[i] = orders;
      //if statement and array
      //this.order = order;
   }
   }

   public String makeDelivery()
   {
      String deliveryTicket = toString();
      updateDeliveredOrders();
      return(deliveryTicket);

   }

   public void updateDeliveredOrders()
   {
      numOrdersDelivered = numOrdersDelivered + getNumOrdersOnBoard();

      Order[] orderClone = orders;
      orderClone = null;
   }

   public String toString()
   {
      return("DeliveryVehicle[ vehicleID:"+ vehicleID +"]\n"
     + ", driver:" +driver +"\n"
     + ", orders:" +orders +"\n"
     + ", numOrdersOnBoard: "+numOrdersOnBoard+", maxOrdersOnBoard: "+maxOrdersOnBoard+", numOrdersDelivered: "+numOrdersDelivered+" ]");
   }


}