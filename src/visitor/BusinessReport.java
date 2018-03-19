package visitor;

import java.util.LinkedList;
import java.util.List;

public class BusinessReport {
    List<Staff> mStaffs = new LinkedList<>();

    public BusinessReport(){
        mStaffs.add(new Enginner("Seiya"));
        mStaffs.add(new Coder("code1"));
        mStaffs.add(new Coder("code2"));
        mStaffs.add(new Coder("code3"));
        mStaffs.add(new Coder("code4"));
        mStaffs.add(new Coder("code5"));
        mStaffs.add(new Coder("code6"));
    }

    public void showReport(Visitor visitor){
        for(Staff staff : mStaffs){
           staff.accept(visitor);
        }
    }
}
