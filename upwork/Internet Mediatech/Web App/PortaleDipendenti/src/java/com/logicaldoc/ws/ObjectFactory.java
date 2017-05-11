
package com.logicaldoc.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.logicaldoc.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {
    
     private final static QName _Criterion_QNAME = new QName("http://ws.logicaldoc.com", "criterion");
    private final static QName _Document_QNAME = new QName("http://ws.logicaldoc.com", "document");
    private final static QName _Attribute_QNAME = new QName("http://ws.logicaldoc.com", "attribute");
    private final static QName _FindByParameters_QNAME = new QName("http://ws.logicaldoc.com", "findByParameters");
    private final static QName _FindByParametersResponse_QNAME = new QName("http://ws.logicaldoc.com", "findByParametersResponse");
    private final static QName _Exception_QNAME = new QName("http://ws.logicaldoc.com", "Exception");


    private final static QName _RenewResponse_QNAME = new QName("http://ws.logicaldoc.com", "renewResponse");
    private final static QName _Valid_QNAME = new QName("http://ws.logicaldoc.com", "valid");
    private final static QName _ValidResponse_QNAME = new QName("http://ws.logicaldoc.com", "validResponse");
    private final static QName _Logout_QNAME = new QName("http://ws.logicaldoc.com", "logout");
    private final static QName _LoginResponse_QNAME = new QName("http://ws.logicaldoc.com", "loginResponse");
    private final static QName _LogoutResponse_QNAME = new QName("http://ws.logicaldoc.com", "logoutResponse");
    private final static QName _Renew_QNAME = new QName("http://ws.logicaldoc.com", "renew");
    private final static QName _Login_QNAME = new QName("http://ws.logicaldoc.com", "login");
    //private final static QName _Exception_QNAME = new QName("http://ws.logicaldoc.com", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.logicaldoc.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RenewResponse }
     * 
     */
    public RenewResponse createRenewResponse() {
        return new RenewResponse();
    }

    /**
     * Create an instance of {@link Valid }
     * 
     */
    public Valid createValid() {
        return new Valid();
    }

    /**
     * Create an instance of {@link ValidResponse }
     * 
     */
    public ValidResponse createValidResponse() {
        return new ValidResponse();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link Renew }
     * 
     */
    public Renew createRenew() {
        return new Renew();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RenewResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logicaldoc.com", name = "renewResponse")
    public JAXBElement<RenewResponse> createRenewResponse(RenewResponse value) {
        return new JAXBElement<RenewResponse>(_RenewResponse_QNAME, RenewResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Valid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logicaldoc.com", name = "valid")
    public JAXBElement<Valid> createValid(Valid value) {
        return new JAXBElement<Valid>(_Valid_QNAME, Valid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logicaldoc.com", name = "validResponse")
    public JAXBElement<ValidResponse> createValidResponse(ValidResponse value) {
        return new JAXBElement<ValidResponse>(_ValidResponse_QNAME, ValidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logicaldoc.com", name = "logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logicaldoc.com", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logicaldoc.com", name = "logoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Renew }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logicaldoc.com", name = "renew")
    public JAXBElement<Renew> createRenew(Renew value) {
        return new JAXBElement<Renew>(_Renew_QNAME, Renew.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logicaldoc.com", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logicaldoc.com", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }
    
    /**
     * Create an instance of {@link WSCriterion }
     * 
     */
    public WSCriterion createWSCriterion() {
        return new WSCriterion();
    }

    /**
     * Create an instance of {@link WSDocument }
     * 
     */
    public WSDocument createWSDocument() {
        return new WSDocument();
    }

    /**
     * Create an instance of {@link WSAttribute }
     * 
     */
    public WSAttribute createWSAttribute() {
        return new WSAttribute();
    }

    /**
     * Create an instance of {@link FindByParameters }
     * 
     */
    public FindByParameters createFindByParameters() {
        return new FindByParameters();
    }

    /**
     * Create an instance of {@link FindByParametersResponse }
     * 
     */
    public FindByParametersResponse createFindByParametersResponse() {
        return new FindByParametersResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
   
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSCriterion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logicaldoc.com", name = "criterion")
    public JAXBElement<WSCriterion> createCriterion(WSCriterion value) {
        return new JAXBElement<WSCriterion>(_Criterion_QNAME, WSCriterion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logicaldoc.com", name = "document")
    public JAXBElement<WSDocument> createDocument(WSDocument value) {
        return new JAXBElement<WSDocument>(_Document_QNAME, WSDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSAttribute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logicaldoc.com", name = "attribute")
    public JAXBElement<WSAttribute> createAttribute(WSAttribute value) {
        return new JAXBElement<WSAttribute>(_Attribute_QNAME, WSAttribute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logicaldoc.com", name = "findByParameters")
    public JAXBElement<FindByParameters> createFindByParameters(FindByParameters value) {
        return new JAXBElement<FindByParameters>(_FindByParameters_QNAME, FindByParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByParametersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logicaldoc.com", name = "findByParametersResponse")
    public JAXBElement<FindByParametersResponse> createFindByParametersResponse(FindByParametersResponse value) {
        return new JAXBElement<FindByParametersResponse>(_FindByParametersResponse_QNAME, FindByParametersResponse.class, null, value);
    }

}
