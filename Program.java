public class Program {
    public static void main(String[] args) {        
        ArrayListClass<Integer> intList = new ArrayListClass<>();
        intList.add(1); 
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        
        intList.printArray(); 

        intList.delInd(3); 
        
        intList.printArray();

        intList.delData(2); 
        
        intList.printArray();
        System.out.println(intList.minData()); 
        System.out.println(intList.maxData()); 
        System.out.println(intList.sumData()); 
        System.out.println(intList.multiData()); 
        System.out.println(intList.findInd(7)); 
        System.out.println(intList.findData(5)); 

        try {
            intList.BubbleSort();
            System.out.print("Результат:"); 
            intList.printArray();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        ArrayListClass<String> stringList = new ArrayListClass<>();
        stringList.add("Здание"); 
        stringList.add("Учебник");
        stringList.add("Турбина");
        
        stringList.printArray(); 
        stringList.delInd(1);
        stringList.printArray();

    }
}