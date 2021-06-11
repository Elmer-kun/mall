package mall.mapper;

import mall.entity.ClockText;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author elmer
 * @date 2021/6/4 17:38
 */
@Repository
public interface ClockTextMapper {

    void add(ClockText clockText);

    List<ClockText> findClock(String userId);

    void updateById(Integer id, String text);

    void delById(Integer id);
}
