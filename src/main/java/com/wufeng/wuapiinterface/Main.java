package com.wufeng.wuapiinterface;

import com.wufeng.wuapiinterface.client.WuApiClient;
import com.wufeng.wuapiinterface.model.User;

/**
 * @author wufeng
 * @date 2024/4/17 16:59
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        String accessKey = "taco";
        String secretKey = "abcd";
        WuApiClient wuApiClient = new WuApiClient(accessKey, secretKey);
        ////调用WuApiClient的接口
        //String res1 = wuApiClient.getNameByGet("wufeng01");
        //String res2 = wuApiClient.getNameByPost("wufeng02");
        User user = new User();
        user.setUsername("wufeng03");
        String res3 = wuApiClient.getUserNameByPost(user);

        //System.out.println("Get请求结果：" + res1);
        //System.out.println("Post请求结果：" + res2);
        System.out.println("Post请求结果：" + res3);

    }
}
