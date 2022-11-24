package com.example.lol.model

import javax.persistence.*

@Entity
@Table(name = "bank_account")
data class BankAccountModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val userId: Int,

    @Column(name = "balance")
    val balance: Double,

    @Column(name = "account_number")
    val accountNumber: String,
)
