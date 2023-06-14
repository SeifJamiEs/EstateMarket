package tn.esprit.estatemarket.entities;

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
public class ChatGroup implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private GroupType type;
    private String description;
    @OneToMany(mappedBy = "chatGroup")
    private Set<Message> messages;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<User> users;
}