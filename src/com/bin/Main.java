/**
 * 
 */
package com.bin;

import com.FXD.FXD;
import com.chenhua.Chenhua;
import com.suwei.Suwei;
import com.xiaoqian.Xq;

/**
 * @author гугугу
 *
 */
public class Main {
	public static void main(String[] args) {
		FXD fengxindi = new FXD();
		Xq xiaoqian = new Xq();
		Chenhua chengChenhua = new Chenhua();
		Suwei suwei=new Suwei();
		Suwei seSuwei = new Suwei();
		System.out.print(fengxindi.FXD()+xiaoqian.xiao()+chengChenhua.name()+suwei.suwei());
	}
}
