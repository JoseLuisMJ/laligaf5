package dev.joseluis.laligaf5.models;

// import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "details")

public class teams {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "teams", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<detailsteams> detailslist;
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

    public List<detailsteams> getDetailslist() {
        return detailslist;
    }

    public void setDetailslist(List<detailsteams> detailslist) {
        this.detailslist = detailslist;
    } 

    @Column
    private String alavés;

    @Column
    private String almeria;

    @Column
    private String athleticdebilbao;

    @Column
    private String atleticodemadrid;

    @Column
    private String barcelona;

    @Column
    private String betis;

    @Column
    private String cadiz;

    @Column
    private String celta;

    @Column
    private String getafe;

    @Column
    private String girona;

    @Column
    private String granada;

    @Column
    private String laspalmas;

    @Column
    private String mallorca;

    @Column
    private String osasuna;

    @Column
    private String realmadrid;

    @Column
    private String sevilla;

    @Column
    private String valencia;

    @Column
    private String villarreal;

    @Column
    private String realsociedad;

    @Column
    private String rayovallecano;
}
