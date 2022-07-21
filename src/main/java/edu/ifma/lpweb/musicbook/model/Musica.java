package edu.ifma.lpweb.musicbook.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "musica")
public class Musica implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "autor_id")
    private Artista autor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "interprete_id")
    private Artista interprete;

    @NotNull(message = "Não é possível ter uma musica sem um nome definido")
    @NotEmpty(message = "É necessário definir um nome para a musica")
    @Length(min = 3, max = 200, message = "Deve possuir {min} dígitos no mínimo")
    @Column(name = "nome")
    private String nome;

    @NotNull
    @NotEmpty
    @Length(min = 3, max = 5, message = "Deve possuir duração de no minímo {min}")
    @Column(name = "duracao")
    private Integer duracao;

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }
}
