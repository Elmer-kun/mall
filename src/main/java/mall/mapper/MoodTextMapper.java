package mall.mapper;

import mall.entity.MoodText;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author elmer
 * @date 2021/6/4 16:17
 */
@Repository
public interface MoodTextMapper {
    List<MoodText> findText(String name);
}
