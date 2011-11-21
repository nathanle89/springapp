package springapp.web;

import org.springframework.web.servlet.ModelAndView;

import springapp.web.HelloController;

import org.junit.*;

public class HelloControllerTests {
	
	@Test
    public void testHandleRequestView() throws Exception{		
        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        Assert.assertEquals("hello.jsp", modelAndView.getViewName());
    }
}