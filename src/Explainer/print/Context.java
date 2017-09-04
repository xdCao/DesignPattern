package Explainer.print;

import java.util.StringTokenizer;

/**
 * Created by xdcao on 2017/9/4.
 */
public class Context {

    private StringTokenizer tokenizer;
    private String currentToken;

    public Context(String text) {

        this.tokenizer=new StringTokenizer(text);
        nextToken();

    }

    public String getCurrentToken() {
        return currentToken;
    }

    public String nextToken() {

        if (tokenizer.hasMoreTokens()){
            currentToken=tokenizer.nextToken();
        }else {
            currentToken=null;
        }
        return currentToken;
    }

    public void skipToken(String token){
        if (!token.equals(currentToken)){
            System.err.println("错误提示： "+currentToken+"解释错误！");
        }
        nextToken();
    }

    public int currentNumber(){
        int number=0;
        try {
            number=Integer.parseInt(currentToken);
        }catch (Exception e){
            System.err.println("错误提示： "+e);
        }
        return number;
    }


}
