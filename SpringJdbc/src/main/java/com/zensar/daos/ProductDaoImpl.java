package com.zensar.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;

/**
 * @author Mokshi Vyas
 * @creation date: 04 oct 19 10.27 AM
 * @modification date: 10 Oct 19 4.04 Pm
 * @version 2.0
 * @copyright Zensar Technologies. All rights reserved.
 * @description It is DAO class of product. it is used in persistence layer
 * 				
 *
 */
@Repository
public class ProductDaoImpl implements ProductDao 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Product> getAll() {
		String sql = "select * from product";
		
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<Product>>() {

			@Override
			public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Product> products = new ArrayList<Product>();
				while(rs.next()) {
					Product product = new Product();
					product.setProductId(rs.getInt(1));
					product.setName(rs.getString(2));
					product.setBrand(rs.getString(3));
					product.setPrice(rs.getFloat(4));
					products.add(product);
					
			
				}
				return products;
			}
		});
	}

	@Override
	public Product getById(int productId) {
		String sql = "select * from product where id=?";
		return jdbcTemplate.query(sql, new Object [] {productId}, new ResultSetExtractor<Product>() {

			@Override
			public Product extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next())
				{
					Product product = new Product();
					product.setProductId(rs.getInt(1));
					product.setName(rs.getString(2));
					product.setBrand(rs.getString(3));
					product.setPrice(rs.getFloat(4));
					return product;
				}else
				return null;
			}
		});
	}
	
	
	

	@Override
	public void insert(Product product) {
		String sql = "insert into product values(?,?,?,?)";
		jdbcTemplate.update(sql, product.getProductId(),product.getName(),product.getBrand(),product.getPrice());
		System.out.println("New product is inserted");
	}

	@Override
	public void update(Product product) {
		String sql = "update product set name=?,brand=?,price=? where id=?";
		jdbcTemplate.update(sql, product.getName(),product.getBrand(),product.getPrice(),product.getProductId());
		System.out.println("Updated succesfully!");
	}

	@Override
	public void delete(Product product) {
		String sql = "delete from product where id=?";
		jdbcTemplate.update(sql, product.getProductId());
		System.out.println("Product deleted");
	}
    
    
  
    
   

}
