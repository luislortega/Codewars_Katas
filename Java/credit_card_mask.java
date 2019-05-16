public class Maskify {
    public static String maskify(String str) {
        String devolucion = "";
        if((str.length() -1) >= 4){        
           for(int i = 0; i <= (str.length()-1); i++){
             if( ((str.length()-1) - i) >= 4){
               devolucion = devolucion + "#";
             }else{
               devolucion = devolucion + (str.charAt(i)); 
             }
           }
        }else{
          devolucion = str;
        }
        return devolucion;
    }
}