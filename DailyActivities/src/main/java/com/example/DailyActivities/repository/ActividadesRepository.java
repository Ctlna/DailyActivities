package com.example.DailyActivities.repository;

import com.example.DailyActivities.model.Actividades;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActividadesRepository extends JpaRepository<Actividades,Long> {
}
