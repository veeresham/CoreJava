package esi.corbaservicePackage;

/**
 * Generated from IDL alias "ESIProperties".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at May 17, 2014 8:04:50 PM
 */

public final class ESIPropertiesHolder
	implements org.omg.CORBA.portable.Streamable
{
	public esi.corbaservicePackage.ESIProperty[] value;

	public ESIPropertiesHolder ()
	{
	}
	public ESIPropertiesHolder (final esi.corbaservicePackage.ESIProperty[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ESIPropertiesHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ESIPropertiesHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ESIPropertiesHelper.write (out,value);
	}
}
