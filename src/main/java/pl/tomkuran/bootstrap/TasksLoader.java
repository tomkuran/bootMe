package pl.tomkuran.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import pl.tomkuran.domain.TaskType;
import pl.tomkuran.service.TaskService;
import pl.tomkuran.service.TaskTypeService;

/**
 * Created by TKURAN on 3/21/2016.
 */
public class TasksLoader implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private TaskTypeService taskTypeService;

    @Autowired
    private TaskService taskService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        TaskType intTest = new TaskType();
        intTest.setType("Testy integracyjne");
        intTest = taskTypeService.create(intTest);

        TaskType uatTest = new TaskType();
        uatTest.setType("Testy akceptacyjne");
        uatTest = taskTypeService.create(uatTest);



    }
}
