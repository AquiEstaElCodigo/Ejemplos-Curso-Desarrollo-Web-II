/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController 
{
    
    ModelAndView mav;
    
    public HomeController()
    {
        mav = new ModelAndView();
    }
    
    @RequestMapping("home.htm")
    public ModelAndView home()
    {
        mav.setViewName("home");
        return mav;
    }
   
    @RequestMapping("inicio.htm")
    public ModelAndView inicio()
    {
        mav.setViewName("inicio");
        return mav;
    }
}
