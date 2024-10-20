package Com.Infotech.Nimap.Controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Com.Infotech.Nimap.Model.Category;
import Com.Infotech.Nimap.Service.CategoryService;

// Controller for managing Category entities
// This class handles HTTP requests related to Category operations

@RestController
@RequestMapping("/api/categories")
public class CategoryController 
{
	private final CategoryService categoryService;
	
	public CategoryController(CategoryService categoryService) 
	{
		this.categoryService = categoryService;
	}
	
	// create 
	@PostMapping
	public ResponseEntity<Category> createCategory(@RequestBody Category category){
		return ResponseEntity.status(HttpStatus.CREATED).body(categoryService.createCategory(category));
	}
	
	// Get all
	@GetMapping
	public ResponseEntity<List<Category>> getAllCategory(){
		return ResponseEntity.status(HttpStatus.FOUND).body(categoryService.getAllCategory());
	}
	
	// get single
	@GetMapping("/{id}")
	public ResponseEntity<Category> getCategory(@PathVariable("id") Long id){
		return ResponseEntity.status(HttpStatus.FOUND).body(categoryService.getCategory(id));
	}
	
	// update
	@PutMapping("/{id}")
	public ResponseEntity<Category> updateCategory(@PathVariable("id") Long id, @RequestBody Category category){
		return ResponseEntity.status(HttpStatus.OK).body(categoryService.updateCategory(id, category));
	}
	
	// delete
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCategory(@PathVariable("id") Long id){
		categoryService.deleteCategory(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Category deleted Successfully......");
	}
}
