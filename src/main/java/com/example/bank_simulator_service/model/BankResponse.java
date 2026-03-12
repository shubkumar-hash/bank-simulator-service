package com.example.bank_simulator_service.model;

import com.example.bank_simulator_service.enums.TransactionStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BankResponse {
    private TransactionStatus status;
    private String bankReference;
}
