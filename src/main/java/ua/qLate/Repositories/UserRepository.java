package ua.qLate.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.qLate.Logic.AppUser;

public interface UserRepository extends JpaRepository<AppUser, Integer> {
}
