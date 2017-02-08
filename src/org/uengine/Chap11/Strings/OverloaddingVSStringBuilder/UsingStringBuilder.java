package org.uengine.Chap11.Strings.OverloaddingVSStringBuilder;

import java.util.Random;

/**

�ۼ���: 2017-02-07
�ۼ���: ������
�ۼ�����: StringBuilder�� ����
StringBuilder�� java SE5���� �Ұ��Ǿ���.

����� �Ʒ��� �����ϴ�
append(String str) : ���ڿ� �ڿ� str�� ������
insert(int offset, String str) : ���ڿ��� offset��ġ�� str�� ����
delete(int start, int end) : start���� end -1 ������ �κ� ���ڿ��� ����
deleteCharAt(int index) :  index ��ġ�� �ִ� �ϳ��� ���ڸ� ����
length() : ������ ���ڿ� ���̸� intŸ���� ������ �����ϴ� �Լ�
toString() : ������ ���ڿ��� String ��ü�� ���� �����ϴ� �Լ� 
capacity() : StringBuffer(Builder)��ü�� ���� ũ�⸦ int Ÿ���� ������ ���� (������ ũ�⸦ Ȯ���ϰ��� �Ҷ� ���) 
��) int bufsize = sb.capacity();  
ensureCapacity(int minimumCapacity) : ���� ũ�⸦ �Է¹��� ��ŭ �ø���
trimToSize() : ������ ���� �°� ������ ũ��� ���۸� ���δ�
 */

public class UsingStringBuilder {
	public static Random rand = new Random(47);
	public String toString(){
		StringBuilder result = new StringBuilder("[");
		for(int i = 0; i <25; i++){
			result.append(rand.nextInt(100));
			result.append(", ");
		}
		result.delete(result.length() -2, result.length());
		result.append("]");
		return result.toString();
	}
	public static void main(String[] args){
		UsingStringBuilder usb = new UsingStringBuilder();
		System.out.println(usb);
	}

}
