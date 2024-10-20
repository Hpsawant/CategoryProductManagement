package Com.Infotech.Nimap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Com.Infotech.Nimap.Model.Product;

//Repository interface for product entity
//This interface extends JpaRepository to provide CRUD operations for product.

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> 
{
	
}
