package Com.Infotech.Nimap.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

// Represents a product entity in the system.
//This class maps to the Product table in the database.

@Entity
public class Product 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;        // Unique id for product
	private String productName;    // name for product
	private String manufactureDate;// date of manufacture
	private String expiryDate;	   // date expiryDate
	private Long price;			   // price
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="category_id", nullable = false)
	private Category category;	    //The category to which the product belongs
	
	
	// Default constructer
	public Product() 
	{
		super();
	}

	// paramiterized constructer
	public Product(Long productId, String productName, String manufactureDate, String expiryDate, Long price,
			Category category) 
	{
		super();
		this.productId = productId;
		this.productName = productName;
		this.manufactureDate = manufactureDate;
		this.expiryDate = expiryDate;
		this.price = price;
		this.category = category;
	}

	// Getter and Setter
	public Long getProductId() 
	{
		return productId;
	}

	public void setProductId(Long productId) 
	{
		this.productId = productId;
	}

	public String getProductName() 
	{
		return productName;
	}

	public void setProductName(String productName) 
	{
		this.productName = productName;
	}

	public String getManufactureDate() 
	{
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) 
	{
		this.manufactureDate = manufactureDate;
	}

	public String getExpiryDate() 
	{
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) 
	{
		this.expiryDate = expiryDate;
	}

	public Long getPrice() 
	{
		return price;
	}

	public void setPrice(Long price) 
	{
		this.price = price;
	}

	public Category getCategory() 
	{
		return category;
	}

	public void setCategory(Category category) 
	{
		this.category = category;
	}
	
	// for print data tostring method
	@Override
	public String toString() 
	{
		return "Product [productId=" + productId + ", productName=" + productName + ", manufactureDate="
				+ manufactureDate + ", expiryDate=" + expiryDate + ", price=" + price + ", category=" + category + "]";
	}
}

