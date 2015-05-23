package com.test;

import esi.corbaservice;
import esi.corbaserviceHelper;
import esi.corbaservicePackage.ESIPayloadHolder;
import esi.corbaservicePackage.ESIPropertiesHolder;
import esi.corbaservicePackage.ESIProperty;

public class Client
{

    public static void main(String[] args) throws Exception
    {
        org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, null);
        
        String ior = "IOR:000000000000001949444C3A6573692F636F726261736572766963653A312E300000000000000001000000000000009C000102000000000D3139322E3136382E31312E3300001B390000002B636F6D2E746573742E636F726261736572766963652F42656E6368504F412F636F7262617365727669636500000000030000000300000018000000000000000D3137322E31362E3235312E3100001B390000000300000018000000000000000E3139322E3136382E3139312E31001B390000000000000008000000004A414300";
        
        corbaservice server = corbaserviceHelper.narrow(orb.string_to_object(ior));
        
        ESIProperty[] e = new ESIProperty[1];
        e[0] = new ESIProperty();
        e[0].name = "p000";
        e[0].value = "0000";
        
        
        ESIPayloadHolder payload = new ESIPayloadHolder();
        payload.value = new byte[]{1};
        
        ESIPropertiesHolder holder = new ESIPropertiesHolder();
        holder.value = e;
        
        server.sendMessage(new byte[]{1},e, payload, holder);
        
        orb.shutdown (true);

    }

}
