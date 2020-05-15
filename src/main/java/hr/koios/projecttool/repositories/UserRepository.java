package hr.koios.projecttool.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hr.koios.projecttool.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
    User getById(Long id);
}
