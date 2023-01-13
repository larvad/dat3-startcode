/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dtos.EmployeeDTO;
import dtos.RenameMeDTO;
import dtos.UserDTO;
import entities.Employee;
import entities.RenameMe;
import javax.persistence.EntityManagerFactory;

import entities.User;
import utils.EMF_Creator;

/**
 *
 * @author tha
 */
public class Populator {
    public static void populate(){
        EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();
        FacadeExample fe = FacadeExample.getFacadeExample(emf);
        fe.create(new EmployeeDTO(new Employee("James", "1 Street", 1231)));

    }
    
    public static void main(String[] args) {
        populate();
    }
}
