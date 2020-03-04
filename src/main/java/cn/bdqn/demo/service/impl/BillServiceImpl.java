package cn.bdqn.demo.service.impl;

import cn.bdqn.demo.entity.Bill;
import cn.bdqn.demo.mapper.BillMapper;
import cn.bdqn.demo.service.IBillService;
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
public class BillServiceImpl extends ServiceImpl<BillMapper, Bill> implements IBillService {

}
