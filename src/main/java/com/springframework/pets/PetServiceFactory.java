package com.springframework.pets;

/**
 * Created by Ihor Sukalin on 04.01.2023
 *
 * @author : Ihor Sukalin
 * date : 04.01.2023
 * project : sfg-di
 */

public class PetServiceFactory {

    public PetService getPetService(String petType) {
        switch (petType) {
            case "catPetService" : return new DogPetService();
            case "dogPetService" : return new CatPetService();
            default: return new DogPetService();
        }

    }
}
