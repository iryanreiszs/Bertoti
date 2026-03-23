package org.example.projeto1.controller;

import org.example.projeto1.model.Usuario;
import org.example.projeto1.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repo;

    // GET - listar todos
    @GetMapping
    public List<Usuario> listar() {
        return repo.findAll();
    }

    // GET - buscar por id
    @GetMapping("/{id}")
    public Usuario buscar(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    // POST - criar
    @PostMapping
    public Usuario criar(@RequestBody Usuario usuario) {
        return repo.save(usuario);
    }

    // PUT - atualizar
    @PutMapping("/{id}")
    public Usuario atualizar(@PathVariable Long id, @RequestBody Usuario novo) {
        Usuario u = repo.findById(id).orElse(null);
        if (u != null) {
            u.setNome(novo.getNome());
            u.setEmail(novo.getEmail());
            return repo.save(u);
        }
        return null;
    }

    // DELETE - deletar
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repo.deleteById(id);
    }
}