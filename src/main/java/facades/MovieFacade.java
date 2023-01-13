package facades;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class MovieFacade
{

    private static MovieFacade instance;
    private static EntityManagerFactory emf;

    //Private Constructor to ensure Singleton
    private MovieFacade() {}


    /**
     *
     * @param _emf
     * @return an instance of this facade class.
     */
    public static MovieFacade getInstance(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new MovieFacade();
        }
        return instance;
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }




}
