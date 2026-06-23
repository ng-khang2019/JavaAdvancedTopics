package _06OOP.ClassAndInheritance._03StaticAndInstance;

import java.util.UUID;

public class NewBank {
    private static int branchesCount = 0;
    private String branchId;
    private String branchName;

    public NewBank(String branchName) {
        this.branchName = branchName;
        this.branchId = UUID.randomUUID().toString().replace("-", "");
        branchesCount++;
    }

    public static int getBranchesCount() {
        return branchesCount;
    }

    public String getBranchId() {
        return branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
}
