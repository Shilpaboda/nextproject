package com.firstcry.base;

import com.firstcry.util.XLS_Reader;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

    public static boolean isInitializaed=false;
    public static Properties OR, CONFIG;
    public static FileInputStream ip, cp;
    public static XLS_Reader ProjectSuite, HOmeSuite, BabyClothsSuite, KidsClothsSuite;


    public void initialization() throws IOException {
        if(!isInitializaed){
            //create object for Properties class
            OR = new Properties();
            //Create object for Fileinputstream
            ip = new FileInputStream("src/com/firstcry/config/OR.properties");
            OR.load(ip);

            CONFIG = new Properties();
            cp = new FileInputStream("src/com/firstcry/config/config.properties");
            CONFIG.load(cp);

            ProjectSuite = new XLS_Reader("src/com/firstcry/testdata/ProjectSuite.xlsx");
            HOmeSuite = new XLS_Reader("src/com/firstcry/testdata/Home.xlsx");
            BabyClothsSuite = new XLS_Reader("src/com/firstcry/testdata/BabyCloths.xlsx");
            KidsClothsSuite = new XLS_Reader("src/com/firstcry/testdata/KidsCloths.xlsx");

            isInitializaed=true;

        }

    }

}
