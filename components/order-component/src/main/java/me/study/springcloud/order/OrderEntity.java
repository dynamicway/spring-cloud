package me.study.springcloud.order;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "product_id")
    private long productId;
    @Column(name = "qty")
    private int qty;
    @Column(name = "unit_price")
    private int unitPrice;
    @Column(name = "total_price")
    private int totalPrice;
    @Column(name = "user_id")
    private long userId;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
