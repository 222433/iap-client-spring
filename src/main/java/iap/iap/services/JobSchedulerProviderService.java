package iap.iap.services;

import org.jobrunr.configuration.JobRunr;
import org.jobrunr.scheduling.JobScheduler;
import org.jobrunr.storage.InMemoryStorageProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JobSchedulerProviderService {
    @Bean
    public JobScheduler jobScheduler() {
        return JobRunr.configure()
                .useStorageProvider(new InMemoryStorageProvider())
                .useBackgroundJobServer()
                .useDashboard()
                .initialize()
                .getJobScheduler();
    }
}
