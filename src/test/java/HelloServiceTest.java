

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HelloServiceTest
{

    @Test(groups = "unit")
    public void testGetMessage()
    {
        HelloService service = new HelloService();
        assertEquals(service.getMessage(), "Hello World!");
    }


}
