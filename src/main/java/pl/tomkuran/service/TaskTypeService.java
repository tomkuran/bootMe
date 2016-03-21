package pl.tomkuran.service;

import pl.tomkuran.domain.TaskType;

import java.util.List;

/**
 * Created by TKURAN on 3/21/2016.
 */
public interface TaskTypeService {
    TaskType create(TaskType taskType);

    TaskType getById(Integer id);

    List<TaskType> getAll();

    TaskType update(Integer id, TaskType taskType);

    void delete(Integer id);
}
