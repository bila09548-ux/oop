class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass(20, 10);
        System.out.println(o.division());
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                o.setFirst(i);
                o.setSecond(j);
                System.out.print(o.division());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
class MySecondClass {
    // Прописываем два приватных поля для нашего класса
    private int first;
    private int second;

    // Прописываем методы получения значений наших полей
    public int getFirst() {
        return first;
    }
    public int getSecond(){
        return second;
    }
    // Прописываем методы модификации значений наших полей
    public void setFirst(int first){
        this.first = first;
    }
    public void setSecond(int second){
        this.second = second;
    }
    // Прописываем конструктор, создающий объект и инициализирующий значения полей;
    public MySecondClass(int first,int second){
        this.first = first;
        this.second = second;
    }
    // Прописываем метод с возвращаемым типом int, реализующий над этими числами целочисленное деление
    public int division(){
        return first/second;
    }
}
