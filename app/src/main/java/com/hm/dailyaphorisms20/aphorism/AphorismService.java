package com.hm.dailyaphorisms20.aphorism;

public class AphorismService {

    private AphorismDAO dao = new AphorismDAO();

    // Format & Send Aphorisms to the Display
    public void getAphorisms() {
        dao.getAphorisms();

        // TODO: Format to Aphorisms (Should there be a mapper?)
    }
}
