package clone;

public class Person implements Cloneable
{
    private String name;
    private Address address;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public Address getAddress()
    {
        return address;
    }
    public void setAddress(Address address)
    {
        this.address = address;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        Person p = (Person) super.clone();
        p.setAddress((Address)getAddress().clone());
        return p;
    }
    @Override
    public int hashCode()
    {
        int hashCode = 0;
        if(name != null)
            hashCode += name.hashCode();
        if(address != null)
            hashCode += address.hashCode();
        return hashCode;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Person)
        {
            Person other = (Person)obj;
            return (other.getName().equals(name) && other.getAddress().equals(getAddress()));
        }
        return false;
    }
    
}
