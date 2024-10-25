import java.util.ArrayList;

public class StudentWithArrayList {
    private String name;
    private ArrayList<Integer> marks = new ArrayList<Integer>();

    public StudentWithArrayList(String name, int... marks)
    {
        this.name=name;
        for(int mark:marks)
            this.marks.add(mark);}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfMarks()
    {
        return this.marks.size();
    }

    public int getTotalSumOfMarks()
    {
        int sum = 0;
        for(int mark:this.marks)
        {
            sum+=mark;
        }
        return sum;
    }

    public int getMaxMark()
    {
        int max = 0;
        for(int mark:this.marks)
            if(mark > max)
                max = mark;
        return max;
    }

    public int getMinMark()
    {
        int min = 999;
        for(int mark:this.marks)
            if(mark < min)
                min = mark;
        return min;
    }

    public String toString(){return name + marks;}

    public void addNewMark(int mark){marks.add(mark);}

    public void removeMarkAtIndex(int index)
    {marks.remove(index);}

}
