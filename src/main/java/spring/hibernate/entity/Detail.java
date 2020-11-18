package spring.hibernate.entity;

import javax.persistence.*;

@Entity
@Table(name="details")
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "city")
    private String city;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "email")
    private String email;
    @OneToOne(mappedBy = "detail")
    private Employee employee;

    public Detail(){}

    public Detail(String city, String phoneNumber, String email){
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Details=(" +
                String.format("id={%d}", id) + ", " +
                String.format("city={%s}", city) + ", " +
                String.format("phoneNumber={%s}", phoneNumber) + ", " +
                String.format("email={%s}", email) +
                ")";
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
