package org.acme.logistics;

import org.acme.commons.Present;

import java.util.ArrayList;
import java.util.List;

public class Sleigh {

    private final int maxWeight;

    private List<Present> presents = new ArrayList<>();

    public Sleigh(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void pack(Present present) throws OverweightException {
        if (restCapacity() >= present.weight()) {
            presents.add(present);
        } else {
            throw new OverweightException();
        }
    }

    public int currentWeight() {
        return presents.stream().mapToInt(Present::weight).sum();
    }

    public List<Present> getPresents() {
        return presents;
    }

    public int restCapacity() {
        return maxWeight - currentWeight() ;
    }
}
