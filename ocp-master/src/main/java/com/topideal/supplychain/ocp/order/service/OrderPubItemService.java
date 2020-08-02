package com.topideal.supplychain.ocp.order.service;

import com.topideal.supplychain.ocp.order.model.OrderPubItem;

import java.util.List;

/**
 * <p>标题: </p>
 * <p>模块: ocp-parent</p>
 * <p>版权: Copyright © 2019 topideal</p>
 * <p>公司: 广东卓志供应链科技有限公司武汉分公司</p>
 * <p>类路径: com.topideal.supplychain.ocp.order.service</p>
 * <p>作者: LeoZhang</p>
 * <p>创建日期: 2019/12/2 17:41</p>
 *
 * @version 1.0
 */
public interface OrderPubItemService {
    List<OrderPubItem> selectByOrderId(Long orderId);

    void batchInsert(Long orderId, List<OrderPubItem> goodsList);
}
