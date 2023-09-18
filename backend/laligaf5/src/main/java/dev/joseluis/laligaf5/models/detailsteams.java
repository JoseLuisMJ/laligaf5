package dev.joseluis.laligaf5.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "details")

public class detailsteams {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_teams")
    private teams teams;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public teams getTeams() {
        return teams;
    }

    public void setTeams(teams teams) {
        this.teams = teams;
    }

    
    @Column
    private String imagen;

    @Column
    private String pais;

    @Column
    private long fundacion;

    @Column
    private String presidente;

    @Column
    private String entrenador;

    @Column
    private String type;

    @Column
    private String sede;

    @Column
    private long aforo;

    @Column
    private String direccion;
}
