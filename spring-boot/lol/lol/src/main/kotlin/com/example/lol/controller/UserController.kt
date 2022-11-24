package com.example.lol.controller

import com.example.lol.model.UserModel
import com.example.lol.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(val userService: UserService) {

    @GetMapping
    fun getUsuarios(): ResponseEntity<List<UserModel>> {
        return ResponseEntity.ok(userService.getUsuarios())
    }

    @GetMapping("/{idU}")
    fun getUserById(@PathVariable idU: Int): ResponseEntity<UserModel> {
        return ResponseEntity.of(userService.getUsuarioById(idU))
    }

    @PostMapping
    fun saveUsuario(@RequestBody user: UserModel): ResponseEntity<UserModel> {
        return ResponseEntity.ok(userService.saveUsuario(user))
    }
}