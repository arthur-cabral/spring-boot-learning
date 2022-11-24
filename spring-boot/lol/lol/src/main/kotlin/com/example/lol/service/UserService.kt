package com.example.lol.service

import com.example.lol.model.UserModel
import com.example.lol.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(private val repository: UserRepository) {

    fun getUsuarios(): List<UserModel> {
        return repository.findAll()
    }

    fun getUsuarioById(idU: Int): Optional<UserModel> {
        return repository.findById(idU)
    }

    fun saveUsuario(user: UserModel): UserModel {
        return repository.save(user)
    }

}