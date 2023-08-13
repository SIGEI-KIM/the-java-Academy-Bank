package com.sigei.thejavaacademybank.service.impl;

import com.sigei.thejavaacademybank.dto.TransacctionDto;
import com.sigei.thejavaacademybank.entity.Transaction;

public interface TransactionService {
    void saveTransaction(TransacctionDto transacctionDto);
}
