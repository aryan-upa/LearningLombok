package com.example.LearningLombok.Lombok.Customer;

// Always prefer singular imports rather than * .
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class Customer {

    private Long id;
    private String Name;
    private String email;
    private String password;

    // currently, lombok doesn't allow us to create constructors with some params.
    public Customer(String name, String email, String password) {
        this.Name = name;
        this.email = email;
        this.password = password;
    }

}

