package ua.qLate.Logic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
@Getter
public class AppUser {
    @Id @GeneratedValue
    private int id;
    private String email;
    @Transient
    private LocalDate dob;
    private int age;

    public LocalDate getDob() {
        return LocalDate.now().plusYears(-age);
    }
}
