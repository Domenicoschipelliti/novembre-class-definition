package es_1;

public class Rettangolo {

    private int larghezza;  //<--scope di istanza
    private int altezza;    //<--attributo

    public int getLarghezza(){
        return larghezza;
    }
    public void setLarghezza(int larghezza){
        this.larghezza=larghezza;
        int piu=perimetroRet();
        int pe=areaRet();

    }
    public int getAltezza(){
        return altezza;
    }

    public void setAltezza(int altezza){
        this.altezza=altezza;
        int piu=perimetroRet();
        int pe=areaRet();
        System.out.println(piu);
        System.out.println(pe);
    }


    public  int areaRet(){  //<--costruttore
        int calcolo= this.altezza * this.larghezza; //calcolo è uno scope di metodo validi solo nel metodo
        System.out.println(calcolo);
        return calcolo;

    }


    public  int perimetroRet(){
        int per=this.larghezza + this.altezza;
        System.out.println(per);
        return per;

    }



}


//scope di blocco è tipo if/else