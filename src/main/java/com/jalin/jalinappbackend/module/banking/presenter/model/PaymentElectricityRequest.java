package com.jalin.jalinappbackend.module.banking.presenter.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;
import java.math.RoundingMode;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PaymentElectricityRequest {
    @Positive
    private BigDecimal amount;

    public void setAmount(BigDecimal amount) {
        this.amount = amount.setScale(2, RoundingMode.UNNECESSARY);
    }
}
