package ru.hh.school.entity;

import javax.persistence.*;

@Entity
public class Resume {
  // TODO: сделать так, чтобы id брался из sequence-а
  // таким образом, мы сможем отправлять в бд запросы батчами.
  // нужно учитывать, что описание sequence при создании таблицы также должно соответствовать
  // хиберовской сущности (см. create_resume.sql)
  //
  // Подробнее:
  // https://vladmihalcea.com/how-to-batch-insert-and-update-statements-with-hibernate/
  // https://vladmihalcea.com/from-jpa-to-hibernates-legacy-and-enhanced-identifier-generators/
  @Id
  @GeneratedValue(generator = "resume_id_seq", strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(name = "resume_id_seq",allocationSize = 1)
  @Column(name = "id")
  private Integer id;
  @Column(name = "description")
  private String description;

  public Resume() {

  }

  public Resume(String description) {
    this.description = description;
  }


}
