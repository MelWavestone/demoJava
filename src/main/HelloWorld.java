public class HelloWorld 
{
	private String name = "";
   public String getName() 
   {
      return name;
   }

   public String getMessage() 
   {
      if (name == "") 
      {
         return "Hello!";
      }
      else 
      {
         return "Hello " + name + "!";
      }
   }

   public void setName(String name) 
   {
      this.name = name;
   }
   
   public static void main(String[] args) {
      name = "Mélanie";
      System.out.println("---------------------------------------------");
      System.out.println("   Bonjour " + name + ", comment vas tu?  ");
      System.out.println("---------------------------------------------");                   
   }
		
}
