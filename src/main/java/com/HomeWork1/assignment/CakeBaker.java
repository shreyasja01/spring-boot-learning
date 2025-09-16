package com.HomeWork1.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CakeBaker {
private final Frosting frosting;
private final Syrup syrup;

    @Autowired
    public CakeBaker(Frosting frosting, Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }
    public void bakeCake(){
        System.out.println("Bake a cake with " + frosting.getFrostingType() + " and " + syrup.getSyrupType() + "...");
    }
}
