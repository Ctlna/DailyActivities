package com.example.DailyActivities.service;

import com.example.DailyActivities.model.Usuarios;
import com.example.DailyActivities.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuariosRepository usuariosRepository;

    public Usuarios guardarUsuario(Usuarios usuario) {
        return usuariosRepository.save(usuario);
    }
    public List<Usuarios> findAllUsuarios() {
        return usuariosRepository.findAll();
    }
    public Optional<Usuarios> buscarPorIdUsuario(Long id) {
        return usuariosRepository.findById(id);
    }
    public Usuarios editarUsuario(Long id, Usuarios usuariodetalle) {
        Usuarios usuario = usuariosRepository.findById(id).orElseThrow();
        usuario.setNombreUsuario(usuariodetalle.getNombreUsuario());
        usuario.setEmail(usuariodetalle.getEmail());
        usuario.setContrasenaHash(usuariodetalle.getContrasenaHash());
        return usuariosRepository.save(usuario);
    }
    public void eliminarCarrito(Long idusu){
        usuariosRepository.deleteById(idusu);
    }
}
