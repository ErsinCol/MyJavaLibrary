public interface IEntityRepository<T extends IEntity> { // generic kısıt getirme
    void add(T entity);
    void delete(T entity);
    void update(T entity);
}
