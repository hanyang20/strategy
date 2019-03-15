package com.java.hy.strategy.wechatshare;

import com.java.hy.strategy.interfaces.ShareImageUrl;

/**
 * 微信缩略图
 */
public class WechatImageUrl implements ShareImageUrl {
    public String showImageUrl(String platform) {
        return "share.wechat.image.url."+platform;
    }
}
