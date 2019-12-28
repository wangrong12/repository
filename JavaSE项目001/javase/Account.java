package com.javase;

public class Account {
	public static void main(String[] args) {
		boolean flag = true;
		int balance = 5000;
		String details = "收支\t账户金额\t收支金额\t说明";
		do {
			System.out.println("-------------------记账软件-------------------");
			System.out.println("                 1.收支明细");
			System.out.println("                 2.登记收入");
			System.out.println("                 3.登记支出");
			System.out.println("                 4.退    出");
			System.out.print("请选择(1-4):");
			//读取菜单项
			char menuSelection = Utils.readmenuSelection();
			switch (menuSelection) {
			case '1':
				System.out.println("-------------------记账软件-------------------");
				System.out.println(details);
				System.out.println("--------------------------------------------");
				break;
			case '2':
				System.out.println("--------------------------------------------");
				System.out.print("本次收入金额：");
				int income = Utils.readNumber();
				System.out.print("收入说明:");
				String incomeDes = Utils.readString();
				balance += income;
				details += "\n收入\t" + balance + "\t" + income + "\t" + incomeDes;
				System.out.println("-------------------登记完成-------------------");
				break;
			case '3':
				System.out.println("--------------------------------------------");
				System.out.print("本次支出金额：");
				int pay = Utils.readNumber();
				System.out.print("支出说明:");
				String payDes = Utils.readString();
				balance -= pay;
				details += "\n支出\t" + balance + "\t" + pay + "\t" + payDes;
				System.out.println("-------------------登记完成-------------------");
				break;
			case '4':
				System.out.print("是否确认退出(Y/N):");
				char confirmSelection = Utils.readConfirmSelection();
				//判断是否退出
				if(confirmSelection == 'Y') {
					flag = false;
					System.out.println("成功退出");
				}
				break;
			}
		}while(flag);
		
	}
}
