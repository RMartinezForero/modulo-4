package com.ricardo.data;

import java.util.Arrays;
import java.util.List;

import com.ricardo.model.Categoria;
import com.ricardo.model.Plato;
import com.ricardo.model.Stand;

public class DataBaseSimulada {

    public static List<Plato> getPlatos() {
        Stand stand1 = new Stand("Mexican Delights");
        Stand stand2 = new Stand("Sweet Treats");
        Stand stand3 = new Stand("Spicy Sensations");
        Stand stand4 = new Stand("Vegan Vibes");
        Stand stand5 = new Stand("Traditional Tastes");

        return Arrays.asList(
                new Plato("Tacos al pastor", 50.0, 300, Categoria.TRADICIONAL, stand1),
                new Plato("Churros", 30.0, 250, Categoria.DULCE, stand2),
                new Plato("Enchiladas", 60.0, 400, Categoria.PICANTE, stand3),
                new Plato("Vegan Burger", 70.0, 350, Categoria.VEGANO, stand4),
                new Plato("Horchata", 20.0, 150, Categoria.BEBIDA, stand5),
                new Plato("Guacamole", 40.0, 200, Categoria.VEGANO, stand1),
                new Plato("Flan", 35.0, 300, Categoria.DULCE, stand2),
                new Plato("Chili con carne", 80.0, 450, Categoria.PICANTE, stand3),
                new Plato("Vegan Tacos", 55.0, 320, Categoria.VEGANO, stand4),
                new Plato("Mole Poblano", 90.0, 500, Categoria.TRADICIONAL, stand5));

    }
}
