package cn.bdqn.demo.service.impl;

import cn.bdqn.demo.entity.User;
import cn.bdqn.demo.mapper.UserMapper;
import cn.bdqn.demo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fuhao
 * @since 2020-02-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    private UserMapper UserMapper;
    @Override
    public List<User> findUserAll() {
        return UserMapper.getUserAll();
    }
}
