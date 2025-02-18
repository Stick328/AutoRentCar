package org.autoaventura.autoaventura.WEB;



import lombok.extern.slf4j.Slf4j;
import org.autoaventura.autoaventura.Service.Persona.VehiculoService;
import org.autoaventura.autoaventura.dominio.Vehiculos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class  ControladorInicio  {

    @Autowired
    private VehiculoService vehiculoService;


    @GetMapping("/uno")
    public String inicio(Model model) {
        var vehiculo = vehiculoService.listarVehiculos();
        log.info("Ejecutando Controlador MVC");
        model.addAttribute("vehiculo", vehiculo);
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Vehiculos vehiculos) {

        return "modificar";
    }

    @PostMapping("/guardar")
        public String guardar(Vehiculos vehiculos){
            vehiculoService.guardarVehiculos(vehiculos);
            return "redirect:/uno";
    }

    @GetMapping("/editar/{id}")
    public String editar(Vehiculos vehiculos, Model model) {
        vehiculos = vehiculoService.encontrarVehiculos(vehiculos);
        model.addAttribute("vehiculos", vehiculos);
        System.out.println(vehiculos);
        return "modificar";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(Vehiculos vehiculos, Model model) {
        vehiculoService.eliminarVehiculos(vehiculos);
        model.addAttribute("vehiculos", vehiculos);
        System.out.println(vehiculos);
       return "redirect:/uno";
    }
}
