package com.shiyanlou.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 利用随机数实现大乐透彩票功能
 *
 * @author taojt
 * @create 2016-05-29
 */
public class GenerateLottery {

    public List<String> getHeadNumber() {
        List<String> list = new ArrayList<String>();
        String lotteryNumber = "";
        for (int i = 1; i < 36; i++) {
            if (i < 10) {
                list.add("0" + i + " ");
            } else {
                list.add("" + i + " ");
            }
        }
        int roundIndex = 0;
        List<String> lotteryList = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            int amount = list.size();
            Random r = new Random();
            roundIndex = r.nextInt(amount);//获取一个从0 到amount-1 的随机整数
            lotteryNumber = list.get(roundIndex); //获取彩票号码
            lotteryList.add(lotteryNumber); // 将号码添加到lotteryList 中
            list.remove(roundIndex); // 移除刚才产生的号码，避免随机数重复
        }
        Collections.sort(lotteryList);
        return lotteryList;

    }

    public List<String> getRearNumber() {
        List<String> list = new ArrayList<String>();
        String lotteryNumber = "";
        for (int i = 1; i < 13; i++) {
            if (i < 10) {
                list.add("0" + i + " ");
            } else {
                list.add("" + i + " ");
            }
        }

        int roundIndex = 0;
        List<String> lotteryList = new ArrayList<String>();
        for (int i = 0; i < 2; i++) {
            int amount = list.size();
            Random r = new Random();
            roundIndex = r.nextInt(amount);
            lotteryNumber = list.get(roundIndex);
            lotteryList.add(lotteryNumber);
            list.remove(roundIndex);
        }
        Collections.sort(lotteryList);
        return lotteryList;
    }

    public void generateLottery(String groupNum) {
        int groupNumber = 0;
        groupNumber = Integer.parseInt(groupNum);
        StringBuilder sbuilder = new StringBuilder(); // 创建字符串生成器对象，使用字符串生成器能够较为方便地在字符串中追加内容
        for (int i = 0; i < groupNumber; i++) {
            List<String> startList = getHeadNumber();
            List<String> endList = getRearNumber();
            for (int m = 0; m < startList.size(); m++) {
                sbuilder.append(startList.get(m));
            }
            sbuilder.append("      ");
            for (int m = 0; m < endList.size(); m++) {
                sbuilder.append(endList.get(m));
            }
            sbuilder.append("\n");
        }
        System.out.println(sbuilder.toString());
    }
}
