package me.study.springcloud.order;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order-service")
public class OrderApi {
    private final OrderService orderService;

    @PostMapping("/orders")
    @ResponseStatus(CREATED)
    public void order(
            @RequestBody OrderRequest orderRequest
    ) {
        orderService.order(orderRequest);
    }

}
