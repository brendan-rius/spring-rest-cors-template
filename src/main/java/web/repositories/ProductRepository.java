package web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.models.Product;

/**
 * User: Brendan
 * Date: 21/09/13
 * Time: 12:51
 */

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>
{

}
