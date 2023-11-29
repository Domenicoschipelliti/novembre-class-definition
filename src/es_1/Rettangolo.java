package es_1;

public class Rettangolo {

    private int larghezza;  //<--scope di istanza
    private int altezza;//<--attributo

    private int lar;
    private int alt;

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


    public int areal(){
        int mol=this.alt * this.lar;
        System.out.println(mol);
        return mol;
    }

    public int arelar(){
        int mol=this.alt + this.lar;
        System.out.println(mol);
        return mol;
    }

    public int getAlt() {
        return alt;
    }
    public void setAlt(int cal){
        this.alt=cal;
        int si=areal();
        int no=arelar();
        int prec=perimetroRet();
        int pre=areaRet();
    }

    public int getLar(){
        return lar;
    }
    public void setLar(int cal){
        this.lar=cal;
        int si=areal();
        int no=arelar();
        int prec=perimetroRet();
        int pre=areaRet();
    }


}


//scope di blocco è tipo if/else