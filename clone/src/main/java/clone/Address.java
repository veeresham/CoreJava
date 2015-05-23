package clone;

public class Address implements Cloneable
{
    private String city;
    private String country;
    public String getCity()
    {
        return city;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    public String getCountry()
    {
        return country;
    }
    public void setCountry(String country)
    {
        this.country = country;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    @Override
    public int hashCode()
    {
        int hashCode = 0;
        if(city != null)
            hashCode += city.hashCode();
        if(country != null)
            hashCode += country.hashCode();
        return hashCode;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Address)
        {
            Address other = (Address)obj;
            return (other.getCity().equals(city) && other.getCountry().equalsIgnoreCase(country));        
        }
        return false;
    }
}
