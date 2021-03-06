package db;

import java.util.List;
import util.DatabaseException;

/**
 * Created by Lukas on 8-2-2016.
 */
public interface Database<E> {

    public void add(E object) throws DatabaseException;
    public void update(E object) throws DatabaseException;
    public E get(Object id) throws DatabaseException;
    public List<E> getAll() throws DatabaseException;
    public void delete(E Object) throws DatabaseException;
    public void closeConnection() throws DatabaseException;

}
