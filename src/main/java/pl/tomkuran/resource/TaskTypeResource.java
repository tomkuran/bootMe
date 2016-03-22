package pl.tomkuran.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.tomkuran.domain.Project;
import pl.tomkuran.domain.TaskType;
import pl.tomkuran.service.TaskTypeService;

import java.util.List;

/**
 * Created by Jazupitoal on 22.03.2016.
 */
@RestController
public class TaskTypeResource {

    @Autowired
    private TaskTypeService taskTypeService;

    /*POST /v1/taskTypes/ */
    @RequestMapping(value = "/v1/taskTypes/", method = RequestMethod.POST)
    TaskType save(@RequestBody TaskType taskType) {
        return taskTypeService.create(taskType);
    }

    @RequestMapping(value = "/v1/taskTypes/{id}", method = RequestMethod.PUT)
    TaskType update(@PathVariable Integer id, @RequestBody TaskType taskType) {
        return taskTypeService.update(id, taskType);
    }

    @RequestMapping(value = "/v1/taskTypes/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable Integer id) {
        taskTypeService.delete(id);
    }

    @RequestMapping(value = "/v1/taskTypes/{id}", method = RequestMethod.GET)
    TaskType getById(@PathVariable Integer id) {
        return taskTypeService.getById(id);
    }

    @RequestMapping(value = "/v1/taskTypes/", method = RequestMethod.GET)
    List<TaskType> get() {
        return taskTypeService.getAll();
    }
}
