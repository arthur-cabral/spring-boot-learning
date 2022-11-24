package com.example.lol.repository

import com.example.lol.model.UserModel
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserModel, Int> {

}