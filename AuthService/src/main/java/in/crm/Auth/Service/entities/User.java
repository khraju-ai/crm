package in.crm.Auth.Service.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false,unique = true,length = 25)
    private String username;

    @Column(nullable = false,unique = true,length = 45)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role;  // ADMIN , SALES , LEARNER

    @Column(nullable = false)
    private boolean active=true;

}
