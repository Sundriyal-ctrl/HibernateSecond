package relatioship;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import javax.transaction.Transactional;
import java.util.ArrayList;


public class TransactionManagement {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();
        long value=23756789;
        long next=value%10;
        value/=10;
        //ArrayList arrayList=new ArrayList();
        //arrayList.add(next);
        stringBuffer.append(next);
        while(value!=0)
        {
          long rem=value%10;
          if(next==rem+1)
          {
              next=rem;
              stringBuffer.append(next);
              value/=10;

          }
          else {
              value/=10;
          }
        }

       ;
        System.out.println(stringBuffer.reverse());
    }
}
