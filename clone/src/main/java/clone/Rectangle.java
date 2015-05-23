package clone;

public class Rectangle implements Cloneable
{
    private Long length;
    private Long breadth;
    
    public Rectangle(Long l, Long b)
    {
        this.length = l;
        this.breadth = b;
    }
    public Long getLength()
    {
        return length;
    }
    public void setLength(Long length)
    {
        this.length = length;
    }
    public Long getBreadth()
    {
        return breadth;
    }
    public void setBreadth(Long breadth)
    {
        this.breadth = breadth;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Rectangle)
        {
            Rectangle other = (Rectangle)obj;
            return (other.length == length && other.breadth == breadth);
        }
        return false;
    }
    @Override
    public int hashCode()
    {
        int hashCode = 0;
        if(length != null)
            hashCode += length.hashCode();
        if(breadth != null)
            hashCode += breadth.hashCode();
        return hashCode;
    }
    @Override
    public String toString()
    {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Lenght : ");
        buffer.append(length);
        buffer.append("; Breadth : ");
        buffer.append(breadth);
        return buffer.toString();
    }
}
