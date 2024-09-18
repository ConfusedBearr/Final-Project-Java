import java.util.Objects;

public class Candidate extends PoliticalCandidate {
    public Candidate(Name name, Date dob, String party, String position) {
        super(name, dob, party, position);
    }
}

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        if(party != null) {
            this.party = party;
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if(position != null) {
            this.position = position;
        }
    }

    @Override
    public void thisIsWhatIDo() {
        System.out.println("I am a political candidate.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Party: " + this.getParty() + ", Position: " + this.getPosition();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Candidate candidate = (Candidate) o;
        return Objects.equals(party, candidate.party) &&
                Objects.equals(position, candidate.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), party, position);
    }
}
