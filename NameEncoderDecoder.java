public class NameEncoderDecoder {
    /*

    маленькие буквы e u i o a заменяются на 1 2 3 4 5 соответственно;
    к началу имени добавляется слово "NOTFORYOU", к концу имени - "YESNOTFORYOU"

     */

    public String encode(String name){
        name ="NOTFORYOU"+name+"YESNOTFORYOU";
        return name
                .replace("e","1")
                .replace("u","2")
                .replace("i","3")
                .replace("o","4")
                .replace("a","5");
    }

    public String decode(String name){
        return name.replace("NOTFORYOU","")
                .replace("YES","")
                .replace("1","e")
                .replace("2","u")
                .replace("3","i")
                .replace("4","o")
                .replace("5","a");
    }

    public static void main (String []args){

    }

}
