package index1_template;

import utils.CCLog;

public abstract class SeeMovie {

	public void exeucte() {
		// TODO Auto-generated method stub
		buyTip();// ���ӰƱ
		if (isNeedBuyGlasses()) {
			buyGlasses();// ��3d�۾�
		}
		enterRoom();// ����
		exitRoom();// ����

	}

	/**
	 * �����ӰƱ
	 */
	public abstract void buyTip();

	/**
	 * ����3d�۾�
	 */
	public abstract void buyGlasses();

	/**
	 * ����
	 */
	public final void enterRoom() {
		// TODO Auto-generated method stub
		CCLog.print("����");
	}

	/**
	 * ����
	 */
	public final void exitRoom() {
		// TODO Auto-generated method stub
		CCLog.print("����");
	}

	/**
	 * ��Ϊ��Щ��Ӱ��2d��,���������ж��Ƿ���Ҫ����3d�۾�,Ĭ�ϴ�true
	 * @return
	 */
	public boolean isNeedBuyGlasses() {
		return true;
	}
}
