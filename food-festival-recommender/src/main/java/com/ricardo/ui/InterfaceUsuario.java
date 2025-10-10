package com.ricardo.ui;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.ricardo.data.DataBaseSimulada;
import com.ricardo.model.Categoria;
import com.ricardo.model.Plato;
import com.ricardo.service.PlatoService;

public class InterfaceUsuario {
    PlatoService platoService;
    Scanner entrada;
    boolean salir;
    int respuesta;

    public InterfaceUsuario() {
        platoService = new PlatoService(DataBaseSimulada.getPlatos());
        entrada = new Scanner(System.in);
        salir = false;
        respuesta = -1;
    }

    public void start() {
        do {
            System.out.println(":::::: MENU ::::::\n");
            System.out.println("1. filtrar platos por presupuesto y categoria");
            System.out.println("2. mostrar los 3 platos con menor cantidad de calorias");
            System.out.println("3. mostrar platos agrupados por categoria");
            System.out.println("4. salir\n");
            System.out.print("seleccione una opción: ");

            try {
                respuesta = entrada.nextInt();
                entrada.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Opcion invalida. Intente nuevamente.\n");
                entrada.nextLine();
                continue;
            }

            switch (respuesta) {
                case 1:
                    double presupuesto = -1;
                    try {
                        System.out.print("presupuesto: ");
                        presupuesto = entrada.nextDouble();
                        entrada.nextLine();
                    } catch (InputMismatchException e) {
                        entrada.nextLine();
                        System.out.println("Presupuesto no valido.");
                        break;
                    }

                    try{
                        System.out.print("categoria: ");
                        String categoria = entrada.nextLine();
                        List<Plato> resultadoFiltro = platoService.platosPorPresupuestoYCategoria(presupuesto, Categoria.valueOf(categoria.toUpperCase()));
                        if(resultadoFiltro.isEmpty()){
                            System.out.println("\nNo hay platos que cumplan con el criterio de busqueda.\n");
                            break;
                        }
                        System.out.println("\nLos platos que cumplen con el criterio de busqueda son: \n");
                        for(Plato plato: resultadoFiltro){
                            System.out.println(resultadoFiltro);
                        }
                    } catch(Exception e){
                        System.out.println("Por favor escriba un categoria valida entre:");
                        System.out.println("VEGANO, DULCE, PICANTE, BEBIDA, TRADICIONAL\n");
                    }
                    break;
                case 2:
                    System.out.println("Los 3 platos con menor cantidad de calorias son:\n");
                    List<Plato> resultadoFiltro = platoService.top3MenorCalorias();
                    for(Plato plato: resultadoFiltro){
                        System.out.println(plato);
                    }
                    break;
                case 3:
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.\n");
                    break;
            }
        } while (salir == false);
    }
}
