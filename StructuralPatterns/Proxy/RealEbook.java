package StructuralPatterns.Proxy;

public class RealEbook implements Ebook {
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        System.out.println("Loading the ebook : " +fileName);
    }

    public void show() {
        System.out.println("Showing the ebook" + fileName);
    }

}
