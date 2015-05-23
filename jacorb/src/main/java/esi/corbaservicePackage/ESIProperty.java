package esi.corbaservicePackage;

/**
 * Generated from IDL struct "ESIProperty".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at May 17, 2014 8:04:50 PM
 */

public final class ESIProperty
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public ESIProperty(){}
	public java.lang.String name = "";
	public java.lang.String value = "";
	public ESIProperty(java.lang.String name, java.lang.String value)
	{
		this.name = name;
		this.value = value;
	}
}
