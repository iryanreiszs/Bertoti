package org.example.projeto2.controller;

import org.example.projeto2.model.Produto;
import org.example.projeto2.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@CrossOrigin // 👈 importante pro frontend
public class ProdutoController {

    @Autowired
    private ProdutoRepository repo;

    @GetMapping
    public List<Produto> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Produto criar(@RequestBody Produto p) {
        return repo.save(p);
    }

    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable Long id, @RequestBody Produto novo) {
        Produto p = repo.findById(id).orElse(null);
        if (p != null) {
            p.setNome(novo.getNome());
            p.setPreco(novo.getPreco());
            return repo.save(p);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
