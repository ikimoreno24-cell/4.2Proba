import java.util.Scanner;
public class Programa {

    public static String balidatuZenbakia(int zenb) {
        if (zenb < 100 || zenb > 999) {
            return "ER1";
        }
        return "OK";
    }

    public static String balidatuSaila(int saila) {
        if (saila < 10 || saila > 99) {
            return "ER2";
        }
        return "OK";
    }

    public static String balidatuLana(String lana) {
        switch (lana) {
            case "programatzailea":
                return "2000";
            case "analista":
                return "2500";
            case "diseinatzailea":
                return "1500";
            default:
                return "ER3";
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int saila = 0;
        boolean menu = true;
        String ofizioa = "programatzailea";
        String ofizioa1 = "analista";
        String ofizioa3 = "diseinatzailea";


        while (menu == true){
            
            System.out.println("Sartu langile zenbakia");
            int zenb = sc.nextInt();
            

            if (zenb < 100 || zenb > 999){
                System.out.println("ER1: langile kode okerra");
            }
            else {
                System.out.println("Sartu langilearen saila");
                saila = sc.nextInt();
                if ( saila < 10 || saila >99){
                    System.out.println("ER2: Saila ez da zuzena");
                }
                else{
                    System.out.println("Sartu ofizioa: programatzailea, analista edo diseinatzailea (dena minuskulaz idatzita)");
                    sc.nextLine();
                    String lana = sc.nextLine();
                    if (lana.equals("programatzailea")){
                        System.out.println("programatzailearen soldata 2000€-koa da.");
                        menu = false;
                    } 
                    else if(lana.equals("analista")){
                        System.out.println("analistaren soldata 2500€-koa da.");
                        menu = false;
                    }
                    else if(lana.equals("diseinatzailea")){
                        System.out.println("diseinatzailearen soldata 1500€-koa da.");
                        menu = false;
                    }
                    else{
                        System.out.println("ER3: ofiziorik ez da aukeratu");
                    }
                        
                    
                   

                }
                 
                
            }
            
        }


    }

}
