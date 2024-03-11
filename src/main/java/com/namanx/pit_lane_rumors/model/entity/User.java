package com.namanx.pit_lane_rumors.model.entity;

import com.namanx.pit_lane_rumors.model.enums.Role;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Table(name = "my_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String username;
    String password;
    @Enumerated(EnumType.STRING)
    Role role;

    @OneToMany
    List<Rumor> rumors;


}
