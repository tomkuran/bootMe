package pl.tomkuran.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import pl.tomkuran.domain.Task;
import pl.tomkuran.repository.TaskRepository;

import java.util.List;

/**
 * Created by TKURAN on 3/21/2016.
 */
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepo;

    @Override
    public Task create(Task task) {
        return taskRepo.save(task);
    }

    @Override
    public Task getById(Integer id) {
        return taskRepo.findOne(id);
    }

    public List<Task> getPage(Integer page, Integer pageSize) {
        return taskRepo.findAll(new PageRequest(page,pageSize)).getContent();
    }

    @Override
    public Task update(Integer id, Task task) {
        task.setId(id);
        return taskRepo.save(task);
    }

    @Override
    public void delete(Integer id) {
        taskRepo.delete(id);
    }
}
