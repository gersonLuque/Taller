package org.modelo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Vehiculos {
    private Set<Vehiculo> vehiculos;

    public Vehiculos(){
        vehiculos = new HashSet<>();
    }
    public Set<Vehiculo> get(){ // todo es mejor un set o un list
        return new HashSet<>(vehiculos);
    }
    public void insertar(Vehiculo vehiculo){
        if (vehiculo != null) {
            vehiculos.add(vehiculo);
        }
    }
    public Vehiculo buscar(Vehiculo vehiculo){
        return vehiculos.stream()
                .filter(n -> n.equals(vehiculo))
                .findFirst()
                .orElse(null);
    }
    public void borrar(Vehiculo vehiculo){
        if (!vehiculos.contains(vehiculo))
            throw new IllegalArgumentException("El vehiculo no existe en la lista de vehiculos");
        else
            vehiculos.remove(vehiculo);
    }
}
