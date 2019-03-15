package com.java.hy.strategy.wechatshare;
//具体抽象类 以微信好友分享为例

import com.java.hy.strategy.interfaces.ShareContent;
import com.java.hy.strategy.interfaces.ShareTitle;

/**
 * 微信标题
 */
public class WechatTitle implements ShareTitle {

    @Override
    public String showTitle() {
        return "照亮你的美";
    }
}
