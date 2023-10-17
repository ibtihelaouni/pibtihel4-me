package tn.esprit.pidev.bns.entity.hadir;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategory;
    private String name;
    private String photo;
    private String description;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="category")
    private Set<Product> products;
}
