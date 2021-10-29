public class test {
    public static void main(String[] args) {
        IStudent[] array = new IStudent[5];
        array[0] = new StudentProgrammer();
        array[1] = new StudentPhilosopher("Valery Ghmishenko");
        array[2] = new StudentPhilosopher("Bogdan Khmelnitskiy");
        array[3] = new StudentProgrammer("Agent 47");
        array[4] = new StudentProgrammer("Steve Jobs");
        SortAndSearch dig = new SortAndSearch();
        dig.printFull(array);
        System.out.println();
        dig.sort(array);
        dig.printFull(array);
        try {
            dig.search(array,"Agent 54");
        } catch (ArrayIndexOutOfBoundsException err)
        {
            throw new ExceptionFailedSearch("Поиск неудачен, проверены все студенты: ", err);
        }

    }
}
