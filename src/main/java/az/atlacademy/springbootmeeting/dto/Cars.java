package az.atlacademy.springbootmeeting.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Objects;
@Entity
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String brend;
    private long serial_number;
    private int power;
    private String status;

    public Cars(long id, String name, String brend, long serial_number, int power, String status) {
        this.id = id;
        this.name = name;
        this.brend = brend;
        this.serial_number = serial_number;
        this.power = power;
        this.status = status;
    }

    public Cars() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public long getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(long serial_number) {
        this.serial_number = serial_number;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars goods = (Cars) o;
        return id == goods.id && serial_number == goods.serial_number && power == goods.power && Objects.equals(name, goods.name) && Objects.equals(brend, goods.brend) && Objects.equals(status, goods.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, brend, serial_number, power, status);
    }

    @Override
    public String toString() {
        return "Goods{id=%d, name='%s', brend='%s', serial_number=%d, power=%d, status='%s'}".formatted(id, name, brend, serial_number, power, status);
    }
}
