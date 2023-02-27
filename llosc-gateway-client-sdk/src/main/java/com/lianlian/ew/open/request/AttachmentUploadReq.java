package com.lianlian.ew.open.request;

import com.lianlian.ew.open.domain.AttachmentExtensionInfo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.io.File;

/**
 * 用户上传文件输入参数<br>
 * </>
 *
 * @author xujs002
 */
@Getter
@Setter
@ToString
public class AttachmentUploadReq extends BaseOpenApiReq {

    private static final long serialVersionUID = 5209168313277110294L;


    /**
     * the file attachment need to upload
     */
    @NotNull
    private File attachment;

    /**
     * extension info of attachement
     */
    private AttachmentExtensionInfo extensionInfo;

    public AttachmentUploadReq() {
    }

    public AttachmentUploadReq(File attachment, AttachmentExtensionInfo extensionInfo) {
        this.attachment = attachment;
        this.extensionInfo = extensionInfo;
    }
}
