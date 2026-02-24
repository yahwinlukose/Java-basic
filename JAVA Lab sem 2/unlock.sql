ALTER SESSION SET CONTAINER = freepdb1;

-- Prevent account lockout from failed logins
ALTER PROFILE DEFAULT LIMIT FAILED_LOGIN_ATTEMPTS UNLIMITED;

-- Unlock and reset password
ALTER USER yahwin ACCOUNT UNLOCK;
ALTER USER yahwin IDENTIFIED BY yahwin123;

-- Verify status
SELECT username, account_status FROM dba_users WHERE username = 'YAHWIN';

EXIT;
