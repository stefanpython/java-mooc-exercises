
class LiteracyRecord {

    String theme;
    String ageGroup;
    String gender;
    String country;
    int year;
    double literacyRate;

    LiteracyRecord(String theme, String ageGroup, String gender, String country, int year, double literacyRate) {
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacyRate = literacyRate;
    }

    public double getLiteracyRate() {
        return this.literacyRate;
    }

    @Override
    public String toString() {
        return String.format("%s (%d), %s, %.5f", country.trim(), year, gender.trim().toLowerCase(), literacyRate);
    }

}
