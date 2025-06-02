package com.gomes.trataerros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gomes.trataerros.model.UserModel;
import com.gomes.trataerros.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    
    // Injeta UserService
    @Autowired
    UserService userService;

    // Endpoint para criação de usuário
    @PostMapping("create")
    public ResponseEntity<UserModel> create(@RequestBody UserModel user) {
        userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    // Endpoint para buscar usuário por id
    @GetMapping("findId/{id}")
    public ResponseEntity<UserModel> find(@PathVariable String id) {
       
        return ResponseEntity.ok(userService.getUserId(id));
    }

}
