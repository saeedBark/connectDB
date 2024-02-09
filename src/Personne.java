public class Personne {
    private int id;
    private String nom;
    private String prenom;
    private int age;
    private double taille;

    // Constructors
    public Personne() {
    }

    public Personne(String nom, String prenom, int age, double taille) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.taille = taille;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    // toString method
    @Override
    public String toString() {
        return "Persone{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", taille=" + taille +
                '}';
    }
}
