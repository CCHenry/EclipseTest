package index1_template;

import utils.CCLog;

public class SeeMovieOfAmazingDoctor extends SeeMovie {

	@Override
	public void buyTip() {
		// TODO Auto-generated method stub
		CCLog.print("����������֡���ӰƱ");
	}

	@Override
	public void buyGlasses() {
		// TODO Auto-generated method stub
		CCLog.print("�����۾�");
	}
	@Override
	public boolean isNeedBuyGlasses() {
		// TODO Auto-generated method stub
		return false;
	}
}
