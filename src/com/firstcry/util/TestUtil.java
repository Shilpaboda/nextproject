package com.firstcry.util;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestUtil {
    public static void main(String[] args) {
        XLS_Reader xls = new XLS_Reader("src/com/firstcry/testdata/ProjectSuite.xlsx");
        System.out.println(isSuiteRunnable(xls, "Shilpa"));
    }




    public static boolean isSuiteRunnable(XLS_Reader xls, String suiteName){
        boolean isExecutable=false;
        for (int i = 2; i <=xls.getRowCount("FirstCry"); i++) {
            String suite = xls.getCellData("FirstCry","TSID", i);
            String runmode = xls.getCellData("FirstCry", "Runmode",i);
            System.out.println(suite +" === "+runmode);

            if(suite.equalsIgnoreCase(suiteName)){
                if(runmode.equalsIgnoreCase("Yes")){
                    isExecutable=true;
                }
            }
        }
        return isExecutable;
    }
}
