package esi;


/**
 * Generated from IDL interface "corbaservice".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at May 17, 2014 8:04:50 PM
 */

public abstract class corbaserviceHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(corbaserviceHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:esi/corbaservice:1.0", "corbaservice");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final esi.corbaservice s)
	{
			any.insert_Object(s);
	}
	public static esi.corbaservice extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:esi/corbaservice:1.0";
	}
	public static corbaservice read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(esi._corbaserviceStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final esi.corbaservice s)
	{
		_out.write_Object(s);
	}
	public static esi.corbaservice narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof esi.corbaservice)
		{
			return (esi.corbaservice)obj;
		}
		else if (obj._is_a("IDL:esi/corbaservice:1.0"))
		{
			esi._corbaserviceStub stub;
			stub = new esi._corbaserviceStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static esi.corbaservice unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof esi.corbaservice)
		{
			return (esi.corbaservice)obj;
		}
		else
		{
			esi._corbaserviceStub stub;
			stub = new esi._corbaserviceStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
