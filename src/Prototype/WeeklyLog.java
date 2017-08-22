package Prototype;

import java.io.*;
import java.text.AttributedCharacterIterator;

/**
 * Created by xdcao on 2017/8/22.
 */
public class WeeklyLog implements Cloneable,Serializable {

    private Attachment attachment;

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    private String name;
    private String date;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    protected WeeklyLog clone() throws CloneNotSupportedException {
        Object obj=null;
        try {
            obj=super.clone();
            return (WeeklyLog)obj;
        }catch (Exception e){
            System.out.println("不支持复制");
            return null;
        }
    }

    public WeeklyLog deepClone() throws IOException,ClassNotFoundException,OptionalDataException{
        ByteArrayOutputStream bao=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bao);
        oos.writeObject(this);

        ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        return (WeeklyLog)ois.readObject();


    }


    @Override
    public String toString() {
        return this.getName()+", "+this.getDate()+", "+this.getContent();
    }
}
