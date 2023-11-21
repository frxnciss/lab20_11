package com.example.Base_Conciertos.repository;

import com.example.Base_Conciertos.entity.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor,Integer> {
}
