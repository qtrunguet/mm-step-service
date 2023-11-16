package trungdq.test.demo.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Tuple;

import java.util.Set;

@Service
public class RedisService {

    private final RedisTemplate<String, String> redisTemplate;

    @Autowired
    public RedisService(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void pushToSortedSet(String sortedSetName, String member, double score) {
        redisTemplate.opsForZSet().add(sortedSetName, member, score);
    }

    public Set<ZSetOperations.TypedTuple<String>> getSortedSetRangeWithScores(String sortedSetName, long start, long end) {
        return redisTemplate.opsForZSet().rangeWithScores(sortedSetName, start, end);
    }

    public List<Step> getRanking(String userId){
        // Todo
    }
}