package com.example.luckymoney.Repository;

import com.example.luckymoney.Entity.LuckyMoney;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LuckyMoneyRepository extends JpaRepository<LuckyMoney, Integer> {
}
