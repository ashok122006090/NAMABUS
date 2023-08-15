package springboot.namabus.service;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springboot.busnama.dto.UserDTO;
import springboot.namabus.dao.UserRepository;
import springboot.namabus.entities.UserEntity;

 


 

@Service
public class AdminServiceImpl implements AdminService {

 

    @Autowired
    private UserRepository userRepository;

 

    

 

 

    
    @Override
    public List<UserDTO> viewAllUsers() {
        List<UserEntity> users = userRepository.findAll();
        return users.stream()
                .map(user -> new UserDTO( user.getUsername(),user.getPassword(), user.getRoles()))
                .collect(Collectors.toList());
    }

 

  

 

}