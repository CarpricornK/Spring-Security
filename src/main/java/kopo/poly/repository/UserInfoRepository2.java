package kopo.poly.repository;

import kopo.poly.repository.entity.UserInfoEntity;
import kopo.poly.repository.entity.UserInfoEntity2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInfoRepository2 extends JpaRepository<UserInfoEntity2, String> {


    Optional<UserInfoEntity2> findByUserId(String userId);

    Optional<UserInfoEntity2> findByUserIdAndPassword(String userId, String password);


}
