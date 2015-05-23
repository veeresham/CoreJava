package com.test;

import java.util.Iterator;
import java.util.Properties;

import org.omg.PortableServer.IdAssignmentPolicyValue;
import org.omg.PortableServer.LifespanPolicyValue;
import org.omg.PortableServer.POA;

public class Server
{

    public static void main(String[] args) throws Exception
    {
        Properties props = new Properties ();
        props.setProperty ("jacorb.implname", "esi.corbaservice");
        props.setProperty("jacorb.codeset", "on");
        props.setProperty("jacorb.native_char_codeset", "UTF8");
        props.setProperty("jacorb.native_wchar_codeset", "UTF16");
        props.setProperty("OAPort", "6969");
        props.setProperty("OAIAddr", "10.158.0.53");
        

        org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (new String[]{}, props);
        org.omg.PortableServer.POA rootPOA =
            org.omg.PortableServer.POAHelper.narrow (orb.resolve_initial_references ("RootPOA"));

        org.omg.CORBA.Policy[] policies = new org.omg.CORBA.Policy[2];

        policies[0] = rootPOA.create_id_assignment_policy (IdAssignmentPolicyValue.USER_ID);
        policies[1] = rootPOA.create_lifespan_policy (LifespanPolicyValue.PERSISTENT);

        POA benchPOA = rootPOA.create_POA ("BenchPOA",
                                           rootPOA.the_POAManager (), policies);

        rootPOA.the_POAManager ().activate ();

        byte[] oid = "corbaservice".getBytes ();

        benchPOA.activate_object_with_id (oid, new CorbaServiceImpl());

        org.omg.CORBA.Object o = benchPOA.id_to_reference (oid);

        String ref = orb.object_to_string (o);
        
        System.out.println(ref);
        
        
        
        
        orb.run();

    }

}
