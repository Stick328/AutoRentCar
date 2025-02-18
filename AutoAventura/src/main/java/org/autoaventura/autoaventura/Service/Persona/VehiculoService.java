package org.autoaventura.autoaventura.Service.Persona;

import org.autoaventura.autoaventura.dominio.Vehiculos;

import java.util.List;

public interface VehiculoService {

    public List<Vehiculos> listarVehiculos();

    public void guardarVehiculos(Vehiculos vehiculos);

    public void eliminarVehiculos(Vehiculos vehiculos);

    public Vehiculos encontrarVehiculos(Vehiculos vehiculos);


}
