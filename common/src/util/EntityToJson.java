package util;

import com.alibaba.fastjson.JSON;

public class EntityToJson {

    public  static String EntityToJson(Object object){
        return JSON.toJSONString(object);
    }
}
