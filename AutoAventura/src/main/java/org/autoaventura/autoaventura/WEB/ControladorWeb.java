package org.autoaventura.autoaventura.WEB;


import lombok.extern.slf4j.Slf4j;
import org.autoaventura.autoaventura.Service.Persona.VehiculoService;
import org.autoaventura.autoaventura.dominio.Vehiculos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorWeb {

    @Autowired
    private VehiculoService vehiculoService;


    @GetMapping("/")
    public String inicio() {
        return "inicio";
    }

    @GetMapping("/sobrenosotros")
    public String sobrenosotros() {
        return "sobrenosotros";
    }

    @GetMapping("/contacto")
    public String contacto() {
        return "contacto";
    }

    @GetMapping("/listadeautos")
    public String listadeautos() {
        return "listadeautos";
    }
}
