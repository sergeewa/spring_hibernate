package hiber.dao;

import hiber.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();
   User getUserByCar(String model, int series);
}
