package edu.icet.repository;

import edu.icet.entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<LoginEntity, Long> {
    boolean existsByEmail(String email);

    String findPasswordByEmail(String email);

}
