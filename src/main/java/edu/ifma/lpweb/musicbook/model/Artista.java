package edu.ifma.lpweb.musicbook.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "artista")
public class Artista implements BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "artista", cascade = CascadeType.PERSIST)
    private List<Album> albums;

    @OneToMany(mappedBy = "autor")
    private List<Musica> musicasComoAutor = new ArrayList<>();

    @OneToMany(mappedBy = "interprete")
    private List<Musica> musicasInterpretadas = new ArrayList<>();

    @NotNull(message = "Não é possível ter uma artista sem um nome definido")
    @NotEmpty(message = "É necessário definir um nome para o artista")
    @Length(min = 3, max = 200, message = "Deve possuir {min} dígitos no mínimo")
    @Column(name = "nome")
    private String nome;

    @NotNull
    @NotEmpty
    @Column(name = "nacionalidade")
    private String nacionalidade;

        
    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artista artista = (Artista) o;
        return Objects.equals(id, artista.id) && Objects.equals(nome, artista.nome) && Objects.equals(nacionalidade, artista.nacionalidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, nacionalidade);
    }
}
