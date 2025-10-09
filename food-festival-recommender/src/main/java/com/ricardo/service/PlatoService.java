package com.ricardo.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.ricardo.model.Categoria;
import com.ricardo.model.Plato;

public class PlatoService {
    private List<Plato> platos;

    public PlatoService(List<Plato> platos){
        this.platos = platos;
    }

    public List<Plato> platosPorPresupuestoYCategoria(double presupuesto, Categoria categoria){
        List<Plato> platosFiltrados = platos.stream()
        .filter(plato -> (plato.getCosto() <= presupuesto) && (plato.getCategoria() == categoria))
        .sorted((a,b) -> Double.compare(a.getCosto(), b.getCosto()))
        .collect(Collectors.toList());

        return platosFiltrados;
    }
}
