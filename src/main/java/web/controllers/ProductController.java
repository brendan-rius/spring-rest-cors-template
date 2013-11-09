package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import web.models.Product;
import web.services.ProductService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * User: brendan
 * Date: 19/09/13
 * Time: 20:26
 */

@Controller
@RequestMapping("/api/product")
public class ProductController
{
	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/add", method = {RequestMethod.POST, RequestMethod.PUT})
	public
	@ResponseBody
	Product save(@RequestParam("title") String title,
	             @RequestParam("description") String description,
	             @RequestParam("price") Double price,
	             HttpServletResponse response)
	{
		response.addHeader("Access-Control-Allow-Origin", "*");
		return this.productService.createNewProduct(title, description, price);
	}

	@RequestMapping(value = "/findAll", method = RequestMethod.POST)
	public
	@ResponseBody
	List<Product> searchByPosition(@RequestParam("latitude") Double latitude,
	                               @RequestParam("longitude") Double longitude,
	                               @RequestParam("maxDistance") Integer maxDistance,
	                               HttpServletResponse response)
	{
		response.addHeader("Access-Control-Allow-Origin", "*");
		return this.productService.findAll();
	}
}
