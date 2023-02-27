//package com.lianlian.ew.open.request;
//
//import lombok.Getter;
//import lombok.Setter;
//import org.hibernate.validator.constraints.NotBlank;
//
///**
// * 汇率查询服务输入参数<br>
// * </>源币种、目标币种
// *
// * @author xujs002
// */
//@Getter
//@Setter
//public class ExchangeRateQueryReq extends BaseOpenApiReq {
//
//    private static final long serialVersionUID = 5594193788378232226L;
//
//    // 币种对
//    /**
//     * 卖出币种
//     */
//    @NotBlank(message = "sell_currency is required")
//    private String sellCurrency;
//
//    /**
//     * 买入币种
//     */
//    @NotBlank(message = "buy_currency is required")
//    private String buyCurrency;
//
//    @Override
//    public String toString() {
//        return "ExchangeRateQueryReq{" +
//                "sellCurrency='" + sellCurrency + '\'' +
//                ", buyCurrency='" + buyCurrency + '\'' +
//                "} " + super.toString();
//    }
//}
