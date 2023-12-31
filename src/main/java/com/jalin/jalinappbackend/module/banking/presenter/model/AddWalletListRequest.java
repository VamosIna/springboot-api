package com.jalin.jalinappbackend.module.banking.presenter.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AddWalletListRequest {
    @NotBlank
    private String corporateId;
    @NotBlank
    private String accountNumber;
}
