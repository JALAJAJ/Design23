package com.design23.com.single;

/**
 * @Description: ����ģʽ-����ʽDCL(Double Check Lock)
 * @author KingJA
 * @date 2015-11-15 ����1:40:32
 * @version V1.0
 */
public class SingleInstanceDCL {
	private static SingleInstanceDCL mInstance;

	private SingleInstanceDCL() {
	}

	public static SingleInstanceDCL getInstance() {
		if (mInstance == null) {
			synchronized (SingleInstanceDCL.class) {
				if (mInstance == null) {
					mInstance = new SingleInstanceDCL();
				}
			}
		}
		return mInstance;
	}

}
