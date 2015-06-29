package mapdb;

import java.io.File;
import java.util.Map;

import org.mapdb.DB;
import org.mapdb.DBMaker;

public class Test
{
    public static void main(String[] args)
    {
        File f = new File("/tmp/sample.map");
        if(f.exists())
            f.delete();
        
        DB db = DBMaker.newFileDB(f).make();
        Map<String,String> map = db.createHashMap("sample").makeOrGet(); 
        map.put("sample1", "value1");
        map.put("sampl21", "value1");
        map.put("sampl31", "value1");
        System.out.println(map);
        
        Map<String,String> map3 = db.createHashMap("newsampel").makeOrGet(); 
        map3.put("sample1", "value1");
        System.out.println(map3);
        
        db.commit();
        db.close();
       
        
        
        DB db2 = DBMaker.newFileDB(new File("/tmp/sample.map")).make();
        Map<String,String> map2 = db2.createHashMap("sample").makeOrGet(); 
        
        System.out.println(map2);
    }
}
