package ru.innopolis.webinar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.innopolis.webinar.models.User;

public interface UsersRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
