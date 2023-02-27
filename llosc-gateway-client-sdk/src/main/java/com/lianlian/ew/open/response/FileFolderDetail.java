package com.lianlian.ew.open.response;

import com.lianlian.ew.open.domain.AdditionalInfo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 文件详情信息
 *
 * @author xujs002
 */
@Getter
@Setter
@ToString
public class FileFolderDetail implements Serializable {

    private static final long serialVersionUID = -7236526334837828865L;

    /**
     * File unique identifier.
     */
    private String id;

    /**
     * The purpose of the upload file.
     */
    private String purpose;

    /**
     *
     * The name of the fileFolder.
     */
    private String fileFolderName;

    /**
     * The notes of the upload file.
     */
    private String notes;

    /**
     * List of attachment ids.
     */
    private List<FileDetail> files;

    /**
     * For attachment information to be transmitted as agreed between LianLian Global and client
     */
    private List<AdditionalInfo>  additionalInfo;// kv @see ProfileInfo

    /**
     * The object creation time. Measured in milliseconds since the Unix epoch.
     */
    private Date createTime;

    /**
     * The object update time. Measured in milliseconds since the Unix epoch.
     */
    private Date updateTime;

}
