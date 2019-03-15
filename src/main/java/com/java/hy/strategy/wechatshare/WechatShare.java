package com.java.hy.strategy.wechatshare;

import com.java.hy.strategy.ShareContext;

/**
 * 微信分享
 */
public class WechatShare extends ShareContext {
    public WechatShare() {
        super.shareTitle = new WechatTitle();
        super.shareContent = new WechatContent();
        super.shareImageUrl = new WechatImageUrl();
        super.shareLink = new WechatLink();
    }
}
