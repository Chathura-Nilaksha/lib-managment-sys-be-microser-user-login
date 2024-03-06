package edu.icet.repository;

import edu.icet.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity findByUserName(String userName);
    boolean existsByUserName(String userName);
    void deleteByUserName(String userName);

    boolean existsById(Long id);
    void deleteById(Long id);
}
