package mall.service;

import mall.entity.TextLinkMood;
import mall.mapper.TextLinkMoodMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author elmer
 * @date 2021/6/4 17:09
 */
@Service
public class TextLinkMoodService {

    @Autowired
    TextLinkMoodMapper mapper;

    public void add(TextLinkMood textLinkMood){
        mapper.add(textLinkMood);
    }
}
