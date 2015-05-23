package esi.corbaservicePackage;


/**
 * Generated from IDL struct "ESIProperty".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at May 17, 2014 8:04:50 PM
 */

public abstract class ESIPropertyHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ESIPropertyHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(esi.corbaservicePackage.ESIPropertyHelper.id(),"ESIProperty",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final esi.corbaservicePackage.ESIProperty s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static esi.corbaservicePackage.ESIProperty extract (final org.omg.CORBA.Any any)
	{
		org.omg.CORBA.portable.InputStream in = any.create_input_stream();
		try
		{
			return read (in);
		}
		finally
		{
			try
			{
				in.close();
			}
			catch (java.io.IOException e)
			{
			throw new RuntimeException("Unexpected exception " + e.toString() );
			}
		}
	}

	public static String id()
	{
		return "IDL:esi/corbaservice/ESIProperty:1.0";
	}
	public static esi.corbaservicePackage.ESIProperty read (final org.omg.CORBA.portable.InputStream in)
	{
		esi.corbaservicePackage.ESIProperty result = new esi.corbaservicePackage.ESIProperty();
		result.name=in.read_string();
		result.value=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final esi.corbaservicePackage.ESIProperty s)
	{
		java.lang.String tmpResult0 = s.name;
out.write_string( tmpResult0 );
		java.lang.String tmpResult1 = s.value;
out.write_string( tmpResult1 );
	}
}
