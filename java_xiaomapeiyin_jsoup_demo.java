package com.test;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * http://www.zhimaruanjian.com/?utm-source=bdtg&utm-keyword=?1136
 * 151
 *
 */
public class JsoupXiaoMaPeiYin {

    public static void main(String[] args) {
        getIpProxy();
    }

    private static String getIpProxy() {
        String ipProxy="";
        Document document = null;
        String url = "http://peiyin.xiaomawenku.com/PeiYin/xiaomapeiyin_api_to_peiyin";
         url = "http://localhost:8091/PeiYin/xiaomapeiyin_api_to_peiyin";
        try {
            Connection connect = Jsoup.connect(url);
            // 带参数开始
            connect.data("xiaomapeiyin_svip_user_id", "注册会员id");
            connect.data("xiaomapeiyin_svip_token", "密钥");
            connect.data("xiaomapeiyin_text", "小马配音测试");
            connect.data("caiyanglv", "16");
            connect.data("geshi", "2");
            connect.data("renming_id", "52");
            connect.data("pitchRate", "0");
            connect.data("speechRate", "0");
            connect.data("volume", "100");
            connect.data("bgurl", "");

/*
            : 配音内容
            : 采样率
            : 格式后缀
            : 主播id
            : 音调
            : 语速
            : 音量
            : 背景音乐
            注册并开通svip的id<br>
            xiaomapeiyin_svip_token:客服给你的秘钥<br>
                    */

            // 带参数结束
             document = connect.post();
            System.out.println(document.toString());


        } catch (IOException e) {
            e.printStackTrace();
        }

        return  ipProxy;
    }

}
