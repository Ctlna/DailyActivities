package com.example.DailyActivities.service;

import com.example.DailyActivities.model.Actividades;
import com.example.DailyActivities.repository.ActividadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActividadesService {
    @Autowired
    private ActividadesRepository actividadesRepository;

    public Actividades guardarActividades(Actividades actividades) {
        return actividadesRepository.save(actividades);
    }
    public List<Actividades> listarActividades() {
        return actividadesRepository.findAll();
    }
    public Optional<Actividades> buscarActividades(Long id) {
        return actividadesRepository.findById(id);
    }
    public void eliminarActividades(Long id) {
        actividadesRepository.deleteById(id);
    }
    public Actividades actualizarActividades(Long id, Actividades actividades) {
        Actividades actividadesAux = actividadesRepository.findById(id).orElseThrow();
        actividadesAux.setUsuario_fk(actividades.getUsuario_fk());
        actividadesAux.setTitulo(actividades.getTitulo());
        actividadesAux.setDescripcion(actividades.getDescripcion());
        actividadesAux.setEstado(actividades.getEstado());
        actividadesAux.setPrioridad(actividades.getPrioridad());
        return actividadesRepository.save(actividadesAux);
    }
}
