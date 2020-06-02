package lg.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * author: LG
 * date: 2019-09-25 15:27
 * desc:
 */
@Slf4j
public class OshiControllerTest {

    @Test
    public void addCache() {
        System.out.println("start");
        SystemInfo si = new SystemInfo();
        HardwareAbstractionLayer hal = si.getHardware();
        OperatingSystem os = si.getOperatingSystem();
        System.out.println(os);
        log.info("检查 CPU...");
        CentralProcessor processor = hal.getProcessor();
        double[] loadAverage = processor.getSystemLoadAverage(3);
        System.out.println(loadAverage);
        System.out.println(loadAverage.clone().toString());

        System.out.println(loadAverage[1]);
        System.out.println(loadAverage[2]);
    }

    @Test
    public void t (){
        ArrayList<String> strings = new ArrayList<>();
        strings.add("b");
        strings.add("a.a");
//        if(strings.contains("."))
//            System.out.println("suss");

        for (String s : strings)
            if(s.contains("."))
                 System.out.println("suss");
    }

    @Test
    public void testFormat(){

        String str="SELECT *,st_astext(\"WZ\") FROM	\"GFGX_Y_DMK_DMSJ\" WHERE \"LV\" >= 3 and (\"DMMC\" like '%s%%' OR \"DMJP\" like '%s%%' OR \"DMQP\" like '%s%%') \r\n" +
                "ORDER BY \"LV\" LIMIT 50";

        System.out.println(String.format(str,"ggg","ggg","ggg"));
    }

}