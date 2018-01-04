import java.util.*;

public class Freccette {

    public static Scanner input = new Scanner(System.in);
    
        public static void main(String[] args) {
	System.out.println("Scegli la modalita'");
	System.out.println("1-Straight out, 2-Double out, 3-Triple out, 4-Master out");
	int modalitaScelta = input.nextInt();
	switch (modalitaScelta) {
	case 1 : 
            StraightOut();
	break;
	case 2 :
            DoubleOut();
	break;
	case 3 :
            TripleOut();
	break;
	case 4 :
            MasterOut();
	break;
	default: System.out.println("Il numero da te inserito non e'corretto");
	}
    }

    //In futuro cambiare l'ordine dei metodi... Conviene prima dire il numero dei punti e poi per cosa moltiplicarli in modo da passare in ingresso al metodo il valore
    private static int Moltiplicatori() {
       System.out.println("Il giocatore ha ottenuto un double o un triple?");
            int moltiplicatore = input.nextInt();
            int puntiGiocatore;
            switch (moltiplicatore) {
            case 2 :
            puntiGiocatore = PuntiTurno()*2;
            break;
            case 3:
            puntiGiocatore = PuntiTurno()*3;
            break;
            default:
            System.out.println("Nessun moltiplicatore scelto");
            puntiGiocatore= PuntiTurno(); 
            }
            return puntiGiocatore;
    }
    
    private static int PuntiTurno() {
    System.out.println("Ïnserire i punti effettuati dal giocatore");
    int puntiTurno = input.nextInt();
    return puntiTurno;
    }  
        
    private static void StraightOut() { 
        System.out.println("Nella Modalita' straight out i giocatori si sfidano a chi per primo arriva a zero punti.");
        int puntiIniziali0= 501, puntiIniziali1= 501;
        while (puntiIniziali0>0&puntiIniziali1>0) {
            System.out.println("Inserire il punteggio di Giocatore 0");
            for (int tiri= 3; tiri>0; tiri--) {
            int puntiGiocatore= Moltiplicatori();
            puntiIniziali0=puntiIniziali0-puntiGiocatore;
            if (puntiIniziali0<0) {
                puntiIniziali0=puntiIniziali0+puntiGiocatore;
                System.out.println("Hai spalato");
            } else if (puntiIniziali0==0) {
                break;
            }
            System.out.println("Attualmente il Giocatore 0 ha "+ puntiIniziali0);
            }
            System.out.println("Inserire il punteggio di Giocatore 1");
            for (int tiri= 3; tiri>0; tiri--) {
            int puntiGiocatore= Moltiplicatori();
            puntiIniziali1=puntiIniziali1-puntiGiocatore;
            if (puntiIniziali0<0) {
                puntiIniziali0=puntiIniziali0+puntiGiocatore;
                System.out.println("Hai spalato");
            } else if (puntiIniziali0==0) {
                break;
            }
            System.out.println("Attualmente il Giocatore 1 ha "+ puntiIniziali1);  
            }
        }
    }
    
    private static void DoubleOut() {
       System.out.println("Nella modalita' double out i giocatori si sfidano a chi per primo arriva a zero punti colpendo,con l'ultimo tiro, l'anello del double out");
       int puntiIniziali0= 501, puntiIniziali1= 501;
        while (puntiIniziali0>0 & puntiIniziali1>0) {
            System.out.println("Inserire il punteggio di Giocatore 0");
            for (int tiri= 3; tiri>0; tiri--) {
            Moltiplicatori();
            int puntiTurno = input.nextInt();
            System.out.println("Attualmente il Giocatore 1 ha "+ (puntiIniziali0=puntiIniziali0-puntiTurno));
            }
            System.out.println("Inserire il punteggio di Giocatore 1");
            for (int tiri= 3; tiri>0; tiri--) {
            Moltiplicatori();
            int puntiTurno = input.nextInt();
            System.out.println("Attualmente il Giocatore 1 ha "+ (puntiIniziali1=puntiIniziali1-puntiTurno));
            }
        }
    }

    private static void TripleOut() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void MasterOut() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}