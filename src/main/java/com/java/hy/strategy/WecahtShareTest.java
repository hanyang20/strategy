package com.java.hy.strategy;

import com.java.hy.strategy.wechatshare.WechatContent;
import com.java.hy.strategy.wechatshare.WechatImageUrl;
import com.java.hy.strategy.wechatshare.WechatLink;
import com.java.hy.strategy.wechatshare.WechatTitle;

public class WecahtShareTest {

    public static void main(String[] args){


        ShareContext shareTarget = ShareContext.getShareTarget(1);
        System.out.println(shareTarget.shareContent.showContent());
        System.out.println(shareTarget.shareTitle.showTitle());
        System.out.println(shareTarget.shareLink.showLink("10","asfsajfhasjkfhsjka"));
        System.out.println(shareTarget.shareImageUrl.showImageUrl("10"));
        //这是微信分享的内容都出来了,如果我们想再增加一个QQ的type=2,把这个改成从文件中读取的方式
        //符合了开闭原则,扩展开发,修改关闭,我们不必动之前的代码了,只需要增加就好了

    }
}
