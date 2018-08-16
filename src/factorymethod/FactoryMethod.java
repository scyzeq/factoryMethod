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
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal animal = new ZOO();
        
        WhereTo mammal = animal.whatAnimal(AnimalType.MAMMAL);
        WhereTo bird = animal.whatAnimal(AnimalType.BIRD);
        WhereTo lizard = animal.whatAnimal(AnimalType.LIZARD);
        
        mammal.getWhereTo();
        bird.getWhereTo();
        lizard.getWhereTo();
    }
    
}
