package com.order.orderservice.controller;

import com.order.orderservice.service.OrderService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fan Xiao Gang.
 * @ClassName orderController
 * @Description TOD0
 * @Date 2023/4/26
 */
@RestController
public class OrderController {
  @Resource
  private OrderService orderService;

  @GetMapping("test")
  public String test() {
    return "12333";
  }

  @GetMapping("OpenFeignTest")
  public String OpenFeignTest() {
    return orderService.OpenFeignStockTest();
  }
}
