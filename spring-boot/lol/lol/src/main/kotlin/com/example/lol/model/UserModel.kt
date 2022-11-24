package com.example.lol.model

import javax.persistence.*

@Entity
@Table(name = "users")
data class UserModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    val idU: Int,

    @Column(name = "nameU")
    var nameU: String,

    @Column(name = "emailU")
    var emailU: String,

    @Column(name = "passwordU")
    var passwordU: String
    )
{
    @Override
    override fun toString(): String {
        return this::class.simpleName + "(idU = $idU , nameU = $nameU , emailU = $emailU , passwordU = $passwordU)"
    }
}
