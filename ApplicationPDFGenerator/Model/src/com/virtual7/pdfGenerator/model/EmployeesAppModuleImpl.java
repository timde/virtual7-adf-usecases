package com.virtual7.pdfGenerator.model;


import com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl;

import com.virtual7.pdfGenerator.model.common.EmployeesAppModule;
import com.virtual7.pdfGenerator.model.pdf.XmlStringGenerator;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.StringReader;

import java.net.URL;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;

import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewObjectImpl;

import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.MimeConstants;


// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Sep 20 18:11:01 EEST 2012
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmployeesAppModuleImpl extends ApplicationModuleImpl implements EmployeesAppModule {
    /**
     * This is the default constructor (do not remove).
     */
    public EmployeesAppModuleImpl() {
    }

    /**
     * Generates a PDF file containing a table with the employee first name and last name.
     */
    public byte[] generatePDF() {
        byte[] pdf = null;
        try {
            String xml = XmlStringGenerator.generateXMLString(getEmployeesVO());
                
            System.out.println("FOP ExampleXML2PDF\n");
            System.out.println("Preparing...");

            // Setup input and output files
            URL xslLocation = this.getClass().getClassLoader().getResource("com/virtual7/pdfGenerator/view/xsl_files/employeesData.xsl");
            File xsltfile = new File(xslLocation.getPath());
            
            System.out.println("Stylesheet: " + xsltfile);
            System.out.println();
            System.out.println("Transforming...");

            // configure fopFactory as desired
            FopFactory fopFactory = FopFactory.newInstance();

            FOUserAgent foUserAgent = fopFactory.newFOUserAgent();
            // configure foUserAgent as desired

            // Setup output
            ByteArrayOutputStream out = new ByteArrayOutputStream();

            try {
                // Construct fop with desired output format
                Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent, out);

                // Setup XSLT
                TransformerFactory factory = new TransformerFactoryImpl();
                Transformer transformer = factory.newTransformer(new StreamSource(xsltfile));

                // Setup input for XSLT transformation
                Source src = new StreamSource(new StringReader(xml));

                // Resulting SAX events (the generated FO) must be piped through to FOP
                Result res = new SAXResult(fop.getDefaultHandler());

                // Start XSLT transformation and FOP processing
                transformer.transform(src, res);
                out.flush();
                
                // Get pdf bytes
                pdf = out.toByteArray();
            
            } finally {
                out.close();
            }
            
            System.out.println("Success!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return pdf;
    }

    /**
     * Container's getter for EmployeesVO.
     * @return EmployeesVO
     */
    public ViewObjectImpl getEmployeesVO() {
        return (ViewObjectImpl)findViewObject("EmployeesVO");
    }
}
