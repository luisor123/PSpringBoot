/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PSpringBoot.PSpringBoot.dao;

import com.PSpringBoot.PSpringBoot.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author LUIS ORTIZ
 */
public interface IPersonaDao extends JpaRepository<Persona, Long>{
    
}
