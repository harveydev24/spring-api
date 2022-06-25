package jpabook.jpashop.repository.query;

import lombok.Data;

@Data
public class OrderItemQueryDto {

    private Long OrderId;
    private String itemName;
    private int orderPrice;
    private int count;

    public OrderItemQueryDto(Long orderId, String itemName, int orderPrice, int count) {
        this.OrderId = orderId;
        this.itemName = itemName;
        this.orderPrice = orderPrice;
        this.count = count;
    }
}
