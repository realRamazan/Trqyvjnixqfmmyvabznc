package com.example.Trqyvjnixqfmmyvabznc.construsctor;

import com.example.Trqyvjnixqfmmyvabznc.entity.User;
import com.example.Trqyvjnixqfmmyvabznc.model.UserMongoDB;
import com.example.Trqyvjnixqfmmyvabznc.repository.UserMongoDBRepository;
import com.example.Trqyvjnixqfmmyvabznc.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DbInit {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMongoDBRepository userMongoDBRepository;

    @PostConstruct
    private void postConstruct() {
        User user = new User(1, "Livramento", "2002", "586225", "787896", "27.10.2023");
        User user1 = new User(2, "McAllister", "1994", "235654", "412653", "27.10.2023");
        User user2 = new User(3, "Bellingham", "2003", "996633", "332211", "27.10.2023");
        User user3 = new User(4, "Ridtz", "1995", "775566", "7231456", "27.10.2023");
        User user4 = new User(5, "Russel", "1975", "552266", "447766", "27.10.2023");
        User user5 = new User(6, "Mendes", "1996", "224488", "336622", "27.10.2023");
        User user6 = new User(7, "Ferguson", "1989", "993344", "225588", "27.10.2023");
        User user7 = new User(8, "Dustin", "1990", "444422", "666633", "27.10.2023");
        User user8 = new User(9, "Alex", "1996", "7564283", "145264", "27.10.2023");
        User user9 = new User(10, "Oliver", "1988", "1124562", "5978465", "27.10.2023");
        userRepository.save(user);
        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        userRepository.save(user4);
        userRepository.save(user5);
        userRepository.save(user6);
        userRepository.save(user7);
        userRepository.save(user8);
        userRepository.save(user9);

        UserMongoDB userMongoDB = new UserMongoDB("Livramento", "2002", "586225", "787896", "27.10.2023");
        UserMongoDB userMongoDB1 = new UserMongoDB("McAllister", "1994", "235654", "412653", "27.10.2023");
        UserMongoDB userMongoDB2 = new UserMongoDB("Bellingham", "2003", "996633", "332211", "27.10.2023");
        UserMongoDB userMongoDB3 = new UserMongoDB("Ridtz", "1995", "775566", "7231456", "27.10.2023");
        UserMongoDB userMongoDB4 = new UserMongoDB("Russel", "1975", "552266", "447766", "27.10.2023");
        UserMongoDB userMongoDB5 = new UserMongoDB("Mendes", "1996", "224488", "336622", "27.10.2023");
        UserMongoDB userMongoDB6 = new UserMongoDB("Ferguson", "1989", "993344", "225588", "27.10.2023");
        UserMongoDB userMongoDB7 = new UserMongoDB("Dustin", "1990", "444422", "666633", "27.10.2023");
        UserMongoDB userMongoDB8 = new UserMongoDB("Alex", "1996", "7564283", "145264", "27.10.2023");
        UserMongoDB userMongoDB9 = new UserMongoDB("Oliver", "1988", "1124562", "5978465", "27.10.2023");

        userMongoDBRepository.save(userMongoDB);
        userMongoDBRepository.save(userMongoDB1);
        userMongoDBRepository.save(userMongoDB2);
        userMongoDBRepository.save(userMongoDB3);
        userMongoDBRepository.save(userMongoDB4);
        userMongoDBRepository.save(userMongoDB5);
        userMongoDBRepository.save(userMongoDB6);
        userMongoDBRepository.save(userMongoDB7);
        userMongoDBRepository.save(userMongoDB8);
        userMongoDBRepository.save(userMongoDB9);

    }

}
