package cn.paper_card.paper_card_mirai.api;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public interface PaperCardMiraiApi {
    @NotNull QqAccountService getQqAccountService();

    @NotNull DeviceInfoService getDeviceInfoService();
}
