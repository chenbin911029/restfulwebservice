package hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 定时任务测试类
 *
 * @author chenbin at 2017/11/3 9:19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SchedulerTest {
    @Autowired
    private ScheduledTasks tasks;

    @Test
    public void contextLoads(){
        // Basic integration test that shows the context starts up properly
        assertThat(tasks).isNotNull();
    }
}
