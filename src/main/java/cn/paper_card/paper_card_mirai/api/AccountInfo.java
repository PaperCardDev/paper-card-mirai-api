package cn.paper_card.paper_card_mirai.api;

public record AccountInfo(
        long qq, // QQ号码

        String nick, // QQ昵称

        int level, // QQ等级
        String passwordMd5, // 密码哈希
        String protocol, // 协议
        long time, // 最近登录时间

        String ip, // 最近登录IP

        boolean autoLogin, // 是否自动登录

        String remark // 备注
) {
}