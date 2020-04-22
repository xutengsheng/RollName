package com.xts.rollname;

import java.util.ArrayList;
import java.util.Random;

public class RandomUtil {
    private static RandomUtil sRandomUtil = new RandomUtil();
    ArrayList<String> mAllList = new ArrayList<String>();
    private final int mSize;
    private final Random mRandom;

    private RandomUtil(){
        addAllData();
        mSize = mAllList.size();
        mRandom = new Random();
    }

    private void addAllData() {
        mAllList.add("段宇昕-1组1号");
        mAllList.add("陈志林-1组2号");
        mAllList.add("崔华-1组3号");
        mAllList.add("郑雄-1组4号");
        mAllList.add("曹军英-1组5号");
        mAllList.add("吕慧鹏-1组6号");
        mAllList.add("许诺-1组7号");

        mAllList.add("姚咪咪-2组1号");
        mAllList.add("彭张斌-2组2号");
        mAllList.add("陈顺杰-2组3号");
        mAllList.add("王世翱-2组4号");
        mAllList.add("福长林-2组5号");
        mAllList.add("张明琰-2组6号");

        mAllList.add("薛婷婷-3组1号");
        mAllList.add("吕思迁-3组2号");
        mAllList.add("李欣-3组3号");
        mAllList.add("支余旺-3组4号");
        mAllList.add("彭天宇-3组5号");
        mAllList.add("永明-3组6号");
        mAllList.add("李壮-3组7号");

        mAllList.add("王岳-4组1号");
        mAllList.add("李靖保-4组2号");
        mAllList.add("李航州-4组3号");
        mAllList.add("关孙布尔-4组4号");
        mAllList.add("张世杰-4组5号");
        mAllList.add("杨振庭-4组6号");

        mAllList.add("李富凯-5组1号");
        mAllList.add("孙宏炜-5组2号");
        mAllList.add("李冬瑞-5组3号");
        mAllList.add("李成龙-5组4号");
        mAllList.add("赵福全-5组5号");
        mAllList.add("洪洋-5组6号");
        mAllList.add("刘鹏铼-5组7号");

        mAllList.add("何曦哲-6组1号");
        mAllList.add("浩宇-6组2号");
        mAllList.add("刘恩侠-6组3号");
        mAllList.add("朱常乐-6组4号");
        mAllList.add("汪浩天-6组5号");
        mAllList.add("王兵文-6组6号");
    }

    public static RandomUtil getRandomUtil(){
        return sRandomUtil;
    }

    public int randomNumber(int num){
        return mRandom.nextInt(num);
    }

    public ArrayList<String> randomData(int num){
        ArrayList<String> list = new ArrayList<>();

        while (list.size()<num){
            String s = randomData();
            if (!list.contains(s)){
                list.add(s);
            }
        }
        return list;
    }

    public String randomData(){
        return mAllList.get(randomNumber(mSize));
    }

}
