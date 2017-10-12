
package controllers;

import modelos.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class InicioController {
    
    ModelAndView var;
    
    public InicioController()
    {
        var = new ModelAndView();
    }
    
    @RequestMapping("inicio.onion")
    public ModelAndView inicio()
    {
        var.setViewName("vistas/inicio");
        return var;
    }
    
    @RequestMapping(value="formulario.onion", method=RequestMethod.GET)
    public ModelAndView formulario()
    {
        return new ModelAndView("vistas/formulario", "command", new Persona());
    }
    
    @RequestMapping(value="formulario.onion", method=RequestMethod.POST)
    public String formulario(Persona per, ModelMap model)
    {
        model.addAttribute("nombre", per.getNombre());
        model.addAttribute("email", per.getEmail());
        model.addAttribute("edad", per.getEdad());
        
        return "vistas/exito";
    }
    
    
}
