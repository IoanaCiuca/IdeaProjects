package app.HotelManagementAppV2.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Role {
    @Id
    private int id;

    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    public Role(String name, List<User> users) {
        this.name = name;
        this.users = users;
    }

    public Role() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
