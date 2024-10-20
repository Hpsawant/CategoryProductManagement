package Com.Infotech.Nimap.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Com.Infotech.Nimap.Model.Category;

// Repository interface for Category entity
//This interface extends JpaRepository to provide CRUD operations for Category.

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> 
{
	
}
