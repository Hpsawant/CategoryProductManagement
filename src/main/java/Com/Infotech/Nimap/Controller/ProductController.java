package Com.Infotech.Nimap.Controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import Com.Infotech.Nimap.Model.Product;
import Com.Infotech.Nimap.Service.ProductService;

// Service interface for managing products.
// Defines methods for CRUD operations on products.

@RestController
@RequestMapping("/api/products")
public class ProductController 
{
	private final ProductService productService; 

	// constructer
	public ProductController(ProductService productService) 
	{
		this.productService = productService; 
	}

	// create 
	@PostMapping
	public ResponseEntity<Product> createProduct(@RequestBody Product product) 
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(productService.createProduct(product));
	}

	// get all
	@GetMapping
	public ResponseEntity<List<Product>> getAllProducts() 
	{
		return ResponseEntity.status(HttpStatus.OK).body(productService.getAllProducts());
	}

	// get single
	@GetMapping("/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable("id") Long id) 
	{ 
		return ResponseEntity.status(HttpStatus.OK).body(productService.getProduct(id));
	}

	// update
	@PutMapping("/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable("id") Long id, @RequestBody Product product) 
	{ 																										
		return ResponseEntity.status(HttpStatus.OK).body(productService.updateProduct(id, product));
	}

	//delete
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable("id") Long id) 
	{ 
		productService.deleteProduct(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Product deleted Succesfully....");
	}
}

