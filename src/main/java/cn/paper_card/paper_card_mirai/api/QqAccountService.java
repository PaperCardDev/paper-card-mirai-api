package cn.paper_card.paper_card_mirai.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@SuppressWarnings("unused")
public interface QqAccountService {

    // 添加或更新记录
    boolean addOrUpdateByQq(@NotNull AccountInfo info) throws Exception;

    // 删除账号
    boolean deleteByQq(long qq) throws Exception;

    // 设置是否开启自动登录
    boolean setAutoLogin(long qq, boolean autoLogin) throws Exception;

    // 设置备注
    boolean setRemark(long qq, String remark) throws Exception;

    // 根据QQ号查询
    @Nullable AccountInfo queryByQq(long qq) throws Exception;

    // 查询所有QQ号码
    @NotNull List<Long> queryAllQqs() throws Exception;

    // 查询自动登录的所有账号
    @NotNull List<AccountInfo> queryAutoLoginAccounts() throws Exception;

    // 分页查询。最近登录的排到前面
    @NotNull List<AccountInfo> queryOrderByTimeDescWithPage(int limit, int offset) throws Exception;
}
