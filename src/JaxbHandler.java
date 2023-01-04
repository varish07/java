import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JaxbHandler {

    public JaxbHandler() {
    }

    public void marshal(Employee e) throws  JAXBException{

           JAXBContext context = JAXBContext.newInstance(Employee.class);
           Marshaller m = context.createMarshaller();
           m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
           m.marshal(e,System.out);
           m.marshal(e,new File("src\\emp.xml"));


   }

    public Employee unMarshal() {
        Employee em = null;
        try {
            JAXBContext context = JAXBContext.newInstance(Employee.class);
            Unmarshaller um = context.createUnmarshaller();
            em = (Employee) um.unmarshal(new File("src\\emp.xml"));
        } catch (JAXBException je) {
            System.out.println(je);
        }

        return em;
    }
}
