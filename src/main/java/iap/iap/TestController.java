package iap.iap;

import org.springframework.web.bind.annotation.RestController;

import iap.iap.services.JobService;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.jobrunr.scheduling.JobScheduler;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/Test")
@AllArgsConstructor
public class TestController {
    public JobService jobService;
    // public JobScheduler jobScheduler;

    @GetMapping
    public String Test() {
        // jobScheduler.enqueue(() -> jobService.executeSampleJob());
        return "Test";
    }

}
