package com.sigei.thejavaacademybank.service.impl;

import com.sigei.thejavaacademybank.dto.TransacctionDto;
import com.sigei.thejavaacademybank.entity.Transaction;
import com.sigei.thejavaacademybank.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionImpl implements TransactionService{
    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public void saveTransaction(TransacctionDto transacctionDto) {
        Transaction transaction = Transaction.builder()
                .transactionType(transacctionDto.getTransactionType())
                .accountNumber(transacctionDto.getAccountNumber())
                .amount(transacctionDto.getAmount())
                .status("SUCCESS")
                .build();
        transactionRepository.save(transaction);
        System.out.println("Transaction saved successfully");

    }
}
