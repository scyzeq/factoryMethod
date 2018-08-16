/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author AJuda
 */
public class OpenCages extends WhereTo{
    
    public OpenCages()
    {
        animalType = AnimalType.MAMMAL;
    }
    
    protected void addOpenCages()
    {
        System.out.println("New place in open spaces needs to be added...");
    }
    
    @Override
    public WhereTo getWhereTo()
    {
        addOpenCages();
        return this;
    }
}
