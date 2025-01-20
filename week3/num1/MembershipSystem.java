package week3.num1;

import java.util.ArrayList;
import java.util.List;

public class MembershipSystem {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        members.add(new MemberRed("James", 10000, 2));
        members.add(new MemberRed("Tomas", 30000, 2));
        members.add(new MemberPlatinum("Edward", 10000, 2));
        members.add(new MemberPlatinum("Percy", 30000, 2));
        members.add(new MemberDiamond("Elizabet", 30000, 2));

        for (Member member : members) {
            member.printResult();
        }
    }
}
