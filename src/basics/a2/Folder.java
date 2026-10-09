package basics.a2;

public class Folder {
    String folderName;
    int[] fileSizes;
    Folder[] subFolders;

    Folder(String folderName, int[] fileSizes, Folder[] subFolders){
        this.folderName=folderName;
        this.fileSizes =fileSizes;
        this.subFolders=subFolders;
    }

    public  int calculatesize(){
        int totalSize =0;
        if(fileSizes!=null){
            for(int size:fileSizes){
                totalSize=totalSize+size;
            }
        }
        if(subFolders!=null){
            for(Folder folders : subFolders){
                totalSize= totalSize+folders.calculatesize();
            }
        }
        return totalSize;
    }
}
