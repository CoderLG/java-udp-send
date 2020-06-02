//package lg.scheduler;
//
//
//import cn.hutool.core.thread.ThreadUtil;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import java.util.concurrent.ExecutorService;
//
//
//
//@Slf4j
//@Component
//public class TaskScheduler {
//
//
//    private static ExecutorService monitorThreadPool = ThreadUtil.newExecutor(1);
//
//    /**
//     * 定时任务，每5秒（执行完这个方法后五秒，在此执行） 监听一次文件夹
//     */
//    @Scheduled(cron = "0/5 * * * * *")
//    public void processMonitorTask() {
//        log.info("定时任务每5秒执行一次");
//
//
//    }
//
//    /**
//     * 当服务启动（重启）时，初始化维护 定时任务所维护的东西
//     */
//    @PostConstruct
//    public void refreshMonitorAfterAppRun(){
//        log.info("初始化定时任务");
//
//    }
//
//
//}
