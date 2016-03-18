package pl.tomkuran.bootstrap;

import org.joda.time.DateTime;
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
        lsp.setProjectDescription("A gdyby tak wysztko pozmieniać? Tym razem na 100% się uda!");
        lsp.setStartDate(new DateTime().minusDays(100));
        lsp.setEndDate(new DateTime().plusDays(100));
        projectService.create(lsp);


        Project nVision = new Project();
        lsp.setProjectName("nVision");
        lsp.setProjectDescription("Grube bańki na UX. Sure, sure..");
        lsp.setStartDate(new DateTime().minusDays(90));
        lsp.setEndDate(new DateTime().plusDays(110));
        // projectService.create(nVision);

    }
}
