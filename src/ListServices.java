public interface ListServices<Type> {
    void add(Type element);
    Type get(int pos);
    void remove();
    int size();
}