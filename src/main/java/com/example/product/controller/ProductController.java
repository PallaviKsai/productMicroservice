package com.example.product.controller;

import com.example.product.entity.Product;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service ;


     @GetMapping("/products/{productName}")
     public ResponseEntity getProductsByName(@PathVariable("productName") String productName ) throws Exception
     {
         List <Product> products = service.getProductsByName(productName);
         return new ResponseEntity(products,HttpStatus.OK);
     }

    @GetMapping("/products/{serviceId}")
    public ResponseEntity getProductsByService(@PathVariable("serviceId") String serviceId ) throws Exception
    {
        List <Product> products = service.getProductsByService(serviceId);
        return new ResponseEntity(products,HttpStatus.OK);
    }


    @PostMapping("/product")
    public ResponseEntity createProduct(@RequestBody Product product){
         return  new ResponseEntity(service.addProduct(product),HttpStatus.OK);
    }

}
