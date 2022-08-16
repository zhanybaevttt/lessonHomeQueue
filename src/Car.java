public class Car {
    private int id ;
    private int nom;

    public Car(int id, int nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNom() {
        return nom;
    }

    public void setNom(int nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                "\n nom=" + nom +
                ' ';
    }
}
