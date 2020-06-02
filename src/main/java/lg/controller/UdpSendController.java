package lg.controller;


import io.swagger.annotations.Api;
import lg.config.BaseConfig;
import lg.utils.TS10S5L;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;
import java.util.ResourceBundle;

import static lg.utils.SendUtils.*;


@Slf4j
@Controller
@Api(tags = "udp发包程序")
public class UdpSendController {

    static float[][] jwd = new float[100000][2];
    static Random rand = new Random();
    static int count = 0;
    static float[][] dir = new float[100000][2];


    @Value("${udp.send.ip}")
    public String ip ;

    @Value("${udp.send.port}")
    public String port ;

    @Value("${udp.send.args0}")
    public String args0;

    @Value("${udp.send.args1}")
    public String args1;

    @Value("${udp.send.args2}")
    public String args2;

    @Value("${udp.send.args3}")
    public String args3;


    @GetMapping("/send")
    @ResponseBody
    public String send(){

        //获取配置信息
        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < 2; j++) {
                jwd[i][j] = 0f;
            }
        }

        System.out.println("开始发送" + Integer.parseInt(args2) * Integer.parseInt(args3) + "条udp报文数据...");

        long startTime = System.currentTimeMillis();

        int y;
        for (int x = 1; x <= Integer.parseInt(args2); x++) {
            y = Integer.parseInt(args3);
            while (y > Integer.parseInt(args0)) {
                for (int i = 0; i < rand.nextInt(Integer.parseInt(args0) + 1); i++) {
                    sendBytes(new TS10S5L().TS10S5L(jwd, count, dir), ip, Integer.valueOf(port));
                    count++;
                    y--;
                }
//                sleep(rand.nextInt(Integer.parseInt(args[1])) + 2);
            }
            for (int i = 0; i < y; i++) {
//                sendBytes(new TS10S3L().TS10S3L(jwd, count, dir), ip, port);
                sendBytes(new TS10S5L().TS10S5L(jwd, count, dir), ip, Integer.valueOf(port));
                count++;
            }
            sleep(rand.nextInt(Integer.parseInt(args1)) + 2);
        }

        long endTime = System.currentTimeMillis();
        long spentTime = (endTime - startTime) / 1000;
        System.out.println("总发送数据量:" + count + "条");
        System.out.println("总用时间:" + spentTime + "s");

        return "success";



    }

}
