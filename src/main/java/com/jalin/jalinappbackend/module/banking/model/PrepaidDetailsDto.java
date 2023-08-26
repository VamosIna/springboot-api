package com.jalin.jalinappbackend.module.banking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.UUID;

@NoArgsConstructor
@Getter
@Setter
public class PrepaidDetailsDto {
    private UUID prepaidId;
    private String prepaidType;
    private String prepaidName;
    private String prepaidDetails;
    private String price;

    public PrepaidDetailsDto(UUID prepaidId, String prepaidType, String prepaidName, String prepaidDetails, BigDecimal price) {
        this.prepaidId = prepaidId;
        this.prepaidType = prepaidType;
        this.prepaidName = prepaidName;
        this.prepaidDetails = prepaidDetails;
        this.price = formatAmount(price);
    }

    public void setPrice(BigDecimal price) {
        this.price = formatAmount(price);
    }

    private String formatAmount(BigDecimal amount) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');

        String pattern = "#,###,###,###";
        DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
        return decimalFormat.format(amount);
    }
}
