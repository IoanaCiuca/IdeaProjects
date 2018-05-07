package app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private String password;
//    private String deleted_at;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public String getDeleted_at() {
//        return deleted_at;
//    }
//
//    public void setDeleted_at(String deleted_at) {
//        this.deleted_at = deleted_at;
//    }

    public User() {


    }

    public User(String id, String name, String email, String password, String deleted_at) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
//        this.deleted_at = deleted_at;
    }
}
