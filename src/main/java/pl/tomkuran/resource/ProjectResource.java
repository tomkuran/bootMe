package pl.tomkuran.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.tomkuran.domain.Project;
import pl.tomkuran.service.ProjectService;

import java.util.List;

/**
 * Created by TKURAN on 3/18/2016.
 */
@RestController
public class ProjectResource {
    @Autowired
    ProjectService projectService;

    /*POST /v1/persons/ */
    @RequestMapping(value = "/v1/projects/", method = RequestMethod.POST)
    Project save(@RequestBody Project project) {
        return projectService.create(project);
    }

    @RequestMapping(value = "/v1/projects/{id}", method = RequestMethod.PUT)
    Project update(@PathVariable Integer id, @RequestBody Project project) {
        return projectService.update(id, project);
    }

    @RequestMapping(value = "/v1/projects/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable Integer id) {
        projectService.delete(id);
    }

    @RequestMapping(value = "/v1/projects/{id}", method = RequestMethod.GET)
    Project getById(@PathVariable Integer id) {
        return projectService.getById(id);
    }

    @RequestMapping(value = "/v1/projects/", method = RequestMethod.GET)
    List<Project> get() {
        return projectService.get();
    }
}
