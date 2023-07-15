package Task_13_15.Program;

import java.util.Collection;

public interface DataBase <T>{

    void add(T item);


    Collection<T> getAll();

}
