package Command.WindowButton;

import java.util.ArrayList;

/**
 * Created by xdcao on 2017/9/3.
 */
public class FBSettingWindow {

    private String title;
    private ArrayList<FunctionButton> functionButtons=new ArrayList<>();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButton fb){
        functionButtons.add(fb);
    }

    public void removeFunctionButton(FunctionButton fb){
        functionButtons.remove(fb);
    }

    public void display(){
        System.out.println("显示窗口"+this.title);
        System.out.println("显示功能键： ");
        for (Object object:functionButtons){
            System.out.println(((FunctionButton)object).getName());
        }
    }

}
