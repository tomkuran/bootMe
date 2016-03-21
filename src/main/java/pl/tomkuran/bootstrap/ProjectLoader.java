package pl.tomkuran.bootstrap;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import pl.tomkuran.domain.Project;
import pl.tomkuran.service.ProjectService;

/**
 * Created by TKURAN on 3/18/2016.
 */
@Component
public class ProjectLoader implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private ProjectService projectService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        Project lsp = new Project();
        lsp.setProjectName("LSP");
        lsp.setProjectDescription("Lorem ipsum dolor");
        lsp.setStartDate(new LocalDate().minusDays(1));
        lsp.setEndDate(new LocalDate().plusDays(1));
        projectService.create(lsp);


        Project nVision = new Project();
        nVision.setProjectName("nVision");
        nVision.setProjectDescription("Jeden, dwa, trzy... Próba mikrofonu..");
        nVision.setStartDate(new LocalDate().minusDays(2));
        nVision.setEndDate(new LocalDate().plusDays(2));
        projectService.create(nVision);

    }
}
