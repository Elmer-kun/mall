package mall.mapper;

import mall.entity.LinkUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author elmer
 * @date 2021/6/7 10:11
 */
@Repository
public interface LinkUserMapper {
    void add(LinkUser user);

    List<LinkUser> getUserHis(String userId);

    List<LinkUser> getHis();
}
