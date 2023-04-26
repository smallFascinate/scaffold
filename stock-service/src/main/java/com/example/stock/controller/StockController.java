package com.example.stock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fan Xiao Gang.
 * @ClassName orderController
 * @Description TOD0
 * @Date 2023/4/26
 */
@RestController("OpenFeignStockTest")
public class StockController {


  @GetMapping("stockTest")
  public String test() {
    return "777";
  }

  @GetMapping("OpenFeignStockTest")
  public String OpenFeignTest() {
    return "888";
  }
}
