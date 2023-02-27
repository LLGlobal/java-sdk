package com.lianlian.ew.open.request;

import com.lianlian.ew.open.domain.AdditionalInfo;
import com.lianlian.ew.open.domain.PayeeAddress;
import com.lianlian.ew.open.domain.PayeeBankInfo;
import com.lianlian.ew.open.domain.PayeeBaseInfo;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import java.util.List;

/**
 * 联系人写请求输入参数：创建、修改<br>
 * </> 创建id设置为空
 *
 * @author xujs002
 */
@Getter
@Setter
public class PayeeAddReq extends BaseOpenApiReq {

    private static final long serialVersionUID = 158597313053713463L;

    /**
     * Payee type, one of INDIVIDUAL and CORPORATE
     */
    @NotBlank(message = "type is required")
    private String type;// CORPORATE、INDIVIDUAL

    /**
     * The base info of payee
     */
    private PayeeBaseInfo baseInfo;

    /**
     * The address of payee
     */
    private PayeeAddress address;

    /**
     * Then bank info of payee
     */
    private PayeeBankInfo bankInfo;

    /**
     * File for this payee
     */
    private String fileId;

    /**
     * Then additional info of payee
     */
    private List<AdditionalInfo> additionalInfo;

    @Override
    public String toString() {
        return "ContactAddReq{" +
                "type='" + type + '\'' +
                ", baseInfo=" + baseInfo +
                ", address=" + address +
                ", bankInfo=" + bankInfo +
                ", fileId='" + fileId + '\'' +
                ", additionalInfo=" + additionalInfo +
                "} " + super.toString();
    }
}
