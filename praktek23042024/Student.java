/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek23042024;

/**
 *
 * @author user
 */
public class Student extends Person{
    public Student(){
        super();
        super.name = "Ayu";
        super.address = "Padang";
        
        //super("ayu", "Padang");
        System.out.println("Student constructor");
    }
    
    @Override
    public String getName(){
        System.out.println("Student: getName");
        return name;
    }
    
}
 