package esi.corbaservicePackage;

/**
 * Generated from IDL alias "ESIPayload".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at May 17, 2014 8:04:50 PM
 */

public final class ESIPayloadHolder
	implements org.omg.CORBA.portable.Streamable
{
	public byte[] value;

	public ESIPayloadHolder ()
	{
	}
	public ESIPayloadHolder (final byte[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ESIPayloadHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ESIPayloadHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ESIPayloadHelper.write (out,value);
	}
}
