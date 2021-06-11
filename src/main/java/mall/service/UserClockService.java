package mall.service;

import mall.entity.UserClockInfo;
import mall.mapper.UserClockMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author elmer
 * @date 2021/6/7 11:48
 */
@Service
public class UserClockService {

    @Autowired
    UserClockMapper mapper;

    public void add(UserClockInfo info){
        info.setStartTime(new Date());
        info.setEndTime(new Date());
        mapper.add(info);
    }

    public List<UserClockInfo> getUserClock(String uid){

        return mapper.getUserClock(uid);
    }
}
