package hr.koios.projecttool.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hr.koios.projecttool.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project,Long> {

    @Override
    Iterable<Project> findAllById(Iterable<Long> iterable);

    Project findByProjectIdentifier(String projectId);

    Iterable<Project> findAllByProjectLeader(String name);
}
