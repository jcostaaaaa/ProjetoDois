package com.example.projetodois;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ESTADOSENCOMENDA", schema = "PROJETOBD", catalog = "")
public class EstadosencomendaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_ESTADOENCOMENDA", nullable = false, precision = 0)
    private short idEstadoencomenda;
    @Basic
    @Column(name = "DESCRICAOESTADO", nullable = false, length = 50)
    private String descricaoestado;

    public short getIdEstadoencomenda() {
        return idEstadoencomenda;
    }

    public void setIdEstadoencomenda(short idEstadoencomenda) {
        this.idEstadoencomenda = idEstadoencomenda;
    }

    public String getDescricaoestado() {
        return descricaoestado;
    }

    public void setDescricaoestado(String descricaoestado) {
        this.descricaoestado = descricaoestado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EstadosencomendaEntity that = (EstadosencomendaEntity) o;
        return idEstadoencomenda == that.idEstadoencomenda && Objects.equals(descricaoestado, that.descricaoestado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEstadoencomenda, descricaoestado);
    }
}
