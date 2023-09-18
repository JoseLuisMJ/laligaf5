package dev.joseluis.laligaf5.models;

import lombok.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "staff")


public class staff {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_teams")
    private staff staff;

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

    public staff getStaff() {
        return staff;
    }

    public void setStaff(staff staff) {
        this.staff = staff;
    }
    
    @Column
    private String imagen;

    @Column
    private String nombre;

    @Column
    private String nombrecompleto;

    @Column
    private long fechanacimiento;

    @Column
    private String edad;

    @Column
    private String pais;

    @Column
    private String altura;

    @Column
    private long vecesinternacional;

    @Column
    private String demarcacion;

    @Column
    private String peso;
}
