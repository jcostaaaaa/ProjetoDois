package com.example.projetodois;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TIPOPAGAMENTOS", schema = "PROJETOBD", catalog = "")
public class TipopagamentosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TIPOPAGAMENTOID", nullable = false, precision = 0)
    private short tipopagamentoid;
    @Basic
    @Column(name = "DESCRICAO", nullable = false, length = 100)
    private String descricao;

    public short getTipopagamentoid() {
        return tipopagamentoid;
    }

    public void setTipopagamentoid(short tipopagamentoid) {
        this.tipopagamentoid = tipopagamentoid;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipopagamentosEntity that = (TipopagamentosEntity) o;
        return tipopagamentoid == that.tipopagamentoid && Objects.equals(descricao, that.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipopagamentoid, descricao);
    }
}
