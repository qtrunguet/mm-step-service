package trungdq.test.demo.Controller;

import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import trungdq.test.demo.Config.RedisService;
import trungdq.test.demo.Service.StepService;

@Controller
@RequiredArgsConstructor
public class StepController {

    private RedisService redisService;
    private StepService stepService;

    @GetMapping
    public List<Steps> getRankingByUserId(@PathVariable String userId){
        return  redisService.getRanking(userId);
    }
}
    @GetMapping("/week/{userId}")
    public Long getTotalStepsOfWeek(@PathVariable String userId) {
        // Lấy tổng số bước chân của người dùng trong tuần hiện tại từ Redis
        return stepService.getTotalStepsOfWeek(userId);
    }

    @GetMapping("/month/{userId}")
    public Long getTotalStepsOfMonth(@PathVariable String userId) {
        // Lấy tổng số bước chân của người dùng trong tháng hiện tại từ Redis
        return stepService.getTotalStepsOfMonth(userId);

}
