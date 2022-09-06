package designpatterns.creational.factory_method;

public class DecodedImage {
    private final String image;

    public DecodedImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return image + ": is decoded";
    }
}