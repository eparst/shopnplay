package controllers;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

import play.mvc.Controller;
import play.mvc.Result;

import com.saurshaz.poc.play.models.CustomObject;

public class Application extends Controller {
	private static CustomObject obj=null; 
	static{
		obj = new CustomObject("Saurabh Sharma","struggler","Yet to COme");
	}
  
    public static Result json() {
        return ok(new ObjectMapper().convertValue(obj, JsonNode.class));
    }
    
  
    public static Result index() {
        return ok("hello world queen");
    }
  
}
