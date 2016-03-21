package pl.tomkuran.service;

import org.springframework.beans.factory.annotation.Autowired;
import pl.tomkuran.domain.TaskType;
import pl.tomkuran.repository.TaskTypeRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Created by TKURAN on 3/21/2016.
 */
public class TaskTypeServiceImpl implements TaskTypeService {
    @Autowired
    private TaskTypeRepository taskTypeRepository;

    @Override
    public TaskType create(TaskType taskType) {
        return taskTypeRepository.save(taskType);
    }

    @Override
    public TaskType getById(Integer id) {
        return taskTypeRepository.findOne(id);
    }

    @Override
    public List<TaskType> getAll() {
        return StreamSupport.stream(taskTypeRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public TaskType update(Integer id, TaskType taskType) {
        taskType.setId(id);
        return taskTypeRepository.save(taskType);
    }

    @Override
    public void delete(Integer id) {
        taskTypeRepository.delete(id);
    }
}
