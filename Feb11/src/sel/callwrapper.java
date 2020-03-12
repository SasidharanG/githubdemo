package sel;

public class callwrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      wrapper_methods wm = new wrapper_methods();
      wm.launchapp("https://www.linkedin.com/");
      wm.clickbyxpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button");
      wm.entrybid("username","dsp123@gmail.com");
      wm.entrybid("password","thug123456");
      
      wm.clickbyxpath("");
      wm.screenshot("");
      wm.closeapp();
	}

}
