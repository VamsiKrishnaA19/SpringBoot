package Springboot.tutorialspoint.com.SpringBootExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice /* Handle the exceptions globally...*/
public class SpringBootExceptionHandlingGloballay {
	
	/* Used to handle the specific exceptions...*/
	@ExceptionHandler(value=ProductNotFoundException.class)
	public ResponseEntity<String> exception(ProductNotFoundException exception){
		return new ResponseEntity<String>("Product Not Found", HttpStatus.NOT_FOUND);
	}
}
