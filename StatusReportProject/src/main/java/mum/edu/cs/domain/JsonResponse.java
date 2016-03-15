package mum.edu.cs.domain;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by su on 3/15/16.
 */
public class JsonResponse {
    private int code = 0;
    private Object data;
    private String message;

    public JsonResponse(){
        this.code = 0;
        this.data = null;
    }

    public JsonResponse(Object object){
        this.data = object;
    }

    public JsonResponse(int code,String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
