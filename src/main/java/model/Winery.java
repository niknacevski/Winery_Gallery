package model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "winery")
@Getter
@Setter
@AllArgsConstructor
public class Winery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    private String description;
    private String website;
    private String email;
    @OneToMany(mappedBy = "winery")
    private List<Wine> wines;
    public Winery() {
        wines = new ArrayList<>();
    }
}
