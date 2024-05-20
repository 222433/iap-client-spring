package iap.iap.services;

import java.time.Instant;
import java.time.temporal.TemporalAccessor;

import org.jobrunr.scheduling.BackgroundJob;
import org.jobrunr.scheduling.JobScheduler;
import org.jobrunr.scheduling.cron.Cron;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import iap.iap.db.repositories.OrdersRepository;
import iap.iap.model.Order;
import iap.iap.model.OrderRepository;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class JobService {

    public JobScheduler jobScheduler;

    public OrdersRepository orderRepository;

    @PostConstruct
    public void executeSampleJob() {
        jobScheduler.scheduleRecurrently(Cron.minutely(), () -> {
            Order o = new Order(1, 2, 3);
            // orderRepository.save(o);
            System.out.println("SAVED");

        });

    }
}
