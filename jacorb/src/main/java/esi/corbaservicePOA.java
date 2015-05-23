package esi;


/**
 * Generated from IDL interface "corbaservice".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at May 17, 2014 8:04:50 PM
 */

public abstract class corbaservicePOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, esi.corbaserviceOperations
{
	static private final java.util.HashMap<String,Integer> m_opsHash = new java.util.HashMap<String,Integer>();
	static
	{
		m_opsHash.put ( "sendMessage", Integer.valueOf(0));
	}
	private String[] ids = {"IDL:esi/corbaservice:1.0"};
	public esi.corbaservice _this()
	{
		org.omg.CORBA.Object __o = _this_object() ;
		esi.corbaservice __r = esi.corbaserviceHelper.narrow(__o);
		return __r;
	}
	public esi.corbaservice _this(org.omg.CORBA.ORB orb)
	{
		org.omg.CORBA.Object __o = _this_object(orb) ;
		esi.corbaservice __r = esi.corbaserviceHelper.narrow(__o);
		return __r;
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // sendMessage
			{
			try
			{
				byte[] _arg0=esi.corbaservicePackage.ESIPayloadHelper.read(_input);
				esi.corbaservicePackage.ESIProperty[] _arg1=esi.corbaservicePackage.ESIPropertiesHelper.read(_input);
				esi.corbaservicePackage.ESIPayloadHolder _arg2= new esi.corbaservicePackage.ESIPayloadHolder();
				esi.corbaservicePackage.ESIPropertiesHolder _arg3= new esi.corbaservicePackage.ESIPropertiesHolder();
				_out = handler.createReply();
				sendMessage(_arg0,_arg1,_arg2,_arg3);
				esi.corbaservicePackage.ESIPayloadHelper.write(_out,_arg2.value);
				esi.corbaservicePackage.ESIPropertiesHelper.write(_out,_arg3.value);
			}
			catch(esi.corbaservicePackage.ESIError _ex0)
			{
				_out = handler.createExceptionReply();
				esi.corbaservicePackage.ESIErrorHelper.write(_out, _ex0);
			}
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
