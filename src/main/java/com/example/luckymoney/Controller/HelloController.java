package com.example.luckymoney.Controller;


import com.example.luckymoney.Config.LimitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private LimitConfig limitConfig;

//    @Value("${minMoney}")
//    private BigDecimal minMoney;
//
//    @Value("${description}")
//    private String description;

//    /**
//     * http://localhost:8081/luckymoney/hello/say/100
//     * @param id
//     * @return
//     */
//    @PostMapping("/say/{id}")
//    public String say(@PathVariable("id") Integer id) {
//        return "id: " + id;
//    }

//    /**
//     * http://localhost:8081/luckymoney/hello/say
//     * 不传id
//     * @param id
//     * @return
//     */
//    @GetMapping("/say")
//    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
//        return "id: " + id;
//    }

    /**
     * http://localhost:8081/luckymoney/hello/say?id=100 POST
     * @param id
     * @return
     */
    @PostMapping("/say")
    public String say(@RequestParam("id") Integer id) {
        return "id: " + id;
    }

}
