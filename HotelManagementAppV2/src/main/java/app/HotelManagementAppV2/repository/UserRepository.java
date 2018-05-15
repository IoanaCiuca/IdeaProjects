package app.HotelManagementAppV2.repository;

import app.HotelManagementAppV2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
