package com.gomes.trataerros.service;

import com.gomes.trataerros.exception.UserNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gomes.trataerros.model.UserModel;
import com.gomes.trataerros.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Método para criar usuário
    public void createUser(UserModel user) {
        userRepository.save(user);
    }

    // Método para buscar usuário por id
    public UserModel getUserId(String id) {

    // Retorna usuário caso id não sejá nulo, se for nulo retorna mensagem de erro tratada
       return userRepository.findById(id)
            .orElseThrow(() -> new UserNotFoundException("Usuário com ID " + id + " não encontrado!"));

    }
}
