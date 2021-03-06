package pl.rusio.lab12;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.4
 * 2015-03-10T12:36:23.677+01:00
 * Generated source version: 2.4.4
 * 
 */
@WebService(targetNamespace = "http://Lab12.rusio.pl/", name = "LoanBroker")
//@XmlSeeAlso({ObjectFactory.class})
public interface LoanBroker {

    @WebMethod
    @RequestWrapper(localName = "getLoanApplicationStatus", targetNamespace = "http://Lab12.rusio.pl/", className = "pl.rusio.lab12.GetLoanApplicationStatus")
    @ResponseWrapper(localName = "getLoanApplicationStatusResponse", targetNamespace = "http://Lab12.rusio.pl/", className = "pl.rusio.lab12.GetLoanApplicationStatusResponse")
    @WebResult(name = "return", targetNamespace = "")
    public LoanApplicationStatus getLoanApplicationStatus(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebMethod
    @RequestWrapper(localName = "sendLoanApplication", targetNamespace = "http://Lab12.rusio.pl/", className = "pl.rusio.lab12.SendLoanApplication")
    @ResponseWrapper(localName = "sendLoanApplicationResponse", targetNamespace = "http://Lab12.rusio.pl/", className = "pl.rusio.lab12.SendLoanApplicationResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int sendLoanApplication(
        @WebParam(name = "arg0", targetNamespace = "")
        LoanApplication arg0
    );
}
