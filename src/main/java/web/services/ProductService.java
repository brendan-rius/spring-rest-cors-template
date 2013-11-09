package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.models.Product;
import web.repositories.ProductRepository;

import java.util.List;

/**
 * User: Brendan
 * Date: 28/09/13
 * Time: 20:02
 */

@Service
public class ProductService
{
	@Autowired
	private ProductRepository productRepository;

	public Product addProduct(String title, String description, Double price)
	{
		Product product = new Product(title, description, price);
		return this.productRepository.save(product);
	}

	public List<Product> findAll()
	{
		return this.productRepository.findAll();
	}

	public Product createNewProduct(String title, String description, Double price)
	{
		Product product = new Product(title, description, price);
		return this.productRepository.save(product);
	}
}
