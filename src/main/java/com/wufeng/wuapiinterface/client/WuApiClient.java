package com.wufeng.wuapiinterface.client;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.wufeng.wuapiinterface.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

/**
 * @author wufeng
 * @date 2024/4/17 16:52
 * @Description:
 */
public class WuApiClient {
    public String getNameByGet(String name){
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);
        String result = HttpUtil.get("http://localhost:8123/api/name/getNameByGet", paramMap);
        System.out.println(result);
        return result;
    }
    public String getNameByPost(@RequestParam String name){
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);
        String result = HttpUtil.post("http://localhost:8123/api/name/getNameByPost", paramMap);
        System.out.println(result);
        return result;
    }
    public String getUserNameByPost(@RequestBody User user){
        String json = JSONUtil.toJsonStr(user);
        HttpResponse httpReponse = HttpRequest.post("http://localhost:8123/api/name/getUserNameByPost").body(json).execute();
        System.out.println(httpReponse.getStatus());
        String result = httpReponse.body();
        System.out.println(result);
        return result;
    }
}
