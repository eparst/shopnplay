package com.saurshaz.poc.play;

import static org.fest.assertions.Assertions.assertThat;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.contentType;

import org.junit.Test;

import play.api.templates.Html;
import play.mvc.Content;
import scala.reflect.ClassTag;

import com.saurshaz.poc.play.models.CustomObject;


/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class RoutesTest {

	private static CustomObject obj=null; 
	static{
		obj = new CustomObject("Saurabh Sharma","struggler","Yet to COme");
	}
	
    @Test 
    public void simpleCheck() {
        int a = 1 + 1;
        assertThat(a).isEqualTo(2);
    }
    
    @Test
    public void renderTemplate() {
        Content html = views.html.index.render("Your new application is ready.");
        assertThat(contentType(html)).isEqualTo("text/html");
        assertThat(contentAsString(html)).contains("Your new application is ready.");
    }
    // TODO :: fix how to write a JSon test
//    @Test
//    public void jsonRouteTest() {
//    	Content json = views.txt.package.json(obj);
//        assertThat(contentType(json)).isEqualTo("application/json");
//        assertThat(contentAsString(json)).contains("Saurabh Sharma");
//    }
  
   
}
