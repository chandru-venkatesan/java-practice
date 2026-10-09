package basics.a2;

public class Main {
    static void main(String[] args) {
        Folder subSubFolder1 = new Folder("SubSubFolder1",new int [] {10,20},null);
        Folder subFolder1 = new Folder("SubFolder1",new int[]{50},new Folder[]{subSubFolder1});
        Folder subFolder2 = new Folder("SubFolder2",new int[]{30,40},null);
        Folder subFolder3 = new Folder("SubFolder3",new int[]{100,200},new Folder[]{subFolder1,subFolder2});

        int totalSize = subFolder3.calculatesize();
        System.out.println("Total Size of the Folders: "+totalSize+" KB.");
    }
}
