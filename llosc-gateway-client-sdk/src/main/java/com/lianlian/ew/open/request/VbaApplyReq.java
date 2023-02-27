package com.lianlian.ew.open.request;//package com.lianlian.ew.open.request;
//
//import lombok.Getter;
//import lombok.Setter;
//
//import javax.validation.constraints.NotNull;
//
///**
// * VBA申请参数
// *
// * @author xujs002
// */
//@Getter
//@Setter
//
//public class VbaApplyReq extends BaseOpenApiReq {
//    private static final long serialVersionUID = 2659780628643718693L;
//
//    @NotNull(message = "countryCode is required.")
//    private String countryCode;
//
//    @NotNull(message = "currency is required.")
//    private String currency;
//
//    @Override
//    public String toString() {
//        return "VbaApplyReq{" +
//                "countryCode='" + countryCode + '\'' +
//                ", currency='" + currency + '\'' +
//                "} " + super.toString();
//    }
//}
