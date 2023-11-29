import es_1.Rettangolo;

public class Main {
    public static void main(String[] args){
         Rettangolo area=new Rettangolo();
         System.out.println(area.getAltezza());
         System.out.println(area.getLarghezza());
        System.out.println(area.getLar());
        System.out.println(area.getAlt());

          area.setAltezza(23);
          area.setLarghezza(36);

          area.setLar(25);
          area.setAlt(28);


    }
}