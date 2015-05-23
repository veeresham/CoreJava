package esi.corbaservicePackage;

/**
 * Generated from IDL alias "ESIProperties".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at May 17, 2014 8:04:50 PM
 */

public abstract class ESIPropertiesHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;

	public static void insert (org.omg.CORBA.Any any, esi.corbaservicePackage.ESIProperty[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static esi.corbaservicePackage.ESIProperty[] extract (final org.omg.CORBA.Any any)
	{
		if ( any.type().kind() == org.omg.CORBA.TCKind.tk_null)
		{
			throw new org.omg.CORBA.BAD_OPERATION ("Can't extract from Any with null type.");
		}
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(ESIPropertiesHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_alias_tc(esi.corbaservicePackage.ESIPropertiesHelper.id(), "ESIProperties",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.CORBA.ORB.init().create_struct_tc(esi.corbaservicePackage.ESIPropertyHelper.id(),"ESIProperty",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("value", org.omg.CORBA.ORB.init().create_string_tc(0), null)})));
				}
			}
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:esi/corbaservice/ESIProperties:1.0";
	}
	public static esi.corbaservicePackage.ESIProperty[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		esi.corbaservicePackage.ESIProperty[] _result;
		int _l_result0 = _in.read_long();
		try
		{
			 int x = _in.available();
			 if ( x > 0 && _l_result0 > x )
				{
					throw new org.omg.CORBA.MARSHAL("Sequence length too large. Only " + x + " available and trying to assign " + _l_result0);
				}
		}
		catch (java.io.IOException e)
		{
		}
		_result = new esi.corbaservicePackage.ESIProperty[_l_result0];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=esi.corbaservicePackage.ESIPropertyHelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, esi.corbaservicePackage.ESIProperty[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			esi.corbaservicePackage.ESIPropertyHelper.write(_out,_s[i]);
		}

	}
}
