package com.eshop.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eshop.demo.dto.ResponseDTO;
import com.eshop.demo.dto.productDTO;
import com.eshop.demo.services.productService;

@RestController
@RequestMapping("/eshop/products")
public class productController {
	
	@Autowired
	productService productService;
	
	@GetMapping
	public ResponseDTO getallProducts()
	{
		List<productDTO>allproducts=productService.getAllProducts();
		return new ResponseDTO(200, "Success", allproducts);
	}

}
