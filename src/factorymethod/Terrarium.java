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
public class Terrarium extends WhereTo{
    
    public Terrarium()
    {
        animalType = AnimalType.LIZARD;
    }
    
    protected void addTerrarium()
    {
        System.out.println("New terrarium needs to be added...");
    }
    
    @Override
    public WhereTo getWhereTo()
    {
        addTerrarium();
        return this;
    }
}
