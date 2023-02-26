package com.food4u.website;

import static org.assertj.core.api.Assertions.assertThat;
import com.food4u.website.entity.User;
import com.food4u.website.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import java.util.Calendar;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testCreateUser() {
        User user = new User();
        user.setFirstName("Sam");
        user.setLastName("Fisher");
        user.setEmail("Sam.Fisher@gmail.com");
        user.setPassword("SamF1234");
        user.setIsAdmin(true);
        user.setJoinDate(new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
        user.setAddress1("123 prince road");
        user.setAddress2("adasdasd");
        user.setCity("Birmingham");
        user.setPostcode("B47DDA");

        User savedUser = userRepository.save(user);
        User existUser = entityManager.find(User.class, savedUser.getId());
        assertThat(user.getEmail()).isEqualTo(existUser.getEmail());
    }
}
