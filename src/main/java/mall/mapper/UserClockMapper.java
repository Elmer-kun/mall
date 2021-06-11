package mall.mapper;

import mall.entity.UserClockInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author elmer
 * @date 2021/6/7 11:46
 */
@Repository
public interface UserClockMapper {

    void add(UserClockInfo info);

    List<UserClockInfo> getUserClock(String uid);
}
