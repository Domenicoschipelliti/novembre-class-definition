package es_1;

public class Rettangolo {

    private int larghezza;
    private int altezza;    //<--attributo
    public  int areaRet(){
        int calcolo= this.altezza * this.larghezza;
        System.out.println(calcolo);
        return calcolo;

    }
    public  int perimetroRet(){
        int per=this.larghezza + this.altezza;
        System.out.println(per);
        return per;

    }
}
