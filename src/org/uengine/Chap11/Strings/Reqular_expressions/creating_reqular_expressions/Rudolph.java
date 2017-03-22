package org.uengine.Chap11.Strings.Reqular_expressions.creating_reqular_expressions;

public class Rudolph {

	/**
	 * �ۼ���: 2017-03-22
	 * �ۼ���: ������
	 * �ۼ�����: String.matches()�� �̿��� ���� �񱳰� ���
	 * -> Reqular_expressions�� �̿��Ͽ� ����ǥ���� scope�� ������
	 * 1) Rudolph : �Ϲݹ��ڸ� ǥ��
	 * 2) [rR]udolph: �� �ձ��ڰ� 'r' �Ǵ� 'R' �̸� ������ ���ڴ� 'udolph' ��� ǥ��
	 * 3) [rR][aeiou][a-z]ol.*:  �� �ձ��ڰ� 'r' �Ǵ� 'R' �̸� �ι�° ���ڴ�
	 * 'a', 'e', 'i', 'o', 'u' �� �� �����̰�, �� ��° ���ڴ� a���� z���� ���� �� �� �����̰�
	 * �ݹ�° �ټ���° ���ڴ� 'ol'�̸鼭 ������ �޹��ڴ� ������� ���ڷ� ǥ��
	 * 4) R.*: �� �ձ��ڰ� 'R'�̸� ��
	 * 
	 * 
	 */
	public static void main(String[] args) {
		for(String pattern : new String[]{
				"Rudolph", "[rR]udolph", "[rR][aeiou][a-z]ol.*", "R.*"
		})
			System.out.println("Rudolph".matches(pattern));

	}

}
