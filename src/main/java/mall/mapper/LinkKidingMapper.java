package mall.mapper;

import mall.entity.LinkKiding;
import org.springframework.stereotype.Repository;

/**
 * @author elmer
 * @date 2021/6/7 10:37
 */
@Repository
public interface LinkKidingMapper {
    LinkKiding getRand();
}
