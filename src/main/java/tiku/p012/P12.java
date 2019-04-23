package tiku.p012;

public class P12 {
    public static void main(String[] args) {
        int a = 0;
        try(ImageScanner is = new ImageScanner();ImagePrinter ip = new ImagePrinter()){
            is.scanImage();
            ip.printImage();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

class ImageScanner implements AutoCloseable{
    public void close() throws Exception{
        System.out.println("Scan Closed.");
    }

    public void scanImage() throws Exception {
        System.out.println("Scan");
        throw new Exception("Unable to scan: ");
    }
}

class ImagePrinter implements AutoCloseable {
    public void close() throws Exception {
        System.out.println("Printer Closed");
    }

    public void printImage(){
        System.out.println("Print: ");
    }
}
