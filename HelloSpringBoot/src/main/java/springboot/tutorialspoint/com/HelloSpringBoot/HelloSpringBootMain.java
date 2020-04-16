package springboot.tutorialspoint.com.HelloSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value="/pncbank")
public class HelloSpringBootMain 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(HelloSpringBootMain.class, args);
        System.out.println( "Hello World!" );
    }
    
    @RequestMapping(value="/hi")
    public String sayHello() {
    	return "Welcome To SpringBoot HelloWorld Application";
    }
    
    @RequestMapping(value="/name/{name}")
    public String displayName(@PathVariable("name") String name) {
    	return "Hi"+ name;
    }
    
}
