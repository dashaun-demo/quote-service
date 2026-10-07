package com.dashaun.demo.quote.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

    @GetMapping("/api/quotes")
    public String quotes() {
        return "[{\"id\":\"Q-2026-0117\",\"customerId\":\"C-1001\","
                + "\"monthlyPremium\":184.50,\"status\":\"APPROVED\"}]";
    }

    @GetMapping("/api/quotes/{id}")
    public String quote(@PathVariable String id) {
        return "{\"id\":\"" + id + "\",\"customerId\":\"C-1001\","
                + "\"product\":\"AUTO-PLUS\",\"monthlyPremium\":184.50,"
                + "\"riskTier\":\"PREFERRED\",\"status\":\"APPROVED\","
                + "\"underwriting\":\"underwriting-service\"}";
    }
}
