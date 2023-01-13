package facades;

import dtos.EmployeeDTO;
import dtos.RenameMeDTO;
import dtos.UserDTO;
import entities.Employee;
import entities.RenameMe;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

//import errorhandling.RenameMeNotFoundException;
import entities.User;
import utils.EMF_Creator;

/**
 *
 * Rename Class to a relevant name Add add relevant facade methods
 */
public class FacadeExample {

    private static FacadeExample instance;
    private static EntityManagerFactory emf;
    
    //Private Constructor to ensure Singleton
    private FacadeExample() {}
    
    
    /**
     * 
     * @param _emf
     * @return an instance of this facade class.
     */
    public static FacadeExample getFacadeExample(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new FacadeExample();
        }
        return instance;
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public UserDTO create(UserDTO userDTO){
        User user = new User(userDTO.getUsername(), userDTO.getPassword());
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return new UserDTO(user);
    }
    public EmployeeDTO create(EmployeeDTO employeeDTO){
        Employee employee = new Employee(employeeDTO.getName(), employeeDTO.getAddress(), employeeDTO.getSalary());
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(employee);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return new EmployeeDTO(employee);
    }


    public RenameMeDTO getById(long id) { //throws RenameMeNotFoundException {
        EntityManager em = emf.createEntityManager();
        RenameMe rm = em.find(RenameMe.class, id);
//        if (rm == null)
//            throw new RenameMeNotFoundException("The RenameMe entity with ID: "+id+" Was not found");
        return new RenameMeDTO(rm);
    }

    public Employee getEmployeeById(Integer id) {
        EntityManager em = emf.createEntityManager();
        Employee employee = em.find(Employee.class, id);
        return employee;
    }
    public Employee getEmployeeByName(String name) {
        EntityManager em = emf.createEntityManager();
        Employee employee = em.find(Employee.class, name);
        return employee;
    }
    public List<Employee> getAllEmployees() {
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("select e from Employee e");
        List<Employee> employeeList = new ArrayList<>();
        employeeList = q.getResultList();
        return employeeList;
    }

    public List<Employee> getEmployeesWithHighestSalary() {
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("select e.salary from Employee e ORDER BY e.salary DESC");
        List<Employee> employeeList = new ArrayList<>();
        employeeList = q.getResultList();
        return employeeList;

    }

    public void createEmployee(Employee employee) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(employee);
            em.getTransaction().commit();
        } finally {
            em.close();
        }

    }

    
    //TODO Remove/Change this before use
    public long getRenameMeCount(){
        EntityManager em = getEntityManager();
        try{
            long renameMeCount = (long)em.createQuery("SELECT COUNT(r) FROM RenameMe r").getSingleResult();
            return renameMeCount;
        }finally{  
            em.close();
        }
    }
    
    public List<RenameMeDTO> getAll(){
        EntityManager em = emf.createEntityManager();
        TypedQuery<RenameMe> query = em.createQuery("SELECT r FROM RenameMe r", RenameMe.class);
        List<RenameMe> rms = query.getResultList();
        return RenameMeDTO.getDtos(rms);
    }
    
    public static void main(String[] args) {
        emf = EMF_Creator.createEntityManagerFactory();
        FacadeExample fe = getFacadeExample(emf);
        fe.getAll().forEach(dto->System.out.println(dto));
    }

}
