import java.util.Date;
import java.util.List;
import java.util.ArrayList;

// Patient Class
public class Patient {
    private String ID;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String gender;
    private double weight;
    private double height;
    private String address;
    private List<MedicalImage> images;
    private List<Disease> diseases;

    public Patient(String ID, String firstName, String lastName, Date birthDate, String gender, double weight, double height, String address) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.address = address;
        this.images = new ArrayList<>();
        this.diseases = new ArrayList<>();
    }

    // Getters and Setters
    public String getID() { return ID; }
    public void setID(String ID) { this.ID = ID; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public Date getBirthDate() { return birthDate; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public List<MedicalImage> getImages() { return images; }
    public void addImage(MedicalImage image) { this.images.add(image); }
    public void removeImage(MedicalImage image) { this.images.remove(image); }

    public List<Disease> getDiseases() { return diseases; }
    public void addDisease(Disease disease) { this.diseases.add(disease); }
    public void removeDisease(Disease disease) { this.diseases.remove(disease); }
}

// MedicalImage Class
public class MedicalImage {
    private String fileName;
    private Date dateTaken;
    private String imageType;
    private String doctorComments;

    public MedicalImage(String fileName, Date dateTaken, String imageType, String doctorComments) {
        this.fileName = fileName;
        this.dateTaken = dateTaken;
        this.imageType = imageType;
        this.doctorComments = doctorComments;
    }

    // Getters and Setters
    public String getFileName() { return fileName; }
    public void setFileName(String fileName) { this.fileName = fileName; }

    public Date getDateTaken() { return dateTaken; }
    public void setDateTaken(Date dateTaken) { this.dateTaken = dateTaken; }

    public String getImageType() { return imageType; }
    public void setImageType(String imageType) { this.imageType = imageType; }

    public String getDoctorComments() { return doctorComments; }
    public void setDoctorComments(String doctorComments) { this.doctorComments = doctorComments; }
}

// Disease Class
public class Disease {
    private String diseaseName;
    private Date diagnosisDate;
    private String treatment;

    public Disease(String diseaseName, Date diagnosisDate, String treatment) {
        this.diseaseName = diseaseName;
        this.diagnosisDate = diagnosisDate;
        this.treatment = treatment;
    }
}
