package prototype;

public class TestProtoType {

    public static void main(String args[]){
        WordDocument wordDocument = new WordDocument();
        wordDocument.setText("test1");
        wordDocument.addImages("Image 1");
        wordDocument.addImages("Image 2");
        wordDocument.showDocument();

        WordDocument protoType = wordDocument.clone();
        protoType.setText("Test 2");
        protoType.addImages("Image 3");
        protoType.showDocument();

    }

}
