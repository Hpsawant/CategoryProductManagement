package Com.Infotech.Nimap.Model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

// Represents a Category entity in the system.
// This class maps to the 'Category' table in the database.

@Entity
public class Category 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoryId;   // unique id
	private String categoryName; // name 
	@OneToMany(mappedBy ="category" ,cascade = CascadeType.ALL)
	@JsonBackReference
	private List<Product> products; // assosiated product with category
	
	// default constructer
	public Category()  
	{
		super();
	}
	
	// paramitrized constructer
	public Category(Long categoryId, String categoryName, List<Product> products) 
	{
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.products = products;
	}
	
	// getter and setter
	public Long getCategoryId() 
	{
		return categoryId;
	}
	
	public void setCategoryId(Long categoryId) 
	{
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) 
	{
		this.categoryName = categoryName;
	}
	public List<Product> getProducts() 
	{
		return products;
	}
	public void setProducts(List<Product> products) 
	{
		this.products = products;
	}
	
	// for print data on console tostring method 
	@Override
	public String toString() 
	{
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", products=" + products + "]";
	}
	
}
