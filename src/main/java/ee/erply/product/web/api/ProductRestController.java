
/**
 * @Author: ANIMASHAUN HABEEB ABIMBOLA
 * Purpose: Controller That Handles Users Requests
 * Date: 1st November 2018
 * @Version 1.0
 * */
package ee.erply.product.web.api;

import ee.erply.product.domain.Product;
import ee.erply.product.repo.ProductRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import java.util.Optional;

@RestController("/product")
public class ProductRestController {

    private final ProductRepository productRepository;

    @Autowired
    public ProductRestController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }



    @PostMapping(value="/create")
    public String saveProduct( Product product, Model model)
    {
        this.productRepository.save(product);
        return "";
    }

    @RequestMapping(method = RequestMethod.POST,value = "/update?{id}")
    @PutMapping("/update?{id}")
    public String updateProduct(@PathVariable(name="id") @RequestParam(value = "id") Integer id, Model model)
    {
        Optional<Product> productOptional =this.productRepository.findById(id);
        productOptional.ifPresent((p)->
        {
            this.productRepository.save(p);
        });
        return "";
    }


    @DeleteMapping(value="/remove?{id}")
    public String removeProduct(@RequestParam(value="id") @PathVariable("id") Integer id)
    {
        this.productRepository.deleteById(id);
        return "";
    }

}
