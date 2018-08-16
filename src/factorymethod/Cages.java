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
public class Cages extends WhereTo{
    
    public Cages()
    {
        animalType = AnimalType.BIRD;
    }
    
    protected void addBird()
    {
        System.out.println("New place in cage needs to be added...");
    }
    
    @Override
    public WhereTo getWhereTo()
    {
        addBird();
        return this;
    }
}
