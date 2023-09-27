import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;

public class Test2 extends  Test1{
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for (int i = 0; i < 10000000; i++) {
            sb.append("Learning");
        }
        System.out.println("Time taken by StringBuffer"+(System.currentTimeMillis()-startTime)+"ms");
        List arr = new ArrayList<String>();
    }

}
