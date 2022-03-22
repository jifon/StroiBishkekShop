package com.daolycodebuffer.Springboot.tutorial.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@RequiredArgsConstructor                                                            //getters and setters
@AllArgsConstructor                                              //annotation indicates that the class is a persistent Java class
@Builder
@Table(name = "product")                                       //annotation provides the table that maps this entity
public class Product {

    @Id                                                        //annotation is for the primary key
    @Column(name = "prod_id")
    @GeneratedValue(strategy = GenerationType.AUTO)            //annotation is used to define generation strategy for the primary key
    private Long id;


    @Column(name = "product_name", nullable = false)                             //annotation is used to define the column in database that maps annotated field
    private String name;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "date_of_manifacture", nullable = false)
    private String dateOfManifacture;

    @Column(name = "expiry_date", nullable = false)
    private String  expiryDate;

    @ManyToMany(mappedBy="productList",fetch=FetchType.LAZY)
    private List<Order> orderList;

    public Product(String name, double price, String dateOfManifacture, String expiryDate) {                            // @AllArgsConstructor

        this.name = name;
        this.price = price;
        this.dateOfManifacture = dateOfManifacture;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", product name=" + name + ", cost=" + price + ", Date Of Manifacture=" + dateOfManifacture + ", Expiry Date=" + expiryDate + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Product product = (Product) o;
        return id != null && Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}