package cn.bdqn.demo.service.impl;

import cn.bdqn.demo.entity.Address;
import cn.bdqn.demo.mapper.AddressMapper;
import cn.bdqn.demo.service.IAddressService;
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
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements IAddressService {

}
