package me.study.springcloud.order;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class GetOrderResponse {
    private long id;
    private long productId;
    private int qty;
    private int unitPrice;
    private int totalPrice;
    private long userId;
    private LocalDateTime createdAt;

    public GetOrderResponse(OrderEntity orderEntity) {
        this.id = orderEntity.getId();
        this.productId = orderEntity.getProductId();
        this.qty = orderEntity.getQty();
        this.unitPrice = orderEntity.getUnitPrice();
        this.totalPrice = orderEntity.getTotalPrice();
        this.userId = orderEntity.getUserId();
        this.createdAt = orderEntity.getCreatedAt();
    }
}
