package prototype;

import java.util.ArrayList;

public class WordDocument implements Cloneable {
    private String text;
    private ArrayList<String> mImages = new ArrayList<>();

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<String> getmImages() {
        return mImages;
    }

    public void addImages(String img){
        this.mImages.add(img);
    }

    public WordDocument(){
        System.out.println("**********************start WordDocument********************");
    }

    @Override
    protected WordDocument clone(){
        WordDocument wd = null;
        try{
            wd = (WordDocument)super.clone();
            wd.text = this.text;
            wd.mImages = this.mImages;
        }catch (Exception  e){

        }

        return wd;
    }

    public void showDocument(){
        System.out.println("Text : " + text);
        System.out.println("Images list: ");
        for(String img : mImages){
            System.out.println("Image : " + img);
        }
        System.out.println("**********************end WordDocument********************");
    }

}
