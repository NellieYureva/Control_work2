package Animals.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class AnimalsList implements Iterable <Animal> {
    
    private List<Animal> animals = new ArrayList<>();

    public AnimalsList addAnimal(Animal newAnimal) {
        this.animals.add(newAnimal);
        return this;
    }

    public int sizeList() {
        return animals.size();
    }

    @Override
    public Iterator<Animal> iterator() {
        return new Iterator<Animal>() {
            int counter = 0;

            @Override
            public boolean hasNext() {
                if (counter < animals.size())
                    return true;
                return false;
            }

            @Override
            public Animal next() {
                return animals.get(counter++);
            }
        };
    }
}
