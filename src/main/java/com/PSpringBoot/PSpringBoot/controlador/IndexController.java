package com.PSpringBoot.PSpringBoot.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LUIS ORTIZ
 */
@RestController
@RequestMapping("index")
public class IndexController {
    
    @GetMapping("mensaje")
    public String mensaje(){
        return "Luis jean Carlos";
    }
    @GetMapping("arreglo")
    public int[] arreglo(){
        int variable[]={1,2,3,4,5,6};
        return variable;
    }
    
    @GetMapping("sumar")
    public int suma(){
        int n1,n2,rpta;
        n1= 40;
        n2= 50;
        
        rpta =n1+n2;
       return rpta; 
    }
    
}
