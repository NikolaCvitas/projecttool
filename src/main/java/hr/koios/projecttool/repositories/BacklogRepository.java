package hr.koios.projecttool.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hr.koios.projecttool.domain.Backlog;

@Repository
public interface BacklogRepository extends CrudRepository<Backlog,Long> {

     Backlog findByProjectIdentifier(String Identifier);
}
