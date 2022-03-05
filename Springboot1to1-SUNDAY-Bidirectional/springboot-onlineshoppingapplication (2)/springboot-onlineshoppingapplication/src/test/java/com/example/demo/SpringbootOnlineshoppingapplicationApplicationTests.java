package com.example.demo;



import static org.assertj.core.api.Assertions.assertThat;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



import com.example.demo.model.Category;
import com.example.demo.model.Order;
import com.example.demo.model.Product;
import com.example.demo.repository.CategoryRepo;
import com.example.demo.repository.OrderRepo;
import com.example.demo.repository.ProductRepo;
import com.example.demo.serviceImpl.CategoryServiceImpl;
import com.example.demo.serviceImpl.OrderServiceImpl;
import com.example.demo.serviceImpl.ProductServiceImpl;



@SpringBootTest
class SpringbootOnlineshoppingapplicationApplicationTests
{

@Autowired
private CategoryRepo categoryRepo;
@Autowired
CategoryServiceImpl cat;



@Autowired
private ProductRepo productRepo;
@Autowired
ProductServiceImpl serviceImpl;



@Autowired
private OrderRepo orderRepo;
@Autowired
OrderServiceImpl impl;





// @Test
// void contextLoads()
// {
//
// }
//
@Test
public void CategoryRepo()
{
Category category= new Category();

category.setId(1);
category.setName("keshav");
cat.addcategory(category);
assertThat(category.getId()).isGreaterThan(0);



}

@Test
public void ProductRepo()
{
Product product = new Product();
product.setId(5l);
product.setName("shoes");
serviceImpl.addProducts(product);
assertThat(product.getId()).isGreaterThan(0);
}

@Test
public void OrderRepo()
{
Order order= new Order();
order.setOrderId(2);
order.setFirstName("keshav");
impl.update(order);
assertThat(order.getOrderId()).isGreaterThan(0);
}



}
