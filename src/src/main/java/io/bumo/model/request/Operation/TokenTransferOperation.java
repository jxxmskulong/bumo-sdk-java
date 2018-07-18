package io.bumo.model.request.Operation;

import io.bumo.common.OperationType;

/**
 * @Author riven
 * @Date 2018/7/9 17:07
 */
public class TokenTransferOperation extends BaseOperation {
    private OperationType operationType = OperationType.TOKEN_TRANSFER;
    private String contractAddress;
    private String destAddress;
    private String amount;

    /**
     * @Author riven
     * @Method getOperationType
     * @Params []
     * @Return io.bumo.common.OperationType
     * @Date 2018/7/9 17:08
     */
    public OperationType getOperationType() {
        return operationType;
    }

    /**
     * @Author riven
     * @Method getContractAddress
     * @Params []
     * @Return java.lang.String
     * @Date 2018/7/9 17:09
     */
    public String getContractAddress() {
        return contractAddress;
    }

    /**
     * @Author riven
     * @Method setContractAddress
     * @Params [contractAddress]
     * @Return void
     * @Date 2018/7/9 17:09
     */
    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    /**
     * @Author riven
     * @Method getDestAddress
     * @Params []
     * @Return java.lang.String
     * @Date 2018/7/9 17:09
     */
    public String getDestAddress() {
        return destAddress;
    }

    /**
     * @Author riven
     * @Method setDestAddress
     * @Params [destAddress]
     * @Return void
     * @Date 2018/7/9 17:09
     */
    public void setDestAddress(String destAddress) {
        this.destAddress = destAddress;
    }

    /**
     * @Author riven
     * @Method getAmount
     * @Params []
     * @Return java.lang.String
     * @Date 2018/7/9 17:09
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @Author riven
     * @Method setAmount
     * @Params [amount]
     * @Return void
     * @Date 2018/7/9 17:09
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }
}