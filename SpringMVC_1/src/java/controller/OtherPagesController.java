
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class OtherPagesController 
{
 
    @RequestMapping("productos.htm")
    public ModelAndView productos()
    {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("productos");
        return mav;
    }
    
    
    @RequestMapping("contacto.htm") 
    public ModelAndView contacto()
    {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("contacto");
        return mav;
    }
    
    
    
}
