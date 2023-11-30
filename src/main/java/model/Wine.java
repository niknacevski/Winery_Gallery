package model;

import jakarta.persistence.*;
import lombok.*;



@Table(name = "wine")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity
public class Wine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer year;
    private String description;
    private String name;
    @ManyToOne
    @JoinColumn(name = "winery_id")
    private Winery winery;


}
