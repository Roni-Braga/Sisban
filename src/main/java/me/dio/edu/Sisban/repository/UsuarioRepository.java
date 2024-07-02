package me.dio.edu.Sisban.repository;

import me.dio.edu.Sisban.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<User,Long> {

    Boolean existsByAccountNumber(String accountNumber);
}
