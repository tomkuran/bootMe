package pl.tomkuran.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.tomkuran.domain.Project;
import pl.tomkuran.repository.ProjectRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Created by TKURAN on 3/18/2016.
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public Project create(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public Project getById(Integer id) {
        return projectRepository.findOne(id);
    }

    @Override
    public List<Project> get() {
        return StreamSupport.stream(projectRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public Project update(Integer id, Project project) {
        project.setId(id);
        return projectRepository.save(project);
    }

    @Override
    public void delete(Integer id) {
        projectRepository.delete(id);
    }
}
