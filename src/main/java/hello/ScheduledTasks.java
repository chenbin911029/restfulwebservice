package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 定时任务
 *
 * @author chenbin at 2017/11/3 9:14
 */
@Component
public class ScheduledTasks {
    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

//    @Scheduled(fixedRate = 5000)//每5秒执行一次
//    public void reportCurrentTime(){
//        log.info("The time is new {}",dateFormat.format(new Date()));
//    }

    @Scheduled(cron="0 30/5 * * * ?") //每小时的33分钟开始执行，每3分钟执行1次
    public void start() throws ServletException {
        log.info(String.format("每小时的30分钟开始执行，每5分钟执行1次,%s",dateFormat.format(new Date())));
    }
}
