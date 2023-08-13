package com.sigei.thejavaacademybank.repository;


import com.sigei.thejavaacademybank.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
