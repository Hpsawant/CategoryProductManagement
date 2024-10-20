package Com.Infotech.Nimap.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import Com.Infotech.Nimap.Model.Product;
import Com.Infotech.Nimap.Repository.ProductRepository;

// Implementation of the ProductService interface
// This class handles the business logic for Product entities

@Service
public class ProductServiceImpl implements ProductService 
{
	private final ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) 
	{
		this.productRepository = productRepository;
	}

	// get all
	@Override
	public List<Product> getAllProducts() 
	{
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	// create 
	@Override
	public Product createProduct(Product product) 
	{
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	// get single
	@Override
	public Product getProduct(Long id) 
	{
		// TODO Auto-generated method stub
		return productRepository.findById(id).get();
	}

	// update
	@Override
	public Product updateProduct(Long id, Product product) 
	{
		// TODO Auto-generated method stub
		Product existProduct = productRepository.findById(id).get();
		if(existProduct==null) {
			return null;
		}
		product.setProductId(id);
		Product updatedProduct = productRepository.save(product);
		return updatedProduct;
	}

	// delete
	@Override
	public void deleteProduct(Long id) 
	{
		// TODO Auto-generated method stub
		productRepository.deleteById(id);
	}
}
