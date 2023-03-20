package com.lianlian.ew.open.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 附件详情，包括附件内容
 *
 * @author xujs002
 */
@Getter
@Setter
@ToString
public class FileDetail implements Serializable {

    private static final long serialVersionUID = 4301281347658247886L;

    /**
     * The attachment ID.
     */
    private String id;

    /**
     * The attachment name in the server.
     */
    private String fileName;


    /**
     * The object creation time. Measured in milliseconds since the Unix epoch.
     */
    private Date createTime;


    /**
     * The notes of the attachment, max length is 128 characters
     */
    private String notes;

    /**
     * The original file the user named when uploading.
     */
    private String title;


}
