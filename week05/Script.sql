-- sys as sysdba 계정의 스크립트

GRANT UPDATE, INSERT, DELETE ON employees TO test;

REVOKE SELECT ON hr.employees FROM test;