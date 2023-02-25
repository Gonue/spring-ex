package com.example.jpa.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
@Entity
public class Users {

    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Address> address;

}
