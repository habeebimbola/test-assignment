/**
 * @Author: ANIMASHAUN HABEEB ABIMBOLA
 * Purpose: Repository Interface Of Product Entity
 * */
package ee.erply.product.repo;

import ee.erply.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,  Integer> {
}
