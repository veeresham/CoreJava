package esi.corbaservicePackage;

/**
 * Generated from IDL struct "ESIProperty".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at May 17, 2014 8:04:50 PM
 */

public final class ESIPropertyHolder
	implements org.omg.CORBA.portable.Streamable
{
	public esi.corbaservicePackage.ESIProperty value;

	public ESIPropertyHolder ()
	{
	}
	public ESIPropertyHolder(final esi.corbaservicePackage.ESIProperty initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return esi.corbaservicePackage.ESIPropertyHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = esi.corbaservicePackage.ESIPropertyHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		esi.corbaservicePackage.ESIPropertyHelper.write(_out, value);
	}
}
