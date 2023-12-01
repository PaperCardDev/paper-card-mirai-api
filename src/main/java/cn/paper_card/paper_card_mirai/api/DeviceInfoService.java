package cn.paper_card.paper_card_mirai.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@SuppressWarnings("unused")

public interface DeviceInfoService {

    // 添加或更新
    boolean insertOrUpdateByQq(@NotNull DeviceInfo info) throws Exception;

    // 删除
    boolean deleteByQq(long qq) throws Exception;

    // 查询
    @Nullable DeviceInfo queryByQq(long qq) throws Exception;

    // 修改备注
    boolean setRemark(long qq, @Nullable String remark) throws Exception;

    // 查询
    @NotNull List<Long> queryAllQqs() throws Exception;

    // 分页查询所有
    @NotNull List<DeviceInfo> queryAllWithPage(int limit, int offset) throws Exception;

    // 复制
    boolean copyInfo(long src, long dest) throws Exception;
}
