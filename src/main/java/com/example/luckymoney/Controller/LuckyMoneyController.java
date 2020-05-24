package com.example.luckymoney.Controller;

import com.example.luckymoney.Entity.LuckyMoney;
import com.example.luckymoney.Repository.LuckyMoneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/**
 * Lucky money controller
 */
@RestController
@RequestMapping("/rest")
public class LuckyMoneyController {
    @Autowired
    private LuckyMoneyRepository luckyMoneyRepository;

    /**
     * Get list of Lucky Money
     */
    @GetMapping("/all")
    public List<LuckyMoney> list() {
        return luckyMoneyRepository.findAll();
    }

    /**
     * Create a new lucky money and store into db
     * @param produder
     * @param money
     * @return
     */
    @PostMapping("/create")
    public LuckyMoney create(@RequestParam("producer") String produder,
                             @RequestParam("money") BigDecimal money) {
        LuckyMoney luckyMoney = new LuckyMoney();
        luckyMoney.setProducer(produder);
        luckyMoney.setMoney(money);

        return luckyMoneyRepository.save(luckyMoney);
    }

    /**
     * Find a critical lucky money by id
     * @param id
     * @return
     */
    @GetMapping("/findById/{id}")
    public LuckyMoney findById(@PathVariable("id") Integer id) {
        return luckyMoneyRepository.findById(id).orElse(null);
    }

    /**
     * Update a lucky money with id
     * @param id
     * @param consumer
     * @return
     */
    @PutMapping("/update/{id}")
    public LuckyMoney update(@PathVariable("id") Integer id, @RequestParam("consumer") String consumer) {
        Optional<LuckyMoney> optionalLuckyMoney = luckyMoneyRepository.findById(id);
        if (optionalLuckyMoney.isPresent()) {
            LuckyMoney luckyMoney = optionalLuckyMoney.get();
            luckyMoney.setId(id);
            luckyMoney.setConsumer(consumer);
            return luckyMoneyRepository.save(luckyMoney);
        }
        return null;
    }

}
