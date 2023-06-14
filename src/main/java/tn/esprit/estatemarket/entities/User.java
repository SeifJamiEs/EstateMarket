package tn.esprit.estatemarket.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private Set<Offer> offers;

    @ManyToMany
    @JsonIgnore
    private Set<Role> roles;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private Set<Complaint> complaints;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private Set<Feedback> feedbacks;
}