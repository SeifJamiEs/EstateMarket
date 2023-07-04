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
public class Offer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String name;
    private String location;
    private String category;
    private String price;
    private String type;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private Zone zone;

}