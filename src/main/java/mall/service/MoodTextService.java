package mall.service;

import mall.entity.MoodText;
import mall.mapper.MoodTextMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author elmer
 * @date 2021/6/4 16:18
 */
@Service
public class MoodTextService {

    @Autowired
    MoodTextMapper mapper;

    public List<MoodText> findText(String name){
        return mapper.findText(name);
    }
}
