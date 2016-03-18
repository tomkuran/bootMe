package pl.tomkuran.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by TKURAN on 3/18/2016.
 */
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"pl.tomkuran.domain"})
@EnableJpaRepositories(basePackages = {"pl.tomkuran.repository"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
