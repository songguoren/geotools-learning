package com.dukk;

import org.geotools.data.DataStore;
import org.geotools.data.DataStoreFinder;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PostGISDataStore {

    public static void main(String[] args) {
        Map<String, Object> params = new HashMap<>();
        params.put("dbtype", "postgis");
        params.put("host", "10.130.10.152");
        params.put("port", 5432);
        params.put("schema", "public");
        params.put("database", "om_man_trunk_pg");
        params.put("user", "postgres");
        params.put("passwd", "coremap_1024++");


        try {
            DataStore dataStore = DataStoreFinder.getDataStore(params);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("########");
    }
}
