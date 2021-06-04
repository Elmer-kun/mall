package mall.service;

import mall.entity.MoodModel;
import mall.mapper.MoodModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author elmer
 * @version 1.0
 * @date 2021/6/4 14:45
 */
@Service
public class MoodModelService {

    @Autowired
    MoodModelMapper mapper;

    public List<MoodModel> findAll(){
        return mapper.findAll();
    }
}
