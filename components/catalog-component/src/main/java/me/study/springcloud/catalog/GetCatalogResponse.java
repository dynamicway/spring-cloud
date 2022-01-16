package me.study.springcloud.catalog;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class GetCatalogResponse {
    private long id;
    private long productId;
    private String productName;
    private int stock;
    private int unitPrice;
    private LocalDateTime createdAt;

    public GetCatalogResponse(CatalogEntity catalogEntity) {
        this.id = catalogEntity.getId();
        this.productId = catalogEntity.getProductId();
        this.productName = catalogEntity.getProductName();
        this.stock = catalogEntity.getStock();
        this.unitPrice = catalogEntity.getUnitPrice();
        this.createdAt = catalogEntity.getCreatedAt();
    }

}
