package com.legacy.ecommerce.model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {



    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Integer id;
//
//
//    @NotEmpty
//    @Column(nullable = false)
//    private String firstName;
//
//    private String lastName;
//
//    @Column(nullable = false, unique = true)
//    @NotEmpty
//    @Email(message = "{errors.invalid_email}")
//    private String email;
//
//    @NotEmpty
//    private String password;
//
//    @ManyToMany
//    @JoinTable(
//            name = "user_role", joinColumns = {@JoinColumn(name = "ROLE_ID", referencedColumnName = "ID")},
//            inverseJoinColumns = {@JoinColumn(name = "ROLE_ID", referencedColumnName = "ID")}
//    )
//    private List<Role> roles;
//
//    public User(User user) {
//        this.firstName = user.getFirstName();
//        this.lastName = user.getLastName();
//        this.email = user.getEmail();
//        this.password = user.getPassword();
//        this.roles = user.getRoles();
//    }
//
//    public User(){
//
//    }
}
