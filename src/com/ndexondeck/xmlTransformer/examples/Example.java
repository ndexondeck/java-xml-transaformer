package com.ndexondeck.xmlTransformer.examples;

import com.ndexondeck.xmlTransformer.examples.response.SubPostTransWithChargeResponse;
import com.ndexondeck.xmlTransformer.soap.SoapTransformer;
import com.ndexondeck.xmlTransformer.xml.XmlTransformer;

import java.util.Map;

/**
 * Created by Nduka Ohadoma on 5/2/2019.
 *
 */
public class Example {

    public static void main(String[] args) {

        //Sample Response 1
        String exampleResponse1 = "<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><soap:Header><xHeader xmlns=\"http://tempuri.org/\"><servicename>BAP:GHA</servicename><passkey>6E0A49B58AAA77980A31BDFDE08DEC01</passkey></xHeader></soap:Header><soap:Body><SubPostTransWithChargeResponse xmlns=\"http://tempuri.org/\"><SubPostTransWithChargeResult><ResponseCode>001</ResponseCode><ResponseMessage>Failed|Transfer - TransactionNotPermitted</ResponseMessage><TranRefNo>121748769725</TranRefNo><TraceID>57564</TraceID><PaymentRequest><FromCustID>Hiell</FromCustID><FromAcc>00834040000202</FromAcc><FromAccName>ACCRUED INT -S/T BORROWING</FromAccName><ToAcc>0142010001984</ToAcc><ToBankCode>02</ToBankCode><ToAccName>ALHAJI HALIDU IBRAHIM</ToAccName><Amount>100</Amount><Narration>BAP:GHA:Hello</Narration><TraceID>57564</TraceID><TranStatus>2</TranStatus><chargesAccounts><KeyValuePairOfDecimalString><Key>10</Key><Value>0062010003360</Value></KeyValuePairOfDecimalString></chargesAccounts></PaymentRequest></SubPostTransWithChargeResult></SubPostTransWithChargeResponse></soap:Body></soap:Envelope>";

        String arrayTags = "KeyValuePairOfDecimalString";

        SubPostTransWithChargeResponse a = (new SoapTransformer<SubPostTransWithChargeResponse>(arrayTags)).transformBody(exampleResponse1, SubPostTransWithChargeResponse.class);
        System.out.println(a);

        System.out.println("\n");

        Map<String, Object> b = (new XmlTransformer<SubPostTransWithChargeResponse>(arrayTags)).transformXml(exampleResponse1);
        System.out.println(b);

        System.out.println("\n");

        SubPostTransWithChargeResponse c = (new XmlTransformer<SubPostTransWithChargeResponse>(arrayTags)).transformXml(exampleResponse1, SubPostTransWithChargeResponse.class);
        System.out.println(c);


        //Sample Response 2
        String example2 = "<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"><soap:Header><xHeader xmlns=\"http://tempuri.org/\"><servicename>BAP</servicename><passkey>46D7B4DFD86CD5BD376E1B4DF02EA7D1</passkey></xHeader></soap:Header><soap:Body><SubPostTransWithChargeResponse xmlns=\"http://tempuri.org/\"><SubPostTransWithChargeResult><ResponseCode>000</ResponseCode><ResponseMessage>Successful|Successful - TransactionPermitted</ResponseMessage><TranRefNo>121748769725</TranRefNo><TraceID>153796</TraceID><PaymentRequest><FromCustID/><FromAcc>48934211000801</FromAcc><ToAcc>3082427116</ToAcc><Amount>450</Amount><Narration>BAP:FC/STL/Airtel/NGN/9/26-14:00</Narration><TraceID>153796680683838</TraceID><TranStatus>1</TranStatus><TranRefNo>121748769725</TranRefNo><RequestDate>2018-09-30T13:49:34.8609725+01:00</RequestDate><ServiceID>43</ServiceID><IsReversed>false</IsReversed><chargesAccounts><KeyValuePairOfDecimalString><Key>1.9</Key><Value>48933104000101</Value></KeyValuePairOfDecimalString><KeyValuePairOfDecimalString><Key>38.1</Key><Value>48957000003001</Value></KeyValuePairOfDecimalString><KeyValuePairOfDecimalString><Key>10</Key><Value>2008974956</Value></KeyValuePairOfDecimalString></chargesAccounts></PaymentRequest></SubPostTransWithChargeResult></SubPostTransWithChargeResponse></soap:Body></soap:Envelope>";

        System.out.println("\n");

        SubPostTransWithChargeResponse d = (new SoapTransformer<SubPostTransWithChargeResponse>(arrayTags)).transformBody(example2, SubPostTransWithChargeResponse.class);
        System.out.println(d);

    }
}
