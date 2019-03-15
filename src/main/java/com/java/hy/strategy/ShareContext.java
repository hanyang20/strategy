package com.java.hy.strategy;

import com.java.hy.strategy.interfaces.ShareContent;
import com.java.hy.strategy.interfaces.ShareImageUrl;
import com.java.hy.strategy.interfaces.ShareLink;
import com.java.hy.strategy.interfaces.ShareTitle;

/**
 * 策略模式上下文
 * getShareTarget方法中通过反射的方式去获取对象，从而避免增加分享渠道的时候，修改方法中的代码，符合开闭原则
 */
public class ShareContext {
    protected ShareTitle shareTitle;

    protected ShareContent shareContent;

    protected ShareImageUrl shareImageUrl;

    protected ShareLink shareLink;

    public static ShareContext getShareTarget(Integer type) {
        //正常来说这应该是去读取文件获取,但是这是简单的策略就没有
        String className = null;
        if (type == 1){
             className = "com.java.hy.strategy.wechatshare.WechatShare";
        }
        if (type == 2){
            className = "com.java.hy.strategy.qqshare.QQShare";
        }
        Class cls;
        try {
            cls = Class.forName(className);
            return (ShareContext) cls.newInstance();
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
        return null;
    }

    public final String showTitle() {
        return shareTitle.showTitle();
    }

    public final String showContent() {
        return shareContent.showContent();
    }

    public final String displayImageUrl(final String platform) {
        return shareImageUrl.showImageUrl(platform);
    }

    public final String displayShareLinkUrl(final String platform, final String  userToken) {
        return shareLink.showLink(platform, userToken);
    }

    public static ShareInfo getShareInfo(ShareContext context, String platform, String userToken) {
        ShareInfo info = new ShareInfo();
        info.setContent(context.showContent());
        info.setImageUrl(context.displayImageUrl(platform));
        info.setTitle(context.showTitle());
        info.setShareLink(context.displayShareLinkUrl(platform, userToken));
        return info;
    }
}
