package Task_13_15.Program;

import java.util.ArrayList;
import java.util.Collection;

public class PetsBase implements DataBase<Pet> {

    private ArrayList<Pet> petsCollection = new ArrayList<>();


    @Override
    public void add(Pet item) {
        petsCollection.add(item);
    }

    @Override
    public Collection<Pet> getAll() {
        return petsCollection;
    }

}
