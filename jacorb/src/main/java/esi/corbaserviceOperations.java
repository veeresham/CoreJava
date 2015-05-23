package esi;


/**
 * Generated from IDL interface "corbaservice".
 *
 * @author JacORB IDL compiler V 3.4
 * @version generated at May 17, 2014 8:04:50 PM
 */

public interface corbaserviceOperations
{
	/* constants */
	/* operations  */
	void sendMessage(byte[] inObject, esi.corbaservicePackage.ESIProperty[] inProperties, esi.corbaservicePackage.ESIPayloadHolder outObject, esi.corbaservicePackage.ESIPropertiesHolder outProperties) throws esi.corbaservicePackage.ESIError;
}
