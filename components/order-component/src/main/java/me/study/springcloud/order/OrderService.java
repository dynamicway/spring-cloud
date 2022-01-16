package me.study.springcloud.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {
    private final OrderRepository orderRepository;

    public void order(OrderRequest orderRequest) {
        orderRepository.save(orderRequest.toEntity());
    }
}
