package gm.empleados.controlador;

import gm.empleados.modelo.Empleado;
import gm.empleados.servicio.EmpleadoServicio;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class IndexControlador {
    private static final Logger logger = LoggerFactory.getLogger(IndexControlador.class);

    @Autowired
    EmpleadoServicio empleadoServicio;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String iniciar(ModelMap modelo) {
        List<Empleado> empleados = empleadoServicio.listarEmpleados();
        empleados.forEach((empleado) -> logger.info(empleado.toString()));
        System.out.println("Empleados Size: " + empleados.size());
        modelo.addAttribute("empleados", empleados);
        modelo.put("empleados", empleados);// Compartir el modelo con la vista
        return "index";//index.jsp
    }

    @RequestMapping(value = "/agregar",method = RequestMethod.GET)
    public String mostrarAgregar(){
        return "agregar";//agregar.jsp
    }

    @RequestMapping(value = "/agregar",method = RequestMethod.POST)
    public String agregar(@ModelAttribute("empleadoForma") Empleado empleado){
        logger.info("Agregar Empleado: " + empleado);
        empleadoServicio.guardarEmpleado(empleado);
        return "redirect:/";
    }
}
