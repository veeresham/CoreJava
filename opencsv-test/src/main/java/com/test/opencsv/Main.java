package com.test.opencsv;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import au.com.bytecode.opencsv.bean.CsvToBean;
import au.com.bytecode.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;

public class Main
{

    public static void main(String[] args) throws Exception
    {
//        createCSV();
        readCSV();
//        readCSVasBean();
    }
    
    public static void createCSV() throws Exception
    {
        String csv = "/tmp/sample.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csv));
         
        String[] header= new String[]{"Name","Age","Salary","Address"};
        writer.writeNext(header);
        
        List<String[]> allData = new ArrayList<String[]>();
        
        for(int i=0;i<3;i++)
        {
            String[] data = new String[]{"Blogger"+i,"20"+i,"20.0002",i+" World Wide Web"};
            allData.add(data);
        }
        
        writer.writeAll(allData);
         
        writer.close();
        
    }
    
    public static void readCSVasBean() throws Exception
    {
        Map<String, String> mapping = new HashMap<String, String>();
        mapping.put("Name", "name");
        mapping.put("Age", "age");
        mapping.put("Salary", "salary");
        mapping.put("address", "Address");
        
        HeaderColumnNameTranslateMappingStrategy<Employee> strategy = new HeaderColumnNameTranslateMappingStrategy<Employee>();
        strategy.setType(Employee.class);
        strategy.setColumnMapping(mapping);
        
        CSVReader csvReader = new CSVReader(new FileReader("/tmp/sample.csv"));
        CsvToBean<Employee> csvToBean = new CsvToBean<Employee>();
        List<Employee> list = csvToBean.parse(strategy, csvReader);
        
        for(Employee e : list)
        {
            System.out.println(e);
        }
        
    }
    
    public static void readCSV() throws Exception
    {
        CSVReader csvReader = new CSVReader(new FileReader("/tmp/sample.csv"));
        List<String[]> allData = csvReader.readAll();
        
        for(String[] data : allData)
        {
            for(String s : data)
            {
                System.out.print(s+";");
            }
            System.out.println();
        }
        
        csvReader.close();
    }

}
