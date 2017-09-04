package Explainer.print;

/**
 * Created by xdcao on 2017/9/4.
 */
public class CommandNode extends Node {

    private Node node;

    @Override
    public void interpret(Context context) {

        if (context.getCurrentToken().equals("LOOP")){
            node=new LoopCommandNode();
            node.interpret(context);
        }else {
            node=new PrimitiveCommandNode();
            node.interpret(context);
        }


    }

    @Override
    public void execute() {
        node.execute();
    }
}
