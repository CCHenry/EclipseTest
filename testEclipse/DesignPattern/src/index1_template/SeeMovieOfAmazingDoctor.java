package index1_template;

import utils.CCLog;

public class SeeMovieOfAmazingDoctor extends SeeMovie {

	@Override
	public void buyTip() {
		// TODO Auto-generated method stub
		CCLog.print("¹ºÂò¡¶ÄãµÄÃû×Ö¡·µçÓ°Æ±");
	}

	@Override
	public void buyGlasses() {
		// TODO Auto-generated method stub
		CCLog.print("¹ºÂòÑÛ¾µ");
	}
	@Override
	public boolean isNeedBuyGlasses() {
		// TODO Auto-generated method stub
		return false;
	}
}
