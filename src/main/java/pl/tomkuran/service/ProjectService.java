package pl.tomkuran.service;

import pl.tomkuran.domain.Project;

import java.util.List;

/**
 * Created by TKURAN on 3/18/2016.
 */
public interface ProjectService {
    Project create(Project project);

    Project getById(Integer id);

    List<Project> get();

    Project update(Integer id, Project project);

    void delete(Integer id);
}
