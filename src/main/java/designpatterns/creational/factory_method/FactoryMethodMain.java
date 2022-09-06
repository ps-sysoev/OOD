package designpatterns.creational.factory_method;

public class FactoryMethodMain {
    public static void main(String[] args) {
        DecodedImage decodedImage;
        ImageReader reader = null;

        String image = "test.gif";
        String format = image.substring(image.indexOf('.') + 1);

        if (format.equals("gif")) {
            reader = new GifReader(image);
        }

        if (format.equals("jpeg")) {
            reader = new JpegReader(image);
        }

        decodedImage = reader.getDecodeImage();

        System.out.println(decodedImage);
    }
}