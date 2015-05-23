package esi.corbaservicePackage;

/**
 * Generated from IDL exception "ESIError".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at May 17, 2014 8:04:50 PM
 */

public final class ESIErrorHolder
	implements org.omg.CORBA.portable.Streamable
{
	public esi.corbaservicePackage.ESIError value;

	public ESIErrorHolder ()
	{
	}
	public ESIErrorHolder(final esi.corbaservicePackage.ESIError initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return esi.corbaservicePackage.ESIErrorHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = esi.corbaservicePackage.ESIErrorHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		esi.corbaservicePackage.ESIErrorHelper.write(_out, value);
	}
}
