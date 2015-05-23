package esi;

/**
 * Generated from IDL interface "corbaservice".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at May 17, 2014 8:04:50 PM
 */

public final class corbaserviceHolder	implements org.omg.CORBA.portable.Streamable{
	 public corbaservice value;
	public corbaserviceHolder()
	{
	}
	public corbaserviceHolder (final corbaservice initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return corbaserviceHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = corbaserviceHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		corbaserviceHelper.write (_out,value);
	}
}
