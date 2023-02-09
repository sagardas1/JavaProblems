package MySingletonClass;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        MySingleton s=MySingleton.getInstance();
        System.out.println(s);
       // MySingleton k= (MySingleton) //s.clone();
        //System.out.println(k);




    }
//
//
//    public String m1(int beginIndex,int endIndex,String s){
//        int length = s.length();
//     //   checkBoundsBeginEnd(beginIndex, endIndex, length);
//        int subLen = endIndex - beginIndex;
//        if (beginIndex == 0 && endIndex == length) {
//            return s;
//        }
//        return isLatin1() ? StringLatin1.newString(value, beginIndex, subLen)
//                : StringUTF16.newString(value, beginIndex, subLen);
//    }
}
