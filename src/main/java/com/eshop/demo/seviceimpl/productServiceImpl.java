package com.eshop.demo.seviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eshop.demo.dto.productDTO;
import com.eshop.demo.entity.product;
import com.eshop.demo.repository.productRepository;
import com.eshop.demo.services.productService;

@Service
public class productServiceImpl implements productService {
	
	@Autowired
	productRepository productRepository;
	
	@Override
	public List<productDTO>getAllProducts()
	{
		
		List<productDTO>productList=new ArrayList<>();
		
		List<product>all=productRepository.findAll();
		all.forEach(product ->{
			
			productList.add(new productDTO(
					product.getProductId(),
					product.getProductName(),
					product.getBrand(),
					product.getCategory() ,
					product.getStatus(),
					product.getCost(),
					product.getListPrice(),
					product.getDiscount()
					));
		});
		
		return productList;
		
	}

}
