package esi.corbaservicePackage;

/**
 * Generated from IDL exception "ESIError".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at May 17, 2014 8:04:50 PM
 */

public final class ESIError
	extends org.omg.CORBA.UserException
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ESIError()
	{
		super(esi.corbaservicePackage.ESIErrorHelper.id());
	}

	public java.lang.String errorCode = "";
	public java.lang.String errorMessage = "";
	public esi.corbaservicePackage.ESIProperty[] outProperties;
	public ESIError(java.lang.String _reason,java.lang.String errorCode, java.lang.String errorMessage, esi.corbaservicePackage.ESIProperty[] outProperties)
	{
		super(_reason);
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.outProperties = outProperties;
	}
	public ESIError(java.lang.String errorCode, java.lang.String errorMessage, esi.corbaservicePackage.ESIProperty[] outProperties)
	{
		super(esi.corbaservicePackage.ESIErrorHelper.id());
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.outProperties = outProperties;
	}
}
