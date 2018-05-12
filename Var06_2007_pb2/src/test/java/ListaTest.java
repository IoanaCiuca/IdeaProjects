import org.junit.Test;

import static org.junit.Assert.*;

public class ListaTest {

    @Test
    public void inserareInceputLista() {
        Lista lista = new Lista();

        lista.inserareInceputLista(1);
        lista.inserareInceputLista(2);
        lista.inserareInceputLista(3);
        lista.inserareInceputLista(4);

        String raspunsAsteptat = "4 3 2 1 ";
        String raspunsPrimit = lista.toString();

        assertEquals(raspunsAsteptat,raspunsPrimit);
    }

    @Test
    public void numaraAparitii() {

        Lista lista = new Lista();

        lista.inserareInceputLista(1);
        lista.inserareInceputLista(2);
        lista.inserareInceputLista(3);
        lista.inserareInceputLista(4);
        lista.inserareInceputLista(1);
        lista.inserareInceputLista(2);
        lista.inserareInceputLista(3);
        lista.inserareInceputLista(4);
        lista.inserareInceputLista(1);
        lista.inserareInceputLista(4);
        lista.inserareInceputLista(4);
        lista.inserareInceputLista(4);

        int numarCautat = 4;

        int raspunsPrimit  = lista.numaraAparitii(numarCautat);

        int raspunsAsteptat = 5;

        assertEquals(raspunsPrimit,raspunsAsteptat);
    }
}