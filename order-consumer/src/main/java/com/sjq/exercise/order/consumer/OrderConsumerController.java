package com.sjq.exercise.order.consumer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : sujiqiang
 * @name OrderController
 * @Description :
 * @Date: 2021/2/24 10:25
 */
@RestController
@RequestMapping("/order")
public class OrderConsumerController {
//
//    @Autowired
//    private LoadBalancerClient loadBalancerClient;
//
//    @GetMapping("/getUserServerInfo")
//    public Object getUserServerInfo() {
//
//        for (int i = 0; i < 10; i++) {
//            ServiceInstance serviceInstance = loadBalancerClient.choose("user-server");
//            RestTemplate restTemplate = new RestTemplate();
//
//            ResponseEntity<String> responseEntity = restTemplate.exchange(
//                    "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/user/serverInfo",
//                    HttpMethod.GET,
//                    null,
//                    String.class);
//            System.out.println("index = " + i + ":>>>  " + responseEntity.getBody());
//        }
//        return null;
//    }


}
