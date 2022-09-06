package io.bootify.students_and_classes.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan("io.bootify.students_and_classes.domain")
@EnableJpaRepositories("io.bootify.students_and_classes.repos")
@EnableTransactionManagement
public class DomainConfig {
}
