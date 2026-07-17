-- functions.sql

CREATE OR REPLACE FUNCTION get_student_name(p_id INT)
RETURNS TEXT AS $$
DECLARE
    student_name TEXT;
BEGIN
    SELECT name INTO student_name FROM student WHERE id = p_id;
    RETURN student_name;
END;
$$ LANGUAGE plpgsql;
