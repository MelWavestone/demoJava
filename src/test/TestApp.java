import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestHelloWorld {

   private HelloWorld h;
	
   public void setUp() throws Exception 
   {
      h = new HelloWorld();
   }

   public void testHelloEmpty() 
   {
      assertEquals(h.getName(),"");
      assertEquals(h.getMessage(),"Hello!");
   }

   public void testHelloWorld() 
   {
      h.setName("World");
      assertEquals(h.getName(),"World");
      assertEquals(h.getMessage(),"Hello World!");
   }
}
