package Springboot.tutorialspoint.com.SpringBootExceptionHandling;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/pncbank")
public class SpringBootExceptionHandlingController {
	
	private static Map<Integer, Product> productRepo = new HashMap<Integer, Product>();
	
	static {
		Product p1 = new Product();
		p1.setId(1);
		p1.setName("Almond");
		productRepo.put(1, p1);
		
		Product p2 = new Product();
		p2.setId(2);
		p2.setName("Oil");
		productRepo.put(2, p2);
	}
	
	@RequestMapping(value="/updateproduct/{id}", method = RequestMethod.PUT)
	public ResponseEntity<String> updateProduct(@PathVariable("id") int id, @RequestBody Product product){
		if(!productRepo.containsKey(id)) throw new ProductNotFoundException();
		productRepo.remove(id);
		productRepo.put(id, product);
		return new ResponseEntity<String>("Product is updated successfully", HttpStatus.OK);
	}
	
	@RequestMapping(value="/products", method=RequestMethod.GET)
	public List<Product> getAllProducts(){
		return new ArrayList<Product>(productRepo.values());
	}
}
