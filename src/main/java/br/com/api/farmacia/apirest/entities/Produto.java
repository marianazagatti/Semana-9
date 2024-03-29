package br.com.api.farmacia.apirest.entities;

import br.com.api.farmacia.apirest.dtos.DadosCadastroFabricante;
import br.com.api.farmacia.apirest.dtos.DadosCadastroProduto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="produtos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Double preco;
    @ManyToOne
    @JoinColumn(name="fabricante_id")
    private Fabricante fabricante;

    public Produto(DadosCadastroProduto dados) {
        this.id = dados.id();
        this.nome = dados.nome();
        this.descricao = dados.descricao();
        this.preco = dados.preco();
        this.fabricante = new Fabricante(dados.fabricante());
    }

    public void atualizarInformacoes(DadosCadastroProduto dados) {
        if(dados.nome() != null){
            this.nome = dados.nome();
        }

        if(dados.descricao() != null){
            this.descricao = dados.descricao();
        }

        if(dados.preco() != null){
            this.preco = dados.preco();
        }

        if(dados.fabricante() != null){
            this.fabricante.atualizarInformacoes(dados.fabricante());
        }

    }
}
