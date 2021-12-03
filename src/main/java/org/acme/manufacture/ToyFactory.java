package org.acme.manufacture;

import org.acme.commons.Present;

import java.util.Random;

public record ToyFactory(int maxWeight, int maxValue) {

    private static final Random r = new Random();

    public Present createPresent() {
        return new Present(r.nextInt(maxWeight), r.nextInt(maxValue));
    }

}
