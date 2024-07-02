package me.dio.edu.Sisban.service.impl;

import me.dio.edu.Sisban.model.User;
import me.dio.edu.Sisban.repository.UsuarioRepository;
import me.dio.edu.Sisban.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private UsuarioRepository usuarioRepository;

    public UserServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public User findById(Long id) {
        return usuarioRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (usuarioRepository.existsByAccountNumber(userToCreate.getAccount().getNumber()))
            throw new IllegalArgumentException("O usuário já está cadastrdo");
        return usuarioRepository.save(userToCreate);
    }
}
