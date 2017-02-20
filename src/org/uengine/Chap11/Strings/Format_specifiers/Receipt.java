package org.uengine.Chap11.Strings.Format_specifiers;

import java.util.Formatter;
/**
 * 작성일: 2017-02-20
 * 작성자: 박종훈
 * 작성내용: String 출력시 규격화 형태로 저장하는 방법(Format Specifiers)
 *
 */
public class Receipt {
	private double total = 0;
	private Formatter f = new Formatter(System.out);
	public void printTitle(){
		f.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
	}
	public void print(String name, int qty, double price){
		f.format("%-15.15s %5d %10.2f\n", name, qty, price);
		total += price;
	}
	public void printTotal(){
		f.format("%-15s %5s %10.2f\n", "Tax", "", total*0.06);
		f.format("%-15s %5s %10s\n", "", "", "-----");
		f.format("%-15s %5s %10.2f\n", "Total", "", total *1.06);
	}
	public static void main(String[] args){
		Receipt receipt = new Receipt();
		receipt.printTitle();
		receipt.print("Jack's Magic Beans", 4, 4.25);
		receipt.print("Princess Peas", 3, 5.1);
		receipt.print("Three Bears Porridge", 1, 14.29);
		receipt.printTotal();
	}
}
