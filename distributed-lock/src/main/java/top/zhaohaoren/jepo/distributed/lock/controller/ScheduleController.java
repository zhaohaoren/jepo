package top.zhaohaoren.jepo.distributed.lock.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaohaoren
 */
@RestController
public class ScheduleController {

    @Scheduled()
    public void testSchedule(){

    }
}
