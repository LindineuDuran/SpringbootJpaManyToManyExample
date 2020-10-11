## Spring Boot Hibernate Many to Many Example
Step by step many-to-many entity implementation, mapping using JPA/Hibernate with Spring Boot, Spring Data JPA, and MySQL database.
In many-to-many association, the source entity has a field that stores a collection of target entities. The @ManyToMany JPA annotation is used to link the source entity with the target entity.
A many-to-many association always uses an intermediate join table to store the association that joins two entities. The join table is defined using the @JoinTable JPA annotation.
- [Based on an example by Java Guides](https://www.javaguides.net/2019/08/spring-boot-hibernate-many-to-many-example.html)
- [Java Guides video in Youtube](https://www.youtube.com/watch?v=-q9rp2pzvGU&feature=youtu.be&ab_channel=JavaGuides)


