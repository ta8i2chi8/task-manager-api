INSERT INTO task_manager.statuses (status_id, name) VALUES
  (1, 'Not Started'),
  (2, 'In Progress'),
  (3, 'Completed')
;

INSERT INTO task_manager.types (type_id, name) VALUES
  (1, '家事'),
  (2, '仕事'),
  (3, '雑務')
;

INSERT INTO task_manager.tasks (title, content, expired_date, status_id, type_id) VALUES
  ('掃除', '風呂の掃除をする。', '2023-01-01', 1, 1)
;
