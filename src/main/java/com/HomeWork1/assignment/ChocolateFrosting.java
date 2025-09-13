package com.HomeWork1.assignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ChocolateFrosting implements Frosting{

    @Override
    public String getFrostingType() {
        return "Chocolate Frosting";
    }
}
