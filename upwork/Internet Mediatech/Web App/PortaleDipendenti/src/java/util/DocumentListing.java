/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.logicaldoc.enterprise.webservice.soap.endpoint.EnterpriseSearch;
import com.logicaldoc.enterprise.webservice.soap.endpoint.SoapEnterpriseSearchServiceService;
import com.logicaldoc.webservice.soap.endpoint.Auth;
import com.logicaldoc.webservice.soap.endpoint.SoapAuthServiceService;
import com.logicaldoc.ws.WSCriterion;
import com.logicaldoc.ws.WSDocument;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abdullah Shekhar
 */
public class DocumentListing {
    public List<Doc> documentsName() throws Exception{
        String base = "https://docs.sitav.eu/services";
        SoapAuthServiceService s = new SoapAuthServiceService();
        Auth client;
        client = s.getPort(Auth.class);
        String sid = client.login("pers_docsonline", "Jerry234!");

        SoapEnterpriseSearchServiceService se = new SoapEnterpriseSearchServiceService();
        EnterpriseSearch es = se.getPort(EnterpriseSearch.class);

        WSCriterion cri = new WSCriterion();
        cri.setType(0);
        cri.setField("filename");
        cri.setOperator("contains");
        cri.setStringValue(".pdf");

        List<WSCriterion> crilist = new ArrayList<WSCriterion>();

        crilist.add(cri);
       

        List<WSDocument> a = es.findByParameters(sid, 1L, crilist, 0);
        
        List<Doc> fileNames = new ArrayList<Doc>();
        for (int i = 0; i < a.size(); i++) {
            Doc d=new Doc(a.get(i).getFileName(),"https://docs.sitav.eu/download?docId="+a.get(i).getId());
            fileNames.add(d);
            System.out.println(a.get(i).getFileName());
        }
        return fileNames;
    }
}
