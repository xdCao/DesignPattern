package Component;

/**
 * Created by xdcao on 2017/8/28.
 */
public class Client {

    public static void main(String[] args) {
        AbstractFile file1,file2,file3,file4,file5,folder1,folder2,folder3,folder4;

        folder1=new Folder("xdCao的资料");
        folder2=new Folder("图像资料");
        folder3=new Folder("文本资料");
        folder4=new Folder("视频资料");

        file1=new ImageFile("1.jpg");
        file2=new ImageFile("2.png");
        file3=new TextFile("武侠.txt");
        file4=new TextFile("校园.txt");
        file5=new VideoFile("xidian.avi");

        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder3.add(file4);
        folder4.add(file5);
        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder4);

        folder1.killVirus();


    }

}
