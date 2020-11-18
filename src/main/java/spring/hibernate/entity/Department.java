package spring.hibernate.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "department")
    private List<Employee> employeeList;

    public Department() {}

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department(" +
                "id={" + id + "}, " +
                "name={" + name + "}" +
                ")";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return this.employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void addEmployee(Employee emp) {
        if (employeeList == null) {
            employeeList = new ArrayList<>();
        }
        employeeList.add(emp);
    }
}
