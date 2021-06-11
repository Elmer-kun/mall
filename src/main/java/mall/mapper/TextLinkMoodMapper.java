package mall.mapper;

import mall.entity.TextLinkMood;
import org.springframework.stereotype.Repository;

/**
 * @author elmer
 * @date 2021/6/4 16:54
 */
@Repository
public interface TextLinkMoodMapper {
    void add(TextLinkMood textLinkMood);

    TextLinkMood selectRand();
}
