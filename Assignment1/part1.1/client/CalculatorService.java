
//package client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1-SNAPSHOT
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculatorService", targetNamespace = "http://calculator_maven.calculator.com/")
public interface CalculatorService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://calculator_maven.calculator.com/", className = "client.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://calculator_maven.calculator.com/", className = "client.AddResponse")
    @Action(input = "http://calculator_maven.calculator.com/CalculatorService/addRequest", output = "http://calculator_maven.calculator.com/CalculatorService/addResponse")
    public float add(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        float arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sub", targetNamespace = "http://calculator_maven.calculator.com/", className = "client.Sub")
    @ResponseWrapper(localName = "subResponse", targetNamespace = "http://calculator_maven.calculator.com/", className = "client.SubResponse")
    @Action(input = "http://calculator_maven.calculator.com/CalculatorService/subRequest", output = "http://calculator_maven.calculator.com/CalculatorService/subResponse")
    public float sub(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        float arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "mul", targetNamespace = "http://calculator_maven.calculator.com/", className = "client.Mul")
    @ResponseWrapper(localName = "mulResponse", targetNamespace = "http://calculator_maven.calculator.com/", className = "client.MulResponse")
    @Action(input = "http://calculator_maven.calculator.com/CalculatorService/mulRequest", output = "http://calculator_maven.calculator.com/CalculatorService/mulResponse")
    public float mul(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        float arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "div", targetNamespace = "http://calculator_maven.calculator.com/", className = "client.Div")
    @ResponseWrapper(localName = "divResponse", targetNamespace = "http://calculator_maven.calculator.com/", className = "client.DivResponse")
    @Action(input = "http://calculator_maven.calculator.com/CalculatorService/divRequest", output = "http://calculator_maven.calculator.com/CalculatorService/divResponse")
    public float div(
        @WebParam(name = "arg0", targetNamespace = "")
        float arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        float arg1);

}
