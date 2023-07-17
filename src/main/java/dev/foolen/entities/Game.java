package dev.foolen.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Game extends PanacheEntity {
    public String title;
    public String developer;
}
