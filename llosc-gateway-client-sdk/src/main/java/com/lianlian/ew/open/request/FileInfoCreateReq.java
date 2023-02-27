package com.lianlian.ew.open.request;

import com.lianlian.ew.open.domain.AdditionalInfo;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * FileFolder create request
 *
 * @author xujs002
 */
@Getter
@Setter
public class FileInfoCreateReq extends BaseOpenApiReq {
    private static final long serialVersionUID = -4333378546046983998L;

    /**
     * The purpose of the upload file.
     * <p>
     * Allowed value:
     * payout
     */
    @NotNull(message = "purpose is required.")
    private String purpose;

    /**
     * file name
     */
    @NotNull(message = "fileFolderName is required.")
    private String fileFolderName;

    /**
     * List of file ids.
     */
    private List<String> fileIds;

    /**
     * For file information to be transmitted as agreed between LianLian Global and client
     */
    private List<AdditionalInfo> additionalInfo;// kv @see ProfileInfo

    @Override
    public String toString() {
        return "FileWriteReq{" +
                "purpose='" + purpose + '\'' +
                ", fileFolderName='" + fileFolderName + '\'' +
                ", fileIds=" + fileIds +
                ", additionalInfo='" + additionalInfo + '\'' +
                "} " + super.toString();
    }
}
