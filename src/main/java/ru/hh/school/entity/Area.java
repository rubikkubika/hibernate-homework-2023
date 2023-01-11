package ru.hh.school.entity;

import javax.persistence.*;

//TODO: оформите entity
@Entity
public class Area {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "area_id", nullable = false, unique = true)
  private Integer id;

  private String name;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
