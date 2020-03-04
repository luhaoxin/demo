package cn.bdqn.demo.service.impl;

import cn.bdqn.demo.entity.Role;
import cn.bdqn.demo.mapper.RoleMapper;
import cn.bdqn.demo.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fuhao
 * @since 2020-02-26
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
