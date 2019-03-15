package com.java.hy.strategy.wechatshare;

import com.java.hy.strategy.interfaces.ShareLink;

/**
 * 微信分享链接
 */
public class WechatLink implements ShareLink {
    public String showLink(String platform, String userToken) {
        return "share.wechat.link." + platform+ userToken;
    }
}
