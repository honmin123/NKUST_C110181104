import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class ex1 {
    public static void main (String[] args) {
        System.out.println(revHash(6933552791181934L));
        System.out.println(hash("justdoit")); //574318821802
    }
    public static String letters = "cdefghijlmnoqstuvxz";
    public static String revHash(long hash) {
        String bufferchar ="";
        long bufferint = 0;
        long endhash = 23*7;
        int i;
        do{
            bufferint = hash % 23;
            i =(int)bufferint;
            hash=(hash -bufferint) /23;
            bufferchar = letters.charAt(i) + bufferchar;
            System.out.println(bufferchar);
        }while(hash > endhash);
        return bufferchar;
    }
    public static long hash(String s){
        long h = 7;
        for (int i = 0; i < s.length(); i++){
            h = h * 23 + letters.indexOf(s.charAt(i));
        }
        return h;
    }
}
