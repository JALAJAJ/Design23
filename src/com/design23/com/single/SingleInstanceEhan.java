package com.design23.com.single;

/**
 * @Description: ����ģʽ-����ʽ
 * @author KingJA
 * @date 2015-11-15 ����1:46:15
 * @version V1.0
 */
public final class SingleInstanceEhan {
	private static SingleInstanceEhan mInstance = new SingleInstanceEhan();

	private SingleInstanceEhan() {

	}

	public static SingleInstanceEhan getInstance() {
		return mInstance;
	}

}
