package Com.Infotech.Nimap.Service;

import java.util.List;
import Com.Infotech.Nimap.Model.Product;

// Service interface for managing Product entities
//This interface defines the operations that can be performed on Product objects

public interface ProductService 
{
	List<Product> getAllProducts();  // get all
	Product createProduct(Product product); // create
	Product getProduct(Long id);	// get single
	Product updateProduct(Long id, Product product); //update 
	void deleteProduct(Long id); // delete
}
