public class Driver
{
   private String name;

   public Driver(String name)
   {
      this.name = name;
   }

   public String getName()
   {
      return(name);
   }

   public String toString()
   {
      return("Driver[ driverName: "+ name + " ]");
   }


}