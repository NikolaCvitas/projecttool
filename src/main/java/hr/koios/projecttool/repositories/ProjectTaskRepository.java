package hr.koios.projecttool.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hr.koios.projecttool.domain.ProjectTask;

import java.util.List;

@Repository
public interface ProjectTaskRepository extends CrudRepository<ProjectTask, Long> {

    List<ProjectTask> findByProjectIdentifierOrderByPriority(String id);

    ProjectTask findByProjectSequence(String sequence);
}
