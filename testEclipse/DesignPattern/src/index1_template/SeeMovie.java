package index1_template;

import utils.CCLog;

public abstract class SeeMovie {

	public void exeucte() {
		// TODO Auto-generated method stub
		buyTip();// 买电影票
		if (isNeedBuyGlasses()) {
			buyGlasses();// 买3d眼镜
		}
		enterRoom();// 进场
		exitRoom();// 出场

	}

	/**
	 * 购买电影票
	 */
	public abstract void buyTip();

	/**
	 * 购买3d眼镜
	 */
	public abstract void buyGlasses();

	/**
	 * 进场
	 */
	public final void enterRoom() {
		// TODO Auto-generated method stub
		CCLog.print("进场");
	}

	/**
	 * 出场
	 */
	public final void exitRoom() {
		// TODO Auto-generated method stub
		CCLog.print("出场");
	}

	/**
	 * 因为有些电影是2d的,所以这里判断是否需要购买3d眼镜,默认传true
	 * @return
	 */
	public boolean isNeedBuyGlasses() {
		return true;
	}
}
