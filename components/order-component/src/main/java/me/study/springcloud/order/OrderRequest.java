package me.study.springcloud.order;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class OrderRequest {
    private long productId;
    private int qty;
    private int unitPrice;
    private int totalPrice;
    private long userId;

    public OrderEntity toEntity() {
        return new OrderEntity(
                productId,
                qty,
                unitPrice,
                totalPrice,
                userId,
                LocalDateTime.now()
        );
    }

}
