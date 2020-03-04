package cn.bdqn.demo.mapper;

import cn.bdqn.demo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author fuhao
 * @since 2020-02-26
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> getUserAll();
}
