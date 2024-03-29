package br.com.api.farmacia.apirest.controllers;

import br.com.api.farmacia.apirest.dtos.DadosCadastroProduto;
import br.com.api.farmacia.apirest.entities.Produto;
import br.com.api.farmacia.apirest.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroProduto dados){
        repository.save(new Produto(dados));
//        System.out.println(dados);
    }

    @GetMapping
    public Page<Produto> listar(Pageable pagination){
        return repository.findAll(pagination);
    }

    @GetMapping(value = "/{id}")
    public Produto listarPorId(@PathVariable Long id){
        return repository.getReferenceById(id);
    }

    @PutMapping()
    @Transactional
    public void atualizarProduto(@RequestBody DadosCadastroProduto dados){
        var idSelecionado = repository.getReferenceById(dados.id());
        idSelecionado.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id){
        repository.deleteById(id);
    }
}
