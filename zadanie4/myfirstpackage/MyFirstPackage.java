package myfirstpackage;
public class MyFirstPackage{
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
    public MyFirstPackage(int first,int second){
        this.first = first;
        this.second = second;
    }
    // Прописываем метод с возвращаемым типом int, реализующий над этими числами целочисленное деление
    public int division(){
        return first/second;
    }
}