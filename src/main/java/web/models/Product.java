package web.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * User: Brendan
 * Date: 21/09/13
 * Time: 11:21
 */

@Entity
@Table(name = "products")
public class Product implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long   id;
	private String title;
	private String description;
	private Double price;

	public Product()
	{

	}

	public Product(String title, String description, Double price)
	{
		this.title = title;
		this.description = description;
		this.price = price;
	}

	public Double getPrice()
	{
		return price;
	}

	public void setPrice(Double price)
	{
		this.price = price;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}
}
