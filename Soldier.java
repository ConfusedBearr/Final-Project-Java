public class Soldier extends Person {
    private String rank;
    private String branch;
    private boolean officer;

    public Soldier(Name name, Date dob, String rank, String branch, boolean officer) {
        super(name, dob);
        this.rank = rank;
        this.branch = branch;
        this.officer = officer;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public boolean isOfficer() {
        return officer;
    }

    public void setOfficer(boolean officer) {
        this.officer = officer;
    }

    @Override
    public void thisIsWhatIDo() {
        System.out.println("I am a soldier.");
    }
}