package com.webtech.BerwaShopStock_Management_System.userRepository;

import com.webtech.BerwaShopStock_Management_System.model.ResetToken;
import com.webtech.BerwaShopStock_Management_System.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ResetTokenRepository extends JpaRepository<ResetToken, Long> {
    void deleteByToken(String token);
    Optional<ResetToken> findByUser(User user);
    Optional<ResetToken> findByToken(String token);
}