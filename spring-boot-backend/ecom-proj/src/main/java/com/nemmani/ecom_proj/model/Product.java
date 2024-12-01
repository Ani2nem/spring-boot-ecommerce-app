package com.nemmani.ecom_proj.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity // let spring JPA know to handle this
@Data // from lombok to handle data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id // have to specity id is a primary key so we don't get an error.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Spring JPA will create an Id autmaitically for this model
    private int id;
    
    private String name;
    private String desc;
    private String brand;
    private BigDecimal price;
    private String category;
    private Date releaseDate;
    private Boolean available;
    private int quantity;

}
