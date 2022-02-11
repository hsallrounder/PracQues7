package Pre_Requisites;

interface LL<T> {
    default void add(T val){}
    default void insertAtBeginning(T val){}
    default void insert(int pos,T val){}
    default void delete(T val){}
    default void deleteAtIndex(int ind){}
    default void display(){}
    default void displayRev(){}
}
