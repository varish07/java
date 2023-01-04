import javax.xml.bind.JAXBException;

public class Main {
    public static void main(String[] args) throws JAXBException {
        Address ad = new Address("hindalco","renukoot");
        Employee emp =new Employee(001,"ali",ad);
        JaxbHandler jh = new JaxbHandler();
        jh.marshal(emp);
        Employee e = jh.unMarshal();
        if(e!=null)
            System.out.println(e);
        else
            System.out.println(e);
    }
}