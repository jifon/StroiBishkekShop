package com.daolycodebuffer.Springboot.tutorial.model;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;


@Getter
@Setter
@ToString
@RequiredArgsConstructor                                                            //getters and setters
@AllArgsConstructor                                              //annotation indicates that the class is a persistent Java class
//@NoArgsConstructor
@Builder
@Entity
@Table(name = "order", schema = "public", catalog = "shop")
public class Order {

    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "creation_time", insertable = false, updatable = false)
    private String creationTime;


    @ManyToOne(optional = false)
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private Customer customer;

    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="ORDER_DETAIL",
            joinColumns=
            @JoinColumn(name="ORDER_ID", referencedColumnName="order_id"),
            inverseJoinColumns=
            @JoinColumn(name="PROD_ID", referencedColumnName="prod_id")
    )
    private List<Product> productList;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Order order = (Order) o;
        return id != null && Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

