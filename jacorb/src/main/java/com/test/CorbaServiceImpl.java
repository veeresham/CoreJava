package com.test;

import esi.corbaservicePOA;
import esi.corbaservicePackage.ESIError;
import esi.corbaservicePackage.ESIPayloadHolder;
import esi.corbaservicePackage.ESIPropertiesHolder;
import esi.corbaservicePackage.ESIProperty;

public class CorbaServiceImpl extends corbaservicePOA
{

    public void sendMessage(byte[] inObject, ESIProperty[] inProperties,
            ESIPayloadHolder outObject, ESIPropertiesHolder outProperties)
            throws ESIError
    {
        System.out.println("Sending message ");

    }

}
