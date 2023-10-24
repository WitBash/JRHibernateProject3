package com.bashko.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "city", schema = "world")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @Column(name = "district", nullable = false)
    private String district;

    @Column(name = "population")
    private Integer population;
}
