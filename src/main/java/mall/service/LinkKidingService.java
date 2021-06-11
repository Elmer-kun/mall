package mall.service;

import mall.entity.LinkKiding;
import mall.mapper.LinkKidingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author elmer
 * @date 2021/6/7 10:39
 */
@Service
public class LinkKidingService {

    @Autowired
    LinkKidingMapper mapper;

    public LinkKiding getRand(){
        return mapper.getRand();
    }
}
