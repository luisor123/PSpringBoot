package com.PSpringBoot.PSpringBoot.controlador;

import com.PSpringBoot.PSpringBoot.dao.IPersonaDao;
import com.PSpringBoot.PSpringBoot.entidades.Persona;
import com.PSpringBoot.PSpringBoot.servicio.IIndexServicio;
import org.springframework.beans.factory.annotation.Autowired;
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
    
    @Autowired
    public IIndexServicio indexServicio;
    @Autowired
    public IPersonaDao ipersonaDao;
    
    @GetMapping("ListarPersona")
     public Persona obtenerPersona(){
         return ipersonaDao.findOne(new Long(1));
     }
    
    @GetMapping("mensaje")
    public String mensaje(){
        String MensajedeServicio= indexServicio.devolverMensaje();
        return MensajedeServicio+ "Luis jean Carlos";
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
