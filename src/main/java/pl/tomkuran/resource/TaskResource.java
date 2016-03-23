package pl.tomkuran.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import pl.tomkuran.domain.Task;
import pl.tomkuran.domain.TaskType;
import pl.tomkuran.service.TaskService;
import pl.tomkuran.service.TaskTypeService;

import java.util.List;

/**
 * Created by Jazupitoal on 22.03.2016.
 */
@RestController
public class TaskResource {
    @Autowired
    private TaskService taskService;

    /*POST /v1/tasks/ */
    @RequestMapping(value = "/v1/tasks/", method = RequestMethod.POST)
    Task save(@RequestBody Task task) {
        return taskService.create(task);
    }

    @RequestMapping(value = "/v1/tasks/{id}", method = RequestMethod.PUT)
    Task update(@PathVariable Integer id, @RequestBody Task task) {
        return taskService.update(id, task);
    }

    @RequestMapping(value = "/v1/tasks/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable Integer id) {
        taskService.delete(id);
    }

    @RequestMapping(value = "/v1/tasks/{id}", method = RequestMethod.GET)
    Task getById(@PathVariable Integer id) {
        return taskService.getById(id);
    }

    @RequestMapping(value = "/v1/tasks/{page}/{pageSize}", method = RequestMethod.GET)
    List<Task> get(@PathVariable("page") Integer page, @PathVariable("pageSize") Integer pageSize) {
        return taskService.getPage(page, pageSize);
    }
}
