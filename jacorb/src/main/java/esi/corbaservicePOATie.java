package esi;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "corbaservice".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at May 17, 2014 8:04:50 PM
 */

public class corbaservicePOATie
	extends corbaservicePOA
{
	private corbaserviceOperations _delegate;

	private POA _poa;
	public corbaservicePOATie(corbaserviceOperations delegate)
	{
		_delegate = delegate;
	}
	public corbaservicePOATie(corbaserviceOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
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
	public corbaserviceOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(corbaserviceOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public void sendMessage(byte[] inObject, esi.corbaservicePackage.ESIProperty[] inProperties, esi.corbaservicePackage.ESIPayloadHolder outObject, esi.corbaservicePackage.ESIPropertiesHolder outProperties) throws esi.corbaservicePackage.ESIError
	{
_delegate.sendMessage(inObject,inProperties,outObject,outProperties);
	}

}
