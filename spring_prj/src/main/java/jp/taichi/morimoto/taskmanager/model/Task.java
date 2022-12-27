// package jp.taichi.morimoto.taskmanager.model;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;

// @Entity
// @Table(name="tasks")
// public class Task {

//   @Id
//   @GeneratedValue(strategy = GenerationType.IDENTITY)
//   @Column(name="task_id")
//   private Integer taskId;

//   @Column(name="title")
//   private String title;

//   @Column(name="content")
//   private String content;
  
//   @Column(name="expired_date")
//   private String expiredDate;

//   @Column(name="status_id")
//   private Integer statusId;
  
//   @Column(name="type_id")
//   private Integer typeId;
  
//   public Integer getTaskId() {
//     return taskId;
//   }

//   public String getTitle() {
//     return title;
//   }

//   public void setTitle(String title) {
//     this.title = title;
//   }

//   public String getContent() {
//     return content;
//   }

//   public void setContent(String content) {
//     this.content = content;
//   }

//   public String getExpiredDate() {
//     return expiredDate;
//   }

//   public void setExpiredDate(String expiredDate) {
//     this.expiredDate = expiredDate;
//   }

//   public Integer getStatusId() {
//     return statusId;
//   }

//   public void setStatusId(Integer statusId) {
//     this.statusId = statusId;
//   }

//   public Integer getTypeId() {
//     return typeId;
//   }

//   public void setTypeId(Integer typeId) {
//     this.typeId = typeId;
//   }
// }
