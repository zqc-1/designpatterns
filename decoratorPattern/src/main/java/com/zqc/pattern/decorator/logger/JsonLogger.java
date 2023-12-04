package com.zqc.pattern.decorator.logger;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;

import java.util.Arrays;

public class JsonLogger extends LoggerDecorator{
    public JsonLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void info(String s) {
        JSONObject result = newJson();
        result.put("message",s);
        logger.info(result.toString());
    }

    @Override
    public void error(String s) {
        JSONObject result = newJson();
        result.put("message",s);
        logger.info(result.toString());
    }

    public void error(Exception e) {
        JSONObject result = newJson();
        result.put("exception",e.getClass().getName());
        String trace = Arrays.toString(e.getStackTrace());
        result.put("stackTrace",trace);
        logger.info(result.toString());
    }

    private JSONObject newJson(){
        return new JSONObject();
    }
}
