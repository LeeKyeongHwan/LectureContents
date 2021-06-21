package com.example.firstproject.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Product {

    private int ProductNo;
    private  String name;
    private  String weight;
    private  String price;
    private Date regDate;
}
