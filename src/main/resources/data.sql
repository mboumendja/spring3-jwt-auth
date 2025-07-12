
-- Create the roles table first
INSERT INTO roles (id, name, description) VALUES (1, 'USER', 'Default user role');
INSERT INTO roles (id, name, description) VALUES (2, 'ADMIN', 'Administrator role');

-- Default admin user (password: password)
INSERT INTO users (id, username, email, password, first_name, last_name, enabled, account_non_expired, account_non_locked, credentials_non_expired, created_at, updated_at) 
VALUES (1, 'admin', 'admin@example.com', '$2b$10$sgi6vRcP05NeRegzih7jAu5qDKLwo3bmSG6DO/zW9nxt500YqPHFe', 'Admin', 'User', true, true, true, true, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- Default simple user (password: password)
INSERT INTO users (id, username, email, password, first_name, last_name, enabled, account_non_expired, account_non_locked, credentials_non_expired, created_at, updated_at) 
VALUES (2, 'user', 'user@example.com', '$2b$10$sgi6vRcP05NeRegzih7jAu5qDKLwo3bmSG6DO/zW9nxt500YqPHFe', 'User', 'User', true, true, true, true, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- Assign roles to users
INSERT INTO user_roles (user_id, role_id) VALUES (1, 1);
INSERT INTO user_roles (user_id, role_id) VALUES (1, 2);
INSERT INTO user_roles (user_id, role_id) VALUES (2, 1);
