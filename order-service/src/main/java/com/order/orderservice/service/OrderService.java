package com.order.orderservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("stockService")
public interface OrderService {

  @GetMapping("/OpenFeignStockTest")
  String OpenFeignStockTest();

}
