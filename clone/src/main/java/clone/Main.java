package clone;

public class Main
{

    public static void main(String[] args)
    {
        deepCopying();
    }
    
    public static void deepCopying()
    {
        Person p = new Person();
        p.setName("John");
        
        Address a = new Address();
        a.setCity("Hyderabad");
        a.setCountry("India");
        
        p.setAddress(a);
        try
        {
            Person q = (Person) p.clone();
            System.out.println("p is : "+p);
            System.out.println("q is : "+q);
            System.out.println("Properties");
            System.out.println("p == q : "+(p == q));
            System.out.println("p.equals(q) : "+(p.equals(q)));
            System.out.println("p.getClass() == q.getClass() : "+(p.getClass() == q.getClass()));
        } catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
    
    public static void shallowCopying()
    {
        Rectangle r = new Rectangle(10L, 12L);
        try
        {
            Rectangle s = (Rectangle)r.clone();
            System.out.println("r is : "+r);
            System.out.println("s is : "+s);
            System.out.println("Properties");
            System.out.println("r == s : "+(r == s));
            System.out.println("r.equals(s) : "+(r.equals(s)));
            System.out.println("r.getClass() == s.getClass() : "+(r.getClass() == s.getClass()));
        } catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
    

}
