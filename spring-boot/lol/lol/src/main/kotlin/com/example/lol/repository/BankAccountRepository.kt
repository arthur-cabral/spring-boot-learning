package com.example.lol.repository

import com.example.lol.model.BankAccountModel
import org.springframework.data.jpa.repository.JpaRepository

interface BankAccountRepository : JpaRepository<BankAccountModel, Long> {
}
