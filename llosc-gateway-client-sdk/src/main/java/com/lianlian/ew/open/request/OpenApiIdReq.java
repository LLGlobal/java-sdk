package com.lianlian.ew.open.request;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * 单个业务对象查询服务输入参数<br></>
 *
 * @author xujs002
 */
@Getter
@Setter
public class OpenApiIdReq extends BaseOpenApiReq implements Serializable {


    private static final long serialVersionUID = -5241795025735358992L;

    @NotBlank(message = "Object id is required")
    private String id;

    @Override
    public String toString() {
        return "OpenApiIdReq{" +
                "id='" + id + '\'' +
                "} " + super.toString();
    }

    public OpenApiIdReq() {

    }


    public OpenApiIdReq(String id) {
        this.id = id;
    }


}
