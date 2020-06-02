/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: TS10S5L
 * Author:   Administrator
 * Date:     2018/12/14 9:33
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lg.utils;

import java.text.DecimalFormat;
import java.util.Random;

import static lg.utils.SendUtils.*;


/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author Administrator
 * @create 2018/12/14
 * @since 1.0.0
 */
public class TS10S5L {
    static Random rand = new Random();
    static int f = 0;

    public static byte[] TS10S5L(float jwd[][], int count, float guiji[][]) {
        String others = "qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq";
        byte BBH = 0x30;
        byte BWLX1 = 0;
        byte BWLX2 = 4;
        int BLSH = 0;
        int MBFSXH = rand.nextInt(100000);
        //增加数量
        int mbbh = rand.nextInt(10);
//        int mbbh=f;
//        f++;
        String bh = String.format("%09d", mbbh);
        String MBBH = "1000000000000" + bh;
        String time = "" + (System.currentTimeMillis() / 1000 - count);
        int SBSJ = Integer.parseInt(time);
        float JD, WD;
        if (jwd[mbbh][0] == 0f) {
            JD = rand.nextInt(350) - 180 + rand.nextInt(100000) / 100000.0f;
            WD = rand.nextInt(150) - 80 + rand.nextInt(100000) / 100000.0f;
            jwd[mbbh][0] = JD;
            jwd[mbbh][1] = WD;
            if (mbbh == 1) {
                jwd[mbbh][0] = -19.379696f;
                jwd[mbbh][1] = -46.469427f;
            }
        } else {
            if (rand.nextInt(10) == 1) {
                guiji[mbbh][0] = 5;
                guiji[mbbh][1] = 5;
            }

            JD = jwd[mbbh][0] + (rand.nextInt(100000) - (guiji[mbbh][0]) * 10000) / 1000000.0f;
            WD = jwd[mbbh][1] + (rand.nextInt(100000) - (guiji[mbbh][1]) * 10000) / 1000000.0f;

            if (WD >= 80.000000f) {
                guiji[mbbh][1] = 20;
            } else if (WD <= -80.000000f) {
                guiji[mbbh][1] = 0;
            }
            if (JD >= 170.000000f) {
                guiji[mbbh][0] = 20;

            } else if (JD <= -170.000000f) {
                guiji[mbbh][0] = 0;
            }
            jwd[mbbh][0] = JD;
            jwd[mbbh][1] = WD;

        }
        DecimalFormat df = new DecimalFormat("0.00");
        Random random1 = new Random();
        float GSD=new Float(df.format(random1.nextFloat()*10000).toString());
        float YDFX = 0;
        float SD = 40 + rand.nextInt(100000) / 10000.0f;
        byte DWWC = 0;
        byte GDWC = 0;
        byte MBSL = 0;
        short MBZT = (short)65000;
        int WZSJ = Integer.parseInt(time);
        byte HJZT = 0;
        String MBFLBM = "        ";
        String[] mblb=new String[]{"00","01","02","03","04","05","06","08","99"};
        Random r=new Random();
        MBFLBM=mblb[r.nextInt(9)]+MBFLBM;
        String GJDQ = "ssssssss";
        String JZ = "ddwdd";
        Random random = new Random();
        byte MBXZ=(byte) (3+random.nextInt(4));
        short RW = (short)65000;
        byte PZZT = 0;
        String HH = "huhao               ";
        String PH = "pihao    ";
        String JXH = "jixuanhao";
        String LSDW = "lishudanwei         ";
        String MBMC = "qunMBmingcheng      ";
        String QMBMC = "wwwwwwwwww          ";
        String RWDX = "wwwwwwwwww          ";
        String CFD = "wwwwwwwwww          ";
        String DDD = "wwwwwwwwww          ";
        byte ZYCD = 0;
        byte KXD = 0;
        byte MMPY = 0;
        String HQSD = "eeeeee";
        short QBLY = (short)65000;
        int[] zx = new int[]{0, 11000, 12000, 13000, 14000, 15000, 16000, 17000, 18000, 19000, 20000, 21000, 22000, 64000, 65000};
        Random random2 = new Random();
        int i = random2.nextInt(15);
        short ZCXT = (short) zx[i];
        String ZXRW = "rrrrrrrrrr";
        byte RHFS = 0;
        String PZDW = "tttttttt";
        String YTMS = "qqqqq                                             ";


        byte[] bytesAll = {BBH};
        byte[] bytesBWLX1 = {BWLX1};
        byte[] bytesBWLX2 = {BWLX2};
        byte[] bytesBLSH = intToByteArray(BLSH);
        byte[] bytesMBFSXH = intToByteArray(MBFSXH);
        byte[] bytesMBBH = strToByteArray(MBBH);
        byte[] bytesSBSJ = intToByteArray(SBSJ);
        byte[] bytesJD = floatToByte(JD);
        byte[] bytesWD = floatToByte(WD);
        byte[] bytesGSD = floatToByte(GSD);
        byte[] bytesYDFX = floatToByte(YDFX);
        byte[] bytesSD = floatToByte(SD);
        byte[] bytesDWWC = {DWWC};
        byte[] bytesGDWC = {GDWC};
        byte[] bytesMBSL = {MBSL};
        byte[] bytesMBZT = shortToByteArray(MBZT);
        byte[] bytesWZSJ = intToByteArray(WZSJ);
        byte[] bytesHJZT = {HJZT};
        byte[] bytesMBFLBM = strToByteArray(MBFLBM);
        byte[] bytesGJDQ = strToByteArray(GJDQ);
        byte[] bytesJZ = strToByteArray(JZ);
        byte[] bytesMBXZ = {MBXZ};
        byte[] bytesRW = shortToByteArray(RW);
        byte[] bytesPZZT = {PZZT};
        byte[] bytesHH = strToByteArray(HH);
        byte[] bytesPH = strToByteArray(PH);
        byte[] bytesJXH = strToByteArray(JXH);
        byte[] bytesLSDW = strToByteArray(LSDW);
        byte[] bytesMBMC = strToByteArray(MBMC);
        byte[] bytesQMBMC = strToByteArray(QMBMC);
        byte[] bytesRWDX = strToByteArray(RWDX);
        byte[] bytesCFD = strToByteArray(CFD);
        byte[] bytesDDD = strToByteArray(DDD);
        byte[] bytesZYCD = {ZYCD};
        byte[] bytesKXD = {KXD};
        byte[] bytesMMPY = {MMPY};
        byte[] bytesHQSD = strToByteArray(HQSD);
        byte[] bytesQBLY = shortToByteArray(QBLY);
        byte[] bytesZCXT = shortToByteArray(ZCXT);
        byte[] bytesZXRW = strToByteArray(ZXRW);
        byte[] bytesRHFS = {RHFS};
        byte[] bytesPZDW = strToByteArray(PZDW);
        byte[] bytesYTMS = strToByteArray(YTMS);
        byte[] byteOthers = strToByteArray(others);

        bytesAll = addBytes(byteOthers, bytesAll);
        bytesAll = addBytes(bytesAll, bytesBWLX1);
        bytesAll = addBytes(bytesAll, bytesBWLX2);
        bytesAll = addBytes(bytesAll, bytesBLSH);
        bytesAll = addBytes(bytesAll, bytesMBFSXH);
        bytesAll = addBytes(bytesAll, bytesMBBH);
        bytesAll = addBytes(bytesAll, bytesSBSJ);
        bytesAll = addBytes(bytesAll, bytesJD);
        bytesAll = addBytes(bytesAll, bytesWD);
        bytesAll = addBytes(bytesAll, bytesGSD);
        bytesAll = addBytes(bytesAll, bytesYDFX);
        bytesAll = addBytes(bytesAll, bytesSD);
        bytesAll = addBytes(bytesAll, bytesDWWC);
        bytesAll = addBytes(bytesAll, bytesGDWC);
        bytesAll = addBytes(bytesAll, bytesMBSL);
        bytesAll = addBytes(bytesAll, bytesMBZT);
        bytesAll = addBytes(bytesAll, bytesWZSJ);
        bytesAll = addBytes(bytesAll, bytesHJZT);
        bytesAll = addBytes(bytesAll, bytesMBFLBM);
        bytesAll = addBytes(bytesAll, bytesGJDQ);
        bytesAll = addBytes(bytesAll, bytesJZ);
        bytesAll = addBytes(bytesAll, bytesMBXZ);
        bytesAll = addBytes(bytesAll, bytesRW);
        bytesAll = addBytes(bytesAll, bytesPZZT);
        bytesAll = addBytes(bytesAll, bytesHH);
        bytesAll = addBytes(bytesAll, bytesPH);
        bytesAll = addBytes(bytesAll, bytesJXH);
        bytesAll = addBytes(bytesAll, bytesLSDW);
        bytesAll = addBytes(bytesAll, bytesMBMC);
        bytesAll = addBytes(bytesAll, bytesQMBMC);
        bytesAll = addBytes(bytesAll, bytesRWDX);
        bytesAll = addBytes(bytesAll, bytesCFD);
        bytesAll = addBytes(bytesAll, bytesDDD);
        bytesAll = addBytes(bytesAll, bytesZYCD);
        bytesAll = addBytes(bytesAll, bytesKXD);
        bytesAll = addBytes(bytesAll, bytesMMPY);
        bytesAll = addBytes(bytesAll, bytesHQSD);
        bytesAll = addBytes(bytesAll, bytesQBLY);
        bytesAll = addBytes(bytesAll, bytesZCXT);
        bytesAll = addBytes(bytesAll, bytesZXRW);
        bytesAll = addBytes(bytesAll, bytesRHFS);
        bytesAll = addBytes(bytesAll, bytesPZDW);
        bytesAll = addBytes(bytesAll, bytesYTMS);
        return bytesAll;
    }
}
