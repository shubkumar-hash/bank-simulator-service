package com.example.bank_simulator_service.controller;


import com.example.bank_simulator_service.model.BankResponse;
import com.example.bank_simulator_service.service.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank")
@RequiredArgsConstructor
public class BankController {

    private final BankService bankService;

    @PostMapping("/pay")
    public BankResponse processPayment(){

        return bankService.processPayment();
    }
}
