public class Lista {

    private Nod prim;

    public void inserareInceputLista(int numar) {

        Nod nod = new Nod(numar);
        nod.setNext(prim);
        this.prim = nod;
    }

    public  int numaraAparitii(int numarCautat){
        int contor =0;
        Nod nod = prim;

        while(nod!=null) {
            if(nod.getNum()==numarCautat)
                contor++;
            nod = nod.getNext();
        }

        return contor;
    }


    @Override
    public String toString() {
        String message = "";

        Nod nod = prim;

        while(nod!=null) {
            message += nod.getNum() + " ";
            nod = nod.getNext();
        }

        return message;
    }
}
