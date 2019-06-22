package pl.coderslab.users;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class User{

    @Id
    private Long id;

    @NotBlank
    @Size(min = 3, max = 15)
    private String name;

    @NotBlank
    private Integer phoneNumber;

    @NotBlank
    private Date date;

    public User(Long id, @NotBlank @Size(min = 3, max = 15) String name, @NotBlank Integer phoneNumber, @NotBlank Date date) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User() {
    }
}
