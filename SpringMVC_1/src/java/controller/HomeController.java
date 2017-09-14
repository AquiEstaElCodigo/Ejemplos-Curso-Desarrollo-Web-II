
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller //con esta anotación le decimos al framework que esta clase será
//utilizada como un controlador.
public class HomeController
{
    
    //método formato de clases para java, clase que maneja el modelamiento
    //de vistas.
    @RequestMapping("home.htm") 
    //esta anotacion le dice al framework que este metodo
    //será una vista, pero esta anotacion recibe parametros 
    public ModelAndView home()
    {
        //creando objeto
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home");
        return mav;
    }
    
    
    
    @RequestMapping("nosotros.htm") 
    public ModelAndView nosotros()
    {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("nosotros");
        return mav;
    }
    
  
    
    

    
            
}
