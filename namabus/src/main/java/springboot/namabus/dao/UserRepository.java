package springboot.namabus.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot.namabus.entities.AdminEntity;
import springboot.namabus.entities.UserEntity;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

 



@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

 

    UserEntity findByUsername(String username);

 

    boolean existsByUsername(String username);

    List<UserEntity> findAll();


}

 