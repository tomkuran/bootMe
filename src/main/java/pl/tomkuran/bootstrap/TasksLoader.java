package pl.tomkuran.bootstrap;

import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import pl.tomkuran.domain.Task;
import pl.tomkuran.domain.TaskType;
import pl.tomkuran.service.TaskService;
import pl.tomkuran.service.TaskTypeService;

/**
 * Created by TKURAN on 3/21/2016.
 */
@Component
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

        Task taskForMe = new Task();
        taskForMe.setTaskDesc("Bardzo trudne zadanie dla mnie");
        taskForMe.setTaskStartDate(new LocalDate().minusDays(1));
        taskForMe.setTaskEndDate(new LocalDate().plusDays(1));
        taskForMe.setTaskType(uatTest);
        taskService.create(taskForMe);

        Task taskForYou = new Task();
        taskForYou.setTaskDesc("Bardzo trudne zadanie dla Ciebie");
        taskForYou.setTaskStartDate(new LocalDate().minusDays(1));
        taskForYou.setTaskEndDate(new LocalDate().plusDays(1));
        taskForYou.setTaskType(intTest);
        taskService.create(taskForYou);
    }
}
