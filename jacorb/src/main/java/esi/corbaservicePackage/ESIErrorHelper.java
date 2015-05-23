package esi.corbaservicePackage;


/**
 * Generated from IDL exception "ESIError".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at May 17, 2014 8:04:50 PM
 */

public abstract class ESIErrorHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ESIErrorHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_exception_tc(esi.corbaservicePackage.ESIErrorHelper.id(),"ESIError",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("errorCode", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("errorMessage", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("outProperties", org.omg.CORBA.ORB.init().create_alias_tc(esi.corbaservicePackage.ESIPropertiesHelper.id(), "ESIProperties",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(esi.corbaservicePackage.ESIPropertyHelper.id(),"ESIProperty",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)}))), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final esi.corbaservicePackage.ESIError s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static esi.corbaservicePackage.ESIError extract (final org.omg.CORBA.Any any)
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
		return "IDL:esi/corbaservice/ESIError:1.0";
	}
	public static esi.corbaservicePackage.ESIError read (final org.omg.CORBA.portable.InputStream in)
	{
		String id = in.read_string();
		if (!id.equals(id())) throw new org.omg.CORBA.MARSHAL("wrong id: " + id);
		java.lang.String x0;
		x0=in.read_string();
		java.lang.String x1;
		x1=in.read_string();
		esi.corbaservicePackage.ESIProperty[] x2;
		x2 = esi.corbaservicePackage.ESIPropertiesHelper.read(in);
		final esi.corbaservicePackage.ESIError result = new esi.corbaservicePackage.ESIError(id, x0, x1, x2);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final esi.corbaservicePackage.ESIError s)
	{
		out.write_string(id());
		java.lang.String tmpResult2 = s.errorCode;
out.write_string( tmpResult2 );
		java.lang.String tmpResult3 = s.errorMessage;
out.write_string( tmpResult3 );
		esi.corbaservicePackage.ESIPropertiesHelper.write(out,s.outProperties);
	}
}
