package com.ndexondeck.xmlTransformer.examples.response;

import java.util.Collection;

/**
 * Created by Nduka on 03/10/2018.
 *
 */
public class SubPostTransWithChargeResponse {

    private SubPostTransWithChargeResult SubPostTransWithChargeResult;

    public class SubPostTransWithChargeResult{

        private String ResponseCode;

        private String ResponseMessage;

        private String TranRefNo = null;

        private String TraceID;

        private PaymentRequest PaymentRequest;

        public String getResponseCode() {
            return ResponseCode;
        }

        public void setResponseCode(String responseCode) {
            ResponseCode = responseCode;
        }

        public String getResponseMessage() {
            return ResponseMessage;
        }

        public void setResponseMessage(String responseMessage) {
            ResponseMessage = responseMessage;
        }

        public String getTranRefNo() {
            return TranRefNo;
        }

        public void setTranRefNo(String tranRefNo) {
            TranRefNo = tranRefNo;
        }

        public String getTraceID() {
            return TraceID;
        }

        public void setTraceID(String traceID) {
            TraceID = traceID;
        }

        public SubPostTransWithChargeResponse.PaymentRequest getPaymentRequest() {
            return PaymentRequest;
        }

        public void setPaymentRequest(SubPostTransWithChargeResponse.PaymentRequest paymentRequest) {
            PaymentRequest = paymentRequest;
        }

        @Override
        public String toString() {
            return "SubPostTransWithChargeResult{" +
                    "ResponseCode='" + ResponseCode + '\'' +
                    ", ResponseMessage='" + ResponseMessage + '\'' +
                    ", TranRefNo='" + TranRefNo + '\'' +
                    ", TraceID='" + TraceID + '\'' +
                    ", PaymentRequest=" + PaymentRequest +
                    '}';
        }
    }

    public class PaymentRequest{

        private String FromCustID;

        private String FromAcc;

        private String ToAcc;

        private String ToBankCode;

        private String ToAccName;

        private String FromAccName;

        private String Amount = "0";

        private String Narration;

        private String TraceID;

        private String TranStatus;

        private String TranRefNo;

        private String RequestDate;

        private String ServiceID;

        private Boolean IsReversed;

        private chargesAccounts chargesAccounts;

        public String getFromCustID() {
            return FromCustID;
        }

        public void setFromCustID(String fromCustID) {
            FromCustID = fromCustID;
        }

        public String getFromAcc() {
            return FromAcc;
        }

        public void setFromAcc(String fromAcc) {
            FromAcc = fromAcc;
        }

        public String getToAcc() {
            return ToAcc;
        }

        public void setToAcc(String toAcc) {
            ToAcc = toAcc;
        }

        public String getToBankCode() {
            return ToBankCode;
        }

        public void setToBankCode(String toBankCode) {
            ToBankCode = toBankCode;
        }

        public String getToAccName() {
            return ToAccName;
        }

        public void setToAccName(String toAccName) {
            ToAccName = toAccName;
        }

        public String getFromAccName() {
            return FromAccName;
        }

        public void setFromAccName(String fromAccName) {
            FromAccName = fromAccName;
        }

        public String getAmount() {
            return Amount;
        }

        public void setAmount(String amount) {
            Amount = amount;
        }

        public String getNarration() {
            return Narration;
        }

        public void setNarration(String narration) {
            Narration = narration;
        }

        public String getTraceID() {
            return TraceID;
        }

        public void setTraceID(String traceID) {
            TraceID = traceID;
        }

        public String getTranStatus() {
            return TranStatus;
        }

        public void setTranStatus(String tranStatus) {
            TranStatus = tranStatus;
        }

        public String getTranRefNo() {
            return TranRefNo;
        }

        public void setTranRefNo(String tranRefNo) {
            TranRefNo = tranRefNo;
        }

        public String getRequestDate() {
            return RequestDate;
        }

        public void setRequestDate(String requestDate) {
            RequestDate = requestDate;
        }

        public String getServiceID() {
            return ServiceID;
        }

        public void setServiceID(String serviceID) {
            ServiceID = serviceID;
        }

        public Boolean getReversed() {
            return IsReversed;
        }

        public void setReversed(Boolean reversed) {
            IsReversed = reversed;
        }

        public SubPostTransWithChargeResponse.chargesAccounts getChargesAccounts() {
            return chargesAccounts;
        }

        public void setChargesAccounts(SubPostTransWithChargeResponse.chargesAccounts chargesAccounts) {
            this.chargesAccounts = chargesAccounts;
        }

        @Override
        public String toString() {
            return "PaymentRequest{" +
                    "FromCustID='" + FromCustID + '\'' +
                    ", FromAcc='" + FromAcc + '\'' +
                    ", ToAcc='" + ToAcc + '\'' +
                    ", ToBankCode='" + ToBankCode + '\'' +
                    ", ToAccName='" + ToAccName + '\'' +
                    ", FromAccName='" + FromAccName + '\'' +
                    ", Amount='" + Amount + '\'' +
                    ", Narration='" + Narration + '\'' +
                    ", TraceID='" + TraceID + '\'' +
                    ", TranStatus='" + TranStatus + '\'' +
                    ", TranRefNo='" + TranRefNo + '\'' +
                    ", RequestDate='" + RequestDate + '\'' +
                    ", ServiceID='" + ServiceID + '\'' +
                    ", IsReversed=" + IsReversed +
                    ", chargesAccounts=" + chargesAccounts +
                    '}';
        }
    }

    private class chargesAccounts{

        private Collection<KeyValuePairOfDecimalString> KeyValuePairOfDecimalString;

        public Collection<SubPostTransWithChargeResponse.KeyValuePairOfDecimalString> getKeyValuePairOfDecimalString() {
            return KeyValuePairOfDecimalString;
        }

        public void setKeyValuePairOfDecimalString(Collection<SubPostTransWithChargeResponse.KeyValuePairOfDecimalString> keyValuePairOfDecimalString) {
            KeyValuePairOfDecimalString = keyValuePairOfDecimalString;
        }

        @Override
        public String toString() {
            return "chargesAccounts{" +
                    "KeyValuePairOfDecimalString=" + KeyValuePairOfDecimalString +
                    '}';
        }
    }

    private class KeyValuePairOfDecimalString {

        private Double Key;

        private String Value;

        public Double getKey() {
            return Key;
        }

        public void setKey(Double key) {
            Key = key;
        }

        public String getValue() {
            return Value;
        }

        public void setValue(String value) {
            Value = value;
        }

        @Override
        public String toString() {
            return "KeyValuePairOfDecimalString{" +
                    "Key=" + Key +
                    ", Value='" + Value + '\'' +
                    '}';
        }
    }

}


