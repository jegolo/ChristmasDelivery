package santa.claus.delivery;

import santa.claus.delivery.Package;

import java.util.ArrayList;
import java.util.List;

public class Sleight {

    private double maxWeight = 2000;

    private List<Package> packages = new ArrayList<>();

    public double getMaxWeight() {
        return maxWeight;
    }

    public double getCurrentWeight() {
        return packages.stream().mapToDouble(i -> i.toy().weight()).sum();
    }

    public void add(Package packe) {
        try {
            Thread.sleep(Math.round(Math.random() * 500));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        packages.add(packe);
    }

    boolean hasCapacity() {
        return getCurrentWeight() < getMaxWeight();
    }
}
