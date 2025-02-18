package org.autoaventura.autoaventura.Service.Persona;

import org.autoaventura.autoaventura.DAO.VehiculoDao;
import org.autoaventura.autoaventura.dominio.Vehiculos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VehiculoServiceImpl implements VehiculoService {

    @Autowired
    private VehiculoDao vehiculoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Vehiculos> listarVehiculos() {
        return  (List<Vehiculos>) vehiculoDao.findAll();
    }

    @Override
    @Transactional
    public void guardarVehiculos(Vehiculos vehiculos) {
        vehiculoDao.save(vehiculos);

    }

    @Override
    @Transactional
    public void eliminarVehiculos(Vehiculos vehiculos) {
        vehiculoDao.delete(vehiculos);
    }

    @Override
    @Transactional(readOnly = true)
    public Vehiculos encontrarVehiculos(Vehiculos vehiculos) {
        return vehiculoDao.findById(vehiculos.getId()).orElse(null);
    }
}
