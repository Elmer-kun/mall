package mall.service;

import mall.entity.ClockText;
import mall.mapper.ClockTextMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author elmer
 * @date 2021/6/4 17:40
 */
@Service
public class ClockTextService {
    @Autowired
    ClockTextMapper mapper;

    public void add(ClockText clockText){
        mapper.add(clockText);
    }

    public List<ClockText> findClock(String userId){
        return mapper.findClock(userId);
    }

    public void updateById(Integer id, String text){
        mapper.updateById(id, text);
    }

    public void delById(Integer id){
        mapper.delById(id);
    }
}
