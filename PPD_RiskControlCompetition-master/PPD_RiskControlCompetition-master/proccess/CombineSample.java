package proccess;

import util.Util;
import weka.core.Instances;

public class CombineSample {
	public static void main(String[] args)throws Exception {
//		Instances data=Util.getInstances("data/data0.csv");
//		data.delete();
//		for(int i=0;i<8;i++)
//		{
//			data=Util.addAll(data, Util.getInstances("G:\\����\\ħ��������㷨����\\data\\����\\sample"+i+".csv"));
//		}
//		Util.saveIns(data, "G:\\����\\ħ��������㷨����\\data\\����\\sample400.csv");
		Instances data=Util.getInstances("D:/ty/8file_train.csv");
		Instances sa=Util.getInstances("G:\\����\\ħ��������㷨����\\data\\����\\sample400.csv");
		data=Util.addAll(data,sa);
		Util.saveIns(data, "D:/ty/8file_train_sample.csv");
	}
}
