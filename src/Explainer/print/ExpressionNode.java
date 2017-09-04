package Explainer.print;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by xdcao on 2017/9/4.
 */
public class ExpressionNode extends Node {

    private ArrayList<Node> list=new ArrayList<>();

    @Override
    public void interpret(Context context) {
        while (true){
            if (context.getCurrentToken()==null){
                break;
            }else if (context.getCurrentToken().equals("END")){
                context.skipToken("END");
                break;
            }else {
                Node commandNode=new CommandNode();
                commandNode.interpret(context);
                list.add(commandNode);
            }
        }
    }

    @Override
    public void execute() {

        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            ((Node)iterator.next()).execute();
        }

    }
}
