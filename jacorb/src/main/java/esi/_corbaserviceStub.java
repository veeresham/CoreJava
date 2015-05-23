package esi;


/**
 * Generated from IDL interface "corbaservice".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at May 17, 2014 8:04:50 PM
 */

public class _corbaserviceStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements esi.corbaservice
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private String[] ids = {"IDL:esi/corbaservice:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = esi.corbaserviceOperations.class;
	public void sendMessage(byte[] inObject, esi.corbaservicePackage.ESIProperty[] inProperties, esi.corbaservicePackage.ESIPayloadHolder outObject, esi.corbaservicePackage.ESIPropertiesHolder outProperties) throws esi.corbaservicePackage.ESIError
	{
		while(true)
		{
			if(! this._is_local())
			{
				org.omg.CORBA.portable.InputStream _is = null;
				org.omg.CORBA.portable.OutputStream _os = null;
				try
				{
					_os = _request( "sendMessage", true);
					esi.corbaservicePackage.ESIPayloadHelper.write(_os,inObject);
					esi.corbaservicePackage.ESIPropertiesHelper.write(_os,inProperties);
					_is = _invoke(_os);
					outObject.value = esi.corbaservicePackage.ESIPayloadHelper.read(_is);
					outProperties.value = esi.corbaservicePackage.ESIPropertiesHelper.read(_is);
					return;
				}
				catch( org.omg.CORBA.portable.RemarshalException _rx )
					{
						continue;
					}
				catch( org.omg.CORBA.portable.ApplicationException _ax )
				{
					String _id = _ax.getId();
					try
					{
						if( _id.equals("IDL:esi/corbaservice/ESIError:1.0"))
						{
							throw esi.corbaservicePackage.ESIErrorHelper.read(_ax.getInputStream());
						}
						else 
						{
							throw new RuntimeException("Unexpected exception " + _id );
						}
					}
					finally
					{
						try
						{
							_ax.getInputStream().close();
						}
						catch (java.io.IOException e)
						{
							throw new RuntimeException("Unexpected exception " + e.toString() );
						}
					}
			}
			finally
			{
				if (_os != null)
				{
					try
					{
						_os.close();
					}
					catch (java.io.IOException e)
					{
						throw new RuntimeException("Unexpected exception " + e.toString() );
					}
				}
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "sendMessage", _opsClass );
			if( _so == null )
				continue;
			corbaserviceOperations _localServant = (corbaserviceOperations)_so.servant;
			try
			{
				_localServant.sendMessage(inObject,inProperties,outObject,outProperties);
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).normalCompletion();
				return;
			}
			catch (esi.corbaservicePackage.ESIError ex) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(ex);
				throw ex;
			}
			catch (RuntimeException re) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(re);
				throw re;
			}
			catch (java.lang.Error err) 
			{
				if ( _so instanceof org.omg.CORBA.portable.ServantObjectExt) 
					((org.omg.CORBA.portable.ServantObjectExt)_so).exceptionalCompletion(err);
				throw err;
			}
			finally
			{
				_servant_postinvoke(_so);
			}
		}

		}

	}

}
