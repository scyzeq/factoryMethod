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
public class ZOO implements Animal {

    @Override
    public WhereTo whatAnimal(AnimalType animalType) {
    
        WhereTo whereTo = null;
        
        if(animalType == animalType.BIRD)
        {
            whereTo = new Cages();
        }
        else if (animalType == animalType.LIZARD)
        {
            whereTo = new Terrarium();
        }
        else if (animalType == animalType.MAMMAL)
        {
            whereTo = new OpenCages();
        }
        return whereTo;
    }     
}
