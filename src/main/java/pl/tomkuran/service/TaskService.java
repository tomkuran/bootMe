package pl.tomkuran.service;

import pl.tomkuran.domain.Task;

import java.util.List;

/**
 * Created by TKURAN on 3/21/2016.
 */
public interface TaskService {

    Task create(Task task);

    Task getById(Integer id);

    List<Task> getPage(Integer page, Integer pageSize);

    Task update(Integer id, Task task);

    void delete(Integer id);

}
