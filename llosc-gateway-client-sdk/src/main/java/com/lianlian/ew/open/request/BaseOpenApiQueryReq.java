/**
 *
 */
package com.lianlian.ew.open.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * 分页检索基础请求参数
 *
 * @author xujs002
 *
 */
@Getter
@Setter
@ToString
public class BaseOpenApiQueryReq extends BaseOpenApiReq {

    private static final long serialVersionUID = 5556347041909005500L;

    /**
     * The query page number
     */
    @Min(value = 1, message = "page_number is under minimum")
    private int pageNumber = 1;


    /**
     * The default value is 20. A maximum of 100 data items can be displayed on a page
     */
    @Min(value = 1, message = "page_size is under minimum")
    @Max(value = 100, message = "page_size is over maximum")
    private int pageSize = 10;// 分页大小
}
