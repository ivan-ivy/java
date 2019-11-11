package com.itranswarp.learnjava;

import java.util.Scanner;

/**
 * switch实现石头/剪子/布并判断胜负
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("please choice:");
		System.out.println(" 1: Rock");
		System.out.println(" 2: Scissors");
		System.out.println(" 3: Paper");
		// 用户输入:
		int choice = 0;

		Scanner scanner = new Scanner(System.in);

		choice = scanner.nextInt();

		if((choice != 3) && (choice != 2) && (choice != 1)){

		   System.out.println("输入值错误,只能输入整数1、2、3");

		   return ;

		  }
		// 计算机随机数 1, 2, 3:
		int random = 1 + (int) Math.random() * 3;
		switch (choice-random) {
		// TODO:
		case 0:
			System.out.println("平局");
			break;
		case 1:
			System.out.println("输了");
			break;
		case -2:
			System.out.println("输了");
			break;
		default:
			System.out.println("赢了");
			break;
		}
	}

}
