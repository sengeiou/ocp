package com.topideal.supplychain.ocp.config.service;

import com.topideal.supplychain.ocp.config.model.FxConfig;
import io.micrometer.core.lang.NonNull;
import java.util.List;

/**
 * <p>标题: </p>
 * <p>模块: ocp-parent</p>
 * <p>版权: Copyright © 2019 topideal</p>
 * <p>公司: 广东卓志供应链科技有限公司武汉分公司</p>
 * <p>类路径: com.topideal.supplychain.ocp.service</p>
 * <p>作者: LeoZhang</p>
 * <p>创建日期: 2019/11/22 13:41</p>
 *
 * @version 1.0
 */
public interface FxConfigService {

    List<FxConfig> pageList(FxConfig filter);

    List<FxConfig> selectAll();

    void save(FxConfig config);

    void edit(FxConfig config);

    void enable(String ids);

    void disable(String ids);

    void update(FxConfig updateEntity);

    void insert(FxConfig config);

    FxConfig selectById(Long id);

    void updateByIds(FxConfig updateEntity);

    void delete(String ids);

    FxConfig findByUnique(@NonNull String electricCode, @NonNull String platformCode,
            @NonNull String logisticsCode, @NonNull String customsCode,
            @NonNull String businessMode);

    void clearCache();
}
