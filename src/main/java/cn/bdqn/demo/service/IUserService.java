package cn.bdqn.demo.service;

import cn.bdqn.demo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fuhao
 * @since 2020-02-26
 */
public interface IUserService extends IService<User> {
    List<User> findUserAll();

}
