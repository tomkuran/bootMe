package pl.tomkuran.service;

import pl.tomkuran.domain.Project;

import java.util.List;

/**
 * Created by TKURAN on 3/18/2016.
 */
public interface ProjectService {
    Project create(Project person);

    Project getById(Integer id);

    List<Project> get();

    Project update(Integer id, Project person);

    void delete(Integer id);
}
