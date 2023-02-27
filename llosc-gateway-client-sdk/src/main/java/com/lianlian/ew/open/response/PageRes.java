package com.lianlian.ew.open.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;


/**
 * page Object
 *
 * @author xujs002
 */
@Getter
@Setter
@ToString
public class PageRes<T> implements Serializable {
    private static final long serialVersionUID = 8903943660402117403L;

    private List<T> pageList;

    private Long totalCount;

    public PageRes() {
    }

    public PageRes(List<T> pageList, Long totalCount) {
        super();
        this.pageList = pageList;
        this.totalCount = totalCount;
    }


}
