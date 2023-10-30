package javaproject;

public class MultiClubMember extends Member{
    private int membershipPoints;

    public MultiClubMember(char pMemberType, int pMemberID, String pName, double pFees, int pmembershipPoints){
        super(pMemberType, pMemberID, pName, pFees);
        membershipPoints=pmembershipPoints;
    }
    
    public void setMembershipPoints(int pmembershipPoints)
    {
        membershipPoints = pmembershipPoints;
    }
    public int getMembershipPoints() {
        return membershipPoints;
    }

    @Override
    public String toString()
    {
        return super.toString() + "," + membershipPoints;
    }
}
