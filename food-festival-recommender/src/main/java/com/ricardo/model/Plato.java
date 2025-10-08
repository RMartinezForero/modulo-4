package com.ricardo.model;

public class Plato {
    private String nombrePlato;
    private double costo;
    private int calorias;
    private Categoria categoria;
    private Stand stand;

    public Plato(String nombrePlato, double costo, int calorias, Categoria categoria, Stand stand) {
        this.nombrePlato = nombrePlato;
        this.costo = costo;
        this.calorias = calorias;
        this.categoria = categoria;
        this.stand = stand;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Stand getStand() {
        return stand;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    @Override
    public String toString() {
        return "Plato [nombrePlato=" + nombrePlato + ", costo=" + costo + ", calorias=" + calorias + ", categoria="
                + categoria + ", stand=" + stand + "]";
    }
}

