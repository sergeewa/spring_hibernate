package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column (name = "user_id")
   private Long id;

   @Column
   private String firstName;

   @Column
   private String lastName;

   @Column
   private String email;

   public User() {}

   @OneToOne (cascade=CascadeType.ALL)
   @JoinColumn (name = "user_id")
   private Car car;

   public User(String firstName, String lastName, String email) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
   }

   public User(String firstName, String lastName, String email, Car car) {

      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.car = car;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public Car getCar() {
      return car;
   }

   public User setCar(Car car) {
      car.setUser(this);
      this.car = car;
      return this;
   }

   @Override
   public String toString() {
      return "User:\n" +
              "firstName = " + firstName + '\n' +
              "lastName = " + lastName + '\n' +
              "email = " + email + '\n' +
              "car = " + car;
   }
}
