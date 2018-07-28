package Composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
    private String name ;
    private ArrayList directory = new ArrayList() ;

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name ;
    }

    @Override
    /*对文件而言我们知道它的大小，可以直接return,
      对目录而言，它的大小应该是目录下所有条目大小的总和，
      所以需要遍历directory计算一下
    */
    public int getSize() {
        int size = 0;
        Iterator it = directory.iterator();
        while (it.hasNext()){
            Entry entry = (Entry) it.next();
            size += entry.getSize() ;     //这里其实是个递归调用
        }
        return size;
    }

    public void add(Entry entry){
        directory.add(entry) ;
    }


    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator it = directory.iterator();
        while (it.hasNext()){
            Entry entry = (Entry) it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}
