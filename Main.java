public class Main {
    public static void main(String[] args) {
        // creare locomotiva 
        Locomotiva locomotiva = new Locomotiva("Carbune");
        
        // creare vagon 
        Vagon vagon = new Vagon("Pasageri");
        
        // creare tren format din locomotiva si vagon
        Tren tren = new Tren(locomotiva, vagon);
        tren.pleaca();   
        tren.soseste();  
    }
}

class Locomotiva {
    private String tip;  // camp privat care retine tipul locomotivei
    
    // constructorul clasei Locomotiva 
    public Locomotiva(String tip) {
        this.tip = tip;
    }
    
    // metoda pentru pornirea locomotivei
    public void porneste() {
        System.out.println("Locomotiva de tip " + tip + " a pornit si este gata de plecare.");
    }
    
    // metoda pentru oprirea locomotivei
    public void opreste() {
        System.out.println("Locomotiva de tip " + tip + " s-a oprit.");
    }
}

class Vagon {
    private String tip;          // tipul vagonului 
    private String dateIncarcate; // ce este incarcat in vagon
    
    // constructorul clasei Vagon
    public Vagon(String tip) {
        this.tip = tip;
        this.dateIncarcate = null; // initial vagonul este gol
    }
    
    // metoda pentru imbarcarea pasagerilor sau a marfurilor
    public void imbarcheaza(String date) {
        this.dateIncarcate = date;  
        System.out.println("In vagonul de tip " + tip + " a fost incarcat: " + date + ".");
    }
    
    // metoda pentru debarcarea pasagerilor sau descarcarea marfurilor
    public void debarcheaza() {
        System.out.println("Vagonul de tip " + tip + " a fost descarcat.");
        this.dateIncarcate = null;  // dupa descarcare vagonul devine gol
    }
}

class Tren {
    private Locomotiva locomotiva; // trenul are o locomotiva
    private Vagon vagon;           // trenul are un vagon
    
    // constructorul clasei Tren (primește o locomotiva si un vagon)
    public Tren(Locomotiva locomotiva, Vagon vagon) {
        this.locomotiva = locomotiva;
        this.vagon = vagon;
    }
    
    // metoda care descrie plecarea trenului
    public void pleaca() {
        // pornire locomotiva
        locomotiva.porneste();
        System.out.println("Trenul pleaca acum din gara.");
        // incarcare vagon
        vagon.imbarcheaza("100 de pasageri si bagaje");
    }
    public void soseste() {
        locomotiva.opreste();
        System.out.println("Trenul a sosit la destinatie.");
        vagon.debarcheaza();
    }
}
