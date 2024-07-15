import java.util.Objects;

public class LicensePlate {
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(liNumber, country);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        LicensePlate other = (LicensePlate) obj;
        return Objects.equals(liNumber, other.liNumber) && Objects.equals(country, other.country);
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }
}
