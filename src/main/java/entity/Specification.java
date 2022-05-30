package entity;
import javax.persistence.*;

@Entity
@Table(name = "specifications")
public class Specification implements java.io.Serializable {
    @Id
    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private Catalog catalog;

    @Column(name = "type", nullable = false, length = 50)
    private String type;

    @Column(name = "square", nullable = false, length = 50)
    private double square;

    @Column(name = "floorsNumber", nullable = false, length = 50)
    private double floorsNumber;

    public Specification() {
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(double floorsNumber) {
        this.floorsNumber = floorsNumber;
    }
}
