package com.example.firstproject.repository;

import com.example.firstproject.entity.Product;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

@Repository
public class ProductRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Product product) {

        String query = "insert into product (name, weight, price) values (?, ?, ?)";

        jdbcTemplate.update(query, product.getName(), product.getWeight(), product.getPrice());
    }

    public List<Product> list() throws Exception {

        List<Product> results = jdbcTemplate.query(
                "select product_no, name, weight, price, reg_date from product " +
                        "where product_no > 0 order by product_no desc",
                new RowMapper<Product>() {
                    @SneakyThrows
                    @Override
                    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Product product = new Product();

                        // rs.getInt()는 DB에 있는 정수형 정보를 얻어옴
                        product.setProductNo(rs.getInt("product_no"));
                        // rs.getString()은 DB에 있는 문자열 정보를 얻어옴
                        product.setName(rs.getString("name"));
                        product.setWeight(rs.getString("weight"));
                        product.setPrice(rs.getString("price"));
                        // rs.getDate()는 DB에 있는 날자 정보를 얻어옴

                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


                        product.setRegDate(sdf.parse(rs.getDate("reg_date") + " " + rs.getTime("reg_date")));

                        //System.out.println("rs.getDate():"+ rs.getTimestamp("reg.date");

                        return product;
                    }
                }
        );

        return results;
    }
}