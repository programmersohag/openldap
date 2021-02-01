package com.sohag.openldap;

import com.sohag.openldap.model.User;
import org.springframework.data.ldap.repository.LdapRepository;

import java.util.List;

public interface UserRepository extends LdapRepository<User> {

    User findByUsernameAndPassword(String username, String password);

    List<User> findByUsernameLikeIgnoreCase(String username);

    User findByUsername(String username);
}
