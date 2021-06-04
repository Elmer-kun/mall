package mall.mapper;

import mall.entity.MoodModel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author elmer
 * @version 1.0
 * @date 2021/6/4 11:43
 */
@Repository
public interface MoodModelMapper {
    List<MoodModel> findAll();
}
