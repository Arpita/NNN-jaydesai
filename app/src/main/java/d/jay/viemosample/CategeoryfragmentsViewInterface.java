package d.jay.viemosample;

import java.util.ArrayList;

import d.jay.viemosample.Model.CategeoryModel;

public interface CategeoryfragmentsViewInterface {

    public void showProgressbar();
    public void hideProgressbar();
    public void gotListOfCategeory(ArrayList<CategeoryModel> categeoryList);
}
