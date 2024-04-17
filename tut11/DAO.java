package PR2.tut11;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public abstract class DAO <Entity extends Serializable>   {
    ArrayList<Entity> lmao = new ArrayList<Entity>();

    public boolean add (Entity entitY) {
        return lmao.add(entitY);
    }
    public boolean remove (Entity enTity) {
       return lmao.remove(enTity);
    }

    public abstract boolean update (Entity entIty);

    public abstract Entity find(Serializable id);




    public ArrayList<Entity> getList () {
        ArrayList<Entity> bruh = new ArrayList<Entity>();
        for(int i =0; i <= lmao.size(); i++) {
            bruh.add(lmao.get(i));
        }
        return bruh;
    }



}
