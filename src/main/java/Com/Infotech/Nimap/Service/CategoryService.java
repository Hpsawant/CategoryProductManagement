package Com.Infotech.Nimap.Service;

import java.util.List;
import Com.Infotech.Nimap.Model.Category;

// Service interface for managing categories
// Defines methods for CRUD operations on categories

public interface CategoryService 
{
	List<Category> getAllCategory();			//for retrive all data
	Category createCategory(Category category); //create a new category
	Category getCategory(Long id);				// retrive single category by using id
	Category updateCategory(Long id, Category category);// update category
	void deleteCategory(Long id);				// delete category
}
