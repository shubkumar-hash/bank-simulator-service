package com.example.bank_simulator_service.service;

import com.example.bank_simulator_service.enums.TransactionStatus;
import com.example.bank_simulator_service.model.BankResponse;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class BankService {

    public BankResponse processPayment(){

        Random random = new Random();
        int result = random.nextInt(3);

        TransactionStatus status;

        if(result == 0){
            status = TransactionStatus.SUCCESS;
        }
        else if(result == 1){
            status = TransactionStatus.FAILED;
        }
        else{
            status = TransactionStatus.INSUFFICIENT_BALANCE;
        }

        String bankReference = "BANK_" + UUID.randomUUID();

        return new BankResponse(status, bankReference);
    }
}
