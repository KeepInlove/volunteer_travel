package yqc.volunteer_travel.repository;

import yqc.volunteer_travel.model.Hotel;
import yqc.volunteer_travel.model.User;
import yqc.volunteer_travel.model.UserHotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserHotelRepository extends JpaRepository<UserHotel, String>, JpaSpecificationExecutor<UserHotel> {
    List<UserHotel> findUserHotelsByUser(User user);

    UserHotel findUserHotelByHotelAndUser(Hotel hotel, User user);

}
