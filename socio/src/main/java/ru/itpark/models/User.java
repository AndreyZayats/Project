package ru.itpark.models;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import javax.persistence.*;

@Entity
@Table(name = "socio")
public class User {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return id == user.id &&
                Objects.equal(name, user.name) &&
                age == user.age ;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, age, name);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("age", name)
                .add("name", age)
                .toString();
    }
}
