package com.epi.gestion.dao.entity;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String telephone;

    @Column(name = "matricule_fiscale", unique = true,length = 100)
    private String matriculeFiscale;
}
