// package jp.taichi.morimoto.taskmanager.service;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import jp.taichi.morimoto.taskmanager.model.Task;
// import jp.taichi.morimoto.taskmanager.repository.TaskRepository;

// @Service
// public class TaskService {
//   @Autowired
//   TaskRepository taskRepository;

//   public Task createTask(Task task) {
//     return taskRepository.save(task);
//   }

//   public List<Task> getTasks() {
//     return taskRepository.findAll();
//   }

//   public Task updateTask(Task newTask) {
//     Task task = taskRepository.findById(newTask.getTaskId()).get();
//     task.setTitle(newTask.getTitle());
//     task.setContent(newTask.getContent());
//     task.setExpiredDate(newTask.getExpiredDate());
//     task.setStatusId(newTask.getStatusId());
//     task.setTypeId(newTask.getTypeId());
      
//     return taskRepository.save(task);   
//   }

//   public void deleteEmployee(Integer taskId) {
//     taskRepository.deleteById(taskId);
//   }
// }
