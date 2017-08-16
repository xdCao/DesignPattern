package SimpleFactory;


import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created by xdcao on 2017/8/16.
 */
public class XmlUtil {

    public static String getChartType(){
        try {
            DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
            Document document;
            document=documentBuilder.parse(new File("config.xml"));
            NodeList nl=document.getElementsByTagName("chartType");
            Node node=nl.item(0).getFirstChild();
            String chartType=node.getNodeValue().trim();
            return chartType;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
