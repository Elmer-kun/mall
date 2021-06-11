package mall.service;

import mall.entity.LinkUser;
import mall.mapper.LinkUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author elmer
 * @date 2021/6/7 10:12
 */
@Service
public class LinkUserService {

    @Autowired
    LinkUserMapper mapper;

    public void add(LinkUser user){
        mapper.add(user);
    }

    public List<LinkUser> getUserHis(String userId){
        return mapper.getUserHis(userId);
    }

    public List<LinkUser> getHis(){
        return mapper.getHis();
    }
}
