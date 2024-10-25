public class Student {
    private String name;
    private int[] marks;

    public Student(String name, int... marks)
    {
        this.name=name;
        this.marks = marks;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfMarks()
    {
        return this.marks.length;
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


}
