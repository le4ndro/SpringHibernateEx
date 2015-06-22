package net.leandroabreu.springhibernateex.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "EMPREGADO")
public class Empregado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min = 3, max = 50)
    @Column(name = "NOME", nullable = false)
    private String nome;

    @NotNull
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(name = "DT_ADMISSAO", nullable = false)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate dataAdmissao;

    @NotNull
    @Digits(integer = 8, fraction = 2)
    @Column(name = "SALARIO", nullable = false)
    private BigDecimal salario;

    @NotEmpty
    @Column(name = "MATRICULA", unique = true, nullable = false)
    private String matricula;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result
                + ((matricula == null) ? 0 : matricula.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Empregado)) {
            return false;
        }
        Empregado other = (Empregado) obj;
        if (id != other.id) {
            return false;
        }
        if (matricula == null) {
            if (other.matricula != null) {
                return false;
            }
        } else if (!matricula.equals(other.matricula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Empregado [id=" + id + ", nome=" + nome + ", dataAdmissao="
                + dataAdmissao + ", salario=" + salario + ", matricula="
                + matricula + "]";
    }

}
