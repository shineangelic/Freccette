
//Cose da fare:
//Cambiare l'ordine dei metodi... Conviene prima dire il numero dei punti e poi per cosa moltiplicarli in modo da passare in ingresso al metodo il valore
//Fare un unico metodo per la gestione del punteggio e diversi per la gestione dellúltimo titolo
//Controllaree costanti suggerite da S.
//Pulizia del codice generale

//prevedere un default (INVIO) nel caso di double/triple (2-double 3-triple INVIO-nulla)
//gestione fine partita/vincita
//gestione input errati

//suggerimento: far passare tutti gli input.nextInt() attraverso un metodo che gestisca gli errori
import java.util.Scanner;

public class Freccette {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Scegli la modalita'");
		System.out.println("1-Straight out, 2-Double out, 3-Triple out, 4-Master out");
		int modalitaScelta = input.nextInt();
		switch (modalitaScelta) {
		case 1:
			straightOut();
			break;
		case 2:
			doubleOut();
			break;
		case 3:
			TripleOut();
			break;
		case 4:
			MasterOut();
			break;
		default:
			System.out.println("Il numero da te inserito non e'corretto");
		}
	}

	private static int leggiMoltiplicatore() {
		System.out.println("Il giocatore ha ottenuto un double o un triple? (2-double 3-triple)");
		int moltiplicatore = input.nextInt();
		int puntiGiocatore;
		switch (moltiplicatore) {
		case 2:
			puntiGiocatore = puntiTurno() * 2;
			break;
		case 3:
			puntiGiocatore = puntiTurno() * 3;
			break;
		default:
			System.out.println("Nessun moltiplicatore scelto");
			puntiGiocatore = puntiTurno();
		}
		return puntiGiocatore;
	}

	private static int puntiTurno() {
		System.out.println("Inserire i punti effettuati dal giocatore");
		int puntiTurno = input.nextInt();
		return puntiTurno;
	}

	private static void straightOut() {
		System.out.println("Nella Modalita' straight out i giocatori si sfidano a chi per primo arriva a zero punti.");
		int puntiIniziali0 = 501, puntiIniziali1 = 501;
		while (puntiIniziali0 > 0 && puntiIniziali1 > 0) {
			System.out.println("Inserire il punteggio di Giocatore 0");
			for (int tiri = 3; tiri > 0; tiri--) {
				int puntiGiocatore = leggiMoltiplicatore();
				puntiIniziali0 = puntiIniziali0 - puntiGiocatore;
				if (puntiIniziali0 < 0) {
					puntiIniziali0 += puntiGiocatore;
					System.out.println("Hai spalato");
				} else if (puntiIniziali0 == 0) {
					break;
				}
				System.out.println("Attualmente il Giocatore 0 ha " + puntiIniziali0);
			}
			System.out.println("Inserire il punteggio di Giocatore 1");
			for (int tiri = 3; tiri > 0; tiri--) {
				int puntiGiocatore = leggiMoltiplicatore();
				puntiIniziali1 -= puntiGiocatore;
				if (puntiIniziali1 < 0) {
					puntiIniziali1 = puntiIniziali1 + puntiGiocatore;
					System.out.println("Hai spalato");//ahah
				} else if (puntiIniziali1 == 0) {
					break;
				}
				System.out.println("Attualmente il Giocatore 1 ha " + puntiIniziali1);
			}
		}
	}

	private static void doubleOut() {
		System.out.println(
				"Nella modalita' double out i giocatori si sfidano a chi per primo arriva a zero punti colpendo,con l'ultimo tiro, l'anello del double out");
		int puntiIniziali0 = 501, puntiIniziali1 = 501;
		while (puntiIniziali0 > 0 & puntiIniziali1 > 0) {
			System.out.println("Inserire il punteggio di Giocatore 0");
			for (int tiri = 3; tiri > 0; tiri--) {
				int puntiGiocatore = leggiMoltiplicatore();
				puntiIniziali0 = puntiIniziali0 - puntiGiocatore;
				if (puntiIniziali0 < 0) {
					puntiIniziali0 = puntiIniziali0 + puntiGiocatore;
					System.out.println("Hai spalato");
				} else if (puntiIniziali0 == 0) {
					if (puntiGiocatore % 2 == 0) {
						break;
					}
				}
				System.out.println("Attualmente il Giocatore 0 ha " + puntiIniziali0);
			}
			System.out.println("Inserire il punteggio di Giocatore 1");
			for (int tiri = 3; tiri > 0; tiri--) {
				int puntiGiocatore = leggiMoltiplicatore();
				puntiIniziali1 = puntiIniziali1 - puntiGiocatore;
				if (puntiIniziali1 < 0) {
					puntiIniziali1 = puntiIniziali1 + puntiGiocatore;
					System.out.println("Hai spalato");
				} else if (puntiIniziali1 == 0) {
					if (puntiGiocatore % 2 == 0) {
						break;
					}
				}
				System.out.println("Attualmente il Giocatore 1 ha " + puntiIniziali1);
			}
		}
	}

	private static void TripleOut() {
		System.out.println(
				"Nella modalita' double out i giocatori si sfidano a chi per primo arriva a zero punti colpendo,con l'ultimo tiro, l'anello del double out");
		int puntiIniziali0 = 501, puntiIniziali1 = 501;
		while (puntiIniziali0 > 0 & puntiIniziali1 > 0) {
			System.out.println("Inserire il punteggio di Giocatore 0");
			for (int tiri = 3; tiri > 0; tiri--) {
				int puntiGiocatore = leggiMoltiplicatore();
				puntiIniziali0 = puntiIniziali0 - puntiGiocatore;
				if (puntiIniziali0 < 0) {
					puntiIniziali0 = puntiIniziali0 + puntiGiocatore;
					System.out.println("Hai spalato");
				} else if (puntiIniziali0 == 0) {
					if (puntiGiocatore % 3 == 0) {
						break;
					}
				}
				System.out.println("Attualmente il Giocatore 0 ha " + puntiIniziali0);
			}
			System.out.println("Inserire il punteggio di Giocatore 1");
			for (int tiri = 3; tiri > 0; tiri--) {
				int puntiGiocatore = leggiMoltiplicatore();
				puntiIniziali1 = puntiIniziali1 - puntiGiocatore;
				if (puntiIniziali1 < 0) {
					puntiIniziali1 = puntiIniziali1 + puntiGiocatore;
					System.out.println("Hai spalato");
				} else if (puntiIniziali1 == 0) {
					if (puntiGiocatore % 3 == 0) {
						break;
					}
				}
				System.out.println("Attualmente il Giocatore 1 ha " + puntiIniziali1);
			}
		}
	}

	private static void MasterOut() {
		System.out.println(
				"Nella modalita' double out i giocatori si sfidano a chi per primo arriva a zero punti colpendo,con l'ultimo tiro, l'anello del double out");
		int puntiIniziali0 = 501, puntiIniziali1 = 501;
		while (puntiIniziali0 > 0 && puntiIniziali1 > 0) {
			System.out.println("Inserire il punteggio di Giocatore 0");
			for (int tiri = 3; tiri > 0; tiri--) {
				int puntiGiocatore = leggiMoltiplicatore();
				puntiIniziali0 -= puntiGiocatore;
				if (puntiIniziali0 < 0) {
					puntiIniziali0 = puntiIniziali0 + puntiGiocatore;
					System.out.println("Hai spalato");
				} else if (puntiIniziali0 == 0) {
					if (puntiGiocatore == 50) {
						break;
					}
				}
				System.out.println("Attualmente il Giocatore 0 ha " + puntiIniziali0);
			}
			System.out.println("Inserire il punteggio di Giocatore 1");
			for (int tiri = 3; tiri > 0; tiri--) {
				int puntiGiocatore = leggiMoltiplicatore();
				puntiIniziali1 = puntiIniziali1 - puntiGiocatore;
				if (puntiIniziali1 < 0) {
					puntiIniziali1 += puntiGiocatore;
					System.out.println("Hai spalato");
				} else if (puntiIniziali1 == 0) {
					if (puntiGiocatore == 50) {
						break;
					}
				}
				System.out.println("Attualmente il Giocatore 1 ha " + puntiIniziali1);
			}
		}
	}

}
