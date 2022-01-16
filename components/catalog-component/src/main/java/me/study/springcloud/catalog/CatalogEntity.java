package me.study.springcloud.catalog;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "catalog")
@NoArgsConstructor
@Getter
public class CatalogEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "product_id")
    private long productId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "stock")
    private int stock;
    @Column(name = "unit_price")
    private int unitPrice;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
