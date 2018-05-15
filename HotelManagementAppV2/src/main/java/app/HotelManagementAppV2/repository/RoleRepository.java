package app.HotelManagementAppV2.repository;

import app.HotelManagementAppV2.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
