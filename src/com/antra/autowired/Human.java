package com.antra.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    @Autowired
    @Qualifier("octpousHeart")
    // Heart is the dependency of Human
    private Heart heart;

//    public Human() {
//    }
//
//    public Human(Heart heart) {
//        this.heart = heart;
//        System.out.println("human constructor is getting called which has Heart as arg");
//    }

//    @Autowired
//    @Qualifier("octpousHeart")
//    public void setHeart(Heart heart) {
//        this.heart = heart;
//        System.out.println("setter method called");
//    }

    public void startPumping() {
        if (heart != null) {
            heart.pump();
            System.out.println("name of the animal is: " + heart.getNameOfAnimal() + " no of heart present: " + heart.getNoOfHeart());
        } else {
            System.out.println("dead");
        }
    }
}
