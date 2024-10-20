package Com.Infotech.Nimap.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import Com.Infotech.Nimap.Model.Category;
import Com.Infotech.Nimap.Repository.CategoryRepository;

// Implementation of CategoryService interface
// This class provides the logic for managing categories

@Service
public class CategoryServiceImpl implements CategoryService 
{
	private final CategoryRepository categoryRepository;
	
	// constructer
	public CategoryServiceImpl(CategoryRepository categoryRepository)
	{
		this.categoryRepository = categoryRepository;
	}
	
	// get all catergory
	@Override
	public List<Category> getAllCategory() 
	{
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	// add new category
	@Override
	public Category createCategory(Category category) 
	{
		// TODO Auto-generated method stub
		return categoryRepository.save(category);
	}

	// get single category 
	@Override
	public Category getCategory(Long id) 
	{
		// TODO Auto-generated method stub
		return categoryRepository.findById(id).get();
	}

	// update already present category
	@Override
	public Category updateCategory(Long id, Category category) 
	{
		// TODO Auto-generated method stub
		Category existCategory = categoryRepository.findById(id).get();
		if(existCategory==null) 
		{
			return null;
		}
		category.setCategoryId(id);
		Category updatedCategory = categoryRepository.save(category);
		return updatedCategory;
	}

	// delete category
	@Override
	public void deleteCategory(Long id) 
	{
		// TODO Auto-generated method stub
		categoryRepository.deleteById(id);
	}
}
